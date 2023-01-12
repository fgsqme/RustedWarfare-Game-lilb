/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Locale
 */
package android.graphics;

import java.util.HashMap;
import java.util.Locale;

public class Color {
    private static final HashMap a = new HashMap();

    public static int a(int n2) {
        return n2 >>> 24;
    }

    public static int b(int n2) {
        return n2 >> 16 & 0xFF;
    }

    public static int c(int n2) {
        return n2 >> 8 & 0xFF;
    }

    public static int d(int n2) {
        return n2 & 0xFF;
    }

    public static int a(int n2, int n3, int n4) {
        return 0xFF000000 | n2 << 16 | n3 << 8 | n4;
    }

    public static int a(int n2, int n3, int n4, int n5) {
        return n2 << 24 | n3 << 16 | n4 << 8 | n5;
    }

    public static int a(String string2) {
        if (string2.charAt(0) == '#') {
            long l2 = Long.parseLong((String)string2.substring(1), (int)16);
            if (string2.length() == 7) {
                l2 |= 0xFFFFFFFFFF000000L;
            } else if (string2.length() != 9) {
                throw new IllegalArgumentException("Unknown color");
            }
            return (int)l2;
        }
        Integer n2 = (Integer)a.get((Object)string2.toLowerCase(Locale.ROOT));
        if (n2 != null) {
            return n2;
        }
        throw new IllegalArgumentException("Unknown color");
    }

    static {
        a.put((Object)"black", (Object)-16777216);
        a.put((Object)"darkgray", (Object)-12303292);
        a.put((Object)"gray", (Object)-7829368);
        a.put((Object)"lightgray", (Object)-3355444);
        a.put((Object)"white", (Object)-1);
        a.put((Object)"red", (Object)-65536);
        a.put((Object)"green", (Object)-16711936);
        a.put((Object)"blue", (Object)-16776961);
        a.put((Object)"yellow", (Object)-256);
        a.put((Object)"cyan", (Object)-16711681);
        a.put((Object)"magenta", (Object)-65281);
        a.put((Object)"aqua", (Object)-16711681);
        a.put((Object)"fuchsia", (Object)-65281);
        a.put((Object)"darkgrey", (Object)-12303292);
        a.put((Object)"grey", (Object)-7829368);
        a.put((Object)"lightgrey", (Object)-3355444);
        a.put((Object)"lime", (Object)-16711936);
        a.put((Object)"maroon", (Object)-8388608);
        a.put((Object)"navy", (Object)-16777088);
        a.put((Object)"olive", (Object)-8355840);
        a.put((Object)"purple", (Object)-8388480);
        a.put((Object)"silver", (Object)-4144960);
        a.put((Object)"teal", (Object)-16744320);
    }
}

