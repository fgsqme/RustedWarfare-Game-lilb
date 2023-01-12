/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 */
package com.corrodinggames.rts.appFramework;

import android.os.Handler;
import com.corrodinggames.rts.appFramework.b;
import com.corrodinggames.rts.appFramework.p$1;
import com.corrodinggames.rts.gameFramework.j.g;
import com.corrodinggames.rts.gameFramework.j.n;
import com.corrodinggames.rts.gameFramework.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class p
extends b {
    static p c;
    final Handler d;
    private Runnable e;

    public static void l() {
        if (c != null) {
            p.c.d.a(p.c.e);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ArrayList m() {
        Object object = n.f;
        synchronized (object) {
            l l2 = l.B();
            ArrayList arrayList = new ArrayList();
            for (g g2 : l2.bX.bi) {
                arrayList.add((Object)g2);
            }
            Collections.sort((List)arrayList, (Comparator)new p$1());
            return arrayList;
        }
    }
}

