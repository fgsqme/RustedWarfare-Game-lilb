/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.HashMap
 */
package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.e.a;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.utility.ae;
import com.corrodinggames.rts.gameFramework.utility.af;
import com.corrodinggames.rts.gameFramework.utility.ag$1;
import com.corrodinggames.rts.gameFramework.utility.ah;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

public class ag
extends af {
    static HashMap a = new HashMap();

    public static void h(String string2) {
        l.e("Zip: " + string2);
    }

    @Override
    public boolean a(String string2) {
        if (string2.endsWith(".rwmod") || string2.endsWith(".rwmod/") || string2.endsWith(".rwmod\\")) {
            return true;
        }
        ah ah2 = ag.d(string2, true);
        if (ah2 == null) {
            return false;
        }
        return ah2.c(ag.l(string2));
    }

    @Override
    public String f(String string2) {
        return string2;
    }

    public static boolean i(String string2) {
        return string2.contains((CharSequence)".rwmod/") || string2.contains((CharSequence)".rwmod\\") || string2.endsWith(".rwmod");
    }

    @Override
    public boolean d(String string2) {
        if (string2.endsWith(".rwmod") || string2.endsWith(".rwmod/") || string2.endsWith(".rwmod\\")) {
            return true;
        }
        ah ah2 = ag.d(string2, true);
        if (ah2 == null) {
            return false;
        }
        return ah2.d(ag.l(string2));
    }

    @Override
    public boolean e(String string2) {
        ag.h("createDirectory not supported in zip files: " + string2);
        return false;
    }

    @Override
    public String[] b(String string2) {
        ah ah2 = ag.d(string2, true);
        if (ah2 == null) {
            return null;
        }
        return ah2.e(ag.l(string2));
    }

    @Override
    public long a(String string2, boolean bl2) {
        ah ah2 = ag.d(string2, bl2);
        if (ah2 == null) {
            return -1L;
        }
        String string3 = ag.l(string2);
        long l2 = ah2.h(string3);
        return l2;
    }

    @Override
    public j b(String string2, boolean bl2) {
        ah ah2 = ag.d(string2, bl2);
        if (ah2 == null) {
            return null;
        }
        String string3 = ag.l(string2);
        j j2 = ah2.i(string3);
        return j2;
    }

    @Override
    public long g(String string2) {
        String string3 = ag.j(string2);
        af af2 = ae.b(string3);
        if (af2 != null) {
            return af2.g(string3);
        }
        File file = new File(string3);
        return file.lastModified();
    }

    @Override
    public OutputStream c(String string2, boolean bl2) {
        ag.h("writableOutputSteam not supported in zip files: " + string2);
        return null;
    }

    @Override
    public boolean a(String string2, String string3) {
        ag.h("Rename not supported in zip files: " + string2 + " to " + string3);
        return false;
    }

    @Override
    public boolean c(String string2) {
        ag.h("Delete not supported in zip files: " + string2);
        return false;
    }

    public static String j(String string2) {
        int n2 = string2.indexOf(".rwmod/");
        int n3 = string2.indexOf(".rwmod\\");
        if (n3 != -1 && (n3 < n2 || n2 == -1)) {
            n2 = n3;
        }
        if (n2 == -1 && string2.endsWith(".rwmod")) {
            n2 = string2.length() - ".rwmod".length();
        }
        if (n2 == -1) {
            throw new RuntimeException("Could not find .rwmod in path: " + string2);
        }
        return string2.substring(0, n2 + ".rwmod".length());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ah d(String string2, boolean bl2) {
        String string3 = ag.j(string2);
        HashMap hashMap = a;
        synchronized (hashMap) {
            ah ah2 = (ah)a.get((Object)string3);
            if (ah2 == null) {
                String string4 = bl2 ? string3 : com.corrodinggames.rts.gameFramework.e.a.e(string3);
                try {
                    ah2 = new ah(string3, string4);
                }
                catch (IOException iOException) {
                    ag.h("Failed to open source zip: '" + string4 + "'");
                    iOException.printStackTrace();
                    String string5 = "Failed to open zip, " + iOException.getMessage();
                    String string6 = "";
                    if (com.corrodinggames.rts.gameFramework.e.a.g(string3)) {
                        ag.h("isDirectory: " + string3);
                        string5 = "Failed to open .rwmod file (Appears to be a directory!). Please remove .rwmod from any folder names.";
                    }
                    com.corrodinggames.rts.gameFramework.e.a.b(string5 + string6);
                    return null;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    ag.h("Failed to open source zip: '" + string4 + "'");
                    illegalArgumentException.printStackTrace();
                    com.corrodinggames.rts.gameFramework.e.a.b("Failed to open zip, " + illegalArgumentException.getMessage());
                    return null;
                }
                a.put((Object)string3, (Object)ah2);
            }
            return ah2;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void e(String string2, boolean bl2) {
        String string3 = ag.j(string2);
        HashMap hashMap = a;
        synchronized (hashMap) {
            ah ah2 = (ah)a.remove((Object)string3);
            if (ah2 != null) {
                l.e("Closing zip file: " + string3);
                ag$1 ag$1 = new ag$1(string3, ah2);
                new Thread((Runnable)ag$1).start();
            }
        }
    }

    public void k(String string2) {
        ag.e(string2, false);
    }

    @Override
    public void a() {
    }

    public static String l(String string2) {
        String string3 = ag.j(string2);
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
                ag.h("getPathInZip: Backtracking attempt out of zip: " + string4);
            }
            string4 = f.a((CharSequence)"/", (Iterable)arrayList);
        }
        return string4;
    }
}

