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
import com.corrodinggames.rts.game.units.e.g;

final class ar$2
extends ar {
    @Override
    public boolean C() {
        return true;
    }

    @Override
    public am a(boolean bl2) {
        return new g(bl2);
    }

    @Override
    public void b() {
        com.corrodinggames.rts.game.units.e.g.f();
    }

    @Override
    public int c() {
        return 450;
    }

    @Override
    public float D() {
        return 0.002f;
    }
}

