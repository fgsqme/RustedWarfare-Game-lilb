/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.y;

public class UnitReference$LockedUnitReference
extends UnitReference {
    am target;

    public UnitReference$LockedUnitReference(am am2) {
        this.target = am2;
    }

    @Override
    public am getSingleRaw(y y2) {
        return this.target;
    }

    @Override
    public String getClassDebugName() {
        return "unit";
    }
}

