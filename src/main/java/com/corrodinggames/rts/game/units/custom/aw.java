/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.as;
import com.corrodinggames.rts.game.units.custom.at;
import com.corrodinggames.rts.game.units.custom.j;

public abstract class aw
extends at {
    public aw(int n2, String string2) {
        super(n2, string2);
    }

    @Override
    public double a(j j2, as as2) {
        return this.a(as2);
    }

    @Override
    public void a(j j2, double d2) {
        j2.dJ();
        this.a(j2.y, d2);
    }

    public abstract double a(as var1);

    public abstract void a(as var1, double var2);

    @Override
    public boolean b() {
        return false;
    }
}

