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

final class ar$50
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
        return new b(bl2);
    }

    @Override
    public void b() {
        com.corrodinggames.rts.game.units.d.a.b.dB();
    }

    @Override
    public int c() {
        return 500;
    }

    @Override
    public float D() {
        return 6.0E-4f;
    }
}

