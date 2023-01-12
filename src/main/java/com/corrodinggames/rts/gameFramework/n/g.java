/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.corrodinggames.rts.gameFramework.n;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.n.f;
import com.corrodinggames.rts.gameFramework.n.i;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class g {
    public ArrayList a = new ArrayList();
    public boolean b;
    public boolean c;
    public float d;
    public int e;
    public String f;
    public boolean g;
    public boolean h;
    final /* synthetic */ f i;

    public g(f f2) {
        this.i = f2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean a(String string2) {
        String string3;
        String string4;
        Pattern pattern;
        string2 = string2.trim();
        l.e("Got:" + string2);
        if (string2.length() == 0) {
            return false;
        }
        l.e("..");
        String string5 = null;
        String string6 = null;
        String string7 = null;
        String string8 = null;
        if (string2.startsWith("+")) {
            pattern = Pattern.compile((String)"\\+([^ ]*)([^\\[-]*)(\\[(.*?)\\])? *(-.*)?");
            Matcher matcher = pattern.matcher((CharSequence)string2);
            if (!matcher.matches()) throw new com.corrodinggames.rts.game.b.f("Unknown wave line in map: " + string2);
            string5 = matcher.group(1);
            string6 = matcher.group(2);
            string7 = matcher.group(4);
            string8 = matcher.group(5);
            l.e("Got o:" + string7 + " d:" + string5 + " dn:" + string6 + " units:" + string8);
        } else {
            if (!string2.startsWith("!")) throw new com.corrodinggames.rts.game.b.f("Unknown wave format: " + string2);
            pattern = Pattern.compile((String)"\\!(.*)");
            Matcher matcher = pattern.matcher((CharSequence)string2);
            if (!matcher.matches()) throw new com.corrodinggames.rts.game.b.f("Unknown wave line in map: " + string2);
            string7 = matcher.group(1);
        }
        if (string5 != null) {
            string5 = string5.trim();
            pattern = string5.split(":");
            String string9 = "0";
            String string10 = "0";
            if (((String[])pattern).length == 1) {
                String string11 = pattern[0];
            } else {
                if (((String[])pattern).length != 2) throw new com.corrodinggames.rts.game.b.f("Unknown time format in wave: " + string2);
                string10 = pattern[0];
                String string12 = pattern[1];
            }
            try {
                void var7_13;
                this.d = Integer.parseInt((String)var7_13) + Integer.parseInt((String)string10) * 60;
            }
            catch (NumberFormatException numberFormatException) {
                throw new com.corrodinggames.rts.game.b.f("Failed to parse time on: " + string2, (Exception)((Object)numberFormatException));
            }
        }
        if (string6 != null) {
            this.f = string6 = string6.trim();
            this.h = true;
        }
        if (string7 != null) {
            Pattern pattern2 = pattern = string7.split(",");
            int n2 = ((String[])pattern2).length;
            for (int i2 = 0; i2 < n2; ++i2) {
                String string13 = pattern2[i2];
                String[] stringArray = string13.split(":");
                string4 = stringArray[0].trim();
                string3 = null;
                if (stringArray.length > 1) {
                    string3 = stringArray[1].trim();
                }
                if ("lockSpawn".equalsIgnoreCase(string4)) {
                    this.b = true;
                    continue;
                }
                if ("unlockSpawn".equalsIgnoreCase(string4)) {
                    this.c = true;
                    continue;
                }
                if ("noTimer".equalsIgnoreCase(string4)) {
                    this.g = true;
                    continue;
                }
                if ("paused".equalsIgnoreCase(string4) || "win".equalsIgnoreCase(string4) || "".equalsIgnoreCase(string4)) continue;
                throw new com.corrodinggames.rts.game.b.f("Unknown wave option '" + string4 + "' in: " + string2);
            }
        }
        if (string8 == null) return true;
        if ((string8 = string8.trim()).startsWith("-")) {
            string8 = string8.substring(1);
        }
        for (String string13 : pattern = string8.split(",")) {
            int n3;
            if (!(string13 = string13.trim()).contains((CharSequence)" ")) {
                throw new com.corrodinggames.rts.game.b.f("Unknown wave format '" + string13 + "' in: " + string2);
            }
            int n4 = string13.indexOf(" ");
            string4 = string13.substring(0, n4).trim();
            string3 = string13.substring(n4 + 1).trim();
            try {
                n3 = Integer.parseInt((String)string4);
            }
            catch (NumberFormatException numberFormatException) {
                throw new com.corrodinggames.rts.game.b.f("Expected starting number in wave format '" + string13 + "' in: " + string2);
            }
            as as2 = ar.a(string3);
            if (as2 == null) {
                throw new com.corrodinggames.rts.game.b.f("Could not find unit '" + string3 + "' in: " + string2);
            }
            i i3 = new i(this.i);
            i3.b(as2, n3);
            this.a.add((Object)i3);
        }
        return true;
    }

    public void a() {
        l.e("Activating wave");
        if (!this.i.R) {
            this.i.e();
        }
        PointF pointF = this.i.P;
        for (i i2 : this.a) {
            i2.a(pointF.a, pointF.b);
        }
        if (!this.i.Q) {
            this.i.e();
        }
        if (this.b) {
            this.i.Q = true;
        }
        if (this.c) {
            this.i.Q = false;
        }
    }
}

