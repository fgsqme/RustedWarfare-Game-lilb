/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$LogicBooleanCommonLocking;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$Parameter;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.l;

public class LogicBooleanGameFunctions$GameModeBoolean
extends LogicBoolean$LogicBooleanCommonLocking {
    @LogicBoolean$Parameter
    public boolean nukesEnabled;

    @Override
    public boolean read(y y2) {
        boolean bl2 = true;
        l l2 = l.B();
        if (this.nukesEnabled && l2.O() && l2.bX.ay.i) {
            bl2 = false;
        }
        return bl2;
    }

    @Override
    public String getMatchFailReasonForPlayer(y y2) {
        return "GameMode(" + (this.nukesEnabled ? "Nukes enabled" : "Nukes disabled") + ")";
    }
}

