/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.n;
import com.corrodinggames.rts.game.units.ai;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.f.i;
import com.corrodinggames.rts.game.units.y;

public class aj
extends i {
    float a;
    float b;
    public ai c;

    aj() {
    }

    @Override
    public int excludeTeam(y y2) {
        return -2;
    }

    @Override
    public n onlyEnemiesOfTeam(y y2) {
        return null;
    }

    @Override
    public void setup(y y2, float f2) {
        this.c = null;
    }

    public void a(float f2, float f3) {
        this.a = f2;
        this.b = f3;
    }

    @Override
    public void callback(y y2, float f2, am am2) {
        if (am2 instanceof ai && !am2.bV && am2.c(this.a, this.b, 0.0f)) {
            this.c = (ai)am2;
        }
    }
}

