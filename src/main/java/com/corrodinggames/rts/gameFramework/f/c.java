/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 */
package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

class c {
    am a;
    s b;
    float c;
    boolean d;
    boolean e;
    static m f = new m();

    c() {
    }

    public static void a(am am2, s s2, boolean bl2, boolean bl3) {
        c c2 = com.corrodinggames.rts.gameFramework.f.c.a(am2, s2, bl3);
        if (c2 == null) {
            c2 = new c();
            f.add(c2);
        }
        c2.a = am2;
        c2.b = s2;
        c2.c = 10.0f;
        c2.d = bl2;
        c2.e = bl3;
    }

    public static c a(am am2, s s2, boolean bl2) {
        Iterator iterator = f.iterator();
        while (iterator.hasNext()) {
            c c2 = (c)iterator.next();
            if (c2.a != am2 || c2.b != s2 || c2.e != bl2) continue;
            return c2;
        }
        return null;
    }

    public static float b(am am2, s s2, boolean bl2) {
        c c2 = com.corrodinggames.rts.gameFramework.f.c.a(am2, s2, bl2);
        if (c2 != null) {
            float f2 = c2.c / 10.0f;
            if (c2.d) {
                f2 = -f2;
            }
            return f2;
        }
        return 0.0f;
    }

    public static void a(float f2) {
        for (int i2 = f.size() - 1; i2 >= 0; --i2) {
            c c2 = (c)f.get(i2);
            c2.c -= f2;
            if (!(c2.c <= 0.0f)) continue;
            f.remove(i2);
        }
    }
}

