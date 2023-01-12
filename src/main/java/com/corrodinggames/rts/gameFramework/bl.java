/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 */
package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.bk;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

public strictfp class bl {
    m a = new m();

    public void a(am am2, am am3) {
        if (this.a.a > 0) {
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                bk bk2 = (bk)iterator.next();
                bk2.a(am2, am3, null);
            }
        }
    }
}

