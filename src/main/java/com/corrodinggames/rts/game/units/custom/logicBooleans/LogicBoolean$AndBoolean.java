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
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$JoinerBoolean;
import com.corrodinggames.rts.game.units.y;

public final class LogicBoolean$AndBoolean
extends LogicBoolean$JoinerBoolean {
    @Override
    public String type() {
        return "and";
    }

    @Override
    public boolean read(y y2) {
        for (LogicBoolean logicBoolean : this.children) {
            if (logicBoolean.read(y2)) continue;
            return false;
        }
        return true;
    }
}

