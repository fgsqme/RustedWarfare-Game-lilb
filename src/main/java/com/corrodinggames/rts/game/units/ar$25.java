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
import com.corrodinggames.rts.game.units.e.l;

final class ar$25
extends ar {
    @Override
    public boolean C() {
        return false;
    }

    @Override
    public am a(boolean bl2) {
        return new l(bl2);
    }

    @Override
    public void b() {
        com.corrodinggames.rts.game.units.e.l.f();
    }

    @Override
    public int c() {
        return 3900;
    }

    @Override
    public float D() {
        return 9.0E-4f;
    }

    @Override
    public int g() {
        return 3;
    }
}

