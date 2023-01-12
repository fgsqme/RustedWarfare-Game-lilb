/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.aq;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.f;

public class an
extends aq {
    an(LogicBoolean logicBoolean) {
        super(logicBoolean);
    }

    @Override
    String a(y y2) {
        return f.g(this.a.readNumber(y2));
    }
}

