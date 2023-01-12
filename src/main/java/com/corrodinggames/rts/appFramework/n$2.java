/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.corrodinggames.rts.appFramework;

import com.corrodinggames.rts.appFramework.n;

final class n$2
implements Runnable {
    final /* synthetic */ n a;
    final /* synthetic */ String b;

    n$2(n n2, String string2) {
        this.a = n2;
        this.b = string2;
    }

    public void run() {
        this.a.b();
        if (this.b != null) {
            // empty if block
        }
    }
}

