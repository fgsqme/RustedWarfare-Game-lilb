/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 */
package com.corrodinggames.rts.gameFramework.n;

import com.corrodinggames.rts.gameFramework.n.a;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

public class b {
    m a = new m();
    boolean b;

    public void a(a a2) {
        this.a.add(a2);
    }

    public boolean a() {
        return this.a.a > 0;
    }

    public boolean b() {
        boolean bl2 = false;
        boolean bl3 = true;
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            a a2 = (a)iterator.next();
            if (a2.j) {
                bl2 = true;
                continue;
            }
            bl3 = false;
        }
        if (this.b && !bl3) {
            bl2 = false;
        }
        return bl2;
    }
}

