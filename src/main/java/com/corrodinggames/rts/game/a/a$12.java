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

class a$12
extends d {
    final /* synthetic */ a a;

    a$12(a a2, String string2) {
        this.a = a2;
        super(a2, string2);
    }

    @Override
    public boolean a(as as2) {
        return this.a.bw.a(as2) && as2.o() != ao.d;
    }
}

