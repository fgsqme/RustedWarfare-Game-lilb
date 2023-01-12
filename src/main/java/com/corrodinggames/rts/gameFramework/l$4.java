/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileOutputStream
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.io.PrintStream
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 */
package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.j.n;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.utility.a;
import com.corrodinggames.rts.gameFramework.utility.e;
import com.corrodinggames.rts.gameFramework.y;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

strictfp final class l$4
implements e {
    l$4() {
    }

    @Override
    public void a(a a2) {
        if (l.dT) {
            l.b("activeANRWatchDog: ANR already detected");
        }
        l.dT = true;
        l.b("activeANRWatchDog: ANR detected");
        String string2 = l.a((Throwable)((Object)a2));
        n.a("detectedANR", string2);
        try {
            Thread.sleep((long)400L);
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        try {
            File file = y.a("lastFreeze", "", true);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            PrintStream printStream = new PrintStream((OutputStream)fileOutputStream);
            printStream.print(string2);
            printStream.close();
            fileOutputStream.close();
        }
        catch (IOException iOException) {
            throw new RuntimeException((Throwable)iOException);
        }
    }
}

