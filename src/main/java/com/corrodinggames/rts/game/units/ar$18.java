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
import com.corrodinggames.rts.game.units.d.p;

final class ar$18
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
        return new p(bl2);
    }

    @Override
    public void b() {
        com.corrodinggames.rts.game.units.d.p.b();
    }

    @Override
    public int c() {
        return 1200;
    }

    @Override
    public int c(int n2) {
        if (n2 == 2) {
            return 2000;
        }
        return 0;
    }

    @Override
    public float D() {
        return 0.001f;
    }
}

