/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.d.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.d.a.b;
import com.corrodinggames.rts.gameFramework.m.e;

strictfp abstract class c {
    final /* synthetic */ b a;

    c(b b2) {
        this.a = b2;
    }

    abstract float a();

    public abstract float a(int var1);

    public abstract float b(int var1);

    public PointF c(int n2) {
        return b.a(this.a, n2);
    }

    public abstract void a(am var1, int var2);

    public abstract e d(int var1);

    public abstract int b();

    public abstract String c();

    public abstract void a(c var1);

    public boolean a(String string2) {
        return this.c().equals((Object)string2);
    }

    public void a(float f2) {
    }

    public float e(int n2) {
        return 5.0f;
    }

    public float f(int n2) {
        return 0.5f;
    }

    public float g(int n2) {
        return 23.0f;
    }

    public float h(int n2) {
        return -1.0f;
    }

    public abstract int d();
}

