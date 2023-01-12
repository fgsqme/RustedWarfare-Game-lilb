/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 */
package com.corrodinggames.rts.java.audio.a;

import com.corrodinggames.rts.java.audio.a.f;
import com.corrodinggames.rts.java.audio.a.m;
import java.util.Iterator;

public class e
implements Iterable {
    public int a;
    int[] b;
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
    private f n;
    private f o;

    public e() {
        this(51, 0.8f);
    }

    public e(int n2, float f2) {
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
        this.i = 31 - Integer.numberOfTrailingZeros((int)this.d);
        this.l = Math.max((int)3, (int)((int)Math.ceil((double)Math.log((double)this.d)) * 2));
        this.m = Math.max((int)Math.min((int)this.d, (int)8), (int)((int)Math.sqrt((double)this.d) / 8));
        this.b = new int[this.d + this.l];
        this.c = new Object[this.b.length];
    }

    public Object a(int n2, Object object) {
        int n3;
        if (n2 == 0) {
            Object object2 = this.f;
            this.f = object;
            if (!this.g) {
                this.g = true;
                ++this.a;
            }
            return object2;
        }
        int[] nArray = this.b;
        int n4 = n2 & this.j;
        int n5 = nArray[n4];
        if (n5 == n2) {
            Object object3 = this.c[n4];
            this.c[n4] = object;
            return object3;
        }
        int n6 = this.h(n2);
        int n7 = nArray[n6];
        if (n7 == n2) {
            Object object4 = this.c[n6];
            this.c[n6] = object;
            return object4;
        }
        int n8 = this.i(n2);
        int n9 = nArray[n8];
        if (n9 == n2) {
            Object object5 = this.c[n8];
            this.c[n8] = object;
            return object5;
        }
        int n10 = n3 + this.e;
        for (n3 = this.d; n3 < n10; ++n3) {
            if (nArray[n3] != n2) continue;
            Object object6 = this.c[n3];
            this.c[n3] = object;
            return object6;
        }
        if (n5 == 0) {
            nArray[n4] = n2;
            this.c[n4] = object;
            if (this.a++ >= this.k) {
                this.g(this.d << 1);
            }
            return null;
        }
        if (n7 == 0) {
            nArray[n6] = n2;
            this.c[n6] = object;
            if (this.a++ >= this.k) {
                this.g(this.d << 1);
            }
            return null;
        }
        if (n9 == 0) {
            nArray[n8] = n2;
            this.c[n8] = object;
            if (this.a++ >= this.k) {
                this.g(this.d << 1);
            }
            return null;
        }
        this.a(n2, object, n4, n5, n6, n7, n8, n9);
        return null;
    }

    private void b(int n2, Object object) {
        if (n2 == 0) {
            this.f = object;
            this.g = true;
            return;
        }
        int n3 = n2 & this.j;
        int n4 = this.b[n3];
        if (n4 == 0) {
            this.b[n3] = n2;
            this.c[n3] = object;
            if (this.a++ >= this.k) {
                this.g(this.d << 1);
            }
            return;
        }
        int n5 = this.h(n2);
        int n6 = this.b[n5];
        if (n6 == 0) {
            this.b[n5] = n2;
            this.c[n5] = object;
            if (this.a++ >= this.k) {
                this.g(this.d << 1);
            }
            return;
        }
        int n7 = this.i(n2);
        int n8 = this.b[n7];
        if (n8 == 0) {
            this.b[n7] = n2;
            this.c[n7] = object;
            if (this.a++ >= this.k) {
                this.g(this.d << 1);
            }
            return;
        }
        this.a(n2, object, n3, n4, n5, n6, n7, n8);
    }

    private void a(int n2, Object object, int n3, int n4, int n5, int n6, int n7, int n8) {
        Object object2;
        int n9;
        int[] nArray = this.b;
        Object[] objectArray = this.c;
        int n10 = this.j;
        int n11 = 0;
        int n12 = this.m;
        while (true) {
            switch (com.corrodinggames.rts.java.audio.a.m.a(2)) {
                case 0: {
                    n9 = n4;
                    object2 = objectArray[n3];
                    nArray[n3] = n2;
                    objectArray[n3] = object;
                    break;
                }
                case 1: {
                    n9 = n6;
                    object2 = objectArray[n5];
                    nArray[n5] = n2;
                    objectArray[n5] = object;
                    break;
                }
                default: {
                    n9 = n8;
                    object2 = objectArray[n7];
                    nArray[n7] = n2;
                    objectArray[n7] = object;
                }
            }
            n3 = n9 & n10;
            n4 = nArray[n3];
            if (n4 == 0) {
                nArray[n3] = n9;
                objectArray[n3] = object2;
                if (this.a++ >= this.k) {
                    this.g(this.d << 1);
                }
                return;
            }
            n5 = this.h(n9);
            n6 = nArray[n5];
            if (n6 == 0) {
                nArray[n5] = n9;
                objectArray[n5] = object2;
                if (this.a++ >= this.k) {
                    this.g(this.d << 1);
                }
                return;
            }
            n7 = this.i(n9);
            n8 = nArray[n7];
            if (n8 == 0) {
                nArray[n7] = n9;
                objectArray[n7] = object2;
                if (this.a++ >= this.k) {
                    this.g(this.d << 1);
                }
                return;
            }
            if (++n11 == n12) break;
            n2 = n9;
            object = object2;
        }
        this.c(n9, object2);
    }

    private void c(int n2, Object object) {
        if (this.e == this.l) {
            this.g(this.d << 1);
            this.a(n2, object);
            return;
        }
        int n3 = this.d + this.e;
        this.b[n3] = n2;
        this.c[n3] = object;
        ++this.e;
        ++this.a;
    }

    public Object a(int n2) {
        if (n2 == 0) {
            if (!this.g) {
                return null;
            }
            return this.f;
        }
        int n3 = n2 & this.j;
        if (this.b[n3] != n2 && this.b[n3 = this.h(n2)] != n2 && this.b[n3 = this.i(n2)] != n2) {
            return this.d(n2, null);
        }
        return this.c[n3];
    }

    private Object d(int n2, Object object) {
        int n3;
        int[] nArray = this.b;
        int n4 = n3 + this.e;
        for (n3 = this.d; n3 < n4; ++n3) {
            if (nArray[n3] != n2) continue;
            return this.c[n3];
        }
        return object;
    }

    public Object b(int n2) {
        if (n2 == 0) {
            if (!this.g) {
                return null;
            }
            Object object = this.f;
            this.f = null;
            this.g = false;
            --this.a;
            return object;
        }
        int n3 = n2 & this.j;
        if (this.b[n3] == n2) {
            this.b[n3] = 0;
            Object object = this.c[n3];
            this.c[n3] = null;
            --this.a;
            return object;
        }
        n3 = this.h(n2);
        if (this.b[n3] == n2) {
            this.b[n3] = 0;
            Object object = this.c[n3];
            this.c[n3] = null;
            --this.a;
            return object;
        }
        n3 = this.i(n2);
        if (this.b[n3] == n2) {
            this.b[n3] = 0;
            Object object = this.c[n3];
            this.c[n3] = null;
            --this.a;
            return object;
        }
        return this.c(n2);
    }

    Object c(int n2) {
        int n3;
        int[] nArray = this.b;
        int n4 = n3 + this.e;
        for (n3 = this.d; n3 < n4; ++n3) {
            if (nArray[n3] != n2) continue;
            Object object = this.c[n3];
            this.d(n3);
            --this.a;
            return object;
        }
        return null;
    }

    void d(int n2) {
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
        int[] nArray = this.b;
        Object[] objectArray = this.c;
        int n2 = this.d + this.e;
        while (n2-- > 0) {
            nArray[n2] = 0;
            objectArray[n2] = null;
        }
        this.a = 0;
        this.e = 0;
        this.f = null;
        this.g = false;
    }

    public boolean e(int n2) {
        if (n2 == 0) {
            return this.g;
        }
        int n3 = n2 & this.j;
        if (this.b[n3] != n2 && this.b[n3 = this.h(n2)] != n2 && this.b[n3 = this.i(n2)] != n2) {
            return this.f(n2);
        }
        return true;
    }

    private boolean f(int n2) {
        int n3;
        int[] nArray = this.b;
        int n4 = n3 + this.e;
        for (n3 = this.d; n3 < n4; ++n3) {
            if (nArray[n3] != n2) continue;
            return true;
        }
        return false;
    }

    private void g(int n2) {
        int n3 = this.d + this.e;
        this.d = n2;
        this.k = (int)((float)n2 * this.h);
        this.j = n2 - 1;
        this.i = 31 - Integer.numberOfTrailingZeros((int)n2);
        this.l = Math.max((int)3, (int)((int)Math.ceil((double)Math.log((double)n2)) * 2));
        this.m = Math.max((int)Math.min((int)n2, (int)8), (int)((int)Math.sqrt((double)n2) / 8));
        int[] nArray = this.b;
        Object[] objectArray = this.c;
        this.b = new int[n2 + this.l];
        this.c = new Object[n2 + this.l];
        int n4 = this.a;
        this.a = this.g ? 1 : 0;
        this.e = 0;
        if (n4 > 0) {
            for (int i2 = 0; i2 < n3; ++i2) {
                int n5 = nArray[i2];
                if (n5 == 0) continue;
                this.b(n5, objectArray[i2]);
            }
        }
    }

    private int h(int n2) {
        return ((n2 *= -1262997959) ^ n2 >>> this.i) & this.j;
    }

    private int i(int n2) {
        return ((n2 *= -825114047) ^ n2 >>> this.i) & this.j;
    }

    public int hashCode() {
        int n2 = 0;
        if (this.g && this.f != null) {
            n2 += this.f.hashCode();
        }
        int[] nArray = this.b;
        Object[] objectArray = this.c;
        int n3 = this.d + this.e;
        for (int i2 = 0; i2 < n3; ++i2) {
            int n4 = nArray[i2];
            if (n4 == 0) continue;
            n2 += n4 * 31;
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
        if (!(object instanceof e)) {
            return false;
        }
        e e2 = (e)object;
        if (e2.a != this.a) {
            return false;
        }
        if (e2.g != this.g) {
            return false;
        }
        if (this.g && (e2.f == null ? this.f != null : !e2.f.equals(this.f))) {
            return false;
        }
        int[] nArray = this.b;
        Object[] objectArray = this.c;
        int n2 = this.d + this.e;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object2;
            int n3 = nArray[i2];
            if (n3 == 0 || !((object2 = objectArray[i2]) == null ? !e2.e(n3) || e2.a(n3) != null : !object2.equals(e2.a(n3)))) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        int n2;
        if (this.a == 0) {
            return "[]";
        }
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append('[');
        int[] nArray = this.b;
        Object[] objectArray = this.c;
        int n3 = nArray.length;
        if (this.g) {
            stringBuilder.append("0=");
            stringBuilder.append(this.f);
        } else {
            while (n3-- > 0) {
                n2 = nArray[n3];
                if (n2 == 0) continue;
                stringBuilder.append(n2);
                stringBuilder.append('=');
                stringBuilder.append(objectArray[n3]);
                break;
            }
        }
        while (n3-- > 0) {
            n2 = nArray[n3];
            if (n2 == 0) continue;
            stringBuilder.append(", ");
            stringBuilder.append(n2);
            stringBuilder.append('=');
            stringBuilder.append(objectArray[n3]);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }

    public Iterator iterator() {
        return this.b();
    }

    public f b() {
        if (this.n == null) {
            this.n = new f(this);
            this.o = new f(this);
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

