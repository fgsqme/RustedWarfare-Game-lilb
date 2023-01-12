/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.BufferedOutputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.DataOutputStream
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.util.zip.GZIPOutputStream
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.l;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public strictfp class at {
    public GZIPOutputStream a;
    public BufferedOutputStream b;
    public String c;
    public ByteArrayOutputStream d = new ByteArrayOutputStream();
    public DataOutputStream e;
    public boolean f = false;

    public void a() {
        this.e.flush();
        if (this.b != null) {
            this.b.flush();
        }
        if (this.a != null) {
            this.a.finish();
        }
    }

    public void b() {
        if (!this.f) {
            this.e.close();
        } else {
            l.g("TODO: Cannot yet close wrapped stream");
        }
    }

    public at(boolean bl2) {
        ByteArrayOutputStream byteArrayOutputStream;
        if (bl2) {
            this.a = new GZIPOutputStream((OutputStream)this.d);
            this.b = new BufferedOutputStream((OutputStream)this.a);
            byteArrayOutputStream = this.b;
        } else {
            byteArrayOutputStream = this.d;
        }
        this.e = new DataOutputStream((OutputStream)byteArrayOutputStream);
    }
}

