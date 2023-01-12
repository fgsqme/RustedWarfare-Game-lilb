/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.Toast
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.widget.Toast;
import com.corrodinggames.rts.gameFramework.l;

class l$1
implements Runnable {
    final /* synthetic */ l a;

    l$1(l l2) {
        this.a = l2;
    }

    public void run() {
        String string2 = this.a.dE;
        try {
            if (string2 == null) {
                l.b("Cannot show toast, no message");
                return;
            }
            int n2 = 1;
            Toast toast = Toast.makeText((Context)this.a.am, (CharSequence)string2, (int)n2);
            toast.show();
        }
        catch (Exception exception) {
            l.b("Error showing toast: " + string2);
            exception.printStackTrace();
        }
    }
}

