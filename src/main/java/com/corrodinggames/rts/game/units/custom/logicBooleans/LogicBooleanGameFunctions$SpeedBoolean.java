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
import com.corrodinggames.rts.gameFramework.f;

public class LogicBooleanGameFunctions$SpeedBoolean
extends LogicBoolean {
    @LogicBoolean$Parameter
    public boolean atTopSpeed;

    @Override
    public boolean read(y y2) {
        boolean bl2 = false;
        float f2 = y2.z() - 0.1f;
        if (y2.bi()) {
            float f3 = f.a(0.0f, 0.0f, y2.cc, y2.cd);
            if (f3 != 0.0f && f3 > f2 * f2) {
                bl2 = true;
            }
        } else if (y2.cf != 0.0f && y2.cf > f2) {
            bl2 = true;
        }
        return bl2;
    }

    @Override
    public String getMatchFailReasonForPlayer(y y2) {
        return "Speed";
    }
}

