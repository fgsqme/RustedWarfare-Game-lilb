/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.Semaphore
 */
package com.corrodinggames.rts.java;

import android.os.Looper;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.java.Main;
import java.util.concurrent.Semaphore;

class Main$2
implements Runnable {
    final /* synthetic */ Semaphore a;
    final /* synthetic */ Main b;

    Main$2(Main main, Semaphore semaphore) {
        this.b = main;
        this.a = semaphore;
    }

    public void run() {
        l.aq();
        Looper.a();
        this.a.release(1);
        Looper.c();
    }
}

