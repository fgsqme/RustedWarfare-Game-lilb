/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$AbstractNumberBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$Parameter;
import com.corrodinggames.rts.game.units.y;

public final class LogicBooleanGameFunctions$QueueSize
extends LogicBoolean$AbstractNumberBoolean {
    public g _withActionTag;

    @LogicBoolean$Parameter
    public void withActionTag(String string2) {
        this._withActionTag = g.c(string2);
    }

    @Override
    public String getName() {
        return "QueueSize";
    }

    @Override
    public float getValue(y y2) {
        return y2.a(this._withActionTag);
    }

    @Override
    public float getMaxValue(y y2) {
        return 2.14748365E9f;
    }
}

