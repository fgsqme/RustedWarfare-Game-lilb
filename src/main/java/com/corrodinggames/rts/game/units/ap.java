/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.am;

public strictfp final class ap {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    public float h;
    public float i;
    public am j;
    public float k;
    public float l;
    public boolean m;

    public void a(float f2) {
        this.b = this.a = f2;
        this.c = 0.0f;
        this.d = 0.0f;
        this.e = 0.0f;
        this.f = 0.0f;
        this.g = false;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = null;
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = false;
    }

    public final void a(int n2) {
        if (this.d < (float)n2 && this.d >= 0.0f) {
            this.d = n2;
        }
    }

    public final void b(int n2) {
        if (this.d > (float)(-n2)) {
            this.d = -n2;
        }
    }

    public final boolean a() {
        return this.d == 0.0f;
    }

    public final boolean b() {
        return this.d < 0.0f;
    }
}

