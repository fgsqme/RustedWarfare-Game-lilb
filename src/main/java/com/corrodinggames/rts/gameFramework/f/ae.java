/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 */
package com.corrodinggames.rts.gameFramework.f;

import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.f.af;
import com.corrodinggames.rts.gameFramework.f.ag;
import com.corrodinggames.rts.gameFramework.f.ah;
import com.corrodinggames.rts.gameFramework.f.ai;
import com.corrodinggames.rts.gameFramework.f.aj;
import com.corrodinggames.rts.gameFramework.f.ak;
import com.corrodinggames.rts.gameFramework.f.d;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.m.e;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

public class ae {
    static com.corrodinggames.rts.gameFramework.m.ag a = new com.corrodinggames.rts.gameFramework.m.ag();
    static com.corrodinggames.rts.gameFramework.m.ag b = new com.corrodinggames.rts.gameFramework.m.ag();
    static com.corrodinggames.rts.gameFramework.m.ag c = new com.corrodinggames.rts.gameFramework.m.ag();
    public Paint d = a;
    public Paint e = a;
    static Paint f = new Paint();
    public Paint g = this.d;
    static Paint h;
    m i = new m();

    public void a(Paint paint) {
        if (paint == null) {
            this.g = this.d;
            return;
        }
        this.g = paint;
    }

    public void a(boolean bl2) {
        this.g = bl2 ? this.e : this.d;
    }

    public String a() {
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator = this.i.iterator();
        while (iterator.hasNext()) {
            af af2 = (af)iterator.next();
            if (!(af2 instanceof ai)) continue;
            stringBuilder.append(((ai)af2).d);
        }
        return stringBuilder.toString();
    }

    public void a(String string2) {
        int n2;
        af af2;
        if (this.i.size() > 0 && (af2 = (af)this.i.get(n2 = this.i.size() - 1)) instanceof ai) {
            ai ai2 = (ai)af2;
            String string3 = com.corrodinggames.rts.gameFramework.f.a(ai2.d, string2);
            if (!ai2.d.equals((Object)string3)) {
                this.i.set(n2, ai2.b(string3));
            }
        }
    }

    public void b() {
        this.i.clear();
    }

    public void a(af af2) {
        this.i.add(af2);
    }

    public void b(String string2) {
        if (this.g != null && this.g != this.d) {
            this.a(string2, this.g);
            return;
        }
        this.a(new ai(this, string2));
    }

    public void a(String string2, Paint paint) {
        this.a(new ag(this, string2, paint));
    }

    public void a(String string2, int n2) {
        if (this.g != null && this.g != this.d) {
            this.a(new ag(this, string2, this.g, n2));
            return;
        }
        this.a(new ag(this, string2, null, n2));
    }

    public void a(String string2, int n2, boolean bl2) {
        Paint paint = this.d;
        if (bl2) {
            paint = this.e;
        }
        this.a(new ag(this, string2, paint, n2));
    }

    public void a(e e2, int n2, int n3) {
        ah ah2 = new ah(this);
        ah2.a = e2;
        float f2 = com.corrodinggames.rts.gameFramework.f.d.a(e2, n2, n3);
        ah2.c = (int)((float)e2.p * f2);
        ah2.d = (int)((float)e2.q * f2);
        ah2.b = f2;
        this.i.add(ah2);
    }

    public int c() {
        l l2 = l.B();
        return l2.bO.a("A", this.g);
    }

    public aj a(int n2, boolean bl2) {
        Object object;
        ai ai2;
        l l2 = l.B();
        Rect rect = new Rect(-n2 / 2, 0, n2 / 2, 10);
        m m2 = new m();
        ak ak2 = new ak();
        Paint paint = this.d;
        int n3 = n2 - 5;
        Object object2 = this.i.iterator();
        block0: while (object2.hasNext()) {
            af af2 = (af)object2.next();
            if (ak2.b >= n3 - 5) {
                if (ak2.a.size() > 0) {
                    m2.add(ak2);
                }
                ak2 = new ak();
            }
            if (!(af2 instanceof ai)) {
                ak2.a(af2);
                ak2.b += af2.a(this.d);
                continue;
            }
            ai2 = (ai)af2;
            object = ai2.d;
            int n4 = 0;
            while (n4 < object.length()) {
                String string2;
                if (object.charAt(n4) == '\n') {
                    ++n4;
                    m2.add(ak2);
                    ak2 = new ak();
                    continue;
                }
                int n5 = paint.a((CharSequence)object, n4, object.length(), true, (float)(n3 - ak2.b), null);
                if (n5 == 0) continue block0;
                boolean bl3 = true;
                int n6 = object.indexOf("\n", n4 + 1);
                if (n6 != -1 && n6 < n4 + n5) {
                    n5 = n6 - n4;
                } else {
                    int n7;
                    if (n4 + n5 < object.length() && (n7 = (string2 = object.substring(n4, n4 + n5)).lastIndexOf(" ")) != -1 && n7 != 0) {
                        n5 = n7;
                    }
                    if (n4 + n5 == object.length()) {
                        bl3 = false;
                    }
                }
                string2 = object.substring(n4, n4 + n5);
                if (com.corrodinggames.rts.gameFramework.f.c(string2, "\\n")) {
                    string2 = string2.replaceAll("(\\n)", "");
                }
                ai ai3 = ai2.b(string2);
                ak2.a(ai3);
                ak2.b += ai3.a(this.d);
                if ((n4 += n5) < object.length() && object.charAt(n4) == '\n') {
                    ++n4;
                }
                if (!bl3 && ak2.b < n3 - 5) continue;
                if (ak2.a.size() > 0) {
                    m2.add(ak2);
                }
                ak2 = new ak();
            }
        }
        if (ak2.a.size() > 0) {
            m2.add(ak2);
        }
        ak2 = null;
        if (m2.size() > 0) {
            object2 = (ak)m2.get(m2.size() - 1);
            if (object2.a.size() == 0) {
                m2.remove(m2.size() - 1);
            }
        }
        rect.d = rect.b + m2.size() * com.corrodinggames.rts.gameFramework.f.d.a(paint);
        if (bl2) {
            float f2 = rect.d();
            float f3 = 0.0f;
            ai2 = m2.iterator();
            while (ai2.hasNext()) {
                object = (ak)ai2.next();
                if (!((float)((ak)object).b > f3)) continue;
                f3 = ((ak)object).b;
            }
            float f4 = f3;
            if (f4 < (float)rect.b()) {
                rect.a = (int)(f2 - f4 / 2.0f);
                rect.c = (int)(f2 + f4 / 2.0f);
            }
        }
        aj aj2 = new aj();
        aj2.a = m2;
        aj2.b = rect;
        aj2.c = this.d;
        aj2.d = this.e;
        return aj2;
    }

    static {
        c.a(true);
        h = new Paint();
        h.b(-65536);
        h.a(Paint$Style.b);
    }
}

