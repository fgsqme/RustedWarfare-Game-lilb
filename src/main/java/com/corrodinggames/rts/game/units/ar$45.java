/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.ArrayList
 */
package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.d.e;
import java.util.ArrayList;

final class ar$45
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
        return new e(bl2);
    }

    @Override
    public void b() {
        com.corrodinggames.rts.game.units.d.e.b();
    }

    @Override
    public int c() {
        return 3000;
    }

    @Override
    public float D() {
        return 5.0E-4f;
    }

    @Override
    public void a(ArrayList arrayList, int n2) {
        com.corrodinggames.rts.game.units.d.e.a(arrayList, n2);
    }
}

