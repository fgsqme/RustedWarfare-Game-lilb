/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.h;

import com.corrodinggames.rts.game.units.a.x;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.h.e;

final class e$1
extends x {
    e$1(int n2) {
        super(n2);
    }

    @Override
    public String a() {
        return "-Surface unit. Allows it to fire missiles";
    }

    @Override
    public String b() {
        return "Surface";
    }

    @Override
    public boolean a(am am2, boolean bl2) {
        return !((e)am2).a;
    }
}

