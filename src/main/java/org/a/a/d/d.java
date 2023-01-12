/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Short
 *  java.util.Iterator
 *  java.util.List
 *  java.util.ListIterator
 */
package org.a.a.d;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.a.a.d.c;

public interface d
extends org.a.a.a.d,
c {
    @Override
    public org.a.a.c.d a();

    public org.a.a.e.d b();

    public org.a.a.e.d a(int var1);

    public d a(int var1, int var2);

    @Deprecated
    public Short b(int var1);

    @Override
    default public /* synthetic */ Iterator iterator() {
        return this.a();
    }

    default public /* synthetic */ List subList(int n2, int n3) {
        return this.a(n2, n3);
    }

    default public /* synthetic */ ListIterator listIterator(int n2) {
        return this.a(n2);
    }

    default public /* synthetic */ ListIterator listIterator() {
        return this.b();
    }

    @Deprecated
    default public /* synthetic */ Object remove(int n2) {
        return this.b(n2);
    }
}

