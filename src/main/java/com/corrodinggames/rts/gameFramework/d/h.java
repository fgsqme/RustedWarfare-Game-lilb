/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.corrodinggames.rts.gameFramework.d;

public enum h {
    a,
    b,
    c,
    d,
    e;


    public boolean a(h h2) {
        if (h2 == null) {
            return true;
        }
        return this.ordinal() < h2.ordinal();
    }
}

