/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.j.aq;
import com.corrodinggames.rts.gameFramework.j.n;
import com.corrodinggames.rts.gameFramework.l;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class y
implements Runnable {
    y() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        l.aq();
        long l2 = l.V();
        l l3 = l.B();
        l.b("StartCreateOnMasterServer", "Starting create");
        try {
            ArrayList arrayList = new ArrayList(2);
            n.a((List)arrayList, "action", "add");
            String string2 = "u_" + f.b();
            n.a((List)arrayList, "user_id", string2);
            aq.a.a(string2, (List)arrayList);
            n.a((List)arrayList, "game_name", "Unnamed");
            n.a((List)arrayList, "game_version", Integer.toString((int)l3.c(true)));
            if (!l3.bX.v) {
                n.a((List)arrayList, "game_version_string", l3.v());
            } else {
                n.a((List)arrayList, "game_version_string", "ANY");
            }
            n.a((List)arrayList, "game_version_beta", f.a(l3.n()));
            String string3 = l3.bX.au();
            if (string3 != null) {
                n.a((List)arrayList, "game_mods", string3);
            }
            n.a((List)arrayList, "private_token", l3.bX.aR);
            n.a((List)arrayList, "private_token_2", f.b(f.b(l3.bX.aR)));
            n.a((List)arrayList, "confirm", f.b("a" + f.b(l3.bX.aR)));
            n.b((List)arrayList);
            BufferedReader bufferedReader = n.a((List)arrayList, 15);
            String string4 = bufferedReader.readLine();
            if (string4 == null || !string4.contains((CharSequence)"CORRODINGGAMES")) {
                l.b("StartCreateOnMasterServer", "Error bad header returned from the master server: " + string4);
                return;
            }
            String string5 = bufferedReader.readLine();
            String[] stringArray = string5.split(",");
            if (stringArray.length < 1) {
                l.b("StartCreateOnMasterServer", "columns.length too short at:" + stringArray.length);
            }
            String string6 = stringArray[0];
            try {
                String string7 = string6;
                l.b("StartCreateOnMasterServer", "Created server is:" + string7);
                l3.bX.aS = string7;
            }
            catch (NumberFormatException numberFormatException) {
                l.b("StartCreateOnMasterServer", "failed to load server");
                numberFormatException.printStackTrace();
            }
            if (stringArray.length >= 2) {
                try {
                    aq.f = Integer.parseInt((String)stringArray[1]);
                }
                catch (NumberFormatException numberFormatException) {
                    aq.f = -1;
                }
            }
            l.b("StartCreateOnMasterServer", "Completed create from master server without error");
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        finally {
            float f2 = (float)(l.V() - l2) / 1000000.0f;
            l.b("StartCreateOnMasterServer", "create took: " + f2 + " seconds");
        }
    }
}

