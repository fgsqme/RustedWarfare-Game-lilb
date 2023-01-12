/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.j.n;
import com.corrodinggames.rts.gameFramework.l;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class aa
implements Runnable {
    aa() {
    }

    public void run() {
        l.aq();
        l l2 = l.B();
        try {
            ArrayList arrayList = new ArrayList(2);
            n.a((List)arrayList, "action", "update");
            String string2 = l2.bX.aS;
            if (string2 == null) {
                l.b("startUpdateOnMasterServer", "No game id");
                return;
            }
            n.a((List)arrayList, "id", string2);
            n.a((List)arrayList, "private_token", l2.bX.aR);
            if (l.ax()) {
                n.a((List)arrayList, "check_port", "false");
            }
            n.b((List)arrayList);
            BufferedReader bufferedReader = n.a((List)arrayList);
            String string3 = bufferedReader.readLine();
            if (string3 == null || !string3.contains((CharSequence)"CORRODINGGAMES")) {
                l.b("startUpdateOnMasterServer", "Error bad header returned from the master server: " + string3);
                return;
            }
            String string4 = bufferedReader.readLine();
            if (!"GAME UPDATED".equals((Object)string4)) {
                l.b("startUpdateOnMasterServer", "Update server response was:" + string4);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}

