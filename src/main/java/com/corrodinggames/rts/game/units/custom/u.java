/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 */
package com.corrodinggames.rts.game.units.custom;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.a.w;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.j;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.gameFramework.j.ad;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

public strictfp class u {
    m a = new m();
    m b;
    String c;
    String d;

    public void a(l l2) {
    }

    public void b(l l2) {
        m m2 = new m();
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            String string2 = (String)iterator.next();
            s s2 = l2.h(string2);
            if (s2 == null) {
                throw new bo("[" + this.d + "]" + this.c + " Could not find action:" + string2 + " on unit: " + l2.b());
            }
            if (s2 instanceof w) {
                m2.add((w)s2);
                continue;
            }
            throw new bo("[" + this.d + "]" + this.c + " Action:" + string2 + " on unit: " + l2.b() + " doesn't have the right type");
        }
        this.b = m2;
    }

    public void a(j j2, PointF pointF, am am2, int n2, int n3) {
        if (this.b == null) {
            ad.g("Action on " + j2.dt().i() + " has not been linked");
            return;
        }
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            s s2 = (s)iterator.next();
            j2.a(s2, pointF, am2, n2, n3);
        }
    }

    public m a() {
        if (this.b == null) {
            ad.g("Action on [" + this.d + "]" + this.c + " has not been linked");
            return new m();
        }
        return this.b;
    }

    public void a(j j2, PointF pointF, am am2) {
        if (this.b == null) {
            ad.g("Action on " + j2.dt().i() + " has not been linked");
            return;
        }
        Iterator iterator = this.b.iterator();
        while (iterator.hasNext()) {
            s s2 = (s)iterator.next();
            j2.dL.a((w)s2, false, pointF, am2);
        }
    }
}

