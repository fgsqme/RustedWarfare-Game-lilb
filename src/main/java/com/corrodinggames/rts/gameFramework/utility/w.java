/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.OutputStream
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.corrodinggames.rts.gameFramework.utility;

import java.io.OutputStream;

public class w
extends OutputStream {
    public byte[] a;
    protected int b;

    public w() {
        this.a = new byte[32];
    }

    public w(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("size < 0");
        }
        this.a = new byte[n2];
    }

    public void close() {
        super.close();
    }

    private void a(int n2) {
        if (this.b + n2 <= this.a.length) {
            return;
        }
        byte[] byArray = new byte[(this.b + n2) * 2];
        System.arraycopy((Object)this.a, (int)0, (Object)byArray, (int)0, (int)this.b);
        this.a = byArray;
    }

    public synchronized void a() {
        this.b = 0;
    }

    public int b() {
        return this.b;
    }

    public String toString() {
        return new String(this.a, 0, this.b);
    }

    public static void a(int n2, int n3, int n4) {
        if ((n3 | n4) < 0 || n3 > n2 || n2 - n3 < n4) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public synchronized void write(byte[] byArray, int n2, int n3) {
        w.a(byArray.length, n2, n3);
        if (n3 == 0) {
            return;
        }
        this.a(n3);
        System.arraycopy((Object)byArray, (int)n2, (Object)this.a, (int)this.b, (int)n3);
        this.b += n3;
    }

    public synchronized void write(int n2) {
        if (this.b == this.a.length) {
            this.a(1);
        }
        this.a[this.b++] = (byte)n2;
    }
}

