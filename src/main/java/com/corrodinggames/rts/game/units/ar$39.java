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
import com.corrodinggames.rts.game.units.u;

final class ar$39
extends ar {
    @Override
    public boolean C() {
        return true;
    }

    @Override
    public am a(boolean bl2) {
        u u2 = new u(bl2);
        return u2;
    }

    @Override
    public void b() {
        com.corrodinggames.rts.game.units.u.f();
    }

    @Override
    public int c() {
        return 1000;
    }

    @Override
    public float D() {
        return 6.0E-4f;
    }
}

