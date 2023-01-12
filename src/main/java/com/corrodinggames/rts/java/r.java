/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Thread
 */
package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.java.o;
import com.corrodinggames.rts.java.p;

public class r
extends Thread {
    final /* synthetic */ o a;

    public r(o o2) {
        this.a = o2;
    }

    public void run() {
        l.aq();
        try {
            while (true) {
                p p2 = (p)this.a.b.take();
                p2.a();
                this.a.c.a(p2);
            }
        }
        catch (InterruptedException interruptedException) {
            return;
        }
    }
}

