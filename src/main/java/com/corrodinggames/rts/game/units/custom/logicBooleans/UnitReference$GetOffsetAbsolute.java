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
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$Parameter;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$ReturnType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$StaticValueBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$PlaceholderUnitReference;
import com.corrodinggames.rts.game.units.y;

public class UnitReference$GetOffsetAbsolute
extends UnitReference$PlaceholderUnitReference {
    @LogicBoolean$Parameter(type=LogicBoolean$ReturnType.number, positional=0)
    public LogicBoolean x = LogicBoolean$StaticValueBoolean.static_0;
    @LogicBoolean$Parameter(type=LogicBoolean$ReturnType.number, positional=1)
    public LogicBoolean y = LogicBoolean$StaticValueBoolean.static_0;
    @LogicBoolean$Parameter(type=LogicBoolean$ReturnType.number)
    public LogicBoolean height = LogicBoolean$StaticValueBoolean.static_0;

    @Override
    public String getClassDebugName() {
        return "getOffsetAbsolute";
    }

    @Override
    public am getSingleRaw(y y2) {
        y y3 = y2.bX.t;
        y y4 = UnitReference$GetOffsetAbsolute.getParameterContext(y2);
        y3.cg = y2.cg;
        y3.eo = y2.eo + this.x.readNumber(y4);
        y3.ep = y2.ep + this.y.readNumber(y4);
        y3.eq = y2.eq + this.height.readNumber(y4);
        return y3;
    }
}

