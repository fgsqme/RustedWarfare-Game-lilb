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
import com.corrodinggames.rts.gameFramework.l;

final class h$10
extends x {
    h$10(String string2) {
        super(string2);
    }

    @Override
    public String a() {
        return "Show hidden unit information in tooltips including flags, ammo, tags and resources";
    }

    @Override
    public String b() {
        l l2 = l.B();
        if (!l2.bl) {
            return "Debug: Off";
        }
        return "Debug: On";
    }
}

