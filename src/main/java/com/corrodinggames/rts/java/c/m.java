/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 */
package com.corrodinggames.rts.java.c;

import com.codedisaster.steamworks.SteamException;
import com.codedisaster.steamworks.SteamNetworking$P2PSend;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.java.c.b;
import com.corrodinggames.rts.java.c.k;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public class m
extends OutputStream {
    boolean a = true;
    final /* synthetic */ k b;

    public m(k k2) {
        this.b = k2;
    }

    public void write(int n2) {
        l.g("SteamSocketOutputStream: Slow write: " + n2);
        byte[] byArray = new byte[]{(byte)n2};
        this.write(byArray);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void write(byte[] byArray, int n2, int n3) {
        if (this.b.b) {
            l.e("cannot write steam socket closed");
            return;
        }
        if (n3 > 307200) {
            int n4;
            l.e("Steam spliting large packet to:" + this.b.e + " len:" + n3);
            int n5 = n3;
            do {
                if ((n4 = n5) > 256000) {
                    n4 = 256000;
                }
                this.write(byArray, n2, n4);
                n2 += n4;
            } while ((n5 -= n4) > 0);
            return;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int)n3);
        byteBuffer.put(byArray, n2, n3);
        byteBuffer.flip();
        b b2 = this.b.a;
        synchronized (b2) {
            try {
                boolean bl2;
                if (this.a) {
                    this.a = false;
                    l.e("First packet to:" + this.b.e);
                }
                if (!(bl2 = this.b.a.h.sendP2PPacket(this.b.e, byteBuffer, SteamNetworking$P2PSend.Reliable, 0))) {
                    l.e("steam sendP2PPacket failed (size: " + n3 + " to:" + this.b.e + ")");
                }
            }
            catch (SteamException steamException) {
                throw new IOException((Throwable)((Object)steamException));
            }
        }
    }

    public void write(byte[] byArray) {
        this.write(byArray, 0, byArray.length);
    }
}

