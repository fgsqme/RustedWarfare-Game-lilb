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
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$ReturnType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction;
import com.corrodinggames.rts.game.units.y;

public class LogicNumberFunction$FunctionDistanceSquared
extends LogicNumberFunction {
    @LogicBoolean$Parameter(type=LogicBoolean$ReturnType.number, positional=0, required=true)
    public LogicBoolean x1;
    @LogicBoolean$Parameter(type=LogicBoolean$ReturnType.number, positional=1, required=true)
    public LogicBoolean y1;
    @LogicBoolean$Parameter(type=LogicBoolean$ReturnType.number, positional=2, required=true)
    public LogicBoolean x2;
    @LogicBoolean$Parameter(type=LogicBoolean$ReturnType.number, positional=3, required=true)
    public LogicBoolean y2;

    @Override
    public String getName() {
        return "DistanceSquared";
    }

    @Override
    public float readNumber(y y2) {
        float f2 = this.x1.readNumber(y2);
        float f3 = this.y1.readNumber(y2);
        float f4 = this.x2.readNumber(y2);
        float f5 = this.y2.readNumber(y2);
        return (f2 - f4) * (f2 - f4) + (f3 - f5) * (f3 - f5);
    }
}

