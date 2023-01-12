/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 */
package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.ba;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.c;
import com.corrodinggames.rts.game.units.custom.d;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$ReturnType;
import com.corrodinggames.rts.game.units.custom.m;
import com.corrodinggames.rts.game.units.custom.n;
import com.corrodinggames.rts.gameFramework.utility.ab;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class f {
    public String a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    public float h;
    public float i;
    public LogicBoolean j;
    public m k;
    public com.corrodinggames.rts.gameFramework.utility.m l = new com.corrodinggames.rts.gameFramework.utility.m();
    public boolean m = true;
    public float n;
    public boolean o;
    public ArrayList p = new ArrayList();
    public float q;

    public f(String string2) {
        this.a = string2;
    }

    public void a(l l2) {
        Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            c c2 = (c)iterator.next();
            if (c2.a == com.corrodinggames.rts.game.units.custom.d.c || c2.a == com.corrodinggames.rts.game.units.custom.d.d || c2.a == com.corrodinggames.rts.game.units.custom.d.f || c2.a == com.corrodinggames.rts.game.units.custom.d.e || c2.a == com.corrodinggames.rts.game.units.custom.d.j) {
                boolean bl2 = false;
                for (ba ba2 : l2.ax) {
                    if (!c2.c.equals((Object)ba2.b)) continue;
                    c2.b = ba2.a;
                    bl2 = true;
                    break;
                }
                if (!bl2) {
                    throw new bo("Cannot find leg:" + c2.c + " for animation:" + this.a);
                }
            }
            if (c2.b >= 0) continue;
            throw new bo("Cannot find target for:" + c2.c + " for animation:" + this.a);
        }
    }

    public boolean a(n n2) {
        for (n n3 : this.p) {
            if (n3 != n2) continue;
            return true;
        }
        return false;
    }

    public boolean a() {
        return this.o;
    }

    public void a(l l2, ab ab2, String string2, String string3) {
        String string4;
        Object object;
        Object object22;
        boolean bl2 = false;
        String string5 = null;
        String string6 = ab2.b(string2, string3 + "onActions", (String)null);
        if (string6 != null) {
            for (Object object22 : string6.split(",")) {
                if ((object22 = object22.trim()).equals((Object)"")) continue;
                n n2 = com.corrodinggames.rts.game.units.custom.n.a((String)object22);
                if (n2 == null) {
                    throw new bo("Unknown action type: " + (String)object22 + " on animation:" + this.a);
                }
                object = l2.a(n2);
                if (object != null) {
                    throw new bo("Cannot add action: " + (String)object22 + " to:" + this.a + " it already exists on:" + ((f)object).a);
                }
                this.p.add((Object)n2);
            }
        }
        this.q = ab2.a(string2, string3 + "onActionsQueuedUnitPlayAt", Float.valueOf((float)0.0f)).floatValue();
        this.b = ab2.b(string2, string3 + "start", 0);
        this.c = ab2.b(string2, string3 + "end", -1);
        if (this.c != -1 && this.c < this.b) {
            throw new RuntimeException("animationEnd cannot before animationStart on animation:" + this.a);
        }
        this.k = com.corrodinggames.rts.game.units.custom.m.a(l2, ab2, string2, "", true);
        this.h = ab2.d(string2, string3 + "blendIn", Float.valueOf((float)-1.0f)).floatValue();
        this.i = ab2.d(string2, string3 + "blendOut", Float.valueOf((float)-1.0f)).floatValue();
        this.j = ab2.a(l2, string2, string3 + "playbackRate", null, LogicBoolean$ReturnType.number);
        this.d = ab2.a(string2, string3 + "scale_start", Float.valueOf((float)1.0f)).floatValue();
        this.e = ab2.a(string2, string3 + "scale_end", Float.valueOf((float)1.0f)).floatValue();
        Float f2 = ab2.a(string2, string3 + "speed", (Float)null);
        if (f2 != null) {
            this.f = f2.floatValue();
            bl2 = true;
            string5 = "speed";
        } else {
            this.f = 40.0f;
        }
        this.g = ab2.a(string2, string3 + "pingPong", (Boolean)false);
        float f3 = 1.0f * this.f;
        float f4 = ab2.a(string2, string3 + "KeyframeTimeScale", Float.valueOf((float)1.0f)).floatValue();
        if (this.c != -1) {
            bl2 = true;
            string5 = "animationEnd";
            object22 = new c();
            ((c)object22).a = com.corrodinggames.rts.game.units.custom.d.a;
            this.l.add(object22);
            int n3 = this.c - this.b + 1;
            ((c)object22).a(0.0f, this.b);
            ((c)object22).a(f3 *= (float)n3, (float)this.c + 0.99f);
        }
        if (this.d != 1.0f || this.e != 1.0f) {
            bl2 = true;
            string5 = "animationScaleX";
            object22 = new c();
            ((c)object22).a = com.corrodinggames.rts.game.units.custom.d.b;
            this.l.add(object22);
            ((c)object22).a(0.0f, this.d);
            ((c)object22).a(f3, this.e);
        }
        if (bl2) {
            this.n = f3;
        }
        object22 = string3 + "leg";
        String string7 = string3 + "arm";
        object = ab2.f(string2, (String)object22, string7);
        ((com.corrodinggames.rts.gameFramework.utility.m)((Object)object)).addAll((Collection)ab2.k(string2, string3 + "turret"));
        ((com.corrodinggames.rts.gameFramework.utility.m)((Object)object)).addAll((Collection)ab2.k(string2, string3 + "body"));
        ((com.corrodinggames.rts.gameFramework.utility.m)((Object)object)).addAll((Collection)ab2.k(string2, string3 + "effect"));
        Object object3 = ((com.corrodinggames.rts.gameFramework.utility.m)((Object)object)).iterator();
        while (object3.hasNext()) {
            string4 = (String)object3.next();
            boolean bl3 = false;
            if (bl3) continue;
            if (bl2) {
                throw new bo("Cannot mix new (" + string4 + ") and old style (" + string5 + ") animations on:" + this.a);
            }
            this.a(l2, ab2, string2, string3, string4);
        }
        object3 = new com.corrodinggames.rts.gameFramework.utility.m();
        this.m = false;
        string4 = this.l.iterator();
        while (string4.hasNext()) {
            c c2 = (c)string4.next();
            c2.a(f4);
            c2.c();
            if (this.n < c2.d) {
                this.n = c2.d;
            }
            if (c2.e.length <= 0) continue;
            this.o = true;
            if (c2.a != com.corrodinggames.rts.game.units.custom.d.a && c2.a != com.corrodinggames.rts.game.units.custom.d.b) {
                this.m = true;
            }
            ((com.corrodinggames.rts.gameFramework.utility.m)((Object)object3)).add(c2);
        }
        this.l = object3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public c a(String string2, String string3) {
        d d2;
        int n2;
        Object var5_3 = null;
        if (string3.startsWith("leg") || string3.startsWith("arm")) {
            n2 = -1;
            if (string2.equalsIgnoreCase("x")) {
                d2 = com.corrodinggames.rts.game.units.custom.d.c;
            } else if (string2.equalsIgnoreCase("y")) {
                d2 = com.corrodinggames.rts.game.units.custom.d.d;
            } else if (string2.equalsIgnoreCase("dir")) {
                d2 = com.corrodinggames.rts.game.units.custom.d.e;
            } else if (string2.equalsIgnoreCase("height")) {
                d2 = com.corrodinggames.rts.game.units.custom.d.f;
            } else {
                if (!string2.equalsIgnoreCase("alpha")) throw new bo("Unknown leg/arm animation type:" + string2 + " on animation:" + this.a);
                d2 = com.corrodinggames.rts.game.units.custom.d.j;
            }
        } else if (string3.startsWith("turret")) {
            n2 = Integer.parseInt((String)string3.substring("turret".length()));
            --n2;
            if (string2.equalsIgnoreCase("x")) {
                d2 = com.corrodinggames.rts.game.units.custom.d.g;
            } else {
                if (!string2.equalsIgnoreCase("y")) throw new bo("Unknown turret animation type:" + string2 + " on animation:" + this.a);
                d2 = com.corrodinggames.rts.game.units.custom.d.h;
            }
        } else if (string3.startsWith("body")) {
            n2 = 0;
            if (string2.equalsIgnoreCase("scale")) {
                d2 = com.corrodinggames.rts.game.units.custom.d.b;
            } else {
                if (!string2.equalsIgnoreCase("frame")) throw new bo("Unknown body animation type:" + string2 + " on animation:" + this.a);
                d2 = com.corrodinggames.rts.game.units.custom.d.a;
            }
        } else {
            if (!string3.startsWith("effect")) throw new bo("Unknown animation target:" + string3 + " on animation:" + this.a);
            n2 = 0;
            d2 = com.corrodinggames.rts.game.units.custom.d.i;
            string3 = "event";
        }
        Iterator iterator = this.l.iterator();
        while (iterator.hasNext()) {
            c c2 = (c)iterator.next();
            if (c2.a != d2 || !string3.equals((Object)c2.c)) continue;
            return c2;
        }
        c c3 = new c();
        c3.a = d2;
        c3.b = n2;
        c3.c = string3;
        this.l.add(c3);
        return c3;
    }

    public void a(l l2, ab ab2, String string2, String string3, String string4) {
        float f2;
        String string5 = string4.substring(string3.length());
        String string6 = string5.split("_")[0];
        String string7 = string3 + string6 + "_";
        String string8 = string4;
        String string9 = string8.substring(string7.length());
        try {
            f2 = ab.a(string9, false, string2, string8);
        }
        catch (NumberFormatException numberFormatException) {
            throw new bo("Failed to read time:" + string9 + " in key:" + string8 + " section:" + string2 + " expected a float with optional 's' or 'ms' postfix");
        }
        String string10 = ab2.e(string2, string8);
        if (!string10.startsWith("{") || !string10.endsWith("}")) {
            throw new bo("Unknown format:" + string10, string2, string8);
        }
        string10 = string10.substring(1, string10.length() - 1);
        String[] stringArray = string10.split(",");
        c c2 = null;
        for (String string11 : stringArray) {
            String[] stringArray2 = string11.split(":");
            if (stringArray2.length != 2) {
                throw new bo("Unknown format on part:" + string11 + " of: " + string10, string2, string8);
            }
            String string12 = stringArray2[0].trim();
            String string13 = stringArray2[1].trim();
            c c3 = this.a(string12, string6);
            if (c2 != c3) {
                if (c2 != null) {
                    c2.b();
                }
                c2 = c3;
            }
            try {
                c3.a(l2, f2, string12, string13);
            }
            catch (bo bo2) {
                throw new bo(bo2.getMessage() + " (as part of key:" + string8 + " section:" + string2 + ")", bo2);
            }
        }
        if (c2 != null) {
            c2.b();
        }
    }
}

