/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.utility.a.a;
import com.corrodinggames.rts.gameFramework.utility.af;
import com.corrodinggames.rts.gameFramework.utility.ag;

public class ae {
    static Object a = new Object();
    static ag b = new ag();
    static af c;

    public static boolean a() {
        return l.at();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static af a(String string2) {
        if (ag.i(string2)) {
            return b;
        }
        if (ae.a() && com.corrodinggames.rts.gameFramework.utility.a.a.l(string2)) {
            if (c == null) {
                Object object = a;
                synchronized (object) {
                    if (c == null) {
                        c = new a();
                    }
                }
            }
            return c;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static af b(String string2) {
        if (ae.a() && com.corrodinggames.rts.gameFramework.utility.a.a.l(string2)) {
            if (c == null) {
                Object object = a;
                synchronized (object) {
                    if (c == null) {
                        c = new a();
                    }
                }
            }
            return c;
        }
        return null;
    }

    public static void c(String string2) {
        if (b != null && ag.i(string2)) {
            b.k(string2);
        }
    }

    public static void b() {
        if (b != null) {
            b.a();
        }
        if (c != null) {
            c.a();
        }
    }
}

