/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 */
package com.corrodinggames.rts.gameFramework.n;

import android.graphics.Color;
import android.graphics.Paint;
import com.corrodinggames.rts.game.b.f;
import com.corrodinggames.rts.game.n;
import com.corrodinggames.rts.game.units.ak;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bb;
import com.corrodinggames.rts.game.units.custom.bp;
import com.corrodinggames.rts.gameFramework.j.ad;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.n.b;
import com.corrodinggames.rts.gameFramework.n.e;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

public class a {
    public String a;
    public String b;
    public String c;
    public b d = new b();
    public b e = new b();
    public m f = new m();
    public e g;
    public boolean h;
    public boolean i;
    public boolean j;
    public int k;
    public int l;
    public boolean m;
    public int n = -1;
    public int o = Integer.MAX_VALUE;
    public int p;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public com.corrodinggames.rts.game.b.a t;
    public boolean u = false;
    public bp v;
    public float w;
    public float x;
    public n y;
    public bb z;
    public bb A;
    public Paint B;
    public boolean C;

    public void a(com.corrodinggames.rts.gameFramework.n.a.a a2) {
        this.f.add(a2);
    }

    public void a(String string2) {
        this.t.b(string2);
    }

    public String b(String string2) {
        return this.t.b(string2);
    }

    public String a(String string2, String string3) {
        return this.t.a(string2, string3);
    }

    public boolean c(String string2) {
        return this.t.b(string2) != null;
    }

    public int a(String string2, int n2) {
        String string3 = this.a(string2, (String)null);
        if (string3 == null) {
            return n2;
        }
        try {
            return Integer.parseInt((String)string3);
        }
        catch (NumberFormatException numberFormatException) {
            throw this.f(string2 + ": Unexpected integer value:'" + string3 + "'");
        }
    }

    public int b(String string2, int n2) {
        double d2;
        String string3;
        String string4 = string3 = this.b(string2);
        if (string3 == null) {
            return n2;
        }
        double d3 = 1.0;
        if (string3.endsWith("ms")) {
            string3 = string3.substring(0, string3.length() - 2);
            d3 = 1.0;
        } else if (string3.endsWith("s")) {
            string3 = string3.substring(0, string3.length() - 1);
            d3 = 1000.0;
        } else {
            d3 = 1.0;
        }
        try {
            d2 = Double.parseDouble((String)string3);
        }
        catch (NumberFormatException numberFormatException) {
            numberFormatException.printStackTrace();
            throw this.f(string2 + ": Unexpected time:'" + string4 + "'");
        }
        return (int)(d2 * d3);
    }

    public float a(String string2, float f2) {
        String string3 = this.a(string2, (String)null);
        if (string3 == null) {
            return f2;
        }
        try {
            return Float.parseFloat((String)string3);
        }
        catch (NumberFormatException numberFormatException) {
            throw this.f(string2 + ": Unexpected float value:'" + string3 + "'");
        }
    }

    public Integer d(String string2) {
        String string3 = this.a(string2, (String)null);
        if (string3 == null) {
            return null;
        }
        try {
            return Integer.parseInt((String)string3);
        }
        catch (NumberFormatException numberFormatException) {
            throw this.f(string2 + ": Unexpected integer value:'" + string3 + "'");
        }
    }

    public Boolean e(String string2) {
        String string3 = this.a(string2, (String)null);
        if (string3 == null) {
            return null;
        }
        if (string3.equalsIgnoreCase("true")) {
            return true;
        }
        if (string3.equalsIgnoreCase("false")) {
            return false;
        }
        throw this.f(string2 + ": Unexpected boolean value:'" + string3 + "'");
    }

    public boolean a(String string2, String string3, boolean bl2) {
        Boolean bl3 = this.e(string2);
        if (bl3 != null) {
            return bl3;
        }
        bl3 = this.e(string3);
        if (bl3 != null) {
            return bl3;
        }
        return bl2;
    }

    public boolean a(String string2, boolean bl2) {
        String string3 = this.a(string2, (String)null);
        if (string3 == null) {
            return bl2;
        }
        if (string3.equalsIgnoreCase("true")) {
            return true;
        }
        if (string3.equalsIgnoreCase("false")) {
            return false;
        }
        throw this.f(string2 + ": Unexpected boolean value:'" + string3 + "'");
    }

    public int c(String string2, int n2) {
        String string3 = this.b(string2);
        if (string3 == null) {
            return n2;
        }
        if (string3.equals((Object)"")) {
            throw this.f(string2 + ": Unknown color:" + string3);
        }
        try {
            return Color.a(string3);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw this.f(string2 + ": Unknown color:" + string3);
        }
    }

    public bb a(String string2, bb bb2) {
        return this.t.a(string2, bb2);
    }

    public boolean a(am am2) {
        return this.t.a(am2);
    }

    public f f(String string2) {
        return this.a(string2, (Exception)null);
    }

    public f a(String string2, Exception exception) {
        string2 = "MapTrigger-Error (" + this.a + " id:" + this.b + "): " + string2;
        ad.g(string2);
        if (exception == null) {
            return new f(string2);
        }
        return new f(string2, exception);
    }

    public void g(String string2) {
        ad.g("MapTrigger-Error (" + this.a + " id:" + this.b + " type:" + (Object)((Object)this.g) + "): " + string2);
    }

    public void h(String string2) {
        com.corrodinggames.rts.gameFramework.l.e("MapTrigger-Debug (" + this.b + " type:" + (Object)((Object)this.g) + "): " + string2);
    }

    public n a() {
        return this.y;
    }

    public int b() {
        return (int)this.t.j.d();
    }

    public int c() {
        return (int)this.t.j.e();
    }

    public boolean b(am am2) {
        ak ak2;
        n n2 = this.a();
        if (n2 != null && am2.bX != n2) {
            return false;
        }
        boolean bl2 = this.c("onlyIfEmpty");
        return !bl2 || !am2.cr() || !(am2 instanceof ak) || (ak2 = (ak)((Object)am2)).bB() <= 0;
    }

    public boolean d() {
        boolean bl2;
        l l2 = com.corrodinggames.rts.gameFramework.l.B();
        int n2 = l2.by;
        boolean bl3 = true;
        boolean bl4 = false;
        if (!this.m && this.r != -1) {
            if (this.r <= n2) {
                bl4 = true;
                this.m = true;
            } else {
                bl3 = false;
            }
        }
        if (this.d.a()) {
            if (this.d.b()) {
                bl4 = true;
            } else {
                bl3 = false;
            }
        }
        if (this.f.a > 0) {
            Iterator iterator = this.f.iterator();
            while (iterator.hasNext()) {
                com.corrodinggames.rts.gameFramework.n.a.a a2 = (com.corrodinggames.rts.gameFramework.n.a.a)iterator.next();
                if (!a2.a(this)) continue;
                if (a2.b(this)) {
                    bl4 = true;
                    continue;
                }
                bl3 = false;
            }
        }
        if (this.h) {
            bl2 = bl4 && bl3;
        } else {
            bl2 = bl4;
            if (bl3) {
                bl2 = true;
            }
        }
        if (bl2) {
            if (this.n == -1) {
                this.n = n2;
            }
            if (this.s <= 0) {
                return true;
            }
            return n2 >= this.n + this.s;
        }
        this.n = -1;
        return false;
    }
}

