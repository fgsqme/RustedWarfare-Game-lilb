/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.gameFramework.utility.ab;

public strictfp class m {
    public boolean a;
    public float b;
    public int c;
    public int d;
    public float e;

    public static m a(l l2, ab ab2, String string2, String string3, boolean bl2) {
        m m2 = new m();
        m2.a = ab2.a(string2, string3 + "direction_useMainTurret", (Boolean)false);
        m2.b = ab2.a(string2, string3 + "direction_units", Float.valueOf((float)0.0f)).floatValue();
        m2.c = ab2.b(string2, string3 + "direction_strideX", -1);
        m2.d = ab2.b(string2, string3 + "direction_strideY", -1);
        m2.e = ab2.a(string2, string3 + "direction_starting", Float.valueOf((float)0.0f)).floatValue();
        if (m2.b == 0.0f) {
            return null;
        }
        return m2;
    }
}

