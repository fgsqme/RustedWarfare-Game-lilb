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

import com.corrodinggames.rts.gameFramework.utility.s;
import com.corrodinggames.rts.gameFramework.utility.s$1;
import com.corrodinggames.rts.gameFramework.w;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

class t
implements Iterator {
    private int b;
    private int c;
    private int d;
    final /* synthetic */ s a;

    private t(s s2) {
        this.a = s2;
        this.b = this.a.b;
        this.c = -1;
        this.d = s.a(this.a);
    }

    public boolean hasNext() {
        return this.b != 0;
    }

    public w a() {
        s s2 = this.a;
        int n2 = this.b;
        if (s.b(s2) != this.d) {
            throw new ConcurrentModificationException("on:" + this.a.d + " (modCount:" + s.c(this.a) + " expectedModCount:" + this.d + ")");
        }
        if (n2 == 0) {
            throw new NoSuchElementException();
        }
        this.b = n2 - 1;
        this.c = s2.b - n2;
        return s2.c[this.c];
    }

    public void remove() {
        w[] wArray = this.a.c;
        int n2 = this.c;
        if (s.d(this.a) != this.d) {
            throw new ConcurrentModificationException("on:" + this.a.d + " (modCount:" + s.e(this.a) + " expectedModCount:" + this.d + ")");
        }
        if (n2 < 0) {
            throw new IllegalStateException();
        }
        System.arraycopy((Object)wArray, (int)(n2 + 1), (Object)wArray, (int)n2, (int)this.b);
        wArray[--this.a.b] = null;
        this.c = -1;
        this.d = s.f(this.a);
    }

    public /* synthetic */ Object next() {
        return this.a();
    }

    /* synthetic */ t(s s2, s$1 s$1) {
        this(s2);
    }
}

