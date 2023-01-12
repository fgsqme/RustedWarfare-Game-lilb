/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.BufferedInputStream
 *  java.io.ByteArrayInputStream
 *  java.io.DataInputStream
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.util.zip.GZIPInputStream
 */
package com.corrodinggames.rts.gameFramework.j;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

public strictfp class l {
    public String a;
    public ByteArrayInputStream b;
    public DataInputStream c;

    public l(byte[] byArray, boolean bl2, boolean bl3) {
        this.b = new ByteArrayInputStream(byArray);
        Object object = bl2 ? new BufferedInputStream((InputStream)new GZIPInputStream((InputStream)this.b)) : this.b;
        this.c = new DataInputStream((InputStream)object);
    }
}

