/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Thread
 */
package com.corrodinggames.rts.a.a;

import com.corrodinggames.rts.a.a.l;

public class b
extends l {
    public void a() {
        this.b();
    }

    public void b() {
        com.corrodinggames.rts.gameFramework.l.e("networkSocks");
        com.corrodinggames.rts.gameFramework.l l2 = com.corrodinggames.rts.gameFramework.l.B();
        for (int i2 = 0; i2 < 10000; ++i2) {
            l2.bX.b(false);
            try {
                Thread.sleep((long)50L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            l2.bX.b("test");
        }
        com.corrodinggames.rts.gameFramework.l.e("done");
        try {
            Thread.sleep((long)100000L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}

