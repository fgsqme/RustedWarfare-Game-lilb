/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.ServerSocket
 *  java.net.Socket
 *  java.util.ArrayList
 *  java.util.Locale
 */
package com.corrodinggames.rts.gameFramework.c;

import com.corrodinggames.rts.gameFramework.c.b;
import com.corrodinggames.rts.gameFramework.c.c;
import com.corrodinggames.rts.gameFramework.l;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Locale;

public class a
implements Runnable {
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static float e;
    boolean f = true;
    public static boolean g;
    public ServerSocket h;
    public boolean i = true;
    static ArrayList j;

    public static void a() {
        if (!a) {
            return;
        }
        l.e("-----");
        l.e("-----");
        l.e("----- Debug Active ----");
        l.e("-----");
        l.e("-----");
        l.aV = true;
        l.B().s();
        a a2 = new a();
        a2.b();
    }

    public void b() {
        if (b) {
            this.a(5677, "");
        }
        l.B().eb.a(new c(this));
    }

    public void a(int n2, String string2) {
        try {
            g = true;
            l.aT = true;
            l.e("");
            l.e("----- createDebugSocket ----");
            l.e("port: " + n2);
            l.e("password: " + string2);
            l.e("------------------");
            l.e("");
            if (n2 != -1) {
                this.h = new ServerSocket(n2);
                Thread thread = new Thread((Runnable)this);
                thread.start();
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException((Throwable)iOException);
        }
    }

    private a() {
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void run() {
        try {
            while (this.i) {
                Socket socket = this.h.accept();
                try {
                    socket.setTcpNoDelay(true);
                    b b2 = new b(this, socket);
                    Thread thread = new Thread((Runnable)b2);
                    thread.run();
                }
                catch (IOException iOException) {
                    l.e("Got IOException on debug connection");
                    iOException.printStackTrace();
                    throw new RuntimeException((Throwable)iOException);
                    return;
                }
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException((Throwable)iOException);
        }
    }

    public static String a(String string2) {
        String string3 = null;
        String[] stringArray = null;
        int n2 = string2.indexOf(" ");
        if (n2 == -1) {
            n2 = string2.length();
        }
        String string4 = string2.substring(0, n2).toLowerCase(Locale.ENGLISH);
        if (n2 != -1 && string2.length() >= n2 + 1) {
            string3 = string2.substring(n2 + 1);
            stringArray = string3.split(" ");
        }
        if (string4.equalsIgnoreCase("ping")) {
            return "pong";
        }
        if (string4.equalsIgnoreCase("script")) {
            return "todo";
        }
        if (string4.equalsIgnoreCase("function") || string4.equalsIgnoreCase("functionNoTimeout")) {
            return "todo";
        }
        return "unknown command";
    }

    static {
        g = true;
        j = new ArrayList();
    }
}

