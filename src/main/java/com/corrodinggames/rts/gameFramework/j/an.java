/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.net.Socket
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.j.ad;
import com.corrodinggames.rts.gameFramework.j.ag;
import com.corrodinggames.rts.gameFramework.l;
import java.io.IOException;
import java.net.Socket;

public strictfp class an
implements Runnable {
    String a;
    boolean b;
    boolean c;
    Thread d;
    public String e;
    Runnable f;
    public Socket g;
    boolean h = false;

    public an(String string2, boolean bl2, Runnable runnable) {
        this.a = string2;
        this.b = bl2;
        this.f = runnable;
    }

    public boolean a() {
        if (!this.c) {
            return false;
        }
        this.h = true;
        return true;
    }

    public void b() {
        this.c = true;
        this.d = new Thread((Runnable)this);
        this.d.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        try {
            this.g = ad.b(this.a, this.b);
        }
        catch (IOException iOException) {
            String string2;
            this.e = string2 = iOException.getMessage();
            iOException.printStackTrace();
            return;
        }
        catch (ag ag2) {
            l.e("Cancelled connectSocketToServer");
            this.e = "CANCELLED";
        }
        finally {
            this.c = false;
            if (this.h) {
                if (this.g != null) {
                    try {
                        this.g.close();
                        this.g = null;
                        this.e = "cancelled";
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                    }
                }
            } else {
                this.f.run();
            }
        }
    }
}

