/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.utility.d;

class d$3
implements Runnable {
    final /* synthetic */ d a;

    d$3(d d2) {
        this.a = d2;
    }

    public void run() {
        d.a(this.a, (d.a(this.a) + 1) % Integer.MAX_VALUE);
    }
}

