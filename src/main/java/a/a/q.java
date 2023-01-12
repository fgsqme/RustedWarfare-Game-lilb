/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.OutputStream
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.System
 */
package a.a;

import a.a.h;
import java.io.OutputStream;

class q
extends OutputStream {
    protected h a;
    protected byte[] b;
    protected int c;

    public q(h h2) {
        if (h2 == null) {
            throw new NullPointerException("sock");
        }
        this.a = h2;
        this.b = new byte[this.a.getSendBufferSize()];
        this.c = 0;
    }

    public synchronized void write(int n2) {
        if (this.c >= this.b.length) {
            this.flush();
        }
        this.b[this.c++] = (byte)(n2 & 0xFF);
    }

    public synchronized void write(byte[] byArray) {
        this.write(byArray, 0, byArray.length);
    }

    public synchronized void write(byte[] byArray, int n2, int n3) {
        int n4;
        if (byArray == null) {
            throw new NullPointerException();
        }
        if (n2 < 0 || n3 < 0 || n2 + n3 > byArray.length) {
            throw new IndexOutOfBoundsException();
        }
        for (int i2 = 0; i2 < n3; i2 += n4) {
            n4 = Math.min((int)this.b.length, (int)(n3 - i2));
            if (n4 > this.b.length - this.c) {
                this.flush();
            }
            System.arraycopy((Object)byArray, (int)(n2 + i2), (Object)this.b, (int)this.c, (int)n4);
            this.c += n4;
        }
    }

    public synchronized void flush() {
        if (this.c > 0) {
            this.a.a(this.b, 0, this.c);
            this.c = 0;
        }
    }

    public synchronized void close() {
        this.flush();
        this.a.shutdownOutput();
    }
}

