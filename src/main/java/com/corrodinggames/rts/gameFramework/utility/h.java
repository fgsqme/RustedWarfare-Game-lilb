/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.util.ConcurrentModificationException
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.utility.g;
import com.corrodinggames.rts.gameFramework.utility.g$1;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class h
implements Iterator {
    private int b;
    private int c;
    private int d;
    final /* synthetic */ g a;

    private h(g g2) {
        this.a = g2;
        this.b = g.a(this.a);
        this.c = g.b(this.a);
        this.d = -1;
    }

    public boolean hasNext() {
        return this.b != this.c;
    }

    public Object next() {
        if (this.b == this.c) {
            throw new NoSuchElementException();
        }
        Object object = g.c(this.a)[this.b];
        if (g.b(this.a) != this.c || object == null) {
            throw new ConcurrentModificationException();
        }
        this.d = this.b;
        this.b = this.b + 1 & g.c(this.a).length - 1;
        return object;
    }

    public void remove() {
        if (this.d < 0) {
            throw new IllegalStateException();
        }
        if (g.a(this.a, this.d)) {
            this.b = this.b - 1 & g.c(this.a).length - 1;
            this.c = g.b(this.a);
        }
        this.d = -1;
    }

    /* synthetic */ h(g g2, g$1 g$1) {
        this(g2);
    }
}

