/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Thread
 */
package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.am;

class au
extends Thread {
    final /* synthetic */ am a;

    au(am am2) {
        this.a = am2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        while (true) {
            float f2 = 1.0f;
            Object object = this.a.c;
            synchronized (object) {
                this.a.g = true;
                if (!this.a.f) {
                    try {
                        this.a.c.wait((long)am.a.e());
                    }
                    catch (InterruptedException interruptedException) {
                        // empty catch block
                    }
                }
                this.a.f = false;
                f2 = this.a.d;
            }
            object = this.a.b;
            synchronized (object) {
                if (!this.a.b(f2)) {
                    return;
                }
            }
        }
    }
}

