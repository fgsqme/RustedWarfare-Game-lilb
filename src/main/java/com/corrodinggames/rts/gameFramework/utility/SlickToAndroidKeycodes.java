/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Locale
 */
package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes$AndroidCodes;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes$GdxCodes;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes$MissingKey;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes$SlickCodes;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class SlickToAndroidKeycodes {
    static HashMap a;
    static HashMap b;
    static HashMap c;
    static HashMap d;
    static HashMap e;
    static HashMap f;
    static HashMap g;

    static HashMap a(Class clazz) {
        Field[] fieldArray;
        HashMap hashMap = new HashMap();
        for (Field field : fieldArray = clazz.getFields()) {
            int n2;
            String string2 = field.getName();
            string2 = string2.replace((CharSequence)"KEYCODE_", (CharSequence)"");
            string2 = string2.replace((CharSequence)"KEY_", (CharSequence)"");
            string2 = string2.replace((CharSequence)"NUMPAD_", (CharSequence)"NUMPAD");
            string2 = string2.replace((CharSequence)"NUM_", (CharSequence)"NUMPAD");
            try {
                n2 = field.getInt(null);
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new RuntimeException((Throwable)illegalArgumentException);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new RuntimeException((Throwable)illegalAccessException);
            }
            hashMap.put((Object)string2, (Object)n2);
        }
        return hashMap;
    }

    public static void a() {
        a = SlickToAndroidKeycodes.a("slickToAndroidCodes", d, e);
        g = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (String string2 : d.keySet()) {
            int n2 = (Integer)d.get((Object)string2);
            Integer n3 = (Integer)e.get((Object)string2);
            if (n3 == null) {
                arrayList.add((Object)string2);
            }
            if (a.get((Object)n2) == null) {
                // empty if block
            }
            String string3 = string2;
            string3 = string3.toLowerCase(Locale.ENGLISH);
            if (n3 == null) continue;
            g.put((Object)n3, (Object)string3);
        }
    }

    public static void b() {
        b = SlickToAndroidKeycodes.a("gdxToAndroidCodes", f, e);
    }

    public static void c() {
        c = SlickToAndroidKeycodes.a("gdxToSlickCodes", f, d);
    }

    public static HashMap a(String string2, HashMap hashMap, HashMap hashMap2) {
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (String string3 : hashMap.keySet()) {
            int n2 = (Integer)hashMap.get((Object)string3);
            Integer n3 = (Integer)hashMap2.get((Object)string3);
            if (n3 == null) {
                arrayList.add((Object)string3);
            }
            if (hashMap3.get((Object)n2) == null) {
                hashMap3.put((Object)n2, (Object)n3);
            }
            String string4 = string3;
            string4 = string4.toLowerCase(Locale.ENGLISH);
            if (n3 == null) continue;
        }
        if (arrayList.size() != 0) {
            Object object = "";
            for (String string5 : arrayList) {
                int n4 = (Integer)hashMap.get((Object)string5);
                if (hashMap3.get((Object)n4) != null) continue;
                object = (String)object + string5 + ", ";
            }
            l.e(string2 + ": Could not find keycode for: " + (String)object);
        }
        return hashMap3;
    }

    public static int a(String string2) {
        Integer n2 = (Integer)e.get((Object)(string2 = string2.toUpperCase()));
        if (n2 == null) {
            throw new SlickToAndroidKeycodes$MissingKey("Could not find key:" + string2);
        }
        return n2;
    }

    public static String a(int n2) {
        String string2 = (String)g.get((Object)n2);
        if (string2 == null) {
            return "unknown";
        }
        return string2;
    }

    public static int b(int n2) {
        Integer n3 = (Integer)a.get((Object)n2);
        if (n3 == null) {
            return 0;
        }
        return n3;
    }

    public static Integer c(int n2) {
        Object var1_1 = null;
        if (n2 == 14) {
            return 69;
        }
        if (n2 == 211) {
            return 99;
        }
        if (n2 == 28) {
            return 72;
        }
        if (n2 == 203) {
            return 90;
        }
        if (n2 == 205) {
            return 92;
        }
        if (n2 == 200) {
            return 91;
        }
        if (n2 == 208) {
            return 93;
        }
        if (n2 == 15) {
            return 70;
        }
        if (n2 == 42) {
            return 138;
        }
        if (n2 == 54) {
            return 139;
        }
        if (n2 == 29) {
            return 140;
        }
        if (n2 == 157) {
            return 141;
        }
        return null;
    }

    static {
        d = SlickToAndroidKeycodes.a(SlickToAndroidKeycodes$SlickCodes.class);
        e = SlickToAndroidKeycodes.a(SlickToAndroidKeycodes$AndroidCodes.class);
        f = SlickToAndroidKeycodes.a(SlickToAndroidKeycodes$GdxCodes.class);
        SlickToAndroidKeycodes.a();
        SlickToAndroidKeycodes.b();
        SlickToAndroidKeycodes.c();
    }
}

