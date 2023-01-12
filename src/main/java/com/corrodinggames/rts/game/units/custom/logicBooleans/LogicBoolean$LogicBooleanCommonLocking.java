/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CloneNotSupportedException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.Throwable
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;

public abstract class LogicBoolean$LogicBooleanCommonLocking
extends LogicBoolean {
    boolean locked = false;

    @Override
    public LogicBoolean createLocked() {
        LogicBoolean$LogicBooleanCommonLocking logicBoolean$LogicBooleanCommonLocking;
        try {
            logicBoolean$LogicBooleanCommonLocking = (LogicBoolean$LogicBooleanCommonLocking)this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException((Throwable)cloneNotSupportedException);
        }
        logicBoolean$LogicBooleanCommonLocking.locked = true;
        return logicBoolean$LogicBooleanCommonLocking;
    }

    @Override
    public boolean isLocked() {
        return this.locked;
    }
}

