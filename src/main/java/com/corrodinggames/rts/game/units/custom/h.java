/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.g;

public final class h {
    public final g[] a;

    public h(g[] gArray) {
        this.a = gArray;
    }

    public boolean a() {
        return this.a.length == 0;
    }

    public boolean a(h h2) {
        if (h2 == null) {
            return this.a();
        }
        if (this.a.length != h2.a.length) {
            return false;
        }
        for (g g2 : this.a) {
            boolean bl2 = false;
            for (g g3 : h2.a) {
                if (g2 != g3) continue;
                bl2 = true;
                break;
            }
            if (bl2) continue;
            return false;
        }
        return true;
    }

    public int b() {
        return this.a.length;
    }

    public String toString() {
        String string2 = "";
        boolean bl2 = true;
        for (g g2 : this.a) {
            if (!bl2) {
                string2 = string2 + ", ";
            }
            bl2 = false;
            string2 = string2 + g2.a;
        }
        return "{" + string2 + "}";
    }
}

