/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.net.UnknownHostException
 *  java.util.List
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.j.n;
import com.corrodinggames.rts.gameFramework.j.s;
import com.corrodinggames.rts.gameFramework.l;
import java.io.BufferedReader;
import java.net.UnknownHostException;
import java.util.List;

class u
implements Runnable {
    int a;
    List b;
    s c;
    String d;
    boolean e;

    public u(List list, s s2, String string2, boolean bl2, int n2) {
        this.a = n2;
        this.b = list;
        this.c = s2;
        this.d = string2;
        this.e = bl2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        Object object;
        block10: {
            l l2 = l.B();
            try {
                if (n.a) {
                    l.b("LoadFromMasterServer", this.a + ": Started doSingleRequest");
                }
                object = n.a((List)this.b, (String)this.d, (boolean)this.e).a;
                if (n.a) {
                    l.b("LoadFromMasterServer", this.a + ": Ended doSingleRequest");
                }
                this.c.a((BufferedReader)object, this.a, this.d);
            }
            catch (Exception exception) {
                exception.printStackTrace();
                String string2 = f.a(exception, true);
                if (exception instanceof UnknownHostException) {
                    string2 = "DNS lookup failed, check your internet connection";
                }
                if (string2 != null && string2.contains((CharSequence)"Cleartext HTTP traffic")) {
                    string2 = string2 + " ( Broken apk file? - " + l2.l() + ")";
                }
                this.c.d = "#" + this.a + ": " + string2;
                String string3 = "Error getting game list from server #" + this.a;
                l.e(string3);
                if (!l2.p()) break block10;
                l2.a("Error getting game list from server #" + this.a, 1);
            }
        }
        object = this.c;
        synchronized (object) {
            --this.c.f;
            if (this.c.f == 0) {
                this.c.a();
            }
        }
    }
}

