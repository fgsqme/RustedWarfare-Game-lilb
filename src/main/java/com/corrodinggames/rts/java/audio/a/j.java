/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package com.corrodinggames.rts.java.audio.a;

import com.corrodinggames.rts.java.audio.a.c;
import com.corrodinggames.rts.java.audio.a.i;
import com.corrodinggames.rts.java.audio.a.k;
import com.corrodinggames.rts.java.audio.a.l;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class j
extends l
implements Iterable,
Iterator {
    private k f = new k();

    public j(i i2) {
        super(i2);
    }

    public k a() {
        if (!this.a) {
            throw new NoSuchElementException();
        }
        if (!this.e) {
            throw new c("#iterator() cannot be used nested.");
        }
        long[] lArray = this.b.b;
        if (this.c == -1) {
            this.f.a = 0L;
            this.f.b = this.b.f;
        } else {
            this.f.a = lArray[this.c];
            this.f.b = this.b.c[this.c];
        }
        this.d = this.c;
        this.c();
        return this.f;
    }

    public boolean hasNext() {
        if (!this.e) {
            throw new c("#iterator() cannot be used nested.");
        }
        return this.a;
    }

    public Iterator iterator() {
        return this;
    }

    @Override
    public void remove() {
        super.remove();
    }

    public /* synthetic */ Object next() {
        return this.a();
    }
}

