/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$LogicBooleanCommonLocking;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$Parameter;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.l;

public class LogicBooleanGameFunctions$OverPassableTileBoolean
extends LogicBoolean$LogicBooleanCommonLocking {
    ao movementType = ao.b;

    @LogicBoolean$Parameter
    public void type(String string2) {
        this.movementType = ao.a(string2, "isOverPassableTile()");
    }

    @Override
    public boolean read(y y2) {
        boolean bl2 = false;
        l l2 = l.B();
        if (!com.corrodinggames.rts.gameFramework.utility.y.a(y2.eo, y2.ep, this.movementType)) {
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public String getMatchFailReasonForPlayer(y y2) {
        return "OverLand";
    }
}

