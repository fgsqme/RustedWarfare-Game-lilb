/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.InetAddress
 *  java.net.Socket
 *  java.util.concurrent.ConcurrentLinkedQueue
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.appFramework.n;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.j.ad;
import com.corrodinggames.rts.gameFramework.j.as;
import com.corrodinggames.rts.gameFramework.j.au;
import com.corrodinggames.rts.gameFramework.j.d;
import com.corrodinggames.rts.gameFramework.j.e;
import com.corrodinggames.rts.gameFramework.l;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.ConcurrentLinkedQueue;

public strictfp class c {
    private final ad W;
    volatile boolean a = false;
    volatile boolean b = false;
    public int c;
    public Socket d;
    InetAddress e;
    ConcurrentLinkedQueue f = new ConcurrentLinkedQueue();
    public long g;
    public boolean h;
    public boolean i;
    public c j;
    public int k = -1;
    au l;
    public String m;
    public String n;
    public String o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public int x;
    public int y;
    public com.corrodinggames.rts.game.e z;
    int A = -1;
    long B = -1L;
    boolean C = false;
    boolean D = false;
    public int E = 999999;
    d F;
    e G;
    Thread H;
    Thread I;
    boolean J = false;
    boolean K = false;
    public String L;
    public int M;
    public boolean N;
    public boolean O;
    public int P;
    public boolean Q;
    public int R;
    public long S;
    public boolean T;
    volatile int U;
    volatile int V;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public c(ad ad2, Socket socket) {
        this.W = ad2;
        this.d = socket;
        Object object = this.W.aQ;
        synchronized (object) {
            this.c = this.W.aP++;
        }
        this.M = com.corrodinggames.rts.gameFramework.f.a(1, 1000000);
    }

    public boolean a() {
        if (this.S < System.currentTimeMillis() - 10000L) {
            this.S = System.currentTimeMillis();
            this.R = 0;
        }
        if (this.R > 100) {
            if (!this.T) {
                this.T = true;
                this.c("Command limit was reached");
            }
            return true;
        }
        ++this.R;
        return false;
    }

    public int b() {
        if (this.B == -1L) {
            return -2;
        }
        if (this.B < System.currentTimeMillis() - 5000L) {
            return -1;
        }
        return this.A;
    }

    int c() {
        com.corrodinggames.rts.game.e e2 = this.z;
        if (e2 != null) {
            return e2.k;
        }
        return -1;
    }

    public synchronized void d() {
        this.G = new e(this);
        this.I = new Thread((Runnable)this.G);
        this.I.setDaemon(true);
        this.I.start();
        this.F = new d(this, null);
        this.H = new Thread((Runnable)this.F);
        this.H.setDaemon(true);
        this.H.start();
    }

    private void i() {
        com.corrodinggames.rts.game.e e2;
        this.a = true;
        if (this.W.C && !this.W.n() && (e2 = this.z) != null) {
            this.z = null;
            c c2 = this.W.d(e2);
            if (c2 == null) {
                e2.I();
                this.W.P();
                com.corrodinggames.rts.appFramework.n.o();
            }
        }
        if (this.H != null) {
            this.H.interrupt();
        }
        this.W.b(this);
        this.p = false;
        if (this.q) {
            this.W.c(this, "Closing");
        }
    }

    private synchronized void j() {
        if (this.a) {
            return;
        }
        this.b = true;
        if (this.G != null) {
            this.G.a();
        }
        if (this.H != null) {
            this.H.interrupt();
        }
        this.W.b(this);
    }

    public void a(String string2) {
        as as2 = new as();
        try {
            if (string2 == null) {
                string2 = "NULL";
            }
            as2.c(string2);
        }
        catch (IOException iOException) {
            throw new RuntimeException((Throwable)iOException);
        }
        this.a(as2.b(111));
        this.j();
    }

    private synchronized void a(boolean bl2, boolean bl3) {
        this.a(bl2, bl3, "Time out");
    }

    public String e() {
        String string2 = "<null>";
        if (this.z != null) {
            string2 = this.z.v;
        }
        return string2;
    }

    public String f() {
        if (this.j != null) {
            return this.n;
        }
        try {
            InetAddress inetAddress;
            Socket socket = this.d;
            if (socket != null && (inetAddress = socket.getInetAddress()) != null) {
                return inetAddress.getHostAddress();
            }
            return null;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return null;
        }
    }

    public String g() {
        if (this.j != null) {
            if (this.n == null) {
                return "<forwarded unknown>";
            }
            return this.n;
        }
        String string2 = "<no socket>";
        try {
            Socket socket = this.d;
            if (socket != null) {
                string2 = "<no bond socket>";
                InetAddress inetAddress = socket.getInetAddress();
                if (inetAddress != null) {
                    string2 = inetAddress.getHostAddress();
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return "<socket error>";
        }
        return string2;
    }

    public synchronized void a(boolean bl2, boolean bl3, String string2) {
        if (!this.a) {
            Object object;
            this.c("handleRemoteDisconnect");
            String string3 = null;
            if (this.z != null) {
                string3 = this.z.v;
            }
            String string4 = null;
            if (this.z != null) {
                String string5 = "player";
                object = "";
                if (this.z.b()) {
                    string5 = "spectator";
                } else if (this.W.aW) {
                    int n2 = this.z.a(false, false);
                    object = n2 == 0 ? " (Had no units)" : " (Team " + this.z.h() + ")";
                }
                string4 = string5 + " '" + this.z.v + "' disconnected" + (String)object;
            } else if (this.p) {
                string4 = this.s && this.q ? "relay server disconnected" : "a player disconnected";
            }
            if (!this.W.C) {
                string4 = "The server disconnected";
            }
            if (string4 != null && string2 != null) {
                string4 = string4 + "  (" + ad.i(string2) + ")";
            }
            this.i();
            if (string4 != null) {
                boolean bl4 = false;
                if (this.z != null && this.W.C && (object = this.W.d(this.z)) != null) {
                    bl4 = true;
                }
                if (!bl4) {
                    if (!this.W.C) {
                        this.W.f(string4);
                    } else {
                        this.W.j(string4);
                    }
                } else {
                    this.c("Not sending: '" + string4 + "' still another active connection");
                }
            }
            this.W.d.b(this, string3);
        } else {
            this.c("handleRemoteDisconnect: connection is already disconnecting");
        }
        if (!bl3 && this.G != null) {
            this.G.a();
        }
        if (bl3) {
            this.J = true;
        }
        if (bl2) {
            this.K = true;
        }
        if (this.J && this.K) {
            try {
                this.d.close();
            }
            catch (IOException iOException) {
                com.corrodinggames.rts.gameFramework.l.a("Error while closing network socket", (Throwable)iOException);
            }
            this.I = null;
            this.H = null;
            this.G = null;
            this.F = null;
            if (this.f != null) {
                this.f.clear();
            }
        }
    }

    public void a(String string2, Throwable throwable) {
        com.corrodinggames.rts.gameFramework.l.a(this.d(string2), throwable);
    }

    public void b(String string2) {
        com.corrodinggames.rts.gameFramework.l.b(this.d(string2));
    }

    public void c(String string2) {
        com.corrodinggames.rts.gameFramework.l.e(this.d(string2));
    }

    public String d(String string2) {
        string2 = "id:" + this.c + ": " + string2;
        com.corrodinggames.rts.game.e e2 = this.z;
        if (e2 != null) {
            string2 = string2 + " (Player:" + e2.v + ")";
        }
        return string2;
    }

    public void a(au au2) {
        if (this.G == null && this.a) {
            return;
        }
        this.G.a(au2);
    }

    public boolean h() {
        return !this.a;
    }

    public void finalize() {
        try {
            if (this.d == null || this.d.isClosed()) {
                return;
            }
            com.corrodinggames.rts.gameFramework.l.e("Connection::finalize called on unclosed socket (index:" + this.c + ")");
            if (this.d.getInetAddress() == null) {
                com.corrodinggames.rts.gameFramework.l.e("Skipping possible steam socket");
            }
            try {
                this.d.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        catch (RuntimeException runtimeException) {
            runtimeException.printStackTrace();
        }
    }

    static /* synthetic */ void a(c c2, boolean bl2, boolean bl3) {
        c2.a(bl2, bl3);
    }

    static /* synthetic */ ad a(c c2) {
        return c2.W;
    }
}

