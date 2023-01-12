/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.corrodinggames.rts.java.audio.a;

import com.corrodinggames.rts.java.audio.a.t;
import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;

public final class s {
    public static final byte[] a = new byte[0];

    public static void a(InputStream inputStream, OutputStream outputStream) {
        s.a(inputStream, outputStream, new byte[4096]);
    }

    public static void a(InputStream inputStream, OutputStream outputStream, byte[] byArray) {
        int n2;
        while ((n2 = inputStream.read(byArray)) != -1) {
            outputStream.write(byArray, 0, n2);
        }
    }

    public static byte[] a(InputStream inputStream, int n2) {
        t t2 = new t(Math.max((int)0, (int)n2));
        s.a(inputStream, (OutputStream)t2);
        return t2.toByteArray();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            }
            catch (Throwable throwable) {
                // empty catch block
            }
        }
    }
}

