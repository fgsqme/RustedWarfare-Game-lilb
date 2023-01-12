/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 */
package com.corrodinggames.rts.gameFramework.i;

import com.corrodinggames.rts.game.n;
import com.corrodinggames.rts.game.units.custom.ag;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.f.g;
import com.corrodinggames.rts.gameFramework.i.b;
import com.corrodinggames.rts.gameFramework.i.c;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.utility.ae;
import com.corrodinggames.rts.gameFramework.utility.al;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class a {
    public static String a;
    public static String b;
    public b c = new b();
    Object d = new Object();
    ArrayList e = new ArrayList();
    ArrayList f = new ArrayList();

    public a() {
        try {
            com.corrodinggames.rts.gameFramework.i.a.a(l.B().u());
        }
        catch (bo bo2) {
            throw new RuntimeException((Throwable)((Object)bo2));
        }
    }

    private static int a(String string2, int n2) {
        String[] stringArray = com.corrodinggames.rts.gameFramework.f.c(string2, '.');
        if (stringArray == null) {
            throw new bo("Unexpected version format (Missing " + n2 + ")");
        }
        if (stringArray.length > 3) {
            throw new bo("Unexpected version format (" + string2 + ")");
        }
        if (stringArray.length <= n2) {
            return 0;
        }
        try {
            return Integer.valueOf((String)stringArray[n2]);
        }
        catch (NumberFormatException numberFormatException) {
            throw new bo("Unexpected version format (Bad " + n2 + ")", (Exception)((Object)numberFormatException));
        }
    }

    public static void a(String string2) {
        String string3 = l.B().u();
        com.corrodinggames.rts.gameFramework.i.a.a(string2, string3);
    }

    public static String b(String string2) {
        string2 = com.corrodinggames.rts.gameFramework.f.a(string2, "v", "");
        string2 = string2.trim();
        string2 = com.corrodinggames.rts.gameFramework.f.a(string2, "a", "");
        string2 = com.corrodinggames.rts.gameFramework.f.a(string2, "b", "");
        string2 = com.corrodinggames.rts.gameFramework.f.a(string2, "c", "");
        string2 = com.corrodinggames.rts.gameFramework.f.a(string2, "d", "");
        string2 = com.corrodinggames.rts.gameFramework.f.a(string2, "e", "");
        string2 = com.corrodinggames.rts.gameFramework.f.a(string2, "f", "");
        string2 = com.corrodinggames.rts.gameFramework.f.a(string2, "g", "");
        string2 = com.corrodinggames.rts.gameFramework.f.a(string2, "h1", "");
        string2 = com.corrodinggames.rts.gameFramework.f.a(string2, "h2", "");
        string2 = com.corrodinggames.rts.gameFramework.f.a(string2, "h3", "");
        string2 = com.corrodinggames.rts.gameFramework.f.a(string2, "h4", "");
        return string2;
    }

    public static void a(String string2, String string3) {
        string3 = com.corrodinggames.rts.gameFramework.i.a.b(string3);
        String string4 = string2 = com.corrodinggames.rts.gameFramework.i.a.b(string2);
        String string5 = string3;
        try {
            int n2;
            int n3;
            int n4;
            int n5;
            int n6;
            int n7;
            String[] stringArray;
            int n8 = 1000;
            int n9 = 1000;
            if (string3.contains((CharSequence)"p")) {
                stringArray = al.b(string3, "p");
                try {
                    n8 = Integer.valueOf((String)stringArray[1]);
                }
                catch (NumberFormatException numberFormatException) {
                    throw new bo("Unexpected min version:" + string4 + " (Bad build number)", (Exception)((Object)numberFormatException));
                }
                string3 = stringArray[0];
            }
            if (string2.contains((CharSequence)"p")) {
                stringArray = al.b(string2, "p");
                try {
                    n9 = Integer.valueOf((String)stringArray[1]);
                }
                catch (NumberFormatException numberFormatException) {
                    throw new bo("Unexpected min version:" + string4 + "(Bad build number)", (Exception)((Object)numberFormatException));
                }
                string2 = stringArray[0];
            }
            try {
                n7 = com.corrodinggames.rts.gameFramework.i.a.a(string3, 0);
                n6 = com.corrodinggames.rts.gameFramework.i.a.a(string2, 0);
                n5 = com.corrodinggames.rts.gameFramework.i.a.a(string3, 1);
                n4 = com.corrodinggames.rts.gameFramework.i.a.a(string2, 1);
                n3 = com.corrodinggames.rts.gameFramework.i.a.a(string3, 2);
                n2 = com.corrodinggames.rts.gameFramework.i.a.a(string2, 2);
            }
            catch (bo bo2) {
                throw new bo("Requires version: " + string4 + " or higher. " + bo2.getMessage(), bo2);
            }
            if (n6 < 1) {
                throw new bo("Min version cannot be less than v1.10");
            }
            if (n6 > n7) {
                throw new bo("Requires version: " + string4 + " or higher. (You have: " + string5 + ")");
            }
            if (n7 > n6) {
                return;
            }
            if (n4 < 10 && n6 == 1) {
                throw new bo("Min version cannot be less than v1.10");
            }
            if (n4 > n5) {
                throw new bo("Requires version: " + string4 + " or higher. (You have: " + string5 + ")");
            }
            if (n5 > n4) {
                return;
            }
            if (n2 > n3) {
                throw new bo("Requires version: " + string4 + " or higher. (You have: " + string5 + ")");
            }
            if (n3 > n2) {
                return;
            }
            if (n9 > n8) {
                throw new bo("Requires newer build: " + string4 + " or higher. (You have: " + string5 + ")");
            }
        }
        catch (RuntimeException runtimeException) {
            throw new bo("Requires version: " + string4 + " or higher." + runtimeException.getMessage(), (Exception)((Object)runtimeException));
        }
    }

    public void a() {
        this.k();
        this.f();
    }

    public int a(boolean bl2) {
        int n2 = 0;
        for (b b2 : this.e) {
            if (b2.f || b2.D || bl2 && b2.R != null) continue;
            ++n2;
        }
        return n2;
    }

    public int b() {
        int n2 = 0;
        for (b b2 : this.e) {
            if (b2.f || b2.R == null) continue;
            ++n2;
        }
        return n2;
    }

    public int c() {
        int n2 = 0;
        for (b b2 : this.e) {
            if (b2.z) continue;
            ++n2;
        }
        return n2;
    }

    public void d() {
        for (b b2 : this.e) {
            b2.g = b2.f;
            b2.h = false;
        }
    }

    public void e() {
        l l2 = l.B();
        String string2 = "";
        for (b b2 : this.e) {
            String string3 = b2.c;
            string3 = string3.replace((CharSequence)",", (CharSequence)" ");
            if ((string3 = string3.replace((CharSequence)"|", (CharSequence)" ")).length() > 15) {
                string3 = string3.substring(12) + "...";
            }
            if (string2.length() != 0) {
                string2 = string2 + ",";
            }
            String string4 = b2.f ? "disabled" : "enabled";
            string2 = string2 + string3 + "|" + b2.e + "|" + string4;
        }
        l2.bQ.modSettingsVersion = 1;
        l2.bQ.modSettings = string2;
    }

    public void f() {
        String[] stringArray;
        l.e("Loading mod selection");
        l l2 = l.B();
        String string2 = l2.bQ.modSettings;
        for (String string3 : stringArray = string2.split(",")) {
            boolean bl2;
            String[] stringArray2 = string3.split("\\|");
            if (stringArray2.length != 3) {
                l.e("loadSelection: wrong count (" + stringArray2.length + "):" + string3);
                continue;
            }
            String string4 = stringArray2[0];
            String string5 = stringArray2[1];
            String string6 = stringArray2[2];
            if (string6.equals((Object)"enabled")) {
                bl2 = false;
            } else if (string6.equals((Object)"disabled")) {
                bl2 = true;
            } else {
                l.e("loadSelection: Unknown option:" + string3);
                continue;
            }
            b b2 = this.c(string5);
            if (b2 == null) {
                l.e("loadSelection: Did not find mod in settings:" + string4);
                continue;
            }
            b2.f = bl2;
            b2.i = true;
        }
    }

    public b c(String string2) {
        for (b b2 : this.e) {
            if (!b2.e.equals((Object)string2)) continue;
            return b2;
        }
        return null;
    }

    public int d(String string2) {
        if (string2 == null) {
            return 0;
        }
        int n2 = 0;
        for (b b2 : this.e) {
            if (!string2.equals((Object)b2.c())) continue;
            ++n2;
        }
        return n2;
    }

    public b a(int n2) {
        for (b b2 : this.e) {
            if (b2.L != n2) continue;
            return b2;
        }
        return null;
    }

    public void g() {
        for (b b2 : this.e) {
            b2.f = true;
        }
    }

    public int h() {
        int n2 = 0;
        for (b b2 : this.e) {
            if (b2.f && !b2.D) continue;
            ++n2;
        }
        return n2;
    }

    public b e(String string2) {
        for (b b2 : this.e) {
            if (!b2.d.equals((Object)string2)) continue;
            return b2;
        }
        return null;
    }

    public b f(String string2) {
        for (b b2 : this.e) {
            if (!b2.a().equals((Object)string2)) continue;
            return b2;
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public b a(String string2, String string3, String string4, String string5, boolean bl2, boolean bl3, boolean bl4, int n2) {
        b b2 = this.c(string5);
        if (b2 == null) {
            b2 = new b();
            b2.c = string2;
            b2.d = string3;
            b2.e = string5;
            boolean bl5 = b2.f = !bl2;
        }
        if (b2.q == null && string4 != null) {
            b2.p = b2.q = string4;
            b2.n();
            if (b2.q != null && b2.q.toLowerCase(Locale.ROOT).contains((CharSequence)"rwmod")) {
                b2.j = true;
            }
        }
        b2.x = n2;
        b2.l = true;
        b2.y = bl3;
        b2.z = bl4;
        if (!b2.z) {
            b2.o = "Storage: " + com.corrodinggames.rts.gameFramework.e.a.d(b2.q);
        }
        b2.r();
        Object object = this.d;
        synchronized (object) {
            if (!this.e.contains((Object)b2)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll((Collection)this.e);
                arrayList.add((Object)b2);
                Collections.sort((List)arrayList);
                this.e = arrayList;
            }
        }
        return b2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(b b2) {
        Object object = this.d;
        synchronized (object) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((Collection)this.e);
            arrayList.remove((Object)b2);
            this.e = arrayList;
        }
    }

    public void a(String string2, boolean bl2, boolean bl3) {
        l.e("loading mod custom units at:" + string2);
        String[] stringArray = com.corrodinggames.rts.gameFramework.e.a.h(string2);
        if (stringArray == null) {
            l.b("getAllModList: ERROR");
            l.b("getAllModList: Failed to load:" + string2);
            return;
        }
        for (String string3 : stringArray) {
            String string4 = string2 + "/" + string3;
            if (!com.corrodinggames.rts.gameFramework.e.a.f(string4) && !string3.endsWith(".ini")) continue;
            String string5 = com.corrodinggames.rts.gameFramework.f.e(string3);
            String string6 = string3;
            if (string6.contains((CharSequence)"/")) {
                string6 = string6.substring(string3.lastIndexOf("/") + 1);
            }
            boolean bl4 = false;
            this.a(string6, string3, string4, string5, bl2, bl4, bl3, 0);
        }
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        for (b b2 : this.e) {
            if (!b2.m()) continue;
            arrayList.addAll((Collection)b2.q());
        }
        return arrayList;
    }

    public ArrayList j() {
        ArrayList arrayList = new ArrayList();
        for (b b2 : this.e) {
            if (!b2.m()) continue;
            arrayList.add((Object)b2);
        }
        return arrayList;
    }

    public ArrayList k() {
        Object object2;
        for (Object object2 : this.e) {
            ((b)object2).l = false;
            if (!((b)object2).m) continue;
            ((b)object2).l = true;
        }
        com.corrodinggames.rts.gameFramework.o.a a2 = com.corrodinggames.rts.gameFramework.o.a.a();
        if (a2 != null) {
            a2.l();
        } else {
            l.e("getAllModList: SteamEngine==null");
        }
        object2 = ag.m();
        if (!com.corrodinggames.rts.gameFramework.e.a.f((String)object2)) {
            l.e("Modded Custom '" + (String)object2 + "' directory not found");
        } else {
            boolean bl2 = false;
            this.a((String)object2, true, bl2);
        }
        String string2 = ag.k();
        if (!com.corrodinggames.rts.gameFramework.e.a.f(string2)) {
            l.e("Modded Custom '" + string2 + "' directory not found");
        } else {
            boolean bl3 = true;
            this.a(string2, false, bl3);
        }
        String string3 = ag.l();
        if (!com.corrodinggames.rts.gameFramework.e.a.f(string3)) {
            l.e("Modded Custom '" + string3 + "' directory not found");
        } else {
            boolean bl4 = true;
            this.a(string3, true, bl4);
        }
        for (b b2 : this.e) {
            if (b2.l) continue;
            l.e("Removing mod no longer found on system: " + b2.a());
            this.a(b2);
        }
        l.e("========= Mods ===========");
        l.e("Number of mods:" + this.e.size());
        for (b b2 : this.e) {
            l.e("Mod: '" + b2.a());
        }
        l.e("================================");
        Object object3 = l.B();
        if (object3.bQ.lastModCount == -1 || object3.bQ.modSettingsVersion < 1) {
            l.e("Disabling all new mods for first/new load");
            for (b b3 : this.e) {
                b3.f = true;
            }
            this.e();
            object3.bQ.save();
        } else if (this.e.size() > object3.bQ.lastModCount + 4) {
            l.e("Too many new mods found, not enabling new mods");
            l.e("Number of mods:" + this.e.size() + " vs " + object3.bQ.lastModCount);
            for (b b4 : this.e) {
                if (b4.i) continue;
                b4.f = true;
            }
            this.e();
            object3.bQ.save();
        }
        object3.bQ.lastModCount = this.e.size();
        return this.e;
    }

    public void l() {
        l l2 = l.B();
        try {
            l2.br = true;
            l2.e();
            this.a(false, false);
        }
        finally {
            l2.br = false;
        }
        l2.x();
    }

    public void a(boolean bl2, boolean bl3) {
        l l2 = l.B();
        ae.b();
        if (!bl3) {
            for (b b2 : this.e) {
                if (b2.R != null) {
                    l.e("re-enabling mod: " + b2.a());
                }
                b2.R = null;
                b2.V.clear();
                b2.S = null;
                b2.U.clear();
                b2.C = false;
                b2.D = false;
                b2.E = 0;
                b2.F = 0;
                b2.G = 0L;
                b2.H = 0L;
                b2.I = 0;
                b2.J = 0;
                b2.w = 0;
            }
        }
        this.k();
        Iterator iterator = new ArrayList((Collection)com.corrodinggames.rts.game.units.custom.l.d);
        if (!bl3) {
            ag.h();
        } else {
            ag.b();
        }
        if (bl2) {
            int n2 = 0;
            for (com.corrodinggames.rts.game.units.custom.l l3 : iterator) {
                if (l3.J == null || l3.J.f || l3.J.R == null || com.corrodinggames.rts.game.units.custom.l.a(l3) != null) continue;
                l.e("Was missing: " + l3.M);
                com.corrodinggames.rts.game.units.custom.l.d.add((Object)l3);
                ++n2;
            }
            if (n2 > 0) {
                ag.e();
            }
        }
        com.corrodinggames.rts.game.units.custom.l.A();
        n.P();
        g.K();
    }

    public void m() {
        l l2 = l.B();
        if (l2.dH != null) {
            l2.dH.d();
        } else {
            l.e("No active callbacks");
        }
    }

    public String[] a(String[] stringArray, String string2) {
        String[] stringArray2;
        l.e("addExtraMapsForPath: " + string2);
        ArrayList arrayList = new ArrayList();
        if (stringArray != null) {
            stringArray2 = stringArray;
            int n2 = stringArray2.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                String string3 = stringArray2[i2];
                arrayList.add((Object)string3);
            }
        }
        if (l.at() && "/SD/rusted_warfare_maps".equals((Object)string2) && (stringArray2 = com.corrodinggames.rts.gameFramework.e.a.a("/SD/rustedWarfare/maps", true)) != null) {
            for (String string4 : stringArray2) {
                arrayList.add((Object)("NEW_PATH|maps2/" + string4));
            }
        }
        for (c c2 : this.g(string2)) {
            arrayList.add((Object)("MOD|" + c2.c.e + "/" + c2.b));
        }
        if (stringArray == null && arrayList.size() == 0) {
            return null;
        }
        return (String[])arrayList.toArray((Object[])new String[0]);
    }

    public ArrayList g(String string2) {
        ArrayList arrayList = new ArrayList();
        for (c c2 : this.f) {
            boolean bl2 = false;
            if (string2.startsWith("mod/") && string2.startsWith("mod/" + c2.c.e)) {
                bl2 = true;
            }
            if (!c2.c.f && string2.startsWith("/SD/rusted_warfare_maps")) {
                bl2 = true;
            }
            if (!bl2) continue;
            l.e("Adding extra map:" + c2.a);
            arrayList.add((Object)c2);
        }
        return arrayList;
    }

    public void n() {
        this.f.clear();
    }

    public void a(String string2, b b2) {
        c c2 = new c(this);
        c2.a = string2;
        c2.c = b2;
        if (b2.q == null) {
            l.a("Skipping:" + string2 + " as mod sourceFolder is null");
            return;
        }
        String string3 = string2;
        String string4 = b2.q;
        if (string3.startsWith(string4)) {
            string3 = string3.substring(string4.length());
        } else {
            String string5 = com.corrodinggames.rts.gameFramework.e.a.o(string3);
            if (string5.startsWith(string4)) {
                string3 = string5.substring(string4.length());
                l.e("Mod path:" + b2.q + " in map path without tag:" + string3);
            } else {
                l.a("Mod path:" + b2.q + " not in map path:" + string3);
            }
        }
        c2.b = string3;
        b2.A = true;
        ++b2.F;
        this.f.add((Object)c2);
    }

    public b h(String string2) {
        String[] stringArray;
        if (string2.contains((CharSequence)"MOD|") && (stringArray = string2.split("/")).length >= 2) {
            for (int i2 = stringArray.length - 2; i2 >= 0; --i2) {
                String string3 = stringArray[i2];
                if (!string3.startsWith("MOD|")) continue;
                String string4 = string3.substring("MOD|".length());
                b b2 = this.c(string4);
                if (b2 == null) {
                    l.e("getLinkedModForFile: Failed to find mod with hash:" + string4);
                    return null;
                }
                return b2;
            }
        }
        return null;
    }
}

