/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$AbstractNumberBoolean;
import com.corrodinggames.rts.game.units.y;

public final class LogicBooleanGameFunctions$AmmoBoolean
extends LogicBoolean$AbstractNumberBoolean {
    @Override
    public String getName() {
        return "Ammo";
    }

    @Override
    public float getValue(y y2) {
        return y2.cE;
    }

    @Override
    public float getMaxValue(y y2) {
        return 2.14748365E9f;
    }
}

