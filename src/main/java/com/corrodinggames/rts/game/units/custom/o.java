/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.Iterator
 */
package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.f;
import com.corrodinggames.rts.game.units.custom.l;
import java.util.Iterator;

public strictfp class o {
    String a;
    f b;
    final /* synthetic */ l c;

    public o(l l2) {
        this.c = l2;
    }

    public void a() {
        if (this.a != null && this.b() == null) {
            throw new RuntimeException("Failed to find animation:" + this.a);
        }
    }

    public f b() {
        if (this.a == null) {
            return null;
        }
        if (this.b != null) {
            return this.b;
        }
        Iterator iterator = this.c.dr.iterator();
        while (iterator.hasNext()) {
            f f2 = (f)iterator.next();
            if (!f2.a.equalsIgnoreCase(this.a)) continue;
            this.b = f2;
            return f2;
        }
        return null;
    }
}

