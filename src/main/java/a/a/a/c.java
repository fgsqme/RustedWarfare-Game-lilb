/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package a.a.a;

import a.a.a.a;

public class c
extends a {
    private int[] a;

    protected c() {
    }

    public c(int n2, int n3, int[] nArray) {
        this.a(32, n2, 6 + nArray.length);
        this.a(n3);
        this.a = nArray;
    }

    @Override
    public String a() {
        return "EAK";
    }

    public int[] c() {
        return this.a;
    }

    @Override
    public byte[] d() {
        byte[] byArray = super.d();
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            byArray[4 + i2] = (byte)(this.a[i2] & 0xFF);
        }
        return byArray;
    }

    @Override
    protected void a(byte[] byArray, int n2, int n3) {
        super.a(byArray, n2, n3);
        this.a = new int[n3 - 6];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = byArray[n2 + 4 + i2] & 0xFF;
        }
    }
}

