/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.logicBooleans.CompareJoinerBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.y;

public final class CompareJoinerBoolean$CompareNotEqualUnits
extends CompareJoinerBoolean {
    @Override
    public String type() {
        return "!=";
    }

    @Override
    public boolean read(y y2) {
        LogicBoolean[] logicBooleanArray = this.children;
        am am2 = logicBooleanArray[0].readUnit(y2);
        for (int i2 = 1; i2 < logicBooleanArray.length; ++i2) {
            am am3 = logicBooleanArray[i2].readUnit(y2);
            if (am2 == am3) {
                return false;
            }
            am2 = am3;
        }
        return true;
    }
}

