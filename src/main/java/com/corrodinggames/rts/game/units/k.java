/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.n;
import com.corrodinggames.rts.game.units.a.t;
import com.corrodinggames.rts.game.units.a.u;
import com.corrodinggames.rts.game.units.a.x;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.f.g;
import com.corrodinggames.rts.gameFramework.l;

strictfp class k
extends x {
    boolean a;
    boolean b;

    public k(boolean bl2, boolean bl3) {
        super("changeTeam" + bl2 + "d:" + bl3);
        this.a = bl2;
        this.b = bl3;
    }

    @Override
    public String b() {
        if (this.b) {
            return "Selected player";
        }
        if (this.a) {
            return "<- Set player";
        }
        return "Set player ->";
    }

    @Override
    public String d() {
        if (!this.b) {
            if (this.a) {
                return "<-";
            }
            return "->";
        }
        l l2 = l.B();
        n n2 = null;
        Object object = l2.bS.bZ.iterator();
        while (object.hasNext()) {
            am am2 = (am)object.next();
            if (!(am2 instanceof y)) continue;
            y y2 = (y)am2;
            if (!y2.cG || !l2.bS.m(y2)) continue;
            n2 = y2.bX;
        }
        object = "";
        if (n2 != null) {
            object = (String)object + "Team - " + (n2.k + 1) + "";
        }
        return object;
    }

    @Override
    public String a() {
        return "Change targeted player for editor";
    }

    @Override
    public float l() {
        if (!com.corrodinggames.rts.gameFramework.f.g.bP) {
            return 0.8f;
        }
        return 0.5f;
    }

    @Override
    public int m() {
        if (this.b) {
            return 2;
        }
        return 4;
    }

    @Override
    public t f() {
        if (this.b) {
            return t.g;
        }
        return super.f();
    }

    @Override
    public u e() {
        if (this.b) {
            return u.i;
        }
        return super.e();
    }
}

