/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.game.units.a.t;
import com.corrodinggames.rts.game.units.a.w;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.d.q;
import com.corrodinggames.rts.gameFramework.h.a;

final class q$2
extends w {
    q$2(int n2) {
        super(n2);
    }

    @Override
    public boolean g() {
        return false;
    }

    @Override
    public String a() {
        return a.a("gui.actions.buildNuke.description", new Object[0]);
    }

    @Override
    public String b() {
        return a.a("gui.actions.buildNuke", new Object[0]);
    }

    @Override
    public int c() {
        return 11000;
    }

    @Override
    public float K() {
        return 3.0E-4f;
    }

    @Override
    public boolean a(am am2, boolean bl2) {
        q q2 = (q)am2;
        float f2 = q2.c + q2.a(this.N(), bl2);
        if (f2 >= 4.0f) {
            return false;
        }
        return super.a(am2, bl2);
    }

    public ar L() {
        return null;
    }

    @Override
    public t f() {
        return t.d;
    }

    @Override
    public /* synthetic */ as i() {
        return this.L();
    }
}

