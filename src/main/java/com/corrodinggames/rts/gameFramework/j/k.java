/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayInputStream
 *  java.io.DataInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.LinkedList
 */
package com.corrodinggames.rts.gameFramework.j;

import android.graphics.PointF;
import com.corrodinggames.rts.game.n;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.j.ad;
import com.corrodinggames.rts.gameFramework.j.au;
import com.corrodinggames.rts.gameFramework.j.m;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.w;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

public strictfp class k {
    ByteArrayInputStream a;
    private DataInputStream e;
    private DataInputStream f;
    private LinkedList g = new LinkedList();
    int b = 999999;
    int c = 999999;
    int d = 0;

    void a() {
        this.f = this.e;
    }

    public k(au au2) {
        this.a = new ByteArrayInputStream(au2.c);
        this.e = new DataInputStream((InputStream)this.a);
        this.a();
    }

    public k(DataInputStream dataInputStream) {
        this.e = dataInputStream;
        this.a();
    }

    public k(String string2) {
        this.a = new ByteArrayInputStream(string2.getBytes());
        this.e = new DataInputStream((InputStream)this.a);
        this.a();
    }

    public k(byte[] byArray) {
        this.a = new ByteArrayInputStream(byArray);
        this.e = new DataInputStream((InputStream)this.a);
        this.a();
    }

    public void a(int n2) {
        this.b = n2;
    }

    public int b() {
        return this.b;
    }

    public void b(int n2) {
        this.c = n2;
    }

    public int c() {
        return this.c;
    }

    public byte d() {
        return this.f.readByte();
    }

    public boolean e() {
        return this.f.readBoolean();
    }

    public int f() {
        return this.f.readInt();
    }

    public float g() {
        return this.f.readFloat();
    }

    public double h() {
        return this.f.readDouble();
    }

    public long i() {
        return this.f.readLong();
    }

    public String j() {
        if (!this.e()) {
            return null;
        }
        return this.l();
    }

    public Integer k() {
        if (!this.e()) {
            return null;
        }
        return this.f();
    }

    public String l() {
        String string2 = this.f.readUTF();
        return string2;
    }

    public g m() {
        String string2 = this.f.readUTF();
        if (string2.equals((Object)"")) {
            return null;
        }
        return com.corrodinggames.rts.game.units.custom.g.c(string2);
    }

    public long n() {
        long l2 = this.f.readLong();
        return l2;
    }

    public w a(Class clazz) {
        long l2 = this.f.readLong();
        return w.a(l2, clazz, false);
    }

    public void a(com.corrodinggames.rts.gameFramework.utility.m m2, Class clazz) {
        int n2 = this.f();
        for (int i2 = 0; i2 < n2; ++i2) {
            w w2 = this.a(clazz);
            if (w2 == null) continue;
            m2.add(w2);
        }
    }

    public am o() {
        return this.a(m.b);
    }

    public am a(m m2) {
        long l2 = this.f.readLong();
        boolean bl2 = m2 == m.a;
        return w.a(l2, bl2);
    }

    public y p() {
        long l2 = this.f.readLong();
        return w.b(l2, false);
    }

    public Enum b(Class clazz) {
        int n2 = this.f.readInt();
        if (n2 == -1) {
            return null;
        }
        Object[] objectArray = clazz.getEnumConstants();
        if (n2 < 0 || n2 >= objectArray.length) {
            ad.g("readEnum:" + n2 + " is out of range for " + clazz.toString());
            return null;
        }
        return (Enum)objectArray[n2];
    }

    public as q() {
        int n2 = this.f.readInt();
        if (n2 == -1) {
            return null;
        }
        if (n2 == -2) {
            as as2;
            String string2 = this.l();
            com.corrodinggames.rts.game.units.custom.l l2 = com.corrodinggames.rts.game.units.custom.l.n(string2);
            if (l2 == null) {
                ad.g("readUnitType: Could not find customUnitMetadata:" + string2);
            }
            if ((as2 = com.corrodinggames.rts.game.units.custom.l.c(l2)) != null) {
                if (as2 instanceof com.corrodinggames.rts.game.units.custom.l) {
                    l2 = (com.corrodinggames.rts.game.units.custom.l)as2;
                } else {
                    l.b("replacement not a custom unit:" + as2.i());
                }
            }
            return l2;
        }
        Object[] objectArray = ar.class.getEnumConstants();
        if (n2 < 0 || n2 >= objectArray.length) {
            ad.g("readUnitType:" + n2 + " is out of range for UnitType");
            return null;
        }
        return (ar)objectArray[n2];
    }

    public n r() {
        byte by = this.f.readByte();
        n n2 = n.k(by);
        if (n2 == null) {
            throw new IOException("Error loading save data, could not find referenced team:" + by + "");
        }
        return n2;
    }

    public n s() {
        byte by = this.f.readByte();
        return n.k(by);
    }

    public byte[] t() {
        int n2;
        int n3 = this.f();
        byte[] byArray = new byte[n3];
        for (int i2 = 0; i2 < n3 && (n2 = this.f.read(byArray, i2, n3 - i2)) != -1; i2 += n2) {
        }
        return byArray;
    }

    public k u() {
        byte[] byArray = this.t();
        return new k(byArray);
    }

    public short v() {
        return this.f.readShort();
    }

    public void a(String string2) {
        short s2 = this.v();
        if (s2 != 12345) {
            ad.g("Mark wasn't read for:" + string2);
            if (l.B().aa()) {
                throw new RuntimeException("Mark wasn't read for:" + string2);
            }
        }
    }

    public InputStream w() {
        return this.f;
    }

    public void b(String string2) {
        this.a(string2, false);
    }

    public String x() {
        return this.a(false, false);
    }

    public void a(String string2, boolean bl2) {
        this.a(string2, bl2, false);
    }

    public void a(String string2, boolean bl2, boolean bl3) {
        if (this.b < 11) {
            l.e("Skipping start block:" + string2);
            return;
        }
        String string3 = this.a(bl2, bl3);
        if (!string3.equals((Object)string2)) {
            l.b("InputNetStream:endBlock", "Name does not match: expected:" + string2 + " , got:" + string3);
        }
    }

    public byte[] c(String string2) {
        String string3 = this.f.readUTF();
        if (!string3.equals((Object)string2)) {
            l.b("getBlockRaw", "Name does not match: expected:" + string2 + " , got:" + string3);
        }
        byte[] byArray = this.t();
        return byArray;
    }

    public String a(boolean bl2, boolean bl3) {
        if (this.b < 11) {
            l.e("Skipping start block: startBlockAndGetName()");
            return "<skipped>";
        }
        String string2 = this.f.readUTF();
        byte[] byArray = this.t();
        com.corrodinggames.rts.gameFramework.j.l l2 = new com.corrodinggames.rts.gameFramework.j.l(byArray, bl2, bl3);
        l2.a = string2;
        this.g.add((Object)l2);
        this.f = ((com.corrodinggames.rts.gameFramework.j.l)this.g.getLast()).c;
        return string2;
    }

    public void d(String string2) {
        if (this.b < 11) {
            l.e("Skipping end block:" + string2);
            return;
        }
        com.corrodinggames.rts.gameFramework.j.l l2 = (com.corrodinggames.rts.gameFramework.j.l)this.g.removeLast();
        if (!l2.a.equals((Object)string2)) {
            l.b("InputNetStream:endBlock", "Name does not match: expected" + string2 + " ," + l2.a);
        }
        this.f = this.g.isEmpty() ? this.e : ((com.corrodinggames.rts.gameFramework.j.l)this.g.getLast()).c;
    }

    public PointF y() {
        if (!this.e()) {
            return null;
        }
        PointF pointF = new PointF();
        pointF.a = this.g();
        pointF.b = this.g();
        return pointF;
    }
}

