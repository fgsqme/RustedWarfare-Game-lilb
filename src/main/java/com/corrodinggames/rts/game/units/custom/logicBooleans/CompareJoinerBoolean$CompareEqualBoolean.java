/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.CompareJoinerBoolean$CompareBooleanOnly;
import com.corrodinggames.rts.game.units.y;

public final class CompareJoinerBoolean$CompareEqualBoolean
extends CompareJoinerBoolean$CompareBooleanOnly {
    @Override
    public String type() {
        return "==";
    }

    @Override
    public boolean read(y y2) {
        boolean bl2 = this.children[0].read(y2);
        for (int i2 = 1; i2 < this.children.length; ++i2) {
            boolean bl3 = this.children[i2].read(y2);
            if (bl3 == bl2) continue;
            return false;
        }
        return true;
    }
}

