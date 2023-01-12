/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.j.c;
import com.corrodinggames.rts.java.Main;

class Main$4
implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ c d;
    final /* synthetic */ Main e;

    Main$4(Main main, int n2, String string2, String string3, c c2) {
        this.e = main;
        this.a = n2;
        this.b = string2;
        this.c = string3;
        this.d = c2;
    }

    public void run() {
        this.e.p.c.getRoot().receiveChatMessage(this.a, this.b, this.c, this.d);
    }
}

