/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.corrodinggames.rts.a.a;

import com.corrodinggames.rts.a.a.l;
import com.corrodinggames.rts.a.a.n;
import com.corrodinggames.rts.gameFramework.utility.y;

public class a
extends l {
    public void a() {
        com.corrodinggames.rts.gameFramework.l.e("== Testing GameLogic ==");
        com.corrodinggames.rts.gameFramework.l l2 = com.corrodinggames.rts.gameFramework.l.B();
        l2.by = 1000;
        n.a(y.b(1000, 5));
        n.a(y.b(1000, 1100));
        n.a(y.b(900, 200));
        n.b(y.b(-9999, 200));
        n.b(y.b(1100, 200));
        n.b(y.b(700, 200));
        l2.by = 1000;
        n.a(y.a(500, 300));
        n.b(y.a(900, 300));
    }
}

