/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.CloneNotSupportedException
 *  java.lang.Cloneable
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.System
 *  java.lang.reflect.Array
 *  java.util.AbstractList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.RandomAccess
 */
package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.utility.m;
import com.corrodinggames.rts.gameFramework.utility.p;
import com.corrodinggames.rts.gameFramework.utility.q;
import com.corrodinggames.rts.gameFramework.utility.r;
import com.corrodinggames.rts.gameFramework.utility.x;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public final class o
extends AbstractList
implements Serializable,
Cloneable,
RandomAccess {
    public m a = new m();
    public m b = new m();
    public int c;
    transient Object[] d = x.g;

    public void a(Object object) {
        r r2 = this.b.a != 0 ? (r)this.b.b() : new r();
        r2.a = q.a;
        r2.b = object;
        this.a.add(r2);
    }

    public void b(Object object) {
        r r2 = this.b.a != 0 ? (r)this.b.b() : new r();
        r2.a = q.b;
        r2.b = object;
        this.a.add(r2);
    }

    public void a() {
        ++this.modCount;
        if (this.a.a != 0) {
            Iterator iterator = this.a.iterator();
            while (iterator.hasNext()) {
                r r2 = (r)iterator.next();
                if (r2.a == q.a) {
                    Object object = r2.b;
                    if (object == null) {
                        throw new RuntimeException("Trying to insert null into array");
                    }
                    this.add(object);
                } else if (r2.a == q.b) {
                    this.remove(r2.b);
                } else {
                    throw new RuntimeException("Unknown operationType:" + (Object)((Object)r2.a));
                }
                r2.b = null;
            }
            if (this.a.size() < 100) {
                this.b.addAll((Collection)this.a);
            }
            this.a.clear();
        }
    }

    public Object[] b() {
        return this.d;
    }

    public boolean add(Object object) {
        int n2 = this.c;
        Object[] objectArray = this.d;
        if (n2 == objectArray.length) {
            Object[] objectArray2 = new Object[n2 + (n2 < 6 ? 12 : n2 >> 1)];
            System.arraycopy((Object)objectArray, (int)0, (Object)objectArray2, (int)0, (int)n2);
            objectArray = objectArray2;
            this.d = objectArray2;
        }
        objectArray[n2] = object;
        this.c = n2 + 1;
        ++this.modCount;
        return true;
    }

    public void add(int n2, Object object) {
        Object[] objectArray = this.d;
        int n3 = this.c;
        if (n2 > n3 || n2 < 0) {
            o.a(n2, n3);
        }
        if (n3 < objectArray.length) {
            System.arraycopy((Object)objectArray, (int)n2, (Object)objectArray, (int)(n2 + 1), (int)(n3 - n2));
        } else {
            Object[] objectArray2 = new Object[o.a(n3)];
            System.arraycopy((Object)objectArray, (int)0, (Object)objectArray2, (int)0, (int)n2);
            System.arraycopy((Object)objectArray, (int)n2, (Object)objectArray2, (int)(n2 + 1), (int)(n3 - n2));
            objectArray = objectArray2;
            this.d = objectArray2;
        }
        objectArray[n2] = object;
        this.c = n3 + 1;
        ++this.modCount;
    }

    private static int a(int n2) {
        int n3 = n2 < 6 ? 12 : n2 >> 1;
        return n2 + n3;
    }

    public boolean addAll(Collection collection) {
        Object[] objectArray = collection.toArray();
        int n2 = objectArray.length;
        if (n2 == 0) {
            return false;
        }
        int n3 = this.c;
        int n4 = n3 + n2;
        Object[] objectArray2 = this.d;
        if (n4 > objectArray2.length) {
            int n5 = o.a(n4 - 1);
            Object[] objectArray3 = new Object[n5];
            System.arraycopy((Object)objectArray2, (int)0, (Object)objectArray3, (int)0, (int)n3);
            objectArray2 = objectArray3;
            this.d = objectArray3;
        }
        System.arraycopy((Object)objectArray, (int)0, (Object)objectArray2, (int)n3, (int)n2);
        this.c = n4;
        ++this.modCount;
        return true;
    }

    public boolean addAll(int n2, Collection collection) {
        Object[] objectArray;
        int n3;
        int n4 = this.c;
        if (n2 > n4 || n2 < 0) {
            o.a(n2, n4);
        }
        if ((n3 = (objectArray = collection.toArray()).length) == 0) {
            return false;
        }
        int n5 = n4 + n3;
        Object[] objectArray2 = this.d;
        if (n5 <= objectArray2.length) {
            System.arraycopy((Object)objectArray2, (int)n2, (Object)objectArray2, (int)(n2 + n3), (int)(n4 - n2));
        } else {
            int n6 = o.a(n5 - 1);
            Object[] objectArray3 = new Object[n6];
            System.arraycopy((Object)objectArray2, (int)0, (Object)objectArray3, (int)0, (int)n2);
            System.arraycopy((Object)objectArray2, (int)n2, (Object)objectArray3, (int)(n2 + n3), (int)(n4 - n2));
            objectArray2 = objectArray3;
            this.d = objectArray3;
        }
        System.arraycopy((Object)objectArray, (int)0, (Object)objectArray2, (int)n2, (int)n3);
        this.c = n5;
        ++this.modCount;
        return true;
    }

    static IndexOutOfBoundsException a(int n2, int n3) {
        throw new IndexOutOfBoundsException("Invalid index " + n2 + ", size is " + n3);
    }

    public synchronized void clear() {
        this.a.clear();
        if (this.c != 0) {
            Arrays.fill((Object[])this.d, (int)0, (int)this.c, null);
            this.c = 0;
            ++this.modCount;
        }
    }

    public Object clone() {
        try {
            o o2 = (o)((Object)super.clone());
            o2.d = (Object[])this.d.clone();
            return o2;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError();
        }
    }

    public Object get(int n2) {
        if (n2 >= this.c) {
            o.a(n2, this.c);
        }
        return this.d[n2];
    }

    public int size() {
        return this.c;
    }

    public boolean isEmpty() {
        return this.c == 0;
    }

    public boolean contains(Object object) {
        Object[] objectArray = this.d;
        int n2 = this.c;
        if (object != null) {
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!object.equals(objectArray[i2])) continue;
                return true;
            }
        } else {
            for (int i3 = 0; i3 < n2; ++i3) {
                if (objectArray[i3] != null) continue;
                return true;
            }
        }
        return false;
    }

    public int indexOf(Object object) {
        Object[] objectArray = this.d;
        int n2 = this.c;
        if (object != null) {
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!object.equals(objectArray[i2])) continue;
                return i2;
            }
        } else {
            for (int i3 = 0; i3 < n2; ++i3) {
                if (objectArray[i3] != null) continue;
                return i3;
            }
        }
        return -1;
    }

    public int lastIndexOf(Object object) {
        Object[] objectArray = this.d;
        if (object != null) {
            for (int i2 = this.c - 1; i2 >= 0; --i2) {
                if (!object.equals(objectArray[i2])) continue;
                return i2;
            }
        } else {
            for (int i3 = this.c - 1; i3 >= 0; --i3) {
                if (objectArray[i3] != null) continue;
                return i3;
            }
        }
        return -1;
    }

    public Object remove(int n2) {
        Object[] objectArray = this.d;
        int n3 = this.c;
        if (n2 >= n3) {
            o.a(n2, n3);
        }
        Object object = objectArray[n2];
        System.arraycopy((Object)objectArray, (int)(n2 + 1), (Object)objectArray, (int)n2, (int)(--n3 - n2));
        objectArray[n3] = null;
        this.c = n3;
        ++this.modCount;
        return object;
    }

    public boolean remove(Object object) {
        Object[] objectArray = this.d;
        int n2 = this.c;
        if (object != null) {
            for (int i2 = 0; i2 < n2; ++i2) {
                if (!object.equals(objectArray[i2])) continue;
                System.arraycopy((Object)objectArray, (int)(i2 + 1), (Object)objectArray, (int)i2, (int)(--n2 - i2));
                objectArray[n2] = null;
                this.c = n2;
                ++this.modCount;
                return true;
            }
        } else {
            for (int i3 = 0; i3 < n2; ++i3) {
                if (objectArray[i3] != null) continue;
                System.arraycopy((Object)objectArray, (int)(i3 + 1), (Object)objectArray, (int)i3, (int)(--n2 - i3));
                objectArray[n2] = null;
                this.c = n2;
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
        Object[] objectArray = this.d;
        int n4 = this.c;
        if (n2 >= n4) {
            throw new IndexOutOfBoundsException("fromIndex " + n2 + " >= size " + this.c);
        }
        if (n3 > n4) {
            throw new IndexOutOfBoundsException("toIndex " + n3 + " > size " + this.c);
        }
        if (n2 > n3) {
            throw new IndexOutOfBoundsException("fromIndex " + n2 + " > toIndex " + n3);
        }
        System.arraycopy((Object)objectArray, (int)n3, (Object)objectArray, (int)n2, (int)(n4 - n3));
        int n5 = n3 - n2;
        Arrays.fill((Object[])objectArray, (int)(n4 - n5), (int)n4, null);
        this.c = n4 - n5;
        ++this.modCount;
    }

    public Object set(int n2, Object object) {
        Object[] objectArray = this.d;
        if (n2 >= this.c) {
            o.a(n2, this.c);
        }
        Object object2 = objectArray[n2];
        objectArray[n2] = object;
        return object2;
    }

    public Object[] toArray() {
        int n2 = this.c;
        Object[] objectArray = new Object[n2];
        System.arraycopy((Object)this.d, (int)0, (Object)objectArray, (int)0, (int)n2);
        return objectArray;
    }

    public Object[] toArray(Object[] objectArray) {
        int n2 = this.c;
        if (objectArray.length < n2) {
            Object[] objectArray2 = (Object[])Array.newInstance((Class)objectArray.getClass().getComponentType(), (int)n2);
            objectArray = objectArray2;
        }
        System.arraycopy((Object)this.d, (int)0, (Object)objectArray, (int)0, (int)n2);
        if (objectArray.length > n2) {
            objectArray[n2] = null;
        }
        return objectArray;
    }

    public Iterator iterator() {
        return new p(this, null);
    }

    public int hashCode() {
        Object[] objectArray = this.d;
        int n2 = 1;
        int n3 = this.c;
        for (int i2 = 0; i2 < n3; ++i2) {
            Object object = objectArray[i2];
            n2 = 31 * n2 + (object == null ? 0 : object.hashCode());
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
        int n2 = this.c;
        if (list.size() != n2) {
            return false;
        }
        Object[] objectArray = this.d;
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < n2; ++i2) {
                Object object2 = objectArray[i2];
                Object object3 = list.get(i2);
                if (!(object2 == null ? object3 != null : !object2.equals(object3))) continue;
                return false;
            }
        } else {
            Iterator iterator = list.iterator();
            for (int i3 = 0; i3 < n2; ++i3) {
                Object object4 = objectArray[i3];
                Object object5 = iterator.next();
                if (!(object4 == null ? object5 != null : !object4.equals(object5))) continue;
                return false;
            }
        }
        return true;
    }

    static /* synthetic */ int a(o o2) {
        return o2.modCount;
    }

    static /* synthetic */ int b(o o2) {
        return o2.modCount;
    }

    static /* synthetic */ int c(o o2) {
        return o2.modCount;
    }

    static /* synthetic */ int d(o o2) {
        return ++o2.modCount;
    }
}

