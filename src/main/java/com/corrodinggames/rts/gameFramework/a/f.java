/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.gameFramework.a;

import android.content.Context;
import com.corrodinggames.rts.R$raw;
import com.corrodinggames.rts.gameFramework.a.g;
import com.corrodinggames.rts.gameFramework.a.h;
import com.corrodinggames.rts.gameFramework.a.i;
import com.corrodinggames.rts.gameFramework.utility.j;

public class f
extends h {
    @Override
    public void a(Context context) {
    }

    @Override
    public i a(int n2) {
        String string2 = com.corrodinggames.rts.gameFramework.f.a(R$raw.class, n2);
        g g2 = new g(string2, this);
        return g2;
    }

    @Override
    public i a(String string2, j j2, boolean bl2) {
        g g2 = new g(string2, this);
        return g2;
    }

    public static i b() {
        g g2 = new g("Null (from out of memory)", null);
        return g2;
    }

    public static i a(String string2) {
        g g2 = new g("Null sound - " + string2, null);
        return g2;
    }
}

