/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Locale
 *  org.apache.http.message.BasicNameValuePair
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.j.n;
import com.corrodinggames.rts.gameFramework.j.w;
import com.corrodinggames.rts.gameFramework.j.x;
import com.corrodinggames.rts.gameFramework.l;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.apache.http.message.BasicNameValuePair;

class ab
implements Runnable {
    w a;
    String b;
    int c;
    String d;

    ab() {
    }

    public void run() {
        l.aq();
        l l2 = l.B();
        l.b("getGameServerInfoFromMasterServer", "Starting getGameServerInfoFromMasterServer");
        String string2 = n.a(this.c);
        boolean bl2 = false;
        String string3 = null;
        if (this.d != null) {
            string3 = f.c(this.b + this.d, 3);
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add((Object)new BasicNameValuePair("action", "get"));
            arrayList.add((Object)new BasicNameValuePair("game_id", this.b));
            arrayList.add((Object)new BasicNameValuePair("c", string2));
            arrayList.add((Object)new BasicNameValuePair("p_hash", string3));
            BufferedReader bufferedReader = n.a((List)arrayList);
            String string4 = bufferedReader.readLine();
            if (string4 == null || !string4.contains((CharSequence)"CORRODINGGAMES")) {
                l.b("getGameServerInfoFromMasterServerRunnable", "Error bad header returned from the master server: " + string4);
                this.a.a("Unexpected header from master server", x.b, null);
                return;
            }
            String string5 = bufferedReader.readLine();
            if (string5 == null) {
                throw new IOException("Unexpected end of response");
            }
            if (string4.contains((CharSequence)"[FAILED]")) {
                l.b("Got failed header with status:" + string5);
                String string6 = "Failed to get server connection data - unknown";
                x x2 = x.b;
                if (string5.startsWith("ERROR_OTHER")) {
                    String[] stringArray = string5.split(",");
                    if (stringArray.length >= 2) {
                        string6 = stringArray[1];
                    }
                    x2 = x.b;
                } else if (string5.startsWith("ERROR_MISSING")) {
                    string6 = "Request missing required fields";
                } else if (!string5.startsWith("ERROR_WRONG_C")) {
                    if (string5.startsWith("ERROR_MISSING_PASSWORD")) {
                        string6 = "Missing password";
                        x2 = x.b;
                    } else if (string5.startsWith("ERROR_WRONG_PASSWORD")) {
                        string6 = "Wrong password";
                        x2 = x.a;
                    }
                }
                this.a.a(string6, x2, null);
                return;
            }
            String string7 = bufferedReader.readLine();
            if (string7 == null) {
                throw new IOException("Unexpected end of response");
            }
            String string8 = f.c("game_" + string2).toLowerCase(Locale.ROOT);
            if (!string7.toLowerCase(Locale.ROOT).contains((CharSequence)string8)) {
                l.b("getGameServerInfoFromMasterServerRunnable", "Error bad header returned from the master server: " + string7);
                this.a.a("Unexpected return from master server", x.b, null);
                return;
            }
            String string9 = bufferedReader.readLine();
            String string10 = bufferedReader.readLine();
            if (string10 == null) {
                throw new IOException("Unexpected end of response");
            }
            String[] stringArray = string10.split(",");
            if (stringArray.length <= 18) {
                throw new RuntimeException("getGameServerInfoFromMasterServerRunnable: columns.length too short at:" + stringArray.length);
            }
            String string11 = stringArray[3];
            String string12 = stringArray[4];
            String string13 = stringArray[5];
            String string14 = stringArray[6];
            String string15 = stringArray[7];
            String string16 = stringArray[8];
            String string17 = stringArray[9];
            String string18 = stringArray[10];
            String string19 = stringArray[11];
            String string20 = stringArray[12];
            String string21 = stringArray[13];
            String string22 = stringArray[15];
            String string23 = stringArray[16];
            String string24 = stringArray[17];
            String string25 = stringArray[18];
            l.b("getGameServerInfoFromMasterServerRunnable", "got ");
            l.b("getGameServerInfoFromMasterServerRunnable", "Completed get from master server without error");
            bl2 = true;
            this.a.a(string11 + ":" + string13);
        }
        catch (IOException iOException) {
            l.a("getGameServerInfoFromMasterServerRunnable Failed", (Exception)((Object)iOException));
            this.a.a(iOException.getMessage(), x.b, (Exception)((Object)iOException));
            return;
        }
    }
}

