/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.CompareJoinerBoolean$CompareEqualBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.CompareJoinerBoolean$CompareNotEqualBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$JoinerBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$NotBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$ReturnType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$StaticValueBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader$ArrayContextReader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader$DefaultContextReader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader$LogicBooleanContext;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader$ParameterMapping;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader$ParameterMapping$FieldOrMethod;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader$VoidContextReader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString$StaticString;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.utility.al;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicBooleanLoader {
    public static final boolean TRACE = false;
    static Pattern patternSingleQuote = Pattern.compile((String)"'(.*)'");
    static Pattern patternDoubleQuote = Pattern.compile((String)"\"(.*)\"");
    static Pattern patternInteger = Pattern.compile((String)"(-?\\d*)");
    static Pattern patternFloat = Pattern.compile((String)"(-?\\d*\\.\\d*)");
    static final LogicBooleanLoader$LogicBooleanContext defaultContextReader = new LogicBooleanLoader$DefaultContextReader();
    static final LogicBooleanLoader$LogicBooleanContext voidContextReader = new LogicBooleanLoader$VoidContextReader(null);
    static final LogicBooleanLoader$LogicBooleanContext voidNumberContextReader = new LogicBooleanLoader$VoidContextReader("Number");
    static final LogicBooleanLoader$LogicBooleanContext voidBoolContextReader = new LogicBooleanLoader$VoidContextReader("Bool");
    static final LogicBooleanLoader$LogicBooleanContext voidArrayContextReader = new LogicBooleanLoader$VoidContextReader("Array element");
    static final LogicBooleanLoader$LogicBooleanContext numberArrayContextReader = new LogicBooleanLoader$ArrayContextReader(LogicBoolean$ReturnType.numberArray);
    static final LogicBooleanLoader$LogicBooleanContext boolArrayContextReader = new LogicBooleanLoader$ArrayContextReader(LogicBoolean$ReturnType.boolArray);
    static final LogicBooleanLoader$LogicBooleanContext unitArrayContextReader = new LogicBooleanLoader$ArrayContextReader(LogicBoolean$ReturnType.unitArray);

    public static boolean isEmptyIgnoringPlusMinus(String string2) {
        for (int i2 = 0; i2 < string2.length(); ++i2) {
            char c2 = string2.charAt(i2);
            if (c2 == '-' || c2 == '+' || c2 == ' ') continue;
            return false;
        }
        return true;
    }

    public static LogicBoolean parseNumberBlock(l l2, String string2) {
        LogicBoolean logicBoolean = LogicBooleanLoader.parseBooleanBlock(l2, string2, false);
        if (logicBoolean != null && logicBoolean.getReturnType() != LogicBoolean$ReturnType.number) {
            throw new RuntimeException("Expected number for: '" + string2 + "' got a " + (Object)((Object)logicBoolean.getReturnType()) + " type");
        }
        return logicBoolean;
    }

    /*
     * WARNING - void declaration
     */
    public static LogicBoolean parseBooleanBlock(l l2, String string2, boolean bl2) {
        Object object;
        int n2;
        LogicBooleanLoader$LogicBooleanContext logicBooleanLoader$LogicBooleanContext;
        String[] stringArray;
        int n3 = al.a(string2);
        if (n3 != 0) {
            if (n3 > 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + string2 + "'. A '(' was not closed.");
            }
            if (n3 < 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + string2 + "'. Too many ')'.");
            }
        }
        string2 = string2.trim();
        if ((string2 = LogicBooleanLoader.breakOuterLayerBrackets(string2)).length() > 1 && string2.charAt(0) == '-') {
            boolean bl3 = false;
            for (int i2 = 1; i2 < string2.length(); ++i2) {
                char c2 = string2.charAt(i2);
                if (c2 == ' ') continue;
                bl3 = !Character.isDigit((char)c2);
            }
            if (bl3) {
                string2 = "0" + string2;
            }
        }
        String string3 = string2.toLowerCase(Locale.ROOT);
        String[] stringArray2 = new String[]{"==", "!=", "<=", ">=", "<", ">"};
        for (String string4 : stringArray = new String[]{"or", "and", "==", "!=", "<=", ">=", "<", ">", "%", "-", "+", "*", "/", "="}) {
            Object object2;
            void var10_26;
            if (!f.c(string3, string4)) continue;
            boolean bl3 = false;
            boolean bl4 = false;
            if (string4.equals((Object)"and") || string4.equals((Object)"or")) {
                bl3 = true;
                bl4 = true;
            }
            if (string4.equals((Object)"<>")) {
                String string5;
                int n4 = al.a(string2, 0, stringArray2);
                logicBooleanLoader$LogicBooleanContext = new ArrayList();
                logicBooleanLoader$LogicBooleanContext.add(string2.substring(0, n4));
                int n5 = n4 + 2;
                if (n5 > string2.length() - 1) {
                    n5 = string2.length() - 1;
                }
                if (!(string5 = string2.substring(n4, n5)).endsWith("=")) {
                    string5 = string5.substring(0, 1);
                }
                logicBooleanLoader$LogicBooleanContext.add(string2.substring(n4 + string5.length()));
                String string6 = string5;
            } else {
                logicBooleanLoader$LogicBooleanContext = bl4 ? al.a(string2, string4, bl3, true) : al.a(string2, string4, bl3, false);
            }
            if (logicBooleanLoader$LogicBooleanContext.size() == 1) continue;
            if (var10_26.equals((Object)"=")) {
                throw new RuntimeException("Unexpected assignment operator: '=', use '==' for comparison");
            }
            if (((String)logicBooleanLoader$LogicBooleanContext.get(0)).equals((Object)"") && logicBooleanLoader$LogicBooleanContext.size() == 2 && (var10_26.equals((Object)"+") || var10_26.equals((Object)"-"))) continue;
            ArrayList arrayList = new ArrayList();
            LogicBoolean$JoinerBoolean logicBoolean$JoinerBoolean = LogicBoolean$JoinerBoolean.getNewJoiner((String)var10_26);
            boolean bl5 = logicBoolean$JoinerBoolean.requireBooleanChildren();
            if (bl5 && (logicBoolean$JoinerBoolean instanceof CompareJoinerBoolean$CompareNotEqualBoolean || logicBoolean$JoinerBoolean instanceof CompareJoinerBoolean$CompareEqualBoolean)) {
                com.corrodinggames.rts.gameFramework.l.e(logicBoolean$JoinerBoolean.type() + " was set to require boolean. Workaround triggered. requireBooleanChildren:" + logicBoolean$JoinerBoolean.requireBooleanChildren());
                bl5 = false;
            }
            n2 = 0;
            int n6 = -1;
            if (var10_26.equals((Object)"+") || var10_26.equals((Object)"-")) {
                boolean bl6 = false;
                object = logicBooleanLoader$LogicBooleanContext.iterator();
                while (object.hasNext()) {
                    object2 = (String)object.next();
                    boolean bl7 = LogicBooleanLoader.isEmptyIgnoringPlusMinus((String)object2);
                    if (!bl7) continue;
                    bl6 = true;
                    break;
                }
                if (bl6) {
                    object = new ArrayList();
                    object2 = "";
                    Iterator iterator = logicBooleanLoader$LogicBooleanContext.iterator();
                    while (iterator.hasNext()) {
                        String string7 = (String)iterator.next();
                        if (LogicBooleanLoader.isEmptyIgnoringPlusMinus(string7)) {
                            object2 = (String)object2 + string7 + (String)var10_26;
                            continue;
                        }
                        if (!object2.equals((Object)"")) {
                            string7 = (String)object2 + string7;
                            object2 = "";
                        }
                        object.add((Object)string7);
                    }
                    if (!object2.equals((Object)"")) {
                        throw new RuntimeException("Unexpected empty last element using: " + (String)var10_26);
                    }
                    logicBooleanLoader$LogicBooleanContext = object;
                }
            }
            if (logicBooleanLoader$LogicBooleanContext.size() == 1) continue;
            Iterator iterator = logicBooleanLoader$LogicBooleanContext.iterator();
            while (iterator.hasNext()) {
                object = (String)iterator.next();
                ++n6;
                if (object.equals((Object)"")) {
                    if (n6 == 0) {
                        throw new RuntimeException("Unexpected empty element before: " + (String)var10_26);
                    }
                    throw new RuntimeException("Unexpected empty element after: " + (String)var10_26);
                }
                object2 = LogicBooleanLoader.parseBooleanBlock(l2, (String)object, bl5);
                if (object2 == null) {
                    throw new RuntimeException("null on:'" + string2 + "'");
                }
                arrayList.add(object2);
            }
            logicBoolean$JoinerBoolean.children = (LogicBoolean[])arrayList.toArray((Object[])new LogicBoolean[0]);
            return logicBoolean$JoinerBoolean.validateAndOptimize((String)var10_26, "", string2, null, bl2);
        }
        if (string3.startsWith("not ")) {
            String bl9 = string2.substring("not ".length());
            LogicBoolean logicBoolean = LogicBooleanLoader.parseBooleanBlock(l2, bl9, true);
            LogicBoolean$NotBoolean logicBoolean$NotBoolean = new LogicBoolean$NotBoolean(logicBoolean);
            return logicBoolean$NotBoolean.validateAndOptimize("not", "", bl9, null, bl2);
        }
        if (string2.length() > 0) {
            void var7_14;
            String string8;
            String string9 = string2;
            if (string9.startsWith("+")) {
                String string10 = string9.substring(1).trim();
            }
            if (f.r(string8 = al.c((String)var7_14))) {
                if (bl2) {
                    throw new RuntimeException("Expected a boolean type here, not number: " + string8);
                }
                return LogicBoolean$StaticValueBoolean.getStaticNumber(string8);
            }
            String string11 = f.p(string2);
            if (string11 != null) {
                if (bl2) {
                    throw new RuntimeException("Expected a boolean type here, not string: " + string2);
                }
                return new LogicString$StaticString(string11);
            }
        }
        boolean bl8 = false;
        int n7 = 0;
        if (string2.startsWith("self.")) {
            string2 = string2.substring("self.".length());
            boolean bl9 = true;
        }
        String[] stringArray3 = al.b(string2, ".", false);
        m m2 = new m();
        LogicBoolean logicBoolean = null;
        String string12 = null;
        logicBooleanLoader$LogicBooleanContext = defaultContextReader;
        String string13 = null;
        for (int i2 = 0; i2 < stringArray3.length; ++i2) {
            boolean bl10;
            String string14;
            if (string13 != null) {
                string14 = string13;
                string13 = null;
            } else {
                string14 = stringArray3[i2];
            }
            if (f.b(string14, '[') && (n2 = al.b(string14, "[", 0)) != -1) {
                if (n2 == 0) {
                    int n8 = al.b(string14, "]", 0);
                    if (n8 == -1 || n2 >= n8) {
                        throw new RuntimeException("Unexpected use of square brankets:'" + string14 + "'");
                    }
                    if (n8 < string14.length() - 1 && n8 > 0) {
                        String string15 = string14.substring(n2, n8 + 1);
                        object = string14.substring(n8 + 1);
                        string13 = object;
                        --i2;
                        string14 = string15;
                    }
                    if (n2 != 0 || n8 != string14.length() - 1 || string14.length() < 2) {
                        throw new RuntimeException("Error reading square brankets:'" + string14 + "'");
                    }
                    string14 = string14.substring(1, string14.length() - 1);
                    string14 = "get(" + string14 + ")";
                } else {
                    String string16;
                    String string17 = string14.substring(0, n2);
                    string13 = string16 = string14.substring(n2);
                    --i2;
                    string14 = string17;
                }
            }
            if (string14.equalsIgnoreCase("self")) {
                if (n7 != 0) {
                    throw new RuntimeException("No field:'" + string14 + "' globals");
                }
                if (stringArray3.length == 1) {
                    return UnitReference.selfUnitReference;
                }
                bl10 = true;
                continue;
            }
            if (i2 == 0 && string14.equalsIgnoreCase("game")) {
                n7 = 1;
                continue;
            }
            n2 = i2 == stringArray3.length - 1 ? 1 : 0;
            String string18 = null;
            if (bl10) {
                string18 = "self.";
            }
            if (n7 != 0) {
                string18 = "game.";
            }
            boolean bl11 = bl2;
            if (n2 == 0) {
                bl11 = false;
            }
            if (logicBoolean != null) {
                logicBooleanLoader$LogicBooleanContext = logicBoolean.createContext();
            }
            if ((object = logicBooleanLoader$LogicBooleanContext.parseNextElementInChain(string18, l2, string14, bl11, string2, string12, logicBoolean)) == null) {
                throw new RuntimeException("Null function or field:'" + string14 + "'");
            }
            logicBoolean = object;
            string12 = string14;
            bl10 = true;
            m2.add(object);
        }
        if (m2.size() == 0) {
            throw new RuntimeException("Unknown function:'" + string2 + "'");
        }
        LogicBoolean logicBoolean2 = null;
        for (int i3 = m2.a - 1; i3 >= 0; --i3) {
            LogicBoolean logicBoolean3 = (LogicBoolean)m2.get(i3);
            if (logicBoolean2 != null) {
                logicBoolean3 = logicBoolean3.setChild(logicBoolean2);
            }
            logicBoolean2 = logicBoolean3;
        }
        LogicBoolean$ReturnType logicBoolean$ReturnType = logicBoolean2.getReturnType();
        if (logicBoolean$ReturnType == LogicBoolean$ReturnType.voidReturn) {
            logicBoolean2.throwVoidReturnError(string2);
            throw new RuntimeException("throwVoidReturnError");
        }
        if (bl2 && logicBoolean$ReturnType != LogicBoolean$ReturnType.bool) {
            throw new BooleanParseException("Function:'" + string2 + "' is expected to return a boolean type but it returns type: " + (Object)((Object)logicBoolean$ReturnType));
        }
        return logicBoolean2;
    }

    public static String fixArguments(String string2) {
        String string3 = string2;
        if ((string3 = string3.trim()).equals((Object)"")) {
            return "";
        }
        if (!string3.startsWith("(") || !string3.endsWith(")")) {
            throw new RuntimeException("Failed to parse function arguments:'" + string3 + "'");
        }
        string3 = string3.substring(1, string3.length() - 1);
        string3 = string3.trim();
        return string3;
    }

    public static Matcher match(Pattern pattern, String string2) {
        Matcher matcher = pattern.matcher((CharSequence)string2);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }

    public static void setArgumentsWithMapping(LogicBooleanLoader$ParameterMapping logicBooleanLoader$ParameterMapping, Object object, String string2, l l2, String string3) {
        if (string3 == null) {
            string3 = object.getClass().getSimpleName();
        }
        ArrayList arrayList = new ArrayList();
        if (string2 != null && !"".equals((Object)string2)) {
            Iterator iterator = al.a(string2, ",", false);
            int n2 = 0;
            boolean bl2 = false;
            for (String string4 : iterator) {
                String string5;
                String string6;
                int n3 = al.a(string4, "=");
                if (n3 > 0) {
                    string6 = string4.substring(0, n3);
                    string5 = string4.substring(n3 + 1);
                    bl2 = true;
                } else {
                    if (bl2) {
                        throw new BooleanParseException(string3 + "(): SyntaxError: Cannot use non-keyword arg after keyword arg");
                    }
                    if (logicBooleanLoader$ParameterMapping.numberOfPositionalParameters == 0) {
                        throw new BooleanParseException(string3 + "(): Function doesn't accept any non-keyword arguments.");
                    }
                    if (logicBooleanLoader$ParameterMapping.numberOfPositionalParameters <= n2) {
                        throw new BooleanParseException(string3 + "(): Too many non-keyword arguments. Only " + logicBooleanLoader$ParameterMapping.numberOfPositionalParameters + " accepted.");
                    }
                    string6 = null;
                    for (String string7 : logicBooleanLoader$ParameterMapping.parameters.keySet()) {
                        LogicBooleanLoader$ParameterMapping$FieldOrMethod logicBooleanLoader$ParameterMapping$FieldOrMethod = (LogicBooleanLoader$ParameterMapping$FieldOrMethod)logicBooleanLoader$ParameterMapping.parameters.get((Object)string7);
                        if (logicBooleanLoader$ParameterMapping$FieldOrMethod.positionalOffset != n2) continue;
                        string6 = string7;
                        break;
                    }
                    if (string6 == null) {
                        throw new BooleanParseException("Error failed to find non-keyword argument index: " + n2);
                    }
                    string5 = string4;
                }
                String string8 = string6;
                string6 = string6.trim();
                string6 = string6.toLowerCase(Locale.ROOT);
                if (arrayList.contains((Object)string6)) {
                    throw new BooleanParseException("SyntaxError: Argument '" + string8 + "' has been listed more than once");
                }
                arrayList.add((Object)string6);
                LogicBooleanLoader.setArgumentWithMapping(logicBooleanLoader$ParameterMapping, object, string6, string5, l2);
                ++n2;
            }
        }
        for (String string9 : logicBooleanLoader$ParameterMapping.parameters.keySet()) {
            LogicBooleanLoader$ParameterMapping$FieldOrMethod logicBooleanLoader$ParameterMapping$FieldOrMethod = (LogicBooleanLoader$ParameterMapping$FieldOrMethod)logicBooleanLoader$ParameterMapping.parameters.get((Object)string9);
            if (!logicBooleanLoader$ParameterMapping$FieldOrMethod.required || arrayList.contains((Object)string9)) continue;
            throw new BooleanParseException(string3 + "(): SyntaxError: Missing required argument: '" + string9 + "'");
        }
    }

    public static Object getArgumentTextWithMapping(LogicBooleanLoader$ParameterMapping$FieldOrMethod logicBooleanLoader$ParameterMapping$FieldOrMethod, Object object) {
        if (logicBooleanLoader$ParameterMapping$FieldOrMethod != null && logicBooleanLoader$ParameterMapping$FieldOrMethod.field != null) {
            Object object2;
            try {
                object2 = logicBooleanLoader$ParameterMapping$FieldOrMethod.field.get(object);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                illegalArgumentException.printStackTrace();
                return "<error>";
            }
            catch (IllegalAccessException illegalAccessException) {
                illegalAccessException.printStackTrace();
                return "<error>";
            }
            if (object2 == null) {
                return null;
            }
            return object2;
        }
        if (logicBooleanLoader$ParameterMapping$FieldOrMethod != null && logicBooleanLoader$ParameterMapping$FieldOrMethod.method != null) {
            com.corrodinggames.rts.gameFramework.l.e("getArgumentTextWithMapping: method not supported");
            return "<method>";
        }
        com.corrodinggames.rts.gameFramework.l.e("getArgumentTextWithMapping: No method or field");
        return "<error>";
    }

    public static void setArgumentWithMapping(LogicBooleanLoader$ParameterMapping logicBooleanLoader$ParameterMapping, Object object, String string2, String string3, l l2) {
        LogicBooleanLoader$ParameterMapping$FieldOrMethod logicBooleanLoader$ParameterMapping$FieldOrMethod = (LogicBooleanLoader$ParameterMapping$FieldOrMethod)logicBooleanLoader$ParameterMapping.parameters.get((Object)string2);
        if (logicBooleanLoader$ParameterMapping$FieldOrMethod != null && logicBooleanLoader$ParameterMapping$FieldOrMethod.field != null) {
            Class clazz = logicBooleanLoader$ParameterMapping$FieldOrMethod.type;
            Object object2 = LogicBooleanLoader.convertParameterData(string3, clazz, l2, logicBooleanLoader$ParameterMapping$FieldOrMethod.returnType, string2);
            if (object2 == null && logicBooleanLoader$ParameterMapping$FieldOrMethod.required) {
                throw new BooleanParseException("SyntaxError: Cannot set required argument: '" + string2 + "' to null");
            }
            try {
                logicBooleanLoader$ParameterMapping$FieldOrMethod.field.set(object, object2);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                illegalArgumentException.printStackTrace();
                String string4 = illegalArgumentException.getMessage();
                if (string4 == null) {
                    throw new BooleanParseException("Error parameter:'" + string2 + "' on " + object.getClass().getSimpleName(), illegalArgumentException);
                }
                string4 = string4.replace((CharSequence)"com.corrodinggames.rts.game.units.custom.logicBooleans.", (CharSequence)"");
                string4 = string4.replace((CharSequence)"java.lang.", (CharSequence)"");
                throw new BooleanParseException("Error parameter:'" + string2 + "': " + string4);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new BooleanParseException("Error setting parameter:'" + string2 + "' on " + object.getClass().getSimpleName(), illegalAccessException);
            }
            return;
        }
        if (logicBooleanLoader$ParameterMapping$FieldOrMethod != null && logicBooleanLoader$ParameterMapping$FieldOrMethod.method != null) {
            Class clazz = logicBooleanLoader$ParameterMapping$FieldOrMethod.type;
            Object object3 = LogicBooleanLoader.convertParameterData(string3, clazz, l2, logicBooleanLoader$ParameterMapping$FieldOrMethod.returnType, string2);
            try {
                logicBooleanLoader$ParameterMapping$FieldOrMethod.method.invoke(object, new Object[]{object3});
            }
            catch (IllegalArgumentException illegalArgumentException) {
                illegalArgumentException.printStackTrace();
                String string5 = illegalArgumentException.getMessage();
                if (string5 == null) {
                    throw new BooleanParseException("Error parameter:'" + string2 + "' on " + object.getClass().getSimpleName(), illegalArgumentException);
                }
                string5 = string5.replace((CharSequence)"com.corrodinggames.rts.game.units.custom.logicBooleans.", (CharSequence)"");
                string5 = string5.replace((CharSequence)"java.lang.", (CharSequence)"");
                throw new BooleanParseException("Error setting parameter:'" + string2 + "': " + string5);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new BooleanParseException("Error setting parameter:'" + string2 + "' on " + object.getClass().getSimpleName(), illegalAccessException);
            }
            catch (InvocationTargetException invocationTargetException) {
                Throwable throwable = invocationTargetException.getCause();
                String string6 = "";
                if (throwable != null) {
                    string6 = " - " + throwable.getMessage();
                }
                throw new BooleanParseException("Error setting parameter:'" + string2 + "' on " + object.getClass().getSimpleName() + string6, invocationTargetException);
            }
            return;
        }
        throw new BooleanParseException("No parameter:'" + string2 + "' on " + object.getClass().getSimpleName() + " (Possible parameters:" + logicBooleanLoader$ParameterMapping.allParametersString + ")");
    }

    public static List getAllFieldsInherited(List list, Class clazz) {
        list.addAll((Collection)Arrays.asList((Object[])clazz.getFields()));
        return list;
    }

    public static Object convertParameterData(String string2, Class clazz, l l2, LogicBoolean$ReturnType logicBoolean$ReturnType, String string3) {
        if (string2 == null) {
            return null;
        }
        if ((string2 = string2.trim()).length() == 0) {
            return null;
        }
        if (string2.equals((Object)"null")) {
            return null;
        }
        if (clazz == LogicBoolean.class) {
            LogicBoolean$ReturnType logicBoolean$ReturnType2;
            LogicBoolean logicBoolean = LogicBooleanLoader.parseBooleanBlock(l2, string2, false);
            if (logicBoolean != null && logicBoolean$ReturnType != null && logicBoolean$ReturnType != (logicBoolean$ReturnType2 = logicBoolean.getReturnType())) {
                throw new BooleanParseException("Wrong type. Expected type: '" + (Object)((Object)logicBoolean$ReturnType) + "' for dynamic parameter '" + string3 + "' instead got type:'" + (Object)((Object)logicBoolean$ReturnType2) + "' (parsing: " + string2 + ")");
            }
            return logicBoolean;
        }
        if (f.s(string2)) {
            if (!f.c(string2, ".")) {
                if (clazz == String.class) {
                    return string2;
                }
                return Integer.parseInt((String)string2);
            }
            if (clazz == String.class) {
                return string2;
            }
            return Float.valueOf((float)Float.parseFloat((String)string2));
        }
        String string4 = string2.toLowerCase(Locale.ENGLISH);
        if ("false".equals((Object)string4)) {
            return Boolean.FALSE;
        }
        if ("true".equals((Object)string4)) {
            return Boolean.TRUE;
        }
        Matcher matcher = LogicBooleanLoader.match(patternSingleQuote, string2);
        if (matcher != null) {
            return f.q(matcher.group(1));
        }
        matcher = LogicBooleanLoader.match(patternDoubleQuote, string2);
        if (matcher != null) {
            return f.q(matcher.group(1));
        }
        matcher = LogicBooleanLoader.match(patternInteger, string2);
        if (matcher != null) {
            if (clazz == String.class) {
                return matcher.group(1);
            }
            return Integer.parseInt((String)matcher.group(1));
        }
        matcher = LogicBooleanLoader.match(patternFloat, string2);
        if (matcher != null) {
            if (clazz == String.class) {
                return matcher.group(1);
            }
            return Float.valueOf((float)Float.parseFloat((String)matcher.group(1)));
        }
        String string5 = "null";
        if (clazz != null) {
            string5 = "data of " + clazz.getSimpleName();
            if (clazz == String.class) {
                string5 = "string";
            }
            if (clazz == Float.TYPE) {
                string5 = "number";
            }
            if (clazz == Integer.TYPE) {
                string5 = "integer";
            }
            if (clazz == Boolean.TYPE) {
                string5 = "boolean";
            }
        }
        String string6 = "Failed to read parameter '" + string3 + "' expected non-dynamic " + string5 + " got: " + string2 + "";
        if (clazz == String.class) {
            string6 = string6 + " (A quoted string was expected)";
        }
        throw new BooleanParseException(string6);
    }

    public static String breakOuterLayerBrackets(String string2) {
        if (string2.startsWith("(") && string2.endsWith(")")) {
            int n2 = al.a(string2, 0);
            if (n2 == -1) {
                throw new RuntimeException("Brackets unbalanced. Starting '(' in '" + string2 + "' was not closed.");
            }
            if (n2 == string2.length() - 1) {
                string2 = string2.substring(1, string2.length() - 1);
                string2 = string2.trim();
                string2 = LogicBooleanLoader.breakOuterLayerBrackets(string2);
            }
        }
        return string2;
    }
}

