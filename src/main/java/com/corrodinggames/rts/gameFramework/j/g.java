/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.appFramework.i;
import com.corrodinggames.rts.gameFramework.l;

public class g {
    public boolean a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public int g;
    public boolean h;
    public long i = -1L;
    public String j;
    public String k;
    public int l;
    public boolean m;
    public String n;
    public long o;
    public int p;
    public String q;
    public String r;
    public String s;
    public String t;
    public String u;
    public int v = -1;
    public int w = 8;
    public boolean x;
    public boolean y;
    public String z;
    public int A;

    public boolean a() {
        l l2 = com.corrodinggames.rts.gameFramework.l.B();
        String string2 = l2.bX.bw;
        if (string2 != null) {
            return string2.equals((Object)this.b);
        }
        return false;
    }

    public String b() {
        String string2 = this.c();
        if (string2 != null) {
            String string3 = "";
            String string4 = this.f;
            if (string4 != null) {
                string4 = string4.replace((CharSequence)"\\n", (CharSequence)"\n");
            }
            string3 = string3 + string4 + "\n";
            string3 = string3 + "Url: " + string2 + "\n";
            return string3;
        }
        String string5 = "";
        if (this.a) {
            string5 = string5 + "Lan: " + this.d + ":" + this.g + "\n";
        }
        string5 = string5 + "User: " + this.n + "\n";
        String string6 = com.corrodinggames.rts.appFramework.i.e(this.q);
        string5 = string5 + "Map: " + string6 + "\n";
        if (this.m) {
            string5 = string5 + "Password Required\n";
        }
        if (!this.h && !this.a) {
            string5 = string5 + "Port: not open (Connecting over the internet may fail)\n";
        }
        string5 = "ANY".equalsIgnoreCase(this.k) ? string5 + "Version: " + this.k + "\n" : string5 + "Version: v" + this.k + (this.g() ? "" : " (different game version!)") + "\n";
        if (this.z != null && !this.z.equals((Object)"")) {
            string5 = string5 + "Mods Needed: " + this.z + "\n";
        }
        return string5;
    }

    public String c() {
        return this.e;
    }

    public boolean d() {
        return this.e != null;
    }

    public String e() {
        if (this.A == 0) {
            return this.c + ":" + this.g;
        }
        return "get|" + this.b.replace((CharSequence)"|", (CharSequence)".") + "|" + this.A + "|" + this.m + "|" + this.g;
    }

    public String f() {
        return this.d + ":" + this.g;
    }

    public boolean g() {
        l l2 = com.corrodinggames.rts.gameFramework.l.B();
        if (this.x && "ANY".equals((Object)this.k)) {
            return true;
        }
        if (this.x && this.k != null && this.k.contains((CharSequence)"+") && l2.c(true) >= this.l) {
            return true;
        }
        return l2.c(true) == this.l;
    }
}

