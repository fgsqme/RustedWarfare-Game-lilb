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

public abstract class LogicBoolean$LogicBooleanCommon
extends LogicBoolean {
    public abstract String getName();

    @Override
    public String getMatchFailReasonForPlayer(y y2) {
        String string2 = this.getName() + "=" + (this.read(y2) ? "true" : "false") + "";
        return string2;
    }
}

