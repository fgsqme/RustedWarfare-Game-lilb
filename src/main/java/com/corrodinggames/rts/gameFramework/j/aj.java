/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.corrodinggames.rts.gameFramework.j;

public strictfp class aj {
    String a;
    long b;
    String c;

    public String a() {
        if (this.c != null) {
            return this.c;
        }
        return "Active ban";
    }

    public float b() {
        long l2 = System.currentTimeMillis();
        return (float)(this.b - l2) / 1000.0f;
    }
}

