/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.FileFilter
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.io.PrintWriter
 *  java.io.StringWriter
 *  java.io.UnsupportedEncodingException
 *  java.io.Writer
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.StrictMath
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.math.BigInteger
 *  java.nio.charset.Charset
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.text.SimpleDateFormat
 *  java.util.Calendar
 *  java.util.Random
 *  java.util.UUID
 */
package com.corrodinggames.rts.gameFramework;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.R$drawable;
import com.corrodinggames.rts.R$raw;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.e.a;
import com.corrodinggames.rts.gameFramework.f$a;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.w;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.UUID;

public final class f {
    static final Random a;
    static final Random b;
    public static final PointF c;
    private static final byte[] j;
    static final PointF d;
    static final PointF e;
    static final PointF f;
    static final PointF g;
    static final PointF h;
    private static final char[] k;
    private static final float[] l;
    private static final float[] m;
    private static final float[] n;
    private static final float[] o;
    private static final float[] p;
    private static final float[] q;
    private static final float[] r;
    private static final float[] s;
    static int i;
    private static final float[] t;
    private static final float[] u;

    public static final strictfp void a() {
        b.setSeed(0L);
    }

    public static final strictfp int a(am am2, int n2, int n3) {
        return com.corrodinggames.rts.gameFramework.f.a((w)am2, n2, n3, 0);
    }

    public static final strictfp float a(am am2, float f2, float f3, int n2) {
        if (am2 == null) {
            return (float)com.corrodinggames.rts.gameFramework.f.a((int)(f2 * 1000.0f), (int)(f3 * 1000.0f), n2) * 0.001f;
        }
        return (float)com.corrodinggames.rts.gameFramework.f.a((w)am2, (int)(f2 * 1000.0f), (int)(f3 * 1000.0f), n2) * 0.001f;
    }

    public static final strictfp float b(am am2, float f2, float f3, int n2) {
        return (float)com.corrodinggames.rts.gameFramework.f.a((w)am2, (int)(f2 * 1000.0f), (int)(f3 * 1000.0f), n2) * 0.001f;
    }

    public static final strictfp int a(w w2, int n2, int n3, int n4) {
        l l2 = com.corrodinggames.rts.gameFramework.l.B();
        if (n2 >= n3) {
            if (n2 > n3) {
                com.corrodinggames.rts.gameFramework.l.b("min>max");
            }
            return n2;
        }
        int n5 = l2.bx + 1;
        int n6 = l2.bJ;
        n6 = (int)((long)n6 + w2.eh * 1313L);
        n6 = (int)((float)n6 + w2.eo * 13.0f);
        n6 = (int)((float)n6 + w2.ep * 13.0f);
        n6 = (int)((float)n6 + w2.eo * 130.0f);
        n6 = (int)((float)n6 + w2.ep * 130.0f);
        if (w2 instanceof am) {
            int n7 = ((am)w2).bC;
            n6 += n7 * 13131;
            n6 += n7 * n5;
        }
        n6 += n4 * 133 * n3;
        n6 = (int)((long)n6 + ((long)n4 * w2.eh + (long)n4));
        n6 += n4 * (n5 * 1313);
        n6 += n5 * 13 + n5 % 10;
        if ((n6 %= n3 - n2) < 0) {
            n6 = -n6;
        }
        return n6 += n2;
    }

    public static final strictfp float a(float f2, float f3, int n2) {
        return (float)com.corrodinggames.rts.gameFramework.f.a((int)(f2 * 100.0f), (int)(f3 * 100.0f), n2) / 100.0f;
    }

    public static final strictfp float b(float f2, float f3, int n2) {
        return (float)com.corrodinggames.rts.gameFramework.f.a((int)(f2 * 1000.0f), (int)(f3 * 1000.0f), n2) / 1000.0f;
    }

    public static final strictfp int a(int n2, int n3, int n4) {
        l l2 = com.corrodinggames.rts.gameFramework.l.B();
        if (n2 >= n3) {
            if (n2 > n3) {
                com.corrodinggames.rts.gameFramework.l.b("min>max");
            }
            return n2;
        }
        int n5 = n3 - n2;
        int n6 = l2.bJ;
        n6 += n4 * 133333333 * n5;
        n6 += n4 * 13131313;
        n6 += n4 * (l2.bx * 13131313);
        n6 += l2.bx * 1313131313 + l2.bx % 10;
        if ((n6 %= n5) < 0) {
            n6 = -n6;
        }
        if ((n6 += n2) < n2 || n6 > n3) {
            com.corrodinggames.rts.gameFramework.l.b("notRandInt number not in range: " + n6 + " min:" + n2 + " max:" + n3);
        }
        return n6;
    }

    public static strictfp String a(String string2) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(string2);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static final strictfp void a(InputStream inputStream, OutputStream outputStream) {
        int n2;
        byte[] byArray = new byte[8192];
        while ((n2 = inputStream.read(byArray)) != -1) {
            outputStream.write(byArray, 0, n2);
        }
    }

    public static final strictfp String a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[8192];
        try {
            int n2;
            while ((n2 = inputStream.read(byArray)) != -1) {
                byteArrayOutputStream.write(byArray, 0, n2);
            }
            byteArrayOutputStream.close();
            inputStream.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return byteArrayOutputStream.toString();
    }

    public static final strictfp float a(float f2) {
        return (float)StrictMath.sqrt((double)f2);
    }

    public static final strictfp int a(int n2) {
        if (n2 > 1000 || n2 < 0) {
            return StrictMath.round((float)com.corrodinggames.rts.gameFramework.f.a((float)n2));
        }
        return j[n2];
    }

    public static final strictfp float a(float f2, float f3) {
        if (f2 > f3) {
            return f2 - f3;
        }
        if (f2 < -f3) {
            return f2 + f3;
        }
        return 0.0f;
    }

    public static final strictfp float a(float f2, float f3, float f4) {
        if (f2 > f3 + f4) {
            return f2 - f4;
        }
        if (f2 < f3 - f4) {
            return f2 + f4;
        }
        return f3;
    }

    public static final strictfp float b(float f2, float f3) {
        if (f2 > f3) {
            return f3;
        }
        if (f2 < -f3) {
            return -f3;
        }
        return f2;
    }

    public static final strictfp float b(float f2, float f3, float f4) {
        if (f2 > f4) {
            return f4;
        }
        if (f2 < f3) {
            return f3;
        }
        return f2;
    }

    public static final strictfp int b(int n2, int n3, int n4) {
        if (n2 > n4) {
            return n4;
        }
        if (n2 < n3) {
            return n3;
        }
        return n2;
    }

    public static final strictfp int b(int n2) {
        if (n2 > 255) {
            return 255;
        }
        if (n2 < 0) {
            return 0;
        }
        return n2;
    }

    public static final strictfp void a(float f2, float f3, float f4, PointF pointF) {
        float f5 = com.corrodinggames.rts.gameFramework.f.j(f4);
        float f6 = com.corrodinggames.rts.gameFramework.f.k(f4);
        pointF.a -= f2;
        pointF.b -= f3;
        float f7 = pointF.a * f6 - pointF.b * f5;
        float f8 = pointF.a * f5 + pointF.b * f6;
        pointF.a = f7 + f2;
        pointF.b = f8 + f3;
    }

    public static final strictfp float a(float f2, float f3, float f4, float f5) {
        return (f2 - f4) * (f2 - f4) + (f3 - f5) * (f3 - f5);
    }

    public static final strictfp float b(float f2, float f3, float f4, float f5) {
        return (float)StrictMath.sqrt((double)((f2 - f4) * (f2 - f4) + (f3 - f5) * (f3 - f5)));
    }

    public static final strictfp int c(float f2, float f3, float f4, float f5) {
        return com.corrodinggames.rts.gameFramework.f.a((int)((f2 - f4) * (f2 - f4) + (f3 - f5) * (f3 - f5)));
    }

    public static final strictfp int a(int n2, int n3, int n4, int n5) {
        int n6 = n2 - n4;
        int n7 = n3 - n5;
        if (n6 < 0) {
            n6 = -n6;
        }
        if (n7 < 0) {
            n7 = -n7;
        }
        if (n6 > n7) {
            return n6;
        }
        return n7;
    }

    public static final strictfp float a(float f2, boolean bl2) {
        if (bl2) {
            while (f2 > 360.0f || f2 < 0.0f) {
                if (f2 > 360.0f) {
                    f2 -= 360.0f;
                }
                if (!(f2 < 0.0f)) continue;
                f2 += 360.0f;
            }
        } else {
            while (f2 > 180.0f || f2 < -180.0f) {
                if (f2 > 180.0f) {
                    f2 -= 360.0f;
                }
                if (!(f2 < -180.0f)) continue;
                f2 += 360.0f;
            }
        }
        return f2;
    }

    public static final strictfp float c(float f2, float f3, float f4) {
        float f5 = (f3 %= 360.0f) - (f2 %= 360.0f);
        if (f5 > 180.0f) {
            f5 -= 360.0f;
        }
        if (f5 < -180.0f) {
            f5 += 360.0f;
        }
        if (f5 > f4) {
            return f4;
        }
        if (f5 < -f4) {
            return -f4;
        }
        return f5;
    }

    public static final strictfp float d(float f2, float f3, float f4, float f5) {
        return com.corrodinggames.rts.gameFramework.f.b(com.corrodinggames.rts.gameFramework.f.i(f5 - f3, f4 - f2));
    }

    public static final strictfp boolean a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        float f2 = (pointF4.b - pointF3.b) * (pointF2.a - pointF.a) - (pointF4.a - pointF3.a) * (pointF2.b - pointF.b);
        float f3 = (pointF4.a - pointF3.a) * (pointF.b - pointF3.b) - (pointF4.b - pointF3.b) * (pointF.a - pointF3.a);
        float f4 = (pointF2.a - pointF.a) * (pointF.b - pointF3.b) - (pointF2.b - pointF.b) * (pointF.a - pointF3.a);
        if (f2 == 0.0f) {
            if (f3 == 0.0f && f4 == 0.0f) {
                return false;
            }
            return false;
        }
        float f5 = f3 / f2;
        float f6 = f4 / f2;
        return f5 >= 0.0f && f5 <= 1.0f && f6 >= 0.0f && f6 <= 1.0f;
    }

    public static final strictfp float c(float f2, float f3) {
        return a.nextFloat() * (f3 - f2) + f2;
    }

    public static final strictfp float d(float f2, float f3) {
        return a.nextFloat() * (f3 - f2) + f2;
    }

    public static final strictfp int c(int n2) {
        if (n2 == 0) {
            return 0;
        }
        return a.nextInt(n2);
    }

    public static strictfp int a(int n2, int n3) {
        int n4 = n3 == n2 ? 0 : a.nextInt(n3 - n2 + 1);
        return n2 + n4;
    }

    public static final strictfp void a(Rect rect) {
        int n2;
        if (rect.c < rect.a) {
            n2 = rect.c;
            rect.c = rect.a;
            rect.a = n2;
        }
        if (rect.d < rect.b) {
            n2 = rect.d;
            rect.d = rect.b;
            rect.b = n2;
        }
    }

    public static final strictfp void a(RectF rectF) {
        float f2;
        if (rectF.c < rectF.a) {
            f2 = rectF.c;
            rectF.c = rectF.a;
            rectF.a = f2;
        }
        if (rectF.d < rectF.b) {
            f2 = rectF.d;
            rectF.d = rectF.b;
            rectF.b = f2;
        }
    }

    public static final strictfp PointF d(float f2, float f3, float f4) {
        h.a(f2, f3 - f4);
        return h;
    }

    public static final strictfp float b(float f2) {
        return f2 * 57.29578f;
    }

    public static final strictfp float e(float f2, float f3) {
        return (float)StrictMath.pow((double)f2, (double)f3);
    }

    public static final strictfp double a(double d2) {
        return d2 < 0.0 ? -d2 : d2;
    }

    public static final strictfp float c(float f2) {
        return f2 < 0.0f ? -f2 : f2;
    }

    public static final strictfp int d(int n2) {
        return n2 < 0 ? -n2 : n2;
    }

    public static final strictfp int b(int n2, int n3) {
        return n2 > n3 ? n2 : n3;
    }

    public static final strictfp int c(int n2, int n3) {
        return n2 < n3 ? n2 : n3;
    }

    public static final strictfp float f(float f2, float f3) {
        return f2 > f3 ? f2 : f3;
    }

    public static final strictfp float g(float f2, float f3) {
        return f2 < f3 ? f2 : f3;
    }

    public static final strictfp boolean h(float f2, float f3) {
        return com.corrodinggames.rts.gameFramework.f.c(f2 - f3) < 0.05f;
    }

    public static final strictfp double a(double d2, double d3) {
        return d2 < d3 ? d2 : d3;
    }

    public static strictfp boolean e(float f2, float f3, float f4) {
        return com.corrodinggames.rts.gameFramework.f.c(com.corrodinggames.rts.gameFramework.f.c(f2) - com.corrodinggames.rts.gameFramework.f.c(f3)) < f4;
    }

    public static strictfp float d(float f2) {
        return (int)(f2 + 0.5f);
    }

    public static strictfp float e(float f2) {
        return (float)StrictMath.ceil((double)f2);
    }

    public static final strictfp int f(float f2) {
        if (f2 > 0.0f) {
            return (int)f2;
        }
        if (f2 < 0.0f) {
            return (int)f2 - 1;
        }
        return 0;
    }

    public static strictfp void a(RectF rectF, float f2) {
        rectF.a -= f2;
        rectF.b -= f2;
        rectF.c += f2;
        rectF.d += f2;
    }

    public static strictfp void a(Rect rect, float f2) {
        rect.a = (int)((float)rect.a - f2);
        rect.b = (int)((float)rect.b - f2);
        rect.c = (int)((float)rect.c + f2);
        rect.d = (int)((float)rect.d + f2);
    }

    public static strictfp void b(Rect rect, float f2) {
        rect.a = (int)((float)rect.a - f2);
        rect.b = (int)((float)rect.b - f2);
        rect.c = (int)((float)rect.c + f2 * 2.0f);
        rect.d = (int)((float)rect.d + f2 * 2.0f);
    }

    public static strictfp String e(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = k[a.nextInt(k.length)];
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static strictfp String b() {
        return UUID.randomUUID().toString();
    }

    public static strictfp String a(boolean bl2) {
        return bl2 ? "true" : "false";
    }

    public static strictfp String b(double d2) {
        if (d2 == (double)((int)d2)) {
            return "" + (int)d2;
        }
        return "" + d2;
    }

    public static strictfp String g(float f2) {
        return com.corrodinggames.rts.gameFramework.f.a(f2, 2);
    }

    public static strictfp String c(double d2) {
        if (d2 == (double)((int)d2)) {
            return "" + (int)d2;
        }
        return com.corrodinggames.rts.gameFramework.f.b(d2, 2);
    }

    public static strictfp String a(float f2, int n2) {
        if (f2 == (float)((int)f2)) {
            return "" + (int)f2;
        }
        return com.corrodinggames.rts.gameFramework.f.b((double)f2, n2);
    }

    public static strictfp String a(double d2, int n2) {
        if (d2 == (double)((int)d2)) {
            return "" + (int)d2;
        }
        return com.corrodinggames.rts.gameFramework.f.b(d2, n2);
    }

    public static strictfp String h(float f2) {
        if ((int)(f2 * 10.0f) == (int)f2 * 10) {
            return "" + (int)f2 + "s";
        }
        return com.corrodinggames.rts.gameFramework.f.b((double)f2, 1) + "s";
    }

    public static strictfp String b(double d2, int n2) {
        String string2 = "" + d2;
        int n3 = string2.indexOf(".");
        if (n3 == -1) {
            return string2;
        }
        if (string2.indexOf("E") != -1) {
            return String.format((String)("%." + n2 + "f"), (Object[])new Object[]{d2});
        }
        int n4 = n3 + n2 + 1;
        if (n4 > string2.length()) {
            n4 = string2.length();
        }
        string2 = string2.substring(0, n4);
        return string2;
    }

    public static strictfp String a(String string2, int n2) {
        if (string2 == null) {
            return null;
        }
        if (string2.length() < n2) {
            return string2;
        }
        return string2.substring(0, Math.min((int)string2.length(), (int)n2));
    }

    public static strictfp String b(String string2, int n2) {
        if (string2 == null) {
            return null;
        }
        if (string2.length() < n2) {
            return string2;
        }
        if ((n2 -= 3) < 1) {
            n2 = 1;
        }
        return string2.substring(0, Math.min((int)string2.length(), (int)n2)) + "...";
    }

    public static strictfp String b(String string2) {
        byte[] byArray;
        try {
            byArray = MessageDigest.getInstance((String)"MD5").digest(string2.getBytes("UTF-8"));
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException("MD5 should be supported", (Throwable)noSuchAlgorithmException);
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException("UTF-8 should be supported", (Throwable)unsupportedEncodingException);
        }
        StringBuilder stringBuilder = new StringBuilder(byArray.length * 2);
        for (byte by : byArray) {
            int n2 = by & 0xFF;
            if (n2 < 16) {
                stringBuilder.append('0');
            }
            stringBuilder.append(Integer.toHexString((int)n2));
        }
        return stringBuilder.toString();
    }

    public static strictfp String c(String string2) {
        String string3 = com.corrodinggames.rts.gameFramework.f.a(com.corrodinggames.rts.gameFramework.f.f(string2));
        string3 = com.corrodinggames.rts.gameFramework.f.a(string3, 14);
        return string3;
    }

    public static strictfp String d(String string2) {
        String string3 = com.corrodinggames.rts.gameFramework.f.a(com.corrodinggames.rts.gameFramework.f.f(string2));
        string3 = com.corrodinggames.rts.gameFramework.f.a(string3, 4);
        return string3;
    }

    public static strictfp String c(String string2, int n2) {
        String string3 = com.corrodinggames.rts.gameFramework.f.a(com.corrodinggames.rts.gameFramework.f.f(string2));
        for (int i2 = 0; i2 < n2; ++i2) {
            string3 = com.corrodinggames.rts.gameFramework.f.a(com.corrodinggames.rts.gameFramework.f.f(string3));
        }
        return string3;
    }

    public static strictfp String e(String string2) {
        return com.corrodinggames.rts.gameFramework.f.a(com.corrodinggames.rts.gameFramework.f.f(string2));
    }

    static strictfp byte[] f(String string2) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance((String)"SHA-256");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException((Throwable)noSuchAlgorithmException);
        }
        messageDigest.reset();
        return messageDigest.digest(string2.getBytes());
    }

    static strictfp String a(byte[] byArray) {
        return String.format((String)("%0" + byArray.length * 2 + "X"), (Object[])new Object[]{new BigInteger(1, byArray)});
    }

    public static strictfp String b(byte[] byArray) {
        return com.corrodinggames.rts.gameFramework.f.a(com.corrodinggames.rts.gameFramework.f.c(byArray));
    }

    static strictfp byte[] c(byte[] byArray) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance((String)"SHA-256");
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException((Throwable)noSuchAlgorithmException);
        }
        messageDigest.reset();
        return messageDigest.digest(byArray);
    }

    public static strictfp int c() {
        int n2;
        int n3 = 1;
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (file.exists()) {
                File[] fileArray = file.listFiles((FileFilter)new f$a());
                n3 = fileArray.length;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            n3 = 1;
        }
        if (n3 == 1 && (n2 = Runtime.getRuntime().availableProcessors()) > 1) {
            n3 = n2;
        }
        return n3;
    }

    public static strictfp void a(byte[] byArray, byte[] byArray2) {
        System.arraycopy((Object)byArray, (int)0, (Object)byArray2, (int)0, (int)byArray.length);
    }

    public static strictfp float f(float f2, float f3, float f4) {
        return f2 + (f3 - f2) * f4;
    }

    public static strictfp float i(float f2) {
        float f3 = f2 - 1.0f;
        float f4 = f2 * 2.0f;
        if (f4 < 1.0f) {
            return f2 * f4;
        }
        return 1.0f - f3 * f3 * 2.0f;
    }

    public static strictfp int a(int n2, int n3, float f2) {
        int n4 = Color.a(n2);
        int n5 = Color.b(n2);
        int n6 = Color.c(n2);
        int n7 = Color.d(n2);
        int n8 = Color.a(n3);
        int n9 = Color.b(n3);
        int n10 = Color.c(n3);
        int n11 = Color.d(n3);
        return Color.a((int)com.corrodinggames.rts.gameFramework.f.f(n4, n8, f2), (int)com.corrodinggames.rts.gameFramework.f.f(n5, n9, f2), (int)com.corrodinggames.rts.gameFramework.f.f(n6, n10, f2), (int)com.corrodinggames.rts.gameFramework.f.f(n7, n11, f2));
    }

    public static strictfp String d(String string2, int n2) {
        String string3 = "";
        for (int i2 = 0; i2 <= n2; ++i2) {
            string3 = string3 + string2;
        }
        return string3;
    }

    public static strictfp String e(String string2, int n2) {
        for (int i2 = string2.length(); i2 < n2; ++i2) {
            string2 = string2 + " ";
        }
        return string2;
    }

    public static strictfp String a(String string2, int n2, String string3) {
        for (int i2 = string2.length(); i2 < n2; ++i2) {
            string2 = string3 + string2;
        }
        return string2;
    }

    public static strictfp String f(String string2, int n2) {
        return String.format((String)("%1$-" + n2 + "s"), (Object[])new Object[]{string2});
    }

    public static strictfp String a(Class clazz, int n2) {
        try {
            for (Field field : clazz.getFields()) {
                int n3 = field.getInt(null);
                if (n3 != n2) continue;
                return field.getName();
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new RuntimeException((Throwable)illegalArgumentException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException((Throwable)illegalAccessException);
        }
        return null;
    }

    public static strictfp String f(int n2) {
        String string2 = com.corrodinggames.rts.gameFramework.f.a(R$drawable.class, n2);
        if (string2 != null) {
            return com.corrodinggames.rts.gameFramework.e.a.a("res/drawable", string2);
        }
        string2 = com.corrodinggames.rts.gameFramework.f.a(R$raw.class, n2);
        if (string2 != null) {
            return com.corrodinggames.rts.gameFramework.e.a.a("res/raw", string2);
        }
        return null;
    }

    public static final strictfp String g(int n2) {
        int n3;
        if (-1000 < n2 && n2 < 1000) {
            return n2 + " B";
        }
        String string2 = "kMGTPE";
        for (n3 = 0; n3 < string2.length() && (n2 <= -999950 || n2 >= 999950); n2 /= 1000, ++n3) {
        }
        return String.format((String)"%.1f %cB", (Object[])new Object[]{(double)n2 / 1000.0, Character.valueOf((char)string2.charAt(n3))});
    }

    public static final strictfp String h(int n2) {
        String string2 = String.format((String)"#%06X", (Object[])new Object[]{0xFFFFFF & n2});
        return string2;
    }

    public static final strictfp String g(String string2) {
        if (string2 == null) {
            return null;
        }
        File file = new File(string2);
        String string3 = file.getName();
        string3 = string3.replaceFirst("[.][^.]+$", "");
        return string3;
    }

    public static final strictfp String h(String string2) {
        if (string2.contains((CharSequence)"\\")) {
            string2 = string2.replace('\\', '/');
        }
        File file = new File(string2);
        return file.getParent();
    }

    public static final strictfp boolean a(Rect rect, RectF rectF) {
        return (float)rect.a < rectF.c && rectF.a < (float)rect.c && (float)rect.b < rectF.d && rectF.b < (float)rect.d;
    }

    public static final strictfp boolean a(RectF rectF, RectF rectF2) {
        return rectF.a < rectF2.c && rectF2.a < rectF.c && rectF.b < rectF2.d && rectF2.b < rectF.d;
    }

    public static final strictfp int b(int n2, int n3, int n4, int n5) {
        return n2 << 24 | n3 << 16 | n4 << 8 | n5;
    }

    public static final strictfp long a(long l2, long l3) {
        return (l3 - l2) / 1000000L;
    }

    public static final strictfp int a(String string2, char c2) {
        int n2 = 0;
        for (int i2 = 0; i2 < string2.length(); ++i2) {
            if (string2.charAt(i2) != c2) continue;
            ++n2;
        }
        return n2;
    }

    public static final strictfp String i(String string2) {
        string2 = string2.replace((CharSequence)"&", (CharSequence)"&amp;");
        string2 = string2.replace((CharSequence)"<", (CharSequence)"&lt;");
        string2 = string2.replace((CharSequence)">", (CharSequence)"&gt;");
        string2 = string2.replace((CharSequence)"${", (CharSequence)"$ {");
        return string2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static strictfp String a(File file) {
        String string2;
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int n2;
            byte[] byArray = new byte[(int)file.length()];
            int n3 = byArray.length;
            for (int i2 = 0; i2 < n3 && (n2 = fileInputStream.read(byArray, i2, n3 - i2)) != -1; i2 += n2) {
            }
            string2 = new String(byArray, Charset.forName((String)"UTF-8"));
        }
        catch (Throwable throwable) {
            try {
                fileInputStream.close();
                throw throwable;
            }
            catch (FileNotFoundException fileNotFoundException) {
                throw new RuntimeException((Throwable)fileNotFoundException);
            }
            catch (IOException iOException) {
                throw new RuntimeException((Throwable)iOException);
            }
        }
        fileInputStream.close();
        return string2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static strictfp String b(InputStream inputStream) {
        String string2;
        try {
            int n2;
            byte[] byArray = new byte[inputStream.available()];
            int n3 = byArray.length;
            for (int i2 = 0; i2 < n3 && (n2 = inputStream.read(byArray, i2, n3 - i2)) != -1; i2 += n2) {
            }
            string2 = new String(byArray, Charset.forName((String)"UTF-8"));
        }
        catch (Throwable throwable) {
            try {
                inputStream.close();
                throw throwable;
            }
            catch (FileNotFoundException fileNotFoundException) {
                throw new RuntimeException((Throwable)fileNotFoundException);
            }
            catch (IOException iOException) {
                throw new RuntimeException((Throwable)iOException);
            }
        }
        inputStream.close();
        return string2;
    }

    public static final strictfp String a(Exception exception) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter((Writer)stringWriter);
        exception.printStackTrace(printWriter);
        return stringWriter.toString();
    }

    public static final strictfp String b(Exception exception) {
        return com.corrodinggames.rts.gameFramework.f.a(exception, false);
    }

    public static final strictfp String a(Exception exception, boolean bl2) {
        Object object;
        String string2 = exception.getMessage();
        if (string2 == null) {
            string2 = exception.getClass().getName();
        } else {
            boolean bl3 = false;
            if (exception instanceof NumberFormatException) {
                bl3 = true;
            }
            if (exception instanceof ArrayIndexOutOfBoundsException) {
                bl3 = true;
            }
            if (bl3 || bl2) {
                string2 = exception.getClass().getName() + " - " + string2;
            }
        }
        if (string2 != null && string2.startsWith("java.io.IOException")) {
            string2 = string2.substring("java.io.".length());
        }
        Object object2 = exception;
        while (object2 != null && (object = object2.getCause()) != null && object != exception && object != object2) {
            object2 = object;
        }
        object = null;
        if (object2 != null && object2 != exception) {
            object = object2.getMessage();
            if (object == null) {
                object = object2.getClass().getName();
            }
            boolean bl4 = true;
            if (object.equals((Object)string2)) {
                bl4 = false;
            }
            if (string2 != null && string2.contains((CharSequence)object)) {
                bl4 = false;
            }
            if (bl4) {
                string2 = string2 + " caused by (" + (String)object + ")";
            }
        }
        return string2;
    }

    public static strictfp String j(String string2) {
        if (string2.endsWith("\n")) {
            return string2.substring(0, string2.length() - 1);
        }
        return string2;
    }

    public static strictfp String a(String string2, String string3) {
        if (string2.endsWith(string3)) {
            return string2.substring(0, string2.length() - string3.length());
        }
        return string2;
    }

    public static strictfp String k(String string2) {
        File file = new File(string2);
        return file.getName();
    }

    public static strictfp String b(String string2, String string3) {
        if (string3.startsWith("/") || string3.startsWith("\\")) {
            string3 = string3.substring(1);
        }
        if (string2.endsWith("/")) {
            return string2 + string3;
        }
        if (string2.endsWith("\\")) {
            string2 = string2.substring(0, string2.length() - 1);
        }
        return string2 + "/" + string3;
    }

    public static strictfp String a(CharSequence charSequence, Iterable iterable) {
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl2 = true;
        for (String string2 : iterable) {
            if (bl2) {
                bl2 = false;
            } else {
                stringBuilder.append(charSequence);
            }
            stringBuilder.append(string2);
        }
        return stringBuilder.toString();
    }

    public static strictfp Integer l(String string2) {
        try {
            return Integer.valueOf((String)string2);
        }
        catch (NumberFormatException numberFormatException) {
            com.corrodinggames.rts.gameFramework.l.e(numberFormatException.toString());
            return null;
        }
    }

    public static strictfp Long m(String string2) {
        try {
            return Long.valueOf((String)string2);
        }
        catch (NumberFormatException numberFormatException) {
            com.corrodinggames.rts.gameFramework.l.e(numberFormatException.toString());
            return null;
        }
    }

    public static strictfp boolean n(String string2) {
        int n2;
        int n3 = string2.length();
        for (int i2 = 0; i2 < n3; i2 += Character.charCount((int)n2)) {
            n2 = string2.codePointAt(i2);
            if (n2 <= 128) continue;
            return true;
        }
        return false;
    }

    public static strictfp String a(long l2) {
        int[] nArray = com.corrodinggames.rts.gameFramework.f.b(l2);
        String string2 = nArray[0] == 0 ? com.corrodinggames.rts.gameFramework.f.a("" + nArray[1], 2, "0") + ":" + com.corrodinggames.rts.gameFramework.f.a("" + nArray[2], 2, "0") : com.corrodinggames.rts.gameFramework.f.a("" + nArray[0], 2, "0") + ":" + com.corrodinggames.rts.gameFramework.f.a("" + nArray[1], 2, "0") + ":" + com.corrodinggames.rts.gameFramework.f.a("" + nArray[2], 2, "0");
        return string2;
    }

    public static strictfp int[] b(long l2) {
        int n2 = (int)l2 / 3600;
        int n3 = (int)l2 - n2 * 3600;
        int n4 = n3 / 60;
        int n5 = n3 -= n4 * 60;
        int[] nArray = new int[]{n2, n4, n5};
        return nArray;
    }

    public static final strictfp float i(float f2, float f3) {
        try {
            if (f3 >= 0.0f) {
                if (f2 >= 0.0f) {
                    if (f3 >= f2) {
                        return l[(int)((double)(1024.0f * f2 / f3) + 0.5)];
                    }
                    return m[(int)((double)(1024.0f * f3 / f2) + 0.5)];
                }
                if (f3 >= -f2) {
                    return n[(int)((double)(-1024.0f * f2 / f3) + 0.5)];
                }
                return o[(int)((double)(-1024.0f * f3 / f2) + 0.5)];
            }
            if (f2 >= 0.0f) {
                if (-f3 >= f2) {
                    return p[(int)((double)(-1024.0f * f2 / f3) + 0.5)];
                }
                return q[(int)((double)(-1024.0f * f3 / f2) + 0.5)];
            }
            if (f3 <= f2) {
                return r[(int)((double)(1024.0f * f2 / f3) + 0.5)];
            }
            return s[(int)((double)(1024.0f * f3 / f2) + 0.5)];
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            if (i < 100) {
                com.corrodinggames.rts.gameFramework.l.e("atan2 slow fallback for y:" + f2 + " x:" + f3);
                ++i;
            }
            return (float)StrictMath.atan2((double)f2, (double)f3);
        }
    }

    public static final strictfp float j(float f2) {
        return t[(int)(f2 * 22.755556f) & 0x1FFF];
    }

    public static final strictfp float k(float f2) {
        return u[(int)(f2 * 22.755556f) & 0x1FFF];
    }

    public static strictfp String o(String string2) {
        if (string2.contains((CharSequence)"&")) {
            string2 = string2.replace((CharSequence)"&lt;", (CharSequence)"<");
            string2 = string2.replace((CharSequence)"&gt;", (CharSequence)">");
            string2 = string2.replace((CharSequence)"&apos;", (CharSequence)"'");
            string2 = string2.replace((CharSequence)"&quot;", (CharSequence)"\"");
            string2 = string2.replace((CharSequence)"&amp;", (CharSequence)"&");
        }
        return string2;
    }

    public static strictfp String p(String string2) {
        if (string2 == null || string2.length() < 2) {
            return null;
        }
        char c2 = string2.charAt(0);
        if (c2 != '\"' && c2 != '\'') {
            return null;
        }
        char c3 = string2.charAt(string2.length() - 1);
        if (c3 != c2) {
            return null;
        }
        boolean bl2 = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 1; i2 < string2.length() - 1; ++i2) {
            char c4 = string2.charAt(i2);
            boolean bl3 = bl2;
            bl2 = false;
            if (!bl3) {
                if (c4 == '\\') {
                    bl2 = true;
                    continue;
                }
                if (c4 == c2) {
                    return null;
                }
            }
            stringBuilder.append(c4);
        }
        return stringBuilder.toString();
    }

    public static strictfp String q(String string2) {
        boolean bl2 = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (char c2 : string2.toCharArray()) {
            boolean bl3 = bl2;
            bl2 = false;
            if (!bl3 && c2 == '\\') {
                bl2 = true;
                continue;
            }
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    public static final strictfp String a(String string2, String string3, String string4) {
        if (!com.corrodinggames.rts.gameFramework.f.c(string2, string3)) {
            return string2;
        }
        return string2.replace((CharSequence)string3, (CharSequence)string4);
    }

    public static final strictfp boolean c(String string2, String string3) {
        return string2.indexOf(string3) > -1;
    }

    public static final strictfp boolean b(String string2, char c2) {
        return string2.indexOf((int)c2) > -1;
    }

    public static strictfp String[] c(String string2, char c2) {
        int n2;
        if (string2.length() == 0) {
            return new String[]{""};
        }
        int n3 = 0;
        int n4 = 0;
        while ((n2 = string2.indexOf((int)c2, n4)) != -1) {
            ++n3;
            n4 = n2 + 1;
        }
        if (n3 == 0) {
            return new String[]{string2};
        }
        int n5 = string2.length();
        if (n4 == n5) {
            if (n3 == n5) {
                return new String[0];
            }
            while (string2.charAt(--n4 - 1) == c2) {
            }
            n3 -= string2.length() - n4;
            n5 = n4;
        }
        String[] stringArray = new String[n3 + 1];
        n4 = 0;
        for (int i2 = 0; i2 != n3; ++i2) {
            n2 = string2.indexOf((int)c2, n4);
            stringArray[i2] = string2.substring(n4, n2);
            n4 = n2 + 1;
        }
        stringArray[n3] = string2.substring(n4, n5);
        return stringArray;
    }

    public static strictfp boolean r(String string2) {
        for (int i2 = 0; i2 < string2.length(); ++i2) {
            char c2 = string2.charAt(i2);
            if (Character.isDigit((char)c2) || c2 == '.' || c2 == '-' && i2 == 0) continue;
            return false;
        }
        return true;
    }

    public static strictfp boolean s(String string2) {
        boolean bl2 = false;
        for (int i2 = 0; i2 < string2.length(); ++i2) {
            char c2 = string2.charAt(i2);
            if (Character.isDigit((char)c2) || c2 == '-' && i2 == 0) continue;
            if (!bl2 && c2 == '.') {
                bl2 = true;
                continue;
            }
            return false;
        }
        return true;
    }

    public static final strictfp boolean j(float f2, float f3) {
        return com.corrodinggames.rts.gameFramework.f.c(f2 - f3) < 1.0E-4f;
    }

    public static final strictfp boolean k(float f2, float f3) {
        return com.corrodinggames.rts.gameFramework.f.c(f2 - f3) < 1.0E-7f;
    }

    public static strictfp boolean b(double d2, double d3) {
        return com.corrodinggames.rts.gameFramework.f.a(d2 - d3) < (double)1.0E-7f;
    }

    public static final strictfp boolean d(String string2, String string3) {
        if (string2 == null) {
            return string3 == null;
        }
        return string2.equals((Object)string3);
    }

    public static final strictfp boolean a(Integer n2, Integer n3) {
        if (n2 == null) {
            return n3 == null;
        }
        return n2.equals((Object)n3);
    }

    static {
        int n2;
        a = new Random();
        b = new Random();
        c = new PointF();
        j = new byte[1001];
        for (n2 = 0; n2 < j.length; ++n2) {
            com.corrodinggames.rts.gameFramework.f.j[n2] = (byte)StrictMath.round((float)com.corrodinggames.rts.gameFramework.f.a((float)n2));
        }
        d = new PointF();
        e = new PointF();
        f = new PointF();
        g = new PointF();
        h = new PointF();
        k = new char[36];
        for (n2 = 0; n2 < 10; ++n2) {
            com.corrodinggames.rts.gameFramework.f.k[n2] = (char)(48 + n2);
        }
        for (n2 = 10; n2 < 36; ++n2) {
            com.corrodinggames.rts.gameFramework.f.k[n2] = (char)(97 + n2 - 10);
        }
        l = new float[1025];
        m = new float[1025];
        n = new float[1025];
        o = new float[1025];
        p = new float[1025];
        q = new float[1025];
        r = new float[1025];
        s = new float[1025];
        for (n2 = 0; n2 <= 1024; ++n2) {
            float f2 = (float)n2 / 1024.0f;
            com.corrodinggames.rts.gameFramework.f.l[n2] = (float)(StrictMath.atan((double)f2) * 3.1415927410125732 / Math.PI);
            com.corrodinggames.rts.gameFramework.f.m[n2] = 1.5707964f - l[n2];
            com.corrodinggames.rts.gameFramework.f.n[n2] = -l[n2];
            com.corrodinggames.rts.gameFramework.f.o[n2] = l[n2] - 1.5707964f;
            com.corrodinggames.rts.gameFramework.f.p[n2] = (float)Math.PI - l[n2];
            com.corrodinggames.rts.gameFramework.f.q[n2] = l[n2] + 1.5707964f;
            com.corrodinggames.rts.gameFramework.f.r[n2] = l[n2] - (float)Math.PI;
            com.corrodinggames.rts.gameFramework.f.s[n2] = -1.5707964f - l[n2];
        }
        i = 0;
        t = new float[8192];
        u = new float[8192];
        for (n2 = 0; n2 < 8192; ++n2) {
            com.corrodinggames.rts.gameFramework.f.t[n2] = (float)StrictMath.sin((double)(((float)n2 + 0.5f) / 8192.0f * ((float)Math.PI * 2)));
            com.corrodinggames.rts.gameFramework.f.u[n2] = (float)StrictMath.cos((double)(((float)n2 + 0.5f) / 8192.0f * ((float)Math.PI * 2)));
        }
    }
}

