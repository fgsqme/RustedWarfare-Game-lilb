/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Locale
 */
package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.h;
import java.util.Locale;

public final class g {
    protected static h a;

    public static strictfp h a() {
        if (a == null) {
            String string2 = System.getProperty((String)"os.name", (String)"generic").toLowerCase(Locale.ENGLISH);
            a = string2.indexOf("mac") >= 0 || string2.indexOf("darwin") >= 0 ? h.b : (string2.indexOf("win") >= 0 ? h.a : (string2.indexOf("nux") >= 0 ? h.c : h.d));
        }
        return a;
    }
}

