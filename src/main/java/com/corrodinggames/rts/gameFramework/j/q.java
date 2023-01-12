/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Timer
 *  java.util.TimerTask
 *  org.apache.http.message.BasicNameValuePair
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.j.n;
import com.corrodinggames.rts.gameFramework.j.o;
import com.corrodinggames.rts.gameFramework.j.q$1;
import com.corrodinggames.rts.gameFramework.l;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.http.message.BasicNameValuePair;

class q
implements Runnable {
    Runnable a;

    q(Runnable runnable) {
        this.a = runnable;
    }

    public void run() {
        l.aq();
        l l2 = l.B();
        l.b("LoadFromMasterServer", "Starting load");
        int n2 = n.e++;
        try {
            Timer timer = new Timer();
            timer.schedule((TimerTask)new o(n2), 5000L);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add((Object)new BasicNameValuePair("action", "list"));
            arrayList.add((Object)new BasicNameValuePair("game_version", Integer.toString((int)l2.c(true))));
            arrayList.add((Object)new BasicNameValuePair("game_version_beta", f.a(l2.n())));
            boolean bl2 = false;
            n.a((List)arrayList, false, new q$1(this, n2, l2));
        }
        catch (Exception exception) {
            exception.printStackTrace();
            l2.a("Error getting game list from server", 1);
        }
    }
}

