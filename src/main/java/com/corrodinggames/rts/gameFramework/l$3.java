/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Thread
 */
package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.l;

strictfp class l$3
extends Thread {
    final /* synthetic */ l a;

    l$3(l l2) {
        this.a = l2;
    }

    public void run() {
        try {
            l$3.sleep((long)3000L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        this.a.ab();
    }
}

