/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.y;

public class LogicBooleanGameFunctions$IsControlledByAI
extends LogicBoolean {
    @Override
    public boolean read(y y2) {
        boolean bl2 = false;
        if (y2.bX.w) {
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public String getMatchFailReasonForPlayer(y y2) {
        return "IsControlledByAI";
    }
}

