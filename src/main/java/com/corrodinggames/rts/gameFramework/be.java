/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Environment
 *  java.io.DataInputStream
 *  java.io.DataOutputStream
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.HashMap
 */
package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.bf;
import com.corrodinggames.rts.gameFramework.l;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;

public strictfp class be {
    public boolean a = false;
    String b = "rtsSave";
    String c = "rtsSave.bak";
    public boolean d = false;
    static be e = null;
    HashMap f = new HashMap();

    public void a(Context context) {
        DataOutputStream dataOutputStream;
        FileOutputStream fileOutputStream;
        if (l.aU) {
            return;
        }
        if (this.a) {
            return;
        }
        try {
            if (context == null) {
                throw new IOException("context==null");
            }
            try {
                fileOutputStream = context.b(this.b, 0);
            }
            catch (NullPointerException nullPointerException) {
                throw new IOException("openFileOutput NullPointerException", (Throwable)nullPointerException);
            }
            dataOutputStream = new DataOutputStream((OutputStream)fileOutputStream);
            this.a(dataOutputStream);
            dataOutputStream.close();
            fileOutputStream.close();
        }
        catch (FileNotFoundException fileNotFoundException) {
            Log.b("RustedWarfare", "file save error:", fileNotFoundException);
        }
        catch (IOException iOException) {
            Log.b("RustedWarfare", "file save error:", iOException);
        }
        if (this.d) {
            try {
                fileOutputStream = new File(Environment.getExternalStorageDirectory() + "/" + this.c);
                dataOutputStream = new FileOutputStream((File)fileOutputStream);
                DataOutputStream dataOutputStream2 = new DataOutputStream((OutputStream)dataOutputStream);
                this.a(dataOutputStream2);
                dataOutputStream2.close();
                dataOutputStream.close();
            }
            catch (IOException iOException) {
                Log.b("RustedWarfare", "file read error:", iOException);
            }
        }
    }

    public boolean a(DataOutputStream dataOutputStream) {
        if (l.aU) {
            return false;
        }
        try {
            dataOutputStream.writeInt(1);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(this.f.size());
            for (bf bf2 : this.f.values()) {
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(bf2.a);
                dataOutputStream.writeUTF(bf2.b);
                dataOutputStream.writeInt(bf2.c);
                dataOutputStream.writeBoolean(bf2.d);
                dataOutputStream.writeBoolean(bf2.e);
                dataOutputStream.writeBoolean(bf2.f);
                dataOutputStream.writeLong(bf2.g);
                dataOutputStream.writeInt(bf2.h);
            }
            dataOutputStream.flush();
            return true;
        }
        catch (IOException iOException) {
            Log.b("RustedWarfare", "file save error:", iOException);
            return false;
        }
    }

    public void b(Context context) {
        DataInputStream dataInputStream;
        FileInputStream fileInputStream;
        if (this.a) {
            return;
        }
        boolean bl2 = false;
        Log.d("RustedWarfare", "Trying to load from internal memory");
        try {
            fileInputStream = context.a(this.b);
            dataInputStream = new DataInputStream((InputStream)fileInputStream);
            bl2 = this.a(dataInputStream);
            if (bl2) {
                Log.d("RustedWarfare", "loaded from internal memory");
            }
            fileInputStream.close();
        }
        catch (IOException iOException) {
            Log.b("RustedWarfare", "file read error:", iOException);
        }
        if (this.d && !bl2) {
            Log.d("RustedWarfare", "Trying to load from SD");
            try {
                fileInputStream = new File(Environment.getExternalStorageDirectory() + "/" + this.c);
                dataInputStream = new FileInputStream((File)fileInputStream);
                DataInputStream dataInputStream2 = new DataInputStream((InputStream)dataInputStream);
                bl2 = this.a(dataInputStream2);
                if (bl2) {
                    Log.d("RustedWarfare", "loaded from SD");
                }
                dataInputStream2.close();
                dataInputStream.close();
            }
            catch (IOException iOException) {
                Log.b("RustedWarfare", "file read error:", iOException);
            }
        }
    }

    public boolean a(DataInputStream dataInputStream) {
        try {
            int n2 = dataInputStream.readInt();
            if (n2 > 1) {
                Log.d("RustedWarfare", "Warning file is at version:" + n2);
                return false;
            }
            dataInputStream.readInt();
            int n3 = dataInputStream.readInt();
            this.f.clear();
            for (int i2 = 0; i2 < n3; ++i2) {
                bf bf2 = new bf(this);
                dataInputStream.readInt();
                bf2.a = dataInputStream.readInt();
                String string2 = dataInputStream.readUTF();
                if (string2.equals((Object)"maps/challenge/l030;Level 5.tmx")) {
                    Log.d("RustedWarfare", "converting:" + string2);
                    string2 = "maps/challenge/l090;Level 7.tmx";
                }
                bf2.b = string2;
                bf2.c = dataInputStream.readInt();
                bf2.d = dataInputStream.readBoolean();
                bf2.e = dataInputStream.readBoolean();
                bf2.f = dataInputStream.readBoolean();
                bf2.g = dataInputStream.readLong();
                bf2.h = dataInputStream.readInt();
                this.f.put((Object)this.a(bf2.b), (Object)bf2);
            }
            return true;
        }
        catch (IOException iOException) {
            Log.b("RustedWarfare", "file read error:", iOException);
            return false;
        }
    }

    public static be c(Context context) {
        if (e == null) {
            e = new be(context);
            if (!l.aU) {
                e.b(context);
            }
        }
        return e;
    }

    private be(Context context) {
    }

    public String a(String string2) {
        Integer n2 = l.l(string2);
        if (n2 != null) {
            return l.j(string2) + "/l" + n2;
        }
        return string2;
    }

    public bf b(String string2) {
        String string3 = this.a(string2);
        bf bf2 = (bf)this.f.get((Object)string3);
        Log.d("RustedWarfare", "StateEngine: get(" + string2 + ")=" + bf2 + "  (key=" + string3 + ")");
        if (bf2 == null) {
            bf2 = new bf(this);
            bf2.a = 1;
            bf2.b = string2;
            this.f.put((Object)string3, (Object)bf2);
        }
        return bf2;
    }
}

