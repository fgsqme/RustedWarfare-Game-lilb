/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.ArrayList
 */
package com.corrodinggames.rts.game.units.h;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.n;
import com.corrodinggames.rts.game.units.a.m;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.a.v;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.d;
import com.corrodinggames.rts.game.units.h.f;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.m.e;
import com.corrodinggames.rts.gameFramework.utility.y;
import java.util.ArrayList;

public strictfp class b
extends f
implements d {
    static e a = null;
    static e b = null;
    static e c = null;
    static e d = null;
    static e[] e = new e[10];
    PointF[] f = new PointF[6];
    PointF[] g = new PointF[this.f.length];
    Rect h = new Rect();
    static s i = new m(false);

    @Override
    public e v() {
        if (this.bX.k == -1) {
            return null;
        }
        return com.corrodinggames.rts.game.units.e.b.h[this.bX.R()];
    }

    public ar f() {
        return com.corrodinggames.rts.game.units.ar.L;
    }

    @Override
    public PointF[] b() {
        return this.f;
    }

    @Override
    public PointF[] e_() {
        return this.g;
    }

    @Override
    public float bN() {
        return 6000.0f;
    }

    public static void t_() {
        l l2 = l.B();
        b = l2.bO.a(R$drawable.builder_ship);
        a = l2.bO.a(R$drawable.builder_ship_dead);
        c = l2.bO.a(R$drawable.builder_ship_turret);
        e = com.corrodinggames.rts.game.n.a(b);
        d = com.corrodinggames.rts.game.units.h.b.a(b, b.m(), b.l());
    }

    @Override
    public e d() {
        if (this.bV) {
            return a;
        }
        return e[this.bX.R()];
    }

    @Override
    public e d(int n2) {
        return c;
    }

    @Override
    public e k() {
        return d;
    }

    @Override
    public boolean F() {
        return l.B().bQ.renderExtraShadows && this.eq > -2.0f;
    }

    @Override
    public float G() {
        return 3.0f;
    }

    @Override
    public float H() {
        return 3.0f;
    }

    @Override
    public boolean e() {
        l l2 = l.B();
        l2.bR.b(this.eo, this.ep, this.eq);
        this.M = a;
        this.S(0);
        this.bT = false;
        return true;
    }

    public b(boolean bl2) {
        super(bl2);
        this.b(b);
        this.ck = this.cj = 13.0f;
        this.cu = this.cv = 500.0f;
        this.M = b;
        for (int i2 = 0; i2 < this.f.length; ++i2) {
            this.f[i2] = new PointF();
            this.g[i2] = new PointF();
        }
    }

    @Override
    public float m() {
        return 240.0f;
    }

    @Override
    public float z() {
        return 0.8f;
    }

    @Override
    public float A() {
        return 1.9f;
    }

    @Override
    public float B() {
        return 0.12f;
    }

    @Override
    public float c(int n2) {
        return 3.5f;
    }

    @Override
    public float w(int n2) {
        return 0.25f;
    }

    @Override
    public float C() {
        return 0.03f;
    }

    @Override
    public float D() {
        return 0.1f;
    }

    @Override
    public void a(float f2) {
        super.a(f2);
        if (!this.bV) {
            com.corrodinggames.rts.game.units.e.b.a(f2, this);
        }
    }

    @Override
    public void a(float f2, boolean bl2) {
        super.a(f2, bl2);
        if (!this.bV) {
            com.corrodinggames.rts.game.units.e.b.b(f2, this);
        }
    }

    @Override
    public boolean c(float f2) {
        float f3;
        if (!super.c(f2)) {
            return false;
        }
        l l2 = l.B();
        y.a(this);
        if (!this.bV && (f3 = this.cL[0].f / this.e(0)) != 0.0f) {
            PointF pointF = this.E(0);
            l2.bO.i();
            l2.bO.b(pointF.a - l2.cw, pointF.b - l2.cx - this.eq);
            l2.bO.a(f3, f3);
            if (this.Y()) {
                l2.bO.a(com.corrodinggames.rts.game.units.e.b.f, 0.0f, 0.0f, null);
            } else {
                l2.bO.a(com.corrodinggames.rts.game.units.e.b.e, 0.0f, 0.0f, null);
            }
            l2.bO.j();
        }
        return true;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public float g(int n2) {
        return 11.0f;
    }

    @Override
    public int bl() {
        return 1;
    }

    @Override
    public PointF G(int n2) {
        float f2 = 8.0f;
        float f3 = this.eo + com.corrodinggames.rts.gameFramework.f.k(this.cg) * f2;
        float f4 = this.ep + com.corrodinggames.rts.gameFramework.f.j(this.cg) * f2;
        bh.a(f3, f4);
        return bh;
    }

    @Override
    public float b(int n2) {
        return 120 - n2 * 28;
    }

    @Override
    public float e(int n2) {
        return 30.0f;
    }

    @Override
    public float f(int n2) {
        return 1.3f;
    }

    @Override
    public boolean a(am am2) {
        if (am2.q()) {
            return false;
        }
        return am2.bI();
    }

    @Override
    public void a(s s2, boolean bl2) {
    }

    public static void a(ArrayList arrayList, int n2) {
        arrayList.add((Object)i);
        arrayList.add((Object)new v(com.corrodinggames.rts.game.units.ar.a, 1, 1));
        arrayList.add((Object)new v(com.corrodinggames.rts.game.units.ar.f, 1, 2));
        arrayList.add((Object)new v(com.corrodinggames.rts.game.units.ar.g, 1, 3));
        arrayList.add((Object)new v(com.corrodinggames.rts.game.units.ar.b, 1, 4));
        arrayList.add((Object)new v(com.corrodinggames.rts.game.units.ar.c, 1, 5));
        arrayList.add((Object)new v(com.corrodinggames.rts.game.units.ar.d, 1, 6));
        arrayList.add((Object)new v(com.corrodinggames.rts.game.units.ar.J, 1, 7));
        arrayList.add((Object)new v(com.corrodinggames.rts.game.units.ar.y, 1, 8));
        arrayList.add((Object)new v(com.corrodinggames.rts.game.units.ar.B, 1, 9));
    }

    @Override
    public ArrayList N() {
        return this.f().a(this.V());
    }

    @Override
    public void a(am am2, int n2) {
    }

    @Override
    public int y() {
        return 145;
    }

    @Override
    public boolean g(am am2, boolean bl2) {
        return true;
    }

    @Override
    public float f(as as2) {
        int n2 = this.y();
        int n3 = as2.a(this);
        if (n3 == 0 && as2.p()) {
            n3 = 110;
        }
        return n2 += n3;
    }

    @Override
    public int u(am am2) {
        return (int)this.f(am2.r());
    }

    @Override
    public int v(am am2) {
        return (int)this.f(am2.r());
    }

    @Override
    public /* synthetic */ as r() {
        return this.f();
    }
}

