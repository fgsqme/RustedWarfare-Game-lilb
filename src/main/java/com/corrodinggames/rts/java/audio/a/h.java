/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 */
package com.corrodinggames.rts.java.audio.a;

import com.corrodinggames.rts.java.audio.a.e;

class h {
    public boolean a;
    final e b;
    int c;
    int d;
    boolean e = true;

    public h(e e2) {
        this.b = e2;
        this.b();
    }

    public void b() {
        this.d = -2;
        this.c = -1;
        if (this.b.g) {
            this.a = true;
        } else {
            this.c();
        }
    }

    void c() {
        this.a = false;
        int[] nArray = this.b.b;
        int n2 = this.b.d + this.b.e;
        while (++this.c < n2) {
            if (nArray[this.c] == 0) continue;
            this.a = true;
            break;
        }
    }

    public void remove() {
        if (this.d == -1 && this.b.g) {
            this.b.f = null;
            this.b.g = false;
        } else {
            if (this.d < 0) {
                throw new IllegalStateException("next must be called before remove.");
            }
            if (this.d >= this.b.d) {
                this.b.d(this.d);
                this.c = this.d - 1;
                this.c();
            } else {
                this.b.b[this.d] = 0;
                this.b.c[this.d] = null;
            }
        }
        this.d = -2;
        --this.b.a;
    }
}

