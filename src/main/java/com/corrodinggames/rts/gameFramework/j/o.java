/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.TimerTask
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.j.n;
import java.util.TimerTask;

class o
extends TimerTask {
    int a;

    o(int n2) {
        this.a = n2;
    }

    public void run() {
        n.a(this.a, -1);
    }
}

