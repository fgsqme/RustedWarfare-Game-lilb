/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileNotFoundException
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.InstantiationException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Enumeration
 *  java.util.zip.ZipEntry
 *  java.util.zip.ZipFile
 */
package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.appFramework.c;
import com.corrodinggames.rts.gameFramework.br;
import com.corrodinggames.rts.gameFramework.e.a;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.utility.ae;
import com.corrodinggames.rts.gameFramework.utility.af;
import com.corrodinggames.rts.gameFramework.utility.ag;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class ah {
    String a = "";
    String b;
    ZipFile c;
    String[] d;
    boolean e;

    public ah(String string2, String string3) {
        this.b = string2;
        l.g("Opening new zip at: " + string3);
        af af2 = ae.b(string3);
        if (af2 != null) {
            l.e("Temp file needed for zip with SAF interface");
            if (!l.at()) {
                throw new IOException("Failed to open source zip with mapper: " + string3);
            }
            long l2 = br.a();
            j j2 = af2.b(string3, true);
            if (j2 == null) {
                throw new IOException("Failed to open file of zip: " + string3);
            }
            this.c = ah.a(j2, null);
            double d2 = br.a(l2);
            l.e("Streamed zip open took:" + br.a(d2));
        } else {
            this.c = new ZipFile(string3);
        }
        try {
            this.b();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            ag.h("Failed to open source zip with unicode encoding, attempting with ISO-8859-1");
            Charset charset = Charset.forName((String)"ISO-8859-1");
            try {
                if (af2 != null) {
                    l.e("Temp file needed for zip with SAF interface");
                    if (!l.at()) {
                        throw new IOException("Failed to open source zip with mapper: " + string3);
                    }
                    long l3 = br.a();
                    j j3 = af2.b(string3, true);
                    this.c = ah.a(j3, charset);
                    double d3 = br.a(l3);
                    l.e("Streamed zip open took:" + br.a(d3));
                } else {
                    this.c = ah.a(string3, charset);
                }
            }
            catch (RuntimeException runtimeException) {
                illegalArgumentException.printStackTrace();
                throw new IOException("Failed to open source zip with unicode and ISO-8859-1 encoding", (Throwable)runtimeException);
            }
            this.b();
        }
    }

    public void a() {
        if (!this.e) {
            this.e = true;
            if (this.c != null) {
                try {
                    this.c.close();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static ZipFile a(InputStream inputStream, Charset charset) {
        File file = com.corrodinggames.rts.gameFramework.e.a.a(com.corrodinggames.rts.appFramework.c.a(), "safMod", "zip");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            f.a(inputStream, (OutputStream)fileOutputStream);
            fileOutputStream.close();
            inputStream.close();
            if (charset == null) {
                ZipFile zipFile = new ZipFile(file);
                return zipFile;
            }
            ZipFile zipFile = ah.a(file.getAbsolutePath(), charset);
            return zipFile;
        }
        finally {
            file.delete();
        }
    }

    public static ZipFile a(String string2, Charset charset) {
        Class[] classArray = new Class[]{String.class, Charset.class};
        Constructor constructor = null;
        try {
            constructor = ZipFile.class.getDeclaredConstructor(classArray);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            noSuchMethodException.printStackTrace();
        }
        catch (SecurityException securityException) {
            securityException.printStackTrace();
        }
        if (constructor == null) {
            throw new IOException("Failed to open source zip with unicode encoding, and no method for ISO-8859-1");
        }
        Object[] objectArray = new Object[]{string2, charset};
        try {
            return (ZipFile)constructor.newInstance(objectArray);
        }
        catch (InstantiationException instantiationException) {
            throw new IOException((Throwable)instantiationException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new IOException((Throwable)illegalAccessException);
        }
        catch (InvocationTargetException invocationTargetException) {
            throw new IOException((Throwable)invocationTargetException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new IOException((Throwable)illegalArgumentException);
        }
    }

    public void b() {
        double d2;
        String[] stringArray;
        long l2 = br.a();
        ArrayList arrayList = new ArrayList();
        Enumeration enumeration = this.c.entries();
        while (enumeration.hasMoreElements()) {
            stringArray = (String[])enumeration.nextElement();
            String string2 = stringArray.getName();
            if (string2 == null) {
                throw new RuntimeException("filePath==null");
            }
            arrayList.add((Object)string2);
        }
        this.d = (String[])arrayList.toArray((Object[])new String[0]);
        this.a = "";
        stringArray = this.e("");
        if (stringArray.length == 1 && this.d(stringArray[0])) {
            this.a = stringArray[0] + "/";
            for (int i2 = 0; i2 < this.d.length; ++i2) {
                if (!this.d[i2].startsWith(this.a)) continue;
                this.d[i2] = this.d[i2].substring(this.a.length());
            }
        }
        if ((d2 = (double)br.a(l2)) > 3.0) {
            l.e("zip: buildCache for: " + this.b + ", took:" + br.a(d2));
        }
    }

    public void a(String string2) {
        l.e("Zip: " + string2);
    }

    public boolean b(String string2) {
        for (String string3 : this.d) {
            if (!string3.equals((Object)string2)) continue;
            return true;
        }
        return false;
    }

    public boolean c(String string2) {
        for (String string3 : this.d) {
            if (!string3.equals((Object)string2)) continue;
            return true;
        }
        for (String string3 : this.d) {
            if (!string3.equalsIgnoreCase(string2)) continue;
            return true;
        }
        return false;
    }

    public boolean d(String string2) {
        if (!string2.endsWith("/")) {
            string2 = string2 + "/";
        }
        if (string2.equals((Object)"/")) {
            return true;
        }
        for (String string3 : this.d) {
            if (!string3.contains((CharSequence)string2)) continue;
            return true;
        }
        return false;
    }

    public String[] e(String string2) {
        if (string2.equals((Object)"") || string2.equals((Object)"/") || string2.equals((Object)"\\")) {
            string2 = "";
        } else if (!string2.endsWith("/")) {
            string2 = string2 + "/";
        }
        ArrayList arrayList = new ArrayList();
        for (String string3 : this.d) {
            String string4;
            if (!string2.equals((Object)"") && !string3.startsWith(string2) || (string4 = string3.substring(string2.length())).length() == 0 || string4.equals((Object)"..")) continue;
            if (string4.contains((CharSequence)"/")) {
                if (arrayList.contains((Object)(string4 = string4.substring(0, string4.indexOf("/"))))) continue;
                arrayList.add((Object)string4);
                continue;
            }
            arrayList.add((Object)string4);
        }
        return (String[])arrayList.toArray((Object[])new String[0]);
    }

    public ZipEntry f(String string2) {
        String string3 = this.a + string2;
        ZipEntry zipEntry = null;
        IllegalArgumentException illegalArgumentException = null;
        try {
            zipEntry = this.c.getEntry(string3);
        }
        catch (IllegalArgumentException illegalArgumentException2) {
            illegalArgumentException = illegalArgumentException2;
        }
        if (zipEntry == null && this.b(string2) && !this.d(string2)) {
            Enumeration enumeration = this.c.entries();
            while (enumeration.hasMoreElements()) {
                ZipEntry zipEntry2;
                try {
                    zipEntry2 = (ZipEntry)enumeration.nextElement();
                }
                catch (IllegalArgumentException illegalArgumentException3) {
                    illegalArgumentException3.printStackTrace();
                    continue;
                }
                String string4 = zipEntry2.getName();
                if (!string4.equals((Object)string3)) continue;
                return zipEntry2;
            }
            this.a("getEntry: Still did not find file after workaround");
        }
        if (illegalArgumentException != null) {
            throw new RuntimeException("Failed to decode data in zip: " + string2 + " (Check zip encoding, utf-8 is recommended)", (Throwable)illegalArgumentException);
        }
        return zipEntry;
    }

    public String g(String string2) {
        String string3 = string2;
        if (!string3.endsWith("/")) {
            string3 = string3 + "/";
        }
        for (String string4 : this.d) {
            if (!string4.equals((Object)string2)) continue;
            return string4;
        }
        for (String string4 : this.d) {
            if (!string4.equals((Object)string3)) continue;
            return string4;
        }
        for (String string4 : this.d) {
            if (!string4.equalsIgnoreCase(string2)) continue;
            return string4;
        }
        for (String string4 : this.d) {
            if (!string4.equalsIgnoreCase(string3)) continue;
            return string4;
        }
        return string2;
    }

    public long h(String string2) {
        ZipEntry zipEntry = this.f(string2);
        if (zipEntry == null) {
            this.a("getEntrySize: File not found: " + string2);
            return -1L;
        }
        return zipEntry.getSize();
    }

    public j i(String string2) {
        j j2;
        InputStream inputStream;
        ZipEntry zipEntry = this.f(string2);
        if (zipEntry == null) {
            zipEntry = this.f(this.g(string2));
        }
        if (zipEntry == null) {
            return null;
        }
        try {
            inputStream = this.c.getInputStream(zipEntry);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
        try {
            j2 = new j(inputStream, this.b + "/" + string2);
        }
        catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
            return null;
        }
        return j2;
    }
}

