/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableName;

public class VariableScope$EmptyVariableScope
extends VariableScope {
    VariableScope$EmptyVariableScope() {
    }

    @Override
    public void setDataRaw(VariableScope$VariableName variableScope$VariableName, VariableScope$VariableData variableScope$VariableData) {
        throw new RuntimeException("Not allowed");
    }
}

