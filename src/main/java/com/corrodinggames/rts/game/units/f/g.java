/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.corrodinggames.rts.game.units.f;

import android.graphics.RectF;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.f.e;

public final class g
extends e {
    public RectF a = new RectF();
    public float b;
    public float c;
    public float d;
    public float e;

    public void a(float f2, float f3, float f4, float f5) {
        this.b = f2;
        this.c = f4;
        this.d = f3;
        this.e = f5;
        this.a.a(f2, f3, f4, f5);
    }

    @Override
    public final boolean a(am am2) {
        float f2 = am2.eo;
        float f3 = am2.ep;
        return this.b <= f2 && f2 <= this.c && this.d <= f3 && f3 <= this.e;
    }
}

