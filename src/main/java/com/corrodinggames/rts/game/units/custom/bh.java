/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.Short
 *  java.lang.String
 *  java.util.Iterator
 */
package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.f;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.bi;
import com.corrodinggames.rts.game.units.custom.bp;
import com.corrodinggames.rts.game.units.custom.d.b;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.h;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.z;
import com.corrodinggames.rts.gameFramework.j.k;
import com.corrodinggames.rts.gameFramework.m.e;
import com.corrodinggames.rts.gameFramework.utility.ab;
import com.corrodinggames.rts.gameFramework.utility.m;
import com.corrodinggames.rts.gameFramework.w;
import java.util.Iterator;

public class bh
extends com.corrodinggames.rts.game.g {
    public String bh;
    public int bi;
    public l bj;

    public static void a(bh bh2, l l2, ab ab2, String string2) {
        Object object;
        Object object2;
        Object object3;
        String string3;
        bp bp2;
        String string4;
        String string5;
        e e2;
        e e3;
        Object object4;
        String string6 = string2;
        Integer n2 = ab2.b(string6, "directDamage", (Integer)null);
        Integer n3 = ab2.b(string6, "areaDamage", (Integer)null);
        if (n2 == null && n3 == null) {
            throw new RuntimeException("[" + string6 + "]: directDamage or areaDamage must be set");
        }
        bh2.s = ab2.a(string6, "targetGround", (Boolean)bh2.s);
        bh2.t = ab2.a(string6, "targetGround_includeTargetHeight", (Boolean)bh2.t);
        Integer n4 = ab2.b(string6, "areaRadius", (Integer)null);
        if (n4 != null) {
            bh2.i = n4;
        }
        bh2.b = ab2.b(string6, "directDamage", bh2.b);
        bh2.c = ab2.b(string6, "areaDamage", bh2.c);
        bh2.d = ab2.a(string6, "interceptProjectile_removeTargetLifeOnly", (Boolean)bh2.d);
        bh2.g = ab2.a(string6, "areaDamageNoFalloff", (Boolean)bh2.g);
        bh2.j = ab2.a(string6, "areaIgnoreUnitsCloserThan", Float.valueOf((float)bh2.j)).floatValue();
        bh2.h = ab2.a(string6, "areaRadiusFromEdge", (Boolean)bh2.h);
        if ("only-ignoreEnemy".equalsIgnoreCase(ab2.b(string6, "friendlyFire", (String)null))) {
            bh2.l = true;
        } else {
            object4 = ab2.a(string6, "friendlyFire", (Boolean)null);
            if (object4 != null) {
                bh2.l = false;
                bh2.k = object4;
            }
        }
        bh2.m = ab2.a(string6, "areaHitAirAndLandAtSameTime", (Boolean)bh2.m);
        bh2.n = ab2.a(string6, "areaHitUnderwaterAlways", (Boolean)bh2.n);
        bh2.o = ab2.a(string6, "deflectionPower", Float.valueOf((float)bh2.o)).floatValue();
        bh2.p = ab2.a(string6, "nukeWeapon", (Boolean)bh2.p);
        bh2.q = ab2.a(string6, "shouldRevealFog", (Boolean)bh2.q);
        bh2.r = ab2.a(string6, "alwaysVisibleInFog", (Boolean)bh2.r);
        bh2.v = ab2.h(string6, "life").floatValue();
        bh2.u = ab2.b(string6, "delayedStartTimer", Float.valueOf((float)0.0f)).floatValue();
        bh2.w = ab2.a(string6, "speed", Float.valueOf((float)bh2.w)).floatValue();
        bh2.x = ab2.a(string6, "frame", (Short)bh2.x);
        bh2.y = ab2.a(string6, "drawType", (Short)bh2.y);
        bh2.z = ab2.a(string6, "shadowFrame", (Short)bh2.z);
        object4 = l2.a(ab2, string6, "image");
        if (object4 != null) {
            bh2.B = object4;
        }
        if ((e3 = l2.a(ab2, string6, "shadowImage")) != null) {
            bh2.C = e3;
        }
        bh2.ad = ab2.a(string6, "beamImageOffsetRate", Float.valueOf((float)bh2.ad)).floatValue();
        e e4 = l2.a(ab2, string6, "beamImage");
        if (e4 != null) {
            bh2.Y = e4;
            bh2.X = true;
            if (e4.q < 20 && !com.corrodinggames.rts.gameFramework.l.ax()) {
                throw new RuntimeException("beamImage height must currently be 20 pixels or greater (performance when tiling)");
            }
        }
        if ((e2 = l2.a(ab2, string6, "beamImageStart")) != null) {
            bh2.Z = e2;
            if (e4 == null) {
                throw new RuntimeException("beamImageStart requires beamImage to be set");
            }
        }
        bh2.aa = ab2.a(string6, "beamImageStartRotated", (Boolean)false);
        e e5 = l2.a(ab2, string6, "beamImageEnd");
        if (e5 != null) {
            bh2.ab = e5;
            if (e4 == null) {
                throw new RuntimeException("beamImageEnd requires beamImage to be set");
            }
        }
        bh2.ac = ab2.a(string6, "beamImageEndRotated", (Boolean)false);
        bh2.A = ab2.a(string6, "invisible", (Boolean)bh2.A);
        bh2.D = ab2.a(string6, "initialUnguidedSpeedHeight", Float.valueOf((float)bh2.D)).floatValue();
        bh2.E = ab2.a(string6, "initialUnguidedSpeedX", Float.valueOf((float)bh2.E)).floatValue();
        bh2.F = ab2.a(string6, "initialUnguidedSpeedY", Float.valueOf((float)bh2.F)).floatValue();
        bh2.G = ab2.a(string6, "gravity", Float.valueOf((float)bh2.G)).floatValue();
        bh2.H = ab2.a(string6, "trueGravity", Float.valueOf((float)bh2.H)).floatValue();
        bh2.I = ab2.a(string6, "instant", (Boolean)bh2.I);
        bh2.L = ab2.a(string6, "instantReuseLast", (Boolean)bh2.L);
        bh2.M = ab2.a(string6, "instantReuseLast_alsoChangeTurretAim", (Boolean)bh2.M);
        if (bh2.M) {
            if (!bh2.L) {
                throw new RuntimeException("[" + string6 + "]instantReuseLast_alsoChangeTurretAim also requires instantReuseLast");
            }
            l2.eA = true;
        }
        bh2.N = ab2.a(string6, "instantReuseLast_keepAreaDamageList", (Boolean)bh2.N);
        bh2.T = ab2.a(string6, "moveWithParent", (Boolean)bh2.T);
        bh2.J = ab2.a(string6, "disableLeadTargeting", (Boolean)bh2.J);
        bh2.K = ab2.a(string6, "leadTargetingSpeedCalculation", Float.valueOf((float)bh2.K)).floatValue();
        bh2.ae = ab2.a(string6, "ballistic", (Boolean)bh2.ae);
        String string7 = ab2.b(string6, "trailEffect", (String)null);
        if (string7 != null) {
            if (string7.equalsIgnoreCase("true")) {
                bh2.af = true;
            } else if (string7.equalsIgnoreCase("false")) {
                bh2.af = false;
            } else {
                bh2.af = false;
                bh2.ah = l2.a(string7, (z)null);
            }
        }
        if ((string5 = ab2.b(string6, "effectOnCreate", (String)null)) != null) {
            bh2.ai = l2.a(string5, (z)null);
        }
        bh2.ag = ab2.a(string6, "trailEffectRate", Float.valueOf((float)bh2.ag)).floatValue();
        if (bh2.af) {
            bh2.ao = -1118720;
        }
        bh2.am = ab2.a(string6, "wobbleAmplitude", Float.valueOf((float)bh2.am)).floatValue();
        bh2.an = ab2.b(string6, "wobbleFrequency", Float.valueOf((float)bh2.an)).floatValue();
        if (bh2.an <= 0.0f) {
            throw new RuntimeException("wobbleFrequency must be greater than 0");
        }
        bh2.ak = com.corrodinggames.rts.game.units.custom.bi.a(l2, ab2, string6, "spawnProjectilesOnEndOfLife", null);
        bh2.aj = com.corrodinggames.rts.game.units.custom.bi.a(l2, ab2, string6, "spawnProjectilesOnExplode", null);
        bh2.al = com.corrodinggames.rts.game.units.custom.bi.a(l2, ab2, string6, "spawnProjectilesOnCreate", null);
        bh2.ao = ab2.a(string6, "lightColor", (Integer)bh2.ao);
        bh2.ap = ab2.a(string6, "lightSize", Float.valueOf((float)bh2.ap)).floatValue();
        bh2.aq = ab2.a(string6, "lightCastOnGround", (Boolean)bh2.aq);
        bh2.ar = ab2.a(string6, "largeHitEffect", (Boolean)bh2.ar);
        bh2.O = ab2.a(string6, "turnSpeed", Float.valueOf((float)bh2.O)).floatValue();
        bh2.P = ab2.a(string6, "turnSpeedWhenNear", Float.valueOf((float)bh2.P)).floatValue();
        bh2.Q = ab2.a(string6, "sweepSpeed", Float.valueOf((float)bh2.Q)).floatValue();
        bh2.R = ab2.a(string6, "sweepOffset", Float.valueOf((float)bh2.R)).floatValue();
        bh2.S = ab2.a(string6, "sweepOffsetFromTargetRadius", Float.valueOf((float)bh2.S)).floatValue();
        bh2.U = ab2.a(string6, "drawUnderUnits", (Boolean)bh2.U);
        bh2.V = ab2.a(string6, "lightingEffect", (Boolean)bh2.V);
        bh2.W = ab2.a(string6, "laserEffect", (Boolean)bh2.W);
        if (bh2.W && bh2.Y == null) {
            bh2.aE = Color.a(80, 255, 0, 0);
        }
        if (bh2.V && bh2.s) {
            throw new RuntimeException("lightingEffect must be targeted, cannot be targetGround");
        }
        if (bh2.W && bh2.s) {
            throw new RuntimeException("laserEffect must be targeted, cannot be targetGround");
        }
        bh2.as = ab2.a(string6, "ballistic_delaymove_height", Float.valueOf((float)bh2.as)).floatValue();
        bh2.at = ab2.a(string6, "ballistic_height", Float.valueOf((float)bh2.at)).floatValue();
        bh2.au = ab2.a(string6, "targetSpeed", Float.valueOf((float)bh2.au)).floatValue();
        bh2.av = ab2.a(string6, "targetSpeedAcceleration", Float.valueOf((float)bh2.av)).floatValue();
        bh2.aw = ab2.a(string6, "autoTargetingOnDeadTarget", (Boolean)bh2.aw);
        bh2.ax = ab2.a(string6, "autoTargetingOnDeadTargetRange", Float.valueOf((float)bh2.ax)).floatValue();
        bh2.ay = ab2.a(string6, "autoTargetingOnDeadTargetLead", Float.valueOf((float)bh2.ay)).floatValue();
        bh2.az = ab2.a(string6, "retargetingInFlight", (Boolean)bh2.az);
        bh2.aA = ab2.a(string6, "retargetingInFlightSearchDelay", Float.valueOf((float)bh2.aA)).floatValue();
        bh2.aB = ab2.a(string6, "retargetingInFlightSearchRange", Float.valueOf((float)bh2.aB)).floatValue();
        bh2.aC = ab2.a(string6, "retargetingInFlightSearchLead", Float.valueOf((float)bh2.aC)).floatValue();
        bh2.aD = ab2.a(l2, string6, "retargetingInFlightSearchOnlyTags", (h)null);
        if (bh2.ax > 1500.0f) {
            throw new RuntimeException("for performance autoTargetingOnDeadTargetRange cannot be >1500");
        }
        if (bh2.aB > 1500.0f) {
            throw new RuntimeException("for performance retargetingInFlightSearchRange cannot be >1500");
        }
        bh2.aE = ab2.a(string6, "color", (Integer)bh2.aE);
        bh2.aG = ab2.a(string6, "teamColorRatio", Float.valueOf((float)bh2.aG)).floatValue();
        if (bh2.aG < 0.0f || bh2.aG > 1.0f) {
            throw new RuntimeException("teamColorRatio should be between 0-1 got:" + bh2.aG);
        }
        bh2.aH = ab2.a(string6, "teamColorRatio_sourceRatio", Float.valueOf((float)(1.0f - bh2.aG))).floatValue();
        if (bh2.aH < 0.0f || bh2.aH > 1.0f) {
            throw new RuntimeException("teamColorRatio_sourceRatio should be between 0-1 got:" + bh2.aH);
        }
        if (bh2.aG == 0.0f && bh2.aH != 1.0f) {
            throw new RuntimeException("teamColorRatio_sourceRatio requires teamColorRatio");
        }
        bh2.aF = ab2.a(string6, "drawSize", Float.valueOf((float)bh2.aF)).floatValue();
        bh2.aI = ab2.a(string6, "flameWeapon", (Boolean)bh2.aI);
        bh2.aJ = ab2.a(string6, "hitSound", (Boolean)bh2.aJ);
        bh2.aL = ab2.a(string6, "targetGroundHeightOffset", Float.valueOf((float)bh2.aL)).floatValue();
        bh2.aK = ab2.a(string6, "targetGroundSpread", Float.valueOf((float)bh2.aK)).floatValue();
        bh2.aM = ab2.a(string6, "speedSpread", Float.valueOf((float)bh2.aM)).floatValue();
        bh2.aO = ab2.a(string6, "explodeOnEndOfLife", (Boolean)bh2.aO);
        bh2.aN = ab2.a(string6, "ignoreParentShootDamageMultiplier", (Boolean)bh2.aN);
        bh2.aP = ab2.a(string6, "pushForce", Float.valueOf((float)bh2.aP)).floatValue();
        bh2.aQ = ab2.a(string6, "pushVelocity", Float.valueOf((float)bh2.aQ)).floatValue();
        bh2.aR = ab2.a(string6, "buildingDamageMultiplier", Float.valueOf((float)bh2.aR)).floatValue();
        bh2.aS = ab2.a(string6, "shieldDamageMultiplier", Float.valueOf((float)bh2.aS)).floatValue();
        bh2.aT = ab2.a(string6, "shieldDefectionMultiplier", Float.valueOf((float)bh2.aT)).floatValue();
        bh2.aU = ab2.a(string6, "hullDamageMultiplier", Float.valueOf((float)bh2.aU)).floatValue();
        bh2.aV = ab2.a(string6, "armourIgnoreAmount", Float.valueOf((float)bh2.aV)).floatValue();
        bh2.aW = ab2.a(string6, "areaExpandTime", Float.valueOf((float)bh2.aW)).floatValue();
        String string8 = ab2.b(string6, "explodeEffect", (String)null);
        if (string8 != null) {
            bh2.aX = l2.a(string8, (z)null);
        }
        if ((string4 = ab2.b(string6, "explodeEffectOnShield", (String)null)) != null) {
            bh2.aY = l2.a(string4, (z)null);
        }
        if ((bp2 = bp.a(l2, ab2, string6, "spawnUnit")) != null && !bp2.b()) {
            bh2.aZ = bp2;
        }
        bh2.ba = ab2.b(string6, "unloadUpToXUnitsFromSource", bh2.ba);
        bh2.bb = ab2.a(string6, "teleportSource", (Boolean)bh2.bb);
        bh2.bc = ab2.a(string6, "convertHitToSourceTeam", (Boolean)bh2.bc);
        bh2.bd = com.corrodinggames.rts.game.units.custom.g.a(ab2.b(string6, "tags", (String)null));
        m m2 = ab2.k(string2, "mutator");
        m m3 = new m();
        Iterator iterator = m2.iterator();
        while (iterator.hasNext()) {
            string3 = (String)iterator.next();
            object3 = string3.split("_");
            if (((String[])object3).length <= 1 || m3.contains(object2 = (String)(object = object3[0]) + "_") || object.length() <= "mutator".length()) continue;
            m3.add(object2);
        }
        iterator = m3.iterator();
        while (iterator.hasNext()) {
            String string9;
            string3 = (String)iterator.next();
            object3 = new com.corrodinggames.rts.game.h();
            object3.a = com.corrodinggames.rts.game.units.custom.g.a(ab2.b(string6, string3 + "ifUnitWithTags", (String)null));
            object3.b = com.corrodinggames.rts.game.units.custom.g.a(ab2.b(string6, string3 + "ifUnitWithoutTags", (String)null));
            if (object3.a == null && object3.b == null) {
                throw new RuntimeException("[" + string6 + "]" + string3 + " requires: unitWithTags and/or unitWithoutTags");
            }
            object3.c = ab2.a(string6, string3 + "directDamageMultiplier", Float.valueOf((float)1.0f)).floatValue();
            object3.d = ab2.a(string6, string3 + "areaDamageMultiplier", Float.valueOf((float)1.0f)).floatValue();
            object = com.corrodinggames.rts.game.units.custom.d.b.a(l2, ab2, string2, string3 + "addResourcesDirectHit", true);
            if (object != null && ((b)object).d()) {
                object3.e = object;
                if (bh2.s) {
                    throw new RuntimeException("[" + string6 + "]" + string3 + "addResourcesDirectHit doesn't work with targetGround, as it will never get direct hits (use addResourcesAreaHit)");
                }
            }
            if ((object2 = com.corrodinggames.rts.game.units.custom.d.b.a(l2, ab2, string2, string3 + "addResourcesAreaHit", true)) != null && ((b)object2).d()) {
                object3.f = object2;
                if (n4 == null) {
                    throw new RuntimeException("[" + string6 + "]" + string3 + "addResourcesAreaHit requires areaRadius to be set");
                }
            }
            if ((string9 = ab2.b(string6, string3 + "changedExplodeEffect", (String)null)) != null) {
                object3.g = l2.a(string9, (z)null);
                if (object3.g != null && !object3.g.a()) {
                    object3.g = null;
                }
            }
            boolean bl2 = false;
            boolean bl3 = false;
            if (!com.corrodinggames.rts.gameFramework.f.k(object3.c, 1.0f)) {
                bl2 = true;
            }
            if (!com.corrodinggames.rts.gameFramework.f.k(object3.d, 1.0f) && bh2.c != 0 && bh2.i > 0) {
                bl3 = true;
            }
            if (object3.e != null) {
                bl2 = true;
            }
            if (object3.f != null) {
                bl3 = true;
            }
            if (bl2) {
                if (bh2.be == null) {
                    bh2.be = new m();
                }
                bh2.be.add(object3);
            }
            if (bl3) {
                if (bh2.bf == null) {
                    bh2.bf = new m();
                }
                bh2.e = true;
                bh2.bf.add(object3);
            }
            if (object3.g == null) continue;
            if (bh2.bg == null) {
                bh2.bg = new m();
            }
            bh2.bg.add(object3);
        }
        if (bh2.c != 0 && bh2.i > 0) {
            bh2.e = true;
        }
        if ((bh2.aP != 0.0f || bh2.aQ != 0.0f) && bh2.i > 0) {
            bh2.e = true;
        }
        bh2.f = !bh2.e;
        l2.fT.add((Object)bh2);
    }

    public static void a(bh bh2, com.corrodinggames.rts.gameFramework.j.as as2) {
        as2.a(bh2.bj);
        as2.c(bh2.bh);
    }

    public static com.corrodinggames.rts.game.g b(k k2) {
        as as2 = k2.q();
        String string2 = k2.l();
        if (as2 == null) {
            return null;
        }
        if (!(as2 instanceof l)) {
            com.corrodinggames.rts.gameFramework.l.b("ProjectileTemplate:readInLinkCustom: Got non CustomUnitMetadata object of:" + as2.i() + " loading real_meta");
            return null;
        }
        l l2 = (l)as2;
        bh bh2 = l2.f(string2);
        if (bh2 == null) {
            com.corrodinggames.rts.gameFramework.l.b("ProjectileTemplate:readInLinkCustom: Could not find projectile with name:" + string2);
            return null;
        }
        return bh2;
    }

    public void a(am am2, f f2, am am3, float f3, float f4, float f5) {
        bh bh2 = this;
        if (am3 == null) {
            f2.aC = true;
            f2.n = f3;
            f2.o = f4;
            if (bh2.aK != 0.0f) {
                f2.n += (float)com.corrodinggames.rts.gameFramework.f.a((w)am2, (int)(-bh2.aK * 100.0f), (int)(bh2.aK * 100.0f), 2) / 100.0f;
                am2.bC = (int)((float)am2.bC + f2.n);
                f2.o += (float)com.corrodinggames.rts.gameFramework.f.a((w)am2, (int)(-bh2.aK * 100.0f), (int)(bh2.aK * 100.0f), 3) / 100.0f;
                am2.bC = (int)((float)am2.bC + f2.o);
            }
            f2.p = 0.0f;
            f2.p += bh2.aL;
        } else if (f2.m) {
            f2.aC = true;
            if (!bh2.J) {
                float f6 = f2.t;
                if (bh2.au != -1.0f) {
                    f6 = bh2.au;
                }
                if (bh2.K >= 0.0f) {
                    f6 = bh2.K;
                }
                PointF pointF = am3.a(f2.eo, f2.ep, f6, f2.h, f5);
                f2.n = pointF.a;
                f2.o = pointF.b;
            } else {
                f2.n = am3.eo;
                f2.o = am3.ep;
            }
            f2.p = bh2.t ? am3.eq : 0.0f;
            f2.p += bh2.aL;
            if (bh2.aK != 0.0f) {
                f2.n += (float)com.corrodinggames.rts.gameFramework.f.a((w)am2, (int)(-bh2.aK * 100.0f), (int)(bh2.aK * 100.0f), 2) / 100.0f;
                f2.o += (float)com.corrodinggames.rts.gameFramework.f.a((w)am2, (int)(-bh2.aK * 100.0f), (int)(bh2.aK * 100.0f), 7) / 100.0f;
            }
        } else {
            f2.l = am3;
        }
    }
}

