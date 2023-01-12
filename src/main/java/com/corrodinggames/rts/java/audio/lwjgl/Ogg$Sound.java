/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.io.Closeable
 *  java.lang.Object
 *  java.lang.Throwable
 */
package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.java.audio.a.a;
import com.corrodinggames.rts.java.audio.a.s;
import com.corrodinggames.rts.java.audio.lwjgl.OggInputStream;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALSound;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;

public class Ogg$Sound
extends OpenALSound {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Ogg$Sound(OpenALAudio openALAudio, a a2) {
        super(openALAudio);
        if (openALAudio.noDevice) {
            return;
        }
        OggInputStream oggInputStream = null;
        try {
            int n2;
            oggInputStream = new OggInputStream(a2.a());
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(4096);
            byte[] byArray = new byte[2048];
            while (!oggInputStream.atEnd() && (n2 = oggInputStream.read(byArray)) != -1) {
                byteArrayOutputStream.write(byArray, 0, n2);
            }
            this.setup(byteArrayOutputStream.toByteArray(), oggInputStream.getChannels(), oggInputStream.getSampleRate());
        }
        catch (Throwable throwable) {
            s.a(oggInputStream);
            throw throwable;
        }
        s.a((Closeable)oggInputStream);
    }
}

