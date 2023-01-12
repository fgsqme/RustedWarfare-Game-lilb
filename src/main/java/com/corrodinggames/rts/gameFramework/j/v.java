/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.List
 */
package com.corrodinggames.rts.gameFramework.j;

import android.os.Build;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.j.n;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.o.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class v
implements Runnable {
    String a;
    String b;

    v() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        long l2 = l.V();
        l l3 = l.B();
        l.b("SendErrorReport", "Starting");
        try {
            String string2;
            ArrayList arrayList = new ArrayList(2);
            n.a((List)arrayList, "action", "error_report");
            n.a((List)arrayList, "game_version", Integer.toString((int)l3.c(false)));
            n.a((List)arrayList, "game_version_internal", Integer.toString((int)l3.c(true)));
            n.a((List)arrayList, "game_version_string", l3.r());
            n.a((List)arrayList, "package_name", l3.l());
            n.a((List)arrayList, "installation_source", l3.m());
            String string3 = "" + Build.VERSION.SDK_INT;
            if (l.av()) {
                string3 = "s:0;";
                if (com.corrodinggames.rts.gameFramework.o.a.a().e()) {
                    string3 = "s:1;";
                }
            }
            if (l.av() || l.aZ) {
                string2 = System.getProperty((String)"os.name") + " - " + System.getProperty((String)"os.version");
                n.a((List)arrayList, "system_version", string2);
            }
            n.a((List)arrayList, "sdk_version", string3);
            n.a((List)arrayList, "device_model", l3.G());
            n.a((List)arrayList, "build_version", l3.H());
            n.a((List)arrayList, "release_version", f.a(l.as));
            n.a((List)arrayList, "dedicated_server", f.a(l.aU));
            string2 = "NA";
            if (l3.bX != null) {
                string2 = l3.bX.aR;
            }
            n.a((List)arrayList, "private_token", string2);
            n.a((List)arrayList, "private_token_2", f.b(f.b(string2)));
            n.a((List)arrayList, "message", this.a);
            n.a((List)arrayList, "stacktrace", this.b);
            l.b("SendErrorReport", "making request");
            BufferedReader bufferedReader = n.a((List)arrayList);
            String string4 = bufferedReader.readLine();
            if (string4 == null || !string4.contains((CharSequence)"CORRODINGGAMES")) {
                l.b("StartCreateOnMasterServer", "Error bad header returned from the master server: " + string4);
                return;
            }
            l.b("SendErrorReport", "Send trace successfully");
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        finally {
            float f2 = (float)(l.V() - l2) / 1000000.0f;
            l.b("SendErrorReport", "took: " + f2 + " seconds");
        }
    }
}

