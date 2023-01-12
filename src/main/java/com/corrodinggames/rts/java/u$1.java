/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.io.FileOutputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.java.u;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;

class u$1
implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ ByteArrayOutputStream b;
    final /* synthetic */ String c;
    final /* synthetic */ u d;

    u$1(u u2, String string2, ByteArrayOutputStream byteArrayOutputStream, String string3) {
        this.d = u2;
        this.a = string2;
        this.b = byteArrayOutputStream;
        this.c = string3;
    }

    public void run() {
        try {
            try (FileOutputStream fileOutputStream = new FileOutputStream(this.a);){
                fileOutputStream.write(this.b.toByteArray());
            }
            l.e("Screenshot saved: " + this.c);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            l.n("Failed to write screenshot:" + exception.getMessage());
        }
    }
}

