/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 */
package a.a.a;

import a.a.a.h;

public class b
extends h {
    private byte[] a;

    protected b() {
    }

    public b(int n2, int n3, byte[] byArray, int n4, int n5) {
        this.a(64, n2, 6);
        this.a(n3);
        this.a = new byte[n5];
        System.arraycopy((Object)byArray, (int)n4, (Object)this.a, (int)0, (int)n5);
    }

    @Override
    public int b() {
        return this.a.length + super.b();
    }

    @Override
    public String a() {
        return "DAT";
    }

    public byte[] c() {
        return this.a;
    }

    @Override
    public byte[] d() {
        byte[] byArray = super.d();
        System.arraycopy((Object)this.a, (int)0, (Object)byArray, (int)6, (int)this.a.length);
        return byArray;
    }

    @Override
    public void a(byte[] byArray, int n2, int n3) {
        super.a(byArray, n2, n3);
        this.a = new byte[n3 - 6];
        System.arraycopy((Object)byArray, (int)(n2 + 6), (Object)this.a, (int)0, (int)this.a.length);
    }
}

