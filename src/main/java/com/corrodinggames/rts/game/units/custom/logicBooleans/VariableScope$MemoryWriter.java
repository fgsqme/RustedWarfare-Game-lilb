/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$CachedWriter;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$CachedWriter$WriterElement;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$MemoryWriterFactory$MemoryWriterElement;
import com.corrodinggames.rts.game.units.y;
import java.util.Iterator;

public class VariableScope$MemoryWriter
extends VariableScope$CachedWriter {
    public void writeToMemory(VariableScope variableScope, y y2) {
        Iterator iterator = this.writers.iterator();
        while (iterator.hasNext()) {
            VariableScope$CachedWriter$WriterElement variableScope$CachedWriter$WriterElement = (VariableScope$CachedWriter$WriterElement)iterator.next();
            VariableScope$MemoryWriterFactory$MemoryWriterElement variableScope$MemoryWriterFactory$MemoryWriterElement = (VariableScope$MemoryWriterFactory$MemoryWriterElement)variableScope$CachedWriter$WriterElement;
            variableScope$MemoryWriterFactory$MemoryWriterElement.writeToMemory(variableScope, y2);
        }
    }
}

