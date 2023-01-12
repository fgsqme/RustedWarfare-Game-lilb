/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Locale
 */
package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.ac;
import com.corrodinggames.rts.gameFramework.af;
import com.corrodinggames.rts.gameFramework.ag;
import com.corrodinggames.rts.gameFramework.ah;
import com.corrodinggames.rts.gameFramework.ak;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes$MissingKey;
import java.util.ArrayList;
import java.util.Locale;

public class ad {
    public String a;
    public boolean b = false;
    public ArrayList c = new ArrayList();
    public ArrayList d = new ArrayList();

    public boolean a() {
        for (af af2 : this.c) {
            if (af2.a != -1 || !af2.a()) continue;
            return true;
        }
        return false;
    }

    public boolean b() {
        for (af af2 : this.c) {
            if (af2 == null || af2.a != -1 || !af2.b()) continue;
            return true;
        }
        return false;
    }

    public String c() {
        for (af af2 : this.c) {
            if (af2 == null) continue;
            return af2.c().toUpperCase();
        }
        return "";
    }

    public af a(int n2) {
        if (this.c.size() > n2) {
            af af2 = (af)this.c.get(n2);
            return af2;
        }
        return null;
    }

    public String b(int n2) {
        if (this.c.size() > n2) {
            af af2 = (af)this.c.get(n2);
            if (af2 == null) {
                return "<null>";
            }
            return af2.c().toUpperCase();
        }
        return "";
    }

    public ad c(int n2) {
        int n3 = 0;
        return this.a(n2, 0, n3, false);
    }

    public ad a(int n2, int n3, int n4, boolean bl2) {
        ag ag2 = new ag();
        ag2.e = n2;
        ag2.a = -1;
        ag2.b = n4;
        if (bl2) {
            ag2.d = true;
        }
        if (this.c.size() <= n3) {
            this.c.add((Object)new ak());
        }
        if (this.c.size() <= n3) {
            this.c.add((Object)new ak());
        }
        this.c.set(n3, (Object)ag2);
        return this;
    }

    public ad a(String string2) {
        return this.a(string2, -1);
    }

    public ad a(String string2, int n2) {
        if (string2 == null) {
            throw new RuntimeException("key==null");
        }
        return this.a(-1, string2, n2);
    }

    public ad a(int n2, String string2, int n3) {
        block10: {
            if (string2 == null) {
                throw new RuntimeException("key==null");
            }
            ag ag2 = new ag();
            ag2.a = n2;
            ag2.b = 0;
            if ((string2 = string2.toLowerCase(Locale.ENGLISH)).contains((CharSequence)"alt+")) {
                string2 = string2.replace((CharSequence)"alt+", (CharSequence)"");
                ag2.b += 4;
            }
            if (string2.contains((CharSequence)"ctrl+")) {
                string2 = string2.replace((CharSequence)"ctrl+", (CharSequence)"");
                ++ag2.b;
            }
            if (string2.contains((CharSequence)"shift+")) {
                string2 = string2.replace((CharSequence)"shift+", (CharSequence)"");
                ag2.b += 2;
            }
            try {
                ag2.e = ac.d(string2);
                if (n3 == -1) {
                    this.c.add((Object)ag2);
                } else {
                    if (this.c.size() <= n3) {
                        this.c.add((Object)new ak());
                    }
                    if (this.c.size() <= n3) {
                        this.c.add((Object)new ak());
                    }
                    this.c.set(n3, (Object)ag2);
                }
            }
            catch (SlickToAndroidKeycodes$MissingKey slickToAndroidKeycodes$MissingKey) {
                slickToAndroidKeycodes$MissingKey.printStackTrace();
                l l2 = l.B();
                if (l2 == null) break block10;
                l2.a(slickToAndroidKeycodes$MissingKey.getMessage(), 1);
            }
        }
        return this;
    }

    public ad b(int n2, int n3, int n4, boolean bl2) {
        ah ah2 = new ah();
        ah2.a = n2;
        ah2.e = n3;
        ah2.f = n4;
        ah2.g = bl2;
        try {
            ah2.i = ah2.a(true);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            l.b("Failed to bind Axis:" + n4 + " on joystick:" + n3);
            return this;
        }
        this.c.add((Object)ah2);
        return this;
    }

    public boolean d() {
        return false;
    }

    public String e() {
        return this.a.replace((CharSequence)"-", (CharSequence)"").replace((CharSequence)"  ", (CharSequence)" ").replace((CharSequence)"  ", (CharSequence)" ").replace((CharSequence)" ", (CharSequence)"_").toLowerCase(Locale.ENGLISH);
    }
}

