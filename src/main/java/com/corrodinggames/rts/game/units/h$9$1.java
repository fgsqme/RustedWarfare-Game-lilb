/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.h;
import com.corrodinggames.rts.game.units.h$9;
import com.corrodinggames.rts.game.units.n;
import com.corrodinggames.rts.gameFramework.f.g;
import com.corrodinggames.rts.gameFramework.j.ae;
import com.corrodinggames.rts.gameFramework.l;

class h$9$1
extends ae {
    final /* synthetic */ h.9 a;

    h$9$1(h.9 var1_1) {
        this.a = var1_1;
    }

    @Override
    public void a(String string2) {
        l.e("Searching for: " + string2);
        l l2 = l.B();
        if (l2.cb.i()) {
            l2.c("Reply active", "Changing search filter is currently not supported while recording a replay");
            return;
        }
        h h2 = h.L();
        if (h2 == null) {
            l.e("search: No editor");
            return;
        }
        if (string2 == null || string2.trim().equals((Object)"")) {
            l.e("search: No text entered");
            if (h2.G == n.e) {
                h2.G = n.a;
            }
            h2.H = null;
            h2.I = true;
            com.corrodinggames.rts.gameFramework.f.g.K();
            return;
        }
        h2.G = n.e;
        h2.H = string2;
        h2.I = true;
        com.corrodinggames.rts.gameFramework.f.g.K();
    }

    @Override
    public strictfp void a() {
    }
}

