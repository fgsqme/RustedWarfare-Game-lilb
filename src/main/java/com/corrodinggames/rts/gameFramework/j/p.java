/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  org.apache.http.client.ClientProtocolException
 *  org.apache.http.message.BasicNameValuePair
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.j.aq;
import com.corrodinggames.rts.gameFramework.j.n;
import com.corrodinggames.rts.gameFramework.l;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.message.BasicNameValuePair;

class p
implements Runnable {
    p() {
    }

    public void run() {
        l.aq();
        l l2 = l.B();
        l.b("GetOwnInfoRunnable", "Starting getOwnInfoFromMasterServer");
        try {
            String string2;
            ArrayList arrayList = new ArrayList(2);
            arrayList.add((Object)new BasicNameValuePair("action", "self_info"));
            n.a((List)arrayList, "port", Integer.toString((int)l2.bX.m));
            n.a((List)arrayList, "id", l2.bX.aS);
            aq.a.b(l2.bX.aS, (List)arrayList);
            aq.a.c(l2.bX.aS, (List)arrayList);
            BufferedReader bufferedReader = n.a((List)arrayList);
            String string3 = bufferedReader.readLine();
            if (string3 == null || !string3.contains((CharSequence)"CORRODINGGAMES")) {
                l.b("GetOwnInfoRunnable", "Error bad header returned from the master server: " + string3);
                return;
            }
            while ((string2 = bufferedReader.readLine()) != null) {
                String[] stringArray = string2.split(",");
                if (stringArray.length <= 1) {
                    l.b("GetOwnInfoRunnable", "columns.length too short at:" + stringArray.length);
                    continue;
                }
                String string4 = stringArray[0];
                String string5 = stringArray[1];
                try {
                    l.b("GetOwnInfoRunnable", "got info");
                    l2.bX.a(true, string4, (Boolean)Boolean.parseBoolean((String)string5));
                }
                catch (NumberFormatException numberFormatException) {
                    l.b("GetOwnInfoRunnable", "failed to load server");
                    numberFormatException.printStackTrace();
                }
            }
            com.corrodinggames.rts.appFramework.p.l();
            l.b("GetOwnInfoRunnable", "Completed load from master server without error");
        }
        catch (ClientProtocolException clientProtocolException) {
            l2.bX.a(false, null, null);
            clientProtocolException.printStackTrace();
        }
        catch (IOException iOException) {
            l2.bX.a(false, null, null);
            iOException.printStackTrace();
        }
        catch (Exception exception) {
            l2.bX.a(false, null, null);
            l.a("GetOwnInfoRunnable Failed", exception);
        }
    }
}

