/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.as;
import com.corrodinggames.rts.game.units.custom.aw;
import com.corrodinggames.rts.game.units.custom.j;

final class as$14
extends aw {
    as$14(int n2, String string2) {
        super(n2, string2);
    }

    @Override
    public double a(as as2) {
        return as2.c;
    }

    @Override
    public void a(as as2, double d2) {
        as2.c = (int)d2;
    }

    @Override
    public void a(j j2, double d2) {
        super.a(j2, d2);
        j2.cv = (float)d2;
    }
}

