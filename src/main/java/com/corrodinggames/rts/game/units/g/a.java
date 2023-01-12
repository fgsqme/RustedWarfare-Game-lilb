/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.corrodinggames.rts.game.units.g;

import com.corrodinggames.rts.game.units.g.b;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.j.as;
import com.corrodinggames.rts.gameFramework.j.k;

public abstract class a {
    int a;

    public a() {
    }

    public a(int n2) {
        this.a = n2;
    }

    public int a() {
        return this.a;
    }

    public abstract b b();

    public void a(y y2, float f2) {
    }

    public void a(y y2, as as2) {
        as2.a(this.a);
    }

    public void a(y y2, k k2) {
        this.a = k2.f();
    }
}

