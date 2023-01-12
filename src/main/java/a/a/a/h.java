/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 */
package a.a.a;

import a.a.a.a;
import a.a.a.b;
import a.a.a.c;
import a.a.a.d;
import a.a.a.e;
import a.a.a.f;
import a.a.a.g;
import java.io.IOException;

public abstract class h {
    private int a;
    private int b;
    private int c;
    private int d = -1;
    private int e = 0;

    protected h() {
    }

    public abstract String a();

    public int m() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public void a(int n2) {
        this.a |= 0x40;
        this.d = n2;
    }

    public int n() {
        if ((this.a & 0x40) == 64) {
            return this.d;
        }
        return -1;
    }

    public int o() {
        return this.e;
    }

    public void b(int n2) {
        this.e = n2;
    }

    public byte[] d() {
        byte[] byArray = new byte[this.b()];
        byArray[0] = (byte)(this.a & 0xFF);
        byArray[1] = (byte)(this.b & 0xFF);
        byArray[2] = (byte)(this.c & 0xFF);
        byArray[3] = (byte)(this.d & 0xFF);
        return byArray;
    }

    public String toString() {
        return this.a() + " [ SEQ = " + this.m() + ", ACK = " + (this.n() >= 0 ? "" + this.n() : "N/A") + ", LEN = " + this.b() + " ]";
    }

    public static h b(byte[] byArray, int n2, int n3) {
        h h2 = null;
        if (n3 < 6) {
            throw new IOException("Invalid segment:" + n3);
        }
        byte by = byArray[n2];
        if ((by & 0xFFFFFF80) != 0) {
            h2 = new g();
        } else if ((by & 8) != 0) {
            h2 = new e();
        } else if ((by & 0x20) != 0) {
            h2 = new c();
        } else if ((by & 0x10) != 0) {
            h2 = new f();
        } else if ((by & 2) != 0) {
            h2 = new d();
        } else if ((by & 0x40) != 0) {
            h2 = n3 == 6 ? new a() : new b();
        }
        if (h2 == null) {
            throw new IOException("Invalid segment");
        }
        ((h)h2).a(byArray, n2, n3);
        return h2;
    }

    protected void a(int n2, int n3, int n4) {
        this.a = n2;
        this.c = n3;
        this.b = n4;
    }

    protected void a(byte[] byArray, int n2, int n3) {
        this.a = byArray[n2] & 0xFF;
        this.b = byArray[n2 + 1] & 0xFF;
        this.c = byArray[n2 + 2] & 0xFF;
        this.d = byArray[n2 + 3] & 0xFF;
    }
}

