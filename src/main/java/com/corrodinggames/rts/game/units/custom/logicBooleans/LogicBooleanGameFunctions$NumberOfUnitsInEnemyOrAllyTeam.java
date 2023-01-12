/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.n;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$AbstractNumberBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$Parameter;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam$HandleCallbackCountAlly;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam$HandleCallbackCountEnemies;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader$LogicBooleanContext;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.l;

public final class LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam
extends LogicBoolean$AbstractNumberBoolean {
    public g _withTag;
    @LogicBoolean$Parameter
    public float withinRange = -1.0f;
    public float withinRangeSq = -1.0f;
    @LogicBoolean$Parameter
    public boolean incompleteBuildings;
    @LogicBoolean$Parameter
    public boolean factoryQueue;
    @LogicBoolean$Parameter
    public boolean ally;
    public static final LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam$HandleCallbackCountEnemies handleCallbackCountEnemies = new LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam$HandleCallbackCountEnemies();
    public static final LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam$HandleCallbackCountAlly handleCallbackCountAlly = new LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam$HandleCallbackCountAlly();

    @LogicBoolean$Parameter
    public void withTag(String string2) {
        this._withTag = g.c(string2);
    }

    @Override
    public void validate(String string2, String string3, String string4, LogicBooleanLoader$LogicBooleanContext logicBooleanLoader$LogicBooleanContext, boolean bl2) {
        super.validate(string2, string3, string4, logicBooleanLoader$LogicBooleanContext, bl2);
        if (this.withinRange > 1000.0f) {
            throw new BooleanParseException("For CPU reasons withinRange argument cannot be over 1000 (but unlimited range is fine) in function:" + string2);
        }
        if (this.withinRange > 0.0f) {
            this.withinRangeSq = this.withinRange * this.withinRange;
            if (this.factoryQueue) {
                throw new BooleanParseException("'factoryQueue' and 'withinRange' are not supported at the same time in function:" + string2);
            }
        }
    }

    @Override
    public String getName() {
        return "Enemy Unit count of " + this._withTag + (this.withinRange < 0.0f ? "" : " (within range " + this.withinRange + ")");
    }

    @Override
    public float getValue(y y2) {
        n n2 = y2.bX;
        int n3 = 0;
        n3 = !this.ally ? (n3 += n2.b(this._withTag, this.incompleteBuildings, this.factoryQueue)) : (n3 += n2.c(this._withTag, this.incompleteBuildings, this.factoryQueue));
        if (this.withinRange < 0.0f || n3 == 0) {
            return n3;
        }
        if (!this.ally) {
            LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam.handleCallbackCountEnemies.withinRangeSq = this.withinRangeSq;
            LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam.handleCallbackCountEnemies.count = 0;
            LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam.handleCallbackCountEnemies.tag = this._withTag;
            LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam.handleCallbackCountEnemies.incompleteBuildings = this.incompleteBuildings;
            l l2 = l.B();
            l2.cc.a(y2.eo, y2.ep, this.withinRange, y2, 0.0f, handleCallbackCountEnemies);
            return LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam.handleCallbackCountEnemies.count;
        }
        LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam.handleCallbackCountAlly.withinRangeSq = this.withinRangeSq;
        LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam.handleCallbackCountAlly.count = 0;
        LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam.handleCallbackCountAlly.tag = this._withTag;
        LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam.handleCallbackCountAlly.incompleteBuildings = this.incompleteBuildings;
        LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam.handleCallbackCountAlly.ally = y2.bX;
        l l3 = l.B();
        l3.cc.a(y2.eo, y2.ep, this.withinRange, y2, 0.0f, handleCallbackCountAlly);
        return LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam.handleCallbackCountAlly.count;
    }

    @Override
    public float getMaxValue(y y2) {
        return 2.14748365E9f;
    }
}

