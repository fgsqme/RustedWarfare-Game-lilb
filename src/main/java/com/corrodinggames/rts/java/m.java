/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.ar;
import com.corrodinggames.rts.java.audio.Music;
import com.corrodinggames.rts.java.audio.a.a;
import com.corrodinggames.rts.java.l;

public class m
extends ar {
    l a;
    Music c;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public m(String string2, l l2) {
        super(string2, l2);
        this.a = l2;
        Object object = l2.f();
        synchronized (object) {
            this.a = l2;
            String string3 = com.corrodinggames.rts.gameFramework.e.a.e(string2);
            this.c = string3.contains((CharSequence)".rwmod") ? l2.b.newMusic(new a(com.corrodinggames.rts.gameFramework.e.a.k(string2), string3)) : l2.b.newMusic(new a(string3));
        }
    }
}

