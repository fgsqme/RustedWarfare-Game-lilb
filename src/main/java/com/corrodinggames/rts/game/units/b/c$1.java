/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.b;

import com.corrodinggames.rts.game.units.a.x;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.b.c;

final class c$1
extends x {
    c$1(int n2) {
        super(n2);
    }

    @Override
    public String a() {
        return "-Surface unit.";
    }

    @Override
    public String b() {
        return "Fly";
    }

    @Override
    public boolean a(am am2, boolean bl2) {
        return !((c)am2).r;
    }
}

