/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.Thread
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.j.g;
import com.corrodinggames.rts.gameFramework.j.n;
import com.corrodinggames.rts.gameFramework.j.q;
import com.corrodinggames.rts.gameFramework.j.s;
import com.corrodinggames.rts.gameFramework.l;
import java.io.BufferedReader;

class q$1
extends s {
    final /* synthetic */ int a;
    final /* synthetic */ l b;
    final /* synthetic */ q c;

    q$1(q q2, int n2, l l2) {
        this.c = q2;
        this.a = n2;
        this.b = l2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    void a(BufferedReader bufferedReader, int n2, String string2) {
        String string3;
        l l2 = l.B();
        String string4 = bufferedReader.readLine();
        if (string4 == null || !string4.contains((CharSequence)"CORRODINGGAMES")) {
            String string5 = n2 + ": Unknown header from the master server: '" + com.corrodinggames.rts.gameFramework.f.a(string4, 30) + "'";
            l.b("LoadFromMasterServer", string5);
            this.d = string5;
            try {
                String string6 = "";
                string6 = string6 + string4 + "\n";
                l.e("----------- Full response ----------");
                l.b("LoadFromMasterServer", "line:" + string4);
                String string7 = "";
                while ((string7 = bufferedReader.readLine()) != null) {
                    l.b("LoadFromMasterServer", "line:" + string7);
                    string6 = string6 + string7 + "\n";
                }
                l.e("------------------------------------");
                n.g = string6;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            return;
        }
        l.b("LoadFromMasterServer", n2 + ": Starting load");
        int n3 = 0;
        while ((string3 = bufferedReader.readLine()) != null) {
            Object object;
            String string8;
            String[] stringArray = string3.split(",", -1);
            if (stringArray.length <= 21) {
                l.b("LoadFromMasterServer", n2 + ": columns.length too short at:" + stringArray.length);
                l.b("LoadFromMasterServer", n2 + ": short line is:" + string3);
                continue;
            }
            String string9 = stringArray[0];
            String string10 = stringArray[1];
            String string11 = stringArray[2];
            String string12 = stringArray[3];
            String string13 = stringArray[4];
            String string14 = stringArray[5];
            String string15 = stringArray[6];
            String string16 = stringArray[7];
            String string17 = stringArray[8];
            String string18 = stringArray[9];
            String string19 = stringArray[10];
            String string20 = stringArray[11];
            String string21 = stringArray[12];
            String string22 = stringArray[13];
            String string23 = stringArray[15];
            String string24 = stringArray[16];
            String string25 = stringArray[17];
            String string26 = stringArray[18];
            String string27 = stringArray[19];
            String string28 = stringArray[20];
            String string29 = stringArray[21];
            String string30 = null;
            String string31 = null;
            if (string12 != null && string12.startsWith("url:") && Boolean.parseBoolean((String)string25)) {
                string30 = string12.substring(4);
                string31 = string10;
                string8 = string30 + ";" + string31;
                object = com.corrodinggames.rts.gameFramework.f.c(string8);
                if (!object.equals((Object)string13)) {
                    l.e("Skipping " + string26);
                    continue;
                }
            }
            if (string26 == null || string26.trim().length() == 0) {
                string26 = string9;
            }
            try {
                string8 = string26;
                object = n.f;
                synchronized (object) {
                    g g2 = n.c(string8);
                    g2.c = string12;
                    g2.d = string13;
                    g2.e = string30;
                    g2.f = string31;
                    g2.g = Integer.valueOf((String)string14);
                    g2.h = Boolean.parseBoolean((String)string15);
                    g2.m = Boolean.parseBoolean((String)string17);
                    g2.j = string11;
                    try {
                        g2.l = Integer.parseInt((String)g2.j);
                    }
                    catch (NumberFormatException numberFormatException) {
                        l.b("game_version_int:" + numberFormatException.getMessage());
                    }
                    g2.n = string16;
                    g2.q = string18;
                    g2.r = string19;
                    g2.s = string20;
                    g2.k = string21;
                    g2.a = Boolean.parseBoolean((String)string22);
                    g2.t = string23;
                    g2.u = string24;
                    g2.y = Boolean.parseBoolean((String)string27);
                    if ("".equals((Object)string28)) {
                        string28 = null;
                    }
                    g2.z = string28;
                    if (!string29.trim().equals((Object)"")) {
                        g2.A = Integer.valueOf((String)string29);
                    }
                    try {
                        g2.v = Integer.parseInt((String)g2.t);
                    }
                    catch (NumberFormatException numberFormatException) {
                        l.b("game_player_count_int:" + numberFormatException.getMessage());
                    }
                    try {
                        g2.w = Integer.parseInt((String)g2.u);
                    }
                    catch (NumberFormatException numberFormatException) {
                        l.b("game_max_player_count_int:" + numberFormatException.getMessage());
                    }
                    g2.x = Boolean.parseBoolean((String)string25);
                    if (g2.p < this.a) {
                        g2.p = this.a;
                    }
                    if (n.b(g2.b) == null) {
                        l2.bX.bi.add((Object)g2);
                    }
                    ++n3;
                }
            }
            catch (NumberFormatException numberFormatException) {
                l.b("LoadFromMasterServer", n2 + ": failed to load server");
                numberFormatException.printStackTrace();
            }
        }
        l.b("LoadFromMasterServer", "[" + n2 + "]: Found " + n3 + " servers");
        if (n3 == 0) {
            try {
                Thread.sleep((long)2000L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        this.e = true;
        this.c.a.run();
        try {
            Thread.sleep((long)2000L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        n.a(this.a, n2);
        l.b("LoadFromMasterServer", n2 + ": Completed load from master server without error");
    }

    @Override
    void a() {
        if (!this.e) {
            this.b.bX.bh = this.d;
            this.c.a.run();
        }
    }
}

