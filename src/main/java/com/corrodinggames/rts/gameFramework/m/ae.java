/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 */
package com.corrodinggames.rts.gameFramework.m;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.e.a;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.j;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.m.af;
import com.corrodinggames.rts.gameFramework.m.e;
import java.io.IOException;
import java.util.Arrays;

public class ae {
    public String c;
    public String d = "";
    public String e;
    public String f;
    public int g;
    public int h;
    String i;
    String j;
    long k;
    long l;
    public boolean m;
    public int n;
    public int o;
    public af[] p = new af[0];
    public Object q;
    public int r;
    int s;

    public void a(String string2, float f2) {
        this.a(string2).a(f2);
    }

    public void a(String string2, float f2, float f3) {
        this.a(string2).a(f2, f3);
    }

    public void a(String string2, int n2) {
        float f2 = (float)(n2 >> 16 & 0xFF) * 0.003921569f;
        float f3 = (float)(n2 >> 8 & 0xFF) * 0.003921569f;
        float f4 = (float)(n2 & 0xFF) * 0.003921569f;
        float f5 = (float)(n2 >>> 24) * 0.003921569f;
        this.a(string2).a(f2, f3, f4, f5);
    }

    public void a(String string2, e e2) {
        af af2 = this.a(string2);
        af2.a(e2);
    }

    public void b(String string2, e e2) {
        af af2 = this.a(string2);
        af2.b(e2);
    }

    public af a(String string2) {
        for (af af2 : this.p) {
            if (!af2.a.equals((Object)string2)) continue;
            return af2;
        }
        af af3 = new af();
        af3.a = string2;
        af[] afArray = (af[])Arrays.copyOf((Object[])this.p, (int)(this.p.length + 1));
        afArray[afArray.length - 1] = af3;
        this.p = afArray;
        return af3;
    }

    public ae(String string2) {
        String string3 = "assets/shaders/plain.vert";
        if (com.corrodinggames.rts.gameFramework.l.aY) {
            string3 = "assets/shaders/plainGDX.vert";
        }
        this.a(string3, string2);
    }

    public void a(String string2, String string3) {
        this.c = com.corrodinggames.rts.gameFramework.f.g(string3);
        this.i = string2;
        this.j = string3;
        this.d();
        this.e();
    }

    public ae() {
        this.c = "Invalid";
        this.o = 1;
    }

    public void d() {
        com.corrodinggames.rts.gameFramework.utility.j j2 = a.k(this.i);
        if (j2 == null) {
            throw new IOException("Cannot find: " + this.i);
        }
        this.e = com.corrodinggames.rts.gameFramework.f.a(j2);
        com.corrodinggames.rts.gameFramework.utility.j j3 = a.k(this.j);
        if (j3 == null) {
            throw new IOException("Cannot find: " + this.j);
        }
        this.f = com.corrodinggames.rts.gameFramework.f.a(j3);
    }

    public void b(String string2) {
        com.corrodinggames.rts.gameFramework.l.e("shader(" + this.c + "): " + string2);
    }

    public void c(String string2) {
        if (this.r < 3) {
            ++this.r;
            com.corrodinggames.rts.gameFramework.l.p("shader(" + this.c + "): " + string2);
        }
        com.corrodinggames.rts.gameFramework.l.a("shader(" + this.c + "): " + string2);
        this.o = 1;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public boolean a(Paint paint, e e2) {
        return false;
    }

    public boolean e() {
        long l2 = com.corrodinggames.rts.gameFramework.j.a(this.i, false);
        long l3 = com.corrodinggames.rts.gameFramework.j.a(this.j, false);
        boolean bl2 = l2 != this.k || l3 != this.l;
        this.k = l2;
        this.l = l3;
        return bl2;
    }

    public void f() {
        ++this.s;
        if (this.s < 100) {
            return;
        }
        this.s = 0;
        if (this.e()) {
            this.b("Reloading shader");
            try {
                this.d();
                this.m = true;
                this.o = 0;
                for (af af2 : this.p) {
                    af2.c = true;
                    af2.b = -1;
                }
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }

    public void c() {
        l l2 = com.corrodinggames.rts.gameFramework.l.B();
        l2.bO.a(this);
    }
}

