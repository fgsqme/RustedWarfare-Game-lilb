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
import com.corrodinggames.rts.game.units.d.a.a;

final class ar$41
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
        a a2 = new a(bl2);
        a2.a(2);
        return a2;
    }

    @Override
    public void b() {
    }

    @Override
    public int c() {
        return ar.f.c() + com.corrodinggames.rts.game.units.d.a.a.e.c();
    }

    @Override
    public float D() {
        return 6.0E-4f;
    }
}

