/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetFileDescriptor
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnInfoListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.corrodinggames.rts.gameFramework;

import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import com.corrodinggames.rts.gameFramework.an;
import com.corrodinggames.rts.gameFramework.ao;
import com.corrodinggames.rts.gameFramework.ap$1;
import com.corrodinggames.rts.gameFramework.ap$2;
import com.corrodinggames.rts.gameFramework.ar;
import com.corrodinggames.rts.gameFramework.as;
import com.corrodinggames.rts.gameFramework.e.a;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.utility.ae;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ap
extends as {
    MediaPlayer a;
    ao b;
    an c;

    public ap(an an2) {
        this.c = an2;
        MediaPlayer mediaPlayer = null;
        if (an2.b.size() == 0) {
            throw new RuntimeException("Music player pool empty");
        }
        mediaPlayer = (MediaPlayer)an2.b.remove(0);
        an2.c.add((Object)this);
        this.a = mediaPlayer;
    }

    @Override
    public void a(ar ar2) {
        this.b = (ao)ar2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a(boolean bl2) {
        try {
            MediaPlayer mediaPlayer = this.a;
            mediaPlayer.reset();
            AssetFileDescriptor assetFileDescriptor = null;
            if (this.b.b.startsWith("music")) {
                String string2 = e.a.e(this.b.b);
                try {
                    assetFileDescriptor = this.c.e.w.d().b(string2);
                }
                catch (IOException iOException) {
                    throw new RuntimeException((Throwable)iOException);
                }
                mediaPlayer.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
            } else {
                String string3 = e.a.e(this.b.b);
                if (ae.a(string3) == null) {
                    mediaPlayer.setDataSource(string3);
                } else {
                    j j2 = e.a.k(string3);
                    if (j2 == null) {
                        throw new RuntimeException("openAssetSteam() null for '" + string3 + "'");
                    }
                    File file = e.a.a(this.c.e.w, "music", "ogg");
                    l.e("Temp file needed for this music from zipped/abstract mod file");
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                        f.a(j2, (OutputStream)fileOutputStream);
                        fileOutputStream.close();
                        j2.close();
                        try (FileInputStream fileInputStream = new FileInputStream(file);){
                            mediaPlayer.setDataSource(fileInputStream.getFD(), 0L, (long)fileInputStream.available());
                        }
                    }
                    finally {
                        file.delete();
                    }
                }
            }
            if (bl2) {
                mediaPlayer.setLooping(true);
            }
            mediaPlayer.setVolume(0.0f, 0.0f);
            mediaPlayer.setOnInfoListener((MediaPlayer.OnInfoListener)new ap$1(this));
            mediaPlayer.setOnPreparedListener((MediaPlayer.OnPreparedListener)new ap$2(this));
            mediaPlayer.prepareAsync();
            if (assetFileDescriptor != null) {
                assetFileDescriptor.close();
            }
        }
        catch (Exception exception) {
            throw new RuntimeException((Throwable)exception);
        }
    }

    @Override
    public void a() {
        this.a.pause();
    }

    @Override
    public void b() {
        this.a.start();
    }

    @Override
    public boolean c() {
        return this.a.isPlaying();
    }

    @Override
    public void d() {
        if (this.a != null) {
            this.a.stop();
        }
    }

    @Override
    public void e() {
        if (this.a != null) {
            this.a.stop();
        }
        this.a = null;
        this.c.c.remove((Object)this);
        this.c.b.add((Object)this.a);
    }

    @Override
    public void a(float f2) {
        this.a.setVolume(f2, f2);
    }
}

