/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.Iterator
 */
package com.corrodinggames.rts.game.units.custom.a.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.a.a;
import com.corrodinggames.rts.game.units.custom.a.d;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.j;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$ReturnType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$CachedWriter;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$MemoryNames;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$MemoryWriter;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableDataArray;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableDefinition;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableName;
import com.corrodinggames.rts.gameFramework.utility.ab;
import java.util.Iterator;

public class h
extends a {
    VariableScope$CachedWriter a;
    boolean b;
    LogicBoolean c;
    LogicBoolean d;
    VariableScope$MemoryNames e;

    public static void a(l l2, ab ab2, String string2, String string3, d d2, String string4, boolean bl2) {
        h h2;
        boolean bl3 = ab2.a(string2, string3 + "swapCustomTarget1And2", (Boolean)false);
        LogicBoolean logicBoolean = ab2.b(l2, string2, string3 + "setCustomTarget1", null);
        LogicBoolean logicBoolean2 = ab2.b(l2, string2, string3 + "setCustomTarget2", null);
        VariableScope$MemoryWriter variableScope$MemoryWriter = null;
        String string5 = ab2.b(string2, string3 + "setUnitMemory", (String)null);
        if (string5 != null) {
            variableScope$MemoryWriter = VariableScope.createMemoryWriter(string5, l2, string2, string3 + "setUnitMemory");
        }
        String string6 = ab2.b(string2, string3 + "shrinkArrays", (String)null);
        VariableScope$MemoryNames variableScope$MemoryNames = null;
        if (string6 != null) {
            variableScope$MemoryNames = VariableScope.createMemoryNameList(string6, l2, null, string2, string3 + "shrinkArrays");
            h2 = variableScope$MemoryNames.names.iterator();
            while (h2.hasNext()) {
                VariableScope$VariableName variableScope$VariableName = (VariableScope$VariableName)h2.next();
                VariableScope$VariableDefinition variableScope$VariableDefinition = l2.r.get(variableScope$VariableName);
                if (variableScope$VariableDefinition == null) {
                    throw new bo("Failed to find defined memory: " + variableScope$VariableName, string2, string3 + "shrinkArrays");
                }
                if (!LogicBoolean$ReturnType.isArrayType(variableScope$VariableDefinition.type)) {
                    throw new bo("Memory: " + variableScope$VariableName + " is type: " + (Object)((Object)variableScope$VariableDefinition.type) + " expected an array type", string2, string3 + "shrinkArrays");
                }
                if (variableScope$VariableDefinition.type == LogicBoolean$ReturnType.numberArray || variableScope$VariableDefinition.type == LogicBoolean$ReturnType.unitArray) continue;
                throw new bo("Memory: " + variableScope$VariableName + " is type: " + (Object)((Object)variableScope$VariableDefinition.type) + " only number and unit arrays are supported by shrinkArrays", string2, string3 + "shrinkArrays");
            }
        }
        if (bl3 || logicBoolean != null || logicBoolean2 != null || variableScope$MemoryWriter != null || variableScope$MemoryNames != null) {
            h2 = new h();
            h2.a = variableScope$MemoryWriter;
            h2.b = bl3;
            h2.c = logicBoolean;
            h2.d = logicBoolean2;
            h2.e = variableScope$MemoryNames;
            d2.ac.add(h2);
        }
    }

    @Override
    public boolean a(j j2, s s2, PointF pointF, am am2, int n2) {
        am am3;
        if (this.a != null) {
            this.a.writeToUnit(j2);
        }
        if (this.b) {
            am3 = j2.bu;
            j2.bu = j2.bv;
            j2.bv = am3;
        }
        if (this.c != null) {
            am3 = this.c.readUnit(j2);
            j2.bu = am3 = VariableScope.getSafeUnitReferenceForStorage(am3);
        }
        if (this.d != null) {
            am3 = this.d.readUnit(j2);
            j2.bv = am3 = VariableScope.getSafeUnitReferenceForStorage(am3);
        }
        if (this.e != null) {
            h.a(j2, this.e);
        }
        return true;
    }

    public static void a(j j2, VariableScope$MemoryNames variableScope$MemoryNames) {
        if (j2.bw == null) {
            return;
        }
        Iterator iterator = variableScope$MemoryNames.names.iterator();
        while (iterator.hasNext()) {
            VariableScope$VariableName variableScope$VariableName = (VariableScope$VariableName)iterator.next();
            VariableScope$VariableData variableScope$VariableData = j2.bw.getDataObjectRaw(variableScope$VariableName);
            if (variableScope$VariableData == null || !(variableScope$VariableData instanceof VariableScope$VariableDataArray)) continue;
            VariableScope$VariableDataArray variableScope$VariableDataArray = (VariableScope$VariableDataArray)variableScope$VariableData;
            variableScope$VariableDataArray.shrink();
        }
    }
}

