/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.f;

import com.corrodinggames.rts.game.units.custom.bo;

public class e {
    public static void a(String string2) {
        String string3 = string2;
        if (string3.length() == 0) {
            throw new bo("name cannot be empty");
        }
        if (string3.contains((CharSequence)" ") || string3.contains((CharSequence)"}") || string3.contains((CharSequence)"$") || string3.contains((CharSequence)".") || string3.contains((CharSequence)"{") || string3.contains((CharSequence)"-") || string3.contains((CharSequence)"+") || string3.contains((CharSequence)":") || string3.contains((CharSequence)"(")) {
            throw new bo("invalid character in name");
        }
        if (Character.isDigit((char)string3.charAt(0))) {
            throw new bo("name cannot start with a digit");
        }
    }
}

