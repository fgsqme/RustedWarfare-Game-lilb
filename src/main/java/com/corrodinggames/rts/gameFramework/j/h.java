/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.net.InetAddress
 *  java.net.Socket
 *  java.net.SocketAddress
 *  java.nio.channels.SocketChannel
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.j.au;
import com.corrodinggames.rts.gameFramework.j.ay;
import com.corrodinggames.rts.gameFramework.j.c;
import com.corrodinggames.rts.gameFramework.j.i;
import com.corrodinggames.rts.gameFramework.j.j;
import com.corrodinggames.rts.gameFramework.l;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.nio.channels.SocketChannel;

public class h
extends Socket {
    c a;
    int b;
    boolean c = false;
    i d;
    j e;

    public void a(au au2) {
        this.a.a(new ay(this.b, au2));
    }

    public h(c c2, int n2) {
        this.a = c2;
        this.b = n2;
        this.d = new i(this);
        this.e = new j(this);
    }

    public void bind(SocketAddress socketAddress) {
        throw new RuntimeException("Not supported");
    }

    public synchronized void close() {
        if (!this.c) {
            this.c = true;
            l.e("Closing steam socket");
        }
        if (this.d != null) {
            this.d.a(new byte[0]);
        }
    }

    public void connect(SocketAddress socketAddress, int n2) {
        throw new RuntimeException("Not supported");
    }

    public void connect(SocketAddress socketAddress) {
        throw new RuntimeException("Not supported");
    }

    public SocketChannel getChannel() {
        throw new RuntimeException("Not supported");
    }

    public InetAddress getInetAddress() {
        return null;
    }

    public InetAddress getLocalAddress() {
        return null;
    }

    public SocketAddress getLocalSocketAddress() {
        return null;
    }

    public SocketAddress getRemoteSocketAddress() {
        return null;
    }

    public InputStream getInputStream() {
        return this.d;
    }

    public boolean getKeepAlive() {
        return true;
    }

    public int getLocalPort() {
        return 5555;
    }

    public boolean getOOBInline() {
        return false;
    }

    public OutputStream getOutputStream() {
        return this.e;
    }

    public int getPort() {
        return 5555;
    }

    public synchronized int getReceiveBufferSize() {
        return 512;
    }

    public boolean getReuseAddress() {
        return false;
    }

    public synchronized int getSendBufferSize() {
        return 512;
    }

    public int getSoLinger() {
        return 0;
    }

    public synchronized int getSoTimeout() {
        return 0;
    }

    public boolean getTcpNoDelay() {
        return true;
    }

    public int getTrafficClass() {
        return 0;
    }

    public boolean isBound() {
        return true;
    }

    public boolean isClosed() {
        return this.c;
    }

    public boolean isConnected() {
        return true;
    }

    public boolean isInputShutdown() {
        return this.d != null;
    }

    public boolean isOutputShutdown() {
        return this.e != null;
    }

    public void sendUrgentData(int n2) {
    }

    public void setKeepAlive(boolean bl2) {
    }

    public void setOOBInline(boolean bl2) {
    }

    public void setPerformancePreferences(int n2, int n3, int n4) {
    }

    public synchronized void setReceiveBufferSize(int n2) {
    }

    public void setReuseAddress(boolean bl2) {
    }

    public synchronized void setSendBufferSize(int n2) {
    }

    public void setSoLinger(boolean bl2, int n2) {
    }

    public synchronized void setSoTimeout(int n2) {
    }

    public void setTcpNoDelay(boolean bl2) {
    }

    public void setTrafficClass(int n2) {
    }

    public void shutdownInput() {
    }

    public void shutdownOutput() {
    }

    public String toString() {
        return "<ForwardedSocket>";
    }
}

