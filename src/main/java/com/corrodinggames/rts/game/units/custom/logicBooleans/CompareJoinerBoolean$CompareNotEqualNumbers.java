/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.CompareJoinerBoolean$CompareNumbers;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.y;

public final class CompareJoinerBoolean$CompareNotEqualNumbers
extends CompareJoinerBoolean$CompareNumbers {
    @Override
    public String type() {
        return "!=";
    }

    @Override
    public boolean read(y y2) {
        LogicBoolean[] logicBooleanArray = this.children;
        float f2 = logicBooleanArray[0].readNumber(y2);
        for (int i2 = 1; i2 < logicBooleanArray.length; ++i2) {
            float f3 = logicBooleanArray[i2].readNumber(y2);
            if (!(f3 - 1.0E-4f > f2) && !(f3 + 1.0E-4f < f2)) {
                return false;
            }
            f2 = f3;
        }
        return true;
    }
}

