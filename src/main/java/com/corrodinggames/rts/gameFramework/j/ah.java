/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.j.ai;
import com.corrodinggames.rts.gameFramework.j.as;
import com.corrodinggames.rts.gameFramework.j.k;

public strictfp class ah
implements Cloneable {
    public ai a = ai.a;
    public String b = "[z;p10]Crossing Large (10p).tmx";
    public int c = 0;
    public int d = 2;
    public boolean e = true;
    public int f = 1;
    public int g = 1;
    public float h = 1.0f;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean l;
    public boolean m = false;
    public boolean n = false;
    public boolean o = true;
    public boolean p = false;
    public int q;

    public void a() {
        this.a = ai.a;
        this.b = "[z;p10]Crossing Large (10p).tmx";
    }

    public String b() {
        String string2 = "";
        String string3 = "\n";
        string2 = string2 + "startingCredits: " + this.c + string3;
        string2 = string2 + "fogMode: " + this.d + string3;
        string2 = string2 + "revealedMap: " + this.e + string3;
        string2 = string2 + "aiDifficulty: " + this.f + string3;
        string2 = string2 + "startingUnits: " + this.g + string3;
        string2 = string2 + "incomeMultiplier: " + this.h + string3;
        string2 = string2 + "noNukes: " + this.i + string3;
        string2 = string2 + "sharedControl: " + this.l + string3;
        string2 = string2 + "allowSpectators: " + this.o + string3;
        string2 = string2 + "lockedRoom: " + this.p + string3;
        string2 = string2 + "randomSeed: " + this.q + string3;
        return string2;
    }

    public ah c() {
        try {
            return (ah)super.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new RuntimeException((Throwable)cloneNotSupportedException);
        }
    }

    public void a(as as2) {
        as2.c(4);
        as2.a(this.d);
        as2.a(this.c);
        as2.a(this.e);
        as2.a(this.f);
        as2.a(this.g);
        as2.a(this.h);
        as2.a(this.i);
        as2.a(this.j);
        as2.a(this.l);
        as2.a(this.m);
        as2.a(this.n);
        as2.a(this.o);
        as2.a(this.p);
        as2.a(this.q);
    }

    public void a(k k2) {
        byte by = k2.d();
        this.d = k2.f();
        this.c = k2.f();
        this.e = k2.e();
        this.f = k2.f();
        this.g = k2.f();
        this.h = k2.g();
        this.i = k2.e();
        this.j = k2.e();
        this.l = k2.e();
        if (by >= 1) {
            this.m = k2.e();
        }
        if (by >= 2) {
            this.n = k2.e();
        }
        if (by >= 3) {
            this.o = k2.e();
            this.p = k2.e();
        }
        if (by >= 4) {
            this.q = k2.f();
        }
    }

    public /* synthetic */ Object clone() {
        return this.c();
    }
}

