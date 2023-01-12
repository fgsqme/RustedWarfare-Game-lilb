/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.a.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.a.a;
import com.corrodinggames.rts.game.units.custom.a.d;
import com.corrodinggames.rts.game.units.custom.af;
import com.corrodinggames.rts.game.units.custom.h;
import com.corrodinggames.rts.game.units.custom.j;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$MemoryWriter;
import com.corrodinggames.rts.gameFramework.utility.ab;

public class i
extends a {
    VariableScope$MemoryWriter a;
    LogicBoolean b;
    h c;

    public static void a(l l2, ab ab2, String string2, String string3, d d2, String string4, boolean bl2) {
        LogicBoolean logicBoolean = ab2.b(l2, string2, string3 + "sendMessageTo", null);
        VariableScope$MemoryWriter variableScope$MemoryWriter = null;
        String string5 = ab2.b(string2, string3 + "sendMessageWithData", (String)null);
        if (string5 != null) {
            variableScope$MemoryWriter = VariableScope.createGenericKeyValueWriter(string5, l2, string2, string3 + "sendMessageWithData");
        }
        h h2 = ab2.a(l2, string2, string3 + "sendMessageWithTags", (h)null);
        if (logicBoolean != null) {
            i i2 = new i();
            i2.b = logicBoolean;
            i2.a = variableScope$MemoryWriter;
            i2.c = h2;
            d2.ac.add(i2);
        }
    }

    @Override
    public boolean a(j j2, s s2, PointF pointF, am am2, int n2) {
        am am3;
        if (this.b != null && (am3 = this.b.readUnit(j2)) != null) {
            VariableScope variableScope = null;
            if (this.a != null) {
                variableScope = new VariableScope();
                this.a.writeToMemory(variableScope, j2);
            }
            am3.a(af.q, j2, this.c, variableScope);
        }
        return true;
    }
}

