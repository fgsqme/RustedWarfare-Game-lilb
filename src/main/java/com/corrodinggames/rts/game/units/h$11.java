/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.a.a;
import com.corrodinggames.rts.game.units.a.x;
import com.corrodinggames.rts.gameFramework.l;

final class h$11
extends x {
    h$11(String string2) {
        super(string2);
    }

    @Override
    public String a() {
        return "AI debug view";
    }

    @Override
    public String b() {
        l l2 = l.B();
        if (!a.as) {
            return "AI Debug: Off";
        }
        return "AI Debug: On";
    }
}

