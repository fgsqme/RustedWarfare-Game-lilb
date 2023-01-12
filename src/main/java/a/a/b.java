/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.InterruptedException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.net.DatagramSocket
 *  java.net.InetAddress
 *  java.net.InetSocketAddress
 *  java.net.ServerSocket
 *  java.net.Socket
 *  java.net.SocketAddress
 *  java.net.SocketException
 *  java.net.SocketTimeoutException
 *  java.util.ArrayList
 *  java.util.HashMap
 */
package a.a;

import a.a.c;
import a.a.d;
import a.a.e;
import a.a.f;
import a.a.s;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;

public class b
extends ServerSocket {
    c a;
    private DatagramSocket d;
    private int e;
    private int f;
    private boolean g;
    private ArrayList h;
    private HashMap i;
    private HashMap j;
    private HashMap k;
    long b;
    int c;
    private s l;

    public b() {
        this(new DatagramSocket(null), 0);
    }

    public b(int n2, int n3, InetAddress inetAddress, boolean bl2) {
        DatagramSocket datagramSocket = new DatagramSocket(null);
        datagramSocket.setReuseAddress(bl2);
        datagramSocket.bind((SocketAddress)new InetSocketAddress(inetAddress, n2));
        this.a(datagramSocket, n3);
    }

    public b(DatagramSocket datagramSocket, int n2) {
        this.a(datagramSocket, n2);
    }

    public void a(DatagramSocket datagramSocket, int n2) {
        if (datagramSocket == null) {
            throw new NullPointerException("sock");
        }
        this.d = datagramSocket;
        this.f = n2 <= 0 ? 50 : n2;
        this.h = new ArrayList(this.f);
        this.i = new HashMap();
        this.j = new HashMap();
        this.k = new HashMap();
        this.l = new f(this, null);
        this.e = 0;
        this.g = false;
        new d(this).start();
    }

    public void a(c c2) {
        this.a = c2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public Socket accept() {
        if (this.isClosed()) {
            throw new SocketException("Socket is closed");
        }
        ArrayList arrayList = this.h;
        synchronized (arrayList) {
            while (this.h.isEmpty()) {
                try {
                    if (this.e == 0) {
                        this.h.wait();
                    } else {
                        long l2 = System.currentTimeMillis();
                        this.h.wait((long)this.e);
                        if (System.currentTimeMillis() - l2 >= (long)this.e) {
                            throw new SocketTimeoutException();
                        }
                    }
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                if (!this.isClosed()) continue;
                throw new SocketException("Socket is closed");
            }
            return (Socket)this.h.remove(0);
        }
    }

    public synchronized void bind(SocketAddress socketAddress) {
        this.bind(socketAddress, 0);
    }

    public synchronized void bind(SocketAddress socketAddress, int n2) {
        if (this.isClosed()) {
            throw new SocketException("Socket is closed");
        }
        this.d.setReuseAddress(true);
        this.d.bind(socketAddress);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void close() {
        if (this.isClosed()) {
            return;
        }
        this.g = true;
        ArrayList arrayList = this.h;
        synchronized (arrayList) {
            this.h.clear();
            this.h.notify();
        }
        arrayList = this.i;
        synchronized (arrayList) {
            if (this.i.isEmpty()) {
                this.d.close();
            }
        }
    }

    public InetAddress getInetAddress() {
        return this.d.getInetAddress();
    }

    public int getLocalPort() {
        return this.d.getLocalPort();
    }

    public SocketAddress getLocalSocketAddress() {
        return this.d.getLocalSocketAddress();
    }

    public boolean isBound() {
        return this.d.isBound();
    }

    public boolean isClosed() {
        return this.g;
    }

    public void setSoTimeout(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("timeout < 0");
        }
        this.e = n2;
    }

    public int getSoTimeout() {
        return this.e;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(SocketAddress socketAddress, e e2) {
        HashMap hashMap = this.i;
        synchronized (hashMap) {
            e2.a(this.l);
            this.i.put((Object)socketAddress, (Object)e2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private e a(SocketAddress socketAddress) {
        HashMap hashMap = this.i;
        synchronized (hashMap) {
            e e2 = (e)((Object)this.i.remove((Object)socketAddress));
            if (this.i.isEmpty() && this.isClosed()) {
                this.d.close();
            }
            return e2;
        }
    }

    private void a(String string2) {
        if (this.b + 5000L < System.currentTimeMillis()) {
            this.b = System.currentTimeMillis();
            this.c = 0;
        }
        if (this.c > 20) {
            return;
        }
        ++this.c;
        System.out.println(string2);
    }

    static /* synthetic */ DatagramSocket a(b b2) {
        return b2.d;
    }

    static /* synthetic */ void a(b b2, String string2) {
        b2.a(string2);
    }

    static /* synthetic */ HashMap b(b b2) {
        return b2.i;
    }

    static /* synthetic */ HashMap c(b b2) {
        return b2.k;
    }

    static /* synthetic */ HashMap d(b b2) {
        return b2.j;
    }

    static /* synthetic */ void a(b b2, SocketAddress socketAddress, e e2) {
        b2.a(socketAddress, e2);
    }

    static /* synthetic */ ArrayList e(b b2) {
        return b2.h;
    }

    static /* synthetic */ e a(b b2, SocketAddress socketAddress) {
        return b2.a(socketAddress);
    }
}

