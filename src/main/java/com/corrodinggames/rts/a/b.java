/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.io.InputStreamReader
 *  java.io.PrintWriter
 *  java.io.Reader
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.net.Socket
 */
package com.corrodinggames.rts.a;

import com.corrodinggames.rts.a.a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.Socket;

public strictfp class b
implements Runnable {
    Socket a;
    final /* synthetic */ a b;

    public b(a a2, Socket socket) {
        this.b = a2;
        this.a = socket;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        try {
            PrintWriter printWriter = new PrintWriter(this.a.getOutputStream(), true);
            BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader(this.a.getInputStream()));
            while (this.b.b) {
                String string2 = bufferedReader.readLine();
                if (string2 == null) {
                    break;
                }
                String string3 = com.corrodinggames.rts.a.a.b(string2);
                printWriter.print(string3);
                printWriter.flush();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        finally {
            try {
                this.a.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
    }
}

