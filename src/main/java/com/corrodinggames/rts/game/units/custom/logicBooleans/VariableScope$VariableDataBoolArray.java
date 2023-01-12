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

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$ReturnType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableDataArray;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableDataBoolean;

public class VariableScope$VariableDataBoolArray
extends VariableScope$VariableDataArray {
    boolean[] dataArray;

    @Override
    public LogicBoolean$ReturnType getReturnType() {
        return LogicBoolean$ReturnType.boolArray;
    }

    @Override
    public LogicBoolean$ReturnType getElementReturnType() {
        return LogicBoolean$ReturnType.bool;
    }

    @Override
    public boolean readBooleanIndex(int n2) {
        if (n2 < 0 || n2 >= this.size) {
            return false;
        }
        return this.dataArray[n2];
    }

    public void setBooleanIndex(int n2, boolean bl2) {
        int n3;
        if (n2 < 0) {
            return;
        }
        if (n2 > 10000) {
            return;
        }
        if (this.dataArray == null) {
            n3 = n2 + 1;
            this.dataArray = new boolean[n3];
        }
        if (n2 >= this.dataArray.length) {
            int n4;
            n3 = 12;
            int n5 = n4 + ((n4 = this.dataArray.length) < n3 / 2 ? n3 : n4 >> 1);
            if (n5 < n2 + 1) {
                n5 = n2 + 1;
            }
            boolean[] blArray = new boolean[n5];
            System.arraycopy((Object)this.dataArray, (int)0, (Object)blArray, (int)0, (int)n4);
            this.dataArray = blArray;
        }
        if (this.size < n2 + 1) {
            this.size = n2 + 1;
            if (this.size > this.dataArray.length) {
                throw new RuntimeException("size:" + this.size + ", dataArray.length:" + this.dataArray.length);
            }
        }
        this.dataArray[n2] = bl2;
    }

    @Override
    public void shrink() {
        for (int i2 = 0; i2 < this.size; ++i2) {
            if (this.dataArray[i2]) continue;
            for (int i3 = i2 + 1; i3 < this.size; ++i3) {
                this.dataArray[i3 - 1] = this.dataArray[i3];
            }
            this.dataArray[this.size - 1] = false;
            --this.size;
            --i2;
        }
    }

    @Override
    public void setDataAtIndex(VariableScope$VariableData variableScope$VariableData, int n2) {
        this.setBooleanIndex(n2, variableScope$VariableData.read(null));
    }

    @Override
    public VariableScope$VariableData readDataAtIndex(int n2) {
        return new VariableScope$VariableDataBoolean(this.readBooleanIndex(n2));
    }
}

