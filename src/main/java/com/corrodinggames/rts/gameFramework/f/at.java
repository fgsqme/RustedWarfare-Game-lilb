/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.gameFramework.f.ar;
import com.corrodinggames.rts.gameFramework.h.a;

strictfp class at
extends ar {
    public at(float f2, float f3, as as2) {
        super(f2, f3, as2);
    }

    @Override
    public String a() {
        if (this.g == null) {
            this.g = String.format((String)com.corrodinggames.rts.gameFramework.h.a.a("gui.log.upgradeCompleted", new Object[0]), (Object[])new Object[]{this.a.e(), this.b});
        }
        return this.g;
    }
}

