/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 */
package com.corrodinggames.rts.java.audio.a;

import com.corrodinggames.rts.java.audio.a.j;
import com.corrodinggames.rts.java.audio.a.m;
import java.util.Iterator;

public class i
implements Iterable {
    public int a;
    long[] b;
    Object[] c;
    int d;
    int e;
    Object f;
    boolean g;
    private float h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private j n;
    private j o;

    public i() {
        this(51, 0.8f);
    }

    public i(int n2, float f2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("initialCapacity must be >= 0: " + n2);
        }
        if ((n2 = com.corrodinggames.rts.java.audio.a.m.b((int)Math.ceil((double)((float)n2 / f2)))) > 0x40000000) {
            throw new IllegalArgumentException("initialCapacity is too large: " + n2);
        }
        this.d = n2;
        if (f2 <= 0.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0: " + f2);
        }
        this.h = f2;
        this.k = (int)((float)this.d * f2);
        this.j = this.d - 1;
        this.i = 63 - Long.numberOfTrailingZeros((long)this.d);
        this.l = Math.max((int)3, (int)((int)Math.ceil((double)Math.log((double)this.d)) * 2));
        this.m = Math.max((int)Math.min((int)this.d, (int)8), (int)((int)Math.sqrt((double)this.d) / 8));
        this.b = new long[this.d + this.l];
        this.c = new Object[this.b.length];
    }

    public Object a(long l2, Object object) {
        int n2;
        if (l2 == 0L) {
            Object object2 = this.f;
            this.f = object;
            if (!this.g) {
                this.g = true;
                ++this.a;
            }
            return object2;
        }
        long[] lArray = this.b;
        int n3 = (int)(l2 & (long)this.j);
        long l3 = lArray[n3];
        if (l3 == l2) {
            Object object3 = this.c[n3];
            this.c[n3] = object;
            return object3;
        }
        int n4 = this.f(l2);
        long l4 = lArray[n4];
        if (l4 == l2) {
            Object object4 = this.c[n4];
            this.c[n4] = object;
            return object4;
        }
        int n5 = this.g(l2);
        long l5 = lArray[n5];
        if (l5 == l2) {
            Object object5 = this.c[n5];
            this.c[n5] = object;
            return object5;
        }
        int n6 = n2 + this.e;
        for (n2 = this.d; n2 < n6; ++n2) {
            if (lArray[n2] != l2) continue;
            Object object6 = this.c[n2];
            this.c[n2] = object;
            return object6;
        }
        if (l3 == 0L) {
            lArray[n3] = l2;
            this.c[n3] = object;
            if (this.a++ >= this.k) {
                this.b(this.d << 1);
            }
            return null;
        }
        if (l4 == 0L) {
            lArray[n4] = l2;
            this.c[n4] = object;
            if (this.a++ >= this.k) {
                this.b(this.d << 1);
            }
            return null;
        }
        if (l5 == 0L) {
            lArray[n5] = l2;
            this.c[n5] = object;
            if (this.a++ >= this.k) {
                this.b(this.d << 1);
            }
            return null;
        }
        this.a(l2, object, n3, l3, n4, l4, n5, l5);
        return null;
    }

    private void b(long l2, Object object) {
        if (l2 == 0L) {
            this.f = object;
            this.g = true;
            return;
        }
        int n2 = (int)(l2 & (long)this.j);
        long l3 = this.b[n2];
        if (l3 == 0L) {
            this.b[n2] = l2;
            this.c[n2] = object;
            if (this.a++ >= this.k) {
                this.b(this.d << 1);
            }
            return;
        }
        int n3 = this.f(l2);
        long l4 = this.b[n3];
        if (l4 == 0L) {
            this.b[n3] = l2;
            this.c[n3] = object;
            if (this.a++ >= this.k) {
                this.b(this.d << 1);
            }
            return;
        }
        int n4 = this.g(l2);
        long l5 = this.b[n4];
        if (l5 == 0L) {
            this.b[n4] = l2;
            this.c[n4] = object;
            if (this.a++ >= this.k) {
                this.b(this.d << 1);
            }
            return;
        }
        this.a(l2, object, n2, l3, n3, l4, n4, l5);
    }

    private void a(long l2, Object object, int n2, long l3, int n3, long l4, int n4, long l5) {
        Object object2;
        long l6;
        long[] lArray = this.b;
        Object[] objectArray = this.c;
        int n5 = this.j;
        int n6 = 0;
        int n7 = this.m;
        while (true) {
            switch (com.corrodinggames.rts.java.audio.a.m.a(2)) {
                case 0: {
                    l6 = l3;
                    object2 = objectArray[n2];
                    lArray[n2] = l2;
                    objectArray[n2] = object;
                    break;
                }
                case 1: {
                    l6 = l4;
                    object2 = objectArray[n3];
                    lArray[n3] = l2;
                    objectArray[n3] = object;
                    break;
                }
                default: {
                    l6 = l5;
                    object2 = objectArray[n4];
                    lArray[n4] = l2;
                    objectArray[n4] = object;
                }
            }
            n2 = (int)(l6 & (long)n5);
            l3 = lArray[n2];
            if (l3 == 0L) {
                lArray[n2] = l6;
                objectArray[n2] = object2;
                if (this.a++ >= this.k) {
                    this.b(this.d << 1);
                }
                return;
            }
            n3 = this.f(l6);
            l4 = lArray[n3];
            if (l4 == 0L) {
                lArray[n3] = l6;
                objectArray[n3] = object2;
                if (this.a++ >= this.k) {
                    this.b(this.d << 1);
                }
                return;
            }
            n4 = this.g(l6);
            l5 = lArray[n4];
            if (l5 == 0L) {
                lArray[n4] = l6;
                objectArray[n4] = object2;
                if (this.a++ >= this.k) {
                    this.b(this.d << 1);
                }
                return;
            }
            if (++n6 == n7) break;
            l2 = l6;
            object = object2;
        }
        this.c(l6, object2);
    }

    private void c(long l2, Object object) {
        if (this.e == this.l) {
            this.b(this.d << 1);
            this.a(l2, object);
            return;
        }
        int n2 = this.d + this.e;
        this.b[n2] = l2;
        this.c[n2] = object;
        ++this.e;
        ++this.a;
    }

    public Object a(long l2) {
        if (l2 == 0L) {
            if (!this.g) {
                return null;
            }
            return this.f;
        }
        int n2 = (int)(l2 & (long)this.j);
        if (this.b[n2] != l2 && this.b[n2 = this.f(l2)] != l2 && this.b[n2 = this.g(l2)] != l2) {
            return this.d(l2, null);
        }
        return this.c[n2];
    }

    private Object d(long l2, Object object) {
        int n2;
        long[] lArray = this.b;
        int n3 = n2 + this.e;
        for (n2 = this.d; n2 < n3; ++n2) {
            if (lArray[n2] != l2) continue;
            return this.c[n2];
        }
        return object;
    }

    public Object b(long l2) {
        if (l2 == 0L) {
            if (!this.g) {
                return null;
            }
            Object object = this.f;
            this.f = null;
            this.g = false;
            --this.a;
            return object;
        }
        int n2 = (int)(l2 & (long)this.j);
        if (this.b[n2] == l2) {
            this.b[n2] = 0L;
            Object object = this.c[n2];
            this.c[n2] = null;
            --this.a;
            return object;
        }
        n2 = this.f(l2);
        if (this.b[n2] == l2) {
            this.b[n2] = 0L;
            Object object = this.c[n2];
            this.c[n2] = null;
            --this.a;
            return object;
        }
        n2 = this.g(l2);
        if (this.b[n2] == l2) {
            this.b[n2] = 0L;
            Object object = this.c[n2];
            this.c[n2] = null;
            --this.a;
            return object;
        }
        return this.c(l2);
    }

    Object c(long l2) {
        int n2;
        long[] lArray = this.b;
        int n3 = n2 + this.e;
        for (n2 = this.d; n2 < n3; ++n2) {
            if (lArray[n2] != l2) continue;
            Object object = this.c[n2];
            this.a(n2);
            --this.a;
            return object;
        }
        return null;
    }

    void a(int n2) {
        --this.e;
        int n3 = this.d + this.e;
        if (n2 < n3) {
            this.b[n2] = this.b[n3];
            this.c[n2] = this.c[n3];
            this.c[n3] = null;
        } else {
            this.c[n2] = null;
        }
    }

    public void a() {
        if (this.a == 0) {
            return;
        }
        long[] lArray = this.b;
        Object[] objectArray = this.c;
        int n2 = this.d + this.e;
        while (n2-- > 0) {
            lArray[n2] = 0L;
            objectArray[n2] = null;
        }
        this.a = 0;
        this.e = 0;
        this.f = null;
        this.g = false;
    }

    public boolean d(long l2) {
        if (l2 == 0L) {
            return this.g;
        }
        int n2 = (int)(l2 & (long)this.j);
        if (this.b[n2] != l2 && this.b[n2 = this.f(l2)] != l2 && this.b[n2 = this.g(l2)] != l2) {
            return this.e(l2);
        }
        return true;
    }

    private boolean e(long l2) {
        int n2;
        long[] lArray = this.b;
        int n3 = n2 + this.e;
        for (n2 = this.d; n2 < n3; ++n2) {
            if (lArray[n2] != l2) continue;
            return true;
        }
        return false;
    }

    private void b(int n2) {
        int n3 = this.d + this.e;
        this.d = n2;
        this.k = (int)((float)n2 * this.h);
        this.j = n2 - 1;
        this.i = 63 - Long.numberOfTrailingZeros((long)n2);
        this.l = Math.max((int)3, (int)((int)Math.ceil((double)Math.log((double)n2)) * 2));
        this.m = Math.max((int)Math.min((int)n2, (int)8), (int)((int)Math.sqrt((double)n2) / 8));
        long[] lArray = this.b;
        Object[] objectArray = this.c;
        this.b = new long[n2 + this.l];
        this.c = new Object[n2 + this.l];
        int n4 = this.a;
        this.a = this.g ? 1 : 0;
        this.e = 0;
        if (n4 > 0) {
            for (int i2 = 0; i2 < n3; ++i2) {
                long l2 = lArray[i2];
                if (l2 == 0L) continue;
                this.b(l2, objectArray[i2]);
            }
        }
    }

    private int f(long l2) {
        return (int)(((l2 *= -1262997959L) ^ l2 >>> this.i) & (long)this.j);
    }

    private int g(long l2) {
        return (int)(((l2 *= -825114047L) ^ l2 >>> this.i) & (long)this.j);
    }

    public int hashCode() {
        int n2 = 0;
        if (this.g && this.f != null) {
            n2 += this.f.hashCode();
        }
        long[] lArray = this.b;
        Object[] objectArray = this.c;
        int n3 = this.d + this.e;
        for (int i2 = 0; i2 < n3; ++i2) {
            long l2 = lArray[i2];
            if (l2 == 0L) continue;
            n2 += (int)(l2 ^ l2 >>> 32) * 31;
            Object object = objectArray[i2];
            if (object == null) continue;
            n2 += object.hashCode();
        }
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof i)) {
            return false;
        }
        i i2 = (i)object;
        if (i2.a != this.a) {
            return false;
        }
        if (i2.g != this.g) {
            return false;
        }
        if (this.g && (i2.f == null ? this.f != null : !i2.f.equals(this.f))) {
            return false;
        }
        long[] lArray = this.b;
        Object[] objectArray = this.c;
        int n2 = this.d + this.e;
        for (int i3 = 0; i3 < n2; ++i3) {
            Object object2;
            long l2 = lArray[i3];
            if (l2 == 0L || !((object2 = objectArray[i3]) == null ? !i2.d(l2) || i2.a(l2) != null : !object2.equals(i2.a(l2)))) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        long l2;
        if (this.a == 0) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append('[');
        long[] lArray = this.b;
        Object[] objectArray = this.c;
        int n2 = lArray.length;
        while (n2-- > 0) {
            l2 = lArray[n2];
            if (l2 == 0L) continue;
            stringBuilder.append(l2);
            stringBuilder.append('=');
            stringBuilder.append(objectArray[n2]);
            break;
        }
        while (n2-- > 0) {
            l2 = lArray[n2];
            if (l2 == 0L) continue;
            stringBuilder.append(", ");
            stringBuilder.append(l2);
            stringBuilder.append('=');
            stringBuilder.append(objectArray[n2]);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public Iterator iterator() {
        return this.b();
    }

    public j b() {
        if (this.n == null) {
            this.n = new j(this);
            this.o = new j(this);
        }
        if (!this.n.e) {
            this.n.b();
            this.n.e = true;
            this.o.e = false;
            return this.n;
        }
        this.o.b();
        this.o.e = true;
        this.n.e = false;
        return this.o;
    }
}

