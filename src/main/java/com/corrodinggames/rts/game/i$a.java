/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Thread
 */
package com.corrodinggames.rts.game;

import com.corrodinggames.rts.game.i;

strictfp class i$a
extends Thread {
    final /* synthetic */ i a;

    i$a(i i2) {
        this.a = i2;
    }

    public void run() {
        this.a.bX.b("gotoNextLevel");
    }
}

