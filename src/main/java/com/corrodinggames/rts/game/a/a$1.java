/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.a;

import com.corrodinggames.rts.game.a.a;
import com.corrodinggames.rts.game.a.d;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.as;

class a$1
extends d {
    final /* synthetic */ a a;

    a$1(a a2, String string2) {
        this.a = a2;
        super(a2, string2);
    }

    @Override
    public boolean a(as as2) {
        return com.corrodinggames.rts.game.a.a.a(this.a, as2) && this.a(as2, ao.b);
    }
}

