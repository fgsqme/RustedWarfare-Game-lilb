/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.BufferedInputStream
 *  java.io.File
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 */
package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.n;
import com.corrodinggames.rts.game.o;
import com.corrodinggames.rts.game.units.ab;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.b;
import com.corrodinggames.rts.game.units.custom.a.a.a;
import com.corrodinggames.rts.game.units.custom.a.a.g;
import com.corrodinggames.rts.game.units.custom.a.a.h;
import com.corrodinggames.rts.game.units.custom.a.a.i;
import com.corrodinggames.rts.game.units.custom.a.a.j;
import com.corrodinggames.rts.game.units.custom.a.a.k;
import com.corrodinggames.rts.game.units.custom.a.a.l;
import com.corrodinggames.rts.game.units.custom.a.a.m;
import com.corrodinggames.rts.game.units.custom.a.c;
import com.corrodinggames.rts.game.units.custom.a.f;
import com.corrodinggames.rts.game.units.custom.aa;
import com.corrodinggames.rts.game.units.custom.ad;
import com.corrodinggames.rts.game.units.custom.ae;
import com.corrodinggames.rts.game.units.custom.af;
import com.corrodinggames.rts.game.units.custom.ah;
import com.corrodinggames.rts.game.units.custom.ai;
import com.corrodinggames.rts.game.units.custom.aj;
import com.corrodinggames.rts.game.units.custom.as;
import com.corrodinggames.rts.game.units.custom.at;
import com.corrodinggames.rts.game.units.custom.ay;
import com.corrodinggames.rts.game.units.custom.ba;
import com.corrodinggames.rts.game.units.custom.bb;
import com.corrodinggames.rts.game.units.custom.be;
import com.corrodinggames.rts.game.units.custom.bh;
import com.corrodinggames.rts.game.units.custom.bl;
import com.corrodinggames.rts.game.units.custom.bn;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.bp;
import com.corrodinggames.rts.game.units.custom.e.d;
import com.corrodinggames.rts.game.units.custom.e.e;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p;
import com.corrodinggames.rts.game.units.custom.q;
import com.corrodinggames.rts.game.units.custom.r;
import com.corrodinggames.rts.game.units.custom.s;
import com.corrodinggames.rts.game.units.custom.t;
import com.corrodinggames.rts.game.units.custom.u;
import com.corrodinggames.rts.game.units.custom.v;
import com.corrodinggames.rts.game.units.custom.z;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.br;
import com.corrodinggames.rts.gameFramework.utility.ac;
import com.corrodinggames.rts.gameFramework.utility.al;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ag {
    static boolean a = false;
    static int b;
    static int c;
    public static int d;
    static com.corrodinggames.rts.gameFramework.i.b e;
    static boolean f;
    public static HashMap g;
    public static HashMap h;
    static int i;
    static int j;
    static boolean k;
    static int l;
    public static com.corrodinggames.rts.gameFramework.utility.m m;
    static HashMap n;
    static final Object o;
    public static float p;
    public static float q;
    static com.corrodinggames.rts.gameFramework.i.b r;
    static String s;

    public static void a(int n2) {
        if (e != null) {
            ag.e.G += (long)n2;
        }
    }

    public static void a() {
        ag.i();
        ag.j();
    }

    public static void a(com.corrodinggames.rts.gameFramework.m.e e2) {
        if (e2 != null && !e2.v) {
            if (com.corrodinggames.rts.gameFramework.l.az() && e2 instanceof com.corrodinggames.rts.gameFramework.m.h) {
                return;
            }
            e2.v = true;
            ag.a(e2.u());
        }
    }

    public static void a(com.corrodinggames.rts.gameFramework.m.e[] eArray) {
        if (eArray != null) {
            com.corrodinggames.rts.gameFramework.m.e e2 = null;
            for (com.corrodinggames.rts.gameFramework.m.e e3 : eArray) {
                if (e3 != e2) {
                    ag.a(e3);
                }
                if (e2 != null) continue;
                e2 = e3;
            }
        }
    }

    public static void a(com.corrodinggames.rts.gameFramework.a.i i2) {
        if (!i2.g) {
            i2.g = true;
            if (e != null) {
                ag.e.H += (long)i2.a();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static boolean a(com.corrodinggames.rts.gameFramework.utility.m m2) {
        com.corrodinggames.rts.game.units.custom.l l2;
        com.corrodinggames.rts.gameFramework.l l3 = com.corrodinggames.rts.gameFramework.l.B();
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        ArrayList arrayList = new ArrayList((Collection)com.corrodinggames.rts.game.units.custom.l.c);
        ArrayList arrayList2 = new ArrayList((Collection)com.corrodinggames.rts.game.units.custom.l.d);
        com.corrodinggames.rts.gameFramework.utility.m m3 = new com.corrodinggames.rts.gameFramework.utility.m();
        String string2 = null;
        Iterator iterator = m2.iterator();
        while (iterator.hasNext()) {
            l2 = (com.corrodinggames.rts.game.units.custom.l)iterator.next();
            com.corrodinggames.rts.game.units.custom.l l4 = ag.a(l2);
            if (l4 == null) {
                com.corrodinggames.rts.gameFramework.l.e("Failed to apply changes to unit type: " + l2.M);
                bl2 = true;
                if (string2 != null || s == null) continue;
                string2 = s;
                continue;
            }
            com.corrodinggames.rts.gameFramework.l.e("Changes applied to unit type: " + l2.M);
            bl3 = true;
            m3.add(l4);
        }
        if (string2 != null && com.corrodinggames.rts.gameFramework.l.at()) {
            l3.c("Unit errors", string2);
        }
        if (bl3 && !ag.c(false)) {
            bl2 = true;
        }
        if (bl3 && !bl2) {
            com.corrodinggames.rts.game.units.custom.l.e = null;
            ag.e();
            s = null;
            com.corrodinggames.rts.game.n.P();
            com.corrodinggames.rts.gameFramework.f.g.K();
            bl4 = true;
            if (!bl2) {
                iterator = m3.iterator();
                while (iterator.hasNext()) {
                    l2 = (com.corrodinggames.rts.game.units.custom.l)iterator.next();
                    if (l2.gt.size() <= 0) continue;
                    l3.a(l2.gt.size() + " Warning(s) loading: " + l2.b() + " \n" + (String)l2.gt.get(0), 1);
                    l2.gt.clear();
                    bl4 = false;
                    break;
                }
            }
        }
        if (bl2) {
            com.corrodinggames.rts.gameFramework.l.e("Failed to load some units, keeping old config");
            iterator = com.corrodinggames.rts.game.units.custom.l.c;
            synchronized (iterator) {
                com.corrodinggames.rts.game.units.custom.l.c.clear();
                com.corrodinggames.rts.game.units.custom.l.c.addAll((Collection)arrayList);
            }
            com.corrodinggames.rts.game.units.custom.l.d = arrayList2;
        }
        return bl4;
    }

    public static void b() {
        com.corrodinggames.rts.gameFramework.utility.m m2 = new com.corrodinggames.rts.gameFramework.utility.m();
        b = 0;
        c = 0;
        d = 0;
        Iterator iterator = am.bF().iterator();
        while (iterator.hasNext()) {
            am am2 = (am)iterator.next();
            com.corrodinggames.rts.game.units.as as2 = am2.r();
            if (!(as2 instanceof com.corrodinggames.rts.game.units.custom.l) || m2.contains(as2)) continue;
            m2.add((com.corrodinggames.rts.game.units.custom.l)as2);
        }
        if (m2.size() > 0) {
            boolean bl2 = ag.a(m2);
        }
    }

    public static void c() {
        boolean bl2 = false;
        com.corrodinggames.rts.gameFramework.utility.m m2 = new com.corrodinggames.rts.gameFramework.utility.m();
        for (com.corrodinggames.rts.game.units.custom.l l2 : com.corrodinggames.rts.game.units.custom.l.c) {
            boolean bl3 = false;
            Iterator iterator = l2.k.iterator();
            while (iterator.hasNext()) {
                aa aa2 = (aa)iterator.next();
                long l3 = aa2.a(false);
                if (l3 == aa2.a) continue;
                bl3 = true;
                aa2.a = l3;
            }
            if (!bl3) continue;
            if (!bl2) {
                com.corrodinggames.rts.gameFramework.l.e("Detected unit changes");
                bl2 = true;
            }
            m2.add(l2);
        }
        if (m2.size() > 0) {
            ag.a(m2);
        }
    }

    public static void d() {
        if (com.corrodinggames.rts.game.units.custom.l.e != null) {
            com.corrodinggames.rts.gameFramework.l.e("applyPendingNetworkUnits: Applying new network units from server (" + com.corrodinggames.rts.game.units.custom.l.e.size() + " units)");
            com.corrodinggames.rts.game.units.custom.l.d = com.corrodinggames.rts.game.units.custom.l.e;
            com.corrodinggames.rts.game.units.custom.l.e = null;
            ag.e();
        } else {
            com.corrodinggames.rts.gameFramework.l.e("applyPendingNetworkUnits: no server units list found");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ArrayList a(boolean bl2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = com.corrodinggames.rts.game.units.custom.l.c;
        synchronized (arrayList2) {
            for (com.corrodinggames.rts.game.units.custom.l l2 : com.corrodinggames.rts.game.units.custom.l.c) {
                if (l2.J != null && (!l2.J.m() || !bl2)) continue;
                arrayList.add((Object)l2);
            }
        }
        return arrayList;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static com.corrodinggames.rts.gameFramework.utility.ab a(String string2) {
        HashMap hashMap = n;
        synchronized (hashMap) {
            com.corrodinggames.rts.gameFramework.utility.ab ab2;
            com.corrodinggames.rts.gameFramework.utility.ab ab3 = (com.corrodinggames.rts.gameFramework.utility.ab)n.get((Object)string2);
            if (ab3 != null) {
                return ab3;
            }
            com.corrodinggames.rts.gameFramework.utility.j j2 = ag.b(string2);
            if (j2 == null) {
                return null;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream((InputStream)j2);
            try {
                ab2 = new com.corrodinggames.rts.gameFramework.utility.ab((InputStream)bufferedInputStream, string2);
                ab2.a();
                ab2.f = j2.d();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                throw new bo("Load of '" + string2 + "' failed: " + iOException.getMessage());
            }
            n.put((Object)string2, (Object)ab2);
            return ab2;
        }
    }

    public static void a(com.corrodinggames.rts.game.units.custom.l l2, com.corrodinggames.rts.gameFramework.utility.ab ab2, String string2, String string3, boolean bl2) {
        com.corrodinggames.rts.gameFramework.utility.ab ab3 = ag.a(string2);
        if (ab3 == null) {
            if (bl2) {
                return;
            }
            throw new bo("[" + string3 + "] Could not find conf target:" + string2);
        }
        l2.o(ab3.f);
        ab2.a(ab3);
        ag.a(l2, ab2, ab3, string2, 1);
    }

    public static void a(com.corrodinggames.rts.game.units.custom.l l2, com.corrodinggames.rts.gameFramework.utility.ab ab2, com.corrodinggames.rts.gameFramework.utility.ab ab3, String string2, int n2) {
        if (n2 > 10) {
            throw new bo("copyFrom can only be 10 levels deep, maybe you have a loop?");
        }
        String string3 = ab3.b("core", "copyFrom", (String)null);
        if (string3 != null) {
            Object[] objectArray = string3.split(",");
            Collections.reverse((List)Arrays.asList((Object[])objectArray));
            for (Object object : objectArray) {
                String string4;
                Object object2;
                if ((object = object.trim()).equals((Object)"")) continue;
                if (object.contains((CharSequence)"..")) {
                    throw new bo("'..' not supported in copyFrom");
                }
                if (object.startsWith("ROOT:")) {
                    object = object.substring("ROOT:".length());
                    object2 = l2.J == null ? "units/common.ini" : l2.J.q + "/common.ini";
                    string4 = ag.a(com.corrodinggames.rts.gameFramework.f.h((String)object2), (String)object);
                } else if (object.startsWith("CORE:")) {
                    object = object.substring("CORE:".length());
                    object2 = "units/common.ini";
                    string4 = ag.a(com.corrodinggames.rts.gameFramework.f.h((String)object2), (String)object);
                } else {
                    string4 = ag.a(com.corrodinggames.rts.gameFramework.f.h(string2), (String)object);
                }
                object2 = ag.a(string4);
                if (object2 == null) {
                    String string5 = "Could not find copyFrom target:" + string4;
                    if (n2 != 0) {
                        string5 = string5 + " (while loading: " + string2 + ")";
                    }
                    throw new bo(string5);
                }
                l2.o(((com.corrodinggames.rts.gameFramework.utility.ab)object2).f);
                ab2.a((com.corrodinggames.rts.gameFramework.utility.ab)object2);
                ag.a(l2, ab2, (com.corrodinggames.rts.gameFramework.utility.ab)object2, string4, n2 + 1);
            }
        }
    }

    public static void a(com.corrodinggames.rts.game.units.custom.l l2, com.corrodinggames.rts.gameFramework.utility.ab ab2, String string2, String string3, int n2) {
        if (n2 > 10) {
            throw new bo("@copyFromSection can only be 10 levels deep, maybe you have a loop?");
        }
        String string4 = ab2.b(string3, "@copyFromSection", (String)null);
        if (string4 == null || string4.equals((Object)"")) {
            return;
        }
        Object[] objectArray = string4.split(",");
        Collections.reverse((List)Arrays.asList((Object[])objectArray));
        for (Object object : objectArray) {
            if ((object = object.trim()).equals((Object)"")) continue;
            com.corrodinggames.rts.gameFramework.utility.m m2 = ab2.k((String)object, "");
            if (m2.size() == 0) {
                throw new bo("[" + string3 + "]@copyFromSection: Could not find keys in target section: " + (String)object);
            }
            Iterator iterator = m2.iterator();
            while (iterator.hasNext()) {
                String string5 = (String)iterator.next();
                String string6 = ab2.b((String)object, string5);
                if (string6 == null) continue;
                ab2.d(string2, string5, string6);
            }
            ag.a(l2, ab2, string2, (String)object, n2 + 1);
        }
    }

    public static bb a(com.corrodinggames.rts.gameFramework.utility.ab ab2, String string2, String string3, String string4) {
        return ab2.a(string2, string3, string4, false);
    }

    public static aj a(com.corrodinggames.rts.game.units.custom.l l2, com.corrodinggames.rts.gameFramework.utility.ab ab2, String string2, String string3, String string4) {
        return ab2.a(l2, string2, string3, string4);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static com.corrodinggames.rts.game.units.custom.l a(com.corrodinggames.rts.game.units.custom.l l2) {
        HashMap hashMap;
        String string2;
        com.corrodinggames.rts.game.units.custom.l l3;
        block14: {
            String string3 = l2.D;
            com.corrodinggames.rts.gameFramework.l l4 = com.corrodinggames.rts.gameFramework.l.B();
            l3 = null;
            string2 = null;
            if (l2.J != null) {
                string2 = l2.J.R;
            }
            hashMap = n;
            synchronized (hashMap) {
                n.clear();
            }
            s = null;
            try {
                l3 = ag.a(string3, l2.J, l2.K, l2.L);
            }
            catch (RuntimeException runtimeException) {
                runtimeException.printStackTrace();
                if (s != null) break block14;
                String string4 = "Error loading unit:" + ag.a(l2.J, string3, true) + "\n" + runtimeException.getMessage();
                l4.a(string4, 1);
            }
        }
        if (l3 == null && l2.J != null) {
            l2.J.R = string2;
        }
        if (l3 != null) {
            hashMap = com.corrodinggames.rts.game.units.custom.l.c;
            synchronized (hashMap) {
                com.corrodinggames.rts.game.units.custom.l.c.remove((Object)l2);
            }
            ag.a((com.corrodinggames.rts.game.units.as)l2, l3, true);
            if (com.corrodinggames.rts.game.units.custom.l.d.remove((Object)l2)) {
                com.corrodinggames.rts.game.units.custom.l.d.add((Object)l3);
                if (l2.H != l3.H) {
                    ++d;
                }
            } else {
                com.corrodinggames.rts.gameFramework.l.e("Changed unit was not enabled (original not found in customUnitTypes)");
            }
            com.corrodinggames.rts.game.n.P();
            com.corrodinggames.rts.gameFramework.f.g.K();
        }
        return l3;
    }

    public static void a(com.corrodinggames.rts.game.units.as as2, com.corrodinggames.rts.game.units.custom.l l2, boolean bl2) {
        Iterator iterator = am.bF().iterator();
        while (iterator.hasNext()) {
            am am2 = (am)iterator.next();
            if (!(am2 instanceof com.corrodinggames.rts.game.units.custom.j)) continue;
            com.corrodinggames.rts.game.units.custom.j j2 = (com.corrodinggames.rts.game.units.custom.j)am2;
            if (j2.x == as2) {
                com.corrodinggames.rts.game.n.b((am)j2);
                j2.a(l2, false, bl2);
                j2.S();
                if (j2.dg() != null) {
                    j2.dg().a(l2);
                }
                com.corrodinggames.rts.game.n.c(j2);
            }
            if (j2.z != as2) continue;
            j2.z = l2;
        }
    }

    public static String a(ArrayList arrayList) {
        Integer n2;
        HashMap hashMap = new HashMap();
        for (com.corrodinggames.rts.game.units.custom.l l2 : arrayList) {
            com.corrodinggames.rts.gameFramework.i.b b2 = l2.J;
            if (b2 == null) continue;
            n2 = (Integer)hashMap.get((Object)b2);
            n2 = n2 == null ? Integer.valueOf((int)1) : Integer.valueOf((int)(n2 + 1));
            hashMap.put((Object)b2, (Object)n2);
        }
        Object object = "";
        for (com.corrodinggames.rts.gameFramework.i.b b2 : hashMap.keySet()) {
            n2 = (Integer)hashMap.get((Object)b2);
            object = (String)object + b2.a() + "(unitCount: " + n2 + (b2.m() ? "" : "[disabled]") + "), ";
        }
        return object;
    }

    public static String b(boolean bl2) {
        ArrayList arrayList = ag.a(bl2);
        com.corrodinggames.rts.game.units.custom.l.e = null;
        com.corrodinggames.rts.game.units.custom.l.d = arrayList;
        s = null;
        com.corrodinggames.rts.gameFramework.l.e("enableAll: " + ag.a(com.corrodinggames.rts.game.units.custom.l.d));
        ag.e();
        return s;
    }

    public static boolean c(boolean bl2) {
        ArrayList arrayList = com.corrodinggames.rts.game.units.custom.l.d;
        ArrayList arrayList2 = bl2 ? ag.a(true) : com.corrodinggames.rts.game.units.custom.l.d;
        boolean bl3 = true;
        s = null;
        com.corrodinggames.rts.game.units.custom.l.d = arrayList2;
        ag.g();
        if (s != null) {
            bl3 = false;
        }
        com.corrodinggames.rts.game.units.custom.l.d = arrayList;
        ag.g();
        return bl3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void e() {
        Object object = o;
        synchronized (object) {
            ag.n();
        }
    }

    private static void n() {
        com.corrodinggames.rts.game.units.custom.l l2 = null;
        ArrayList arrayList = new ArrayList();
        com.corrodinggames.rts.gameFramework.l l3 = com.corrodinggames.rts.gameFramework.l.B();
        if (l3.as()) {
            for (Iterator iterator : ar.values()) {
                arrayList.add((Object)iterator);
            }
        }
        for (com.corrodinggames.rts.game.units.custom.l l4 : com.corrodinggames.rts.game.units.custom.l.d) {
            arrayList.add((Object)l4);
            if (!l4.M.equals((Object)"missing") || l4.J != null) continue;
            l2 = l4;
        }
        ar.ae = arrayList;
        am.bL();
        ag.g();
        ag.f();
        com.corrodinggames.rts.game.units.custom.e.a.e();
        if (l2 == null) {
            com.corrodinggames.rts.gameFramework.l.e("missingPlaceHolder is not an active unit, searching for new target");
            for (com.corrodinggames.rts.game.units.custom.l l5 : com.corrodinggames.rts.game.units.custom.l.d) {
                if (!l5.M.equals((Object)"missing")) continue;
                com.corrodinggames.rts.gameFramework.l.e("Found a missing placeholder");
                l2 = l5;
            }
        }
        com.corrodinggames.rts.game.units.custom.l.b = l2;
    }

    public static void f() {
        float f2 = 50.0f;
        float f3 = 50.0f;
        for (com.corrodinggames.rts.game.units.custom.l l2 : com.corrodinggames.rts.game.units.custom.l.d) {
            float f4 = l2.cW;
            if (f4 > 250.0f) {
                f4 = 250.0f;
            }
            if (f2 < f4) {
                f2 = f4;
            }
            if (!l2.aH || !(f3 < f4)) continue;
            f3 = f4;
        }
        p = f2;
        q = f3;
    }

    public static com.corrodinggames.rts.gameFramework.utility.j b(String string2) {
        String string3 = "" + string2;
        return com.corrodinggames.rts.gameFramework.e.a.k(string3);
    }

    public static void b(ArrayList arrayList) {
        Collections.sort((List)arrayList);
    }

    public static void a(com.corrodinggames.rts.game.units.as as2) {
        com.corrodinggames.rts.gameFramework.l l2 = com.corrodinggames.rts.gameFramework.l.B();
        try {
            Object object;
            Object object22;
            com.corrodinggames.rts.game.units.as as32;
            com.corrodinggames.rts.game.units.custom.l l3;
            as2.h();
            if (as2 instanceof com.corrodinggames.rts.game.units.custom.l) {
                l3 = (com.corrodinggames.rts.game.units.custom.l)as2;
                if (l3.fI != null) {
                    as32 = com.corrodinggames.rts.game.units.custom.l.s(l3.fI);
                    if (as32 == null) {
                        throw new bo("Could not find [ai]upgradedFrom target:" + l3.fI);
                    }
                    l3.b(as32);
                }
                as32 = l3.p.iterator();
                while (as32.hasNext()) {
                    object22 = (v)as32.next();
                    ((v)object22).a();
                }
                if (l3.eH) {
                    com.corrodinggames.rts.game.units.custom.l.g.add((Object)l3);
                }
            }
            for (com.corrodinggames.rts.game.units.as as32 : com.corrodinggames.rts.game.units.custom.l.d) {
                if (as2 instanceof com.corrodinggames.rts.game.units.custom.l) {
                    object22 = (com.corrodinggames.rts.game.units.custom.l)as2;
                    if (((com.corrodinggames.rts.game.units.custom.l)as32).fI != null && ((com.corrodinggames.rts.game.units.custom.l)as32).fI.equalsIgnoreCase(((com.corrodinggames.rts.game.units.custom.l)object22).i())) {
                        ((com.corrodinggames.rts.game.units.custom.l)object22).b(as32);
                    }
                }
                for (p p2 : ((com.corrodinggames.rts.game.units.custom.l)as32).gg) {
                    if (!p2.a.equalsIgnoreCase(as2.i())) continue;
                    p2.e = true;
                    int n2 = ((com.corrodinggames.rts.game.units.custom.l)as32).cl;
                    boolean bl2 = false;
                    for (int i2 = n2; i2 <= 3; ++i2) {
                        Object object3;
                        boolean bl3;
                        object = as2.a(i2);
                        com.corrodinggames.rts.game.units.a.s s2 = ((com.corrodinggames.rts.game.units.custom.l)as32).aH || p2.c ? new com.corrodinggames.rts.game.units.a.v(as32) : new com.corrodinggames.rts.game.units.a.l(as32);
                        if (p2.b != -999.0f) {
                            s2.g = p2.b;
                        }
                        if (p2.f != null) {
                            bl3 = false;
                            if (!(as2 instanceof com.corrodinggames.rts.game.units.custom.l) && !((object3 = am.a(as2)) instanceof y)) {
                                bl3 = true;
                            }
                            if (!bl3) {
                                s2.h = com.corrodinggames.rts.game.units.custom.a.c.a(p2);
                            } else if (!bl2) {
                                bl2 = true;
                                ((com.corrodinggames.rts.game.units.custom.l)as32).r("builtFrom isLocked currently cannot be used when targeting old-style unit:" + as2.i());
                            }
                        }
                        bl3 = false;
                        object3 = object.iterator();
                        while (object3.hasNext()) {
                            com.corrodinggames.rts.game.units.a.s s3 = (com.corrodinggames.rts.game.units.a.s)object3.next();
                            if (!s2.equals(s3)) continue;
                            bl3 = true;
                        }
                        if (!bl3) {
                            object.add((Object)s2);
                        }
                        ag.b((ArrayList)object);
                    }
                }
            }
            if (as2 instanceof com.corrodinggames.rts.game.units.custom.l) {
                l3 = (com.corrodinggames.rts.game.units.custom.l)as2;
                for (Object object22 : l3.gh) {
                    int n3;
                    if (((com.corrodinggames.rts.game.units.custom.a.d)object22).k != null && ((com.corrodinggames.rts.game.units.custom.a.d)object22).k.equalsIgnoreCase("setRally")) {
                        for (int i3 = 1; i3 <= 3; ++i3) {
                            ArrayList arrayList = as2.a(i3);
                            com.corrodinggames.rts.game.units.a.o o2 = new com.corrodinggames.rts.game.units.a.o();
                            if (((com.corrodinggames.rts.game.units.custom.a.d)object22).p != -999.0f) {
                                o2.g = ((com.corrodinggames.rts.game.units.custom.a.d)object22).p;
                            }
                            arrayList.add((Object)o2);
                            l3.dc = true;
                            ag.b(arrayList);
                        }
                        continue;
                    }
                    if (((com.corrodinggames.rts.game.units.custom.a.d)object22).k != null && ((com.corrodinggames.rts.game.units.custom.a.d)object22).k.equalsIgnoreCase("reclaim")) {
                        for (int i4 = 1; i4 <= 3; ++i4) {
                            ArrayList arrayList = as2.a(i4);
                            com.corrodinggames.rts.game.units.a.m m2 = new com.corrodinggames.rts.game.units.a.m(true);
                            if (((com.corrodinggames.rts.game.units.custom.a.d)object22).p != -999.0f) {
                                m2.g = ((com.corrodinggames.rts.game.units.custom.a.d)object22).p;
                            }
                            arrayList.add((Object)m2);
                            ag.b(arrayList);
                        }
                        continue;
                    }
                    if (((com.corrodinggames.rts.game.units.custom.a.d)object22).k != null && ((com.corrodinggames.rts.game.units.custom.a.d)object22).k.equalsIgnoreCase("repair")) {
                        for (int i5 = 1; i5 <= 3; ++i5) {
                            ArrayList arrayList = as2.a(i5);
                            com.corrodinggames.rts.game.units.a.n n4 = new com.corrodinggames.rts.game.units.a.n();
                            if (((com.corrodinggames.rts.game.units.custom.a.d)object22).p != -999.0f) {
                                n4.g = ((com.corrodinggames.rts.game.units.custom.a.d)object22).p;
                            }
                            arrayList.add((Object)n4);
                            ag.b(arrayList);
                        }
                        continue;
                    }
                    com.corrodinggames.rts.game.units.as as4 = null;
                    if (((com.corrodinggames.rts.game.units.custom.a.d)object22).k != null) {
                        as4 = ar.a(((com.corrodinggames.rts.game.units.custom.a.d)object22).k);
                        if (as4 == null) {
                            throw new bo("Could not find canBuild target:" + ((com.corrodinggames.rts.game.units.custom.a.d)object22).k);
                        }
                    } else if (((com.corrodinggames.rts.game.units.custom.a.d)object22).aM != com.corrodinggames.rts.game.units.custom.a.f.b) {
                        throw new bo("'Target' required for action:" + ((com.corrodinggames.rts.game.units.custom.a.d)object22).a());
                    }
                    for (int i6 = n3 = 1; i6 <= 3; ++i6) {
                        ArrayList arrayList = as2.a(i6);
                        if (((com.corrodinggames.rts.game.units.custom.a.d)object22).aM == com.corrodinggames.rts.game.units.custom.a.f.a) {
                            if (as4.j() || ((com.corrodinggames.rts.game.units.custom.a.d)object22).aK) {
                                object = new com.corrodinggames.rts.game.units.a.v(as4, ((com.corrodinggames.rts.game.units.custom.a.d)object22).aJ, null);
                                ((com.corrodinggames.rts.game.units.a.s)object).h = com.corrodinggames.rts.game.units.custom.a.c.a((com.corrodinggames.rts.game.units.custom.a.d)object22);
                            } else {
                                object = new com.corrodinggames.rts.game.units.a.l(as4);
                                ((com.corrodinggames.rts.game.units.a.s)object).h = com.corrodinggames.rts.game.units.custom.a.c.a((com.corrodinggames.rts.game.units.custom.a.d)object22);
                            }
                        } else if (((com.corrodinggames.rts.game.units.custom.a.d)object22).aM == com.corrodinggames.rts.game.units.custom.a.f.b) {
                            object = new com.corrodinggames.rts.game.units.custom.a.g((com.corrodinggames.rts.game.units.custom.a.d)object22, com.corrodinggames.rts.game.units.custom.l.a(as4));
                        } else {
                            throw new bo("Could not find actionType:" + (Object)((Object)((com.corrodinggames.rts.game.units.custom.a.d)object22).aM));
                        }
                        if (((com.corrodinggames.rts.game.units.custom.a.d)object22).p != -999.0f) {
                            ((com.corrodinggames.rts.game.units.a.s)object).g = ((com.corrodinggames.rts.game.units.custom.a.d)object22).p;
                        }
                        boolean bl4 = false;
                        for (Object object3 : arrayList) {
                            if (!((com.corrodinggames.rts.game.units.a.s)object).equals(object3)) continue;
                            bl4 = true;
                        }
                        if (!bl4) {
                            arrayList.add(object);
                        }
                        ag.b(arrayList);
                    }
                }
            }
            if (as2 instanceof com.corrodinggames.rts.game.units.custom.l) {
                l3 = (com.corrodinggames.rts.game.units.custom.l)as2;
                l3.fu = false;
                for (int i7 = 1; i7 <= 3; ++i7) {
                    object22 = as2.a(i7);
                    Iterator iterator = object22.iterator();
                    while (iterator.hasNext()) {
                        com.corrodinggames.rts.game.units.a.s s4 = (com.corrodinggames.rts.game.units.a.s)iterator.next();
                        if (s4 instanceof com.corrodinggames.rts.game.units.custom.a.g || s4.i() == null) continue;
                        l3.fu = true;
                    }
                }
                as32 = l3.p.iterator();
                while (as32.hasNext()) {
                    object22 = (v)as32.next();
                    ((v)object22).b();
                }
            }
            boolean bl5 = l2.O() && l2.bX.ay.k;
            for (int i8 = 1; i8 <= 3; ++i8) {
                object22 = as2.a(i8);
                Iterator iterator = object22.iterator();
                while (iterator.hasNext()) {
                    com.corrodinggames.rts.game.units.a.s s5 = (com.corrodinggames.rts.game.units.a.s)iterator.next();
                    if (s5.h instanceof com.corrodinggames.rts.game.units.custom.a.b) {
                        com.corrodinggames.rts.gameFramework.l.a("=== ChainedActionConfig already on: " + as2.i() + " action:" + s5.b());
                        s5.h = ((com.corrodinggames.rts.game.units.custom.a.b)s5.h).b;
                    }
                    if (!bl5) continue;
                    com.corrodinggames.rts.game.units.custom.d.b b2 = s5.B();
                    com.corrodinggames.rts.game.units.custom.d.b b3 = s5.r_();
                    if (b2.c() || b3 != null) continue;
                    object = new com.corrodinggames.rts.game.units.custom.a.b(s5.h);
                    s5.h = object;
                    ((com.corrodinggames.rts.game.units.custom.a.b)object).c = com.corrodinggames.rts.game.units.custom.d.b.a;
                    ((com.corrodinggames.rts.game.units.custom.a.b)object).d = b2;
                }
            }
        }
        catch (bo bo2) {
            ag.a(as2.i(), (Exception)bo2, as2);
        }
        catch (RuntimeException runtimeException) {
            ag.a(as2.i(), (Exception)((Object)runtimeException), as2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void g() {
        Object object = o;
        synchronized (object) {
            ag.o();
        }
    }

    private static void o() {
        Object object2;
        String[] stringArray;
        com.corrodinggames.rts.game.units.custom.l.g.clear();
        com.corrodinggames.rts.game.units.custom.l.f.clear();
        for (com.corrodinggames.rts.game.units.custom.l l2 : com.corrodinggames.rts.game.units.custom.l.d) {
            if (l2.J != null && (stringArray = l2.J.R) != null) {
                com.corrodinggames.rts.gameFramework.l.b(l2.i() + "(mod:" + l2.t() + "): Getting setup while mod has error: " + (String)stringArray);
            }
            stringArray = l2.gg.iterator();
            while (stringArray.hasNext()) {
                object2 = (p)stringArray.next();
                ((p)object2).e = false;
            }
            l2.fL.clear();
        }
        for (com.corrodinggames.rts.game.units.custom.l l2 : com.corrodinggames.rts.game.units.custom.l.d) {
            try {
                if (l2.Q == null) continue;
                stringArray = l2.Q.split(",");
                for (String string2 : stringArray) {
                    boolean bl2;
                    com.corrodinggames.rts.game.units.as as2 = com.corrodinggames.rts.game.units.custom.l.a(string2 = string2.trim(), bl2 = false);
                    if (as2 == null) {
                        throw new bo("Could not find overrideAndReplace target:" + string2);
                    }
                    if (as2 instanceof com.corrodinggames.rts.game.units.custom.l) {
                        com.corrodinggames.rts.gameFramework.l.e("Replacing:" + as2.i() + " with " + l2.i());
                    }
                    com.corrodinggames.rts.game.units.custom.l.f.put((Object)as2, (Object)l2);
                }
            }
            catch (bo bo2) {
                ag.a(l2.i(), (Exception)bo2, (com.corrodinggames.rts.game.units.as)l2);
            }
        }
        for (Object object2 : ar.values()) {
            ag.a((com.corrodinggames.rts.game.units.as)object2);
        }
        for (com.corrodinggames.rts.game.units.custom.l l3 : com.corrodinggames.rts.game.units.custom.l.d) {
            ag.a((com.corrodinggames.rts.game.units.as)l3);
        }
        for (com.corrodinggames.rts.game.units.custom.l l4 : com.corrodinggames.rts.game.units.custom.l.d) {
            for (Object object2 : l4.gg) {
                if (((p)object2).e) continue;
                String string3 = ((p)object2).d + " failed to find target:" + ((p)object2).a;
                l4.q(string3);
                if (l4.R < 1) continue;
                com.corrodinggames.rts.gameFramework.l.e("Converting warning to error (meta.strictLevel=" + l4.R + ")");
                l4.p(string3);
            }
            if (l4.gp == null || l4.gp.size() <= 0) continue;
            Iterator iterator = l4.gp.iterator();
            while (iterator.hasNext()) {
                object2 = (u)iterator.next();
                try {
                    ((u)object2).b(l4);
                }
                catch (bo bo3) {
                    ag.a(l4.i(), (Exception)bo3, (com.corrodinggames.rts.game.units.as)l4);
                }
            }
        }
        for (com.corrodinggames.rts.game.units.custom.l l5 : com.corrodinggames.rts.game.units.custom.l.d) {
            l5.r();
        }
        Collections.sort((List)com.corrodinggames.rts.game.units.custom.l.g, (Comparator)new q());
    }

    public static com.corrodinggames.rts.game.units.custom.l a(String string2, com.corrodinggames.rts.gameFramework.i.b b2, String string3, String string4) {
        try {
            long l2 = br.a();
            com.corrodinggames.rts.gameFramework.utility.j j2 = ag.b(string2);
            if (j2 == null) {
                throw new RuntimeException("Failed to open unit config file:" + string2);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream((InputStream)j2);
            ag.a(l2, ah.g);
            ++b;
            if (b2 != null) {
                ++c;
            }
            com.corrodinggames.rts.gameFramework.l l3 = com.corrodinggames.rts.gameFramework.l.B();
            String string5 = "core units";
            if (b2 != null) {
                string5 = b2.a();
            }
            l3.h("Loading units - " + b + " (" + string5 + ")");
            com.corrodinggames.rts.game.units.custom.l l4 = ag.a(string2, (InputStream)bufferedInputStream, j2.c(), b2, j2, string3, string4);
            long l5 = br.a();
            try {
                bufferedInputStream.close();
                j2.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            ag.a(l5, ah.h);
            return l4;
        }
        catch (RuntimeException runtimeException) {
            ag.a(string2, (Exception)((Object)runtimeException), b2);
            return null;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void h() {
        Object object22;
        com.corrodinggames.rts.gameFramework.l l2 = com.corrodinggames.rts.gameFramework.l.B();
        ArrayList arrayList = l2.bZ.k();
        j = 0;
        i = 0;
        l = 0;
        k = false;
        long l3 = br.a();
        for (Object object22 : g.values()) {
            ((com.corrodinggames.rts.gameFramework.m.e)object22).v = false;
            if (((com.corrodinggames.rts.gameFramework.m.e)object22).a != null) {
                for (com.corrodinggames.rts.gameFramework.m.e e2 : ((com.corrodinggames.rts.gameFramework.m.e)object22).a) {
                    e2.v = false;
                }
            }
            if (((com.corrodinggames.rts.gameFramework.m.e)object22).b != null) {
                for (com.corrodinggames.rts.gameFramework.m.e e3 : ((com.corrodinggames.rts.gameFramework.m.e)object22).b) {
                    e3.v = false;
                }
            }
            if (((com.corrodinggames.rts.gameFramework.m.e)object22).c == null) continue;
            for (com.corrodinggames.rts.gameFramework.m.e e4 : ((com.corrodinggames.rts.gameFramework.m.e)object22).c) {
                e4.v = false;
            }
        }
        for (Object object22 : h.values()) {
            ((com.corrodinggames.rts.gameFramework.a.i)object22).g = false;
        }
        Object object4 = null;
        object22 = null;
        com.corrodinggames.rts.gameFramework.m.e[] eArray = null;
        try {
            object4 = new byte[8000000];
            object4[0] = (Iterator)l2.dZ;
            l2.ea = (byte)object4[1];
            object22 = new byte[2][];
            object22[0] = new byte[3000000];
            object22[1] = new byte[3000000];
            object22[0][0] = l2.dZ;
            object22[1][0] = l2.dZ;
            if (!com.corrodinggames.rts.gameFramework.l.at()) {
                eArray = new ByteBuffer[]{ByteBuffer.allocateDirect((int)5000000), ByteBuffer.allocateDirect((int)5000000), ByteBuffer.allocateDirect((int)5000000), ByteBuffer.allocateDirect((int)5000000)};
            }
        }
        catch (OutOfMemoryError outOfMemoryError) {
            System.gc();
            com.corrodinggames.rts.gameFramework.l.e("Failed to reserve memory pre-mod load");
        }
        Object object5 = com.corrodinggames.rts.game.units.custom.l.c;
        synchronized (object5) {
            com.corrodinggames.rts.game.units.custom.l.c.clear();
        }
        com.corrodinggames.rts.game.units.custom.l.d.clear();
        com.corrodinggames.rts.game.units.custom.l.e = null;
        com.corrodinggames.rts.game.units.custom.l.f.clear();
        l2.bZ.n();
        b = 0;
        c = 0;
        object5 = n;
        synchronized (object5) {
            n.clear();
        }
        ag.a(com.corrodinggames.rts.gameFramework.e.a.p("units"), 1, false, null, com.corrodinggames.rts.gameFramework.e.a.p("units"), null);
        if (!com.corrodinggames.rts.gameFramework.l.aJ && !l2.ar) {
            String string2;
            object5 = ag.m();
            if (!com.corrodinggames.rts.gameFramework.e.a.f((String)object5)) {
                com.corrodinggames.rts.gameFramework.l.e("Modded Custom '" + (String)object5 + "' directory not found");
            }
            for (com.corrodinggames.rts.gameFramework.i.b b2 : arrayList) {
                if (b2.y || b2.q == null) continue;
                string2 = b2.j();
                if (b2.m) {
                    string2 = com.corrodinggames.rts.gameFramework.e.a.p(string2);
                }
                if (b2.f) {
                    com.corrodinggames.rts.gameFramework.l.e("Disabled mod at:" + string2 + " (name:" + b2.a() + ")");
                } else {
                    com.corrodinggames.rts.gameFramework.l.e("Loading mod at:" + string2 + " (name:" + b2.a() + ")");
                }
                ag.a(string2, 2, true, b2, string2, null);
            }
            for (com.corrodinggames.rts.gameFramework.i.b b3 : arrayList) {
                if (!b3.y || b3.q == null) continue;
                string2 = b3.i();
                if (b3.f) {
                    com.corrodinggames.rts.gameFramework.l.e("Disabled workshop mod at:" + string2 + " (name:" + b3.a() + ")");
                } else {
                    com.corrodinggames.rts.gameFramework.l.e("Loading workshop mod at:" + string2 + " (name:" + b3.a() + ")");
                }
                ag.a(string2, 2, true, b3, string2, null);
            }
        }
        ag.a();
        ag.b(true);
        com.corrodinggames.rts.gameFramework.l.e("Done loading custom units. image cacheHits:" + j + " image cacheMisses:" + i + " (in: " + br.a(l3) + "ms)");
        com.corrodinggames.rts.gameFramework.l.e("========= Mods data loaded ===========");
        com.corrodinggames.rts.gameFramework.l.e("Number of mods:" + arrayList.size());
        for (com.corrodinggames.rts.gameFramework.i.b b2 : arrayList) {
            b2.t();
        }
        com.corrodinggames.rts.gameFramework.l.e("================================");
        if (eArray != null) {
            eArray[0] = null;
            eArray[1] = null;
            eArray[2] = null;
            eArray[3] = null;
            eArray = null;
        }
        if (object22 != null) {
            object22[0] = null;
            object22[1] = null;
            object22 = null;
        }
        if (object4 != null) {
            object4[1] = (Iterator)l2.dZ;
            l2.ea = (byte)object4[1];
            object4 = null;
            System.gc();
            System.gc();
        }
    }

    public static void a(String string2, int n2, boolean bl2, com.corrodinggames.rts.gameFramework.i.b b2, String string3, String string4) {
        boolean bl3 = bl2 && n2 == 1;
        com.corrodinggames.rts.gameFramework.l l2 = com.corrodinggames.rts.gameFramework.l.B();
        if (b2 != null) {
            if (b2.f && !l2.bQ.loadDisabledModData) {
                b2.C = true;
                return;
            }
            b2.C = false;
        }
        if (b2 != null && b2.f) {
            com.corrodinggames.rts.gameFramework.l.e("Note: Loading disabled mod: " + string2);
        }
        com.corrodinggames.rts.gameFramework.e.a.c();
        String[] stringArray = com.corrodinggames.rts.gameFramework.e.a.h(string2);
        if (stringArray == null) {
            String string5 = com.corrodinggames.rts.gameFramework.e.a.c();
            com.corrodinggames.rts.gameFramework.l.b("readAllCustomUnitConfigs: ERROR");
            com.corrodinggames.rts.gameFramework.l.b("readAllCustomUnitConfigs: Failed to load:" + string2);
            if (b2 != null) {
                if (!b2.D) {
                    b2.R = string5 == null ? "Failed to list directory, check file permissions" : "Failed to list directory: " + string5;
                } else {
                    b2.S = "Failed to list subdirectory: '" + string2 + "' check file permissions";
                    if (string5 != null) {
                        b2.S = b2.S + ": " + string5;
                    }
                }
            }
            return;
        }
        if (b2 != null) {
            b2.D = true;
        }
        if (!bl3) {
            for (String string6 : stringArray) {
                if (!string6.equalsIgnoreCase("all-units.template")) continue;
                string4 = string2;
            }
        }
        for (String string6 : stringArray) {
            String string7;
            if (string6.equals((Object)"custom_units_here.txt") || string6.equals((Object)"mods_here_will_be_enabled_by_default.txt") || string6.equals((Object)"__MACOSX")) continue;
            boolean bl4 = false;
            com.corrodinggames.rts.gameFramework.i.b b3 = b2;
            if (bl2 && n2 == 1 && b3 == null) {
                b3 = l2.bZ.e(string6);
                if (b3 == null) {
                    com.corrodinggames.rts.gameFramework.l.b("readAllCustomUnitConfigs: Could not find linked mod:" + string6);
                    b3 = l2.bZ.c;
                }
                bl4 = true;
            }
            if (string6.toLowerCase(Locale.ENGLISH).endsWith(".ini") && !bl3) {
                string7 = string2 + "/" + string6;
                if (r != b3 && b3 != null) {
                    r = b3;
                    ag.a();
                    com.corrodinggames.rts.gameFramework.l.e("Loading units from mod: " + b3.c);
                }
                if (string6.equalsIgnoreCase("desktop.ini")) {
                    com.corrodinggames.rts.gameFramework.l.e("Skipping possible system file: " + string7);
                    continue;
                }
                long l3 = br.a();
                ag.a(string7, b3, string3, string4);
                ag.a(l3, ah.f);
                continue;
            }
            if (string6.toLowerCase(Locale.ENGLISH).endsWith(".tmx")) {
                string7 = string2 + "/" + string6;
                com.corrodinggames.rts.gameFramework.l.e("Found map: " + string7);
                if (b3 != null && b3.B) {
                    l2.bZ.a(string7, b3);
                    continue;
                }
                com.corrodinggames.rts.gameFramework.l.e("Skipping map due to mod settings");
                continue;
            }
            string7 = string2 + "/" + string6;
            if (n2 < 10) {
                if (!com.corrodinggames.rts.gameFramework.e.a.f(string7)) continue;
                String string8 = string3;
                if (string8 == null) {
                    string8 = string7;
                }
                long l4 = -1L;
                if (bl4) {
                    l4 = br.a();
                    com.corrodinggames.rts.gameFramework.l.e("============");
                    com.corrodinggames.rts.gameFramework.l.e(">>> Mod '" + b3.c() + "'" + (b3.m() ? "" : " (disabled)"));
                }
                ag.a(string7, n2 + 1, bl2, b3, string8, string4);
                if (!bl4 || b3 == null || !b3.m()) continue;
                double d2 = br.a(l4);
                com.corrodinggames.rts.gameFramework.l.e("Mod '" + b3.c() + "' load took:" + br.a(d2));
                continue;
            }
            com.corrodinggames.rts.gameFramework.l.e("Too many levels:" + string7);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static com.corrodinggames.rts.game.units.custom.l a(String string2, InputStream inputStream, long l2, com.corrodinggames.rts.gameFramework.i.b b2, com.corrodinggames.rts.gameFramework.utility.j j2, String string3, String string4) {
        com.corrodinggames.rts.gameFramework.l l3 = com.corrodinggames.rts.gameFramework.l.B();
        try {
            Object object;
            Object object22;
            String string5;
            int n2;
            Object bl142;
            Object i2;
            String string6;
            int y2;
            int f15;
            Object object3;
            int bh2;
            Object bl102;
            Object n4;
            boolean bl2;
            Boolean bl3;
            int n6;
            String string722;
            int n7;
            int n8;
            String string8;
            Object object8;
            String string9;
            Object object922;
            Object object10;
            String string10;
            Object object11;
            float f2;
            float f3;
            float f4;
            float f5;
            com.corrodinggames.rts.gameFramework.m.e e2;
            String string11;
            Object object12;
            int n9;
            int n10;
            Object object13;
            String string12;
            String string13;
            com.corrodinggames.rts.gameFramework.utility.ab ab2;
            if (a) {
                String string14 = "CORE";
                if (b2 != null) {
                    string14 = b2.j();
                }
                com.corrodinggames.rts.gameFramework.l.e("Loading unit config: " + string2 + " [" + string14 + "]");
            }
            l3.bO.e();
            long l4 = br.a();
            try {
                ab2 = new com.corrodinggames.rts.gameFramework.utility.ab(inputStream, string2);
            }
            catch (IOException iOException) {
                throw new RuntimeException((Throwable)iOException);
            }
            ag.a(l4, ah.e);
            String string15 = "core";
            String string16 = "graphics";
            String string17 = "attack";
            String string18 = "movement";
            String string19 = "ai";
            com.corrodinggames.rts.game.units.custom.l l5 = new com.corrodinggames.rts.game.units.custom.l();
            if (ab2.a(string15, "dont_load", (Boolean)false).booleanValue()) {
                return null;
            }
            l5.D = string2;
            l5.E = j2.d();
            l5.F = l5.D;
            l5.J = b2;
            l5.K = string3;
            l5.L = string4;
            e = b2;
            f = false;
            if (l5.J != null) {
                // empty if block
            }
            long l6 = br.a();
            ag.a(l5, ab2, ab2, string2, 0);
            if (l5.L != null) {
                ag.a(l5, ab2, l5.L + "/" + "all-units.template", "AUTO units.template", true);
            }
            ab2.a("core", "copyFrom");
            l5.R = ab2.b(string15, "strictLevel", 0);
            if (l5.R < 0) {
                throw new bo("[core]strictLevel cannot be < 0");
            }
            if (l5.R > 1) {
                throw new bo("[core]strictLevel cannot yet be > 1");
            }
            l5.gs = ab2.a(string15, "logIfCreditResourceUsed", (Boolean)false);
            ab2.a(string15, "dont_load");
            String string20 = ab2.b(string15, "class", "CustomUnitMetadata");
            com.corrodinggames.rts.gameFramework.utility.m m2 = ab2.c("@copyFrom_skipThisSection");
            Object object14 = m2.iterator();
            while (object14.hasNext()) {
                string13 = (String)object14.next();
                ab2.a(string13, "@copyFrom_skipThisSection");
            }
            object14 = ab2.c("@copyFromSection");
            string13 = ((com.corrodinggames.rts.gameFramework.utility.m)((Object)object14)).iterator();
            while (string13.hasNext()) {
                string12 = (String)string13.next();
                ag.a(l5, ab2, string12, string12, 0);
            }
            com.corrodinggames.rts.game.units.custom.f.a.a(l5, ab2);
            string13 = ab2.b(string15, "overrideResourceLoadPath", (String)null);
            if (string13 != null) {
                l5.F = ag.a(l5, string2, string13);
            }
            ag.a(l6, ah.i);
            l5.M = ab2.e(string15, "name");
            l5.H = ab2.c();
            if (l5.M.equals((Object)"self")) {
                throw new bo("Unit name: " + l5.M + " is reserved");
            }
            if (l5.M.startsWith("self.")) {
                throw new bo("Unit name cannot start with self.");
            }
            string12 = ab2.b(string15, "altNames", (String)null);
            if (string12 != null && !string12.equalsIgnoreCase("NONE")) {
                object13 = string12.split(",");
                n10 = ((String[])object13).length;
                for (n9 = 0; n9 < n10; ++n9) {
                    object12 = object13[n9];
                    object12 = object12.trim();
                    l5.N.add(object12);
                }
            }
            l5.O = com.corrodinggames.rts.game.units.custom.g.a(ab2.b(string15, "tags", (String)null));
            if (l5.R >= 1 && l5.O != null) {
                object13 = l5.O.a;
                n10 = ((Object[])object13).length;
                for (n9 = 0; n9 < n10; ++n9) {
                    object12 = object13[n9];
                    if (!((com.corrodinggames.rts.game.units.custom.g)object12).a.contains((CharSequence)" ")) continue;
                    throw new bo("(strictLevel 1) [core]tags: space in tag: '" + ((com.corrodinggames.rts.game.units.custom.g)object12).a + "'");
                }
            }
            l5.Q = ab2.b(string15, "overrideAndReplace", (String)null);
            if (l5.Q != null && l5.Q.equalsIgnoreCase("NONE")) {
                l5.Q = null;
            }
            if ((object13 = ab2.b(string15, "defineUnitMemory", (String)null)) != null) {
                l5.r.addDefineValue(l5, string15, "defineUnitMemory", (String)object13);
                if (l5.r.hasArrays()) {
                    l5.a("1.15p11", 115011, string15, "Memory arrays (in defineUnitMemory)");
                }
            }
            Object object15 = ab2.k(string15, "@memory ").iterator();
            while (object15.hasNext()) {
                String string21 = (String)object15.next();
                object12 = string21.substring("@memory ".length()).trim();
                string11 = ab2.b(string15, string21, (String)null);
                if (string11 == null) continue;
                if (string11.contains((CharSequence)",")) {
                    throw new bo("[" + string15 + "]" + string21 + ": Only a single variable can be defined per @memory");
                }
                l5.r.addSingleDefine(l5, (String)object12, string11, string15, string21);
                if (!l5.r.hasArrays()) continue;
                l5.a("1.15p11", 115011, string15, "Memory arrays (in " + string21 + ")");
            }
            l5.T = (ad)ab2.a(string15, "onNewMapSpawn", null, ad.class);
            l5.aG = ab2.a(string15, "globalScale", Float.valueOf((float)1.0f)).floatValue();
            l5.o(l5.E);
            if (l5.M.equals((Object)"missing")) {
                if (b2 == null) {
                    com.corrodinggames.rts.gameFramework.l.e("Setting missingPlaceHolder");
                    com.corrodinggames.rts.game.units.custom.l.b = l5;
                } else {
                    com.corrodinggames.rts.gameFramework.l.e("Not setting missingPlaceHolder, as we are in a mod");
                }
            }
            l5.aE = ab2.b(string15, "displayLocaleKey", (String)null);
            l5.aC = ag.a(ab2, string15, "displayText", null);
            l5.aD = ag.a(ab2, string15, "displayDescription", null);
            l5.eD = ab2.a(string15, "isBio", (Boolean)false);
            l5.eE = ab2.a(string15, "isBug", (Boolean)false);
            l5.eH = ab2.a(string15, "isPickableStartingUnit", (Boolean)false);
            l5.eI = ab2.a(string15, "startFallingWhenStartingUnit", (Boolean)false);
            l5.cy = ab2.a(string15, "stayNeutral", (Boolean)false);
            l5.cz = ab2.a(string15, "createNeutral", (Boolean)false);
            l5.cA = ab2.a(string15, "allowCaptureWhenNeutralByAI", (Boolean)false);
            if (ab2.a(string15, "createOnNeutralTeam", (Boolean)false).booleanValue()) {
                l5.cz = true;
            }
            l5.cB = ab2.a(string15, "whileNeutralTransportAnyTeam", (Boolean)false);
            l5.cC = ab2.a(string15, "whileNeutralConvertToTransportedTeam", (Boolean)false);
            l5.cD = ab2.a(string15, "convertToNeutralIfNotTransporting", (Boolean)false);
            if (l5.cD) {
                l5.cy = true;
            }
            l5.cE = ab2.a(string15, "createOnAggressiveTeam", (Boolean)false);
            l5.aF = ab2.a(string15, "showInEditor", (Boolean)true);
            l5.U = ab2.b(string16, "total_frames", 1);
            if (l5.U < 1) {
                throw new bo("TOTAL_FRAMES cannot be: " + l5.U + " (must be 1 or more)");
            }
            l5.W = ab2.b(string16, "frame_width", -1);
            l5.X = ab2.b(string16, "frame_height", -1);
            l5.Y = ab2.b(string16, "default_frame", 0);
            l5.ah = ab2.b(string16, "image_offsetX", 0);
            l5.ai = ab2.b(string16, "image_offsetY", 0);
            l5.aj = ab2.a(string16, "image_offsetH", Float.valueOf((float)0.0f)).floatValue();
            if (l5.ah != 0 || l5.ai != 0 || l5.aj != 0.0f) {
                l5.ak = true;
            }
            l5.ac = com.corrodinggames.rts.game.o.a;
            if (ab2.a(string16, "teamColorsUseHue", (Boolean)false).booleanValue()) {
                l5.ac = com.corrodinggames.rts.game.o.b;
            }
            if ((object15 = ab2.b(string16, "teamColoringMode", (String)null)) != null) {
                if (ab2.a(string16, "teamColorsUseHue", (Boolean)null) != null) {
                    throw new bo("Cannot use teamColoringMode and teamColorsUseHue at the same time");
                }
                if (object15.equalsIgnoreCase("pureGreen")) {
                    l5.ac = com.corrodinggames.rts.game.o.a;
                } else if (object15.equalsIgnoreCase("hueAdd")) {
                    l5.ac = com.corrodinggames.rts.game.o.b;
                } else if (object15.equalsIgnoreCase("hueShift")) {
                    l5.ac = com.corrodinggames.rts.game.o.d;
                } else if (object15.equalsIgnoreCase("disabled")) {
                    l5.ac = com.corrodinggames.rts.game.o.e;
                } else {
                    throw new bo("Unknown teamColoringMode:" + (String)object15);
                }
            }
            l5.ab = ab2.a(string16, "imageSmoothing", (Boolean)false);
            l5.aa = ab2.a(string16, "imageSmoothingWhenZoomedIn", (Boolean)false);
            l5.Z = ab2.a(l5, string16, "isVisible", (LogicBoolean)null);
            if (l5.Z == LogicBoolean.trueBoolean) {
                l5.Z = null;
            }
            l5.cL.m = ab2.a(string16, "isVisibleToEnemies", (Boolean)true);
            String string22 = ab2.e(string16, "image");
            l5.ad = l5.a(l5.F, string22, l5.ab, string16, "image");
            if (l5.ad == null) {
                throw new bo("Main unit image must be set on custom unit");
            }
            l5.ae = ab2.a(string16, "image_floatingPointSize", (Boolean)false);
            l5.af = l5.ad.m() / l5.U;
            l5.ag = l5.ad.l();
            if (l5.af < 1) {
                l5.af = 1;
            }
            if (l5.W > 0) {
                l5.af = l5.W;
            }
            if (l5.X > 0) {
                l5.ag = l5.X;
                if (l5.ag < l5.ad.l()) {
                    l5.V = l5.ad.m() / l5.af;
                    if (l5.V < 1) {
                        l5.V = 1;
                    }
                }
            }
            l5.al = l5.a(ab2, string16, "image_back");
            l5.am = ab2.a(string16, "image_back_always_use_full_image", (Boolean)false);
            l5.an = l5.a(ab2, string16, "image_wreak");
            l5.ao = l5.a(ab2, string16, "image_turret");
            l5.as = com.corrodinggames.rts.game.units.e.j.dN;
            object12 = ab2.b(string16, "image_shadow", "NONE");
            if (object12.equalsIgnoreCase("AUTO")) {
                string11 = "[autoShadow:" + l5.af + "," + l5.ag + "]" + l5.ad.d + "-" + l5.ad.e;
                e2 = ag.c(string11);
                if (e2 != null) {
                    l5.ap = e2;
                } else {
                    l5.ap = am.a(l5.ad, l5.af, l5.ag);
                    ag.a(l5.ap);
                    if (l5.ap != null) {
                        ag.a(string11, l5.ap);
                    }
                }
            } else if (object12.equalsIgnoreCase("AUTO_ANIMATED")) {
                string11 = "[autoShadowAnimated:" + l5.af + "," + l5.ag + "]" + l5.ad.d + "-" + l5.ad.e;
                e2 = ag.c(string11);
                if (e2 != null) {
                    l5.ap = e2;
                } else {
                    l5.ap = am.a(l5.ad, l5.ad.m(), l5.ad.l());
                    ag.a(l5.ap);
                    if (l5.ap != null) {
                        ag.a(string11, l5.ap);
                    }
                }
                l5.aq = true;
            } else {
                l5.ap = l5.a(l5.F, (String)object12, l5.ab, string16, "image_shadow");
            }
            if (ab2.a(string16, "image_shadow_frames", (Boolean)false).booleanValue()) {
                l5.aq = true;
            }
            l5.ar = l5.a(l5.ad, l5.ac);
            l5.s = ab2.a(string16, "teamColorsOnTurret", (Boolean)false);
            if (l5.s && l5.ao != null) {
                l5.at = l5.a(l5.ao, l5.ac);
            }
            if ((f5 = ab2.a(string16, "scaleImagesTo", Float.valueOf((float)-1.0f)).floatValue()) > 0.0f) {
                l5.bH = (f5 *= l5.aG) / (float)l5.af;
            }
            if ((f4 = ab2.a(string16, "imageScale", Float.valueOf((float)1.0f)).floatValue()) != 1.0f) {
                l5.bH *= f4;
            }
            if ((f3 = ab2.a(string16, "scaleTurretImagesTo", Float.valueOf((float)-1.0f)).floatValue()) > 0.0f) {
                f3 *= l5.aG;
                if (l5.ao == null) {
                    throw new RuntimeException("scaleTurretImagesTo needs image_turret set");
                }
                l5.bI = f3 / (float)l5.ao.p;
            }
            if ((f2 = ab2.a(string16, "turretImageScale", Float.valueOf((float)1.0f)).floatValue()) != 1.0f) {
                l5.bI *= f2;
            }
            l5.au = com.corrodinggames.rts.game.units.e.c.e;
            com.corrodinggames.rts.gameFramework.m.e e3 = l5.a(ab2, string16, "image_shield");
            if (e3 != null) {
                l5.au = e3;
                l5.av = true;
            }
            l5.aw = l5.a(ab2, string16, "icon_build", false);
            float f6 = (float)l5.ad.m() * l5.bH;
            float f7 = (float)l5.ad.l() * l5.bH;
            if (f6 / 2.0f > 90.0f || f7 / 2.0f > 90.0f) {
                l5.C = new Rect();
                l5.C.a = (int)(-f6 / 2.0f);
                l5.C.c = (int)(f6 / 2.0f);
                l5.C.b = (int)(-f7 / 2.0f);
                l5.C.d = (int)(f7 / 2.0f);
                l5.B = true;
            }
            Iterator iterator = ab2.m("resource_", "global_resource_").iterator();
            while (iterator.hasNext()) {
                boolean bl4;
                object11 = (String)iterator.next();
                if (object11.startsWith("resource_")) {
                    string10 = object11.substring("resource_".length());
                    bl4 = false;
                } else {
                    string10 = object11.substring("global_resource_".length());
                    bl4 = true;
                }
                string10 = string10.trim();
                if (string10.contains((CharSequence)" ")) {
                    throw new RuntimeException("[" + (String)object11 + "] resource codename cannot contain a space");
                }
                if (string10.contains((CharSequence)"=") || string10.contains((CharSequence)"|") || string10.contains((CharSequence)":") || string10.contains((CharSequence)",") || string10.contains((CharSequence)"(") || string10.contains((CharSequence)")") || string10.contains((CharSequence)"<") || string10.contains((CharSequence)">") || string10.contains((CharSequence)"$")) {
                    throw new RuntimeException("[" + (String)object11 + "] resource codename cannot contain the symbols: =|:,()<>$");
                }
                object10 = new d(bl4);
                ((d)object10).a(l5, ab2, (String)object11, string10);
                if (l5.k(((d)object10).a) != null) {
                    throw new RuntimeException("[" + (String)object11 + "] resource with name:" + ((d)object10).a + " already exists in this file");
                }
                l5.j.add(object10);
            }
            iterator = l5.j.iterator();
            while (iterator.hasNext()) {
                object11 = (d)iterator.next();
                ((d)object11).a(l5);
            }
            if (l3.p()) {
                com.corrodinggames.rts.game.units.custom.b.l.a(l5, ab2);
                com.corrodinggames.rts.game.units.custom.b.j.a(l5, ab2);
            }
            com.corrodinggames.rts.game.units.custom.b.m.a(l5, ab2);
            l5.ca = ab2.b(string15, "autoTriggerCooldownTime", Float.valueOf((float)60.0f)).floatValue();
            if (l5.ca < 0.0f) {
                throw new RuntimeException("autoTriggerCooldownTime cannot be < 0");
            }
            if (l5.ca > 120.0f) {
                throw new RuntimeException("autoTriggerCooldownTime cannot be more than 2 seconds");
            }
            if (!ab2.a(string15, "autoTriggerCooldownTime_allowDangerousHighCPU", (Boolean)false).booleanValue() && l5.ca < 5.0f) {
                throw new RuntimeException("autoTriggerCooldownTime cannot be this low (without override). Note this cooldown is only applied after triggering an action not for the detection.");
            }
            l5.cb = (s)ab2.a(string15, "autoTriggerCheckRate", com.corrodinggames.rts.game.units.custom.s.a, s.class);
            l5.cd = ab2.a(string15, "autoTriggerCheckWhileNotBuilt", (Boolean)false);
            l5.cL.b = ab2.g(string15, "mass");
            l5.ce = ab2.a(string15, "availableInDemo", (Boolean)true);
            l5.cf = ab2.a(string15, "isLocked", (Boolean)false);
            l5.cg = ab2.a(string15, "isLockedIfGameModeNoNuke", (Boolean)false);
            l5.ch = com.corrodinggames.rts.game.units.custom.d.b.a(l5, ab2, string15, "price", false);
            l5.ci = com.corrodinggames.rts.game.units.custom.d.b.a(l5, ab2, string15, "reclaimPrice", null);
            l5.cj = com.corrodinggames.rts.game.units.custom.d.b.b(l5, ab2, string15, "streamingCost", null);
            boolean bl5 = ab2.a(string15, "switchPriceWithStreamingCost", (Boolean)false);
            if (bl5) {
                if (l5.cj != null) {
                    throw new RuntimeException("[" + string15 + "]streamingCost and switchPriceWithStreamingCost=true cannot be used at the same time");
                }
                l5.cj = com.corrodinggames.rts.game.units.custom.d.b.b(l5, ab2, string15, "price", null);
                l5.ch = com.corrodinggames.rts.game.units.custom.d.b.a;
            }
            l5.ck = ab2.d(string15, "buildSpeed", Float.valueOf((float)1.0f)).floatValue();
            l5.cl = ab2.b(string15, "techLevel", 1);
            if (l5.cl > 3) {
                throw new RuntimeException("techLevel cannot be greater than max tech level of:3");
            }
            if (l5.cl < 1) {
                throw new RuntimeException("techLevel cannot be less than 1, it is:" + l5.cl);
            }
            l5.cm = ab2.a(string15, "experimental", (Boolean)false);
            l5.cv = com.corrodinggames.rts.game.units.custom.d.b.a(l5, ab2, string15, "borrowResourcesWhileAlive", true);
            l5.cw = com.corrodinggames.rts.game.units.custom.d.b.a(l5, ab2, string15, "borrowResourcesWhileBuilt", true);
            l5.co = com.corrodinggames.rts.game.units.custom.d.b.a(l5, ab2, string15, "generation_resources", true);
            int n11 = ab2.b(string15, "generation_credits", 0);
            if (n11 != 0) {
                l5.co = com.corrodinggames.rts.game.units.custom.d.b.a(l5.co, com.corrodinggames.rts.game.units.custom.d.b.a(n11));
            }
            l5.cr = ab2.b(string15, "generation_delay", 40);
            if (l5.cr == 0) {
                l5.cr = 1;
            }
            if (l5.cr < 0) {
                throw new RuntimeException("[" + string15 + "]generation_delay cannot be < 0");
            }
            l5.cs = 40.0f / (float)l5.cr;
            if (!l5.co.c()) {
                l5.cp = new com.corrodinggames.rts.game.units.custom.e.f();
                l5.cp.a(l5.co);
                l5.cp.a(l5.cs);
                l5.cn = true;
            }
            if (!l5.cp.c()) {
                string10 = l5.cp.b.iterator();
                while (string10.hasNext()) {
                    e e4 = (e)string10.next();
                    if (e4.a.c() || !e4.a.d()) continue;
                    if (l5.cq == com.corrodinggames.rts.game.units.custom.e.f.a) {
                        l5.cq = new com.corrodinggames.rts.game.units.custom.e.f();
                    }
                    l5.cq.b(e4.a, e4.b);
                }
            }
            l5.cx = ab2.a(l5, string15, "generation_active", LogicBoolean.trueBoolean);
            l5.a(l5.co);
            l5.cF = ab2.a(string15, "resourceRate", Float.valueOf((float)0.0f)).floatValue();
            if (bl5 && l5.cF != 0.0f) {
                throw new RuntimeException("To avoid mistakes [" + string15 + "]resourceRate cannot be used with switchPriceWithStreamingCost=true");
            }
            string10 = ab2.b(string15, "updateUnitMemory", (String)null);
            if (string10 != null) {
                l5.ct = VariableScope.createMemoryWriter(string10, l5, string15, "updateUnitMemory");
            }
            l5.cu = ab2.b(string15, "updateUnitMemoryRate", Float.valueOf((float)60.0f)).floatValue();
            l5.cG = ab2.b(string15, "resourceMaxConcurrentReclaimingThis", Integer.MAX_VALUE);
            l5.cH = ab2.a(l5, string15, "similarResourcesHaveTag", (com.corrodinggames.rts.game.units.custom.h)null);
            l5.do = bl.a(l5, ab2.b(string15, "soundOnAttackOrder", (String)null));
            l5.dp = bl.a(l5, ab2.b(string15, "soundOnMoveOrder", (String)null));
            l5.dq = bl.a(l5, ab2.b(string15, "soundOnNewSelection", (String)null));
            String string23 = ab2.b(string16, "drawLayer", (String)null);
            if (string23 != null) {
                if (string23.equals((Object)"experimentals")) {
                    l5.cI = 4;
                } else if (string23.equals((Object)"underwater")) {
                    l5.cI = 1;
                } else if (string23.equals((Object)"bottom")) {
                    l5.cI = 1;
                } else if (string23.equals((Object)"ground")) {
                    l5.cI = 2;
                } else if (string23.equals((Object)"ground2")) {
                    l5.cI = 3;
                } else if (string23.equals((Object)"air")) {
                    l5.cI = 5;
                } else if (string23.equals((Object)"top")) {
                    l5.cI = 10;
                } else if (string23.equals((Object)"wreaks")) {
                    l5.cI = 0;
                } else {
                    throw new RuntimeException("unknown drawLayer:" + string23);
                }
            }
            l5.cJ = ab2.a(string16, "shadowOffsetX", Float.valueOf((float)0.0f)).floatValue();
            l5.cK = ab2.a(string16, "shadowOffsetY", Float.valueOf((float)0.0f)).floatValue();
            l5.dB = ab2.a(string16, "rotate_with_direction", (Boolean)true);
            l5.dC = ab2.a(string16, "lock_body_rotation_with_main_turret", (Boolean)false);
            l5.dD = ab2.a(string16, "lock_shadow_rotation_with_main_turret", (Boolean)l5.dC);
            l5.dE = ab2.a(string16, "lock_leg_rotation_with_main_turret", (Boolean)false);
            l5.dH = ab2.a(string16, "whenBeingBuiltMakeTransparentTill", Float.valueOf((float)1.0f)).floatValue();
            l5.dI = com.corrodinggames.rts.game.units.custom.m.a(l5, ab2, string16, "animation_", false);
            object10 = ab2.e("effect_").iterator();
            while (object10.hasNext()) {
                object922 = (String)object10.next();
                string9 = object922.substring("effect_".length());
                object8 = new ay(string9);
                ((ay)object8).a(l5, ab2, (String)object922);
                l5.gd.add(object8);
            }
            for (Object object922 : l5.gd) {
                if (((ay)object922).alsoEmitEffects != null) {
                    ((ay)object922).alsoEmitEffects.c();
                }
                if (((ay)object922).alsoEmitEffectsOnDeath != null) {
                    ((ay)object922).alsoEmitEffectsOnDeath.c();
                }
                if (((ay)object922).ifSpawnFailsEmitEffects != null) {
                    ((ay)object922).ifSpawnFailsEmitEffects.c();
                }
                if (((ay)object922).trailEffect == null) continue;
                ((ay)object922).trailEffect.c();
            }
            l5.bJ = ab2.a(string16, "splastEffect", (Boolean)false);
            l5.bM = ab2.a(string16, "dustEffect", (Boolean)false);
            l5.bK = ab2.a(string16, "splastEffectReverse", (Boolean)true);
            l5.bN = ab2.a(string16, "dustEffectReverse", (Boolean)true);
            l5.bL = l5.bM || l5.bJ;
            object10 = ab2.b(string16, "movementEffect", (String)null);
            if (object10 != null) {
                l5.bO = l5.a((String)object10, (z)null);
                if (l5.bO != null && l5.bO.a()) {
                    l5.bL = true;
                }
            }
            if ((object922 = ab2.b(string16, "movementEffectReverse", (String)null)) != null) {
                l5.bP = l5.a((String)object922, (z)null);
                if (l5.bP != null && l5.bP.a()) {
                    l5.bL = true;
                }
            }
            l5.bR = ab2.a(string16, "movementEffectRate", Float.valueOf((float)11.0f)).floatValue();
            l5.bQ = ab2.a(string16, "movementEffectReverseFlipEffects", (Boolean)false);
            l5.bT = ab2.a(string16, "repairEffectRate", Float.valueOf((float)5.0f)).floatValue();
            string9 = ab2.b(string16, "repairEffect", (String)null);
            if (string9 != null) {
                l5.bU = l5.a(string9, (z)null);
                if (l5.bU != null && l5.bU.b()) {
                    l5.bS = true;
                }
            }
            if ((object8 = ab2.b(string16, "repairEffectAtTarget", (String)null)) != null) {
                l5.bV = l5.a((String)object8, (z)null);
                if (l5.bV != null && l5.bV.b()) {
                    l5.bS = true;
                }
            }
            l5.bX = ab2.a(string16, "reclaimEffectRate", Float.valueOf((float)5.0f)).floatValue();
            String string24 = ab2.b(string16, "reclaimEffect", (String)null);
            if (string24 != null) {
                l5.bY = l5.a(string24, (z)null);
                if (l5.bY != null && l5.bY.b()) {
                    l5.bW = true;
                }
            }
            if ((string8 = ab2.b(string16, "reclaimEffectAtTarget", (String)null)) != null) {
                l5.bZ = l5.a(string8, (z)null);
                if (l5.bZ != null && l5.bZ.b()) {
                    l5.bW = true;
                }
            }
            l5.ds.a(l5, ab2, string16, "animation_" + l5.ds.a + "_");
            l5.dt.a(l5, ab2, string16, "animation_" + l5.dt.a + "_");
            l5.du.a(l5, ab2, string16, "animation_" + l5.du.a + "_");
            Iterator iterator2 = ab2.e("animation_").iterator();
            while (iterator2.hasNext()) {
                String string25 = (String)iterator2.next();
                String string26 = string25.substring("animation_".length());
                com.corrodinggames.rts.game.units.custom.f f8 = new com.corrodinggames.rts.game.units.custom.f(string26);
                f8.a(l5, ab2, string25, "");
                l5.dr.add(f8);
            }
            l5.ds = l5.a(com.corrodinggames.rts.game.units.custom.n.a, l5.ds, true);
            l5.dt = l5.a(com.corrodinggames.rts.game.units.custom.n.c, l5.dt, true);
            l5.du = l5.a(com.corrodinggames.rts.game.units.custom.n.b, l5.du, true);
            l5.dw = l5.a(com.corrodinggames.rts.game.units.custom.n.e);
            l5.dx = l5.a(com.corrodinggames.rts.game.units.custom.n.f);
            if (l5.dw != null && l5.dx != null) {
                throw new RuntimeException("Cannot use underConstruction and underConstructionWithLinkedBuiltTime animations at the same time");
            }
            l5.dv = l5.a(com.corrodinggames.rts.game.units.custom.n.d);
            l5.dy = l5.a(com.corrodinggames.rts.game.units.custom.n.g);
            if (l5.dy != null) {
                l5.bg = true;
            }
            l5.dz = l5.a(com.corrodinggames.rts.game.units.custom.n.h);
            l5.dA = l5.a(com.corrodinggames.rts.game.units.custom.n.i);
            l5.cL.c = ab2.g(string15, "maxHp");
            l5.cL.g = ab2.b(string15, "maxShield", 0);
            l5.cM = ab2.a(string15, "startShieldAtZero", (Boolean)false);
            l5.cL.h = ab2.a(string15, "shieldRegen", Float.valueOf((float)0.25f)).floatValue();
            l5.cU = ab2.a(string15, "shieldDisplayOnlyDeflection", (Boolean)false);
            l5.cV = ab2.a(string15, "shieldDeflectionDisplayRate", Float.valueOf((float)4.0f)).floatValue();
            l5.cL.l = ab2.a(string15, "armour", Float.valueOf((float)0.0f)).floatValue();
            l5.cN = ab2.a(string15, "armourMinDamageToKeep", Float.valueOf((float)1.0f)).floatValue();
            l5.cL.d = ab2.a(string15, "energyMax", Float.valueOf((float)0.0f)).floatValue();
            l5.cO = ab2.a(string15, "startEnergyAtZero", (Boolean)false);
            l5.cP = ab2.a(string15, "energyRegen", Float.valueOf((float)0.0f)).floatValue();
            l5.cS = ab2.a(string15, "energyStartingPercentage", Float.valueOf((float)1.0f)).floatValue();
            l5.cR = ab2.a(string15, "energyNeedsToRechargeToFull", (Boolean)false);
            l5.cQ = ab2.a(string15, "energyRegenWhenRecharging", Float.valueOf((float)l5.cP)).floatValue();
            l5.cT = ag.a(ab2, string15, "energyDisplayName", null);
            l5.cW = ab2.g(string15, "radius");
            l5.dd = ab2.b(string15, "displayRadius", l5.cW);
            float f9 = l5.cW;
            if (f9 < 6.0f) {
                f9 = 6.0f;
            }
            l5.de = ab2.a(string15, "uiTargetRadius", Float.valueOf((float)f9)).floatValue();
            l5.df = ab2.b(string15, "shieldRenderRadius", l5.cW);
            l5.dg = ab2.b(string15, "buildingSelectionOffset", 0);
            l5.cX = ab2.a(string15, "footprint", l5.cX);
            l5.cY = ab2.a(string15, "constructionFootprint", l5.cY);
            l5.cZ.a(l5.cX);
            l5.cZ = ab2.a(string15, "displayFootprint", l5.cZ);
            l5.da = ab2.a(string15, "buildingToFootprintOffsetX", Float.valueOf((float)10.0f)).floatValue();
            l5.db = ab2.a(string15, "buildingToFootprintOffsetY", Float.valueOf((float)10.0f)).floatValue();
            l5.cW = (int)((float)l5.cW * l5.aG);
            l5.dd = (int)((float)l5.dd * l5.aG);
            l5.cL.n = ab2.b(string15, "fogOfWarSightRange", 15);
            l5.dh = ab2.b(string15, "fogOfWarSightRangeWhileNotBuilt", -1);
            l5.di = ab2.a(string15, "exit_x", Float.valueOf((float)0.0f)).floatValue();
            l5.dj = ab2.a(string15, "exit_y", Float.valueOf((float)9.0f)).floatValue();
            l5.dk = ab2.a(string15, "exit_dirOffset", (Float)null);
            l5.dl = ab2.a(string15, "exit_heightOffset", Float.valueOf((float)0.0f)).floatValue();
            l5.dm = ab2.a(string15, "exitHeightIgnoreParent", (Boolean)false);
            l5.dn = ab2.a(string15, "exit_moveAwayAmount", Float.valueOf((float)70.0f));
            l5.eB = ab2.b(string15, "softCollisionOnAll", 0);
            l5.eC = ab2.a(string15, "disableAllUnitCollisions", (Boolean)false);
            if (l5.eC) {
                l5.cX.a(0, 0, -1, -1);
            }
            l5.eJ = ab2.a(string15, "hideScorchMark", (Boolean)false);
            l5.eK = ab2.a(string16, "disableLowHpFire", (Boolean)l5.eD);
            l5.eL = ab2.a(string16, "disableLowHpSmoke", (Boolean)l5.eD);
            l5.aH = ab2.a(string15, "isBuilding", (Boolean)false);
            l5.aI = ab2.a(string15, "ignoreInUnitCapCalculation", (Boolean)l5.aH);
            l5.aJ = ab2.a(string15, "placeOnlyOnResPool", (Boolean)false);
            l5.aK = ab2.a(string15, "isUnrepairableUnit", (Boolean)false);
            l5.aL = ab2.a(string15, "extraBuildRangeWhenBuildingThis", Float.valueOf((float)0.0f)).floatValue();
            l5.aM = ab2.a(string15, "isUnselectable", (Boolean)false);
            l5.aN = ab2.a(string15, "isUnselectableAsTarget", (Boolean)l5.aM);
            l5.fO = ab2.a(l5, string15, "showActionsWithMixedSelectionIfOtherUnitsHaveTag", (com.corrodinggames.rts.game.units.custom.h)null);
            l5.aO = ab2.a(string15, "canNotBeDirectlyAttacked", (Boolean)false);
            l5.aP = ab2.a(string15, "canNotBeDamaged", (Boolean)l5.aO);
            l5.aQ = ab2.a(string15, "showOnMinimap", (Boolean)true);
            l5.aR = ab2.a(string15, "showOnMinimapToEnemies", (Boolean)l5.cL.m);
            l5.aS = ab2.a(l5, string15, "canOnlyBeAttackedByUnitsWithTags", (com.corrodinggames.rts.game.units.custom.h)null);
            if (l5.aO && l5.aS != null) {
                throw new RuntimeException("canNotBeDirectlyAttacked and canOnlyBeAttackedByUnitsWithTags cannot be used at the same time");
            }
            l5.aT = ab2.a(string15, "canNotBeGivenOrdersByPlayer", (Boolean)false);
            l5.aU = ab2.a(string15, "canRepairBuildings", (Boolean)false);
            l5.aV = ab2.a(string15, "canRepairUnits", (Boolean)false);
            l5.aW = ab2.a(string15, "autoRepair", (Boolean)false);
            if (l5.aW) {
                l5.a(com.corrodinggames.rts.game.units.custom.b.b.a);
            }
            l5.cL.o = ab2.b(string15, "nanoRange", -1);
            if (l5.cL.o != -1) {
                l5.cL.o = (int)((float)l5.cL.o * l5.aG);
            }
            l5.aY = ab2.a(string15, "nanoRangeForRepairIsMelee", (Boolean)false);
            if (l5.aY) {
                l5.aX = 5;
            }
            if ((n8 = ab2.b(string15, "nanoRangeForRepair", -1).intValue()) != -1) {
                l5.aX = n8;
                l5.aX = (int)((float)l5.aX * l5.aG);
            }
            l5.ba = ab2.a(string15, "nanoRangeForReclaimIsMelee", (Boolean)false);
            if (l5.ba) {
                l5.aZ = 5;
            }
            if ((n7 = ab2.b(string15, "nanoRangeForReclaim", -1).intValue()) != -1) {
                l5.aZ = n7;
                l5.aZ = (int)((float)l5.aZ * l5.aG);
            }
            l5.bb = ab2.a(string15, "nanoRepairSpeed", Float.valueOf((float)0.2f)).floatValue();
            float f10 = 5.1f;
            l5.bc = ab2.a(string15, "nanoReclaimSpeed", Float.valueOf((float)(l5.bb * 5.1f))).floatValue();
            l5.bd = ab2.a(string15, "resourceReclaimMultiplier", Float.valueOf((float)1.0f)).floatValue();
            l5.be = ab2.a(string15, "nanoUnbuildSpeed", Float.valueOf((float)1.0f)).floatValue() * 0.001f * 5.1f;
            l5.bf = ab2.a(string15, "nanoBuildSpeed", Float.valueOf((float)1.0f)).floatValue();
            l5.cL.r = ab2.a(string15, "nanoFactorySpeed", Float.valueOf((float)1.0f)).floatValue();
            l5.cL.p = ab2.a(string15, "selfRegenRate", Float.valueOf((float)0.0f)).floatValue();
            l5.bh = ab2.d(string15, "selfBuildRate", Float.valueOf((float)0.0f)).floatValue();
            l5.bi = ab2.a(string15, "dieOnConstruct", (Boolean)false);
            l5.bk = ab2.a(string15, "dieOnZeroEnergy", (Boolean)false);
            int n12 = 4;
            if (l5.cL.b > 30000.0f) {
                n12 = 8;
            }
            if (l5.aH) {
                n12 = 7;
            }
            l5.bq = ab2.b(string15, "numBitsOnDeath", n12);
            l5.bn = ab2.a(string15, "nukeOnDeath", (Boolean)false);
            l5.bo = ab2.a(string15, "nukeOnDeathRange", Float.valueOf((float)250.0f)).floatValue();
            l5.bp = ab2.a(string15, "nukeOnDeathDamage", Float.valueOf((float)5400.0f)).floatValue();
            l5.br = ab2.a(string15, "nukeOnDeathDisableWhenNoNuke", (Boolean)false);
            l5.bm = ab2.b(string15, "fireOnDeath", 0);
            l5.bt = (ab)ab2.a(string15, "explodeTypeOnDeath", null, ab.class);
            l5.bu = ab2.a(string15, "explodeOnDeath", (Boolean)true);
            l5.bs = ab2.a(string15, "disableDeathOnZeroHp", (Boolean)false);
            boolean bl6 = ab2.a(string15, "explodeOnDeathGroundCollosion", (Boolean)true);
            l5.bv = bl6 = ab2.a(string15, "explodeOnDeathGroundCollision", (Boolean)bl6).booleanValue();
            l5.by = l5.a(ab2.b(string15, "effectOnDeath", (String)null), (z)null);
            l5.bx = l5.a(ab2.b(string15, "effectOnDeathIfUnbuilt", (String)null), (z)null);
            l5.bz = bl.a(l5, ab2.b(string15, "soundOnDeath", (String)null));
            String string27 = ab2.b(string15, "effectOnDeathGroundCollosion", (String)null);
            string27 = ab2.b(string15, "effectOnDeathGroundCollision", string27);
            l5.bw = l5.a(string27, (z)null);
            l5.bC = bp.a(l5, ab2, string15, "unitsSpawnedOnDeath");
            l5.bD = ab2.a(string15, "unitsSpawnedOnDeath_setToTeamOfLastAttacker", (Boolean)false);
            l5.fk = ab2.a(string15, "canReclaimResources", (Boolean)false);
            l5.fl = ab2.a(l5, string15, "canReclaimResourcesOnlyWithTags", (com.corrodinggames.rts.game.units.custom.h)null);
            l5.fm = ab2.b(string15, "canReclaimResourcesNextSearchRange", 500);
            l5.fn = ab2.a(l5, string15, "canReclaimUnitsOnlyWithTags", (com.corrodinggames.rts.game.units.custom.h)null);
            l5.fo = ab2.a(l5, string15, "canRepairUnitsOnlyWithTags", (com.corrodinggames.rts.game.units.custom.h)null);
            if (l5.fn != null && !l5.aV && !l5.aU) {
                throw new RuntimeException("canReclaimUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
            }
            if (l5.fo != null && !l5.aV && !l5.aU) {
                throw new RuntimeException("canRepairUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
            }
            l5.eM = ab2.b(string15, "maxTransportingUnits", 0);
            if (l5.eM < 0) {
                throw new RuntimeException("maxTransportingUnits cannot be < 0");
            }
            l5.eN = ab2.b(string15, "transportUnitsUnloadDelayBetweenEachUnit", Float.valueOf((float)30.0f)).floatValue();
            l5.eP = com.corrodinggames.rts.game.units.custom.g.a(ab2.b(string15, "transportUnitsRequireTag", (String)null));
            String string28 = ab2.b(string15, "transportUnitsRequireMovementType", (String)null);
            if (string28 != null) {
                for (String string722 : string28.split(",")) {
                    string722 = string722.trim();
                    l5.eQ.add((Object)ao.a(string722, "transportUnitsRequireMovementType"));
                }
            }
            l5.eO = ab2.a(string15, "transportUnitsEachUnitAlwaysUsesSingleSlot", (Boolean)false);
            l5.eR = ab2.a(string15, "transportUnitsBlockAirAndWaterUnits", (Boolean)(l5.eQ.size() == 0 ? 1 : 0));
            l5.eS = ab2.a(string15, "transportUnitsBlockOtherTransports", (Boolean)true);
            l5.eU = ab2.a(l5, string15, "transportUnitsKeepBuiltUnits", LogicBoolean.falseBoolean);
            l5.eV = ab2.a(l5, string15, "transportUnitsKillOnDeath", LogicBoolean.trueBoolean);
            l5.eW = ab2.a(l5, string15, "transportUnitsKeepWaypoints", LogicBoolean.falseBoolean);
            l5.eY = ab2.a(string15, "transportUnitsHealBy", Float.valueOf((float)0.0f)).floatValue();
            l5.fc = ab2.a(l5, string15, "transportUnitsCanUnloadUnits", (LogicBoolean)null);
            if (l5.fc != null) {
                l5.fd = l5.fc;
            } else {
                l5.fc = com.corrodinggames.rts.game.units.custom.l.fa;
                l5.fd = com.corrodinggames.rts.game.units.custom.l.fb;
            }
            l5.eT = ab2.a(string15, "transportUnitsAddUnloadOption", (Boolean)(l5.fc != LogicBoolean.falseBoolean ? 1 : 0));
            l5.eX = ab2.a(string15, "transportUnitsOnTeamChangeKeepCurrentTeam", (Boolean)l5.eX);
            l5.eZ = ab2.b(string15, "transportSlotsNeeded", 1);
            for (n6 = -1; n6 <= 29; ++n6) {
                String string29;
                String string30 = "builtFrom_" + n6 + "_";
                if (n6 == -1) {
                    string30 = "builtFrom_";
                }
                if ((string722 = ab2.b(string15, string29 = string30 + "name", (String)null)) == null) continue;
                for (String f11 : bl3 = string722.split(",")) {
                    if ((f11 = f11.trim()).equals((Object)"")) continue;
                    p f12 = new p();
                    f12.a = f11;
                    f12.b = ab2.a(string15, string30 + "pos", Float.valueOf((float)999.0f)).floatValue();
                    f12.c = ab2.a(string15, string30 + "forceNano", (Boolean)false);
                    f12.d = "[" + string15 + "]" + string29;
                    f12.f = ab2.a(l5, string15, string30 + "isLocked", (LogicBoolean)null);
                    f12.g = ag.a(ab2, string15, string30 + "isLockedMessage", null);
                    if (f12.f == LogicBoolean.falseBoolean) {
                        f12.f = null;
                    }
                    if ("NONE".equalsIgnoreCase(f11)) continue;
                    l5.gg.add((Object)f12);
                }
            }
            for (n6 = 0; n6 <= 50; ++n6) {
                String string32 = ab2.b(string15, "canBuild_" + n6 + "_name", (String)null);
                if (string32 == null) continue;
                String string33 = "canBuild_" + n6 + "_";
                ag.b(l5, ab2, string15, string33, false);
            }
            Object object16 = ab2.e("canBuild_").iterator();
            while (object16.hasNext()) {
                String string34 = (String)object16.next();
                ag.b(l5, ab2, string34, "", true);
            }
            l5.ff = be.a(l5, ab2);
            object16 = ab2.e(string18, "movementType");
            l5.fg = ao.a((String)object16, "movementType");
            l5.fh = !l5.aH ? l5.fg : ao.a;
            Boolean bl7 = ab2.a(string19, "useAsBuilder", (Boolean)null);
            l5.fs = ab2.a(string19, "useAsAttacker", (Boolean)true);
            Boolean bl8 = ab2.a(string15, "isBuilder", (Boolean)null);
            if (bl8 == null) {
                bl8 = bl7 == null ? Boolean.valueOf((boolean)false) : bl7;
            } else if (bl7 == null) {
                bl7 = bl8;
            }
            if (bl7 == null) {
                bl7 = false;
            }
            l5.fp = bl8;
            l5.fq = bl7;
            if (!l5.fp && l5.fq) {
                throw new RuntimeException("Cannot tell AI to use a non-builder as builder [ai]useAsBuilder:" + l5.fq + " [core]isBuilder:" + l5.fp);
            }
            if (l5.fk) {
                l5.fr = true;
            }
            if ((string722 = ab2.a(string19, "useAsHarvester", (Boolean)null)) != null) {
                l5.fr = string722.booleanValue();
            }
            if ((bl3 = ab2.a(string19, "useAsTransport", (Boolean)null)) == null) {
                bl3 = l5.eM > 0 && !l5.fq && !l5.aH;
                if (!l5.eT) {
                    bl3 = false;
                }
            }
            l5.ft = bl3;
            l5.as = l5.aH ? com.corrodinggames.rts.game.units.d.d.q : (l5.fg == ao.d ? com.corrodinggames.rts.game.units.b.b.n : (l5.fg == ao.e ? com.corrodinggames.rts.game.units.h.f.q : (l5.fg == ao.f ? (l5.cm ? com.corrodinggames.rts.game.units.e.j.dO : (l5.l() ? com.corrodinggames.rts.game.units.e.b.h : com.corrodinggames.rts.game.units.e.h.n)) : (l5.cm ? com.corrodinggames.rts.game.units.e.j.dO : (l5.l() ? com.corrodinggames.rts.game.units.e.b.h : com.corrodinggames.rts.game.units.e.j.dN)))));
            com.corrodinggames.rts.gameFramework.m.e e4 = l5.a(ab2, string16, "icon_zoomed_out", false);
            if (e4 != null) {
                l5.as = l5.a(e4, l5.ac);
            }
            if (ab2.a(string16, "icon_zoomed_out_neverShow", (Boolean)false).booleanValue()) {
                l5.as = null;
            }
            l5.t = ab2.a(string16, "showHealthBar", (Boolean)true);
            l5.u = ab2.a(string16, "showHealthBarChanges", (Boolean)true);
            l5.v = ab2.a(string16, "showEnergyBar", (Boolean)true);
            l5.w = ab2.a(string16, "showShotDelayBar", (Boolean)true);
            l5.x = ab2.a(string16, "showTransportBar", (Boolean)true);
            l5.y = ab2.a(string16, "showShieldBar", (Boolean)true);
            l5.z = ab2.a(string16, "showQueueBar", (Boolean)true);
            l5.A = ab2.a(string16, "showSelectionIndicator", (Boolean)true);
            l5.fi = ab2.a(string18, "slowDeathFall", (Boolean)false);
            l5.fj = ab2.a(string18, "slowDeathFallSmoke", (Boolean)true);
            l5.cL.j = ab2.a(string18, "moveSpeed", Float.valueOf((float)1.0f)).floatValue() * l5.aG;
            l5.dN = ab2.a(string18, "moveAccelerationSpeed", Float.valueOf((float)1.0f)).floatValue() * l5.aG;
            l5.dO = ab2.a(string18, "moveDecelerationSpeed", Float.valueOf((float)1.0f)).floatValue() * l5.aG;
            Boolean bl4 = ab2.a(string18, "ignoreMoveOrders", (Boolean)null);
            if (l5.aH) {
                l5.dP = true;
            }
            if (bl4 != null) {
                if (bl4.booleanValue()) {
                    l5.dP = true;
                    if (l5.cL.j > 0.0f) {
                        throw new RuntimeException("[movement]ignoreMoveOrders expects moveSpeed=0");
                    }
                } else if (l5.aH) {
                    throw new RuntimeException("[movement]ignoreMoveOrders=false not yet supported on buildings");
                }
            }
            l5.ej = ab2.a(string18, "moveYAxisScaling", Float.valueOf((float)1.0f)).floatValue();
            if (l5.ej <= 0.0f) {
                throw new RuntimeException("[movement]moveYAxisScaling must be > 0");
            }
            l5.ek = 1.0f / l5.ej;
            l5.el = ab2.a(string18, "reverseSpeedPercentage", Float.valueOf((float)0.6f)).floatValue();
            String string7 = ab2.b(string18, "landOnGround", "false");
            if (string7.equalsIgnoreCase("false")) {
                l5.dQ = false;
            } else if (string7.equalsIgnoreCase("onlyIdle")) {
                l5.dQ = true;
                l5.dR = true;
            } else if (string7.equalsIgnoreCase("true")) {
                l5.dQ = true;
            } else {
                throw new RuntimeException("landOnGround expected:true, false, onlyIdle, not:" + string7);
            }
            float f8 = 0.0f;
            float f11 = 0.0f;
            if (l5.fg == ao.d) {
                f8 = 35.0f;
                f11 = 1.5f;
            }
            l5.dS = ab2.a(string18, "startingHeightOffset", Float.valueOf((float)0.0f)).floatValue();
            l5.cL.q = ab2.a(string18, "targetHeight", Float.valueOf((float)f8)).floatValue();
            l5.dT = ab2.a(string18, "targetHeightDrift", Float.valueOf((float)f11)).floatValue();
            if (l5.cL.q > 80.0f) {
                l5.B = true;
            }
            l5.dU = ab2.a(string18, "heightChangeRate", Float.valueOf((float)l5.dU)).floatValue();
            l5.dV = ab2.a(string18, "fallingAcceleration", Float.valueOf((float)l5.dV)).floatValue();
            l5.dW = ab2.a(string18, "fallingAccelerationDead", Float.valueOf((float)l5.dW)).floatValue();
            l5.cL.k = ab2.a(string18, "maxTurnSpeed", Float.valueOf((float)1.0f)).floatValue();
            l5.eo = ab2.a(string18, "turnAcceleration", Float.valueOf((float)1.0f)).floatValue();
            l5.dX = ab2.a(string18, "moveSlidingMode", (Boolean)false);
            l5.dY = ab2.a(string18, "moveIgnoringBody", (Boolean)false);
            l5.dZ = ab2.b(string18, "moveSlidingDir", -1);
            l5.ei = ab2.a(string18, "joinsGroupFormations", (Boolean)true);
            l5.ea = ab2.a(string17, "turretSize", Float.valueOf((float)1.0f)).floatValue() * l5.aG;
            l5.eb = ab2.a(string17, "turretTurnSpeed", Float.valueOf((float)8.0f)).floatValue();
            l5.dL = ab2.a(string17, "turretRotateWithBody", (Boolean)true);
            String string14 = ab2.b(string17, "attackMovement", "normal");
            l5.ec = com.corrodinggames.rts.game.units.b.a;
            if (string14.equalsIgnoreCase("normal")) {
                l5.ec = com.corrodinggames.rts.game.units.b.a;
            }
            if (string14.equalsIgnoreCase("strafing")) {
                l5.ec = com.corrodinggames.rts.game.units.b.b;
            }
            if (string14.equalsIgnoreCase("bomber")) {
                l5.ec = com.corrodinggames.rts.game.units.b.d;
            }
            l5.ef = ab2.a(string17, "disablePassiveTargeting", (Boolean)false);
            l5.eg = ab2.a(string17, "stopTargetingAfterFiring", (Boolean)false);
            l5.eh = ab2.a(string17, "turretMultiTargeting", (Boolean)false);
            l5.ed = ab2.a(string17, "attackMovementSpeed", Float.valueOf((float)1.0f)).floatValue();
            l5.ee = ab2.a(string17, "attackMovementSpread", Float.valueOf((float)1.0f)).floatValue();
            Float f12 = ab2.a(string17, "maxAttackRange", (Float)null);
            if (f12 != null) {
                bl2 = true;
                l5.cL.i = f12.floatValue() * l5.aG;
            } else {
                bl2 = false;
                l5.cL.i = 100.0f * l5.aG;
            }
            l5.ez = ab2.a(string17, "aimOffsetSpread", Float.valueOf((float)0.6f)).floatValue();
            l5.dM = ab2.b(string17, "shootDelay", Float.valueOf((float)50.0f)).floatValue();
            l5.cL.e = ab2.a(string17, "shootDelayMultiplier", Float.valueOf((float)1.0f)).floatValue();
            l5.cL.f = ab2.a(string17, "shootDamageMultiplier", Float.valueOf((float)1.0f)).floatValue();
            l5.dK = ab2.a(string17, "showRangeUIGuide", (Boolean)null);
            l5.eF = ab2.a(string17, "isMelee", (Boolean)false);
            l5.eG = 0.0f;
            Float f13 = ab2.a(string17, "meleeEngangementDistance", (Float)null);
            if (l5.eF) {
                l5.eG = 250.0f;
                if (f13 != null) {
                    l5.eG = f13.floatValue();
                }
            } else if (f13 != null) {
                throw new RuntimeException("[attack]meleeEngangementDistance can only be used with isMelee:true");
            }
            ag.a(l4, ah.k);
            Iterator n13 = ab2.e("projectile_").iterator();
            while (n13.hasNext()) {
                String n5 = (String)n13.next();
                n4 = n5.substring("projectile_".length());
                if (l5.f((String)n4) != null) {
                    throw new RuntimeException("Two projectiles found with the same name:" + (String)n4);
                }
                bl102 = new bh();
                ((bh)bl102).bh = n4;
                ((bh)bl102).bj = l5;
                bh.a((bh)bl102, l5, ab2, n5);
            }
            int n3 = l5.fT.size();
            if (n3 < 1) {
                n3 = 1;
            }
            l5.fR = new bh[n3];
            for (bh2 = 0; bh2 < l5.fT.size(); ++bh2) {
                n4 = (bh)l5.fT.get(bh2);
                ((bh)n4).bi = bh2;
                l5.fR[bh2] = n4;
            }
            for (bh2 = 0; bh2 < l5.fR.length; ++bh2) {
                n4 = l5.fR[bh2];
                if (n4 == null) continue;
                ((bh)n4).w *= l5.aG;
                ((bh)n4).au *= l5.aG;
                ((bh)n4).aF *= l5.aG;
            }
            if (l5.fR[0] == null) {
                bh arrayList = new bh();
                arrayList.bi = 0;
                arrayList.bh = "1";
                arrayList.b = 10;
                l5.fT.add((Object)arrayList);
                l5.fR[0] = arrayList;
            }
            ArrayList arrayList = l5.fS;
            n4 = ab2.e("turret_").iterator();
            while (n4.hasNext()) {
                bl102 = (String)n4.next();
                String bl11 = bl102.substring("turret_".length());
                if (l5.e(bl11) != null) {
                    throw new RuntimeException("Two turrets found with the same name:" + bl11);
                }
                object3 = new bn();
                ((bn)object3).a = bl11;
                ((bn)object3).b = bl102;
                arrayList.add(object3);
            }
            for (Object bl102 : arrayList) {
                bn.a((bn)bl102, l5, ab2, ((bn)bl102).b);
            }
            if (arrayList.size() == 0) {
                n4 = new bn();
                ((bn)n4).f = 0.0f;
                ((bn)n4).g = 0.0f;
                ((bn)n4).a = "1";
                ((bn)n4).m = l5.dM;
                arrayList.add(n4);
            }
            for (f15 = arrayList.size() - 1; f15 >= 0; --f15) {
                if (arrayList.get(f15) == null) continue;
                ((bn)arrayList.get((int)f15)).e = f15;
            }
            for (f15 = arrayList.size() - 1; f15 >= 0; --f15) {
                if (arrayList.get(f15) == null) continue;
                bl102 = (bn)arrayList.get(f15);
                if (((bn)bl102).y != null) {
                    ((bn)bl102).w = ((bn)bl102).y.e;
                    if (((bn)bl102).y.y != null) {
                        throw new RuntimeException(((bn)bl102).a + ": Turret can not be attached to turret that is also attached to a turret");
                    }
                }
                if (((bn)bl102).z != null) {
                    ((bn)bl102).x = ((bn)bl102).z.e;
                }
                if (!(((bn)bl102).W < 0.0f)) continue;
                ((bn)bl102).W = ((bn)bl102).V;
            }
            if (arrayList.size() > 31) {
                throw new RuntimeException("Turret max count per unit is: 31");
            }
            l5.fQ = (bn[])arrayList.toArray((Object[])new bn[0]);
            l5.dJ = l5.cL.i;
            float f14 = -1.0f;
            boolean bl9 = true;
            boolean bl11 = false;
            object3 = arrayList.iterator();
            while (object3.hasNext()) {
                bn l7 = (bn)object3.next();
                l7.X *= l5.aG;
                l7.f *= l5.aG;
                l7.g *= l5.aG;
                l7.Y *= l5.aG;
                l7.Z *= l5.aG;
                boolean bl12 = false;
                if (l7.B) {
                    if (l7.ab >= 99999.0f) {
                        bl9 = false;
                    } else {
                        bl11 = true;
                        if (l5.dJ > l7.ab) {
                            l5.dJ = l7.ab;
                        }
                        if (f14 < l7.ab) {
                            f14 = l7.ab;
                        }
                        if (com.corrodinggames.rts.gameFramework.f.c(l7.ab - l5.cL.i) > 5.0f) {
                            y2 = 0;
                            string6 = l5.o.iterator();
                            while (string6.hasNext()) {
                                i2 = (com.corrodinggames.rts.game.units.custom.y)string6.next();
                                if (!(com.corrodinggames.rts.gameFramework.f.c(l7.ab - ((com.corrodinggames.rts.game.units.custom.y)i2).a) < 5.0f)) continue;
                                y2 = 1;
                            }
                            if (y2 == 0) {
                                bl12 = true;
                            }
                        }
                    }
                }
                if (l7.ac != null) {
                    bl12 = l7.ac;
                }
                if (!bl12) continue;
                com.corrodinggames.rts.game.units.custom.y iterator4 = new com.corrodinggames.rts.game.units.custom.y();
                iterator4.a = l7.ab;
                l5.o.add(iterator4);
            }
            if (bl11 && bl9) {
                if (!bl2) {
                    l5.cL.i = f14;
                } else if (f14 < l5.cL.i) {
                    throw new RuntimeException("limitingRange as been applied to all turrets but is less than maxAttackRange (hint: unset maxAttackRange or a limitingRange, or make values match)");
                }
            }
            if ((object3 = ab2.b(string17, "setMainTurretAs", (String)null)) != null) {
                l5.dF = l5.e((String)object3);
                if (l5.dF == null) {
                    throw new RuntimeException("[attack] Could not find setMainTurretAs with name: " + (String)object3);
                }
            } else {
                l5.dF = l5.e("1");
                if (l5.dF == null) {
                    l5.dF = l5.fQ[0];
                }
            }
            l5.dG = l5.dF.e;
            ag.a(l4, ah.l);
            long l7 = br.a();
            if (ab2.l(string15, "action_")) {
                for (y2 = 0; y2 <= 50; ++y2) {
                    ag.a(l5, ab2, string15, "action_" + y2 + "_", "" + y2, false, false);
                }
            }
            Iterator iterator3 = ab2.e("action_").iterator();
            while (iterator3.hasNext()) {
                string6 = (String)iterator3.next();
                i2 = string6.substring("action_".length());
                if (l5.g((String)i2) != null) {
                    throw new RuntimeException("Two actions found with the same name:" + (String)i2);
                }
                ag.a(l5, ab2, string6, "", (String)i2, true, false);
            }
            iterator3 = ab2.e("hiddenAction_").iterator();
            while (iterator3.hasNext()) {
                string6 = (String)iterator3.next();
                i2 = string6.substring("hiddenAction_".length());
                if (l5.g((String)i2) != null) {
                    throw new RuntimeException("Two actions found with the same name:" + (String)i2);
                }
                ag.a(l5, ab2, string6, "", (String)i2, true, true);
            }
            ag.a(l7, ah.j);
            iterator3 = new ArrayList();
            string6 = new ArrayList();
            for (int arrayList2 = 0; arrayList2 <= 1; ++arrayList2) {
                boolean iterator5 = arrayList2 == 0;
                bl142 = iterator5 ? iterator3 : string6;
                for (n2 = 1; n2 < 21; ++n2) {
                    String string21 = string5 = iterator5 ? "leg_" + n2 : "arm_" + n2;
                    if (ab2.g(string5)) {
                        Object i3 = new ba();
                        ba.a((ba)i3, l5, ab2, string5, iterator5, (ArrayList)bl142);
                        bl142.add(i3);
                        continue;
                    }
                    bl142.add(null);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object bl142 : iterator3) {
                if (bl142 == null) continue;
                arrayList2.add(bl142);
            }
            Iterator n14 = string6.iterator();
            while (n14.hasNext()) {
                bl142 = (ba)n14.next();
                if (bl142 == null) continue;
                arrayList2.add(bl142);
            }
            int object19 = arrayList2.size() - 1;
            while (object19 >= 0) {
                bl142 = (ba)arrayList2.get(object19);
                ((ba)bl142).a = object19--;
            }
            l5.ax = (ba[])arrayList2.toArray((Object[])new ba[0]);
            if (l5.ax.length > 0) {
                l5.a(com.corrodinggames.rts.game.units.custom.b.h.a);
            }
            Object object4 = l5.dr.iterator();
            while (object4.hasNext()) {
                bl142 = (com.corrodinggames.rts.game.units.custom.f)object4.next();
                ((com.corrodinggames.rts.game.units.custom.f)bl142).a(l5);
            }
            ag.b(l5);
            object4 = ab2.b(string15, "fireTurretXAtSelfOnDeath", (String)null);
            if (object4 != null && !"NONE".equalsIgnoreCase((String)object4)) {
                bl142 = l5.e((String)object4);
                if (bl142 == null) {
                    throw new RuntimeException("Cannot find turret:" + (String)object4 + " for [" + string15 + "]fireTurretXAtSelfOnDeath");
                }
                l5.bB = ((bn)bl142).e;
            }
            com.corrodinggames.rts.game.units.custom.b.c.a(l5, ab2);
            l5.bj = ab2.a(string17, "dieOnAttack", (Boolean)false);
            l5.bl = ab2.a(string17, "removeOnAttack", (Boolean)false);
            l5.ep = ab2.d(string17, "canAttack");
            if (l5.ep) {
                l5.eq = ab2.a(l5, string17, "canAttackFlyingUnits");
                l5.er = ab2.a(l5, string17, "canAttackLandUnits");
                l5.es = ab2.a(l5, string17, "canAttackUnderwaterUnits");
            } else {
                l5.eq = ab2.a(l5, string17, "canAttackFlyingUnits", LogicBoolean.falseBoolean);
                l5.er = ab2.a(l5, string17, "canAttackLandUnits", LogicBoolean.falseBoolean);
                l5.es = ab2.a(l5, string17, "canAttackUnderwaterUnits", LogicBoolean.falseBoolean);
            }
            l5.et = ab2.a(l5, string17, "canAttackNotTouchingWaterUnits", (LogicBoolean)null);
            if (LogicBoolean.isStaticTrue(l5.et)) {
                l5.et = null;
            }
            l5.ev = ab2.a(l5, string17, "canOnlyAttackUnitsWithTags", (com.corrodinggames.rts.game.units.custom.h)null);
            l5.ew = ab2.a(l5, string17, "canOnlyAttackUnitsWithoutTags", (com.corrodinggames.rts.game.units.custom.h)null);
            if (l5.ev != null || l5.ew != null) {
                l5.eu = true;
            }
            boolean bl13 = false;
            n2 = 0;
            for (Object i3 : arrayList) {
                if (((bn)i3).O != null && ((bn)i3).O.a(l5.ev)) {
                    ((bn)i3).O = null;
                }
                if (((bn)i3).P != null && ((bn)i3).P.a(l5.ew)) {
                    ((bn)i3).P = null;
                }
                if (!((bn)i3).B) continue;
                if (((bn)i3).O != null || ((bn)i3).P != null) {
                    bl13 = true;
                    continue;
                }
                n2 = 1;
            }
            if (bl13 && n2 == 0) {
                l5.ex = true;
                l5.eu = true;
            }
            l5.ey = ab2.a(string17, "isFixedFiring", (Boolean)false);
            l5.fM = ab2.a(string19, "lowPriorityTargetForOtherUnits", (Boolean)false);
            l5.fN = ab2.a(string19, "notPassivelyTargetedByOtherUnits", (Boolean)false);
            if (l5.ep && l5.fN) {
                throw new RuntimeException("[ai]notPassivelyTargetedByOtherUnits is cannot currently supported on units that can attack");
            }
            l5.fv = ab2.a(l5, string19, "aiTags", (com.corrodinggames.rts.game.units.custom.h)null);
            l5.fw = ab2.a(string19, "disableUse", (Boolean)false);
            l5.fz = ab2.a(string19, "buildPriority", Float.valueOf((float)0.05f)).floatValue();
            l5.fA = ab2.b(string19, "recommendedInEachBaseNum", 0);
            l5.fB = ab2.a(string19, "recommendedInEachBasePriorityIfUnmet", Float.valueOf((float)0.5f)).floatValue();
            l5.fy = ab2.b(string19, "maxEachBase", com.corrodinggames.rts.gameFramework.f.b(2, l5.fA));
            l5.fx = ab2.b(string19, "maxGlobal", -1);
            if (l5.fy < l5.fA) {
                throw new RuntimeException("[ai]recommendedInEachBaseNum is smaller than maxEachBase");
            }
            if (!l5.aH) {
                if (ab2.n(string19, "recommendedInEachBaseNum")) {
                    throw new RuntimeException("[ai]recommendedInEachBaseNum currently only applies to buildings");
                }
                if (ab2.n(string19, "recommendedInEachBasePriorityIfUnmet")) {
                    throw new RuntimeException("[ai]recommendedInEachBasePriorityIfUnmet currently only applies to buildings");
                }
            }
            l5.fE = ab2.b(string19, "whenUsingAsHarvester_recommendedInEachBase", -1);
            l5.fF = ab2.b(string19, "whenUsingAsHarvester_recommendedGlobal", -1);
            l5.fG = ab2.a(string19, "whenUsingAsHarvester_includeOtherHarvesterCounts", (Boolean)false);
            l5.fH = ab2.a(l5, string19, "onlyUseAsHarvester_ifBaseHasUnitTagged", (com.corrodinggames.rts.game.units.custom.h)null);
            l5.fC = ab2.a(string19, "nonInBaseExtraPriority", Float.valueOf((float)0.04f)).floatValue();
            l5.fC = ab2.a(string19, "noneInBaseExtraPriority", Float.valueOf((float)l5.fC)).floatValue();
            l5.fD = ab2.a(string19, "nonGlobalExtraPriority", Float.valueOf((float)0.0f)).floatValue();
            l5.fD = ab2.a(string19, "noneGlobalExtraPriority", Float.valueOf((float)l5.fD)).floatValue();
            l5.fI = ab2.b(string19, "upgradedFrom", (String)null);
            string5 = ab2.a(string19, "ai_upgradePriority", (Float)null);
            if (string5 != null && string5.floatValue() != -1.0f) {
                if (string5.floatValue() >= 0.0f && string5.floatValue() <= 1.0f) {
                    l5.fK = string5.floatValue() * 100.0f;
                } else {
                    throw new RuntimeException("[ai]ai_upgradePriority: " + l5.fK + " must be between 0-1 or -1 for default");
                }
            }
            if (l5.ep) {
                for (int m3 = 0; m3 < l5.fQ.length; ++m3) {
                    object22 = l5.fQ[m3];
                    if (!((bn)object22).B || ((bn)object22).ao != null || !l5.w) continue;
                    if (((bn)object22).m > 140.0f && (l5.em == -1 || l5.fQ[l5.em].m < ((bn)object22).m)) {
                        l5.em = m3;
                    }
                    if (!(((bn)object22).n > 80.0f)) continue;
                    l5.en = m3;
                }
            }
            if (l5.cI == -2) {
                l5.cI = l5.fg == ao.d ? 5 : (l5.j() ? (l5.al != null ? 3 : 2) : (l5.cL.q < -2.0f ? 1 : (l5.eM > 0 ? 3 : 2)));
            }
            if (l5.fW.size() > 0) {
                l5.fX = true;
                com.corrodinggames.rts.gameFramework.utility.m iterator7 = new com.corrodinggames.rts.gameFramework.utility.m();
                object22 = new com.corrodinggames.rts.gameFramework.utility.m();
                object = new com.corrodinggames.rts.gameFramework.utility.m();
                Iterator iterator4 = l5.fW.iterator();
                while (iterator4.hasNext()) {
                    r r2 = (r)iterator4.next();
                    if (r2.c == com.corrodinggames.rts.game.units.custom.s.a) {
                        iterator7.add(r2);
                        continue;
                    }
                    if (r2.c == com.corrodinggames.rts.game.units.custom.s.b) {
                        ((com.corrodinggames.rts.gameFramework.utility.m)((Object)object22)).add(r2);
                        continue;
                    }
                    if (r2.c == com.corrodinggames.rts.game.units.custom.s.c) {
                        ((com.corrodinggames.rts.gameFramework.utility.m)((Object)object)).add(r2);
                        continue;
                    }
                    throw new RuntimeException("Unknown check rate:" + (Object)((Object)r2.c));
                }
                l5.fY = (r[])iterator7.toArray(new r[0]);
                l5.fZ = (r[])((com.corrodinggames.rts.gameFramework.utility.m)((Object)object22)).toArray(new r[0]);
                l5.ga = (r[])((com.corrodinggames.rts.gameFramework.utility.m)((Object)object)).toArray(new r[0]);
            }
            if (l5.gp != null && l5.gp.size() > 0) {
                Iterator iterator8 = l5.gp.iterator();
                while (iterator8.hasNext()) {
                    object22 = (u)iterator8.next();
                    ((u)object22).a(l5);
                }
            }
            if (l5.gb.a > 0) {
                Iterator iterator9 = l5.gb.iterator();
                while (iterator9.hasNext()) {
                    object22 = (t)iterator9.next();
                    ((t)object22).a(l5);
                }
                l5.gb.clear();
            }
            ag.a(l4, ah.m);
            ab2.b();
            for (Object object22 : ab2.d) {
                if (((ac)object22).a() != null && (((ac)object22).a().startsWith("hiddenAction_") || ((ac)object22).a().startsWith("canBuild_"))) {
                    throw new RuntimeException("Error [" + ((ac)object22).a() + "]" + ((ac)object22).b() + " has been repeated");
                }
                object = "Repeated key " + object22;
                l5.r((String)object);
                if (l5.R < 1) continue;
                com.corrodinggames.rts.gameFramework.l.e("Converting warning to error (meta.strictLevel=" + l5.R + ")");
                throw new bo((String)object);
            }
            for (Object object22 : ab2.e) {
                object = "Skipping line, unexpected format: '" + (String)object22 + "'";
                l5.r((String)object);
                if (l5.R < 1) continue;
                com.corrodinggames.rts.gameFramework.l.e("Converting warning to error (meta.strictLevel=" + l5.R + ")");
                throw new bo((String)object);
            }
            if (b2 != null) {
                ++b2.E;
            }
            Iterator iterator5 = com.corrodinggames.rts.game.units.custom.l.c;
            synchronized (iterator5) {
                com.corrodinggames.rts.game.units.custom.l.c.add((Object)l5);
            }
            ag.a(l4, ah.n);
            return l5;
        }
        catch (RuntimeException runtimeException) {
            ag.a(string2, (Exception)((Object)runtimeException), b2);
            return null;
        }
        catch (OutOfMemoryError outOfMemoryError) {
            ++l;
            ag.a(string2, (Exception)((Object)new RuntimeException((Throwable)outOfMemoryError)), b2);
            return null;
        }
        catch (bo bo2) {
            ag.a(string2, (Exception)bo2, b2);
            return null;
        }
    }

    public static void a(String string2, Exception exception, com.corrodinggames.rts.game.units.as as2) {
        com.corrodinggames.rts.gameFramework.i.b b2 = null;
        if (as2 instanceof com.corrodinggames.rts.game.units.custom.l) {
            com.corrodinggames.rts.game.units.custom.l l2 = (com.corrodinggames.rts.game.units.custom.l)as2;
            b2 = l2.J;
        }
        ag.a(string2, exception, b2);
    }

    public static String a(com.corrodinggames.rts.gameFramework.i.b b2, String string2, boolean bl2) {
        if (b2 != null) {
            String string3 = b2.q;
            string3 = com.corrodinggames.rts.gameFramework.e.a.o(string3);
            if ((string2 = com.corrodinggames.rts.gameFramework.e.a.o(string2)).startsWith(string3)) {
                if ((string2 = string2.substring(string3.length())).startsWith("/")) {
                    string2 = string2.substring(1);
                }
                if (string2.startsWith("\\")) {
                    string2 = string2.substring(1);
                }
            }
            if (bl2) {
                string2 = string2 + " (in mod " + b2.a() + ")";
            }
        }
        return string2;
    }

    public static void a(String string2, Exception exception, com.corrodinggames.rts.gameFramework.i.b b2) {
        String string3;
        com.corrodinggames.rts.gameFramework.l.b("Error while loading unit:" + string2);
        com.corrodinggames.rts.gameFramework.l.c(exception);
        if (string2 == null) {
            string2 = "<null>";
        }
        if ((string3 = exception instanceof bo ? exception.getMessage() : com.corrodinggames.rts.gameFramework.f.b(exception)) == null) {
            string3 = "<No error cause>";
        }
        if (!string3.contains((CharSequence)"unit config file")) {
            string3 = string3.replace((CharSequence)(string2 + ": "), (CharSequence)"");
            string3 = string3.replace((CharSequence)string2, (CharSequence)"");
        }
        string2 = ag.a(b2, string2, true);
        String string4 = b2 != null ? "Error loading unit: " + string2 + ": \n" + string3 : (string3.contains((CharSequence)"Error loading core unit") ? string3 : "Error loading core unit: " + string2 + ": \n" + string3 + " (This might be from placing a mod in 'assets/', they should go under 'mods/')");
        if (exception instanceof bo) {
            bo bo2 = (bo)exception;
            if (bo2.c != null || bo2.d != null) {
                string4 = string4 + " (section:" + bo2.c + ", key:" + bo2.d + ")";
            }
        }
        boolean bl2 = false;
        if (b2 != null) {
            bl2 = b2.f;
        }
        if (!bl2) {
            // empty if block
        }
        if (s != null) {
            s = string4;
        }
        if (b2 == null) {
            try {
                Thread.sleep((long)2L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            throw new RuntimeException(string4, (Throwable)exception);
        }
        b2.a(string4);
    }

    public static void b(com.corrodinggames.rts.game.units.custom.l l2, com.corrodinggames.rts.gameFramework.utility.ab ab2, String string2, String string3, boolean bl2) {
        String[] stringArray;
        String string4 = ab2.b(string2, string3 + "name", (String)null);
        if (string4 == null) {
            return;
        }
        for (String string5 : stringArray = string4.split(",")) {
            com.corrodinggames.rts.game.units.custom.d.b b2;
            string5 = string5.trim();
            com.corrodinggames.rts.game.units.custom.a.d d2 = new com.corrodinggames.rts.game.units.custom.a.d();
            d2.k = string5;
            d2.o = ab2.a(string2, string3 + "extraLagHidingInUI", (Boolean)false);
            d2.p = ab2.a(string2, string3 + "pos", Float.valueOf((float)999.0f)).floatValue();
            d2.aJ = ab2.b(string2, string3 + "tech", 1);
            d2.aK = ab2.a(string2, string3 + "forceNano", (Boolean)false);
            d2.aL = ab2.b(string2, string3 + "type", (String)null);
            d2.q = com.corrodinggames.rts.game.units.custom.d.b.a(l2, ab2, string2, string3 + "price", null);
            d2.aF = ab2.a(l2, string2, string3 + "isGuiBlinking", (LogicBoolean)null);
            d2.v = ab2.a(l2, string2, string3 + "isVisible", (LogicBoolean)null);
            d2.z = ab2.a(l2, string2, string3 + "isLocked", (LogicBoolean)null);
            d2.A = ag.a(l2, ab2, string2, string3 + "isLockedMessage", null);
            if (d2.z != null) {
                d2.y = true;
            }
            if (d2.z == LogicBoolean.falseBoolean) {
                d2.z = null;
            }
            d2.B = ab2.a(l2, string2, string3 + "isLockedAlt", (LogicBoolean)null);
            d2.C = ag.a(l2, ab2, string2, string3 + "isLockedAltMessage", null);
            if (d2.B != null) {
                d2.y = true;
            }
            if (d2.B == LogicBoolean.falseBoolean) {
                d2.B = null;
            }
            d2.D = ab2.a(l2, string2, string3 + "isLockedAlt2", (LogicBoolean)null);
            d2.E = ag.a(l2, ab2, string2, string3 + "isLockedAlt2Message", null);
            if (d2.D != null) {
                d2.y = true;
            }
            if (d2.D == LogicBoolean.falseBoolean) {
                d2.D = null;
            }
            if ((b2 = com.corrodinggames.rts.game.units.custom.d.b.a(l2, ab2, string2, string3 + "addResources", true)) != null && b2.d()) {
                d2.ae = b2;
            }
            d2.aM = com.corrodinggames.rts.game.units.custom.a.f.a;
            if ("NONE".equalsIgnoreCase(string5)) continue;
            l2.gh.add((Object)d2);
        }
    }

    public static void a(com.corrodinggames.rts.game.units.custom.l l2, com.corrodinggames.rts.gameFramework.utility.ab ab2, String string2, String string3, String string4, boolean bl2, boolean bl3) {
        com.corrodinggames.rts.game.units.custom.a.d d2 = new com.corrodinggames.rts.game.units.custom.a.d();
        String string5 = ab2.b(string2, string3 + "convertTo", (String)null);
        String string6 = ab2.b(string2, string3 + "whenBuilding_temporarilyConvertTo", (String)null);
        at[] atArray = as.a(ab2, string2, string3 + "whenBuilding_temporarilyConvertTo_keepFields", null);
        Float f2 = ab2.a(string2, string3 + "addEnergy", (Float)null);
        com.corrodinggames.rts.game.units.custom.d.b b2 = com.corrodinggames.rts.game.units.custom.d.b.a(l2, ab2, string2, string3 + "addResources", true);
        l2.a(b2);
        com.corrodinggames.rts.game.units.custom.d.b b3 = com.corrodinggames.rts.game.units.custom.d.b.a(l2, ab2, string2, string3 + "addResourcesScaledByAIHandicaps", true);
        l2.a(b3);
        String string7 = ab2.b(string2, string3 + "fireTurretXAtGround", (String)null);
        LogicBoolean logicBoolean = ab2.b(l2, string2, string3 + "alsoTriggerOrQueueActionWithTarget", null);
        LogicBoolean logicBoolean2 = ab2.a(l2, string2, string3 + "alsoTriggerOrQueueActionConditional", (LogicBoolean)null);
        String string8 = ab2.b(string2, string3 + "alsoTriggerAction", (String)null);
        LogicBoolean logicBoolean3 = ab2.c(l2, string2, string3 + "alsoTriggerActionRepeat", null);
        Object var19_19 = null;
        String string9 = ab2.b(string2, string3 + "alsoQueueAction", (String)null);
        String string10 = ab2.b(string2, string3 + "spawnEffects", (String)null);
        String string11 = ab2.b(string2, string3 + "spawnEffectsOnQueue", (String)null);
        String string12 = ab2.b(string2, string3 + "playSoundAtUnit", (String)null);
        String string13 = ab2.b(string2, string3 + "playSoundGlobally", (String)null);
        String string14 = ab2.b(string2, string3 + "playSoundToPlayer", (String)null);
        String string15 = ab2.b(string2, string3 + "playSoundToPlayerOnQueue", (String)null);
        com.corrodinggames.rts.game.units.custom.a.a.o.a(l2, ab2, string2, string3, d2, string4, bl2);
        com.corrodinggames.rts.game.units.custom.a.a.e.a(l2, ab2, string2, string3, d2, string4, bl2);
        com.corrodinggames.rts.game.units.custom.a.a.h.a(l2, ab2, string2, string3, d2, string4, bl2);
        com.corrodinggames.rts.game.units.custom.a.a.a.a(l2, ab2, string2, string3, d2, string4, bl2);
        com.corrodinggames.rts.game.units.custom.a.a.k.a(l2, ab2, string2, string3, d2, string4, bl2);
        com.corrodinggames.rts.game.units.custom.a.a.b.a(l2, ab2, string2, string3, d2, string4, bl2);
        com.corrodinggames.rts.game.units.custom.a.a.d.a(l2, ab2, string2, string3, d2, string4, bl2);
        com.corrodinggames.rts.game.units.custom.a.a.l.a(l2, ab2, string2, string3, d2, string4, bl2);
        com.corrodinggames.rts.game.units.custom.a.a.g.a(l2, ab2, string2, string3, d2, string4, bl2);
        com.corrodinggames.rts.game.units.custom.a.a.m.a(l2, ab2, string2, string3, d2, string4, bl2);
        com.corrodinggames.rts.game.units.custom.a.a.f.a(l2, ab2, string2, string3, d2, string4, bl2);
        com.corrodinggames.rts.game.units.custom.a.a.j.a(l2, ab2, string2, string3, d2, string4, bl2);
        com.corrodinggames.rts.game.units.custom.a.a.i.a(l2, ab2, string2, string3, d2, string4, bl2);
        LogicBoolean logicBoolean4 = ab2.a(l2, string2, string3 + "resetCustomTimer", (LogicBoolean)null);
        boolean bl4 = false;
        if (bl2) {
            bl4 = true;
        } else {
            if (string5 != null || string6 != null || f2 != null || string7 != null) {
                bl4 = true;
            }
            if (b2.d() || b3.d()) {
                bl4 = true;
            }
            if (string8 != null || string9 != null || string10 != null || var19_19 != null) {
                bl4 = true;
            }
            if (string12 != null || string13 != null || string14 != null || string15 != null) {
                bl4 = true;
            }
            if (d2.ac.size() > 0) {
                bl4 = true;
            }
        }
        if (bl4) {
            Object object;
            Object object2;
            Object object32;
            Object object4;
            bn bn2;
            String string16;
            String string17;
            if ("NONE".equalsIgnoreCase(string5)) {
                string5 = null;
            }
            if ("NONE".equalsIgnoreCase(string6)) {
                string6 = null;
            }
            if (string7 != null && string7.equalsIgnoreCase("NONE")) {
                string7 = null;
            }
            d2.a = l2.gh.size();
            String string18 = ab2.b(string2, string3 + "id", (String)null);
            if (string18 != null) {
                d2.b = "c" + string18;
                if (d2.b.contains((CharSequence)" ")) {
                    throw new RuntimeException("[" + string2 + "]id cannot contain space");
                }
                if (d2.b.contains((CharSequence)",")) {
                    throw new RuntimeException("[" + string2 + "]id cannot contain ,");
                }
                if (d2.b.contains((CharSequence)":")) {
                    throw new RuntimeException("[" + string2 + "]id cannot contain :");
                }
                if (d2.b.contains((CharSequence)"(")) {
                    throw new RuntimeException("[" + string2 + "]id cannot contain (");
                }
                if (d2.b.contains((CharSequence)" ")) {
                    throw new RuntimeException("[" + string2 + "]id cannot contain null");
                }
                if (d2.b.length() > 15) {
                    throw new RuntimeException("[" + string2 + "]id cannot be longer than 15 characters");
                }
                for (com.corrodinggames.rts.game.units.custom.a.d d3 : l2.gh) {
                    if (!d2.b.equalsIgnoreCase(d3.b)) continue;
                    throw new RuntimeException("[" + string2 + "]id more than one action exists with id: " + string18);
                }
            }
            d2.c = string4;
            d2.o = ab2.a(string2, string3 + "extraLagHidingInUI", (Boolean)false);
            d2.s = com.corrodinggames.rts.game.units.custom.g.a(ab2.b(string2, string3 + "tags", (String)null));
            d2.p = ab2.a(string2, string3 + "pos", Float.valueOf((float)999.0f)).floatValue();
            d2.q = com.corrodinggames.rts.game.units.custom.d.b.a(l2, ab2, string2, string3 + "price", true);
            d2.r = com.corrodinggames.rts.game.units.custom.d.b.b(l2, ab2, string2, string3 + "streamingCost", null);
            boolean bl5 = ab2.a(string2, string3 + "switchPriceWithStreamingCost", (Boolean)false);
            if (bl5) {
                if (d2.r != null) {
                    throw new RuntimeException("[" + string2 + "]streamingCost and switchPriceWithStreamingCost=true cannot be used at the same time");
                }
                d2.r = com.corrodinggames.rts.game.units.custom.d.b.b(l2, ab2, string2, string3 + "price", null);
                d2.q = com.corrodinggames.rts.game.units.custom.d.b.a;
            }
            l2.a(d2.q);
            if (d2.r != null) {
                l2.a(d2.r);
            }
            d2.K = ab2.a(string2, string3 + "highPriorityQueue", (Boolean)false);
            d2.L = ab2.a(string2, string3 + "onlyOneUnitAtATime", (Boolean)false);
            d2.M = ab2.a(string2, string3 + "canPlayerCancel", (Boolean)true);
            d2.O = ab2.a(string2, string3 + "alwaysSinglePress", (Boolean)false);
            d2.N = ab2.a(string2, string3 + "allowMultipleInQueue", (Boolean)true);
            if (!d2.M && !d2.N && d2.O) {
                d2.P = true;
            }
            d2.j = !d2.M ? com.corrodinggames.rts.game.units.a.u.a : com.corrodinggames.rts.game.units.a.u.c;
            d2.t = ab2.a(l2, string2, string3 + "requireConditional", (LogicBoolean)null);
            d2.u = ab2.a(l2, string2, string3 + "isActive", (LogicBoolean)null);
            d2.v = ab2.a(l2, string2, string3 + "isVisible", (LogicBoolean)null);
            d2.x = ab2.a(string2, string3 + "isAlsoViewableByEnemies", (Boolean)false);
            d2.w = ab2.a(string2, string3 + "isAlsoViewableByAllies", (Boolean)d2.x);
            if (bl3) {
                if (d2.v != null && !LogicBoolean.isStaticFalse(d2.v)) {
                    throw new RuntimeException("[" + string2 + "]isVisible doesn't make sense to use in hidden actions");
                }
                d2.v = LogicBoolean.falseBoolean;
            }
            d2.z = ab2.a(l2, string2, string3 + "isLocked", (LogicBoolean)null);
            d2.A = ag.a(l2, ab2, string2, string3 + "isLockedMessage", null);
            if (d2.z != null) {
                d2.y = true;
            }
            if (d2.z == LogicBoolean.falseBoolean) {
                d2.z = null;
            }
            d2.B = ab2.a(l2, string2, string3 + "isLockedAlt", (LogicBoolean)null);
            d2.C = ag.a(l2, ab2, string2, string3 + "isLockedAltMessage", null);
            if (d2.B != null) {
                d2.y = true;
            }
            if (d2.B == LogicBoolean.falseBoolean) {
                d2.B = null;
            }
            d2.D = ab2.a(l2, string2, string3 + "isLockedAlt2", (LogicBoolean)null);
            d2.E = ag.a(l2, ab2, string2, string3 + "isLockedAlt2Message", null);
            if (d2.D != null) {
                d2.y = true;
            }
            if (d2.D == LogicBoolean.falseBoolean) {
                d2.D = null;
            }
            d2.F = LogicBoolean.create(l2, ab2.b(string2, string3 + "ai_isHighPriority", (String)null), null);
            if (d2.F == LogicBoolean.falseBoolean) {
                d2.F = null;
            }
            if (d2.F != null) {
                l2.fJ = true;
            }
            d2.G = ab2.a(l2, string2, string3 + "ai_isDisabled", LogicBoolean.falseBoolean);
            d2.aN = (com.corrodinggames.rts.game.units.custom.a.e)ab2.a(string2, string3 + "aiUse", d2.aN, com.corrodinggames.rts.game.units.custom.a.e.class);
            d2.J = l2.a(ab2.b(string2, string3 + "guiBuildUnit", (String)null), string3 + "guiBuildUnit", string2);
            if (d2.J != null) {
                d2.j = com.corrodinggames.rts.game.units.a.u.b;
                if (string5 != null) {
                    throw new RuntimeException("[" + string2 + "]guiBuildUnit and convertTo cannot currently be used the same action");
                }
            }
            d2.I = l2.a(ab2.b(string2, string3 + "ai_considerSameAsBuilding", (String)null), string3 + "ai_considerSameAsBuilding", string2);
            d2.aF = ab2.a(l2, string2, string3 + "isGuiBlinking", (LogicBoolean)null);
            d2.ay = ag.a(l2.F, ab2.b(string2, string3 + "iconImage", "NONE"), l2.ab, l2, string2, string3 + "iconImage");
            d2.aB = ab2.a(l2, string2, string3 + "iconExtraIsVisible", (LogicBoolean)null);
            if (d2.aB == LogicBoolean.trueBoolean) {
                d2.aB = null;
            }
            d2.az = l2.a(ab2, string2, string3 + "iconExtraImage");
            d2.aA = ab2.a(string2, string3 + "iconExtraColor", (Integer)Color.a(100, 255, 255, 255));
            d2.aC = UnitReference.parseUnitTypeOrReferenceFromConf(l2, ab2, string2, string3 + "unitShownInUI", null);
            if (d2.aC != null && d2.ay != null) {
                throw new RuntimeException("[" + string2 + "]unitShownInUI and iconImage: doesn't make sense to use both at the same time");
            }
            d2.aD = ab2.a(string2, string3 + "unitShownInUIWithHpBar", (Boolean)true);
            d2.aE = ab2.a(string2, string3 + "unitShownInUIWithProgressBar", (Boolean)true);
            d2.aG = (com.corrodinggames.rts.game.units.a.t)ab2.a(string2, string3 + "displayType", d2.aG, com.corrodinggames.rts.game.units.a.t.class);
            d2.aI = ab2.a(string2, string3 + "displayRemainingStockpile", (Boolean)false);
            d2.d = ag.a(l2, ab2, string2, string3 + "text", "");
            d2.e = UnitReference.parseUnitTypeOrReferenceFromConf(l2, ab2, string2, string3 + "textAddUnitName", null);
            d2.h = ag.a(ab2, string2, string3 + "textPostFix", null);
            d2.f = UnitReference.parseUnitTypeOrReferenceFromConf(l2, ab2, string2, string3 + "descriptionAddFromUnit", null);
            d2.g = UnitReference.parseUnitTypeOrReferenceFromConf(l2, ab2, string2, string3 + "descriptionAddUnitStats", null);
            d2.i = ag.a(l2, ab2, string2, string3 + "description", "");
            d2.S = ab2.d(string2, string3 + "buildSpeed", Float.valueOf((float)d2.S)).floatValue();
            if (d2.S == 0.0f) {
                d2.S = 50.0f;
            }
            d2.T = ab2.a(string2, string3 + "buildSpeed_ignoreFactorySpeedModifiers", (Boolean)d2.T);
            boolean bl6 = false;
            d2.U = ab2.a(string2, string3 + "whenBuilding_cannotMove", (Boolean)d2.U);
            d2.V = l2.a(ab2.b(string2, string3 + "whenBuilding_playAnimation", (String)null), d2.V);
            d2.W = ab2.a(string2, string3 + "whenBuilding_rotateTo", d2.W);
            d2.X = ab2.a(string2, string3 + "whenBuilding_rotateTo_orBackwards", (Boolean)d2.X);
            d2.Y = ab2.a(string2, string3 + "whenBuilding_rotateTo_waitTillRotated", (Boolean)d2.Y);
            d2.Z = ab2.a(string2, string3 + "whenBuilding_rotateTo_aimAtActionTarget", (Boolean)d2.Z);
            String string19 = ab2.b(string2, string3 + "whenBuilding_rotateTo_rotateTurretX", (String)null);
            if (string19 != null) {
                d2.aa = l2.e(string19);
                if (d2.aa == null) {
                    throw new RuntimeException("Cannot find turret:" + string19 + " for [" + string2 + "]" + string3 + "whenBuilding_rotateTo_rotateTurretX");
                }
                if (d2.X) {
                    throw new RuntimeException("whenBuilding_rotateTo_orBackwards:true not supported with [" + string2 + "]" + string3 + "whenBuilding_rotateTo_rotateTurretX");
                }
            }
            if (d2.Z && d2.W == null) {
                d2.W = Float.valueOf((float)0.0f);
            }
            d2.ab = ab2.a(l2, string2, string3 + "whenBuilding_triggerAction", (u)null);
            d2.Q = ab2.a(string2, string3 + "convertTo_keepCurrentTags", (Boolean)d2.Q);
            d2.R = as.a(ab2, string2, string3 + "convertTo_keepCurrentFields", null);
            if (string6 != null && !"NONE".equalsIgnoreCase(string6)) {
                d2.l = l2.a(string6, string3 + "whenBuilding_temporarilyConvertTo", string2);
                d2.m = atArray;
                bl6 = true;
            }
            if (d2.U || d2.V != null || d2.W != null || d2.l != null || d2.ab != null) {
                l2.bg = true;
            }
            d2.aM = com.corrodinggames.rts.game.units.custom.a.f.b;
            if (string5 != null && !"NONE".equalsIgnoreCase(string5)) {
                d2.H = l2.a(string5, string3 + "convertTo", string2);
                d2.k = string5;
                d2.N = false;
                bl6 = true;
            }
            if (f2 != null) {
                d2.ad = f2;
                bl6 = true;
            }
            if (b2 != null && b2.d()) {
                d2.ae = b2;
                bl6 = true;
            }
            if (b3 != null && b3.d()) {
                d2.af = b3;
                bl6 = true;
            }
            d2.ah = ab2.a(string2, string3 + "fireTurretXAtGround_withOffset", (PointF)null);
            d2.ai = ab2.b(l2, string2, string3 + "fireTurretXAtGround_withTarget", null);
            d2.ak = ab2.b(string2, string3 + "fireTurretXAtGround_count", 1);
            d2.am = com.corrodinggames.rts.game.units.custom.b.c.a(l2, ab2.b(string2, "fireTurretXAtGround_showGuideDecals", (String)null));
            if (d2.ai != null && d2.ah == null) {
                d2.ah = new PointF(0.0f, 0.0f);
            }
            if ((string17 = ab2.b(string2, string3 + "fireTurretXAtGround_withProjectile", (String)null)) != null) {
                d2.aj = l2.f(string17);
                if (d2.aj == null) {
                    throw new RuntimeException("Cannot find projectile:" + string17 + " for [" + string2 + "]" + string3 + "fireTurretXAtGround_withProjectile");
                }
            }
            if ((string16 = ab2.b(string2, string3 + "fireTurretXAtGround_onlyOverPassableTileOf", (String)null)) != null) {
                d2.al = ao.a(string16, string3 + "fireTurretXAtGround_overPassableTileOf");
            }
            if (string7 != null) {
                bn2 = l2.e(string7);
                if (bn2 == null) {
                    throw new RuntimeException("Cannot find turret:" + string7 + " for [" + string2 + "]" + string3 + "fireTurretXAtGround");
                }
                d2.ag = bn2.e;
                if (d2.ah == null) {
                    d2.j = com.corrodinggames.rts.game.units.a.u.g;
                    if (d2.J != null) {
                        throw new RuntimeException("[" + string2 + "]guiBuildUnit and fireTurretXAtGround (without withOffset) cannot be used in the same action");
                    }
                }
                bl6 = true;
            }
            d2.an = logicBoolean;
            d2.ao = logicBoolean2;
            if (string8 != null && !"NONE".equalsIgnoreCase(string8)) {
                d2.ap = l2.c(string8, "alsoTriggerAction", string2);
                if (logicBoolean3 != null) {
                    if (LogicBoolean.isStaticNumber(logicBoolean3)) {
                        float f3 = LogicBoolean.getKnownStaticNumber(logicBoolean3);
                        if (f3 == 0.0f) {
                            d2.ap = null;
                        } else if (f3 != 1.0f) {
                            d2.ar = logicBoolean3;
                        }
                    } else {
                        d2.ar = logicBoolean3;
                    }
                }
                bl6 = true;
            }
            if (string9 != null && !"NONE".equalsIgnoreCase(string9)) {
                d2.aq = l2.c(string9, "alsoQueueAction", string2);
                bl6 = true;
            }
            if (string10 != null) {
                d2.as = l2.a(string10, (z)null);
                bl6 = true;
            }
            if (string11 != null) {
                d2.at = l2.a(string11, (z)null);
                bl6 = true;
            }
            if (string12 != null) {
                d2.au = bl.a(l2, string12);
                bl6 = true;
            }
            if (string13 != null) {
                d2.av = bl.a(l2, string13);
                bl6 = true;
            }
            if (string14 != null) {
                d2.aw = bl.a(l2, string14);
                bl6 = true;
            }
            if (string15 != null) {
                d2.ax = bl.a(l2, string15);
                bl6 = true;
            }
            if (logicBoolean4 != null) {
                d2.aH = logicBoolean4;
                bl6 = true;
            }
            if (d2.ac.size() > 0) {
                bl6 = true;
            }
            bn2 = null;
            String string20 = ab2.b(string2, string3 + "autoTriggerOnEvent", (String)null);
            Integer n2 = ab2.b(string2, string3 + "autoTriggerOnEventRecursionLimit", (Integer)null);
            if (n2 != null) {
                if (n2 < 0) {
                    throw new bo("[" + string2 + "]" + string3 + "autoTriggerOnEventRecursionLimit: Cannot be < 0");
                }
                if (n2 > 50) {
                    throw new bo("[" + string2 + "]" + string3 + "autoTriggerOnEventRecursionLimit: Cannot be > 100");
                }
            }
            if (string20 != null && (object4 = ag.a(string2, string3 + "autoTriggerOnEvent", string20)) != null) {
                if (object4.size() < 1) {
                    throw new bo("[" + string2 + "]" + string3 + "autoTriggerOnEvent: Expected 1 or more options, got:" + object4.size());
                }
                for (Object object32 : object4) {
                    try {
                        object2 = (af)com.corrodinggames.rts.gameFramework.utility.ab.a(object32.a, null, af.class);
                    }
                    catch (bo bo2) {
                        throw new bo("[" + string2 + "]" + string3 + "autoTriggerOnEvent: " + bo2.getMessage(), bo2);
                    }
                    if (bn2 == null) {
                        bn2 = new ArrayList();
                    }
                    object = new ae();
                    ((ae)object).a = object2;
                    if (n2 != null) {
                        ((ae)object).e = n2;
                    } else if (((ae)object).a == af.q) {
                        ((ae)object).e = 4;
                    }
                    if (object32.b != null) {
                        for (Object object5 : object32.b.keySet()) {
                            String string21 = (String)object32.b.get(object5);
                            boolean bl7 = false;
                            if (object5.equalsIgnoreCase("withtag")) {
                                if (((ae)object).a != af.n && ((ae)object).a != af.q) {
                                    throw new bo("[" + string2 + "]" + string3 + "autoTriggerOnEvent: " + ((ae)object).a.name() + " doesn't support parameter: " + (String)object5);
                                }
                                bl7 = true;
                            }
                            if (object5.equalsIgnoreCase("withprojectiletag")) {
                                if (((ae)object).a != af.n) {
                                    throw new bo("[" + string2 + "]" + string3 + "autoTriggerOnEvent: " + ((ae)object).a.name() + " doesn't support parameter: " + (String)object5);
                                }
                                bl7 = true;
                            }
                            if (object5.equalsIgnoreCase("withactiontag")) {
                                if (((ae)object).a != af.f && ((ae)object).a != af.g) {
                                    throw new bo("[" + string2 + "]" + string3 + "autoTriggerOnEvent: " + ((ae)object).a.name() + " doesn't support parameter: " + (String)object5);
                                }
                                bl7 = true;
                            }
                            if (bl7) {
                                String string22 = com.corrodinggames.rts.gameFramework.f.p(string21);
                                if (string22 == null) {
                                    throw new bo("[" + string2 + "]" + string3 + "autoTriggerOnEvent: " + ((ae)object).a.name() + " expected quoted string, got: " + string21);
                                }
                                if (((ae)object).d != null) {
                                    throw new bo("[" + string2 + "]" + string3 + "autoTriggerOnEvent: " + ((ae)object).a.name() + " tag was set twice");
                                }
                                ((ae)object).d = com.corrodinggames.rts.gameFramework.utility.ab.j(string2, string3 + "autoTriggerOnEvent", string22);
                                continue;
                            }
                            throw new bo("[" + string2 + "]" + string3 + "autoTriggerOnEvent: Unknown parameter: " + (String)object5);
                        }
                    }
                    bn2.add(object);
                }
            }
            object4 = ab2.a(l2, string2, string3 + "autoTrigger", (LogicBoolean)null);
            Object object6 = ab2.b(string2, string3 + "autoTrigger", (String)null);
            object32 = (s)ab2.a(string2, string3 + "autoTriggerCheckRate", l2.cb, s.class);
            d2.n = bl6;
            if (bl6 || d2.v != null) {
                if (object4 != null && bl6) {
                    object2 = new r();
                    ((r)object2).a = object4;
                    ((r)object2).b = object6;
                    ((r)object2).c = object32;
                    ((r)object2).d = new com.corrodinggames.rts.game.units.custom.a.g(d2, l2.a(d2.k, "[" + string2 + "]" + string3, string2));
                    l2.fW.add(object2);
                }
                if (bn2 != null && bl6) {
                    object2 = new com.corrodinggames.rts.game.units.custom.a.g(d2, l2.a(d2.k, "[" + string2 + "]" + string3, string2));
                    object = l2;
                    Iterator iterator = bn2.iterator();
                    while (iterator.hasNext()) {
                        Object object5;
                        object5 = (ae)iterator.next();
                        ((ae)object5).b = object2;
                        ((ae)object5).c = object;
                        l2.gq.add(object5);
                    }
                }
                if (d2.k != null && d2.q != null && d2.q.b > 0) {
                    l2.gi = true;
                }
                l2.gh.add((Object)d2);
            }
        }
    }

    public static String a(com.corrodinggames.rts.game.units.custom.l l2, String string2, String string3) {
        if (string3.startsWith("SHARED:")) {
            string3 = string3.substring("SHARED:".length());
            string2 = "units/shared/common.ini";
        }
        if (string3.startsWith("CORE:")) {
            string3 = string3.substring("CORE:".length());
            string2 = "units/common.ini";
        }
        if (string3.startsWith("ROOT:")) {
            string3 = string3.substring("ROOT:".length());
            string2 = l2.J == null ? "units/common.ini" : l2.J.q + "/common.ini";
        }
        String string4 = com.corrodinggames.rts.gameFramework.f.h(string2) + "/";
        while (string3.startsWith("/") || string3.startsWith("\\")) {
            string3 = string3.substring(1);
        }
        String string5 = string4 + string3;
        return string5;
    }

    public static void a(long l2, ah ah2) {
        double d2 = br.a(l2);
        ah2.o += d2;
    }

    public static void i() {
        com.corrodinggames.rts.gameFramework.l.e("==Timing==");
        for (ah ah2 : ah.values()) {
            com.corrodinggames.rts.gameFramework.l.e(ah2.name() + ": " + br.a(ah2.o));
        }
    }

    public static void j() {
        for (ah ah2 : ah.values()) {
            ah2.o = 0.0;
        }
    }

    public static com.corrodinggames.rts.gameFramework.m.e a(String string2, String string3, boolean bl2, com.corrodinggames.rts.game.units.custom.l l2, String string4, String string5) {
        try {
            return ag.a(string2, string3, bl2, l2);
        }
        catch (RuntimeException runtimeException) {
            runtimeException.printStackTrace();
            throw new RuntimeException("[" + string4 + "]" + string5 + ": " + runtimeException.getMessage(), (Throwable)runtimeException);
        }
    }

    public static com.corrodinggames.rts.gameFramework.m.e a(String string2, String string3, boolean bl2, com.corrodinggames.rts.game.units.custom.l l2) {
        long l3 = br.a();
        com.corrodinggames.rts.gameFramework.m.e e2 = ag.b(string2, string3, bl2, l2);
        ag.a(l3, ah.b);
        return e2;
    }

    public static com.corrodinggames.rts.gameFramework.m.e b(String string2, String string3, boolean bl2, com.corrodinggames.rts.game.units.custom.l l2) {
        com.corrodinggames.rts.gameFramework.m.e e2;
        if (string3 == null) {
            return null;
        }
        if (string3.equalsIgnoreCase("NONE")) {
            return null;
        }
        if (string3.equals((Object)"")) {
            return null;
        }
        boolean bl3 = false;
        if (string3.startsWith("SHADOW:")) {
            string3 = string3.substring("SHADOW:".length());
            bl3 = true;
        }
        if (string3.startsWith("SHARED:")) {
            string3 = string3.substring("SHARED:".length());
            string2 = "units/shared/common.ini";
        }
        if (string3.startsWith("CORE:")) {
            string3 = string3.substring("CORE:".length());
            string2 = "units/common.ini";
        }
        if (string3.startsWith("ROOT:")) {
            string3 = string3.substring("ROOT:".length());
            string2 = l2.J == null ? "units/common.ini" : l2.J.q + "/common.ini";
        }
        if (string3.startsWith("SHADOW:")) {
            string3 = string3.substring("SHADOW:".length());
            bl3 = true;
        }
        com.corrodinggames.rts.gameFramework.l l3 = com.corrodinggames.rts.gameFramework.l.B();
        String string4 = com.corrodinggames.rts.gameFramework.f.h(string2) + "/";
        String string5 = "[" + bl2 + "," + bl3 + "]" + string4 + string3;
        com.corrodinggames.rts.gameFramework.m.e e3 = ag.c(string5);
        if (e3 != null) {
            return e3;
        }
        com.corrodinggames.rts.gameFramework.utility.j j2 = ag.c(string4, string3, l2);
        int n2 = 0;
        if (e != null) {
            n2 = ag.e.I;
        }
        if (n2 > 5) {
            com.corrodinggames.rts.gameFramework.l.e("Fast failing to oom image for this mod");
            e2 = l3.bO.r();
        } else {
            long l4 = br.a();
            try {
                e2 = l3.bO.a(j2, true);
            }
            catch (RuntimeException runtimeException) {
                com.corrodinggames.rts.gameFramework.l.e("imageStream:" + (Object)((Object)j2));
                throw new RuntimeException("Error decode image from: " + com.corrodinggames.rts.gameFramework.e.a.d(string4 + string3), (Throwable)runtimeException);
            }
            ag.a(l4, ah.a);
            if (e2.A()) {
                com.corrodinggames.rts.gameFramework.l.e("oomErrors:" + l);
                ++l;
                if (e != null) {
                    ++ag.e.I;
                    ++ag.e.J;
                }
            } else if (e != null && !ag.e.z && com.corrodinggames.rts.gameFramework.l.aZ) {
                e2.z();
            }
        }
        try {
            j2.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        if (e2 == null) {
            throw new RuntimeException("Failed to decode image: " + com.corrodinggames.rts.gameFramework.e.a.e(string4 + string3));
        }
        e2.a(bl2);
        if (bl3) {
            com.corrodinggames.rts.gameFramework.m.e e4 = e2;
            e2 = am.a(e4, e2.p, e2.q);
        }
        ag.a(e2);
        ag.a(string5, e2);
        return e2;
    }

    public static void a(String string2, com.corrodinggames.rts.gameFramework.m.e e2) {
        g.put((Object)string2, (Object)e2);
    }

    public static com.corrodinggames.rts.gameFramework.m.e c(String string2) {
        com.corrodinggames.rts.gameFramework.m.e e2 = (com.corrodinggames.rts.gameFramework.m.e)g.get((Object)string2);
        if (e2 != null) {
            ++j;
            ag.a(e2);
            e2.t();
            return e2;
        }
        if (k) {
            com.corrodinggames.rts.gameFramework.l.e("loadImageInConf: cache miss: " + string2);
        }
        ++i;
        return null;
    }

    public static com.corrodinggames.rts.gameFramework.a.i a(String string2, String string3, com.corrodinggames.rts.game.units.custom.l l2) {
        long l3 = br.a();
        com.corrodinggames.rts.gameFramework.a.i i2 = ag.b(string2, string3, l2);
        ag.a(l3, ah.d);
        return i2;
    }

    public static com.corrodinggames.rts.gameFramework.a.i b(String string2, String string3, com.corrodinggames.rts.game.units.custom.l l2) {
        if (string3 == null) {
            return null;
        }
        if (string3.equalsIgnoreCase("NONE")) {
            return null;
        }
        com.corrodinggames.rts.gameFramework.l l3 = com.corrodinggames.rts.gameFramework.l.B();
        if (!string3.contains((CharSequence)".")) {
            com.corrodinggames.rts.gameFramework.a.i i2 = l3.bM.a(string3);
            return i2;
        }
        if (string3.startsWith("ROOT:")) {
            string3 = string3.substring("ROOT:".length());
            string2 = l2.J == null ? "units/common.ini" : l2.J.q + "/common.ini";
        }
        if (string3.startsWith("CORE:")) {
            string3 = string3.substring("CORE:".length());
            string2 = "units/common.ini";
        }
        if (string3.startsWith("SHARED:")) {
            string3 = string3.substring("SHARED:".length());
            string2 = "units/shared/common.ini";
        }
        boolean bl2 = false;
        String string4 = com.corrodinggames.rts.gameFramework.f.h(string2) + "/";
        String string5 = string4 + string3;
        com.corrodinggames.rts.gameFramework.a.i i3 = (com.corrodinggames.rts.gameFramework.a.i)h.get((Object)string5);
        if (i3 != null) {
            ag.a(i3);
            return i3;
        }
        if (!string3.toLowerCase(Locale.ROOT).endsWith(".ogg") && !string3.toLowerCase(Locale.ROOT).endsWith(".wav")) {
            throw new RuntimeException("Failed to open sound: " + string4 + "" + string3 + " only the ogg & wav sound formats are supported.");
        }
        com.corrodinggames.rts.gameFramework.utility.j j2 = ag.c(string4, string3, l2);
        long l4 = br.a();
        com.corrodinggames.rts.gameFramework.a.i i4 = l3.bM.a(string3, j2, bl2);
        try {
            j2.close();
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        ag.a(l4, ah.c);
        if (i4 == null) {
            boolean bl3 = string3.toLowerCase(Locale.ROOT).endsWith(".ogg");
            String string6 = "Sound file found but failed to load: " + string5;
            if (bl3) {
                string6 = string6 + " - Check if this file is truly a ogg";
            }
            l2.r(string6);
            return l3.bM.b("Failed to load");
        }
        ag.a(i4);
        h.put((Object)string5, (Object)i4);
        return i4;
    }

    public static boolean a(String string2, String string3, String string4, com.corrodinggames.rts.gameFramework.i.b b2) {
        String string5;
        if (string3 == null) {
            return true;
        }
        if (!string3.contains((CharSequence)"..")) {
            return true;
        }
        if (com.corrodinggames.rts.gameFramework.l.at()) {
            return true;
        }
        File file = new File(com.corrodinggames.rts.gameFramework.e.a.e(string4));
        String string6 = file.getCanonicalPath();
        if (string6.startsWith(string5 = new File(com.corrodinggames.rts.gameFramework.e.a.e("units")).getCanonicalPath())) {
            return true;
        }
        String string7 = b2.k();
        boolean bl2 = string6.startsWith(string7);
        if (!bl2) {
            com.corrodinggames.rts.gameFramework.l.b("File: '" + string6 + "' is not within mod: '" + string7 + "'");
        }
        return bl2;
    }

    public static String a(String string2, String string3) {
        if (!string2.endsWith("/")) {
            string2 = string2 + "/";
        }
        while (string3.startsWith("/") || string3.startsWith("\\")) {
            string3 = string3.substring(1);
        }
        return string2 + string3;
    }

    public static com.corrodinggames.rts.gameFramework.utility.j c(String string2, String string3, com.corrodinggames.rts.game.units.custom.l l2) {
        String string4 = ag.a(string2, string3);
        com.corrodinggames.rts.gameFramework.i.b b2 = null;
        if (l2 != null) {
            b2 = l2.J;
        } else {
            com.corrodinggames.rts.gameFramework.l.g("findAssetSteam meta==null");
        }
        try {
            if (b2 != null && !ag.a(string2, string3, string4, b2)) {
                throw new RuntimeException("File is outside mod: " + string4);
            }
        }
        catch (IOException iOException) {
            throw new RuntimeException((Throwable)iOException);
        }
        com.corrodinggames.rts.gameFramework.utility.j j2 = com.corrodinggames.rts.gameFramework.e.a.k(string4);
        if (j2 == null) {
            com.corrodinggames.rts.gameFramework.l.e("Orginal path: " + string4);
            throw new RuntimeException("IO Error: Failed to open: " + ag.a(b2, string4, true));
        }
        return j2;
    }

    public static void b(com.corrodinggames.rts.game.units.custom.l l2) {
        ba[] baArray = l2.ax;
        for (int i2 = 0; i2 < baArray.length; ++i2) {
            int n2;
            ba ba2 = baArray[i2];
            float f2 = -1.0f;
            ba ba3 = null;
            float f3 = 1.0f;
            if (ba2.o) {
                f3 = 0.1f;
            }
            for (int i3 = 0; i3 < baArray.length; ++i3) {
                ba ba4 = baArray[i3];
                if (ba2 == ba4 || ba4.l) continue;
                float f4 = com.corrodinggames.rts.gameFramework.f.a(ba2.d * f3, ba2.e, ba4.d * f3, ba4.e);
                if (ba3 != null && !(f4 < f2)) continue;
                f2 = f4;
                ba3 = ba4;
            }
            f2 = com.corrodinggames.rts.gameFramework.f.a(f2) + 2.0f;
            f2 *= f2;
            ArrayList arrayList = new ArrayList();
            for (n2 = 0; n2 < baArray.length; ++n2) {
                float f5;
                ba ba5 = baArray[n2];
                if (ba2 == ba5 || ba5.l || !((f5 = com.corrodinggames.rts.gameFramework.f.a(ba2.d * f3, ba2.e, ba5.d * f3, ba5.e)) <= f2)) continue;
                arrayList.add((Object)ba5.a);
            }
            ba2.S = new int[arrayList.size()];
            for (n2 = 0; n2 < arrayList.size(); ++n2) {
                ba2.S[n2] = (Integer)arrayList.get(n2);
            }
        }
    }

    public static String k() {
        return "builtin_mods";
    }

    public static String l() {
        return "builtin_mods_enabled";
    }

    public static String m() {
        String string2 = com.corrodinggames.rts.gameFramework.l.aU ? "/SD/mods/units" : "/SD/rustedWarfare/units";
        return string2;
    }

    public static ArrayList a(String string2, String string3, String string4) {
        if (string4 == null || "".equals((Object)string4) || "NONE".equalsIgnoreCase(string4)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = al.a(string4, ",", false);
        for (String string5 : arrayList2) {
            String[] stringArray;
            if ("".equals((Object)(string5 = string5.trim()))) continue;
            String string6 = string5;
            String string7 = null;
            if (string5.contains((CharSequence)"(") && string5.contains((CharSequence)")")) {
                stringArray = al.b(string5, "(");
                if (stringArray == null) {
                    throw new bo("[" + string2 + "]" + string3 + ": Unexpected format for '" + string6 + "' of " + string4);
                }
                string5 = stringArray[0];
                string7 = stringArray[1].trim();
            }
            stringArray = new ai();
            stringArray.a = string5;
            if (string7 != null) {
                if (!string7.endsWith(")")) {
                    throw new bo("[" + string2 + "]" + string3 + ": Expected ')' in '" + string6 + "' of " + string4);
                }
                string7 = string7.substring(0, string7.length() - 1);
                ArrayList arrayList3 = al.a(string7, ",", false, false);
                for (String string8 : arrayList3) {
                    if (string8.trim().equals((Object)"")) continue;
                    String[] stringArray2 = al.b(string8, "=");
                    if (stringArray2 == null) {
                        throw new RuntimeException("[" + string2 + "]" + string3 + ": Unexpected key format for '" + string6 + "' of " + string4);
                    }
                    String string9 = stringArray2[0].trim();
                    String string10 = stringArray2[1].trim();
                    if (stringArray.b == null) {
                        stringArray.b = new HashMap();
                    }
                    stringArray.b.put((Object)string9, (Object)string10);
                }
            }
            arrayList.add((Object)stringArray);
        }
        return arrayList;
    }

    static {
        g = new HashMap();
        h = new HashMap();
        m = new com.corrodinggames.rts.gameFramework.utility.m();
        n = new HashMap();
        o = new Object();
        p = 50.0f;
        q = 50.0f;
        r = null;
        s = null;
    }
}

