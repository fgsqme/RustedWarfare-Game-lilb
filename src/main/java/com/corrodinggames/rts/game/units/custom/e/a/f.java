/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.corrodinggames.rts.game.units.custom.e.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bb;
import com.corrodinggames.rts.game.units.custom.e.a.a;

public class f
extends a {
    public f() {
        this.u = true;
        this.t = true;
        this.b = "shield";
        this.c = bb.a("shield");
    }

    @Override
    public double a(am am2) {
        return am2.cx;
    }

    @Override
    public void a(am am2, double d2) {
        am2.cx = (float)d2;
    }

    @Override
    public void b(am am2, double d2) {
        am2.cx = (float)((double)am2.cx + d2);
    }
}

