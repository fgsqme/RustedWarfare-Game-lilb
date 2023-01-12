/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Locale
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$ReturnType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader$LogicBooleanContext;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$ActiveWaypointTargetReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$AttachmentUnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$AttackingReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$ChainedUnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$EventSourceReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$FirstUnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$GetAsMarker;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$GetOffsetAbsolute;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$GetOffsetRelative;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$LastDamagedByUnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$Memory1UnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$Memory2UnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$NearestUnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$NullUnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$ParentUnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$SelfUnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$ThisActionTargetReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$TransportingUnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$UnitContextChangingBooleanByLogic;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$UnitContextChangingContext;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference$UnitReferenceOrUnitType;
import com.corrodinggames.rts.game.units.custom.v;
import com.corrodinggames.rts.game.units.t;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.utility.ab;
import com.corrodinggames.rts.gameFramework.utility.al;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public abstract class UnitReference
extends LogicBoolean
implements Cloneable {
    public static final UnitReference$SelfUnitReference selfUnitReference = new UnitReference$SelfUnitReference();
    static HashMap referenceTypes = new HashMap();
    static final LogicBooleanLoader$LogicBooleanContext unitContextChangingContext;
    static final LogicBooleanLoader$LogicBooleanContext placeholderUnitContext;

    public final am get(am am2) {
        if (!(am2 instanceof y)) {
            return null;
        }
        return this.getSingleRaw((y)am2);
    }

    public final am get(y y2) {
        return this.getSingleRaw(y2);
    }

    public final am getRealUnitOnly(y y2) {
        am am2 = this.getSingleRaw(y2);
        if (am2 instanceof t) {
            return null;
        }
        return am2;
    }

    public abstract am getSingleRaw(y var1);

    @Override
    public void forMeta(l l2) {
    }

    static void addUnitReferenceType(UnitReference unitReference, String ... stringArray) {
        for (String string2 : stringArray) {
            string2 = string2.toLowerCase(Locale.ROOT);
            referenceTypes.put((Object)string2, (Object)unitReference);
            String string3 = string2.replace((CharSequence)"self.", (CharSequence)"subject.");
            if (string3.equals((Object)string2)) continue;
        }
    }

    public static UnitReference$UnitReferenceOrUnitType parseUnitTypeOrReferenceFromConf(l l2, ab ab2, String string2, String string3, UnitReference$UnitReferenceOrUnitType unitReference$UnitReferenceOrUnitType) {
        String string4 = ab2.b(string2, string3, (String)null);
        return UnitReference.parseUnitTypeOrReference(l2, string4, string2, string3, unitReference$UnitReferenceOrUnitType);
    }

    public static UnitReference$UnitReferenceOrUnitType parseUnitTypeOrReference(l l2, String string2, String string3, String string4, UnitReference$UnitReferenceOrUnitType unitReference$UnitReferenceOrUnitType) {
        if (string2 == null) {
            return unitReference$UnitReferenceOrUnitType;
        }
        if ("".equals((Object)(string2 = string2.trim())) || "NONE".equalsIgnoreCase(string2)) {
            return unitReference$UnitReferenceOrUnitType;
        }
        if (string2.toLowerCase(Locale.ROOT).startsWith("unitref ")) {
            UnitReference unitReference = UnitReference.parseUnitReference(l2, string2, string3, string4, null, true);
            return new UnitReference$UnitReferenceOrUnitType(unitReference);
        }
        v v2 = l2.a(string2, string4, string3);
        if (v2 != null) {
            v2.f = true;
        }
        return new UnitReference$UnitReferenceOrUnitType(v2);
    }

    public static UnitReference parseUnitReferenceFromConf(l l2, ab ab2, String string2, String string3, UnitReference unitReference) {
        String string4 = ab2.b(string2, string3, (String)null);
        return UnitReference.parseUnitReference(l2, string4, string2, string3, unitReference, false);
    }

    public static UnitReference parseUnitReference(l l2, String string2, String string3, String string4, UnitReference unitReference, boolean bl2) {
        if (string2 == null) {
            return unitReference;
        }
        if ("".equals((Object)(string2 = string2.trim())) || "NONE".equalsIgnoreCase(string2)) {
            return unitReference;
        }
        if ((string2 = string2.toLowerCase(Locale.ROOT)).startsWith("unitref ")) {
            string2 = string2.substring("unitref ".length());
            string2 = string2.trim();
        }
        if (string2.equals((Object)"self")) {
            return selfUnitReference;
        }
        int n2 = string2.indexOf("(");
        if (n2 == -1) {
            n2 = string2.length();
        } else if (string2.indexOf(")") != string2.length() - 1) {
            throw new bo("[" + string3 + "]" + string4 + " UnitReference: Unexpected format for: '" + string2 + "'");
        }
        try {
            UnitReference unitReference2 = UnitReference.parseSingleUnitReferenceBlock(l2, string2);
            if (unitReference2 == null) {
                throw new RuntimeException("Unknown function:'" + string2 + "'");
            }
            return unitReference2;
        }
        catch (RuntimeException runtimeException) {
            throw new RuntimeException("[" + string3 + "]" + string4 + " UnitReference error: " + runtimeException.getMessage() + ", [parsing: '" + string2 + "']", (Throwable)runtimeException);
        }
    }

    public static UnitReference parseSingleUnitReferenceElement(l l2, String string2) {
        String string3 = string2.split("\\(")[0];
        UnitReference unitReference = (UnitReference)referenceTypes.get((Object)(string3 = string3.trim().toLowerCase(Locale.ROOT)));
        if (unitReference == null) {
            return null;
        }
        String string4 = string2.substring(string3.length());
        if ((string4 = string4.trim()).equals((Object)"")) {
            string4 = "()";
        }
        if (!string4.startsWith("(") || !string4.endsWith(")")) {
            throw new RuntimeException("Failed to parse unit reference arguments for:'" + string2 + "'");
        }
        string4 = string4.substring(1, string4.length() - 1);
        string4 = string4.trim();
        UnitReference unitReference2 = unitReference.with(l2, string4, string3);
        if (unitReference2 instanceof UnitReference$NullUnitReference) {
            // empty if block
        }
        return unitReference2;
    }

    public static UnitReference parseSingleUnitReferenceBlock(l l2, String string2) {
        int n2 = al.b(string2);
        if (n2 != 0) {
            if (n2 > 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + string2 + "'. A '(' was not closed.");
            }
            if (n2 < 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + string2 + "'. Too many ')'.");
            }
        }
        string2 = string2.trim();
        string2 = LogicBooleanLoader.breakOuterLayerBrackets(string2);
        String[] stringArray = al.b(string2, ".", false);
        ArrayList arrayList = new ArrayList();
        boolean bl2 = false;
        for (int i2 = 0; i2 < stringArray.length; ++i2) {
            String string3 = stringArray[i2];
            if (string3.equalsIgnoreCase("self")) {
                bl2 = true;
                continue;
            }
            UnitReference unitReference = UnitReference.parseSingleUnitReferenceElement(l2, string3);
            if (unitReference == null) {
                throw new RuntimeException("Unknown unit reference:'" + string3 + "'");
            }
            arrayList.add((Object)unitReference);
        }
        if (arrayList.size() == 0) {
            if (bl2) {
                return selfUnitReference;
            }
            throw new RuntimeException("Unexpected unit reference:'" + string2 + "'");
        }
        if (arrayList.size() == 1) {
            return (UnitReference)arrayList.get(0);
        }
        UnitReference[] unitReferenceArray = (UnitReference[])arrayList.toArray((Object[])new UnitReference[0]);
        return new UnitReference$ChainedUnitReference(unitReferenceArray);
    }

    @Override
    public UnitReference with(String string2) {
        return this.with(null, string2, null);
    }

    @Override
    public UnitReference with(l l2, String string2, String string3) {
        UnitReference unitReference;
        try {
            unitReference = (UnitReference)this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException((Throwable)cloneNotSupportedException);
        }
        unitReference.forMeta(l2);
        unitReference.setArgumentsRaw(string2, l2, string3);
        return unitReference;
    }

    @Override
    public boolean read(y y2) {
        return false;
    }

    @Override
    public am readUnit(y y2) {
        return this.getSingleRaw(y2);
    }

    @Override
    public LogicBoolean$ReturnType getReturnType() {
        return LogicBoolean$ReturnType.unit;
    }

    public String getClassDebugName() {
        return "<unit reference>";
    }

    @Override
    public String getMatchFailReasonForPlayer(y y2) {
        return this.getClassDebugName() + "(" + am.A(this.getSingleRaw(y2)) + ")";
    }

    @Override
    public LogicBooleanLoader$LogicBooleanContext createContext() {
        return unitContextChangingContext;
    }

    @Override
    public LogicBoolean setChild(LogicBoolean logicBoolean) {
        UnitReference$UnitContextChangingBooleanByLogic unitReference$UnitContextChangingBooleanByLogic = UnitReference$UnitContextChangingBooleanByLogic.create(this, logicBoolean);
        return unitReference$UnitContextChangingBooleanByLogic;
    }

    static {
        UnitReference.addUnitReferenceType(new UnitReference$AttachmentUnitReference(), "attachment");
        UnitReference.addUnitReferenceType(new UnitReference$ParentUnitReference(), "parent");
        UnitReference.addUnitReferenceType(new UnitReference$TransportingUnitReference(), "transporting");
        UnitReference.addUnitReferenceType(new UnitReference$ActiveWaypointTargetReference(), "activeWaypointTarget");
        UnitReference.addUnitReferenceType(new UnitReference$AttackingReference(), "attacking");
        UnitReference.addUnitReferenceType(new UnitReference$Memory1UnitReference(), "customTarget1");
        UnitReference.addUnitReferenceType(new UnitReference$Memory2UnitReference(), "customTarget2");
        UnitReference.addUnitReferenceType(new UnitReference$LastDamagedByUnitReference(), "lastDamagedBy");
        UnitReference.addUnitReferenceType(new UnitReference$NearestUnitReference(), "nearestUnit");
        UnitReference.addUnitReferenceType(new UnitReference$FirstUnitReference(), "globalSearchForFirstUnit");
        UnitReference.addUnitReferenceType(new UnitReference$NullUnitReference(), "nullUnit");
        UnitReference.addUnitReferenceType(new UnitReference$NullUnitReference(), "null");
        UnitReference.addUnitReferenceType(new UnitReference$GetOffsetAbsolute(), "getOffsetAbsolute");
        UnitReference.addUnitReferenceType(new UnitReference$GetOffsetRelative(), "getOffsetRelative");
        UnitReference.addUnitReferenceType(new UnitReference$GetAsMarker(), "getAsMarker");
        UnitReference.addUnitReferenceType(new UnitReference$ThisActionTargetReference(), "thisActionTarget");
        UnitReference.addUnitReferenceType(new UnitReference$EventSourceReference(), "eventSource");
        unitContextChangingContext = new UnitReference$UnitContextChangingContext();
        placeholderUnitContext = new UnitReference$UnitContextChangingContext();
    }
}

