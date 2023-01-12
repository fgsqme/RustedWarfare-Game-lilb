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
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$Parameter;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.utility.ab;
import com.corrodinggames.rts.gameFramework.utility.am;

public class LogicBooleanGameFunctions$HasActiveWaypoint
extends LogicBoolean {
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
    public boolean read(y y2) {
        boolean bl2 = false;
        au au2 = y2.ar();
        if (au2 != null) {
            bl2 = this.type == null ? true : au2.d() == this.type;
        }
        return bl2;
    }

    @Override
    public String getMatchFailReasonForPlayer(y y2) {
        return "HasActiveWaypoint(type=" + (Object)((Object)this.type) + ")";
    }
}

