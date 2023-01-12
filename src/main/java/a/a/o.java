/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.System
 */
package a.a;

import a.a.h;
import java.io.InputStream;

class o
extends InputStream {
    protected h a;
    protected byte[] b;
    protected int c;
    protected int d;

    public o(h h2) {
        if (h2 == null) {
            throw new NullPointerException("sock");
        }
        this.a = h2;
        this.b = new byte[this.a.getReceiveBufferSize()];
        this.d = 0;
        this.c = 0;
    }

    public synchronized int read() {
        if (this.a() < 0) {
            return -1;
        }
        return this.b[this.c++] & 0xFF;
    }

    public synchronized int read(byte[] byArray) {
        return this.read(byArray, 0, byArray.length);
    }

    public synchronized int read(byte[] byArray, int n2, int n3) {
        if (byArray == null) {
            throw new NullPointerException();
        }
        if (n2 < 0 || n3 < 0 || n2 + n3 > byArray.length) {
            throw new IndexOutOfBoundsException();
        }
        if (this.a() < 0) {
            return -1;
        }
        int n4 = Math.min((int)this.available(), (int)n3);
        System.arraycopy((Object)this.b, (int)this.c, (Object)byArray, (int)n2, (int)n4);
        this.c += n4;
        return n4;
    }

    public synchronized int available() {
        return this.d - this.c;
    }

    public boolean markSupported() {
        return false;
    }

    public void close() {
        this.a.shutdownInput();
    }

    private int a() {
        if (this.available() == 0) {
            this.d = this.a.b(this.b, 0, this.b.length);
            this.c = 0;
        }
        return this.d;
    }
}

