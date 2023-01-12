/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$StaticBoolean;
import com.corrodinggames.rts.game.units.y;

public final class LogicBoolean$StaticBooleanFalse
extends LogicBoolean$StaticBoolean {
    @Override
    public String getMatchFailReasonForPlayer(y y2) {
        return "false";
    }

    @Override
    public boolean read(y y2) {
        return false;
    }
}

