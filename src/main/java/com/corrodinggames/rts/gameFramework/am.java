/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.ArithmeticException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 */
package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.am$1;
import com.corrodinggames.rts.gameFramework.am$2;
import com.corrodinggames.rts.gameFramework.an;
import com.corrodinggames.rts.gameFramework.aq;
import com.corrodinggames.rts.gameFramework.ar;
import com.corrodinggames.rts.gameFramework.as;
import com.corrodinggames.rts.gameFramework.at;
import com.corrodinggames.rts.gameFramework.au;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.f.g;
import com.corrodinggames.rts.gameFramework.i.b;
import com.corrodinggames.rts.gameFramework.j.ad;
import com.corrodinggames.rts.gameFramework.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class am {
    public static aq a = new an();
    Object b = new Object();
    Object c = new Object();
    volatile float d = 1.0f;
    au e;
    volatile boolean f = false;
    volatile boolean g = true;
    float h = 0.0f;
    int i = 0;
    boolean j = false;
    as k;
    boolean l;
    String m;
    boolean n;
    boolean o;
    float p;
    float q;
    float r;
    public boolean s;
    public String t;
    public boolean u;
    String v;
    Context w;
    boolean x;
    boolean y;
    int z;
    as A;
    boolean B;
    boolean C;
    float D;
    boolean E = false;
    public boolean F = false;
    boolean G = false;
    float H;
    ArrayList I = new ArrayList();
    static HashMap J = new HashMap();
    static int K = 0;
    boolean L;
    boolean M;
    long N = -1L;

    public float a() {
        l l2 = com.corrodinggames.rts.gameFramework.l.B();
        return l2.bQ.musicVolume * l2.bQ.masterVolume;
    }

    public boolean b() {
        if (com.corrodinggames.rts.gameFramework.l.ax()) {
            return false;
        }
        if (this.u) {
            return false;
        }
        return this.a() > 0.01f;
    }

    public void a(Context context) {
        this.w = context;
        if (com.corrodinggames.rts.gameFramework.l.ax()) {
            return;
        }
        a.a(this);
        this.k = a.a();
        this.A = a.a();
        at.c();
        if (a.d()) {
            this.e = new au(this);
            this.e.start();
        }
    }

    public void c() {
        if (!com.corrodinggames.rts.gameFramework.l.av()) {
            this.l = false;
            this.m = null;
            this.x = true;
            this.B = false;
        }
        this.y = true;
        this.u = false;
    }

    static ar a(String string2, boolean bl2) {
        ar ar2;
        ar ar3 = (ar)J.get((Object)string2);
        if (ar3 != null) {
            return ar3;
        }
        try {
            ar2 = a.a(string2);
        }
        catch (ArithmeticException arithmeticException) {
            com.corrodinggames.rts.gameFramework.l.a("Error loading:" + string2, (Throwable)arithmeticException);
            if (++K > 2 && K <= 4) {
                com.corrodinggames.rts.gameFramework.l.B().i("Failed to load music track:" + string2 + ". Music track skipped.");
            }
            if (!bl2) {
                throw new RuntimeException((Throwable)arithmeticException);
            }
            return null;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            com.corrodinggames.rts.gameFramework.l.a("OutOfMemoryError loading:" + string2, (Throwable)outOfMemoryError);
            com.corrodinggames.rts.gameFramework.l.aC();
            System.gc();
            com.corrodinggames.rts.gameFramework.l.aC();
            if (++K < 3) {
                com.corrodinggames.rts.gameFramework.l.B().i("Ran out of memory loading music track:" + string2 + ". Music track skipped.");
            }
            if (!bl2) {
                throw new RuntimeException((Throwable)outOfMemoryError);
            }
            return null;
        }
        catch (Exception exception) {
            com.corrodinggames.rts.gameFramework.l.a("Exception loading:" + string2, (Throwable)exception);
            if (++K > 2 && K <= 4) {
                com.corrodinggames.rts.gameFramework.l.B().i("Unknown error loading music track:" + string2 + ". Music track skipped.");
            }
            if (!bl2) {
                throw new RuntimeException((Throwable)exception);
            }
            return null;
        }
        if (bl2) {
            J.put((Object)string2, (Object)ar2);
        }
        return ar2;
    }

    public ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (String string2 : at.a.b()) {
            arrayList.add((Object)string2);
        }
        for (String string2 : at.b.b()) {
            arrayList.add((Object)string2);
        }
        for (String string2 : at.a.b()) {
            arrayList.add((Object)string2);
        }
        return arrayList;
    }

    public String a(at at2) {
        return this.a(at2, at2);
    }

    public String a(at at2, at at3) {
        l l2 = com.corrodinggames.rts.gameFramework.l.B();
        at at4 = com.corrodinggames.rts.gameFramework.f.c(at2.b().length + at3.b().length) < at2.b().length ? at2 : at3;
        String[] stringArray = at4.b();
        return at4.a(stringArray[com.corrodinggames.rts.gameFramework.f.c(stringArray.length)]);
    }

    public synchronized void e() {
        this.s = true;
        this.u = false;
        this.t = null;
    }

    public synchronized void a(String string2) {
        this.s = true;
        this.u = false;
        this.t = string2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void a(float f2) {
        if (com.corrodinggames.rts.gameFramework.l.ax()) {
            return;
        }
        if (!a.d()) {
            if (!this.L) {
                this.b(f2);
            }
            this.g = true;
        }
        this.N = com.corrodinggames.rts.gameFramework.l.V();
        l l2 = com.corrodinggames.rts.gameFramework.l.B();
        if (l2.bT.H.a()) {
            this.e();
        }
        if (this.v != null) {
            ad.a(null, this.v);
            this.v = null;
        }
        if (this.p != this.a()) {
            this.p = this.a();
            this.o = true;
        }
        Object object = this.c;
        synchronized (object) {
            this.d = f2;
            if (this.L) {
                if (!this.M) {
                    this.M = true;
                    com.corrodinggames.rts.gameFramework.l.n("Music subsystem crashed, music has been disabled to keep your game running. Please send your logs.");
                }
                return;
            }
            if (!this.g) {
                this.h += f2;
                ++this.i;
                if (this.h > 320.0f && this.i > 80 && !this.j) {
                    this.j = true;
                    com.corrodinggames.rts.gameFramework.l.n("Lockup detected in music subsystem");
                }
            } else {
                this.h = 0.0f;
                this.i = 0;
            }
            this.g = false;
            this.f = true;
            this.c.notifyAll();
        }
    }

    public String b(String string2) {
        string2 = com.corrodinggames.rts.gameFramework.f.k(string2);
        string2 = com.corrodinggames.rts.gameFramework.f.g(string2);
        string2 = string2.replace((CharSequence)"[noloop]", (CharSequence)"");
        string2 = string2.replace((CharSequence)"_", (CharSequence)" ");
        return string2;
    }

    public boolean b(float f2) {
        try {
            this.c(f2);
            return true;
        }
        catch (Exception exception) {
            com.corrodinggames.rts.gameFramework.l.a("Music system crashed", (Throwable)exception);
            this.L = true;
            com.corrodinggames.rts.gameFramework.l.e("Stopping music");
            try {
                this.g();
            }
            catch (Exception exception2) {
                com.corrodinggames.rts.gameFramework.l.a("crash stopping music", (Throwable)exception2);
            }
            return false;
        }
    }

    public void c(float f2) {
        if (com.corrodinggames.rts.gameFramework.l.ax()) {
            return;
        }
        a.a(f2);
        if (!this.b()) {
            if (this.l && this.k.c()) {
                this.g();
                this.l = false;
                this.B = false;
            }
            return;
        }
        boolean bl2 = false;
        if (!this.l) {
            bl2 = true;
        }
        if (this.n) {
            if (!this.C) {
                this.q += f2;
            }
            if (this.q > 600.0f) {
                this.r += f2;
                if (this.r > 100.0f) {
                    this.r = 0.0f;
                    if (!this.l || !this.k.c()) {
                        bl2 = true;
                        this.q = 0.0f;
                    }
                }
            }
        } else {
            this.q += f2;
            if (this.q > 3600.0f) {
                com.corrodinggames.rts.gameFramework.l.e("Next music track, timer:" + this.q);
                bl2 = true;
                this.q = 0.0f;
            }
        }
        if (this.y) {
            b b2 = com.corrodinggames.rts.gameFramework.f.g.z();
            if (b2 != null && b2.N) {
                bl2 = true;
            }
            this.y = false;
        }
        if (bl2 || this.s) {
            Object object;
            String string2;
            b b3;
            boolean bl3 = this.s;
            String string3 = this.t;
            if (this.s) {
                com.corrodinggames.rts.gameFramework.l.e("Next music track requested");
                this.s = false;
                this.q = 0.0f;
                this.t = null;
            }
            String string4 = null;
            boolean bl4 = false;
            b b4 = null;
            if (string3 != null) {
                b3 = com.corrodinggames.rts.gameFramework.l.B().bZ.i();
                b3.addAll((Collection)this.d());
                string2 = string3;
                if (string3.endsWith(".ogg") || string3.endsWith(".wav")) {
                    string3 = this.b(string3);
                }
                object = b3.iterator();
                while (object.hasNext()) {
                    String string5 = (String)object.next();
                    String string6 = this.b(string5);
                    if (!string6.equalsIgnoreCase(string2)) continue;
                    bl4 = true;
                    string4 = string5;
                    break;
                }
                if (string4 == null) {
                    com.corrodinggames.rts.gameFramework.l.e("Failed to find requested music: " + string2);
                }
            }
            b3 = com.corrodinggames.rts.gameFramework.f.g.z();
            if (string4 == null && b3 != null && b3.P < 10 && b3.N && (string2 = b3.q()).size() > 0) {
                bl4 = true;
                b4 = b3;
                string4 = (String)string2.get(com.corrodinggames.rts.gameFramework.f.a(0, string2.size() - 1));
                if (bl3 || this.I.contains((Object)string4)) {
                    for (int i2 = 0; i2 < 30 && (string4.equals((Object)this.m) || this.I.contains((Object)string4)); ++i2) {
                        string4 = (String)string2.get(com.corrodinggames.rts.gameFramework.f.a(0, string2.size() - 1));
                        if (i2 <= 20) continue;
                        this.I.clear();
                    }
                }
                com.corrodinggames.rts.gameFramework.l.e("Playing music from mod:" + b3.a() + " - '" + string4 + "'");
            }
            if (string4 == null) {
                string4 = this.x ? this.a(at.a) : this.a(at.b, at.a);
                if (bl3 || this.I.contains((Object)string4)) {
                    for (int i3 = 0; i3 < 30 && (string4.equals((Object)this.m) || this.I.contains((Object)string4)); ++i3) {
                        string4 = this.a(at.b, at.a);
                        if (i3 <= 20) continue;
                        this.I.clear();
                    }
                }
            }
            if (!string4.equals((Object)this.m)) {
                this.m = string4;
                this.x = false;
                this.q = 0.0f;
                this.n = bl4 || string4.contains((CharSequence)"[noloop]");
                this.I.add((Object)string4);
                if (this.I.size() > 4) {
                    this.I.remove(0);
                }
                if (bl3) {
                    this.v = "Now playing: " + this.b(string4);
                }
                as as2 = this.k;
                this.k = this.A;
                this.A = as2;
                try {
                    object = am.a(string4, false);
                }
                catch (RuntimeException runtimeException) {
                    runtimeException.printStackTrace();
                    if (this.z < 3) {
                        this.v = "Failed to open music track: " + string4;
                        ++this.z;
                    }
                    if (b4 != null) {
                        ++b4.P;
                    }
                    return;
                }
                try {
                    this.k.a((ar)object);
                    this.k.a(!this.n);
                }
                catch (RuntimeException runtimeException) {
                    runtimeException.printStackTrace();
                    if (this.z < 3) {
                        this.v = "Failed to play music track: " + string4;
                        ++this.z;
                    }
                    if (b4 != null) {
                        ++b4.P;
                    }
                    return;
                }
                this.E = false;
                if (!bl3 && this.B) {
                    this.E = true;
                }
                if (this.l) {
                    this.B = true;
                }
                this.C = true;
                this.G = false;
                this.D = 1.0f;
                this.l = true;
            } else if (bl3) {
                com.corrodinggames.rts.gameFramework.l.e("Same music found");
            }
        }
        if (this.C || this.o) {
            float f3;
            float f4;
            boolean bl5 = a.c();
            this.D = !bl5 ? (this.F ? (this.D -= f2 * 0.1f) : (this.D -= f2 * 0.006f)) : (this.F ? (this.D -= f2 * 0.1f) : (this.E ? (this.D -= f2 * 0.003f) : (this.D -= f2 * 0.008f)));
            if (!bl5) {
                f4 = this.D * this.a();
                f3 = (1.0f - this.D) * this.a();
            } else {
                f4 = (this.D * 2.0f - 1.0f) * this.a();
                f3 = (1.0f - this.D * 2.0f) * this.a();
            }
            f4 = com.corrodinggames.rts.gameFramework.f.b(f4, 0.0f, 1.0f);
            f3 = com.corrodinggames.rts.gameFramework.f.b(f3, 0.0f, 1.0f);
            if (this.C) {
                if (this.D <= 0.0f) {
                    this.C = false;
                    this.E = false;
                    if (this.B && !this.G) {
                        this.G = true;
                        this.A.d();
                    }
                    if (this.l) {
                        this.k.a(this.a(), this.a());
                    }
                } else {
                    this.H += f2;
                    if (this.H > 10.0f) {
                        this.H = 0.0f;
                        if (this.B && !this.G) {
                            this.A.a(f4, f4);
                            if (f4 < 0.02f) {
                                this.G = true;
                                this.A.d();
                            }
                        }
                        if (this.l) {
                            this.k.a(f3, f3);
                        }
                    }
                }
            } else if (this.l) {
                this.k.a(f3, f3);
            }
        }
        this.o = false;
    }

    public void f() {
        Log.a("RustedWarfare", "Music:pause()");
        am$1 am$1 = new am$1(this);
        am$1.start();
    }

    public void g() {
        if (this.l) {
            this.k.a();
        }
        if (this.B) {
            this.A.a();
        }
    }

    public void h() {
        am$2 am$2 = new am$2(this);
        am$2.start();
    }

    public void i() {
        a.b();
        if (this.B) {
            this.A.d();
            this.A.e();
        }
        if (this.k != null) {
            this.k.d();
            this.k.e();
        }
        this.k = null;
        this.m = null;
        this.l = false;
    }

    public boolean j() {
        return this.C;
    }
}

