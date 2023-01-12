/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Thread
 */
package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.j;

class k
extends Thread {
    boolean a = true;

    k() {
    }

    public void run() {
        while (this.a) {
            try {
                Thread.sleep((long)1000L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            j.b();
        }
    }
}

