/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$LogicBooleanCommon;
import com.corrodinggames.rts.game.units.y;

public final class LogicBooleanGameFunctions$TeamDefeatedTechBoolean
extends LogicBoolean$LogicBooleanCommon {
    @Override
    public String getName() {
        return "teamDefeatedTech";
    }

    @Override
    public boolean read(y y2) {
        return y2.bX.F;
    }
}

