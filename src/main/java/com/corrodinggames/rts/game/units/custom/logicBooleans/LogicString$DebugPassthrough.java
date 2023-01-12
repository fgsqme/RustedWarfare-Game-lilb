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
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$ReturnType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString$WrappingLogicString;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.j.ad;
import com.corrodinggames.rts.gameFramework.l;

public class LogicString$DebugPassthrough
extends LogicString$WrappingLogicString {
    public void addMessage(y y2) {
        l l2 = l.B();
        if (l2.bv && l2.bl) {
            String string2 = "";
            if (y2 != null) {
                string2 = y2.r().i() + "(" + y2.eh + ") ";
            }
            String string3 = string2 + "DebugPassthrough: " + this.children[0].getMatchFailReasonForPlayer(y2);
            ad.a(null, string3);
        }
    }

    @Override
    public LogicBoolean$ReturnType getReturnType() {
        return this.children[0].getReturnType();
    }

    @Override
    public boolean read(y y2) {
        this.addMessage(y2);
        return this.children[0].read(y2);
    }

    @Override
    public float readNumber(y y2) {
        this.addMessage(y2);
        return this.children[0].readNumber(y2);
    }

    @Override
    public String readString(y y2) {
        this.addMessage(y2);
        return this.children[0].readString(y2);
    }

    @Override
    public am readUnit(y y2) {
        this.addMessage(y2);
        return this.children[0].readUnit(y2);
    }
}

