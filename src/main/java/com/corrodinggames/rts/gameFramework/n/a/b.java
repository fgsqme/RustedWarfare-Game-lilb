/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.gameFramework.n.a;

import com.corrodinggames.rts.game.b.f;
import com.corrodinggames.rts.game.n;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.gameFramework.n.a;

public class b
extends com.corrodinggames.rts.gameFramework.n.a.a {
    n a;
    g b;

    public static b d(a a2) {
        b b2 = new b();
        b2.a = a2.a();
        if (b2.a == null) {
            throw new f("teamTagDetect requires a team set");
        }
        String string2 = a2.b("teamTag");
        if (string2 != null && !string2.equals((Object)"")) {
            try {
                b2.b = g.b(string2);
            }
            catch (bo bo2) {
                throw new f(bo2.getMessage());
            }
        } else {
            throw new f("teamTagDetect requires a teamTag set");
        }
        return b2;
    }

    @Override
    public boolean b(a a2) {
        return g.a(this.b, this.a.U());
    }
}

