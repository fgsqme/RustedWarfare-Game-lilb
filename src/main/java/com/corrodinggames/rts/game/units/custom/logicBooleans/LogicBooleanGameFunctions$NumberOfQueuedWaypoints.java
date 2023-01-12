/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.au;
import com.corrodinggames.rts.game.units.av;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$AbstractNumberBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$Parameter;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.utility.ab;
import com.corrodinggames.rts.gameFramework.utility.am;

public class LogicBooleanGameFunctions$NumberOfQueuedWaypoints
extends LogicBoolean$AbstractNumberBoolean {
    av type;

    @LogicBoolean$Parameter
    public void type(String string2) {
        try {
            this.type = (av)ab.a(string2, null, av.class);
        }
        catch (bo bo2) {
            throw new am(bo2.getMessage(), (Throwable)((Object)bo2));
        }
    }

    @Override
    public String getName() {
        return "NumberOfQueuedWaypoints";
    }

    @Override
    public float getValue(y y2) {
        if (this.type == null) {
            return y2.av();
        }
        int n2 = 0;
        int n3 = y2.av();
        for (int i2 = 0; i2 < n3; ++i2) {
            boolean bl2;
            au au2 = y2.k(i2);
            if (au2 == null) continue;
            boolean bl3 = bl2 = au2.d() == this.type;
            if (!bl2) continue;
            ++n2;
        }
        return n2;
    }

    @Override
    public float getMaxValue(y y2) {
        return 2.14748365E9f;
    }
}

