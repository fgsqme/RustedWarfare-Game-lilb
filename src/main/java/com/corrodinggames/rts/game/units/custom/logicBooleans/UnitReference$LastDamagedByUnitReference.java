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

public class UnitReference$LastDamagedByUnitReference
extends UnitReference {
    @Override
    public am getSingleRaw(y y2) {
        am am2 = y2.bt;
        if (am2 == null || am2.bV) {
            return null;
        }
        return am2;
    }

    @Override
    public String getClassDebugName() {
        return "lastDamagedBy";
    }
}

