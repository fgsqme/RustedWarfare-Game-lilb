/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$TimeBoolean;
import com.corrodinggames.rts.game.units.y;

public final class LogicBooleanGameFunctions$LastConvertedBoolean
extends LogicBoolean$TimeBoolean {
    @Override
    public String getName() {
        return "LastConverted";
    }

    @Override
    public int getTime(y y2) {
        return y2.bB;
    }
}

