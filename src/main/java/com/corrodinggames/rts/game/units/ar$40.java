/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.ai;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;

final class ar$40
extends ar {
    @Override
    public boolean C() {
        return true;
    }

    @Override
    public am a(boolean bl2) {
        ai ai2 = new ai(bl2);
        return ai2;
    }

    @Override
    public void b() {
        ai.b();
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

