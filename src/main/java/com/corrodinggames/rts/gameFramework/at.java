/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.am;
import com.corrodinggames.rts.gameFramework.am$1;
import com.corrodinggames.rts.gameFramework.at$1;
import com.corrodinggames.rts.gameFramework.at$2;
import com.corrodinggames.rts.gameFramework.at$3;
import com.corrodinggames.rts.gameFramework.e.a;
import com.corrodinggames.rts.gameFramework.l;
import java.util.ArrayList;

abstract class at
extends Enum {
    public static final /* enum */ at a = new at$1();
    public static final /* enum */ at b = new at$2();
    public static final /* enum */ at c = new at$3();
    String[] d;
    private static final /* synthetic */ at[] e;

    public static at[] values() {
        return (at[])e.clone();
    }

    public static at valueOf(String string2) {
        return (at)Enum.valueOf(at.class, (String)string2);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private at() {
        void var2_-1;
        void var1_-1;
    }

    void a() {
        this.d = com.corrodinggames.rts.gameFramework.e.a.a(this.d(), false);
        if (this.d == null) {
            this.d = new String[0];
            l.n("Failed to open music folder: " + this.d());
            return;
        }
        l l2 = l.B();
        ArrayList arrayList = new ArrayList();
        for (String string2 : this.d) {
            if (am.a(this.a(string2 = com.corrodinggames.rts.gameFramework.e.a.o(string2)), true) != null) {
                l.e("Loaded track:" + string2);
                arrayList.add((Object)string2);
            } else {
                l.b("Skipping track:" + string2);
            }
            l2.a("music", false);
        }
        this.d = (String[])arrayList.toArray((Object[])new String[0]);
    }

    String[] b() {
        return this.d;
    }

    static void c() {
        a.a();
        b.a();
        c.a();
    }

    abstract String d();

    String a(String string2) {
        return this.d() + "/" + string2;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ at(am$1 am$1) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        e = new at[]{a, b, c};
    }
}

