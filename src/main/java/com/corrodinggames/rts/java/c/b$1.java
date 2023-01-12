/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.corrodinggames.rts.java.c;

import com.codedisaster.steamworks.SteamID;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.j.c;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.o.a;
import com.corrodinggames.rts.java.c.b;
import com.corrodinggames.rts.java.c.k;
import java.io.IOException;

class b$1
implements Runnable {
    final /* synthetic */ SteamID a;
    final /* synthetic */ b b;

    b$1(b b2, SteamID steamID) {
        this.b = b2;
        this.a = steamID;
    }

    public void run() {
        l l2 = l.B();
        try {
            this.b.a("connectTo runnable start");
            Root root = ScriptEngine.getInstance().getRoot();
            l2.bX.b("starting new");
            this.b.n = this.a;
            this.b.p = this.b.d.getLobbyOwner(this.b.n);
            String string2 = l2.bQ.lastNetworkPlayerName;
            String string3 = com.corrodinggames.rts.gameFramework.o.a.a().c();
            if (string3 != null && string2 == null) {
                string2 = string3;
                string2 = string2.replace((CharSequence)" ", (CharSequence)"_");
                string2 = f.a(string2, 20);
            }
            l2.bX.y = string2;
            k k2 = new k(this.b, this.b.p);
            this.b.l.put((Object)this.b.p, (Object)k2);
            l2.bX.a(k2);
            for (c c2 : l2.bX.aM) {
                c2.i = true;
            }
            this.b.a("connected");
            root.showBattleroom();
            this.b.a("connectTo runnable end");
        }
        catch (IOException iOException) {
            String string4 = iOException.getMessage();
            l2.c(string4, "Connection failed");
            iOException.printStackTrace();
        }
    }
}

