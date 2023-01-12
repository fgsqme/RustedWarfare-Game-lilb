/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.Iterator
 */
package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

public strictfp class q {
    m a = new m();

    public void a(Runnable runnable) {
        this.a.add(runnable);
    }

    public void a() {
        if (this.a.a > 0) {
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                Runnable runnable = (Runnable)iterator.next();
                runnable.run();
            }
        }
    }

    public void b() {
        if (this.a.a > 0) {
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                Runnable runnable = (Runnable)iterator.next();
                runnable.run();
            }
            this.a.clear();
        }
    }
}

