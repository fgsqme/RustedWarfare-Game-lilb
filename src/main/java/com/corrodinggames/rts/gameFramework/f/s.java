/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 */
package com.corrodinggames.rts.gameFramework.f;

import android.graphics.Paint;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.f.o;
import com.corrodinggames.rts.gameFramework.m.m;
import com.corrodinggames.rts.gameFramework.m.y;

public class s
extends m {
    float[] a;
    int b = 0;
    Paint c;
    int d;
    boolean e;
    private final RectF f = new RectF();

    s(int n2, Paint paint) {
        this.d = n2;
        this.a = new float[n2 * 2];
        this.c = paint;
    }

    public final void a(float f2, float f3) {
        this.a[this.b] = f2;
        this.a[this.b + 1] = f3;
        this.b += 2;
    }

    @Override
    public void a(y y2) {
        if (!this.e) {
            y2.a(this.a, 0, this.b, this.c);
        } else {
            RectF rectF = this.f;
            float f2 = this.c.g();
            for (int i2 = 0; i2 < this.b; ++i2) {
                float f3 = this.a[i2];
                float f4 = this.a[i2 + 1];
                rectF.a = f3;
                rectF.b = f4;
                rectF.c = f3 + f2;
                rectF.d = f4 + f2;
                y2.a(rectF, this.c);
            }
        }
        o.a(this);
    }
}

