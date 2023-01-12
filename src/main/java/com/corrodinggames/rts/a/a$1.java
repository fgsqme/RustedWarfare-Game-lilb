/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.FileReader
 *  java.io.IOException
 *  java.io.Reader
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.corrodinggames.rts.a;

import com.corrodinggames.rts.a.a;
import com.corrodinggames.rts.gameFramework.l;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

strictfp final class a$1
implements Runnable {
    a$1() {
    }

    public void run() {
        for (String string2 : a.e) {
            l.e("Running debug script:" + string2);
            try {
                String string3;
                FileReader fileReader = new FileReader(string2);
                BufferedReader bufferedReader = new BufferedReader((Reader)fileReader);
                while ((string3 = bufferedReader.readLine()) != null) {
                    if ((string3 = string3.trim()).equals((Object)"") || string3.startsWith("#")) continue;
                    l.e("Running: " + string3);
                    String string4 = a.b("script " + string3);
                    l.e("got: " + string4.trim());
                }
                bufferedReader.close();
                fileReader.close();
            }
            catch (IOException iOException) {
                throw new RuntimeException((Throwable)iOException);
            }
            l.e("End of:" + string2);
        }
    }
}

