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

import a.a.a.e;
import a.a.h;
import a.a.h$1;
import java.io.IOException;
import java.util.ArrayList;

class l
implements Runnable {
    final /* synthetic */ h a;

    private l(h h2) {
        this.a = h2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        ArrayList arrayList = h.g(this.a);
        synchronized (arrayList) {
            block6: {
                if (h.g(this.a).isEmpty()) {
                    try {
                        h.b(this.a, new e(h.h(this.a).a()));
                    }
                    catch (IOException iOException) {
                        if (!h.h()) break block6;
                        iOException.printStackTrace();
                    }
                }
            }
        }
    }

    /* synthetic */ l(h h2, h$1 h$1) {
        this(h2);
    }
}

