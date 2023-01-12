/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.Iterator
 *  java.util.Locale
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$ReturnType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableDefinition;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableName;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.utility.ab;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;
import java.util.Locale;

public class VariableScope$VariableMapping {
    l meta;
    m mapping = new m();

    public VariableScope$VariableDefinition create(String string2, LogicBoolean$ReturnType logicBoolean$ReturnType) {
        VariableScope$VariableName variableScope$VariableName = VariableScope$VariableName.get(string2);
        VariableScope$VariableDefinition variableScope$VariableDefinition = this.get(variableScope$VariableName);
        if (variableScope$VariableDefinition != null) {
            throw new RuntimeException("A variable already exists with the name: " + string2);
        }
        VariableScope$VariableDefinition variableScope$VariableDefinition2 = new VariableScope$VariableDefinition();
        variableScope$VariableDefinition2.name = variableScope$VariableName;
        variableScope$VariableDefinition2.type = logicBoolean$ReturnType;
        this.mapping.add(variableScope$VariableDefinition2);
        return variableScope$VariableDefinition2;
    }

    public VariableScope$VariableDefinition get(String string2) {
        string2 = string2.toLowerCase(Locale.ROOT).trim();
        VariableScope$VariableName variableScope$VariableName = VariableScope$VariableName.get(string2);
        Iterator iterator = this.mapping.iterator();
        while (iterator.hasNext()) {
            VariableScope$VariableDefinition variableScope$VariableDefinition = (VariableScope$VariableDefinition)iterator.next();
            if (variableScope$VariableDefinition.name != variableScope$VariableName) continue;
            return variableScope$VariableDefinition;
        }
        return null;
    }

    public VariableScope$VariableDefinition get(VariableScope$VariableName variableScope$VariableName) {
        Iterator iterator = this.mapping.iterator();
        while (iterator.hasNext()) {
            VariableScope$VariableDefinition variableScope$VariableDefinition = (VariableScope$VariableDefinition)iterator.next();
            if (variableScope$VariableDefinition.name != variableScope$VariableName) continue;
            return variableScope$VariableDefinition;
        }
        return null;
    }

    public boolean hasArrays() {
        Iterator iterator = this.mapping.iterator();
        while (iterator.hasNext()) {
            VariableScope$VariableDefinition variableScope$VariableDefinition = (VariableScope$VariableDefinition)iterator.next();
            if (!LogicBoolean$ReturnType.isArrayType(variableScope$VariableDefinition.type)) continue;
            return true;
        }
        return false;
    }

    public String getListOfPossibleNames() {
        String string2 = null;
        Iterator iterator = this.mapping.iterator();
        while (iterator.hasNext()) {
            VariableScope$VariableDefinition variableScope$VariableDefinition = (VariableScope$VariableDefinition)iterator.next();
            if (string2 == null) {
                string2 = "" + variableScope$VariableDefinition.name;
                continue;
            }
            string2 = string2 + ", " + variableScope$VariableDefinition.name;
        }
        return string2;
    }

    public void addDefineKey(ab ab2, l l2, String string2, String string3, String string4) {
        String string5 = ab2.b(string3, string4, (String)null);
        if (string5 != null && !string5.equals((Object)"")) {
            throw new RuntimeException("[" + string3 + "]" + string2 + ": Unexpected format");
        }
        this.defineVariablesRaw(string2, string3, string4);
    }

    public void addDefineValue(l l2, String string2, String string3, String string4) {
        this.defineVariablesRaw(string3, string2, string4);
    }

    public void defineVariables(l l2, String string2) {
        this.defineVariablesRaw("define", "", string2);
    }

    public void addSingleDefine(l l2, String string2, String string3, String string4, String string5) {
        String string6 = string3.trim().toLowerCase(Locale.ROOT);
        string2 = string2.toLowerCase(Locale.ROOT).trim();
        LogicBoolean$ReturnType logicBoolean$ReturnType = VariableScope.getUserType(string6);
        if (logicBoolean$ReturnType == null) {
            throw new RuntimeException("[" + string4 + "]" + string5 + ": Unknown type: " + string6);
        }
        this.checkNameReserved(string2, string4, string5);
        VariableScope$VariableDefinition variableScope$VariableDefinition = this.get(string2);
        if (variableScope$VariableDefinition != null) {
            if (variableScope$VariableDefinition.type == logicBoolean$ReturnType) {
                return;
            }
            throw new RuntimeException("[" + string4 + "]" + string5 + ": A memory variable already exists with the name: " + string2 + " and is a different type: " + variableScope$VariableDefinition.type.name());
        }
        this.create(string2, logicBoolean$ReturnType);
    }

    public void defineVariablesRaw(String string2, String string3, String string4) {
        String[] stringArray;
        for (String string5 : stringArray = f.c(string4, ',')) {
            if ((string5 = string5.trim()).equals((Object)"")) continue;
            int n2 = string5.indexOf(" ");
            if (n2 == -1) {
                throw new RuntimeException("[" + string3 + "]" + string2 + ": Expected 'type name' in each section, got: " + string5);
            }
            String string6 = string5.substring(0, n2).toLowerCase(Locale.ROOT).trim();
            String string7 = string5.substring(n2, string5.length()).toLowerCase(Locale.ROOT).trim();
            this.addSingleDefine(this.meta, string7, string6, string3, string2);
        }
    }

    public void checkNameReserved(String string2, String string3, String string4) {
        boolean bl2 = false;
        if (string2.equals((Object)"")) {
            bl2 = true;
        }
        if (string2.equals((Object)"game") || string2.equals((Object)"parent") || string2.equals((Object)"self") || string2.equals((Object)"this")) {
            bl2 = true;
        }
        if (string2.equals((Object)"boolean") || string2.equals((Object)"bool") || string2.equals((Object)"unit") || string2.equals((Object)"void") || string2.equals((Object)"null") || string2.equals((Object)"number") || string2.equals((Object)"float")) {
            bl2 = true;
        }
        if (bl2) {
            throw new RuntimeException("[" + string3 + "]" + string4 + ": Variable cannot be named: '" + string2 + "'");
        }
        if (string2.contains((CharSequence)".") || string2.contains((CharSequence)"=") || string2.contains((CharSequence)"(") || string2.contains((CharSequence)")") || string2.contains((CharSequence)"'") || string2.contains((CharSequence)"\"") || string2.contains((CharSequence)"?") || string2.contains((CharSequence)"|") || string2.contains((CharSequence)"\\") || string2.contains((CharSequence)"/") || string2.contains((CharSequence)"[") || string2.contains((CharSequence)"]") || string2.contains((CharSequence)":") || string2.contains((CharSequence)";")) {
            throw new RuntimeException("[" + string3 + "]" + string4 + ": Variable name has reserved symbols: '" + string2 + "'");
        }
        if (string2.contains((CharSequence)" ")) {
            throw new RuntimeException("[" + string3 + "]" + string4 + ": Variable name cannot have a space: '" + string2 + "'");
        }
    }
}

