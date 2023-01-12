/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 */
package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.utility.ah;

final class ag$1
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ah b;

    ag$1(String string2, ah ah2) {
        this.a = string2;
        this.b = ah2;
    }

    public void run() {
        try {
            Thread.sleep((long)1500L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        l.e("Running delayed close of zip: " + this.a);
        this.b.a();
    }
}

