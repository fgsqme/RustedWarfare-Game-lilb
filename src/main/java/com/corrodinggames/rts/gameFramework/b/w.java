/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.System
 */
package com.corrodinggames.rts.gameFramework.b;

public class w {
    private int[] a;
    private int b;

    public void a(int n2) {
        if (this.a.length == this.b) {
            int[] nArray = new int[this.b + this.b];
            System.arraycopy((Object)this.a, (int)0, (Object)nArray, (int)0, (int)this.b);
            this.a = nArray;
        }
        this.a[this.b++] = n2;
    }
}

