/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.game.n;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.j.a;
import com.corrodinggames.rts.gameFramework.j.c;

public class b {
    int a;
    String b;
    String c;
    int d;
    long e;
    final /* synthetic */ a f;

    b(a a2, int n2, String string2, String string3, c c2) {
        this.f = a2;
        this.a = n2;
        this.b = string2;
        this.c = string3;
        if (c2 != null) {
            this.d = c2.c;
        }
        this.e = System.nanoTime();
    }

    public String a() {
        String string2 = this.b != null ? this.b + ": " + this.c : this.c;
        return string2;
    }

    public String b() {
        String string2 = "";
        if (this.b != null) {
            int n2 = -1;
            if (this.a != -1) {
                n2 = n.i(this.a);
            }
            string2 = "<strong> <font color='" + com.corrodinggames.rts.gameFramework.f.h(n2) + "'>" + this.f.a(this.b) + ": </font></strong>";
        }
        String[] stringArray = this.c.split("\n");
        boolean bl2 = true;
        for (String string3 : stringArray) {
            if (string3.trim().equals((Object)"")) continue;
            if (bl2) {
                bl2 = false;
            } else {
                string2 = string2 + "<br/>";
            }
            string2 = string2 + this.f.a(string3);
        }
        return string2;
    }
}

