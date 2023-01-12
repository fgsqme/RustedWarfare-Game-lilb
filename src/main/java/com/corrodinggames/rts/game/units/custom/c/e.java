/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.corrodinggames.rts.game.units.custom.c;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.c.a;
import com.corrodinggames.rts.game.units.custom.c.d;
import com.corrodinggames.rts.gameFramework.utility.m;

public strictfp class e {
    a a;
    m b = new m();

    public e(a a2) {
        this.a = a2;
    }

    public d a(am am2) {
        int n2 = this.b.a;
        Object[] objectArray = this.b.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            d d2 = (d)objectArray[i2];
            if (d2.a != am2) continue;
            return d2;
        }
        return null;
    }
}

