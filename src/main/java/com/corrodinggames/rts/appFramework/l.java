/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.reflect.Method
 */
package com.corrodinggames.rts.appFramework;

import android.util.Log;
import android.view.MotionEvent;
import java.lang.reflect.Method;

public class l {
    public static final boolean a;
    public static final boolean b;
    private static Method c;
    private static Method d;
    private static Method e;
    private static Method f;
    private static Method g;
    private static Method h;
    private static Method i;
    private static Method j;
    private static Method k;
    private static int l;
    private static int m;
    private static final float[] n;
    private static final float[] o;
    private static final float[] p;
    private static final int[] q;
    private static final int[] r;

    static /* synthetic */ int[] a() {
        return r;
    }

    static {
        l = 6;
        m = 8;
        boolean bl2 = false;
        try {
            d = MotionEvent.class.getMethod("getPointerCount", new Class[0]);
            e = MotionEvent.class.getMethod("findPointerIndex", new Class[]{Integer.TYPE});
            f = MotionEvent.class.getMethod("getPressure", new Class[]{Integer.TYPE});
            g = MotionEvent.class.getMethod("getHistoricalX", new Class[]{Integer.TYPE, Integer.TYPE});
            h = MotionEvent.class.getMethod("getHistoricalY", new Class[]{Integer.TYPE, Integer.TYPE});
            i = MotionEvent.class.getMethod("getHistoricalPressure", new Class[]{Integer.TYPE, Integer.TYPE});
            j = MotionEvent.class.getMethod("getX", new Class[]{Integer.TYPE});
            k = MotionEvent.class.getMethod("getY", new Class[]{Integer.TYPE});
            bl2 = true;
        }
        catch (Exception exception) {
            Log.b("MultiTouchController", "static initializer failed", exception);
        }
        a = bl2;
        if (a) {
            try {
                l = MotionEvent.class.getField("ACTION_POINTER_UP").getInt(null);
                m = MotionEvent.class.getField("ACTION_POINTER_INDEX_SHIFT").getInt(null);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        boolean bl3 = false;
        try {
            c = MotionEvent.class.getMethod("getButtonState", new Class[0]);
            bl3 = true;
            Log.b("MultiTouchController", "--- Mouse API succeeded");
        }
        catch (Exception exception) {
            Log.b("MultiTouchController", "static initializer for mouse failed", exception);
        }
        b = bl3;
        n = new float[10];
        o = new float[10];
        p = new float[10];
        q = new int[10];
        r = new int[10];
    }
}

