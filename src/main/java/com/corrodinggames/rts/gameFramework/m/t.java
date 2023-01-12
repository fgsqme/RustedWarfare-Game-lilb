/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.System
 */
package com.corrodinggames.rts.gameFramework.m;

import com.corrodinggames.rts.gameFramework.m.s;

public final class t {
    public int a;
    public s[] b;

    public t(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("capacity < 0: " + n2);
        }
        this.b = n2 == 0 ? new s[]{} : new s[n2];
    }

    public final boolean a(s s2) {
        int n2 = this.a;
        s[] sArray = this.b;
        if (n2 == sArray.length) {
            s[] sArray2 = new s[n2 + (n2 < 6 ? 12 : n2 >> 1)];
            System.arraycopy((Object)sArray, (int)0, (Object)sArray2, (int)0, (int)n2);
            sArray = sArray2;
            this.b = sArray2;
        }
        sArray[n2] = s2;
        this.a = n2 + 1;
        return true;
    }
}

