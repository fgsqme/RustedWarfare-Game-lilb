/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetFileDescriptor
 *  java.io.File
 *  java.io.FileDescriptor
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package com.corrodinggames.rts.gameFramework.utility;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.corrodinggames.rts.appFramework.c;
import com.corrodinggames.rts.gameFramework.l;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class j
extends InputStream {
    InputStream a;
    String b;
    String c;
    boolean d;
    String e;

    public boolean a() {
        if (this.a instanceof FileInputStream) {
            return true;
        }
        return !l.av() && this.c != null;
    }

    public FileDescriptor b() {
        if (this.a instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream)this.a;
            return fileInputStream.getFD();
        }
        if (!l.av() && this.c != null) {
            Context context = com.corrodinggames.rts.appFramework.c.a();
            AssetManager assetManager = context.d();
            AssetFileDescriptor assetFileDescriptor = assetManager.b(this.c);
            return assetFileDescriptor.getFileDescriptor();
        }
        throw new RuntimeException("AssetInputStream: unexpected stream for: " + this.b);
    }

    private j() {
    }

    public j(InputStream inputStream, String string2, String string3) {
        if (inputStream == null) {
            throw new FileNotFoundException();
        }
        this.a = inputStream;
        this.b = string2;
        this.c = string3;
        this.e = l.U();
    }

    public j(FileInputStream fileInputStream, String string2) {
        if (fileInputStream == null) {
            throw new FileNotFoundException();
        }
        this.a = fileInputStream;
        this.b = string2;
        this.e = l.U();
    }

    public j(InputStream inputStream, String string2) {
        if (inputStream == null) {
            throw new FileNotFoundException();
        }
        this.a = inputStream;
        this.b = string2;
        this.e = l.U();
    }

    public long c() {
        if (!l.av()) {
            return -1L;
        }
        if (this.b == null) {
            return -2L;
        }
        File file = new File(this.b);
        return file.lastModified();
    }

    public String d() {
        return this.b;
    }

    public int available() {
        return this.a.available();
    }

    public void close() {
        this.d = true;
        this.a.close();
    }

    protected void finalize() {
        if (!this.d) {
            l.b("AssetInputStream was finalized with being closed");
            l.b(this.e);
        }
    }

    public boolean equals(Object object) {
        return this.a.equals(object);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public void mark(int n2) {
        this.a.mark(n2);
    }

    public boolean markSupported() {
        return this.a.markSupported();
    }

    public int read() {
        return this.a.read();
    }

    public int read(byte[] byArray, int n2, int n3) {
        return this.a.read(byArray, n2, n3);
    }

    public int read(byte[] byArray) {
        return this.a.read(byArray);
    }

    public void reset() {
        this.a.reset();
    }

    public long skip(long l2) {
        return this.a.skip(l2);
    }

    public String toString() {
        return this.a.toString();
    }
}

