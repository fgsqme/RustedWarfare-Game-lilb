/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.InterruptedException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.Enumeration
 *  java.util.concurrent.ConcurrentHashMap
 */
package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.k;
import com.corrodinggames.rts.gameFramework.l;
import java.io.File;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

public class j {
    static ConcurrentHashMap a = new ConcurrentHashMap();
    static k b;

    public static long a(String string2, boolean bl2) {
        Long l2 = (Long)a.get((Object)string2);
        if (l2 != null) {
            return l2;
        }
        l2 = j.a(string2);
        if (!bl2) {
            a.put((Object)string2, (Object)l2);
            if (b == null) {
                // empty if block
            }
        }
        return l2;
    }

    private static long a(String string2) {
        File file = new File(string2);
        return file.lastModified();
    }

    public static synchronized void a() {
        j.a(l.B().bQ.liveReloading);
    }

    public static synchronized void a(boolean bl2) {
        if (!l.av()) {
            return;
        }
        if (bl2) {
            if (b != null) {
                l.e("FileChangeEngine: Already running");
                return;
            }
            l.e("FileChangeEngine: Starting");
            b = new k();
            b.start();
        } else if (b != null) {
            j.b.a = false;
            b = null;
        }
    }

    public static void b() {
        int n2 = 0;
        Enumeration enumeration = a.keys();
        while (enumeration.hasMoreElements()) {
            String string2 = (String)enumeration.nextElement();
            long l2 = j.a(string2);
            Long l3 = (Long)a.get((Object)string2);
            if (l3 == null) {
                l.e("FileChangeEngine: old lastModified null for " + string2);
            } else if (l3 != l2) {
                l.e("FileChangeEngine: Detected change to:" + string2 + " now " + l2);
            }
            a.put((Object)string2, (Object)l2);
            if (++n2 <= 50) continue;
            n2 = 0;
            try {
                Thread.sleep((long)2L);
            }
            catch (InterruptedException interruptedException) {}
        }
    }
}

