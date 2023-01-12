/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 */
package com.corrodinggames.rts.gameFramework.utility;

import java.io.Serializable;

class b
implements Serializable {
    private final String a;
    private final StackTraceElement[] b;

    private b(String string2, StackTraceElement[] stackTraceElementArray) {
        this.a = string2;
        this.b = stackTraceElementArray;
    }

    static /* synthetic */ String a(b b2) {
        return b2.a;
    }

    static /* synthetic */ StackTraceElement[] b(b b2) {
        return b2.b;
    }
}

