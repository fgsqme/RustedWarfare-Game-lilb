/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.corrodinggames.librocket;

import com.corrodinggames.librocket.a$2;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.rts.gameFramework.l;

class a$2$2
implements Runnable {
    final /* synthetic */ Root a;
    final /* synthetic */ a$2 b;

    a$2$2(a$2 a$2, Root root) {
        this.b = a$2;
        this.a = root;
    }

    public void run() {
        if (this.b.a.a) {
            l.b("AskPasswordCallBack already called");
            return;
        }
        this.b.a.a = true;
        this.a.closeAlertOnly();
        this.b.c.a();
    }
}

