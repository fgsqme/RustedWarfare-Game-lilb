/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.n;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.h;
import com.corrodinggames.rts.game.units.f.i;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.f;

public class LogicBooleanGameFunctions$NumberOfUnitsInTeam$HandleCallbackCount
extends i {
    public g tag;
    public int count;
    public float withinRangeSq;
    public boolean incompleteBuildings;
    public n targetTeam;

    @Override
    public void setup(y y2, float f2) {
    }

    @Override
    public int excludeTeam(y y2) {
        return -1;
    }

    @Override
    public n onlyEnemiesOfTeam(y y2) {
        return null;
    }

    @Override
    public n onlyTeam(y y2) {
        return this.targetTeam;
    }

    @Override
    public void callback(y y2, float f2, am am2) {
        float f3;
        h h2 = am2.de();
        if ((this.tag == null || h2 != null && g.a(this.tag, h2)) && (f3 = f.a(y2.eo, y2.ep, am2.eo, am2.ep)) < this.withinRangeSq) {
            if (am2.cm < 1.0f && !this.incompleteBuildings) {
                return;
            }
            ++this.count;
        }
    }
}

