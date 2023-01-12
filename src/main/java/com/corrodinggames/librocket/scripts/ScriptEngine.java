/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.corrodinggames.librocket.scripts;

import com.corrodinggames.librocket.a;
import com.corrodinggames.librocket.b;
import com.corrodinggames.librocket.scripts.Debug;
import com.corrodinggames.librocket.scripts.Mods;
import com.corrodinggames.librocket.scripts.Multiplayer;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.librocket.scripts.ScriptContext;
import com.corrodinggames.librocket.scripts.ScriptEngine$1;
import com.corrodinggames.librocket.scripts.ScriptEngine$Action;
import com.corrodinggames.librocket.scripts.ScriptEngine$RunnableAction;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.utility.al;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ScriptEngine {
    b slickLibRocket;
    private Root root;
    static ScriptEngine scriptEngine;
    public static boolean inDebugScript;
    static boolean mainScriptThreadMarked;
    static ThreadLocal isMainScriptThread;
    ArrayList queuedScripts = new ArrayList();
    ArrayList runningScripts = new ArrayList();
    static Throwable scriptError;
    static String scriptErrorMessage;
    HashMap globals = new HashMap();

    public static boolean isStrict() {
        return com.corrodinggames.rts.a.a.a();
    }

    public static void checkThreadAccess() {
        if (!((Boolean)isMainScriptThread.get()).booleanValue()) {
            l.b("ScriptEngine: thread is not marked as main script thread!");
            l.T();
        }
    }

    public Root getRoot() {
        ScriptEngine.checkThreadAccess();
        return this.root;
    }

    public Root getRootNoCheck() {
        return this.root;
    }

    public static ScriptEngine getInstance() {
        return scriptEngine;
    }

    public static ScriptEngine createScriptEngine(b b2) {
        if (scriptEngine != null) {
            throw new RuntimeException("scriptEngine already exists");
        }
        scriptEngine = new ScriptEngine(b2);
        return scriptEngine;
    }

    private ScriptEngine(b b2) {
        this.slickLibRocket = b2;
        this.root = new Root();
        this.setupScriptContext(this.root);
        this.setGlobalVariable("root", this.root);
        Multiplayer multiplayer = new Multiplayer(this.root);
        this.setupScriptContext(multiplayer);
        this.setGlobalVariable("multiplayer", multiplayer);
        this.setGlobalVariable("mp", multiplayer);
        this.root.multiplayer = multiplayer;
        Mods mods = new Mods(this.root);
        this.setupScriptContext(mods);
        this.setGlobalVariable("mods", mods);
        this.root.mods = mods;
        if (com.corrodinggames.rts.a.a.a()) {
            Debug debug = new Debug(this.root);
            this.setupScriptContext(debug);
            this.setGlobalVariable("debug", debug);
        }
    }

    public void setupScriptContext(ScriptContext scriptContext) {
        Method[] methodArray;
        scriptContext.libRocket = this.slickLibRocket;
        scriptContext.guiEngine = a.a();
        scriptContext.scriptEngine = this;
        for (Method method : methodArray = scriptContext.getClass().getMethods()) {
            String string2 = method.getName();
            if (string2.equals((Object)"wait") || string2.equals((Object)"getClass")) continue;
            if (scriptContext.methods.get((Object)string2) != null) {
                ScriptEngine.logError("method: " + string2 + " already exists");
            }
            scriptContext.methods.put((Object)string2, (Object)method);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void update(float f2) {
        if (!mainScriptThreadMarked) {
            mainScriptThreadMarked = true;
            isMainScriptThread.set((Object)true);
        }
        if (this.queuedScripts.size() != 0) {
            ArrayList arrayList = this.queuedScripts;
            synchronized (arrayList) {
                Object object = this.queuedScripts.iterator();
                while (object.hasNext()) {
                    ScriptEngine$Action scriptEngine$Action = (ScriptEngine$Action)object.next();
                    if (scriptEngine$Action.framesDelay > 0) {
                        --scriptEngine$Action.framesDelay;
                        continue;
                    }
                    this.runningScripts.add((Object)scriptEngine$Action);
                    object.remove();
                }
            }
            for (Object object : this.runningScripts) {
                ((ScriptEngine$Action)object).run(this);
            }
            this.runningScripts.clear();
        }
        this.root.onFrameUpdate(f2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ScriptEngine$Action addScriptToQueue(String string2, boolean bl2) {
        ArrayList arrayList = this.queuedScripts;
        synchronized (arrayList) {
            ScriptEngine$Action scriptEngine$Action = new ScriptEngine$Action();
            scriptEngine$Action.script = string2;
            scriptEngine$Action.tryToCatchCrash = bl2;
            this.queuedScripts.add((Object)scriptEngine$Action);
            return scriptEngine$Action;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ScriptEngine$Action addScriptToQueueIfNotAlreadyQueued(String string2) {
        ArrayList arrayList = this.queuedScripts;
        synchronized (arrayList) {
            for (ScriptEngine$Action scriptEngine$Action : this.queuedScripts) {
                if (!string2.equals((Object)scriptEngine$Action.script)) continue;
                return null;
            }
            return this.addScriptToQueue(string2, false);
        }
    }

    public ScriptEngine$Action addScriptToQueue(String string2) {
        return this.addScriptToQueue(string2, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public ScriptEngine$Action addRunnableToQueue(Runnable runnable) {
        ArrayList arrayList = this.queuedScripts;
        synchronized (arrayList) {
            ScriptEngine$RunnableAction scriptEngine$RunnableAction = new ScriptEngine$RunnableAction(runnable);
            this.queuedScripts.add((Object)scriptEngine$RunnableAction);
            return scriptEngine$RunnableAction;
        }
    }

    public void processScript(String string2) {
        if (!"mp.refreshUI()".equals((Object)string2)) {
            System.out.println("ScriptEngine:HandleEvent:" + string2);
        }
        try {
            String[] stringArray;
            for (String string3 : stringArray = al.a(string2, ';')) {
                this.processArg(string3);
            }
        }
        catch (Exception exception) {
            ScriptEngine.throwDelayedException("Found error running:" + string2, exception);
            throw new RuntimeException((Throwable)exception);
        }
    }

    public static void throwDelayedException(String string2, Throwable throwable) {
        l.a("throwDelayedException", throwable);
        if (scriptError == null) {
            scriptError = throwable;
            scriptErrorMessage = string2;
        }
    }

    public void checkForErrors() {
        if (scriptError != null) {
            throw new RuntimeException(scriptErrorMessage, scriptError);
        }
    }

    public Matcher match(String string2, String string3) {
        Pattern pattern = Pattern.compile((String)string2);
        Matcher matcher = pattern.matcher((CharSequence)string3);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }

    public Object processArg(String string2) {
        if ((string2 = string2.trim()).length() == 0) {
            return null;
        }
        if (string2.equals((Object)"null")) {
            return null;
        }
        Matcher matcher = this.match("'(.*)'", string2);
        if (matcher != null) {
            return f.o(matcher.group(1));
        }
        matcher = this.match("(-?\\d*)", string2);
        if (matcher != null) {
            return Integer.parseInt((String)matcher.group(1));
        }
        matcher = this.match("(-?\\d*\\.\\d*)", string2);
        if (matcher != null) {
            return Float.valueOf((float)Float.parseFloat((String)matcher.group(1)));
        }
        matcher = this.match("\\s*([^\\s\"']*)\\s*=(.*)", string2);
        if (matcher != null) {
            String string3 = matcher.group(1);
            String string4 = matcher.group(2);
            System.out.println("processArg: setting: " + string3 + "=" + string4);
            Object object = this.processArg(string4);
            this.setLocalVariable(string3, object);
            return object;
        }
        matcher = this.match("\\s*([\\w\\.]+)\\((.*)\\)\\s*", string2);
        if (matcher != null) {
            return this.processFunction(string2, matcher);
        }
        if ("false".equalsIgnoreCase(string2)) {
            return Boolean.FALSE;
        }
        if ("true".equalsIgnoreCase(string2)) {
            return Boolean.TRUE;
        }
        Object object = this.getScriptVariable(string2, false);
        if (object != null) {
            return object;
        }
        System.out.println("processArg: no variable:" + string2);
        this.getScriptVariable(string2, true);
        System.out.println("SlickLibRocket:HandleEvent: failed to match:" + string2);
        return null;
    }

    public void printMetadata(HashMap hashMap) {
        if (hashMap == null) {
            System.out.println("No metadata");
        } else {
            String string2 = "";
            for (String string3 : hashMap.keySet()) {
                string2 = string2 + string3 + ",";
            }
            System.out.println("metadata:" + string2);
        }
    }

    public Object getScriptVariable(String string2, boolean bl2) {
        Object object;
        if (this.slickLibRocket.d() != null) {
            object = this.slickLibRocket.d().getMetadata(string2);
            if (object != null) {
                return object;
            }
            if (bl2) {
                System.out.println("getScriptVariable: alert");
                this.printMetadata(this.slickLibRocket.d().metadata);
            }
        }
        if (this.slickLibRocket.c() != null) {
            object = this.slickLibRocket.c().getMetadata(string2);
            if (object != null) {
                return object;
            }
            if (bl2) {
                System.out.println("getScriptVariable: popup");
                this.printMetadata(this.slickLibRocket.c().metadata);
            }
        }
        if ((object = this.slickLibRocket.b(string2)) != null) {
            return object;
        }
        if (bl2) {
            System.out.println("getScriptVariable: document");
            this.printMetadata(this.slickLibRocket.getActiveDocumentMetadata());
        }
        if ((object = this.globals.get((Object)string2)) != null) {
            return object;
        }
        if (bl2) {
            System.out.println("getScriptVariable: globals");
            this.printMetadata(this.globals);
        }
        return null;
    }

    public void setLocalVariable(String string2, Object object) {
        HashMap hashMap = this.slickLibRocket.getActiveDocumentMetadata();
        hashMap.put((Object)string2, object);
    }

    public void setGlobalVariable(String string2, Object object) {
        HashMap hashMap = this.globals;
        hashMap.put((Object)string2, object);
    }

    public Object processFunction(String string2, Matcher matcher) {
        l l2 = l.B();
        String string3 = matcher.group(1);
        String string4 = matcher.group(2);
        String[] stringArray = string4.equals((Object)"") ? new String[]{} : al.a(string4, ',');
        Object[] objectArray = new Object[stringArray.length];
        for (int i2 = 0; i2 < objectArray.length; ++i2) {
            objectArray[i2] = this.processArg(stringArray[i2]);
        }
        return this.runFunction(string3, objectArray);
    }

    public Object runFunction(String string2, Object[] objectArray) {
        Object object;
        String[] stringArray = string2.split("\\.");
        ScriptContext scriptContext = this.root;
        if (stringArray.length > 2) {
            ScriptEngine.logCritical("Unsupported nameParts: " + string2);
            return null;
        }
        if (stringArray.length == 2) {
            object = this.getScriptVariable(stringArray[0], false);
            if (!(object instanceof ScriptContext)) {
                ScriptEngine.logCritical("Could not find context for: " + string2);
                return null;
            }
            scriptContext = (ScriptContext)object;
            string2 = stringArray[1];
        }
        if ((object = (Method)scriptContext.methods.get((Object)string2)) == null) {
            ScriptEngine.logCritical("Could not find function: " + string2);
            return null;
        }
        Class[] classArray = object.getParameterTypes();
        ArrayList arrayList = new ArrayList();
        if (objectArray.length > classArray.length) {
            ScriptEngine.logCritical("function: " + string2 + " does not accept " + objectArray.length + " parameters");
        }
        for (int i2 = 0; i2 < classArray.length; ++i2) {
            Class clazz = classArray[i2];
            Object object2 = null;
            if (i2 < objectArray.length) {
                object2 = objectArray[i2];
            }
            if (object2 == null || clazz.isInstance(object2) || clazz.equals(Float.class)) {
                // empty if block
            }
            arrayList.add(object2);
        }
        try {
            Object object3 = object.invoke((Object)scriptContext, arrayList.toArray());
            return object3;
        }
        catch (IllegalAccessException illegalAccessException) {
            illegalAccessException.printStackTrace();
            throw new RuntimeException((Throwable)illegalAccessException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            l.b("convertedParameters:");
            for (Object object2 : arrayList) {
                if (object2 == null) {
                    l.b("=null");
                    continue;
                }
                l.b("=" + object2.getClass().getName());
            }
            l.b("-----");
            illegalArgumentException.printStackTrace();
            throw new RuntimeException((Throwable)illegalArgumentException);
        }
        catch (InvocationTargetException invocationTargetException) {
            invocationTargetException.printStackTrace();
            throw new RuntimeException((Throwable)invocationTargetException);
        }
    }

    public static void logError(String string2) {
        l.e("ScriptEngine - error: " + string2);
    }

    public static void logCritical(String string2) {
        l.e("ScriptEngine - critical: " + string2);
        if (ScriptEngine.isStrict()) {
            throw new RuntimeException("ScriptEngine - critical:" + string2);
        }
    }

    static {
        isMainScriptThread = new ScriptEngine$1();
    }
}

