/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.System
 *  java.util.ConcurrentModificationException
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.utility.m;
import com.corrodinggames.rts.gameFramework.utility.m$1;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class n
implements Iterator {
    private int b;
    private int c;
    private int d;
    final /* synthetic */ m a;

    private n(m m2) {
        this.a = m2;
        this.b = this.a.a;
        this.c = -1;
        this.d = m.a(this.a);
    }

    public boolean hasNext() {
        return this.b != 0;
    }

    public Object next() {
        m m2 = this.a;
        int n2 = this.b;
        if (m.b(m2) != this.d) {
            throw new ConcurrentModificationException();
        }
        if (n2 == 0) {
            throw new NoSuchElementException();
        }
        this.b = n2 - 1;
        this.c = m2.a - n2;
        return m2.b[this.c];
    }

    public void remove() {
        Object[] objectArray = this.a.b;
        int n2 = this.c;
        if (m.c(this.a) != this.d) {
            throw new ConcurrentModificationException();
        }
        if (n2 < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy((Object)objectArray, (int)(n2 + 1), (Object)objectArray, (int)n2, (int)this.b);
        objectArray[--this.a.a] = null;
        this.c = -1;
        this.d = m.d(this.a);
    }

    /* synthetic */ n(m m2, m$1 m$1) {
        this(m2);
    }
}

