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
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$Parameter;
import com.corrodinggames.rts.game.units.y;

public class LogicBooleanGameFunctions$HeightBoolean
extends LogicBoolean {
    @LogicBoolean$Parameter
    public boolean underwater;
    @LogicBoolean$Parameter
    public boolean ground;
    @LogicBoolean$Parameter
    public boolean flying;

    @Override
    public String getMatchFailReasonForPlayer(y y2) {
        String string2 = "";
        if (this.underwater) {
            string2 = string2 + "underwater";
        }
        if (this.ground) {
            string2 = string2 + "ground";
        }
        if (this.flying) {
            string2 = string2 + "flying";
        }
        if (string2.equals((Object)"")) {
            string2 = string2 + "height";
        }
        return string2;
    }

    @Override
    public boolean read(y y2) {
        boolean bl2 = false;
        if (this.underwater && y2.eq < -2.0f) {
            bl2 = true;
        }
        if (this.ground && y2.eq > -2.0f && y2.eq < 5.0f) {
            bl2 = true;
        }
        if (this.flying && y2.eq > 5.0f) {
            bl2 = true;
        }
        return bl2;
    }
}

