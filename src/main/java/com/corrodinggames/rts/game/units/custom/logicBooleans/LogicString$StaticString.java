/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString;
import com.corrodinggames.rts.game.units.y;

public class LogicString$StaticString
extends LogicString {
    String text;

    public LogicString$StaticString(String string2) {
        this.text = string2;
    }

    @Override
    public String readString(y y2) {
        return this.text;
    }
}

