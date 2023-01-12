/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader$LogicBooleanContext;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;

public abstract class UnitReference$PlaceholderUnitReference
extends UnitReference {
    @Override
    public LogicBooleanLoader$LogicBooleanContext createContext() {
        return UnitReference.placeholderUnitContext;
    }
}

