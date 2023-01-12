/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.util.Iterator
 */
package org.a.a.a;

import java.util.Iterator;
import org.a.a.a.c;

public interface b
extends c,
org.a.a.b.b {
    @Override
    public org.a.a.c.b a();

    @Override
    default public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

