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

final class h$6
extends x {
    h$6(String string2) {
        super(string2);
    }

    @Override
    public String a() {
        return "Pause Game";
    }

    @Override
    public String b() {
        l l2 = l.B();
        if (l2.bt != 0.0f) {
            return "Pause: Off";
        }
        return "Pause: On";
    }

    @Override
    public boolean c(am am2, boolean bl2) {
        l l2 = l.B();
        if (l2.cb.j()) {
            // empty if block
        }
        l2.bt = l2.bt != 0.0f ? 0.0f : 1.0f;
        return false;
    }
}

