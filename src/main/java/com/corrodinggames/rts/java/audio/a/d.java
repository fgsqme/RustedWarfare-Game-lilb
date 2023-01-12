/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package com.corrodinggames.rts.java.audio.a;

public class d {
    public int[] a;
    public int b;
    public boolean c;

    public d() {
        this(true, 16);
    }

    public d(boolean bl2, int n2) {
        this.c = bl2;
        this.a = new int[n2];
    }

    public d(d d2) {
        this.c = d2.c;
        this.b = d2.b;
        this.a = new int[this.b];
        System.arraycopy((Object)d2.a, (int)0, (Object)this.a, (int)0, (int)this.b);
    }

    public void a(int n2) {
        int[] nArray = this.a;
        if (this.b == nArray.length) {
            nArray = this.d(Math.max((int)8, (int)((int)((float)this.b * 1.75f))));
        }
        nArray[this.b++] = n2;
    }

    public int b(int n2) {
        if (n2 >= this.b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + n2 + " >= " + this.b);
        }
        return this.a[n2];
    }

    public int c(int n2) {
        if (n2 >= this.b) {
            throw new IndexOutOfBoundsException("index can't be >= size: " + n2 + " >= " + this.b);
        }
        int[] nArray = this.a;
        int n3 = nArray[n2];
        --this.b;
        if (this.c) {
            System.arraycopy((Object)nArray, (int)(n2 + 1), (Object)nArray, (int)n2, (int)(this.b - n2));
        } else {
            nArray[n2] = nArray[this.b];
        }
        return n3;
    }

    protected int[] d(int n2) {
        int[] nArray = new int[n2];
        int[] nArray2 = this.a;
        System.arraycopy((Object)nArray2, (int)0, (Object)nArray, (int)0, (int)Math.min((int)this.b, (int)nArray.length));
        this.a = nArray;
        return nArray;
    }

    public int hashCode() {
        if (!this.c) {
            return super.hashCode();
        }
        int[] nArray = this.a;
        int n2 = 1;
        int n3 = this.b;
        for (int i2 = 0; i2 < n3; ++i2) {
            n2 = n2 * 31 + nArray[i2];
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
        if (!(object instanceof d)) {
            return false;
        }
        d d2 = (d)object;
        if (!d2.c) {
            return false;
        }
        int n2 = this.b;
        if (n2 != d2.b) {
            return false;
        }
        int[] nArray = this.a;
        int[] nArray2 = d2.a;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (this.a[i2] == d2.a[i2]) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        if (this.b == 0) {
            return "[]";
        }
        int[] nArray = this.a;
        StringBuilder stringBuilder = new StringBuilder(32);
        stringBuilder.append('[');
        stringBuilder.append(nArray[0]);
        for (int i2 = 1; i2 < this.b; ++i2) {
            stringBuilder.append(", ");
            stringBuilder.append(nArray[i2]);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}

