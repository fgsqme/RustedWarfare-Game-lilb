/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.gameFramework.f;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.f.ae;
import com.corrodinggames.rts.gameFramework.f.ai;

public class ag
extends ai {
    public Paint a;
    public int b;
    final /* synthetic */ ae c;

    ag(ae ae2, String string2, Paint paint) {
        this.c = ae2;
        super(ae2, string2);
        this.b = 0;
        this.a = paint;
    }

    ag(ae ae2, String string2, Paint paint, int n2) {
        this.c = ae2;
        super(ae2, string2);
        this.b = 0;
        this.a = paint;
        this.b = n2;
    }

    @Override
    public Paint b(Paint paint) {
        if (this.a == null) {
            if (this.b != 0) {
                ae.f.a(paint);
                ae.f.b(this.b);
                return ae.f;
            }
            return paint;
        }
        if (this.b != 0) {
            ae.f.a(this.a);
            ae.f.b(this.b);
            return ae.f;
        }
        return this.a;
    }

    public ag a(String string2) {
        ag ag2 = new ag(this.c, string2, this.a, this.b);
        return ag2;
    }

    @Override
    public /* synthetic */ ai b(String string2) {
        return this.a(string2);
    }
}

