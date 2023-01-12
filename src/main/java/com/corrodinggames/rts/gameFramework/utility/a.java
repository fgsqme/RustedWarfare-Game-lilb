/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Error
 *  java.lang.Object
 *  java.lang.StackTraceElement
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Comparator
 *  java.util.Map$Entry
 *  java.util.TreeMap
 */
package com.corrodinggames.rts.gameFramework.utility;

import android.os.Looper;
import com.corrodinggames.rts.gameFramework.utility.a$1;
import com.corrodinggames.rts.gameFramework.utility.b;
import com.corrodinggames.rts.gameFramework.utility.c;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class a
extends Error {
    private a(c c2) {
        super("Application Not Responding", (Throwable)c2);
    }

    public Throwable fillInStackTrace() {
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }

    static a a(String string2, boolean bl2) {
        Thread thread = Looper.b().e();
        TreeMap treeMap = new TreeMap((Comparator)new a$1(thread));
        for (Map.Entry entry : Thread.getAllStackTraces().entrySet()) {
            if (entry.getKey() != thread && (!((Thread)entry.getKey()).getName().startsWith(string2) || !bl2 && ((StackTraceElement[])entry.getValue()).length <= 0)) continue;
            treeMap.put(entry.getKey(), entry.getValue());
        }
        if (!treeMap.containsKey((Object)thread)) {
            treeMap.put((Object)thread, (Object)thread.getStackTrace());
        }
        Object object = null;
        for (Map.Entry entry : treeMap.entrySet()) {
            b b2 = new b(a.a((Thread)entry.getKey()), (StackTraceElement[])entry.getValue());
            b2.getClass();
            object = new c(b2, (c)((Object)object));
        }
        return new a((c)((Object)object));
    }

    static a a() {
        Thread thread = Looper.b().e();
        StackTraceElement[] stackTraceElementArray = thread.getStackTrace();
        b b2 = new b(a.a(thread), stackTraceElementArray);
        b2.getClass();
        return new a(new c(b2, null));
    }

    private static String a(Thread thread) {
        return thread.getName() + " (state = " + thread.getState() + ")";
    }
}

