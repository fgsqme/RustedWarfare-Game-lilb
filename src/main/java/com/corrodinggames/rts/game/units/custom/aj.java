/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.util.ArrayList
 */
package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.ak;
import com.corrodinggames.rts.game.units.custom.aq;
import com.corrodinggames.rts.game.units.custom.ar;
import com.corrodinggames.rts.game.units.custom.bb;
import com.corrodinggames.rts.game.units.custom.bc;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.h.a;
import java.util.ArrayList;

public class aj {
    public static final aj a = aj.a("");
    public ak[] b;
    public bc[] c;
    public String d;
    public int e = -1;
    public String f;
    public String g;
    l h;

    public static aj a(String string2) {
        aj aj2 = new aj();
        ArrayList arrayList = new ArrayList();
        bc bc2 = new bc();
        bc2.a = null;
        bc2.b = string2;
        arrayList.add((Object)bc2);
        aj2.c = (bc[])arrayList.toArray((Object[])new bc[0]);
        aj2.a();
        return aj2;
    }

    public static aj a(bb bb2) {
        if (bb2 == null) {
            return null;
        }
        aj aj2 = new aj();
        aj2.h = l.b;
        aj2.c = bb2.b;
        aj2.f = bb2.e;
        if (aj2.c != null) {
            for (bc bc2 : aj2.c) {
                if (bc2.b != null && !bc2.b.contains((CharSequence)"%{")) continue;
            }
        }
        aj2.c();
        return aj2;
    }

    public aj() {
    }

    public aj(l l2, bb bb2) {
        this.h = l2;
        this.c = bb2.b;
        this.f = bb2.e;
        if (this.c != null) {
            for (bc bc2 : this.c) {
                if (bc2.b == null || !bc2.b.contains((CharSequence)"%{")) continue;
                this.a(bc2.b, true);
            }
        }
        this.a();
    }

    public void a() {
        this.a(true);
    }

    public void a(boolean bl2) {
        this.c();
        this.b = this.d != null && this.d.contains((CharSequence)"%{") ? this.a(this.d, bl2) : null;
    }

    public ak[] a(String string2, boolean bl2) {
        ArrayList arrayList = new ArrayList();
        int n2 = 0;
        boolean bl3 = false;
        while (true) {
            int n3;
            block7: {
                String string3;
                if (!bl3) {
                    n3 = string2.indexOf("%{", n2);
                    if (n3 == -1) {
                        string3 = string2.substring(n2, string2.length());
                        if (string3.equals((Object)"")) break;
                        arrayList.add((Object)new ar(string3));
                        break;
                    }
                    string3 = string2.substring(n2, n3);
                    if (!string3.equals((Object)"")) {
                        arrayList.add((Object)new ar(string3));
                    }
                    bl3 = true;
                    n2 = n3 + 2;
                    continue;
                }
                n3 = string2.indexOf("}", n2);
                if (n3 == -1) {
                    arrayList.add((Object)new ar("< %{ NOT CLOSED >"));
                    break;
                }
                string3 = string2.substring(n2, n3);
                try {
                    LogicBoolean logicBoolean = LogicBooleanLoader.parseBooleanBlock(this.h, string3, false);
                    arrayList.add((Object)aq.a(logicBoolean));
                }
                catch (RuntimeException runtimeException) {
                    String string4;
                    this.g = string4 = "Error: " + runtimeException.getMessage() + ", [parsing: '" + string3 + "']";
                    arrayList.add((Object)new ar("Error:< " + string4 + " >"));
                    if (!bl2) break block7;
                    throw runtimeException;
                }
            }
            n2 = n3 + 1;
            bl3 = false;
        }
        return (ak[])arrayList.toArray((Object[])new ak[0]);
    }

    public String a(am am2) {
        if (!(am2 instanceof y)) {
            return "<No unit>:" + this.d;
        }
        y y2 = (y)am2;
        StringBuffer stringBuffer = new StringBuffer();
        for (ak ak2 : this.b) {
            stringBuffer.append(ak2.a(y2));
        }
        return stringBuffer.toString();
    }

    public String b(am am2) {
        if (this.e == com.corrodinggames.rts.gameFramework.h.a.c) {
            if (this.b != null) {
                return this.a(am2);
            }
            return this.d;
        }
        this.a(false);
        if (this.b != null) {
            return this.a(am2);
        }
        return this.d;
    }

    public String b() {
        if (this.e == com.corrodinggames.rts.gameFramework.h.a.c) {
            return this.d;
        }
        this.a(false);
        return this.d;
    }

    public void c() {
        if (this.f != null) {
            this.e = com.corrodinggames.rts.gameFramework.h.a.c;
            this.d = com.corrodinggames.rts.gameFramework.h.a.a(this.f, new Object[0]);
            return;
        }
        String string2 = com.corrodinggames.rts.gameFramework.h.a.c();
        for (bc bc2 : this.c) {
            if (!string2.equals((Object)bc2.a)) continue;
            this.e = com.corrodinggames.rts.gameFramework.h.a.c;
            this.d = bc2.b;
            return;
        }
        for (bc bc2 : this.c) {
            if (bc2.a != null) continue;
            this.e = com.corrodinggames.rts.gameFramework.h.a.c;
            this.d = bc2.b;
            return;
        }
        this.e = com.corrodinggames.rts.gameFramework.h.a.c;
        this.d = "<NO DEFAULT TEXT FOUND>";
    }
}

