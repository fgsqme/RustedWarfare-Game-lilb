/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.Iterator
 */
package com.corrodinggames.rts.gameFramework.n;

import android.graphics.Paint;
import android.graphics.Paint$Align;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.n;
import com.corrodinggames.rts.game.units.custom.bb;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.bp;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.n.a;
import com.corrodinggames.rts.gameFramework.n.a.b;
import com.corrodinggames.rts.gameFramework.n.e;
import com.corrodinggames.rts.gameFramework.n.f;
import java.util.Iterator;

public class c {
    public static a a(f f2, com.corrodinggames.rts.game.b.a a2) {
        try {
            String string2;
            e e2;
            String string3;
            l l2 = l.B();
            String string4 = a2.b;
            if (string4 == null) {
                string4 = "NULL";
            }
            if ((string3 = a2.b("id")) != null && !string3.equals((Object)"")) {
                string4 = string3;
            }
            string4 = string4.trim();
            String string5 = a2.d;
            if (string5 != null) {
                e2 = e.a(string5);
                if (e2 == null) {
                    f.c("Error: Unknown type:" + string5 + " found on " + string4);
                    return null;
                }
            } else {
                f.c("Error: no type field set for: " + string4);
                return null;
            }
            a a3 = new a();
            a3.t = a2;
            a3.g = e2;
            a3.b = string4;
            int n2 = 0;
            for (a a4 : f2.J) {
                if (!a4.b.equalsIgnoreCase(a3.b)) continue;
                ++n2;
            }
            a3.c = a3.b;
            if (n2 != 0) {
                a3.c = a3.c + "_" + n2;
            }
            a3.a = a2.b;
            Iterator iterator = a3.d("team");
            if (iterator != null) {
                a3.y = n.k(iterator.intValue());
                if (a3.y == null) {
                    a3.g("Cannot find team:" + iterator);
                    return null;
                }
            }
            a3.r = a3.b("delay", a3.r);
            a3.p = a3.b("repeatDelay", a3.p);
            a3.o = a3.a("repeatCount", a3.o);
            a3.q = a3.b("resetActivationAfter", a3.q);
            a3.d.b = a3.h = a3.a("allToActivate", false);
            a3.s = a3.b("warmup", a3.s);
            a3.A = a3.a("globalMessage", (bb)null);
            a3.w = a3.a("textOffsetX", 0.0f);
            a3.x = a3.a("textOffsetY", 0.0f);
            if (a3.g == e.g || a3.g == e.a) {
                a3.z = a3.a("text", (bb)null);
            }
            if (a3.g == e.g) {
                f2.i = true;
                a3.B = new Paint();
                a3.B.a(true);
                a3.B.a(Paint$Align.b);
                a3.B.a(Typeface.a(Typeface.c, 1));
                int n3 = a3.c("textColor", -1);
                a3.B.b(n3);
                int n4 = a3.a("textSize", 20);
                l2.b(a3.B, (float)n4);
                if (a3.B.f() == 0) {
                    a3.g("Text has an alpha of 0");
                }
                if ((string2 = a3.b("style")) != null && !string2.equals((Object)"")) {
                    if (string2.equalsIgnoreCase("arrow")) {
                        a3.C = true;
                    } else {
                        a3.g("Unknown style: " + string2);
                    }
                }
            }
            if (a3.g == e.e) {
                String string6 = a3.b("spawnUnits");
                String string7 = "<unitAdd>";
                string2 = "spawnUnits";
                try {
                    a3.v = bp.a(string6, string7, string2);
                }
                catch (bo bo2) {
                    f.c(bo2.getMessage());
                    return null;
                }
                if (a3.a() == null) {
                    a3.g("No team set");
                }
            }
            if (a3.g == e.d) {
                a3.a("addTeamTags");
                a3.a("removeTeamTags");
            }
            if (a3.g == e.c) {
                a3.a("add");
                a3.a("set");
            }
            if (a3.g == e.i) {
                a3.a(com.corrodinggames.rts.gameFramework.n.a.c.d(a3));
            }
            if (a3.g == e.j) {
                a3.a(b.d(a3));
            }
            a3.a("comment");
            a3.a("team");
            a3.a("globalMessage");
            a3.a("globalMessage_delayPerChar");
            a3.a("globalMessage_textColor");
            a3.a("debugMessage");
            a3.a("showOnMap");
            a3.a("text");
            a3.a("target");
            a3.a("onlyIfEmpty");
            if (a3.g == e.b) {
                a3.a("unload");
            }
            if (a3.g == e.f) {
                a3.a("onlyIfEmpty");
            }
            return a3;
        }
        catch (RuntimeException runtimeException) {
            throw new com.corrodinggames.rts.game.b.f("Error while reading: " + a2.b(), (Exception)((Object)runtimeException));
        }
    }
}

