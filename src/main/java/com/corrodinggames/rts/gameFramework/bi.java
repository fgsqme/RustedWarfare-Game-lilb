/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Iterator
 */
package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.bh;
import java.util.ArrayList;
import java.util.Iterator;

public strictfp class bi
extends ArrayList {
    public int a(int n2) {
        if (this.isEmpty()) {
            return 0;
        }
        int n3 = ((bh)this.get((int)0)).b;
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            bh bh2 = (bh)iterator.next();
            if (bh2.a > n2) {
                return n3;
            }
            n3 = bh2.b;
        }
        return n3;
    }
}

