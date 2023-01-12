/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$ReturnType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$CachedWriter$WriterElement;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$CachedWriter$WriterFactory;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$MemoryWriterFactory$MemoryWriterElement;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$MemoryWriterFactory$MemoryWriterElementIndex;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableMapping;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableName;

public class VariableScope$MemoryWriterFactory
extends VariableScope$CachedWriter$WriterFactory {
    l meta;
    VariableScope$VariableMapping target;
    boolean noValues;

    public VariableScope$MemoryWriterFactory(l l2, VariableScope$VariableMapping variableScope$VariableMapping) {
        this.meta = l2;
        this.target = variableScope$VariableMapping;
    }

    public VariableScope$MemoryWriterFactory(l l2) {
        this.meta = l2;
        if (l2 != null) {
            this.target = l2.r;
        }
    }

    @Override
    public VariableScope$CachedWriter$WriterElement createWriterElement(String string2, String string3, String string4, String string5) {
        VariableScope$MemoryWriterFactory$MemoryWriterElement variableScope$MemoryWriterFactory$MemoryWriterElement;
        LogicBoolean$ReturnType logicBoolean$ReturnType;
        VariableScope$VariableName variableScope$VariableName;
        Object object;
        if (!string3.equals((Object)"=")) {
            throw new bo("Only '=' is supported here, got:" + string3);
        }
        if (!this.noValues) {
            if (string4 == null) {
                throw new bo("Expected a value for: " + string2 + " (likely missing '=')");
            }
        } else if (string4 != null) {
            throw new bo("Expected no value for: " + string2 + " (Remove '=" + string4 + "')");
        }
        LogicBoolean logicBoolean = null;
        if (string4 != null) {
            try {
                logicBoolean = LogicBooleanLoader.parseBooleanBlock(this.meta, string4, false);
            }
            catch (RuntimeException runtimeException) {
                throw new RuntimeException("LogicBoolean - Error: " + runtimeException.getMessage() + ", [parsing: '" + string4 + "']", (Throwable)runtimeException);
            }
        }
        if (this.target != null) {
            object = this.target.get(string2);
            if (object == null) {
                throw new bo("Unknown variable: " + string2 + " (has it been defined in this unit?)");
            }
            variableScope$VariableName = object.name;
            logicBoolean$ReturnType = object.type;
        } else {
            variableScope$VariableName = VariableScope$VariableName.get(string2);
            logicBoolean$ReturnType = LogicBoolean$ReturnType.undefined;
        }
        object = logicBoolean$ReturnType;
        LogicBoolean logicBoolean2 = null;
        if (string5 != null) {
            if (!LogicBoolean$ReturnType.isArrayType(logicBoolean$ReturnType)) {
                if (logicBoolean$ReturnType != LogicBoolean$ReturnType.undefined) {
                    throw new bo("Variable: " + string2 + " is not an array type " + (Object)((Object)logicBoolean$ReturnType) + " cannot use [] index on it.");
                }
            } else {
                object = LogicBoolean$ReturnType.getArrayBaseType(logicBoolean$ReturnType);
            }
            try {
                logicBoolean2 = LogicBooleanLoader.parseBooleanBlock(this.meta, string5, false);
            }
            catch (RuntimeException runtimeException) {
                throw new RuntimeException("Error reading " + string2 + "[] array index: " + runtimeException.getMessage() + ", [parsing: '" + string5 + "']", (Throwable)runtimeException);
            }
            if (logicBoolean2 != null && logicBoolean2.getReturnType() != LogicBoolean$ReturnType.number) {
                throw new RuntimeException("Expected " + string2 + "[] array index to be a number got " + (Object)((Object)logicBoolean2.getReturnType()) + " type, [parsing: '" + string5 + "']");
            }
            if (logicBoolean2 == null) {
                throw new RuntimeException("Missing " + string2 + "[] array index");
            }
        } else if (!(this.noValues || !LogicBoolean$ReturnType.isArrayType(logicBoolean$ReturnType) || string4 != null && "null".equalsIgnoreCase(string4.trim()))) {
            throw new bo("Variable " + string2 + " is an array type. Expected: NAME[INDEX]=VALUE format (or NAME=null)");
        }
        if (logicBoolean2 == null) {
            variableScope$MemoryWriterFactory$MemoryWriterElement = new VariableScope$MemoryWriterFactory$MemoryWriterElement();
            variableScope$MemoryWriterFactory$MemoryWriterElement.name = variableScope$VariableName;
            variableScope$MemoryWriterFactory$MemoryWriterElement.value = logicBoolean;
        } else {
            VariableScope$MemoryWriterFactory$MemoryWriterElementIndex variableScope$MemoryWriterFactory$MemoryWriterElementIndex = new VariableScope$MemoryWriterFactory$MemoryWriterElementIndex();
            variableScope$MemoryWriterFactory$MemoryWriterElement = variableScope$MemoryWriterFactory$MemoryWriterElementIndex;
            variableScope$MemoryWriterFactory$MemoryWriterElementIndex.name = variableScope$VariableName;
            variableScope$MemoryWriterFactory$MemoryWriterElementIndex.value = logicBoolean;
            variableScope$MemoryWriterFactory$MemoryWriterElementIndex.nameIndex = logicBoolean2;
        }
        if (object != LogicBoolean$ReturnType.undefined && logicBoolean != null && logicBoolean.getReturnType() != object) {
            if (LogicBoolean.isStaticNull(logicBoolean)) {
                boolean bl2 = LogicBoolean$ReturnType.canBeNull((LogicBoolean$ReturnType)((Object)object));
                if (!bl2) {
                    throw new bo("Variable: " + string2 + " of type " + object + " cannot be set to null.");
                }
            } else {
                throw new bo("Variable: " + string2 + " expects " + LogicBoolean$ReturnType.toUserString((LogicBoolean$ReturnType)((Object)object)) + " type getting: " + LogicBoolean$ReturnType.toUserString(logicBoolean.getReturnType()) + " from: " + string4);
            }
        }
        return variableScope$MemoryWriterFactory$MemoryWriterElement;
    }
}

