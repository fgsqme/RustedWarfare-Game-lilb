/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.al;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;

final class ar$20
extends ar {
    @Override
    public boolean C() {
        return true;
    }

    @Override
    public am a(boolean bl2) {
        return new al(bl2);
    }

    @Override
    public void b() {
        al.b();
    }

    @Override
    public int c() {
        return 0;
    }

    @Override
    public float D() {
        return 0.0025f;
    }
}

