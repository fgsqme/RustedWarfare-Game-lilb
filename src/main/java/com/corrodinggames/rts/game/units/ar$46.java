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
import com.corrodinggames.rts.game.units.f;

final class ar$46
extends ar {
    @Override
    public boolean A() {
        return true;
    }

    @Override
    public boolean C() {
        return true;
    }

    @Override
    public am a(boolean bl2) {
        f f2 = new f(bl2);
        f2.q = true;
        return f2;
    }

    @Override
    public void b() {
        com.corrodinggames.rts.game.units.f.d_();
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

