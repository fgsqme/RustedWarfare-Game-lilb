/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 */
package com.corrodinggames.rts.gameFramework.e;

import java.io.IOException;
import java.io.InputStream;

class h {
    public InputStream a;

    public h(InputStream inputStream) {
        this.a = inputStream;
    }

    public void a() {
        try {
            if (this.a != null) {
                this.a.close();
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
    }
}

