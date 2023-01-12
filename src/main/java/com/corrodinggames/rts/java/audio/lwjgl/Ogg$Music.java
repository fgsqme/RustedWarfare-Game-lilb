/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.lang.Object
 *  java.lang.Override
 */
package com.corrodinggames.rts.java.audio.lwjgl;

import com.corrodinggames.rts.java.audio.a.a;
import com.corrodinggames.rts.java.audio.a.s;
import com.corrodinggames.rts.java.audio.lwjgl.OggInputStream;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALMusic;
import java.io.Closeable;

public class Ogg$Music
extends OpenALMusic {
    private OggInputStream input;
    private OggInputStream previousInput;

    public Ogg$Music(OpenALAudio openALAudio, a a2) {
        super(openALAudio, a2);
        if (openALAudio.noDevice) {
            return;
        }
        this.input = new OggInputStream(a2.a());
        this.setup(this.input.getChannels(), this.input.getSampleRate());
    }

    @Override
    public int read(byte[] byArray) {
        if (this.input == null) {
            this.input = new OggInputStream(this.file.a(), this.previousInput);
            this.setup(this.input.getChannels(), this.input.getSampleRate());
            this.previousInput = null;
        }
        int n2 = this.input.read(byArray);
        return n2;
    }

    @Override
    public void reset() {
        s.a((Closeable)this.input);
        this.previousInput = null;
        this.input = null;
    }

    @Override
    protected void loop() {
        s.a((Closeable)this.input);
        this.previousInput = this.input;
        this.input = null;
    }
}

