/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Locale
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$CachedWriter$WriterElement;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$CachedWriter$WriterFactory;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.utility.al;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class VariableScope$CachedWriter {
    m writers = new m();

    public void writeToUnit(y y2) {
        Iterator iterator = this.writers.iterator();
        while (iterator.hasNext()) {
            VariableScope$CachedWriter$WriterElement variableScope$CachedWriter$WriterElement = (VariableScope$CachedWriter$WriterElement)iterator.next();
            variableScope$CachedWriter$WriterElement.writeToUnit(y2);
        }
    }

    public static VariableScope$CachedWriter create(String string2, VariableScope$CachedWriter$WriterFactory variableScope$CachedWriter$WriterFactory) {
        VariableScope$CachedWriter variableScope$CachedWriter = new VariableScope$CachedWriter();
        variableScope$CachedWriter.addWriterElements(string2, variableScope$CachedWriter$WriterFactory);
        return variableScope$CachedWriter;
    }

    public void addWriterElements(String string2, VariableScope$CachedWriter$WriterFactory variableScope$CachedWriter$WriterFactory) {
        ArrayList arrayList = al.a(string2, ",", false, false);
        for (String string3 : arrayList) {
            String string4;
            String string5;
            String[] stringArray = al.c(string3, "=");
            if (stringArray == null) {
                string5 = string3;
                string4 = null;
            } else {
                string5 = stringArray[0];
                string4 = stringArray[1];
            }
            String string6 = null;
            if (f.c(string5, "[")) {
                int n2 = string5.indexOf(91);
                int n3 = al.b(string5, "]", n2);
                if (n2 == -1 || n3 == -1) {
                    throw new bo("Unexpected array[] format for: " + string5);
                }
                string6 = string5.substring(n2 + 1, n3);
                if (string6.trim().equals((Object)"")) {
                    throw new bo("Array [] index in: " + string5 + " is empty");
                }
                String string7 = string5.substring(n3 + 1, string5.length());
                for (int i2 = 0; i2 < string7.length(); ++i2) {
                    char c2 = string7.charAt(i2);
                    if (c2 != '+' && c2 != '=' && c2 != '-' && c2 != '*' && c2 != '/' && c2 != ' ') {
                        throw new bo("Unexpected text:'" + string7 + "' after [] index of: " + string5);
                    }
                    if (c2 == '=') break;
                }
                string5 = string5.substring(0, n2) + string7;
            }
            string5 = string5.toLowerCase(Locale.ROOT).trim();
            String string8 = "=";
            if (string5.endsWith("+") || string5.endsWith("-") || string5.endsWith("*") || string5.endsWith("/")) {
                string8 = string5.substring(string5.length() - 1, string5.length()) + "=";
                string5 = string5.substring(0, string5.length() - 1).trim();
            }
            if (string5.contains((CharSequence)" ")) {
                throw new bo("Key cannot contain spaces for: " + string3);
            }
            if (string5.contains((CharSequence)"[")) {
                throw new bo("Key cannot contain [ for: " + string3);
            }
            if (string5.contains((CharSequence)"]")) {
                throw new bo("Key cannot contain ] for: " + string3);
            }
            if (string5.contains((CharSequence)"(")) {
                throw new bo("Key cannot contain ( for: " + string3);
            }
            if (string5.contains((CharSequence)")")) {
                throw new bo("Key cannot contain ) for: " + string3);
            }
            if (string5.contains((CharSequence)".")) {
                throw new bo("Key cannot contain . for: " + string3);
            }
            VariableScope$CachedWriter$WriterElement variableScope$CachedWriter$WriterElement = variableScope$CachedWriter$WriterFactory.createWriterElement(string5, string8, string4, string6);
            this.writers.add(variableScope$CachedWriter$WriterElement);
        }
    }
}

