/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.j.ad;
import com.corrodinggames.rts.gameFramework.j.an;
import com.corrodinggames.rts.gameFramework.l;
import java.io.IOException;

strictfp class ad$8
implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ ad b;

    ad$8(ad ad2, boolean bl2) {
        this.b = ad2;
        this.a = bl2;
    }

    public void run() {
        l l2 = l.B();
        l.e("startJoinServerInternalThread callback");
        an an2 = this.b.bF;
        this.b.bF = null;
        if (an2 == null) {
            l.e("startJoinServerInternalThread callback gameConnector==null");
            return;
        }
        if (an2.e != null) {
            l.e("startJoinServerInternalThread failed to connect: " + an2.e);
            if (this.a) {
                l2.bX.b("Reconnect failed: " + an2.e);
                this.b.b("Reconnect failed", "reconnect failed");
                l2.d("Reconnect failed", "Reconnect failed: " + an2.e);
                l2.i("Reconnect failed: " + an2.e);
            }
            return;
        }
        try {
            l2.bX.b("starting new");
            l2.bX.a(an2.g);
        }
        catch (IOException iOException) {
            String string2 = iOException.getMessage();
            l2.c(string2, "Connection failed");
            iOException.printStackTrace();
        }
    }
}

