/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction$LogicNumberFunctionRawArgs;
import com.corrodinggames.rts.game.units.y;

public class LogicNumberFunction$FunctionInt
extends LogicNumberFunction$LogicNumberFunctionRawArgs {
    @Override
    public String getName() {
        return "Int";
    }

    @Override
    public float readNumber(y y2) {
        float f2 = this.value.readNumber(y2);
        f2 = this.doFunction(f2);
        return f2;
    }

    @Override
    public float doFunction(float f2) {
        return (int)f2;
    }
}

