/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.d.a.b;

final class ar$43
extends ar {
    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean C() {
        return true;
    }

    @Override
    public am a(boolean bl2) {
        b b2 = new b(bl2);
        ((am)b2).a_("gunT3");
        return b2;
    }

    @Override
    public void b() {
    }

    @Override
    public int c() {
        return ar.f.c() + com.corrodinggames.rts.game.units.d.a.b.dL.c() + com.corrodinggames.rts.game.units.d.a.b.dM.c();
    }

    @Override
    public float D() {
        return 3.0E-4f;
    }
}

