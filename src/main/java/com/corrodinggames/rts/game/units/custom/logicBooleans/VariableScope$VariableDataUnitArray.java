/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.System
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$ReturnType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableDataArray;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableDataUnit;

public class VariableScope$VariableDataUnitArray
extends VariableScope$VariableDataArray {
    am[] dataArray;

    @Override
    public LogicBoolean$ReturnType getReturnType() {
        return LogicBoolean$ReturnType.unitArray;
    }

    @Override
    public LogicBoolean$ReturnType getElementReturnType() {
        return LogicBoolean$ReturnType.unit;
    }

    @Override
    public am readUnitIndex(int n2) {
        if (n2 < 0 || n2 >= this.size) {
            return null;
        }
        return this.dataArray[n2];
    }

    public void setUnitIndex(int n2, am am2) {
        int n3;
        if (n2 < 0) {
            return;
        }
        if (n2 > 10000) {
            return;
        }
        if (this.dataArray == null) {
            n3 = n2 + 1;
            this.dataArray = new am[n3];
        }
        if (n2 >= this.dataArray.length) {
            int n4;
            n3 = 12;
            int n5 = n4 + ((n4 = this.dataArray.length) < n3 / 2 ? n3 : n4 >> 1);
            if (n5 < n2 + 1) {
                n5 = n2 + 1;
            }
            am[] amArray = new am[n5];
            System.arraycopy((Object)this.dataArray, (int)0, (Object)amArray, (int)0, (int)n4);
            this.dataArray = amArray;
        }
        if (this.size < n2 + 1) {
            this.size = n2 + 1;
            if (this.size > this.dataArray.length) {
                throw new RuntimeException("size:" + this.size + ", dataArray.length:" + this.dataArray.length);
            }
        }
        this.dataArray[n2] = am2;
    }

    @Override
    public void setDataAtIndex(VariableScope$VariableData variableScope$VariableData, int n2) {
        this.setUnitIndex(n2, variableScope$VariableData.readUnit(null));
    }

    @Override
    public VariableScope$VariableData readDataAtIndex(int n2) {
        return new VariableScope$VariableDataUnit(this.readUnitIndex(n2));
    }

    @Override
    public void shrink() {
        for (int i2 = 0; i2 < this.size; ++i2) {
            am am2 = this.dataArray[i2];
            if (am2 != null && (VariableScope.isMarker(am2) || !am2.bV)) continue;
            for (int i3 = i2 + 1; i3 < this.size; ++i3) {
                this.dataArray[i3 - 1] = this.dataArray[i3];
            }
            this.dataArray[this.size - 1] = null;
            --this.size;
            --i2;
        }
    }
}

