/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.util.Comparator
 */
package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.d.b;
import java.util.Comparator;

strictfp final class h$15
implements Comparator {
    h$15() {
    }

    public int a(as as2, as as3) {
        Boolean bl2;
        Boolean bl3;
        Boolean bl4;
        am am2 = am.c(as2);
        am am3 = am.c(as3);
        Boolean bl5 = am2.bP();
        int n2 = bl5.compareTo(bl4 = Boolean.valueOf((boolean)am3.bP()));
        if (n2 != 0) {
            return n2;
        }
        Boolean bl6 = as2.j();
        n2 = bl6.compareTo(bl3 = Boolean.valueOf((boolean)as3.j()));
        if (n2 != 0) {
            return n2;
        }
        Boolean bl7 = am2.bO();
        n2 = bl7.compareTo(bl2 = Boolean.valueOf((boolean)am3.bO()));
        if (n2 != 0) {
            return n2;
        }
        b b2 = as2.u();
        b b3 = as3.u();
        b b4 = as2.B();
        b b5 = as3.B();
        if (b4 != null) {
            b2 = b.a(b2, b4);
        }
        if (b5 != null) {
            b3 = b.a(b3, b5);
        }
        if ((n2 = b2.a(b3)) != 0) {
            return n2;
        }
        return 0;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((as)object, (as)object2);
    }
}

