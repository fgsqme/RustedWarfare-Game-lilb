/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.Locale
 */
package com.corrodinggames.rts.game.units.custom;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.a.c;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.at;
import com.corrodinggames.rts.game.units.b;
import com.corrodinggames.rts.game.units.custom.a.g;
import com.corrodinggames.rts.game.units.custom.aa;
import com.corrodinggames.rts.game.units.custom.ab;
import com.corrodinggames.rts.game.units.custom.ac;
import com.corrodinggames.rts.game.units.custom.ad;
import com.corrodinggames.rts.game.units.custom.ag;
import com.corrodinggames.rts.game.units.custom.ay;
import com.corrodinggames.rts.game.units.custom.az;
import com.corrodinggames.rts.game.units.custom.ba;
import com.corrodinggames.rts.game.units.custom.bb;
import com.corrodinggames.rts.game.units.custom.bd;
import com.corrodinggames.rts.game.units.custom.be;
import com.corrodinggames.rts.game.units.custom.bh;
import com.corrodinggames.rts.game.units.custom.bl;
import com.corrodinggames.rts.game.units.custom.bn;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.bp;
import com.corrodinggames.rts.game.units.custom.e.a;
import com.corrodinggames.rts.game.units.custom.e.d;
import com.corrodinggames.rts.game.units.custom.e.f;
import com.corrodinggames.rts.game.units.custom.h;
import com.corrodinggames.rts.game.units.custom.j;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$CachedWriter;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$VariableMapping;
import com.corrodinggames.rts.game.units.custom.m;
import com.corrodinggames.rts.game.units.custom.n;
import com.corrodinggames.rts.game.units.custom.o;
import com.corrodinggames.rts.game.units.custom.r;
import com.corrodinggames.rts.game.units.custom.s;
import com.corrodinggames.rts.game.units.custom.t;
import com.corrodinggames.rts.game.units.custom.u;
import com.corrodinggames.rts.game.units.custom.v;
import com.corrodinggames.rts.game.units.custom.x;
import com.corrodinggames.rts.game.units.custom.z;
import com.corrodinggames.rts.game.units.e.i;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.j.k;
import com.corrodinggames.rts.gameFramework.m.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public strictfp final class l
implements as {
    public static final Rect a = new Rect();
    public static l b;
    public static final ArrayList c;
    public static ArrayList d;
    public static ArrayList e;
    public static final HashMap f;
    public static ArrayList g;
    public final com.corrodinggames.rts.gameFramework.utility.m h = new com.corrodinggames.rts.gameFramework.utility.m();
    public final com.corrodinggames.rts.gameFramework.utility.m i = new com.corrodinggames.rts.gameFramework.utility.m();
    public final com.corrodinggames.rts.gameFramework.utility.m j = new com.corrodinggames.rts.gameFramework.utility.m();
    final com.corrodinggames.rts.gameFramework.utility.m k = new com.corrodinggames.rts.gameFramework.utility.m();
    public final com.corrodinggames.rts.gameFramework.utility.m l = new com.corrodinggames.rts.gameFramework.utility.m();
    public final com.corrodinggames.rts.gameFramework.utility.m m = new com.corrodinggames.rts.gameFramework.utility.m();
    public final com.corrodinggames.rts.gameFramework.utility.m n = new com.corrodinggames.rts.gameFramework.utility.m();
    public final com.corrodinggames.rts.gameFramework.utility.m o = new com.corrodinggames.rts.gameFramework.utility.m();
    final com.corrodinggames.rts.gameFramework.utility.m p = new com.corrodinggames.rts.gameFramework.utility.m();
    public final com.corrodinggames.rts.gameFramework.utility.m q = new com.corrodinggames.rts.gameFramework.utility.m();
    public final VariableScope$VariableMapping r = new VariableScope$VariableMapping();
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public boolean A = true;
    public boolean B;
    public Rect C;
    public String D;
    public String E;
    public String F;
    public boolean G = true;
    public int H;
    public String I;
    public com.corrodinggames.rts.gameFramework.i.b J;
    public String K;
    public String L;
    public String M;
    public com.corrodinggames.rts.gameFramework.utility.m N = new com.corrodinggames.rts.gameFramework.utility.m();
    public h O;
    public h P;
    public String Q;
    public int R;
    public int S;
    public ad T;
    public int U = 1;
    public int V = Integer.MAX_VALUE;
    public int W = -1;
    public int X = -1;
    public int Y;
    public LogicBoolean Z;
    public boolean aa;
    public boolean ab;
    public com.corrodinggames.rts.game.o ac;
    public e ad = null;
    public boolean ae = true;
    public int af;
    public int ag;
    public int ah;
    public int ai;
    public float aj;
    public boolean ak;
    public e al = null;
    public boolean am;
    public e an = null;
    public e ao = null;
    public e ap = null;
    public boolean aq;
    public e[] ar = new e[10];
    public e[] as;
    public e[] at = null;
    public e au = null;
    public boolean av = false;
    public e aw;
    public ba[] ax = null;
    public boolean ay = false;
    public boolean az = false;
    public final com.corrodinggames.rts.gameFramework.utility.m aA = new com.corrodinggames.rts.gameFramework.utility.m();
    public boolean aB;
    public bb aC;
    public bb aD;
    public String aE;
    public boolean aF;
    public float aG = 1.0f;
    public boolean aH;
    public boolean aI;
    public boolean aJ;
    public boolean aK;
    public float aL;
    public boolean aM;
    public boolean aN;
    public boolean aO;
    public boolean aP;
    public boolean aQ;
    public boolean aR;
    public h aS;
    public boolean aT;
    public boolean aU;
    public boolean aV;
    public boolean aW;
    public int aX = -1;
    public boolean aY;
    public int aZ = -1;
    public boolean ba;
    public float bb;
    public float bc;
    public float bd = 1.0f;
    public float be;
    public float bf;
    public boolean bg;
    public float bh;
    public boolean bi;
    public boolean bj;
    public boolean bk;
    public boolean bl;
    public int bm;
    public boolean bn;
    public float bo;
    public float bp;
    public int bq;
    public boolean br;
    public boolean bs;
    public com.corrodinggames.rts.game.units.ab bt;
    public boolean bu;
    public boolean bv;
    public z bw;
    public z bx;
    public z by;
    public bl bz;
    public int bA = -1;
    public int bB = -1;
    public bp bC;
    public boolean bD;
    public boolean bE;
    public boolean bF;
    public boolean bG;
    public float bH = 1.0f;
    public float bI = 1.0f;
    boolean bJ;
    boolean bK;
    boolean bL;
    boolean bM;
    boolean bN;
    z bO;
    z bP;
    boolean bQ;
    float bR;
    boolean bS;
    float bT;
    z bU;
    z bV;
    boolean bW;
    float bX;
    z bY;
    z bZ;
    public float ca = 60.0f;
    public s cb = com.corrodinggames.rts.game.units.custom.s.a;
    public boolean cc;
    public boolean cd;
    public boolean ce;
    public boolean cf;
    public boolean cg;
    public com.corrodinggames.rts.game.units.custom.d.b ch;
    public com.corrodinggames.rts.game.units.custom.d.b ci;
    public com.corrodinggames.rts.game.units.custom.d.b cj;
    public float ck = 0.001f;
    public int cl;
    public boolean cm;
    public boolean cn;
    public com.corrodinggames.rts.game.units.custom.d.b co = com.corrodinggames.rts.game.units.custom.d.b.a;
    public f cp = com.corrodinggames.rts.game.units.custom.e.f.a;
    public f cq = com.corrodinggames.rts.game.units.custom.e.f.a;
    public int cr;
    public float cs;
    public VariableScope$CachedWriter ct = null;
    public float cu = 1.0f;
    public com.corrodinggames.rts.game.units.custom.d.b cv = com.corrodinggames.rts.game.units.custom.d.b.a;
    public com.corrodinggames.rts.game.units.custom.d.b cw = com.corrodinggames.rts.game.units.custom.d.b.a;
    public LogicBoolean cx;
    public boolean cy;
    public boolean cz;
    public boolean cA;
    public boolean cB;
    public boolean cC;
    public boolean cD;
    public boolean cE;
    public float cF;
    public int cG;
    public h cH;
    public int cI = -2;
    public float cJ;
    public float cK;
    public com.corrodinggames.rts.game.units.custom.as cL = new com.corrodinggames.rts.game.units.custom.as(true);
    public boolean cM;
    public float cN;
    public boolean cO;
    public float cP;
    public float cQ;
    public boolean cR;
    public float cS;
    public bb cT;
    public boolean cU;
    public float cV;
    public int cW;
    public Rect cX = new Rect();
    public Rect cY = new Rect();
    public Rect cZ = new Rect();
    public float da;
    public float db;
    public boolean dc;
    public int dd;
    public float de;
    public int df;
    public int dg;
    public int dh;
    public float di;
    public float dj;
    public Float dk;
    public float dl;
    public boolean dm;
    public Float dn;
    public bl do;
    public bl dp;
    public bl dq;
    com.corrodinggames.rts.gameFramework.utility.m dr = new com.corrodinggames.rts.gameFramework.utility.m();
    com.corrodinggames.rts.game.units.custom.f ds = new com.corrodinggames.rts.game.units.custom.f("moving");
    com.corrodinggames.rts.game.units.custom.f dt = new com.corrodinggames.rts.game.units.custom.f("idle");
    com.corrodinggames.rts.game.units.custom.f du = new com.corrodinggames.rts.game.units.custom.f("attack");
    com.corrodinggames.rts.game.units.custom.f dv;
    com.corrodinggames.rts.game.units.custom.f dw;
    com.corrodinggames.rts.game.units.custom.f dx;
    com.corrodinggames.rts.game.units.custom.f dy;
    com.corrodinggames.rts.game.units.custom.f dz;
    com.corrodinggames.rts.game.units.custom.f dA;
    public boolean dB;
    public boolean dC;
    public boolean dD;
    public boolean dE;
    public bn dF;
    public int dG;
    public float dH;
    m dI;
    public float dJ;
    public Boolean dK;
    public boolean dL;
    public float dM;
    public float dN;
    public float dO;
    public boolean dP;
    public boolean dQ;
    public boolean dR;
    public float dS = 0.0f;
    public float dT;
    public float dU = -1.0f;
    public float dV = 0.03f;
    public float dW = 0.06f;
    public boolean dX;
    public boolean dY;
    public int dZ;
    public float ea;
    public float eb;
    public b ec;
    public float ed;
    public float ee;
    public boolean ef;
    public boolean eg;
    public boolean eh;
    public boolean ei;
    public float ej;
    public float ek;
    public float el;
    public int em = -1;
    public int en = -1;
    public float eo;
    public boolean ep;
    public LogicBoolean eq;
    public LogicBoolean er;
    public LogicBoolean es;
    public LogicBoolean et;
    public boolean eu;
    public h ev;
    public h ew;
    public boolean ex;
    public boolean ey;
    public float ez;
    public boolean eA;
    public int eB;
    public boolean eC;
    public boolean eD;
    public boolean eE;
    public boolean eF;
    public float eG;
    public boolean eH;
    public boolean eI;
    public boolean eJ = false;
    public boolean eK = false;
    public boolean eL = false;
    public int eM = 0;
    public float eN;
    public boolean eO;
    public h eP;
    public com.corrodinggames.rts.gameFramework.utility.m eQ = new com.corrodinggames.rts.gameFramework.utility.m();
    public boolean eR;
    public boolean eS;
    public boolean eT;
    public LogicBoolean eU;
    public LogicBoolean eV;
    public LogicBoolean eW;
    public boolean eX;
    public float eY;
    public int eZ = 1;
    public static LogicBoolean fa;
    public static LogicBoolean fb;
    public LogicBoolean fc;
    public LogicBoolean fd;
    public boolean fe = true;
    public be ff;
    public ao fg;
    public ao fh;
    public boolean fi;
    public boolean fj;
    public boolean fk;
    public h fl;
    public int fm;
    public h fn;
    public h fo;
    public boolean fp;
    public boolean fq;
    public boolean fr;
    public boolean fs;
    public boolean ft;
    public boolean fu;
    public h fv;
    public boolean fw;
    public int fx;
    public int fy;
    public float fz;
    public int fA;
    public float fB;
    public float fC;
    public float fD;
    public int fE;
    public int fF;
    public boolean fG;
    public h fH;
    public String fI;
    public boolean fJ;
    public float fK = -1.0f;
    public com.corrodinggames.rts.gameFramework.utility.m fL = new com.corrodinggames.rts.gameFramework.utility.m();
    public boolean fM;
    public boolean fN;
    public h fO;
    public boolean fP;
    public bn[] fQ = null;
    public bh[] fR;
    ArrayList fS = new ArrayList();
    ArrayList fT = new ArrayList();
    boolean fU = false;
    bn fV = null;
    com.corrodinggames.rts.gameFramework.utility.m fW = new com.corrodinggames.rts.gameFramework.utility.m();
    boolean fX;
    r[] fY;
    r[] fZ;
    r[] ga;
    com.corrodinggames.rts.gameFramework.utility.m gb = new com.corrodinggames.rts.gameFramework.utility.m();
    ArrayList gc = new ArrayList();
    ArrayList gd = new ArrayList();
    static final ay[] ge;
    static final ay[] gf;
    ArrayList gg = new ArrayList();
    ArrayList gh = new ArrayList();
    public boolean gi;
    int gj = -1;
    String gk;
    String gl;
    HashMap gm;
    at[] gn;
    com.corrodinggames.rts.game.units.a.z go = new com.corrodinggames.rts.game.units.a.z(this);
    com.corrodinggames.rts.gameFramework.utility.m gp = new com.corrodinggames.rts.gameFramework.utility.m();
    com.corrodinggames.rts.gameFramework.utility.m gq = new com.corrodinggames.rts.gameFramework.utility.m();
    public boolean gr;
    public boolean gs;
    com.corrodinggames.rts.gameFramework.utility.m gt = new com.corrodinggames.rts.gameFramework.utility.m();

    public String b() {
        String string2 = this.D;
        if (this.J != null) {
            String string3 = this.J.q;
            if (string2.startsWith(string3)) {
                if ((string2 = string2.substring(string3.length())).startsWith("/")) {
                    string2 = string2.substring(1);
                }
                if (string2.startsWith("\\")) {
                    string2 = string2.substring(1);
                }
            }
            string2 = string2 + " (in mod " + this.J.a() + ")";
        }
        return string2;
    }

    public o a(String string2, o o2) {
        if (string2 != null) {
            o o3 = new o(this);
            o3.a = string2;
            o3.a();
            return o3;
        }
        if (o2 != null) {
            o o4 = new o(this);
            o4.a = o2.a;
            o4.a();
            return o4;
        }
        return null;
    }

    com.corrodinggames.rts.game.units.custom.f a(n n2, com.corrodinggames.rts.game.units.custom.f f2, boolean bl2) {
        com.corrodinggames.rts.game.units.custom.f f3 = this.a(n2);
        if (f3 != null) {
            if (bl2 && f2 != null && f2.a()) {
                throw new bo("Cannot define animation " + n2.name() + " on graphics and with onAction at same time");
            }
            return f3;
        }
        return f2;
    }

    public static String a(String string2) {
        string2 = string2.toLowerCase(Locale.ROOT);
        if ((string2 = string2.trim()).startsWith("arm_")) {
            string2 = "arm" + string2.substring("arm_".length());
        }
        if (string2.startsWith("leg_")) {
            string2 = "leg" + string2.substring("leg_".length());
        }
        return string2;
    }

    public int b(String string2) {
        string2 = com.corrodinggames.rts.game.units.custom.l.a(string2);
        com.corrodinggames.rts.gameFramework.l.e("name:" + string2);
        for (int i2 = 0; i2 < this.ax.length; ++i2) {
            com.corrodinggames.rts.gameFramework.l.e("checking:" + this.ax[i2].b);
            if (!string2.equals((Object)this.ax[i2].b)) continue;
            com.corrodinggames.rts.gameFramework.l.e("got");
            return i2;
        }
        return -1;
    }

    com.corrodinggames.rts.game.units.custom.f a(n n2) {
        Iterator iterator = this.dr.iterator();
        while (iterator.hasNext()) {
            com.corrodinggames.rts.game.units.custom.f f2 = (com.corrodinggames.rts.game.units.custom.f)iterator.next();
            if (!f2.a(n2)) continue;
            return f2;
        }
        return null;
    }

    public void a(t t2) {
        this.gb.add(t2);
    }

    public z a(String string2, z z2) {
        if (string2 == null && z2 != null) {
            return z2;
        }
        z z3 = new z(this, string2, null);
        z3.c();
        return z3;
    }

    public z c(String string2) {
        z z2 = new z(this, string2, null);
        return z2;
    }

    public ay d(String string2) {
        boolean bl2 = false;
        boolean bl3 = false;
        String string3 = string2.toUpperCase();
        if (string3.startsWith("CUSTOM:")) {
            string2 = string2.substring("CUSTOM:".length());
            string2 = string2.trim();
            bl2 = true;
        }
        if (string3.startsWith("CUSTOM|")) {
            string2 = string2.substring("CUSTOM|".length());
            string2 = string2.trim();
            bl2 = true;
        }
        if (string3.startsWith("BUILTIN:") || string3.startsWith("BUILTIN|")) {
            string2 = string2.substring("BUILTIN:".length());
            string2 = string2.trim();
            bl3 = true;
        }
        if (bl2) {
            for (ay ay2 : this.gd) {
                if (!string2.equalsIgnoreCase(ay2.name)) continue;
                return ay2;
            }
            throw new bo("Failed to find custom effect with the name:" + string2);
        }
        if (string2.contains((CharSequence)":")) {
            throw new bo("Unknown effect format:" + string2 + " expected built-in effect or CUSTOM:");
        }
        if (string2.contains((CharSequence)"|")) {
            throw new bo("Unknown effect format:" + string2 + " expected built-in effect or CUSTOM|");
        }
        if (!bl3) {
            for (ay ay3 : this.gd) {
                if (!string2.equalsIgnoreCase(ay3.name)) continue;
                return ay3;
            }
        }
        if ("small".equalsIgnoreCase(string2)) {
            return new ay(com.corrodinggames.rts.game.units.custom.az.a);
        }
        if ("medium".equalsIgnoreCase(string2)) {
            return new ay(com.corrodinggames.rts.game.units.custom.az.b);
        }
        if ("large".equalsIgnoreCase(string2)) {
            return new ay(com.corrodinggames.rts.game.units.custom.az.c);
        }
        if ("smoke".equalsIgnoreCase(string2)) {
            return new ay(com.corrodinggames.rts.game.units.custom.az.d);
        }
        if ("shockwave".equalsIgnoreCase(string2)) {
            return new ay(com.corrodinggames.rts.game.units.custom.az.e);
        }
        if ("largeExplosion".equalsIgnoreCase(string2)) {
            return new ay(com.corrodinggames.rts.game.units.custom.az.f);
        }
        if ("smallExplosion".equalsIgnoreCase(string2)) {
            return new ay(com.corrodinggames.rts.game.units.custom.az.g);
        }
        if ("resourcePoolSmoke".equalsIgnoreCase(string2)) {
            return new ay(com.corrodinggames.rts.game.units.custom.az.h);
        }
        if ("none".equalsIgnoreCase(string2)) {
            return new ay(com.corrodinggames.rts.game.units.custom.az.i);
        }
        throw new bo("Failed to find built-in or custom effect with the name:" + string2);
    }

    @Override
    public boolean C() {
        return this.ce;
    }

    @Override
    public boolean w() {
        com.corrodinggames.rts.gameFramework.l l2;
        if (this.cg && (l2 = com.corrodinggames.rts.gameFramework.l.B()).O() && l2.bX.ay.i) {
            return true;
        }
        return this.cf;
    }

    @Override
    public int c() {
        return this.ch.a();
    }

    @Override
    public com.corrodinggames.rts.game.units.custom.d.b u() {
        return this.ch;
    }

    @Override
    public com.corrodinggames.rts.game.units.custom.d.b B() {
        return this.cj;
    }

    @Override
    public com.corrodinggames.rts.game.units.custom.d.b d(int n2) {
        return this.ch;
    }

    @Override
    public float D() {
        return this.ck;
    }

    @Override
    public int g() {
        return this.cl;
    }

    @Override
    public am a() {
        return com.corrodinggames.rts.game.units.custom.l.a(false, this);
    }

    public am a(boolean bl2) {
        return com.corrodinggames.rts.game.units.custom.l.a(bl2, this);
    }

    @Override
    public String e() {
        if (this.gj != com.corrodinggames.rts.gameFramework.h.a.c || this.gk == null) {
            this.gj = com.corrodinggames.rts.gameFramework.h.a.c;
            String string2 = this.aC != null ? this.aC.b() : this.M;
            String string3 = this.M;
            if (this.aE != null) {
                string3 = this.aE;
            }
            this.gk = com.corrodinggames.rts.gameFramework.h.a.a("units." + string3 + ".name", string2, new Object[0]);
        }
        return this.gk;
    }

    @Override
    public String f() {
        if (this.gj != com.corrodinggames.rts.gameFramework.h.a.c || this.gl == null) {
            this.gj = com.corrodinggames.rts.gameFramework.h.a.c;
            String string2 = this.aD != null ? this.aD.b() : this.M;
            String string3 = this.M;
            if (this.aE != null) {
                string3 = this.aE;
            }
            this.gl = com.corrodinggames.rts.gameFramework.h.a.a("units." + string3 + ".description", string2, new Object[0]);
        }
        return this.gl;
    }

    @Override
    public boolean j() {
        return this.aH;
    }

    @Override
    public boolean k() {
        return this.aI;
    }

    @Override
    public boolean m() {
        return this.fq;
    }

    @Override
    public boolean n() {
        return this.fr;
    }

    @Override
    public boolean l() {
        return this.fp;
    }

    @Override
    public ao o() {
        return this.fg;
    }

    @Override
    public boolean p() {
        return this.aJ;
    }

    @Override
    public be q() {
        return this.ff;
    }

    public void a(ArrayList arrayList, int n2) {
        if (this.eM != 0 && this.eT) {
            arrayList.add((Object)com.corrodinggames.rts.game.units.e.i.i);
            arrayList.add((Object)com.corrodinggames.rts.game.units.e.i.j);
        }
    }

    @Override
    public void h() {
        this.gm = null;
        this.gn = new at[3];
        for (int i2 = 1; i2 <= 3; ++i2) {
            at at2 = new at();
            this.a(at2.a, i2);
            this.gn[i2 - 1] = at2;
        }
    }

    @Override
    public ArrayList a(int n2) {
        if (this.gn == null) {
            com.corrodinggames.rts.gameFramework.l l2 = com.corrodinggames.rts.gameFramework.l.B();
            boolean bl2 = d.contains((Object)this);
            throw new RuntimeException("specialActionLists==null for:" + this.M + " t:" + n2 + " networked:" + l2.N() + " replay:" + l2.cb.j() + " sandbox:" + l2.bv + " active: " + bl2);
        }
        return this.gn[n2 - 1].a;
    }

    public void r() {
        ArrayList arrayList = this.a(this.cl);
        if (arrayList.size() > 4) {
            this.gm = new HashMap();
            int n2 = arrayList.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                com.corrodinggames.rts.game.units.a.s s2 = (com.corrodinggames.rts.game.units.a.s)arrayList.get(i2);
                if (this.gm.get((Object)s2.N()) != null) continue;
                this.gm.put((Object)s2.N(), (Object)s2);
            }
        }
    }

    public com.corrodinggames.rts.game.units.a.s a(c c2) {
        if (this.gm != null) {
            return (com.corrodinggames.rts.game.units.a.s)this.gm.get((Object)c2);
        }
        ArrayList arrayList = this.a(this.cl);
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            com.corrodinggames.rts.game.units.a.s s2 = (com.corrodinggames.rts.game.units.a.s)arrayList.get(i2);
            if (!s2.d(c2)) continue;
            return s2;
        }
        return null;
    }

    @Override
    public String i() {
        return this.M;
    }

    @Override
    public String v() {
        return this.M;
    }

    @Override
    public int b(int n2) {
        int n3 = this.c();
        return n3;
    }

    @Override
    public com.corrodinggames.rts.game.units.a.z d() {
        return this.go;
    }

    public v a(String string2, String string3, String string4) {
        if (string2 == null) {
            return null;
        }
        v v2 = new v();
        v2.a = string3;
        v2.b = string4;
        v2.c = string2;
        this.p.add(v2);
        return v2;
    }

    public x b(String string2, String string3, String string4) {
        x x2 = new x();
        x2.a = string3;
        x2.b = string4;
        x2.c = "(known unit:)" + this.i();
        x2.d = this;
        x2.e = true;
        x2.g = string2;
        this.p.add(x2);
        return x2;
    }

    public u c(String string2, String string3, String string4) {
        if (string2 == null || string2.trim().equals((Object)"")) {
            return null;
        }
        u u2 = new u();
        u2.c = string3;
        u2.d = string4;
        for (String string5 : com.corrodinggames.rts.gameFramework.f.c(string2, ',')) {
            string5 = string5.trim();
            u2.a.add(string5);
        }
        this.gp.add(u2);
        return u2;
    }

    public static v a(as as2) {
        if (as2 == null) {
            return null;
        }
        v v2 = new v();
        v2.a = "known";
        v2.d = as2;
        v2.e = true;
        return v2;
    }

    public static l c(int n2) {
        int n3;
        if (n2 >= 100 && (n3 = n2 - 100) < g.size()) {
            l l2 = (l)g.get(n3);
            return l2;
        }
        return null;
    }

    public static ArrayList s() {
        ArrayList arrayList = new ArrayList();
        int n2 = 100;
        for (l l2 : g) {
            arrayList.add((Object)n2);
            ++n2;
        }
        return arrayList;
    }

    @Override
    public h x() {
        return this.O;
    }

    public bn e(String string2) {
        for (bn bn2 : this.fS) {
            if (!bn2.a.equalsIgnoreCase(string2)) continue;
            return bn2;
        }
        return null;
    }

    public bh f(String string2) {
        for (bh bh2 : this.fT) {
            if (!bh2.bh.equalsIgnoreCase(string2)) continue;
            return bh2;
        }
        return null;
    }

    public com.corrodinggames.rts.game.units.custom.a.d g(String string2) {
        for (com.corrodinggames.rts.game.units.custom.a.d d2 : this.gh) {
            if (d2.c == null || !d2.c.equalsIgnoreCase(string2)) continue;
            return d2;
        }
        return null;
    }

    public com.corrodinggames.rts.game.units.a.s h(String string2) {
        ArrayList arrayList = this.a(this.cl);
        for (com.corrodinggames.rts.game.units.a.s s2 : arrayList) {
            if (!(s2 instanceof g)) continue;
            g g2 = (g)s2;
            if (!g2.a.c.equalsIgnoreCase(string2)) continue;
            return g2;
        }
        return null;
    }

    public void a(com.corrodinggames.rts.game.units.custom.b.a a2) {
        if (!this.h.contains(a2)) {
            this.h.add(a2);
        }
    }

    public void b(com.corrodinggames.rts.game.units.custom.b.a a2) {
        if (!this.i.contains(a2)) {
            this.i.add(a2);
        }
    }

    public void a(com.corrodinggames.rts.game.units.custom.d.b b2) {
        if (b2 != null && b2.b != 0) {
            if (this.gs) {
                com.corrodinggames.rts.gameFramework.l.g("usesCreditResources:" + b2);
            }
            this.gr = true;
        }
    }

    public com.corrodinggames.rts.game.units.custom.b.n i(String string2) {
        Iterator iterator = this.aA.iterator();
        while (iterator.hasNext()) {
            com.corrodinggames.rts.game.units.custom.b.n n2 = (com.corrodinggames.rts.game.units.custom.b.n)iterator.next();
            if (!n2.b().equalsIgnoreCase(string2)) continue;
            return n2;
        }
        return null;
    }

    public a j(String string2) {
        a a2 = com.corrodinggames.rts.game.units.custom.e.a.a(string2);
        if (a2 != null) {
            return a2;
        }
        return this.k(string2);
    }

    public a k(String string2) {
        Iterator iterator = this.j.iterator();
        while (iterator.hasNext()) {
            d d2 = (d)iterator.next();
            if (!d2.a.equalsIgnoreCase(string2)) continue;
            return d2.b;
        }
        return null;
    }

    public d a(a a2) {
        Iterator iterator = this.j.iterator();
        while (iterator.hasNext()) {
            d d2 = (d)iterator.next();
            if (d2.b != a2) continue;
            return d2;
        }
        return null;
    }

    public com.corrodinggames.rts.game.units.custom.c.a a(com.corrodinggames.rts.game.units.custom.g g2) {
        Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            com.corrodinggames.rts.game.units.custom.c.a a2 = (com.corrodinggames.rts.game.units.custom.c.a)iterator.next();
            if (a2.g != g2) continue;
            return a2;
        }
        return null;
    }

    public com.corrodinggames.rts.game.units.custom.c.a l(String string2) {
        Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            com.corrodinggames.rts.game.units.custom.c.a a2 = (com.corrodinggames.rts.game.units.custom.c.a)iterator.next();
            if (!a2.g.a.equals((Object)string2)) continue;
            return a2;
        }
        return null;
    }

    @Override
    public boolean y() {
        return this.gr;
    }

    public String t() {
        if (this.J != null) {
            return this.J.a();
        }
        return null;
    }

    public static void a(com.corrodinggames.rts.gameFramework.j.as as2) {
        as2.e("customUnits");
        as2.a(1);
        as2.a(d.size());
        for (l l2 : d) {
            as2.c(l2.M);
            as2.a(l2.H);
            as2.a(true);
            as2.b(l2.t());
            long l3 = 0L;
            if (l2.J != null && l2.J.k != 0L) {
                l3 = l2.J.k;
            }
            as2.a(l3);
            long l4 = 0L;
            as2.a(l4);
        }
        as2.a("customUnits");
    }

    public static void a(ab ab2, HashMap hashMap) {
        String string2;
        Object object3;
        boolean bl2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean bl3 = bl2 = ab2.a == null;
        if (!bl2) {
            Object object2;
            for (Object object3 : hashMap.values()) {
                if (((ac)object3).b == 0 && ((ac)object3).d == 0 && ((ac)object3).c > 0) {
                    arrayList.add(object3);
                    continue;
                }
                if (((ac)object3).c <= 0 && ((ac)object3).d <= 0) continue;
                arrayList2.add(object3);
            }
            string2 = null;
            object3 = "";
            if (arrayList.size() > 0) {
                object2 = "";
                boolean bl4 = true;
                for (ac ac2 : arrayList) {
                    if (bl4) {
                        bl4 = false;
                    } else {
                        object2 = object2 + ", \n";
                    }
                    object2 = object2 + "'" + ac2.a + "'";
                }
                object2 = com.corrodinggames.rts.gameFramework.f.b(object2, 200);
                if (arrayList.size() == 1) {
                    string2 = "Missing 1 mod.";
                    object3 = "Missing mod: '" + ((ac)arrayList.get((int)0)).a + "'";
                } else {
                    string2 = "Missing " + arrayList.size() + " mods";
                    object3 = "missing mods: " + object2;
                }
                object3 = (String)object3 + "\n Required by this server.";
                if (arrayList2.size() > 0) {
                    object3 = (String)object3 + "\n and " + arrayList2.size() + " mods are different.";
                }
            } else if (arrayList2.size() > 0) {
                object2 = "";
                boolean bl5 = true;
                for (ac ac3 : arrayList2) {
                    if (bl5) {
                        bl5 = false;
                    } else {
                        object2 = object2 + ", \n";
                    }
                    object2 = object2 + "'" + ac3.a + "'";
                }
                object2 = com.corrodinggames.rts.gameFramework.f.b(object2, 200);
                string2 = "Different mod data.";
                object3 = "Different mod data for: " + object2 + " \n Check these mods are the same version as the server you are connecting to.";
            } else {
                com.corrodinggames.rts.gameFramework.l.e("Skipping nice message: completelyMissedMods:" + arrayList.size() + " differentMods:" + arrayList2.size());
            }
            if (string2 != null) {
                object2 = new bd((String)object3, "");
                ((bd)((Object)object2)).a = string2;
                throw object2;
            }
        }
        string2 = "from internal units";
        if (ab2.a != null) {
            string2 = "from mod:'" + ab2.a + "'";
        }
        if ((object3 = com.corrodinggames.rts.gameFramework.l.B().bZ.f(ab2.a)) != null) {
            string2 = !((com.corrodinggames.rts.gameFramework.i.b)object3).m() ? string2 + " (You seem to have this mod but it is not enabled)" : string2 + " (You seem to have this mod but it might be a different version)";
        }
        if (ab2.d == -1) {
            throw new bd("The server requires the unit:" + ab2.b + " that was not found " + string2, "");
        }
        throw new bd("Found unit:" + ab2.b + " but it does not match the server's copy " + string2, "checksum c:" + ab2.d + " s:" + ab2.c);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(k k2) {
        k2.b("customUnits");
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashMap hashMap = new HashMap();
            int n2 = k2.f();
            boolean bl2 = false;
            if (n2 >= 2) {
                bl2 = k2.e();
                k2.e();
            }
            int n3 = k2.f();
            for (int i2 = 0; i2 < n3; ++i2) {
                Object object = k2.l();
                int n4 = k2.f();
                boolean bl3 = k2.e();
                String string2 = k2.j();
                long l2 = k2.i();
                long l3 = k2.i();
                String string3 = null;
                if (bl2) {
                    string3 = k2.j();
                }
                l l4 = null;
                int n5 = -1;
                l l5 = null;
                Object object2 = c;
                synchronized (object2) {
                    for (l l6 : c) {
                        if (!object.equals((Object)l6.M)) continue;
                        if (n4 == l6.H) {
                            l4 = l6;
                            continue;
                        }
                        l5 = l6;
                        n5 = l6.H;
                    }
                }
                object2 = (ac)hashMap.get((Object)string2);
                if (object2 == null) {
                    object2 = new ac(string2);
                    hashMap.put((Object)string2, object2);
                }
                if (l4 == null) {
                    if (l5 != null) {
                        ++object2.d;
                    } else {
                        ++object2.c;
                    }
                    ab ab2 = new ab();
                    ab2.a = string2;
                    ab2.b = object;
                    ab2.d = n5;
                    ab2.c = n4;
                    ab2.f = l5;
                    ab2.e = string3;
                    arrayList2.add((Object)ab2);
                    com.corrodinggames.rts.gameFramework.l.b(ab2.a());
                    continue;
                }
                ++object2.b;
                arrayList.add((Object)l4);
            }
            if (arrayList2.size() > 0) {
                for (Object object : arrayList2) {
                    if (((ab)object).a != null) continue;
                    com.corrodinggames.rts.game.units.custom.l.a((ab)object, hashMap);
                }
                com.corrodinggames.rts.game.units.custom.l.a((ab)arrayList2.get(0), hashMap);
            }
            e = arrayList;
        }
        finally {
            k2.d("customUnits");
        }
    }

    public void b(as as2) {
        if (!this.fL.contains(as2) && as2 != this) {
            this.fL.add(as2);
        }
        if (as2 instanceof l) {
            Iterator iterator = ((l)as2).fL.iterator();
            while (iterator.hasNext()) {
                as as3 = (as)iterator.next();
                if (this.fL.contains(as3) || as2 == this) continue;
                this.fL.add(as3);
            }
        }
    }

    public static l a(l l2) {
        for (l l3 : d) {
            if (!l2.D.equals((Object)l3.D)) continue;
            return l3;
        }
        for (l l3 : d) {
            if (!l2.M.equals((Object)l3.M)) continue;
            return l3;
        }
        return null;
    }

    public static void A() {
        Iterator iterator = com.corrodinggames.rts.game.units.am.bF().iterator();
        while (iterator.hasNext()) {
            am am2 = (am)iterator.next();
            if (!(am2 instanceof j)) continue;
            j j2 = (j)am2;
            l l2 = j2.x;
            if (d.contains((Object)l2)) continue;
            l l3 = com.corrodinggames.rts.game.units.custom.l.a(l2);
            if (l3 == null) {
                l3 = b;
            }
            if (l3 == null) continue;
            j2.a(l3, false, true);
        }
    }

    public e[] a(e e2, com.corrodinggames.rts.game.o o2) {
        boolean bl2 = false;
        if ((this.J != null || this.eE) && !com.corrodinggames.rts.gameFramework.l.B().bQ.disableModLazyLoad) {
            bl2 = true;
        }
        if (this.cy && this.cz || this.cE) {
            bl2 = true;
        }
        e[] eArray = com.corrodinggames.rts.game.n.a(e2, o2, bl2);
        for (int i2 = 0; i2 < eArray.length; ++i2) {
            if (!bl2 || this.J == null || !this.eE || i2 != 1) continue;
            eArray[i2].w();
        }
        com.corrodinggames.rts.game.units.custom.ag.a(eArray);
        return eArray;
    }

    public e a(com.corrodinggames.rts.gameFramework.utility.ab ab2, String string2, String string3) {
        return this.a(ab2, string2, string3, this.ab);
    }

    public e a(com.corrodinggames.rts.gameFramework.utility.ab ab2, String string2, String string3, boolean bl2) {
        String string4 = ab2.b(string2, string3, (String)null);
        return this.a(this.F, string4, bl2, string2, string3);
    }

    public e a(String string2, String string3, boolean bl2, String string4, String string5) {
        e e2 = com.corrodinggames.rts.game.units.custom.ag.a(string2, string3, bl2, this, string4, string5);
        return e2;
    }

    public static as m(String string2) {
        for (as as2 : f.keySet()) {
            if (!as2.i().equals((Object)string2)) continue;
            return (as)f.get((Object)as2);
        }
        return null;
    }

    public static as c(as as2) {
        return (as)f.get((Object)as2);
    }

    public static l n(String string2) {
        for (l l2 : d) {
            if (!string2.equals((Object)l2.M)) continue;
            return l2;
        }
        for (l l2 : d) {
            if (!l2.N.contains(string2)) continue;
            return l2;
        }
        return null;
    }

    public static String E() {
        String string2 = "";
        for (l l2 : d) {
            string2 = string2 + l2.M + ", ";
        }
        for (l l2 : d) {
            Iterator iterator = l2.N.iterator();
            while (iterator.hasNext()) {
                String string3 = (String)iterator.next();
                string2 = string2 + string3 + ", ";
            }
        }
        return string2;
    }

    public static j a(boolean bl2, l l2) {
        j j2 = new j(bl2, l2);
        return j2;
    }

    public void o(String string2) {
        if (com.corrodinggames.rts.gameFramework.utility.ag.i(string2)) {
            return;
        }
        aa aa2 = new aa(string2);
        this.k.add(aa2);
    }

    public void p(String string2) {
        com.corrodinggames.rts.game.units.custom.ag.a(this.i(), (Exception)new bo(string2), (as)this);
    }

    public void q(String string2) {
        String string3 = "Warning (on " + this.b() + "): " + string2;
        com.corrodinggames.rts.gameFramework.l.b(string3);
        this.gt.add(string2);
        if (this.J == null) {
            com.corrodinggames.rts.gameFramework.l.B().a(string3, 1);
            if (com.corrodinggames.rts.gameFramework.l.aT) {
                com.corrodinggames.rts.gameFramework.l.e("Crashing on allowed unit warning because automated testing is active");
                throw new RuntimeException(string3);
            }
        }
    }

    public void r(String string2) {
        String string3 = "Warning (on " + this.b() + "): " + string2;
        com.corrodinggames.rts.gameFramework.l.b(string3);
        this.gt.add(string2);
        if (this.J == null) {
            com.corrodinggames.rts.gameFramework.l.B().a(string3, 1);
            if (com.corrodinggames.rts.gameFramework.l.aT) {
                com.corrodinggames.rts.gameFramework.l.e("Crashing on allowed unit warning because automated testing is active");
                throw new RuntimeException(string3);
            }
        } else {
            this.J.b(string3);
        }
    }

    @Override
    public e z() {
        return this.aw;
    }

    public static void F() {
        com.corrodinggames.rts.gameFramework.l l2 = com.corrodinggames.rts.gameFramework.l.B();
        for (l l3 : d) {
            am am2;
            Object object;
            ad ad2 = l3.T;
            if (ad2 == null) continue;
            if (ad2 == com.corrodinggames.rts.game.units.custom.ad.a || ad2 == com.corrodinggames.rts.game.units.custom.ad.b) {
                for (Object object2 : l2.bL.A) {
                    object = l3.a();
                    ((am)object).b(com.corrodinggames.rts.game.n.i);
                    l2.bL.a(((Point)object2).a, ((Point)object2).b);
                    ((am)object).eo = l2.bL.T;
                    ((am)object).ep = l2.bL.U;
                    ((am)object).eo += ((am)object).cZ();
                    ((am)object).ep += ((am)object).da();
                    if (ad2 == com.corrodinggames.rts.game.units.custom.ad.a && object instanceof y && ((y)(am2 = (y)object)).a((am)null, (com.corrodinggames.rts.game.n)null)) {
                        ((am)object).ci();
                        continue;
                    }
                    com.corrodinggames.rts.game.n.c((am)object);
                }
                continue;
            }
            if (ad2 == com.corrodinggames.rts.game.units.custom.ad.c || ad2 == com.corrodinggames.rts.game.units.custom.ad.d) {
                if (ad2 == com.corrodinggames.rts.game.units.custom.ad.c) {
                    am am3 = l3.a();
                    am3.b(com.corrodinggames.rts.game.n.i);
                    l2.bL.b(l2.bL.i() / 2.0f, l2.bL.j() / 2.0f);
                    am3.eo = l2.bL.T;
                    am3.ep = l2.bL.U;
                    am3.eo += am3.cZ();
                    am3.ep += am3.da();
                    com.corrodinggames.rts.game.n.c(am3);
                }
                if (ad2 != com.corrodinggames.rts.game.units.custom.ad.d) continue;
                for (Object object2 : com.corrodinggames.rts.game.n.c()) {
                    if (((com.corrodinggames.rts.game.n)object2).a(true, false) <= 0) continue;
                    object = l3.a();
                    ((am)object).b((com.corrodinggames.rts.game.n)object2);
                    l2.bL.b(l2.bL.i() / 2.0f, l2.bL.j() / 2.0f);
                    ((am)object).eo = l2.bL.T;
                    ((am)object).ep = l2.bL.U;
                    ((am)object).eo += ((am)object).cZ();
                    ((am)object).ep += ((am)object).da();
                    com.corrodinggames.rts.game.n.c((am)object);
                }
                continue;
            }
            if (ad2 == com.corrodinggames.rts.game.units.custom.ad.e) {
                for (Object object2 : com.corrodinggames.rts.game.n.c()) {
                    if (((com.corrodinggames.rts.game.n)object2).a(true, false) <= 0) continue;
                    object = new PointF();
                    com.corrodinggames.rts.gameFramework.utility.y.a((com.corrodinggames.rts.game.n)object2, (PointF)object);
                    am2 = l3.a();
                    am2.b((com.corrodinggames.rts.game.n)object2);
                    l2.bL.b(((PointF)object).a, ((PointF)object).b);
                    am2.eo = l2.bL.T;
                    am2.ep = l2.bL.U;
                    am2.eo += am2.cZ();
                    am2.ep += am2.da();
                    com.corrodinggames.rts.game.n.c(am2);
                }
                continue;
            }
            com.corrodinggames.rts.gameFramework.l.b("onNewMapSpawn unhandled: " + (Object)((Object)l3.T));
        }
    }

    @Override
    public int a(am am2) {
        int n2 = 0;
        if (this.aL > 0.0f) {
            return (int)this.aL;
        }
        if (this.aJ && this.aH && am2.y() < 20) {
            n2 += 17;
        }
        return n2;
    }

    public void a(String string2, int n2, String string3, String string4) {
        if (this.J == null) {
            return;
        }
        if (this.J.w >= n2) {
            return;
        }
        if (!this.J.r) {
            return;
        }
        if (this.J.v == null) {
            throw new bo("[" + string3 + "] minVersion of " + string2 + " is required to be set in mod-info.txt at the root of this mod to use " + string4);
        }
        try {
            com.corrodinggames.rts.gameFramework.i.a.a(string2, this.J.v);
        }
        catch (bo bo2) {
            throw new bo("[" + string3 + "]" + string4 + " " + bo2.getMessage() + " to be set as minVersion in mod-info.txt");
        }
        this.J.w = n2;
    }

    public static as s(String string2) {
        return com.corrodinggames.rts.game.units.custom.l.a(string2, true);
    }

    public static as a(String string2, boolean bl2) {
        as as2 = com.corrodinggames.rts.game.units.ar.a(string2, bl2);
        if (as2 == com.corrodinggames.rts.game.units.ar.Y) {
            return com.corrodinggames.rts.game.units.ar.h;
        }
        return as2;
    }

    static {
        c = new ArrayList();
        d = new ArrayList();
        e = null;
        f = new HashMap();
        g = new ArrayList();
        fa = LogicBoolean.create(null, "if not self.isOverLiquid() and not self.isMoving()");
        fb = LogicBoolean.create(null, "if not self.isOverLiquid()");
        ge = new ay[0];
        gf = new ay[0];
    }
}

