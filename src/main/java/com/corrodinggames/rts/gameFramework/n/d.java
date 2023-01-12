/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Iterator
 */
package com.corrodinggames.rts.gameFramework.n;

import android.graphics.PointF;
import com.corrodinggames.rts.game.n;
import com.corrodinggames.rts.game.units.a.c;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.h;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.e;
import com.corrodinggames.rts.gameFramework.f.r;
import com.corrodinggames.rts.gameFramework.j.ad;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.n.a;
import com.corrodinggames.rts.gameFramework.n.f;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

public class d {
    public static void a(f f2, a a2) {
        Object object;
        Object object2;
        Object object3;
        boolean bl2;
        Object object4;
        String string2;
        Object object5;
        String string3;
        l l2 = l.B();
        boolean bl3 = false;
        if (!a2.j) {
            bl3 = true;
        }
        f2.a(a2);
        a2.i = true;
        a2.j = true;
        a2.k = l2.by;
        boolean bl4 = false;
        if (a2.A != null) {
            string3 = a2.A.b();
            object5 = l2.bS.h.a(null, string3);
            if (object5 != null) {
                int n2;
                string2 = "globalMessage_delayPerChar";
                object4 = a2.b(string2);
                if (object4 != null) {
                    if (object4.equals((Object)"slow")) {
                        ((com.corrodinggames.rts.gameFramework.f.n)object5).e = 18;
                    } else {
                        n2 = a2.b(string2, -1);
                        if (n2 != -1) {
                            ((com.corrodinggames.rts.gameFramework.f.n)object5).e = n2;
                        }
                    }
                }
                if ((n2 = a2.c("globalMessage_textColor", -1)) != -1) {
                    ((com.corrodinggames.rts.gameFramework.f.n)object5).f = n2;
                }
            }
            bl4 = true;
        }
        if ((string3 = a2.b("debugMessage")) != null) {
            a2.h("Debug: " + string3);
            if (l2.bv && l2.bl) {
                object5 = "Debug: " + string3;
                ad.a(null, (String)object5);
            }
            bl4 = true;
        }
        if (bl2 = a2.a("showOnMap", false)) {
            l2.bW.a(a2.b(), a2.c(), r.d);
            bl4 = true;
        }
        if (a2.f.a > 0) {
            string2 = a2.f.iterator();
            while (string2.hasNext()) {
                object4 = (com.corrodinggames.rts.gameFramework.n.a.a)string2.next();
                if (!((com.corrodinggames.rts.gameFramework.n.a.a)object4).c(a2)) continue;
                bl4 = true;
            }
        }
        if (a2.g == com.corrodinggames.rts.gameFramework.n.e.a) {
            if (bl3) {
                a2.h("objective met");
            }
            bl4 = true;
        }
        if (a2.g == com.corrodinggames.rts.gameFramework.n.e.k) {
            bl4 = true;
        }
        if (a2.g == com.corrodinggames.rts.gameFramework.n.e.i) {
            bl4 = true;
        }
        if (a2.g == com.corrodinggames.rts.gameFramework.n.e.j) {
            bl4 = true;
        }
        if (a2.g == com.corrodinggames.rts.gameFramework.n.e.g) {
            bl4 = true;
        }
        if (a2.g == com.corrodinggames.rts.gameFramework.n.e.h) {
            bl4 = true;
            float f3 = a2.b();
            float f4 = a2.c();
            l2.b(f3, f4);
        }
        if (a2.g == com.corrodinggames.rts.gameFramework.n.e.e) {
            float f5 = a2.b();
            float f6 = a2.c();
            float f7 = 0.0f;
            float f8 = 0.0f;
            object3 = a2.a();
            object2 = null;
            boolean bl5 = false;
            object = null;
            boolean bl6 = false;
            if (object3 == null) {
                a2.g("No team set, cannot spawn");
            } else if (a2.v != null) {
                a2.v.a(f5, f6, f7, f8, (n)object3, bl5, (am)object2, (m)((Object)object), bl6);
            } else {
                a2.g("No valid unit list to spawn");
            }
            bl4 = true;
        }
        if (a2.g == com.corrodinggames.rts.gameFramework.n.e.c) {
            Integer n3;
            n n4 = a2.a();
            if (n4 == null) {
                a2.g("Team not set for changeCredits");
                return;
            }
            object4 = a2.d("set");
            if (object4 != null) {
                n4.o = object4.intValue();
            }
            if ((n3 = a2.d("add")) != null) {
                n4.d(n3.intValue());
            }
            bl4 = true;
            return;
        }
        if (a2.g == com.corrodinggames.rts.gameFramework.n.e.d) {
            String string4;
            n n5 = a2.a();
            if (n5 == null) {
                a2.g("Team not set for event_teamTags");
                return;
            }
            object4 = a2.a("addTeamTags", (String)null);
            if (object4 != null) {
                h h2 = g.a((String)object4);
                n5.b(h2);
            }
            if ((string4 = a2.a("removeTeamTags", (String)null)) != null) {
                h h3 = g.a(string4);
                n5.c(h3);
            }
            bl4 = true;
            return;
        }
        if (a2.g == com.corrodinggames.rts.gameFramework.n.e.b) {
            String string5 = a2.b("target");
            if (string5 == null) {
                f.i("Move trigger has no target id:" + a2.a);
                return;
            }
            object4 = f2.f(string5);
            if (object4 == null) {
                f.i("Move trigger: Cannot find target for:" + a2.a + " target:" + string5);
                return;
            }
            n n6 = a2.a();
            if (n6 == null) {
                f.i("Team not set map trigger:" + a2.a);
                return;
            }
            int n7 = 0;
            object3 = l2.cf.b(n6);
            object2 = am.bE.iterator();
            while (object2.hasNext()) {
                am am2 = (am)object2.next();
                if (am2.bX != n6 || !(am2 instanceof y) || !a2.a(am2) || !a2.b(am2)) continue;
                object = (y)am2;
                ((e)object3).a((y)object);
                ++n7;
            }
            ((e)object3).a(((PointF)object4).a, ((PointF)object4).b);
            if (bl3) {
                f2.b("firstActivation: move at:" + l2.by + " for teamId:" + n6.k + " to targetId:" + string5 + " (#units:" + n7 + ")");
            }
            if (a2.b("unload") != null) {
                Iterator iterator = am.bE.iterator();
                while (iterator.hasNext()) {
                    object3 = (am)iterator.next();
                    if (((am)object3).bX != n6 || !(object3 instanceof y) || !a2.a((am)object3) || !a2.b((am)object3) || !((am)object3).cr()) continue;
                    object2 = (y)object3;
                    e e2 = l2.cf.b(n6);
                    e2.e = true;
                    e2.a((y)object2);
                    object = ((am)object2).cp();
                    e2.a((c)object);
                }
            }
            bl4 = true;
            return;
        }
        if (a2.g == com.corrodinggames.rts.gameFramework.n.e.f) {
            m m2 = new m();
            object4 = am.bE.iterator();
            while (object4.hasNext()) {
                am am3 = (am)object4.next();
                if (!(am3 instanceof y) || !a2.a(am3) || !a2.b(am3)) continue;
                m2.add(am3);
            }
            if (m2.size() > 0) {
                object4 = m2.iterator();
                while (object4.hasNext()) {
                    am am4 = (am)object4.next();
                    am4.ci();
                    if (!(am4 instanceof y) || !am4.bI()) continue;
                    l2.bU.a((y)am4);
                }
            }
            bl4 = true;
        }
        if (!bl4) {
            a2.h("Trigger activated with no effect");
        }
    }
}

