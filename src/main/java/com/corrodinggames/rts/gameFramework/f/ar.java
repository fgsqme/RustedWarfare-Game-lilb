/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.gameFramework.f.au;
import com.corrodinggames.rts.gameFramework.h.a;

strictfp class ar
extends au {
    as a;
    int b;

    public ar(float f2, float f3, as as2) {
        super(f2, f3);
        this.a = as2;
        this.b = 1;
    }

    @Override
    public boolean a(au au2) {
        if (super.a(au2) && au2 instanceof ar) {
            ar ar2 = (ar)au2;
            return ar2.a == this.a;
        }
        return false;
    }

    @Override
    public void b(au au2) {
        this.c = au2.c;
        ++this.b;
        this.g = null;
        this.h = false;
    }

    @Override
    public String a() {
        if (this.g == null) {
            String string2 = "gui.log.unitCreated";
            if (this.a.j()) {
                string2 = "gui.log.buildingConstructed";
            }
            this.g = String.format((String)com.corrodinggames.rts.gameFramework.h.a.a(string2, new Object[0]), (Object[])new Object[]{this.a.e(), this.b});
        }
        return this.g;
    }
}

