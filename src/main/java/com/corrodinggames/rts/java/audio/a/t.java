/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.lang.Object
 */
package com.corrodinggames.rts.java.audio.a;

import java.io.ByteArrayOutputStream;

public class t
extends ByteArrayOutputStream {
    public t(int n2) {
        super(n2);
    }

    public synchronized byte[] toByteArray() {
        if (this.count == this.buf.length) {
            return this.buf;
        }
        return super.toByteArray();
    }
}

