/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.gameFramework.f;

strictfp abstract class au
implements Comparable {
    long c;
    long d = 5000L;
    float e;
    float f;
    String g;
    boolean h;
    boolean i;

    public au(float f2, float f3) {
        this.e = f2;
        this.f = f3;
    }

    public int c(au au2) {
        return (int)(au2.c - this.c);
    }

    public boolean a(au au2) {
        if (this.c + this.b() < System.currentTimeMillis()) {
            return false;
        }
        float f2 = com.corrodinggames.rts.gameFramework.f.a(this.e, this.f, au2.e, au2.f);
        return !(f2 > 90000.0f);
    }

    protected long b() {
        return 5000L;
    }

    public abstract void b(au var1);

    public abstract String a();

    public /* synthetic */ int compareTo(Object object) {
        return this.c((au)object);
    }
}

