/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.j.ak;

public strictfp class al {
    public String a;
    public long b;
    boolean c;
    final /* synthetic */ ak d;

    public al(ak ak2, String string2) {
        this(ak2, string2, true);
    }

    public al(ak ak2, String string2, boolean bl2) {
        this.d = ak2;
        this.a = string2;
        this.c = bl2;
        ak2.b.add((Object)this);
    }
}

