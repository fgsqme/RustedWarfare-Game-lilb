/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package com.corrodinggames.rts.game.units.f;

import com.corrodinggames.rts.game.units.am;

public final class b {
    public static final am[] a = new am[0];
    public int b;
    transient am[] c = a;

    public boolean a(am am2) {
        int n2 = this.b;
        am[] amArray = this.c;
        if (n2 == amArray.length) {
            am[] amArray2 = new am[n2 + (n2 < 6 ? 12 : n2 >> 1)];
            System.arraycopy((Object)amArray, (int)0, (Object)amArray2, (int)0, (int)n2);
            amArray = amArray2;
            this.c = amArray2;
        }
        amArray[n2] = am2;
        this.b = n2 + 1;
        return true;
    }

    public boolean b(am am2) {
        am[] amArray = this.c;
        int n2 = this.b;
        if (am2 != null) {
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!am2.equals(amArray[i2])) continue;
                System.arraycopy((Object)amArray, (int)(i2 + 1), (Object)amArray, (int)i2, (int)(--n2 - i2));
                amArray[n2] = null;
                this.b = n2;
                return true;
            }
        } else {
            for (int i3 = 0; i3 < n2; ++i3) {
                if (amArray[i3] != null) continue;
                System.arraycopy((Object)amArray, (int)(i3 + 1), (Object)amArray, (int)i3, (int)(--n2 - i3));
                amArray[n2] = null;
                this.b = n2;
                return true;
            }
        }
        return false;
    }

    public final am[] a() {
        return this.c;
    }
}

