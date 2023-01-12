/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package a.a.a;

import a.a.a.h;
import java.io.IOException;

public class g
extends h {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    protected g() {
    }

    public g(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11) {
        this.a(-128, n2, 22);
        this.a = 1;
        this.b = n3;
        this.c = 1;
        this.d = n4;
        this.e = n5;
        this.f = n6;
        this.g = n7;
        this.h = n8;
        this.i = n9;
        this.j = n10;
        this.k = n11;
    }

    @Override
    public String a() {
        return "SYN";
    }

    public int c() {
        return this.b;
    }

    public int e() {
        return this.d;
    }

    public int f() {
        return this.e;
    }

    public int g() {
        return this.f;
    }

    public int h() {
        return this.g;
    }

    public int i() {
        return this.h;
    }

    public int j() {
        return this.i;
    }

    public int k() {
        return this.j;
    }

    public int l() {
        return this.k;
    }

    @Override
    public byte[] d() {
        byte[] byArray = super.d();
        byArray[4] = (byte)(this.a << 4 & 0xFF);
        byArray[5] = (byte)(this.b & 0xFF);
        byArray[6] = (byte)(this.c & 0xFF);
        byArray[7] = 0;
        byArray[8] = (byte)(this.d >>> 8 & 0xFF);
        byArray[9] = (byte)(this.d >>> 0 & 0xFF);
        byArray[10] = (byte)(this.e >>> 8 & 0xFF);
        byArray[11] = (byte)(this.e >>> 0 & 0xFF);
        byArray[12] = (byte)(this.f >>> 8 & 0xFF);
        byArray[13] = (byte)(this.f >>> 0 & 0xFF);
        byArray[14] = (byte)(this.g >>> 8 & 0xFF);
        byArray[15] = (byte)(this.g >>> 0 & 0xFF);
        byArray[16] = (byte)(this.h & 0xFF);
        byArray[17] = (byte)(this.i & 0xFF);
        byArray[18] = (byte)(this.j & 0xFF);
        byArray[19] = (byte)(this.k & 0xFF);
        return byArray;
    }

    @Override
    protected void a(byte[] byArray, int n2, int n3) {
        super.a(byArray, n2, n3);
        if (n3 < 22) {
            throw new IOException("Invalid SYN segment");
        }
        this.a = (byArray[n2 + 4] & 0xFF) >>> 4;
        if (this.a != 1) {
            throw new IOException("Invalid RUDP version:" + this.a);
        }
        this.b = byArray[n2 + 5] & 0xFF;
        this.c = byArray[n2 + 6] & 0xFF;
        this.d = (byArray[n2 + 8] & 0xFF) << 8 | (byArray[n2 + 9] & 0xFF) << 0;
        this.e = (byArray[n2 + 10] & 0xFF) << 8 | (byArray[n2 + 11] & 0xFF) << 0;
        this.f = (byArray[n2 + 12] & 0xFF) << 8 | (byArray[n2 + 13] & 0xFF) << 0;
        this.g = (byArray[n2 + 14] & 0xFF) << 8 | (byArray[n2 + 15] & 0xFF) << 0;
        this.h = byArray[n2 + 16] & 0xFF;
        this.i = byArray[n2 + 17] & 0xFF;
        this.j = byArray[n2 + 18] & 0xFF;
        this.k = byArray[n2 + 19] & 0xFF;
    }
}

