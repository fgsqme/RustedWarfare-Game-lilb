/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package com.corrodinggames.rts.java.audio.a;

public class b {
    public float[] a;
    public int b;
    public boolean c;

    public b() {
        this(true, 16);
    }

    public b(int n2) {
        this(true, n2);
    }

    public b(boolean bl2, int n2) {
        this.c = bl2;
        this.a = new float[n2];
    }

    public void a(float f2) {
        float[] fArray = this.a;
        if (this.b == fArray.length) {
            fArray = this.a(Math.max((int)8, (int)((int)((float)this.b * 1.75f))));
        }
        fArray[this.b++] = f2;
    }

    public void a(int n2, float f2) {
        if (n2 >= this.b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + n2 + " >= " + this.b);
        }
        this.a[n2] = f2;
    }

    public void b(int n2, float f2) {
        if (n2 > this.b) {
            throw new IndexOutOfBoundsException("index can't be > size: " + n2 + " > " + this.b);
        }
        float[] fArray = this.a;
        if (this.b == fArray.length) {
            fArray = this.a(Math.max((int)8, (int)((int)((float)this.b * 1.75f))));
        }
        if (this.c) {
            System.arraycopy((Object)fArray, (int)n2, (Object)fArray, (int)(n2 + 1), (int)(this.b - n2));
        } else {
            fArray[this.b] = fArray[n2];
        }
        ++this.b;
        fArray[n2] = f2;
    }

    public float a() {
        return this.a[--this.b];
    }

    public float b() {
        if (this.b == 0) {
            throw new IllegalStateException("Array is empty.");
        }
        return this.a[0];
    }

    public void c() {
        this.b = 0;
    }

    protected float[] a(int n2) {
        float[] fArray = new float[n2];
        float[] fArray2 = this.a;
        System.arraycopy((Object)fArray2, (int)0, (Object)fArray, (int)0, (int)Math.min((int)this.b, (int)fArray.length));
        this.a = fArray;
        return fArray;
    }

    public int hashCode() {
        if (!this.c) {
            return super.hashCode();
        }
        float[] fArray = this.a;
        int n2 = 1;
        int n3 = this.b;
        for (int i2 = 0; i2 < n3; ++i2) {
            n2 = n2 * 31 + Float.floatToIntBits((float)fArray[i2]);
        }
        return n2;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!this.c) {
            return false;
        }
        if (!(object instanceof b)) {
            return false;
        }
        b b2 = (b)object;
        if (!b2.c) {
            return false;
        }
        int n2 = this.b;
        if (n2 != b2.b) {
            return false;
        }
        float[] fArray = this.a;
        float[] fArray2 = b2.a;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (fArray[i2] == fArray2[i2]) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        if (this.b == 0) {
            return "[]";
        }
        float[] fArray = this.a;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append('[');
        stringBuilder.append(fArray[0]);
        for (int i2 = 1; i2 < this.b; ++i2) {
            stringBuilder.append(", ");
            stringBuilder.append(fArray[i2]);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

