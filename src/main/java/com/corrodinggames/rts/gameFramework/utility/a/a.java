/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.HashMap
 */
package com.corrodinggames.rts.gameFramework.utility.a;

import android.net.Uri;
import com.corrodinggames.rts.appFramework.android.AndroidSAF;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.utility.a.b;
import com.corrodinggames.rts.gameFramework.utility.af;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class a
extends af {
    static AndroidSAF a = AndroidSAF.getInstance();
    static HashMap b = new HashMap();
    public static int c = 1;

    public static void h(String string2) {
        l.e("Saf: " + string2);
    }

    public static void i(String string2) {
    }

    public static void j(String string2) {
        l.e("Saf: " + string2);
    }

    public static void k(String string2) {
    }

    public static boolean l(String string2) {
        return string2.contains((CharSequence)".[saflink]/") || string2.contains((CharSequence)".[saflink]\\") || string2.endsWith(".[saflink]");
    }

    public static String m(String string2) {
        int n2 = string2.indexOf(".[saflink]/");
        int n3 = string2.indexOf(".[saflink]\\");
        if (n3 != -1 && (n3 < n2 || n2 == -1)) {
            n2 = n3;
        }
        if (n2 == -1 && string2.endsWith(".[saflink]")) {
            n2 = string2.length() - ".[saflink]".length();
        }
        if (n2 == -1) {
            throw new RuntimeException("Could not find saf link in path: " + string2);
        }
        return string2.substring(0, n2 + ".[saflink]".length());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static b d(String string2, boolean bl2) {
        String string3 = com.corrodinggames.rts.gameFramework.utility.a.a.m(string2);
        HashMap hashMap = b;
        synchronized (hashMap) {
            b b2 = (b)b.get((Object)string3);
            if (b2 == null) {
                com.corrodinggames.rts.gameFramework.e.a.b("Folder link no longer open");
                return null;
            }
            return b2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void a() {
        HashMap hashMap = b;
        synchronized (hashMap) {
            for (b b2 : b.values()) {
                b2.a();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static String a(Uri uri, boolean bl2) {
        l.e("createSAFLink: " + uri);
        HashMap hashMap = b;
        synchronized (hashMap) {
            String string2 = "/saf-virtual/" + c + ".[saflink]";
            ++c;
            b b2 = com.corrodinggames.rts.gameFramework.utility.a.a.a(uri, bl2, string2);
            if (b2 == null) {
                return null;
            }
            return string2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static b a(Uri uri, boolean bl2, String string2) {
        l.e("createSAFLink: " + uri + " to " + string2);
        HashMap hashMap = b;
        synchronized (hashMap) {
            b b2 = (b)b.get((Object)string2);
            if (b2 != null) {
                l.b("createSAFLink: Already open");
            }
            b b3 = new b(uri, bl2);
            try {
                b3.b();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
                com.corrodinggames.rts.gameFramework.e.a.b("Failed to list files: " + iOException.getMessage());
                return null;
            }
            b.put((Object)string2, (Object)b3);
            return b3;
        }
    }

    public static String n(String string2) {
        String string3 = com.corrodinggames.rts.gameFramework.utility.a.a.m(string2);
        String string4 = string2.substring(string3.length());
        if (string4.startsWith("/") || string4.startsWith("\\")) {
            string4 = string4.substring(1);
        }
        if (string4.startsWith("/") || string4.startsWith("\\")) {
            string4 = string4.substring(1);
        }
        if (string4.contains((CharSequence)"\\")) {
            string4 = string4.replace((CharSequence)"\\", (CharSequence)"/");
        }
        if (string4.contains((CharSequence)"..")) {
            String[] stringArray = f.c(string4, '/');
            ArrayList arrayList = new ArrayList(stringArray.length);
            int n2 = 0;
            for (int i2 = stringArray.length - 1; i2 >= 0; --i2) {
                if (stringArray[i2].equals((Object)"..")) {
                    ++n2;
                    continue;
                }
                if (n2 > 0) {
                    --n2;
                    continue;
                }
                arrayList.add(0, (Object)stringArray[i2]);
            }
            if (n2 != 0) {
                com.corrodinggames.rts.gameFramework.utility.a.a.j("getPathInZip: Backtracking attempt out of zip: " + string4);
            }
            string4 = f.a((CharSequence)"/", (Iterable)arrayList);
        }
        return string4;
    }

    @Override
    public boolean a(String string2) {
        if (string2.endsWith(".[saflink]") || string2.endsWith(".[saflink]/") || string2.endsWith(".[saflink]\\")) {
            return true;
        }
        b b2 = com.corrodinggames.rts.gameFramework.utility.a.a.d(string2, true);
        if (b2 == null) {
            com.corrodinggames.rts.gameFramework.utility.a.a.h("fileExists failed to open for: " + string2);
            return false;
        }
        try {
            return b2.a(com.corrodinggames.rts.gameFramework.utility.a.a.n(string2));
        }
        catch (IOException iOException) {
            com.corrodinggames.rts.gameFramework.utility.a.a.i("fileExists failed for: " + string2);
            return false;
        }
    }

    @Override
    public String f(String string2) {
        if (string2.endsWith(".[saflink]") || string2.endsWith(".[saflink]/") || string2.endsWith(".[saflink]\\")) {
            return string2;
        }
        b b2 = com.corrodinggames.rts.gameFramework.utility.a.a.d(string2, true);
        if (b2 == null) {
            com.corrodinggames.rts.gameFramework.utility.a.a.j("convertAbstractPathForDebug failed for: " + string2);
            return string2;
        }
        return b2.c + "/" + com.corrodinggames.rts.gameFramework.utility.a.a.n(string2);
    }

    @Override
    public boolean d(String string2) {
        if (string2.endsWith(".[saflink]") || string2.endsWith(".[saflink]/") || string2.endsWith(".[saflink]\\")) {
            return true;
        }
        b b2 = com.corrodinggames.rts.gameFramework.utility.a.a.d(string2, true);
        if (b2 == null) {
            return false;
        }
        try {
            return b2.h(com.corrodinggames.rts.gameFramework.utility.a.a.n(string2));
        }
        catch (IOException iOException) {
            com.corrodinggames.rts.gameFramework.utility.a.a.i("isDirectory failed for: " + string2);
            return false;
        }
    }

    @Override
    public boolean e(String string2) {
        if (string2.endsWith(".[saflink]") || string2.endsWith(".[saflink]/") || string2.endsWith(".[saflink]\\")) {
            com.corrodinggames.rts.gameFramework.utility.a.a.i("createDirectory on root path: " + string2);
            return false;
        }
        b b2 = com.corrodinggames.rts.gameFramework.utility.a.a.d(string2, true);
        if (b2 == null) {
            com.corrodinggames.rts.gameFramework.utility.a.a.j("createDirectory failed for: " + string2);
            return false;
        }
        try {
            return b2.j(com.corrodinggames.rts.gameFramework.utility.a.a.n(string2));
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
            return false;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
            return false;
        }
    }

    @Override
    public String[] b(String string2) {
        b b2 = com.corrodinggames.rts.gameFramework.utility.a.a.d(string2, true);
        if (b2 == null) {
            return null;
        }
        try {
            return b2.g(com.corrodinggames.rts.gameFramework.utility.a.a.n(string2));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            com.corrodinggames.rts.gameFramework.e.a.b("Failed to open saf, " + iOException.getMessage());
            return null;
        }
    }

    @Override
    public long a(String string2, boolean bl2) {
        b b2 = com.corrodinggames.rts.gameFramework.utility.a.a.d(string2, bl2);
        if (b2 == null) {
            com.corrodinggames.rts.gameFramework.utility.a.a.j("saf==null: for '" + string2 + "'");
            return -1L;
        }
        String string3 = com.corrodinggames.rts.gameFramework.utility.a.a.n(string2);
        long l2 = b2.d(string3);
        return l2;
    }

    @Override
    public j b(String string2, boolean bl2) {
        j j2;
        b b2 = com.corrodinggames.rts.gameFramework.utility.a.a.d(string2, bl2);
        if (b2 == null) {
            com.corrodinggames.rts.gameFramework.utility.a.a.j("openAssetSteam: saf==null: for '" + string2 + "'");
            return null;
        }
        String string3 = com.corrodinggames.rts.gameFramework.utility.a.a.n(string2);
        try {
            j2 = b2.b(string3);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            com.corrodinggames.rts.gameFramework.utility.a.a.j("Error opening: '" + string3 + "' in: '" + string2 + "'");
            return null;
        }
        if (j2 == null) {
            com.corrodinggames.rts.gameFramework.utility.a.a.k("openAssetSteam: Failed to find: '" + string3 + "' in: '" + string2 + "'");
        }
        return j2;
    }

    @Override
    public long g(String string2) {
        long l2;
        b b2 = com.corrodinggames.rts.gameFramework.utility.a.a.d(string2, true);
        if (b2 == null) {
            com.corrodinggames.rts.gameFramework.utility.a.a.h("saf==null: for '" + string2 + "'");
            return 0L;
        }
        String string3 = com.corrodinggames.rts.gameFramework.utility.a.a.n(string2);
        try {
            l2 = b2.c(string3);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return 0L;
        }
        return l2;
    }

    @Override
    public OutputStream c(String string2, boolean bl2) {
        b b2 = com.corrodinggames.rts.gameFramework.utility.a.a.d(string2, true);
        if (b2 == null) {
            return null;
        }
        String string3 = com.corrodinggames.rts.gameFramework.utility.a.a.n(string2);
        OutputStream outputStream = b2.a(string3, bl2);
        if (outputStream == null) {
            com.corrodinggames.rts.gameFramework.utility.a.a.j("Failed to find: '" + string3 + "' in: '" + string2 + "'");
        }
        return outputStream;
    }

    @Override
    public boolean a(String string2, String string3) {
        com.corrodinggames.rts.gameFramework.utility.a.a.h("Rename: " + string2 + " to " + string3);
        b b2 = com.corrodinggames.rts.gameFramework.utility.a.a.d(string2, true);
        if (b2 == null) {
            return false;
        }
        String string4 = com.corrodinggames.rts.gameFramework.utility.a.a.n(string2);
        String string5 = com.corrodinggames.rts.gameFramework.utility.a.a.n(string3);
        com.corrodinggames.rts.gameFramework.utility.a.a.i("Relative path: " + string4 + " to " + string5);
        return b2.a(string4, string5);
    }

    @Override
    public boolean c(String string2) {
        com.corrodinggames.rts.gameFramework.utility.a.a.h("deleteFile: " + string2);
        b b2 = com.corrodinggames.rts.gameFramework.utility.a.a.d(string2, true);
        if (b2 == null) {
            com.corrodinggames.rts.gameFramework.utility.a.a.j("saf==null: for deleteFile: '" + string2 + "'");
            return false;
        }
        String string3 = com.corrodinggames.rts.gameFramework.utility.a.a.n(string2);
        return b2.e(string3);
    }
}

