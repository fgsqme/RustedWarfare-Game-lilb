/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package com.corrodinggames.rts.a.a;

import com.corrodinggames.rts.a.a.a;
import com.corrodinggames.rts.a.a.c;
import com.corrodinggames.rts.a.a.d;
import com.corrodinggames.rts.a.a.e;
import com.corrodinggames.rts.a.a.f;
import com.corrodinggames.rts.a.a.k;
import com.corrodinggames.rts.a.a.m;
import com.corrodinggames.rts.gameFramework.l;

public class n {
    public void a() {
        l.e("Running unit tests");
        new c().a();
        new d().a();
        new k().a();
        new e().a();
        new a().a();
        new f().a();
        new m().a();
    }

    public static void a(boolean bl2) {
        if (!bl2) {
            throw new RuntimeException("Asset failed");
        }
    }

    public static void b(boolean bl2) {
        if (bl2) {
            throw new RuntimeException("Asset failed");
        }
    }

    public static void a(int n2, int n3) {
        if (n2 != n3) {
            throw new RuntimeException("Asset failed (int):" + n2 + "!=" + n3);
        }
    }

    public static void a(float f2, float f3) {
        if (com.corrodinggames.rts.gameFramework.f.c(f2 - f3) > 0.001f) {
            throw new RuntimeException("Asset failed (float):" + f2 + "!=" + f3);
        }
    }

    public static void a(String string2, String string3) {
        if (!string2.equals((Object)string3)) {
            throw new RuntimeException("Asset failed:" + string2 + "!=" + string3);
        }
    }

    public static void b(String string2, String string3) {
        l.e("assertEqualDebug:'" + string2 + "' vs '" + string3 + "'");
        n.a(string2, string3);
    }

    public static void c(String string2, String string3) {
        Float f2 = Float.valueOf((float)Float.parseFloat((String)string2));
        Float f3 = Float.valueOf((float)Float.parseFloat((String)string3));
        n.a(f2.floatValue(), f3.floatValue());
    }

    public static void a(Object object, Object object2) {
        if (object != object2) {
            throw new RuntimeException("Asset failed:" + object + "!=" + object2);
        }
    }
}

