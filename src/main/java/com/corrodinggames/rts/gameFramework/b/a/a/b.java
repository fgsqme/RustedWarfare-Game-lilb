/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.corrodinggames.rts.gameFramework.b.a.a;

import com.corrodinggames.rts.gameFramework.b.a.a;
import com.corrodinggames.rts.gameFramework.b.a.f;

public abstract class b {
    private int a;
    private int b;
    private int c;
    private boolean d = false;

    public void a() {
        this.a(null, null, null);
    }

    public void a(String string2, String string3, a[] aArray) {
        this.b = f.a(35633, string2);
        this.c = f.a(35632, string3);
        this.a = f.a(this.b, this.c, aArray);
        this.d = true;
    }

    public int b() {
        return this.a;
    }
}

