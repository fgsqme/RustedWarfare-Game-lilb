/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.a.x;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.l;

final class h$14
extends x {
    h$14(String string2) {
        super(string2);
    }

    @Override
    public String a() {
        return "Clear save history";
    }

    @Override
    public String b() {
        l l2 = l.B();
        return "Clear history";
    }

    @Override
    public boolean b(am am2) {
        l l2 = l.B();
        return l2.bl;
    }
}

