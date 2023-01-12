/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Iterator
 */
package org.a.a.b;

import java.util.Iterator;

public interface b
extends Iterable {
    public org.a.a.c.b a();

    default public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

