/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.corrodinggames.librocket;

import com.corrodinggames.librocket.a$2;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.rts.gameFramework.l;

class a$2$1
implements Runnable {
    final /* synthetic */ Root a;
    final /* synthetic */ a$2 b;

    a$2$1(a$2 var1_1, Root root) {
        this.b = var1_1;
        this.a = root;
    }

    public void run() {
        if (this.b.a.a) {
            l.b("AskPasswordCallBack already called");
            return;
        }
        this.b.a.a = true;
        String string2 = this.a.getPopupText();
        this.a.closeAlertOnly();
        this.b.c.a(string2);
    }
}

