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
import com.corrodinggames.rts.game.units.d.c;

final class ar$24
extends ar {
    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean C() {
        return false;
    }

    @Override
    public am a(boolean bl2) {
        return new c(bl2);
    }

    @Override
    public void b() {
        com.corrodinggames.rts.game.units.d.c.b();
    }

    @Override
    public int c() {
        return 15000;
    }

    @Override
    public float D() {
        return 7.0E-4f;
    }
}

