/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.corrodinggames.rts.gameFramework;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.bs;
import com.corrodinggames.rts.gameFramework.bu;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.l;

public final class br {
    l a;
    public int b = 0;
    public static int c = 40;
    public int d = 0;
    bu e = new bu(this);
    Paint f = new Paint();
    Rect g = new Rect();
    int h = -1;

    public br(l l2) {
        this.a = l2;
    }

    public static final long a() {
        return System.nanoTime();
    }

    public static final float a(long l2) {
        return (float)(System.nanoTime() - l2) / 1000000.0f;
    }

    public static final double a(long l2, long l3) {
        return (double)(l3 - l2) / 1000000.0;
    }

    public static final void a(String string2, long l2) {
        l.e(string2 + "" + br.a(br.a(l2)));
    }

    public final void a(bs bs2) {
    }

    public final void b(bs bs2) {
    }

    public static final String a(double d2) {
        return "" + com.corrodinggames.rts.gameFramework.f.a(d2, 3) + "ms";
    }

    public static final String b(double d2) {
        return "" + d2 / 1000000.0 + "ms";
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void a(boolean bl2, boolean bl3) {
    }
}

