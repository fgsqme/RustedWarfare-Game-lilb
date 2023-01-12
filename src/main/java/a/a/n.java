/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.ArrayList
 */
package a.a;

import a.a.h;
import a.a.h$1;
import java.io.IOException;
import java.util.ArrayList;

class n
implements Runnable {
    final /* synthetic */ h a;

    private n(h h2) {
        this.a = h2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        ArrayList arrayList = h.g(this.a);
        synchronized (arrayList) {
            for (a.a.a.h h2 : h.g(this.a)) {
                try {
                    h.c(this.a, h2);
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
            }
        }
    }

    /* synthetic */ n(h h2, h$1 h$1) {
        this(h2);
    }
}

