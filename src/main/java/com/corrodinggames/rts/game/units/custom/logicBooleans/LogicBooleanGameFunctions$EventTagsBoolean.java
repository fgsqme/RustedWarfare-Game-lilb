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
import com.corrodinggames.rts.game.units.custom.h;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$Parameter;
import com.corrodinggames.rts.game.units.y;

public class LogicBooleanGameFunctions$EventTagsBoolean
extends LogicBoolean {
    public g includesTag;

    @LogicBoolean$Parameter
    public void includes(String string2) {
        this.includesTag = g.c(string2);
    }

    @Override
    public String getMatchFailReasonForPlayer(y y2) {
        String string2 = "EventTag";
        if (this.includesTag != null) {
            string2 = string2 + " includes " + this.includesTag;
        }
        return string2;
    }

    @Override
    public boolean read(y y2) {
        boolean bl2 = true;
        if (this.includesTag != null) {
            h h2 = null;
            if (LogicBoolean.activeEvent != null) {
                h2 = LogicBoolean.activeEvent.d;
            }
            if (h2 == null || !g.a(this.includesTag, h2)) {
                bl2 = false;
            }
        }
        return bl2;
    }
}

