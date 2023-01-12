/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.OutputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.corrodinggames.rts.game;

import android.graphics.Bitmap;
import android.graphics.Bitmap$CompressFormat;
import com.corrodinggames.rts.game.i;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

class k
implements Runnable {
    public Bitmap a;
    public int b;
    final /* synthetic */ i c;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public strictfp void run() {
        k k2 = this;
        synchronized (k2) {
            try {
                File file = new File(this.c.h + "image_" + String.format((String)"%07d", (Object[])new Object[]{this.b}) + ".jpg");
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                this.a.a(Bitmap$CompressFormat.a, 85, (OutputStream)fileOutputStream);
                fileOutputStream.close();
            }
            catch (Exception exception) {
                exception.printStackTrace();
                this.c.bo = false;
                this.c.a("Error saving jpg, recording has stopped. Is there free space remaining on the SD card?", 1);
            }
        }
    }
}

