/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.System
 *  java.lang.reflect.Array
 *  java.util.AbstractCollection
 *  java.util.ConcurrentModificationException
 *  java.util.Iterator
 */
package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.utility.h;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class g
extends AbstractCollection
implements Serializable,
Cloneable {
    private transient Object[] b = new Object[16];
    private transient int c;
    private transient int d;

    private void c() {
        assert (this.c == this.d);
        int n2 = this.c;
        int n3 = this.b.length;
        int n4 = n3 - n2;
        int n5 = n3 << 1;
        if (n5 < 0) {
            throw new IllegalStateException("Sorry, deque too big");
        }
        Object[] objectArray = new Object[n5];
        System.arraycopy((Object)this.b, (int)n2, (Object)objectArray, (int)0, (int)n4);
        System.arraycopy((Object)this.b, (int)0, (Object)objectArray, (int)n4, (int)n2);
        this.b = objectArray;
        this.c = 0;
        this.d = n3;
    }

    private Object[] a(Object[] objectArray) {
        if (this.c < this.d) {
            System.arraycopy((Object)this.b, (int)this.c, (Object)objectArray, (int)0, (int)this.size());
        } else if (this.c > this.d) {
            int n2 = this.b.length - this.c;
            System.arraycopy((Object)this.b, (int)this.c, (Object)objectArray, (int)0, (int)n2);
            System.arraycopy((Object)this.b, (int)0, (Object)objectArray, (int)n2, (int)this.d);
        }
        return objectArray;
    }

    public void a(Object object) {
        if (object == null) {
            throw new NullPointerException();
        }
        this.b[this.d] = object;
        this.d = this.d + 1 & this.b.length - 1;
        if (this.d == this.c) {
            this.c();
        }
    }

    public Object a() {
        int n2 = this.c;
        Object object = this.b[n2];
        if (object == null) {
            return null;
        }
        this.b[n2] = null;
        this.c = n2 + 1 & this.b.length - 1;
        return object;
    }

    public boolean b(Object object) {
        Object object2;
        if (object == null) {
            return false;
        }
        int n2 = this.b.length - 1;
        int n3 = this.c;
        while ((object2 = this.b[n3]) != null) {
            if (object.equals(object2)) {
                this.a(n3);
                return true;
            }
            n3 = n3 + 1 & n2;
        }
        return false;
    }

    public boolean add(Object object) {
        this.a(object);
        return true;
    }

    private void d() {
        assert (this.b[this.d] == null);
        assert (this.c != this.d ? this.b[this.c] != null && this.b[this.d - 1 & this.b.length - 1] != null : this.b[this.c] == null);
        assert (this.b[this.c - 1 & this.b.length - 1] == null);
    }

    private boolean a(int n2) {
        this.d();
        Object[] objectArray = this.b;
        int n3 = objectArray.length - 1;
        int n4 = this.c;
        int n5 = this.d;
        int n6 = n2 - n4 & n3;
        int n7 = n5 - n2 & n3;
        if (n6 >= (n5 - n4 & n3)) {
            throw new ConcurrentModificationException();
        }
        if (n6 < n7) {
            if (n4 <= n2) {
                System.arraycopy((Object)objectArray, (int)n4, (Object)objectArray, (int)(n4 + 1), (int)n6);
            } else {
                System.arraycopy((Object)objectArray, (int)0, (Object)objectArray, (int)1, (int)n2);
                objectArray[0] = objectArray[n3];
                System.arraycopy((Object)objectArray, (int)n4, (Object)objectArray, (int)(n4 + 1), (int)(n3 - n4));
            }
            objectArray[n4] = null;
            this.c = n4 + 1 & n3;
            return false;
        }
        if (n2 < n5) {
            System.arraycopy((Object)objectArray, (int)(n2 + 1), (Object)objectArray, (int)n2, (int)n7);
            this.d = n5 - 1;
        } else {
            System.arraycopy((Object)objectArray, (int)(n2 + 1), (Object)objectArray, (int)n2, (int)(n3 - n2));
            objectArray[n3] = objectArray[0];
            System.arraycopy((Object)objectArray, (int)1, (Object)objectArray, (int)0, (int)n5);
            this.d = n5 - 1 & n3;
        }
        return true;
    }

    public int size() {
        return this.d - this.c & this.b.length - 1;
    }

    public boolean isEmpty() {
        return this.c == this.d;
    }

    public Iterator iterator() {
        return new h(this, null);
    }

    public boolean contains(Object object) {
        Object object2;
        if (object == null) {
            return false;
        }
        int n2 = this.b.length - 1;
        int n3 = this.c;
        while ((object2 = this.b[n3]) != null) {
            if (object.equals(object2)) {
                return true;
            }
            n3 = n3 + 1 & n2;
        }
        return false;
    }

    public boolean remove(Object object) {
        return this.b(object);
    }

    public void clear() {
        int n2 = this.c;
        int n3 = this.d;
        if (n2 != n3) {
            this.d = 0;
            this.c = 0;
            int n4 = n2;
            int n5 = this.b.length - 1;
            do {
                this.b[n4] = null;
            } while ((n4 = n4 + 1 & n5) != n3);
        }
    }

    public Object[] toArray() {
        return this.a(new Object[this.size()]);
    }

    public Object[] toArray(Object[] objectArray) {
        int n2 = this.size();
        if (objectArray.length < n2) {
            objectArray = (Object[])Array.newInstance((Class)objectArray.getClass().getComponentType(), (int)n2);
        }
        this.a(objectArray);
        if (objectArray.length > n2) {
            objectArray[n2] = null;
        }
        return objectArray;
    }

    public g b() {
        try {
            g g2 = (g)((Object)super.clone());
            g2.b = (Object[])this.b.clone();
            return g2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError();
        }
    }

    public /* synthetic */ Object clone() {
        return this.b();
    }

    static /* synthetic */ int a(g g2) {
        return g2.c;
    }

    static /* synthetic */ int b(g g2) {
        return g2.d;
    }

    static /* synthetic */ Object[] c(g g2) {
        return g2.b;
    }

    static /* synthetic */ boolean a(g g2, int n2) {
        return g2.a(n2);
    }
}

