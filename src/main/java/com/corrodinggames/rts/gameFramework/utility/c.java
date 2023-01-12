/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.utility.b;

class c
extends Throwable {
    final /* synthetic */ b a;

    private c(b b2, c c2) {
        this.a = b2;
        super(b.a(b2), (Throwable)c2);
    }

    public Throwable fillInStackTrace() {
        this.setStackTrace(b.b(this.a));
        return this;
    }
}

