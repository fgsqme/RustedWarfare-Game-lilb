/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$AmmoBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$AmmoIncludingQueuedBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$BuiltAmountBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$CompletedBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$CustomTimerBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$EnergyBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$EnergyIncludingQueuedBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$GameMapHeightBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$GameMapWidthBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$GameModeBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$HasActiveWaypoint;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$HasFlagDynamicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$HasParent;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$HasResourcesBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$HasTakenDamage;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$HeightBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$HeightValueBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$HpBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$InMapBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$IsAttackingBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$IsControlledByAI;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$IsOnTeam;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$IsResourceLargerThan;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$IsReversingBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$KillsBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$LastConvertedBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$MaxEnergyBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$MaxHpBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$MaxMoveSpeedBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$MaxShieldBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$MovingBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$NumberOfAttachedUnitsBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$NumberOfConnectionsBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$NumberOfQueuedWaypoints;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$NumberOfUnitsInTeam;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$OverCliftBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$OverLiquidBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$OverPassableTileBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$OverWaterBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$PositionXBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$PositionYBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$PriceCreditsBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$QueueSize;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$ResourceCountBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$RotationBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$ShieldBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$SpeedBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$SpeedValueBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$TagsBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$TeamDefeatedTechBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$TeamIdBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$TeamTagBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$TeamVictoryBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$TeamWipedOutBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$ThisActionRepeatedCount;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$TimeAliveBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$TouchWaterBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$TransportingCountBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$TransportingUnitWithTagsBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$UnitIdBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$isEnergyRechargingBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanGameFunctions$isTransportUnloading;

public class LogicBooleanGameFunctions {
    static void addBooleanType(LogicBoolean logicBoolean, String ... stringArray) {
        LogicBoolean.addBooleanType(logicBoolean, stringArray);
    }

    static void loadTypes() {
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$HeightBoolean().with("underwater=true"), "self.underwater", "self.isUnderwater");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$HeightBoolean().with("ground=true"), "self.gound", "self.ground", "self.isAtGroundHeight");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$HeightValueBoolean(), "self.height", "self.z");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$HeightBoolean().with("flying=true"), "self.flying", "self.isFlying");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$MovingBoolean(), "self.isMoving");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$HasActiveWaypoint(), "self.hasActiveWaypoint");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$NumberOfQueuedWaypoints(), "self.numberOfQueuedWaypoints");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$SpeedValueBoolean(), "self.speed");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$SpeedBoolean().with("atTopSpeed=true"), "self.maxspeed", "self.isAtTopSpeed");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$InMapBoolean(), "self.isInMap");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$TouchWaterBoolean(), "self.inwater", "self.isInWater");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$OverWaterBoolean(), "self.overwater", "self.isOverwater");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$OverLiquidBoolean(), "self.isOverLiquid");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$OverCliftBoolean(), "self.isOverClift", "self.isOverCliff");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$OverPassableTileBoolean(), "self.isOverPassableTile");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$OverPassableTileBoolean().with("type='LAND'").createLocked(), "self.isOverOpenLand");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$TagsBoolean(), "self.tags", "self.hasTags");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$TeamTagBoolean(), "self.globalTeamTags", "self.hasGlobalTeamTags");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$HasFlagDynamicBoolean(), "self.hasFlag");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$EnergyBoolean(), "self.energy");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$EnergyIncludingQueuedBoolean(), "self.energyIncludingQueued");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$EnergyBoolean().with("full=true"), "self.isEnergyFull");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$EnergyBoolean().with("empty=true"), "self.isEnergyEmpty");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$TransportingCountBoolean(), "self.transportingCount");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$TransportingUnitWithTagsBoolean(), "self.transportingUnitWithTags");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$isTransportUnloading(), "self.isTransportUnloading");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$PriceCreditsBoolean(), "self.priceCredits");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$HpBoolean(), "self.hp");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$MaxHpBoolean(), "self.maxHp");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$MaxShieldBoolean(), "self.maxShield");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$MaxEnergyBoolean(), "self.maxEnergy");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$UnitIdBoolean(), "self.id");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$TeamIdBoolean(), "self.teamId");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$TeamDefeatedTechBoolean(), "self.teamDefeatedTech");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$TeamWipedOutBoolean(), "self.teamWipedOut");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$TeamVictoryBoolean(), "self.teamVictory");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$isEnergyRechargingBoolean(), "self.isEnergyRecharging");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$PositionXBoolean(), "self.x");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$PositionYBoolean(), "self.y");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$RotationBoolean(), "self.dir");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$MaxMoveSpeedBoolean(), "self.maxMoveSpeed");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$BuiltAmountBoolean(), "self.builtAmount");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$CompletedBoolean(), "self.completed");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$ShieldBoolean(), "self.shield");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$AmmoBoolean(), "self.ammo");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$AmmoBoolean().with("empty=true"), "self.isAmmoEmpty");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$AmmoIncludingQueuedBoolean(), "self.ammoIncludingQueued");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$ResourceCountBoolean(), "self.resource");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$QueueSize(), "self.queueSize");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$NumberOfConnectionsBoolean(), "self.numberOfConnections");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$NumberOfAttachedUnitsBoolean(), "self.numberOfAttachedUnits");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$HasParent(), "self.hasParent");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$HasResourcesBoolean(), "self.hasResources");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$IsResourceLargerThan(), "self.isResourceLargerThan");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$KillsBoolean(), "self.kills");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$TimeAliveBoolean(), "self.timeAlive");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$LastConvertedBoolean(), "self.lastConverted");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$CustomTimerBoolean(), "self.customTimer");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$HasTakenDamage(), "self.hasTakenDamage");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$IsAttackingBoolean(), "self.isAttacking");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$IsReversingBoolean(), "self.isReversing");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$IsOnTeam().with("team=-1").createLocked(), "self.isOnNeutralTeam");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$IsControlledByAI(), "self.isControlledByAI");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$NumberOfUnitsInTeam(), "numberOfUnitsInTeam", "self.numberOfUnitsInTeam");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$NumberOfUnitsInTeam().with("greaterThan=0, lessThan=-1"), "hasUnitInTeam", "self.hasUnitInTeam");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$NumberOfUnitsInTeam().with("greaterThan=-1, lessThan=1"), "noUnitInTeam", "self.noUnitInTeam");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$NumberOfUnitsInTeam().with("neutralTeam=true"), "numberOfUnitsInNeutralTeam", "self.numberOfUnitsInNeutralTeam");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$NumberOfUnitsInTeam().with("aggressiveTeam=true"), "numberOfUnitsInAggressiveTeam", "self.numberOfUnitsInAggressiveTeam");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$NumberOfUnitsInTeam().with("allTeams=true"), "numberOfUnitsInAllTeams", "self.numberOfUnitsInAllTeams");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam().with("ally=false"), "numberOfUnitsInEnemyTeam", "self.numberOfUnitsInEnemyTeam");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam().with("ally=true"), "numberOfUnitsInAllyTeam", "self.numberOfUnitsInAllyTeam", "numberOfUnitsInAllyNotOwnTeam", "self.numberOfUnitsInAllyNotOwnTeam");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$GameModeBoolean().with("nukesEnabled=true").createLocked(), "game.nukesEnabled");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$GameMapWidthBoolean(), "game.mapWidth");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$GameMapHeightBoolean(), "game.mapHeight");
        LogicBooleanGameFunctions.addBooleanType(new LogicBooleanGameFunctions$ThisActionRepeatedCount(), "thisActionIndex", "index");
    }
}

