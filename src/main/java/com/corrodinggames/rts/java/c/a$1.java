/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.corrodinggames.rts.java.c;

import com.corrodinggames.librocket.e;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.java.c.a;

class a$1
implements Runnable {
    final /* synthetic */ a a;

    a$1(a a2) {
        this.a = a2;
    }

    public void run() {
        Root root = ScriptEngine.getInstance().getRoot();
        e e2 = new e("Join", this.a);
        root.showPopupWithButtons("Invite", "'" + this.a.b + "' has invited you to join a game", true, e2, null);
    }
}

