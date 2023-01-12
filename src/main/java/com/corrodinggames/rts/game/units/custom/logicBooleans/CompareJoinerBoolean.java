/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$JoinerBoolean;

public abstract class CompareJoinerBoolean
extends LogicBoolean$JoinerBoolean {
    @Override
    public boolean requireBooleanChildren() {
        return false;
    }
}

