/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 */
package com.corrodinggames.rts.gameFramework.f;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.f.ae;
import com.corrodinggames.rts.gameFramework.f.af;
import com.corrodinggames.rts.gameFramework.f.ah;
import com.corrodinggames.rts.gameFramework.f.ai;
import com.corrodinggames.rts.gameFramework.f.ak;
import com.corrodinggames.rts.gameFramework.f.d;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.m.e;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

public class aj {
    m a;
    Rect b;
    Paint c;
    Paint d;

    public void a(float f2, float f3) {
        l l2 = l.B();
        int n2 = 0;
        int n3 = com.corrodinggames.rts.gameFramework.f.d.a(this.c);
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ak ak2 = (ak)iterator.next();
            int n4 = 0;
            af af2 = null;
            Iterator iterator2 = ak2.a.iterator();
            while (iterator2.hasNext()) {
                Object object;
                af af3;
                af af4 = (af)iterator2.next();
                if (af2 != null) {
                    n4 += af2.a(this.c);
                }
                int n5 = (int)(f2 + (float)n4 + (float)this.b.d());
                n5 -= ak2.b / 2;
                int n6 = (int)(f3 + (float)this.b.b + (float)(n3 / 2) + (float)(n2 * n3));
                if (!(af4 instanceof ai)) {
                    if (af4 instanceof ah) {
                        af3 = (ah)af4;
                        object = ((ah)af3).a;
                        l2.bO.a((e)object, (float)n5, (float)n6 - (float)((e)object).q * ((ah)af3).b, (Paint)ae.c, 0.0f, ((ah)af3).b);
                    }
                    af2 = af4;
                    continue;
                }
                af3 = (ai)af4;
                object = af3.b(this.c);
                l2.bO.a(af3.d, (float)n5, (float)n6, (Paint)object);
                af2 = af4;
            }
            ++n2;
        }
    }
}

