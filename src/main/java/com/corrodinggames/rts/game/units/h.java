/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 */
package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Paint$Cap;
import android.graphics.PointF;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.game.a.a;
import com.corrodinggames.rts.game.f;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.a.v;
import com.corrodinggames.rts.game.units.a.x;
import com.corrodinggames.rts.game.units.al;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.ag;
import com.corrodinggames.rts.game.units.d;
import com.corrodinggames.rts.game.units.d.q;
import com.corrodinggames.rts.game.units.e.b;
import com.corrodinggames.rts.game.units.h$1;
import com.corrodinggames.rts.game.units.h$10;
import com.corrodinggames.rts.game.units.h$11;
import com.corrodinggames.rts.game.units.h$12;
import com.corrodinggames.rts.game.units.h$13;
import com.corrodinggames.rts.game.units.h$14;
import com.corrodinggames.rts.game.units.h$15;
import com.corrodinggames.rts.game.units.h$16;
import com.corrodinggames.rts.game.units.h$17;
import com.corrodinggames.rts.game.units.h$18;
import com.corrodinggames.rts.game.units.h$19;
import com.corrodinggames.rts.game.units.h$2;
import com.corrodinggames.rts.game.units.h$20;
import com.corrodinggames.rts.game.units.h$21;
import com.corrodinggames.rts.game.units.h$22;
import com.corrodinggames.rts.game.units.h$23;
import com.corrodinggames.rts.game.units.h$3;
import com.corrodinggames.rts.game.units.h$4;
import com.corrodinggames.rts.game.units.h$5;
import com.corrodinggames.rts.game.units.h$6;
import com.corrodinggames.rts.game.units.h$7;
import com.corrodinggames.rts.game.units.h$8;
import com.corrodinggames.rts.game.units.h$9;
import com.corrodinggames.rts.game.units.i;
import com.corrodinggames.rts.game.units.j;
import com.corrodinggames.rts.game.units.k;
import com.corrodinggames.rts.game.units.l;
import com.corrodinggames.rts.game.units.m;
import com.corrodinggames.rts.game.units.n;
import com.corrodinggames.rts.game.units.o;
import com.corrodinggames.rts.game.units.p;
import com.corrodinggames.rts.game.units.r;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.a.e;
import com.corrodinggames.rts.gameFramework.w;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public strictfp class h
extends com.corrodinggames.rts.game.units.e.j
implements d {
    PointF[] a = new PointF[6];
    PointF[] b = new PointF[this.a.length];
    boolean c;
    static Paint d;
    static Paint e;
    static Paint f;
    static com.corrodinggames.rts.gameFramework.m.e g;
    static s h;
    static s i;
    static s j;
    static s k;
    static s l;
    static s m;
    static s n;
    static s o;
    static s p;
    static s q;
    String r;
    static s s;
    static s t;
    static s u;
    static s v;
    static s w;
    static s x;
    static s y;
    static s z;
    static s A;
    static s B;
    static s C;
    static ArrayList D;
    com.corrodinggames.rts.gameFramework.i.b E;
    o F;
    n G;
    String H;
    boolean I;
    String J;
    static com.corrodinggames.rts.game.units.a.b K;

    public ar f() {
        return ar.Y;
    }

    public static boolean w() {
        com.corrodinggames.rts.gameFramework.l l2 = com.corrodinggames.rts.gameFramework.l.B();
        return l2.cb.i();
    }

    @Override
    public PointF[] b() {
        return this.a;
    }

    @Override
    public PointF[] e_() {
        return this.b;
    }

    @Override
    public com.corrodinggames.rts.gameFramework.m.e v() {
        if (this.bX.k == -1) {
            return null;
        }
        return dN[this.bX.R()];
    }

    public static void K() {
        com.corrodinggames.rts.gameFramework.l l2 = com.corrodinggames.rts.gameFramework.l.B();
        g = l2.bO.a(R$drawable.icon_search);
    }

    @Override
    public boolean a(am am2) {
        return true;
    }

    @Override
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return com.corrodinggames.rts.game.units.e.b.b;
        }
        return com.corrodinggames.rts.game.units.e.b.d[this.bX.R()];
    }

    @Override
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return null;
    }

    @Override
    public com.corrodinggames.rts.gameFramework.m.e d(int n2) {
        return null;
    }

    @Override
    public boolean e() {
        com.corrodinggames.rts.gameFramework.l l2 = com.corrodinggames.rts.gameFramework.l.B();
        l2.bR.b(this.eo, this.ep, this.eq);
        this.M = com.corrodinggames.rts.game.units.e.b.b;
        this.S(0);
        this.bT = false;
        l2.bM.a(com.corrodinggames.rts.gameFramework.a.e.o, 0.8f, this.eo, this.ep);
        this.bq();
        return true;
    }

    public h(boolean bl2) {
        super(bl2);
        d = new Paint();
        d.a(40, 0, 255, 0);
        d.a(true);
        d.a(2.0f);
        d.a(Paint$Cap.b);
        e = new Paint();
        e.a(d);
        e.a(55, 255, 60, 60);
        f = new Paint();
        f.a(60, 255, 255, 255);
        this.E = null;
        this.F = com.corrodinggames.rts.game.units.o.a;
        this.G = com.corrodinggames.rts.game.units.n.a;
        this.I = true;
        this.T(20);
        this.U(20);
        this.cj = 10.0f;
        this.eo = -1000.0f;
        this.ep = -1000.0f;
        this.ck = this.cj;
        this.cu = this.cv = 170000.0f;
        this.M = com.corrodinggames.rts.game.units.e.b.b;
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = new PointF();
            this.b[i2] = new PointF();
        }
    }

    public static void a(float f2, d d2) {
        block4: {
            PointF[] pointFArray;
            PointF[] pointFArray2;
            block3: {
                y y2 = (y)((Object)d2);
                pointFArray2 = d2.b();
                pointFArray = d2.e_();
                am am2 = y2.X();
                boolean bl2 = y2.aN = am2 != null;
                if (am2 == null) break block3;
                for (int i2 = 0; i2 < pointFArray2.length; ++i2) {
                    PointF pointF = pointFArray2[i2];
                    PointF pointF2 = pointFArray[i2];
                    pointF.a = com.corrodinggames.rts.gameFramework.f.a(pointF.a, pointF2.a, 0.1f * f2);
                    pointF.b = com.corrodinggames.rts.gameFramework.f.a(pointF.b, pointF2.b, 0.1f * f2);
                    pointF.a += (pointF2.a - pointF.a) * 0.04f * f2;
                    pointF.b += (pointF2.b - pointF.b) * 0.04f * f2;
                    float f3 = am2.cj * 0.75f;
                    if (com.corrodinggames.rts.gameFramework.f.c(pointF.a - pointF2.a) < 1.0f) {
                        pointF2.a = com.corrodinggames.rts.gameFramework.f.d(-f3, f3);
                    }
                    if (!(com.corrodinggames.rts.gameFramework.f.c(pointF.b - pointF2.b) < 1.0f)) continue;
                    pointF2.b = com.corrodinggames.rts.gameFramework.f.d(-f3, f3);
                }
                break block4;
            }
            if (pointFArray2[0].a == 0.0f && pointFArray2[0].b == 0.0f) break block4;
            for (int i3 = 0; i3 < pointFArray2.length; ++i3) {
                PointF pointF = pointFArray2[i3];
                PointF pointF3 = pointFArray[i3];
                pointF.a = 0.0f;
                pointF.b = 0.0f;
                pointF3.a = 0.0f;
                pointF3.b = 0.0f;
            }
        }
    }

    @Override
    public void a(float f2) {
        if (f2 < 0.3f) {
            f2 = 0.3f;
        }
        if (this.ax && this.bX.b()) {
            for (int i2 = 0; i2 < com.corrodinggames.rts.game.n.c; ++i2) {
                com.corrodinggames.rts.game.n n2 = com.corrodinggames.rts.game.n.k(i2);
                if (n2 == null || n2.b()) continue;
                this.e(n2);
                break;
            }
        }
        super.a(f2);
        if (!this.bV) {
            com.corrodinggames.rts.game.units.h.a(f2, this);
        }
        this.cu = this.cv;
    }

    @Override
    public void a(float f2, boolean bl2) {
        if (!this.bV) {
            // empty if block
        }
    }

    @Override
    public float e(int n2) {
        return 0.0f;
    }

    @Override
    public float f(int n2) {
        return 0.0f;
    }

    @Override
    public boolean c(float f2) {
        if (!super.c(f2)) {
            return false;
        }
        com.corrodinggames.rts.gameFramework.l l2 = com.corrodinggames.rts.gameFramework.l.B();
        return true;
    }

    @Override
    public void a(am am2, int n2) {
    }

    @Override
    public boolean b_() {
        return false;
    }

    @Override
    public int y() {
        return 850000;
    }

    @Override
    public float b(am am2) {
        return 1.0E7f;
    }

    @Override
    public float c(am am2) {
        return 1.0E7f;
    }

    @Override
    public float m() {
        return 30.0f;
    }

    @Override
    public float b(int n2) {
        return 100.0f;
    }

    @Override
    public float z() {
        return 0.0f;
    }

    @Override
    public float A() {
        return 9.8f;
    }

    @Override
    public float B() {
        return 9.35f;
    }

    @Override
    public float c(int n2) {
        return 99.0f;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public float C() {
        return 0.04f;
    }

    @Override
    public float D() {
        return 0.1f;
    }

    @Override
    public void a(s s2, boolean bl2) {
        Object object;
        boolean bl3;
        x x2;
        com.corrodinggames.rts.gameFramework.l l2 = com.corrodinggames.rts.gameFramework.l.B();
        if (s2 instanceof k) {
            com.corrodinggames.rts.game.n n2;
            int n3;
            x2 = (k)s2;
            bl3 = true;
            if (bl2) {
                boolean bl4 = bl3 = !bl3;
            }
            if (x2.a) {
                boolean bl5 = bl3 = !bl3;
            }
            if (bl3) {
                object = null;
                for (n3 = this.bX.k + 1; n3 < com.corrodinggames.rts.game.n.c; ++n3) {
                    n2 = com.corrodinggames.rts.game.n.k(n3);
                    if (n2 == null || n2.b()) continue;
                    object = n2;
                    break;
                }
                if (object == null && this.bX.k < 4 && (object = com.corrodinggames.rts.game.n.k(this.bX.k + 1)) == null) {
                    com.corrodinggames.rts.gameFramework.l.e("Sandbox adding new team:" + this.bX.k);
                    a a2 = new a(this.bX.k + 1);
                    object = a2;
                    object.r = 1;
                    object.F = true;
                    object.G = true;
                    a2.bG = !this.c ? 0.0f : Float.MAX_VALUE;
                }
                if (object == null) {
                    for (n3 = 0; n3 < com.corrodinggames.rts.game.n.c; ++n3) {
                        n2 = com.corrodinggames.rts.game.n.k(n3);
                        if (n2 == null || n2.b()) continue;
                        object = n2;
                        break;
                    }
                }
                if (object != null) {
                    this.e((com.corrodinggames.rts.game.n)object);
                    if (!l2.cb.j()) {
                        l2.bs = object;
                    }
                }
            } else {
                object = null;
                for (n3 = this.bX.k - 1; n3 >= 0; --n3) {
                    n2 = com.corrodinggames.rts.game.n.k(n3);
                    if (n2 == null || n2.b()) continue;
                    object = n2;
                    break;
                }
                if (object == null) {
                    for (n3 = com.corrodinggames.rts.game.n.c - 1; n3 >= 0; --n3) {
                        n2 = com.corrodinggames.rts.game.n.k(n3);
                        if (n2 == null || n2.b()) continue;
                        object = n2;
                        break;
                    }
                }
                if (object != null) {
                    this.e((com.corrodinggames.rts.game.n)object);
                    if (!l2.cb.j()) {
                        l2.bs = object;
                    }
                }
            }
        }
        if (s2 instanceof j) {
            x2 = (j)s2;
            bl3 = true;
            if (bl2) {
                boolean bl6 = bl3 = !bl3;
            }
            if (((j)x2).a) {
                boolean bl7 = bl3 = !bl3;
            }
            if ((object = l2.bZ.j()).size() == 0) {
                this.E = null;
            } else if (bl3) {
                if (this.E == null) {
                    this.E = (com.corrodinggames.rts.gameFramework.i.b)object.get(0);
                } else {
                    com.corrodinggames.rts.gameFramework.i.b b2 = null;
                    boolean bl8 = false;
                    for (com.corrodinggames.rts.gameFramework.i.b b3 : object) {
                        if (bl8) {
                            b2 = b3;
                            break;
                        }
                        if (b3 != this.E) continue;
                        bl8 = true;
                    }
                    this.E = b2;
                }
            } else if (this.E == null) {
                this.E = (com.corrodinggames.rts.gameFramework.i.b)object.get(object.size() - 1);
            } else {
                com.corrodinggames.rts.gameFramework.i.b b4 = null;
                boolean bl9 = false;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((Collection)object);
                Collections.reverse((List)arrayList);
                for (com.corrodinggames.rts.gameFramework.i.b b5 : arrayList) {
                    if (bl9) {
                        b4 = b5;
                        break;
                    }
                    if (b5 != this.E) continue;
                    bl9 = true;
                }
                this.E = b4;
            }
        }
        if (s2 instanceof l) {
            x2 = (l)s2;
            bl3 = true;
            if (bl2) {
                boolean bl10 = bl3 = !bl3;
            }
            if (((l)x2).a) {
                bl3 = !bl3;
            }
            this.F = this.F.a(!bl3);
        }
        if (s2 instanceof i) {
            this.bX.d(10000.0f);
        }
        if (s2 instanceof m) {
            ((m)s2).n();
        }
    }

    static h L() {
        com.corrodinggames.rts.gameFramework.l l2 = com.corrodinggames.rts.gameFramework.l.B();
        return l2.bS.i();
    }

    @Override
    public void a(s s2, boolean bl2, PointF pointF, am am2) {
        Object object;
        com.corrodinggames.rts.game.n n2;
        Object object2;
        com.corrodinggames.rts.gameFramework.l l2 = com.corrodinggames.rts.gameFramework.l.B();
        if (s2 instanceof com.corrodinggames.rts.game.units.a.h) {
            s2 = ((com.corrodinggames.rts.game.units.a.h)s2).q_();
        }
        if (s2 == h) {
            if (com.corrodinggames.rts.game.units.h.w()) {
                com.corrodinggames.rts.gameFramework.l.b("Not reloading units: Need to keep network sync");
                l2.bS.b("Not reloading units: Need to keep network sync");
                return;
            }
            if (bl2) {
                return;
            }
            if (l2.bZ.h() == 0) {
                l2.bS.b("No custom units to reload");
                return;
            }
            com.corrodinggames.rts.gameFramework.l.e("Reload units requested");
            l2.bZ.a(true, false);
            object2 = com.corrodinggames.rts.game.n.c().iterator();
            while (object2.hasNext()) {
                n2 = (com.corrodinggames.rts.game.n)object2.next();
                if (!(n2 instanceof a)) continue;
                ((a)n2).al();
            }
            l2.bS.b("All custom unit files reloaded");
        }
        if (s2 == i) {
            if (com.corrodinggames.rts.game.units.h.w()) {
                com.corrodinggames.rts.gameFramework.l.b("Not reloading units: Need to keep network sync");
                return;
            }
            if (bl2) {
                return;
            }
            if (l2.bZ.h() == 0) {
                l2.bS.b("No custom units to reload");
                return;
            }
            com.corrodinggames.rts.gameFramework.l.e("Reload active only requested");
            l2.bZ.a(true, true);
            object2 = com.corrodinggames.rts.game.n.c().iterator();
            while (object2.hasNext()) {
                n2 = (com.corrodinggames.rts.game.n)object2.next();
                if (!(n2 instanceof a)) continue;
                ((a)n2).al();
            }
            int n3 = ag.d;
            int n4 = 100;
            object = "Quick reloaded changed data for " + n3 + " units active on map.";
            if (l2.bQ.liveReloading && n3 == 0) {
                object = (String)object + " (Note: Live reloading is currently enabled, so changed units may have already be reloaded)";
                n4 = 170;
            }
            l2.bS.a((String)object, n4);
        }
        if (s2 == k || s2 == l || s2 == j) {
            int n5 = 0;
            if (bl2) {
                return;
            }
            Iterator iterator = am.bF().iterator();
            while (iterator.hasNext()) {
                object = (am)iterator.next();
                if (!(object instanceof am)) continue;
                am am3 = object;
                if (!(com.corrodinggames.rts.gameFramework.f.a(((am)object).eo, ((am)object).ep, pointF.a, pointF.b) < 2500.0f)) continue;
                if (s2 == k) {
                    if (am3.cN != null || am3.cO != null) continue;
                    am3.ci();
                    if (!(am3 instanceof y) || !am3.bI()) continue;
                    l2.bU.a((y)am3);
                    continue;
                }
                if (s2 == l) {
                    if (am3.cN != null || am3.cO != null) continue;
                    am3.cu = -1.0f;
                    continue;
                }
                if (s2 != j) continue;
                if (n5 > 4) break;
                if (am3.bI() || am3 instanceof al || am3.bV || am3.cN != null || am3.cO != null) continue;
                ++n5;
                as as2 = am3.r();
                for (int i2 = -25; i2 < 25; ++i2) {
                    am am4 = as2.a();
                    am4.eo = am3.eo + (float)i2 * 0.5f + 1.0f;
                    am4.ep = am3.ep + (float)i2 * 0.5f + 1.0f;
                    am4.b(am3.bX);
                    com.corrodinggames.rts.game.n.c(am4);
                    am4.cg = com.corrodinggames.rts.gameFramework.f.a((w)am3, -180, 180, 25 + i2);
                    if (!(am4 instanceof y)) continue;
                    ((y)am4).ay = true;
                }
            }
            return;
        }
        if (s2 == n) {
            if (bl2) {
                return;
            }
            object2 = com.corrodinggames.rts.game.units.d.q.a((am)this, pointF.a, pointF.b, pointF.a, pointF.b);
            if (object2 != null) {
                object2.eq = 100.0f;
                object2.j = null;
            }
        }
        if (s2 == m) {
            if (bl2) {
                return;
            }
            object2 = am.bF().iterator();
            while (object2.hasNext()) {
                w w2 = (w)object2.next();
                if (!(w2 instanceof y) || !(w2 instanceof com.corrodinggames.rts.game.units.d.l) || !(com.corrodinggames.rts.gameFramework.f.a(w2.eo, w2.ep, pointF.a, pointF.b) < 2500.0f)) continue;
                object = (com.corrodinggames.rts.game.units.d.l)((Object)w2);
                object.dz();
            }
            return;
        }
        if (s2 == o && (object2 = this.bX) instanceof a) {
            a a2 = (a)object2;
            a2.bG = a2.bG > 0.0f ? 0.0f : 10800.0f;
        }
        if (s2 == p) {
            object2 = this.bX;
            ++object2.r;
            if (object2.r > 4) {
                object2.r = 0;
            }
        }
        if (s2 == u) {
            boolean bl3;
            boolean bl4 = false;
            boolean bl5 = false;
            for (com.corrodinggames.rts.game.n n6 : com.corrodinggames.rts.game.n.c()) {
                if (!(n6 instanceof a)) continue;
                a a3 = (a)n6;
                if (a3.bG > 0.0f) {
                    bl4 = true;
                }
                bl5 = true;
            }
            boolean bl6 = bl3 = !bl4;
            if (!bl5) {
                bl3 = !this.c;
            }
            this.c = bl3;
            this.M();
        }
        if (s2 == v) {
            // empty if block
        }
        if (s2 == w) {
            // empty if block
        }
        if (s2 == x) {
            // empty if block
        }
        if (s2 == z) {
            boolean bl7 = l2.bl = !l2.bl;
        }
        if (s2 == A) {
            boolean bl8 = com.corrodinggames.rts.game.a.a.as = !com.corrodinggames.rts.game.a.a.as;
        }
        if (s2 == B) {
            boolean bl9 = l2.bn = !l2.bn;
        }
        if (s2 == C) {
            l2.bY.a();
        }
        if (s2 instanceof com.corrodinggames.rts.game.units.q) {
            com.corrodinggames.rts.game.units.q q2 = (com.corrodinggames.rts.game.units.q)s2;
            com.corrodinggames.rts.game.units.p.a(q2.a, pointF);
        }
        super.a(s2, bl2, pointF, am2);
    }

    public void M() {
        for (com.corrodinggames.rts.game.n n2 : com.corrodinggames.rts.game.n.c()) {
            if (!(n2 instanceof a)) continue;
            a a2 = (a)n2;
            if (!this.c) {
                a2.bG = 0.0f;
                continue;
            }
            a2.bG = Float.MAX_VALUE;
        }
    }

    public static boolean a(s s2, am am2) {
        if (s2 instanceof com.corrodinggames.rts.game.units.a.h) {
            s2 = ((com.corrodinggames.rts.game.units.a.h)s2).q_();
        }
        if (s2 == o) {
            return true;
        }
        if (s2 == w) {
            return true;
        }
        if (s2 == x) {
            return true;
        }
        if (s2 == m) {
            return true;
        }
        if (s2 == k) {
            return true;
        }
        if (s2 == j) {
            return true;
        }
        if (s2 == z) {
            return true;
        }
        if (s2 == p) {
            return true;
        }
        if (s2 == q) {
            return true;
        }
        if (s2 == s) {
            return true;
        }
        if (s2 == t) {
            return true;
        }
        if (s2 == B) {
            return true;
        }
        return s2 == C;
    }

    public static void a(ArrayList arrayList, int n2) {
        Object object;
        if (n2 != 1) {
            return;
        }
        D = new ArrayList();
        D.add((Object)new k(true, false));
        D.add((Object)new k(true, true));
        D.add((Object)new k(false, false));
        D.add((Object)new m(true, false));
        m m2 = new m(true, true);
        D.add((Object)m2);
        D.add((Object)new m(false, false));
        D.add((Object)new j(true, false));
        D.add((Object)new j(true, true));
        D.add((Object)new j(false, false));
        D.add((Object)new l(true, false));
        D.add((Object)new l(true, true));
        D.add((Object)new l(false, false));
        D.add((Object)new com.corrodinggames.rts.game.units.q(com.corrodinggames.rts.game.units.r.a));
        D.add((Object)new com.corrodinggames.rts.game.units.q(com.corrodinggames.rts.game.units.r.b));
        D.add((Object)new com.corrodinggames.rts.game.units.q(com.corrodinggames.rts.game.units.r.c));
        D.add((Object)new com.corrodinggames.rts.game.units.q(com.corrodinggames.rts.game.units.r.d));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add((Object)new i());
        arrayList2.add((Object)y);
        arrayList2.add((Object)h);
        arrayList2.add((Object)i);
        arrayList2.add((Object)k);
        arrayList2.add((Object)j);
        arrayList2.add((Object)l);
        arrayList2.add((Object)n);
        arrayList2.add((Object)m);
        arrayList2.add((Object)u);
        arrayList2.add((Object)v);
        arrayList2.add((Object)w);
        arrayList2.add((Object)x);
        arrayList2.add((Object)z);
        arrayList2.add((Object)p);
        arrayList2.add((Object)q);
        arrayList2.add((Object)s);
        arrayList2.add((Object)t);
        if (com.corrodinggames.rts.gameFramework.l.at) {
            arrayList2.add((Object)A);
        }
        arrayList2.add((Object)B);
        arrayList2.add((Object)C);
        for (s s2 : arrayList2) {
            boolean bl2 = true;
            object = new com.corrodinggames.rts.game.units.a.h(s2, K, bl2);
            D.add(object);
        }
        Iterator iterator = new ArrayList();
        iterator.addAll((Collection) ar.ae);
        Collections.sort((List)iterator, (Comparator)new h$15());
        for (as as2 : iterator) {
            Object object2;
            if (as2 == ar.I || as2.i().equals((Object)"test_tank") || as2.i().equals((Object)"missing") || as2 == ar.v || as2 == ar.q || as2 == ar.R || as2 == ar.H || as2 == ar.W || as2 == ar.X || as2 == ar.Y || as2 == ar.Z || as2 == ar.N || !((object = am.c(as2)) instanceof y)) continue;
            if (as2 instanceof com.corrodinggames.rts.game.units.custom.l) {
                object2 = (com.corrodinggames.rts.game.units.custom.l)as2;
                if (!((com.corrodinggames.rts.game.units.custom.l)object2).aF) continue;
            }
            object2 = new v(as2, 1, null);
            object2 = new com.corrodinggames.rts.game.units.a.h((s)object2, K);
            boolean bl3 = false;
            for (s s3 : D) {
                if (!s3.equals(object2)) continue;
                bl3 = true;
            }
            if (bl3) continue;
            D.add(object2);
        }
    }

    @Override
    public ArrayList N() {
        com.corrodinggames.rts.gameFramework.l l2 = com.corrodinggames.rts.gameFramework.l.B();
        return D;
    }

    @Override
    public boolean E() {
        return true;
    }

    @Override
    public float g(int n2) {
        return 10.0f;
    }

    @Override
    public boolean F() {
        return com.corrodinggames.rts.gameFramework.l.B().bQ.renderExtraShadows && !this.bV;
    }

    @Override
    public float G() {
        return 1.0f;
    }

    @Override
    public float H() {
        return 1.0f;
    }

    @Override
    public boolean u() {
        return true;
    }

    @Override
    public boolean I() {
        return false;
    }

    @Override
    public boolean d(am am2) {
        return false;
    }

    @Override
    public boolean J() {
        return true;
    }

    @Override
    public float a(am am2, float f2, f f3) {
        f2 = 0.0f;
        return super.a(am2, f2, f3);
    }

    @Override
    public void O() {
    }

    @Override
    public boolean P() {
        return true;
    }

    public void a(h h2) {
        this.r = h2.r;
        this.c = h2.c;
    }

    @Override
    public void a(com.corrodinggames.rts.gameFramework.j.as as2) {
        as2.c(1);
        as2.a(this.G);
        as2.b(this.H);
        super.a(as2);
    }

    @Override
    public void a(com.corrodinggames.rts.gameFramework.j.k k2) {
        byte by = k2.d();
        this.G = (n)k2.b(n.class);
        if (this.G == null) {
            this.G = com.corrodinggames.rts.game.units.n.a;
        }
        if (by >= 1) {
            this.H = k2.j();
        }
        super.a(k2);
    }

    @Override
    public /* synthetic */ as r() {
        return this.f();
    }

    static {
        h = new h$1("reloadUnits");
        i = new h$12("reloadOnlyActiveUnits");
        j = new h$17("unitClone");
        k = new h$18("removeUnits");
        l = new h$19("killUnits");
        m = new h$20("finishQueue");
        n = new h$21("nukeAt");
        o = new h$22("freezeAI");
        p = new h$23("changeAlliance");
        q = new h$2("startRecording");
        s = new h$3("startReplayPlayback");
        t = new h$4("hideInterface");
        u = new h$5("freezeAllAI");
        v = new h$6("pauseGame");
        w = new h$7("slowGame");
        x = new h$8("fastForward");
        y = new h$9("search");
        z = new h$10("enableDebug");
        A = new h$11("enableAIDebug");
        B = new h$13("enableTriggerDebug");
        C = new h$14("clearSaveHistory");
        K = new h$16();
    }
}

