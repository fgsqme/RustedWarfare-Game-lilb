/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.IllegalArgumentException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.System
 *  java.lang.reflect.Array
 *  java.util.AbstractList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.RandomAccess
 */
package com.corrodinggames.rts.gameFramework.k;

import com.corrodinggames.rts.gameFramework.k.b;
import com.corrodinggames.rts.gameFramework.k.n;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class a
extends AbstractList
implements Serializable,
Cloneable,
RandomAccess {
    public static final n[] a = new n[0];
    public int b;
    transient n[] c;

    public a(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("capacity < 0: " + n2);
        }
        this.c = n2 == 0 ? a : new n[n2];
    }

    public a() {
        this.c = a;
    }

    public n[] a() {
        return this.c;
    }

    public boolean a(n n2) {
        int n3 = this.b;
        n[] nArray = this.c;
        if (n3 == nArray.length) {
            n[] nArray2 = new n[n3 + (n3 < 6 ? 12 : n3 >> 1)];
            System.arraycopy((Object)nArray, (int)0, (Object)nArray2, (int)0, (int)n3);
            nArray = nArray2;
            this.c = nArray2;
        }
        nArray[n3] = n2;
        this.b = n3 + 1;
        ++this.modCount;
        return true;
    }

    public void b(n n2) {
        int n3 = this.b;
        n[] nArray = this.c;
        if (n3 == nArray.length) {
            n[] nArray2 = new n[n3 + (n3 < 6 ? 12 : n3 >> 1)];
            System.arraycopy((Object)nArray, (int)0, (Object)nArray2, (int)0, (int)n3);
            nArray = nArray2;
            this.c = nArray2;
        }
        nArray[n3] = n2;
        this.b = n3 + 1;
    }

    public void a(int n2, n n3) {
        n[] nArray = this.c;
        int n4 = this.b;
        if (n2 > n4 || n2 < 0) {
            com.corrodinggames.rts.gameFramework.k.a.a(n2, n4);
        }
        if (n4 < nArray.length) {
            System.arraycopy((Object)nArray, (int)n2, (Object)nArray, (int)(n2 + 1), (int)(n4 - n2));
        } else {
            n[] nArray2 = new n[com.corrodinggames.rts.gameFramework.k.a.c(n4)];
            System.arraycopy((Object)nArray, (int)0, (Object)nArray2, (int)0, (int)n2);
            System.arraycopy((Object)nArray, (int)n2, (Object)nArray2, (int)(n2 + 1), (int)(n4 - n2));
            nArray = nArray2;
            this.c = nArray2;
        }
        nArray[n2] = n3;
        this.b = n4 + 1;
        ++this.modCount;
    }

    private static int c(int n2) {
        int n3 = n2 < 6 ? 12 : n2 >> 1;
        return n2 + n3;
    }

    public boolean addAll(Collection collection) {
        n[] nArray = (n[])collection.toArray();
        int n2 = nArray.length;
        if (n2 == 0) {
            return false;
        }
        int n3 = this.b;
        int n4 = n3 + n2;
        n[] nArray2 = this.c;
        if (n4 > nArray2.length) {
            int n5 = com.corrodinggames.rts.gameFramework.k.a.c(n4 - 1);
            n[] nArray3 = new n[n5];
            System.arraycopy((Object)nArray2, (int)0, (Object)nArray3, (int)0, (int)n3);
            nArray2 = nArray3;
            this.c = nArray3;
        }
        System.arraycopy((Object)nArray, (int)0, (Object)nArray2, (int)n3, (int)n2);
        this.b = n4;
        ++this.modCount;
        return true;
    }

    public boolean addAll(int n2, Collection collection) {
        n[] nArray;
        int n3;
        int n4 = this.b;
        if (n2 > n4 || n2 < 0) {
            com.corrodinggames.rts.gameFramework.k.a.a(n2, n4);
        }
        if ((n3 = (nArray = (n[])collection.toArray()).length) == 0) {
            return false;
        }
        int n5 = n4 + n3;
        n[] nArray2 = this.c;
        if (n5 <= nArray2.length) {
            System.arraycopy((Object)nArray2, (int)n2, (Object)nArray2, (int)(n2 + n3), (int)(n4 - n2));
        } else {
            int n6 = com.corrodinggames.rts.gameFramework.k.a.c(n5 - 1);
            n[] nArray3 = new n[n6];
            System.arraycopy((Object)nArray2, (int)0, (Object)nArray3, (int)0, (int)n2);
            System.arraycopy((Object)nArray2, (int)n2, (Object)nArray3, (int)(n2 + n3), (int)(n4 - n2));
            nArray2 = nArray3;
            this.c = nArray3;
        }
        System.arraycopy((Object)nArray, (int)0, (Object)nArray2, (int)n2, (int)n3);
        this.b = n5;
        ++this.modCount;
        return true;
    }

    static IndexOutOfBoundsException a(int n2, int n3) {
        throw new IndexOutOfBoundsException("Invalid index " + n2 + ", size is " + n3);
    }

    public void clear() {
        if (this.b != 0) {
            Arrays.fill((Object[])this.c, (int)0, (int)this.b, null);
            this.b = 0;
            ++this.modCount;
        }
    }

    public Object clone() {
        try {
            a a2 = (a)((Object)super.clone());
            a2.c = (n[])this.c.clone();
            return a2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError();
        }
    }

    public n a(int n2) {
        if (n2 >= this.b) {
            com.corrodinggames.rts.gameFramework.k.a.a(n2, this.b);
        }
        return this.c[n2];
    }

    public final int size() {
        return this.b;
    }

    public final boolean isEmpty() {
        return this.b == 0;
    }

    public boolean contains(Object object) {
        n[] nArray = this.c;
        int n2 = this.b;
        if (object != null) {
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!object.equals((Object)nArray[i2])) continue;
                return true;
            }
        } else {
            for (int i3 = 0; i3 < n2; ++i3) {
                if (nArray[i3] != null) continue;
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object object) {
        n[] nArray = this.c;
        int n2 = this.b;
        if (object != null) {
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!object.equals((Object)nArray[i2])) continue;
                return i2;
            }
        } else {
            for (int i3 = 0; i3 < n2; ++i3) {
                if (nArray[i3] != null) continue;
                return i3;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object object) {
        n[] nArray = this.c;
        if (object != null) {
            for (int i2 = this.b - 1; i2 >= 0; --i2) {
                if (!object.equals((Object)nArray[i2])) continue;
                return i2;
            }
        } else {
            for (int i3 = this.b - 1; i3 >= 0; --i3) {
                if (nArray[i3] != null) continue;
                return i3;
            }
        }
        return -1;
    }

    public n b(int n2) {
        n[] nArray = this.c;
        int n3 = this.b;
        if (n2 >= n3) {
            com.corrodinggames.rts.gameFramework.k.a.a(n2, n3);
        }
        n n4 = nArray[n2];
        System.arraycopy((Object)nArray, (int)(n2 + 1), (Object)nArray, (int)n2, (int)(--n3 - n2));
        nArray[n3] = null;
        this.b = n3;
        ++this.modCount;
        return n4;
    }

    public n b() {
        n[] nArray = this.c;
        int n2 = this.b - 1;
        n n3 = nArray[n2];
        nArray[n2] = null;
        this.b = n2;
        return n3;
    }

    public boolean remove(Object object) {
        n[] nArray = this.c;
        int n2 = this.b;
        if (object != null) {
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!object.equals((Object)nArray[i2])) continue;
                System.arraycopy((Object)nArray, (int)(i2 + 1), (Object)nArray, (int)i2, (int)(--n2 - i2));
                nArray[n2] = null;
                this.b = n2;
                ++this.modCount;
                return true;
            }
        } else {
            for (int i3 = 0; i3 < n2; ++i3) {
                if (nArray[i3] != null) continue;
                System.arraycopy((Object)nArray, (int)(i3 + 1), (Object)nArray, (int)i3, (int)(--n2 - i3));
                nArray[n2] = null;
                this.b = n2;
                ++this.modCount;
                return true;
            }
        }
        return false;
    }

    protected void removeRange(int n2, int n3) {
        if (n2 == n3) {
            return;
        }
        Object[] objectArray = this.c;
        int n4 = this.b;
        if (n2 >= n4) {
            throw new IndexOutOfBoundsException("fromIndex " + n2 + " >= size " + this.b);
        }
        if (n3 > n4) {
            throw new IndexOutOfBoundsException("toIndex " + n3 + " > size " + this.b);
        }
        if (n2 > n3) {
            throw new IndexOutOfBoundsException("fromIndex " + n2 + " > toIndex " + n3);
        }
        System.arraycopy((Object)objectArray, (int)n3, (Object)objectArray, (int)n2, (int)(n4 - n3));
        int n5 = n3 - n2;
        Arrays.fill((Object[])objectArray, (int)(n4 - n5), (int)n4, null);
        this.b = n4 - n5;
        ++this.modCount;
    }

    public n b(int n2, n n3) {
        n[] nArray = this.c;
        if (n2 >= this.b) {
            com.corrodinggames.rts.gameFramework.k.a.a(n2, this.b);
        }
        n n4 = nArray[n2];
        nArray[n2] = n3;
        return n4;
    }

    public Object[] toArray() {
        int n2 = this.b;
        Object[] objectArray = new Object[n2];
        System.arraycopy((Object)this.c, (int)0, (Object)objectArray, (int)0, (int)n2);
        return objectArray;
    }

    public Object[] toArray(Object[] objectArray) {
        int n2 = this.b;
        if (objectArray.length < n2) {
            Object[] objectArray2 = (Object[])Array.newInstance((Class)objectArray.getClass().getComponentType(), (int)n2);
            objectArray = objectArray2;
        }
        System.arraycopy((Object)this.c, (int)0, (Object)objectArray, (int)0, (int)n2);
        if (objectArray.length > n2) {
            objectArray[n2] = null;
        }
        return objectArray;
    }

    public Iterator iterator() {
        return new b(this, null);
    }

    public int hashCode() {
        n[] nArray = this.c;
        int n2 = 1;
        int n3 = this.b;
        for (int i2 = 0; i2 < n3; ++i2) {
            n n4 = nArray[i2];
            n2 = 31 * n2 + (n4 == null ? 0 : n4.hashCode());
        }
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        List list = (List)object;
        int n2 = this.b;
        if (list.size() != n2) {
            return false;
        }
        n[] nArray = this.c;
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < n2; ++i2) {
                n n3 = nArray[i2];
                Object object2 = list.get(i2);
                if (!(n3 == null ? object2 != null : !n3.equals(object2))) continue;
                return false;
            }
        } else {
            Iterator iterator = list.iterator();
            for (int i3 = 0; i3 < n2; ++i3) {
                n n4 = nArray[i3];
                Object object3 = iterator.next();
                if (!(n4 == null ? object3 != null : !n4.equals(object3))) continue;
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ Object remove(int n2) {
        return this.b(n2);
    }

    public /* synthetic */ void add(int n2, Object object) {
        this.a(n2, (n)object);
    }

    public /* synthetic */ Object set(int n2, Object object) {
        return this.b(n2, (n)object);
    }

    public /* synthetic */ Object get(int n2) {
        return this.a(n2);
    }

    public /* synthetic */ boolean add(Object object) {
        return this.a((n)object);
    }

    static /* synthetic */ int a(a a2) {
        return a2.modCount;
    }

    static /* synthetic */ int b(a a2) {
        return a2.modCount;
    }

    static /* synthetic */ int c(a a2) {
        return a2.modCount;
    }

    static /* synthetic */ int d(a a2) {
        return ++a2.modCount;
    }
}

