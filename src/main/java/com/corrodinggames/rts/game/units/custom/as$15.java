/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.ax;
import com.corrodinggames.rts.game.units.custom.j;

final class as$15
extends ax {
    as$15(int n2, String string2) {
        super(n2, string2);
    }

    @Override
    public double a(j j2) {
        return j2.cu;
    }

    @Override
    public void b(j j2, double d2) {
        j2.cu = (float)d2;
    }

    @Override
    public void a(j j2, double d2) {
        super.a(j2, d2);
        j2.o((float)d2);
    }
}

