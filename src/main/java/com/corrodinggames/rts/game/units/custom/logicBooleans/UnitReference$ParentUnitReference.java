/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.y;

public class UnitReference$ParentUnitReference
extends UnitReference {
    @Override
    public am getSingleRaw(y y2) {
        return y2.dr();
    }

    @Override
    public String getMatchFailReasonForPlayer(y y2) {
        return "parent";
    }
}

