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

import com.corrodinggames.rts.java.audio.a.m;
import com.corrodinggames.rts.java.audio.a.p;
import java.util.Iterator;

public class o
implements Iterable {
    public int a;
    Object[] b;
    Object[] c;
    int d;
    int e;
    private float f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private p l;
    private p m;

    public o() {
        this(51, 0.8f);
    }

    public o(int n2, float f2) {
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
        this.f = f2;
        this.i = (int)((float)this.d * f2);
        this.h = this.d - 1;
        this.g = 31 - Integer.numberOfTrailingZeros((int)this.d);
        this.j = Math.max((int)3, (int)((int)Math.ceil((double)Math.log((double)this.d)) * 2));
        this.k = Math.max((int)Math.min((int)this.d, (int)8), (int)((int)Math.sqrt((double)this.d) / 8));
        this.b = new Object[this.d + this.j];
        this.c = new Object[this.b.length];
    }

    public Object a(Object object, Object object2) {
        if (object == null) {
            throw new IllegalArgumentException("key cannot be null.");
        }
        return this.b(object, object2);
    }

    private Object b(Object object, Object object2) {
        int n2;
        Object[] objectArray = this.b;
        int n3 = object.hashCode();
        int n4 = n3 & this.h;
        Object object3 = objectArray[n4];
        if (object.equals(object3)) {
            Object object4 = this.c[n4];
            this.c[n4] = object2;
            return object4;
        }
        int n5 = this.c(n3);
        Object object5 = objectArray[n5];
        if (object.equals(object5)) {
            Object object6 = this.c[n5];
            this.c[n5] = object2;
            return object6;
        }
        int n6 = this.d(n3);
        Object object7 = objectArray[n6];
        if (object.equals(object7)) {
            Object object8 = this.c[n6];
            this.c[n6] = object2;
            return object8;
        }
        int n7 = n2 + this.e;
        for (n2 = this.d; n2 < n7; ++n2) {
            if (!object.equals(objectArray[n2])) continue;
            Object object9 = this.c[n2];
            this.c[n2] = object2;
            return object9;
        }
        if (object3 == null) {
            objectArray[n4] = object;
            this.c[n4] = object2;
            if (this.a++ >= this.i) {
                this.b(this.d << 1);
            }
            return null;
        }
        if (object5 == null) {
            objectArray[n5] = object;
            this.c[n5] = object2;
            if (this.a++ >= this.i) {
                this.b(this.d << 1);
            }
            return null;
        }
        if (object7 == null) {
            objectArray[n6] = object;
            this.c[n6] = object2;
            if (this.a++ >= this.i) {
                this.b(this.d << 1);
            }
            return null;
        }
        this.a(object, object2, n4, object3, n5, object5, n6, object7);
        return null;
    }

    private void c(Object object, Object object2) {
        int n2 = object.hashCode();
        int n3 = n2 & this.h;
        Object object3 = this.b[n3];
        if (object3 == null) {
            this.b[n3] = object;
            this.c[n3] = object2;
            if (this.a++ >= this.i) {
                this.b(this.d << 1);
            }
            return;
        }
        int n4 = this.c(n2);
        Object object4 = this.b[n4];
        if (object4 == null) {
            this.b[n4] = object;
            this.c[n4] = object2;
            if (this.a++ >= this.i) {
                this.b(this.d << 1);
            }
            return;
        }
        int n5 = this.d(n2);
        Object object5 = this.b[n5];
        if (object5 == null) {
            this.b[n5] = object;
            this.c[n5] = object2;
            if (this.a++ >= this.i) {
                this.b(this.d << 1);
            }
            return;
        }
        this.a(object, object2, n3, object3, n4, object4, n5, object5);
    }

    private void a(Object object, Object object2, int n2, Object object3, int n3, Object object4, int n4, Object object5) {
        Object object6;
        Object object7;
        Object[] objectArray = this.b;
        Object[] objectArray2 = this.c;
        int n5 = this.h;
        int n6 = 0;
        int n7 = this.k;
        while (true) {
            switch (com.corrodinggames.rts.java.audio.a.m.a(2)) {
                case 0: {
                    object7 = object3;
                    object6 = objectArray2[n2];
                    objectArray[n2] = object;
                    objectArray2[n2] = object2;
                    break;
                }
                case 1: {
                    object7 = object4;
                    object6 = objectArray2[n3];
                    objectArray[n3] = object;
                    objectArray2[n3] = object2;
                    break;
                }
                default: {
                    object7 = object5;
                    object6 = objectArray2[n4];
                    objectArray[n4] = object;
                    objectArray2[n4] = object2;
                }
            }
            int n8 = object7.hashCode();
            n2 = n8 & n5;
            object3 = objectArray[n2];
            if (object3 == null) {
                objectArray[n2] = object7;
                objectArray2[n2] = object6;
                if (this.a++ >= this.i) {
                    this.b(this.d << 1);
                }
                return;
            }
            n3 = this.c(n8);
            object4 = objectArray[n3];
            if (object4 == null) {
                objectArray[n3] = object7;
                objectArray2[n3] = object6;
                if (this.a++ >= this.i) {
                    this.b(this.d << 1);
                }
                return;
            }
            n4 = this.d(n8);
            object5 = objectArray[n4];
            if (object5 == null) {
                objectArray[n4] = object7;
                objectArray2[n4] = object6;
                if (this.a++ >= this.i) {
                    this.b(this.d << 1);
                }
                return;
            }
            if (++n6 == n7) break;
            object = object7;
            object2 = object6;
        }
        this.d(object7, object6);
    }

    private void d(Object object, Object object2) {
        if (this.e == this.j) {
            this.b(this.d << 1);
            this.b(object, object2);
            return;
        }
        int n2 = this.d + this.e;
        this.b[n2] = object;
        this.c[n2] = object2;
        ++this.e;
        ++this.a;
    }

    public Object a(Object object) {
        int n2 = object.hashCode();
        int n3 = n2 & this.h;
        if (!(object.equals(this.b[n3]) || object.equals(this.b[n3 = this.c(n2)]) || object.equals(this.b[n3 = this.d(n2)]))) {
            return this.e(object, null);
        }
        return this.c[n3];
    }

    private Object e(Object object, Object object2) {
        int n2;
        Object[] objectArray = this.b;
        int n3 = n2 + this.e;
        for (n2 = this.d; n2 < n3; ++n2) {
            if (!object.equals(objectArray[n2])) continue;
            return this.c[n2];
        }
        return object2;
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

    public boolean b(Object object) {
        int n2 = object.hashCode();
        int n3 = n2 & this.h;
        if (!(object.equals(this.b[n3]) || object.equals(this.b[n3 = this.c(n2)]) || object.equals(this.b[n3 = this.d(n2)]))) {
            return this.c(object);
        }
        return true;
    }

    private boolean c(Object object) {
        int n2;
        Object[] objectArray = this.b;
        int n3 = n2 + this.e;
        for (n2 = this.d; n2 < n3; ++n2) {
            if (!object.equals(objectArray[n2])) continue;
            return true;
        }
        return false;
    }

    private void b(int n2) {
        int n3 = this.d + this.e;
        this.d = n2;
        this.i = (int)((float)n2 * this.f);
        this.h = n2 - 1;
        this.g = 31 - Integer.numberOfTrailingZeros((int)n2);
        this.j = Math.max((int)3, (int)((int)Math.ceil((double)Math.log((double)n2)) * 2));
        this.k = Math.max((int)Math.min((int)n2, (int)8), (int)((int)Math.sqrt((double)n2) / 8));
        Object[] objectArray = this.b;
        Object[] objectArray2 = this.c;
        this.b = new Object[n2 + this.j];
        this.c = new Object[n2 + this.j];
        int n4 = this.a;
        this.a = 0;
        this.e = 0;
        if (n4 > 0) {
            for (int i2 = 0; i2 < n3; ++i2) {
                Object object = objectArray[i2];
                if (object == null) continue;
                this.c(object, objectArray2[i2]);
            }
        }
    }

    private int c(int n2) {
        return ((n2 *= -1262997959) ^ n2 >>> this.g) & this.h;
    }

    private int d(int n2) {
        return ((n2 *= -825114047) ^ n2 >>> this.g) & this.h;
    }

    public int hashCode() {
        int n2 = 0;
        Object[] objectArray = this.b;
        Object[] objectArray2 = this.c;
        int n3 = this.d + this.e;
        for (int i2 = 0; i2 < n3; ++i2) {
            Object object = objectArray[i2];
            if (object == null) continue;
            n2 += object.hashCode() * 31;
            Object object2 = objectArray2[i2];
            if (object2 == null) continue;
            n2 += object2.hashCode();
        }
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof o)) {
            return false;
        }
        o o2 = (o)object;
        if (o2.a != this.a) {
            return false;
        }
        Object[] objectArray = this.b;
        Object[] objectArray2 = this.c;
        int n2 = this.d + this.e;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object2;
            Object object3 = objectArray[i2];
            if (object3 == null || !((object2 = objectArray2[i2]) == null ? !o2.b(object3) || o2.a(object3) != null : !object2.equals(o2.a(object3)))) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        return this.a(", ", true);
    }

    private String a(String string2, boolean bl2) {
        Object object;
        if (this.a == 0) {
            return bl2 ? "{}" : "";
        }
        StringBuilder stringBuilder = new StringBuilder(32);
        if (bl2) {
            stringBuilder.append('{');
        }
        Object[] objectArray = this.b;
        Object[] objectArray2 = this.c;
        int n2 = objectArray.length;
        while (n2-- > 0) {
            object = objectArray[n2];
            if (object == null) continue;
            stringBuilder.append(object);
            stringBuilder.append('=');
            stringBuilder.append(objectArray2[n2]);
            break;
        }
        while (n2-- > 0) {
            object = objectArray[n2];
            if (object == null) continue;
            stringBuilder.append(string2);
            stringBuilder.append(object);
            stringBuilder.append('=');
            stringBuilder.append(objectArray2[n2]);
        }
        if (bl2) {
            stringBuilder.append('}');
        }
        return stringBuilder.toString();
    }

    public p a() {
        return this.b();
    }

    public p b() {
        if (this.l == null) {
            this.l = new p(this);
            this.m = new p(this);
        }
        if (!this.l.f) {
            this.l.c();
            this.l.f = true;
            this.m.f = false;
            return this.l;
        }
        this.m.c();
        this.m.f = true;
        this.l.f = false;
        return this.m;
    }

    public /* synthetic */ Iterator iterator() {
        return this.a();
    }
}

