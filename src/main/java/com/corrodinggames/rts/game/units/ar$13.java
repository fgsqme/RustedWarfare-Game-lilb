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
import com.corrodinggames.rts.game.units.c.a;

final class ar$13
extends ar {
    @Override
    public boolean C() {
        return true;
    }

    @Override
    public am a(boolean bl2) {
        return new a(bl2);
    }

    @Override
    public void b() {
        com.corrodinggames.rts.game.units.c.a.f();
    }

    @Override
    public int c() {
        return 400;
    }

    @Override
    public float D() {
        return 0.004f;
    }
}

