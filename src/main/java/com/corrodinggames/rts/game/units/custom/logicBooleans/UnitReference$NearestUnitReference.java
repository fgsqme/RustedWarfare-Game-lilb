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

import com.corrodinggames.rts.game.q;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$Parameter;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$NearestUnitReference$HandleCallbackNearest;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.utility.ab;

public class UnitReference$NearestUnitReference
extends UnitReference {
    public float withinRange = 500.0f;
    public float withinRangeSq = this.withinRange * this.withinRange;
    public g _withTag;
    public g _withoutTag;
    public q relation = q.f;
    @LogicBoolean$Parameter
    public boolean incompleteBuildings;
    public static final UnitReference$NearestUnitReference$HandleCallbackNearest handleCallbackNearest = new UnitReference$NearestUnitReference$HandleCallbackNearest();

    @Override
    public String getClassDebugName() {
        return "NearestUnit";
    }

    @LogicBoolean$Parameter
    public void withinRange(float f2) {
        if (f2 > 1500.0f) {
            throw new com.corrodinggames.rts.gameFramework.utility.am("NearestUnit distance cannot be over 1500 is: " + f2);
        }
        this.withinRange = f2;
        this.withinRangeSq = f2 * f2;
    }

    @LogicBoolean$Parameter
    public void withTag(String string2) {
        this._withTag = g.c(string2);
    }

    @LogicBoolean$Parameter
    public void withoutTag(String string2) {
        this._withoutTag = g.c(string2);
    }

    @LogicBoolean$Parameter
    public void relation(String string2) {
        try {
            this.relation = (q)ab.a(string2, q.f, q.class);
        }
        catch (bo bo2) {
            throw new com.corrodinggames.rts.gameFramework.utility.am(bo2.getMessage(), (Throwable)((Object)bo2));
        }
    }

    @Override
    public am getSingleRaw(y y2) {
        UnitReference$NearestUnitReference.handleCallbackNearest.nearest = null;
        UnitReference$NearestUnitReference.handleCallbackNearest.withinRangeSq = this.withinRangeSq;
        UnitReference$NearestUnitReference.handleCallbackNearest.tag = this._withTag;
        UnitReference$NearestUnitReference.handleCallbackNearest.withoutTag = this._withoutTag;
        UnitReference$NearestUnitReference.handleCallbackNearest.incompleteBuildings = this.incompleteBuildings;
        UnitReference$NearestUnitReference.handleCallbackNearest.relation = this.relation;
        l l2 = l.B();
        l2.cc.a(y2.eo, y2.ep, this.withinRange, y2, 0.0f, handleCallbackNearest);
        return UnitReference$NearestUnitReference.handleCallbackNearest.nearest;
    }
}

