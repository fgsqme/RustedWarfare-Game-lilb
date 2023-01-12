/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Thread
 */
package com.corrodinggames.rts.gameFramework;

import android.util.Log;
import com.corrodinggames.rts.gameFramework.am;

class am$1
extends Thread {
    final /* synthetic */ am a;

    am$1(am am2) {
        this.a = am2;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void run() {
        if (this.a.j) {
            Log.a("RustedWarfare", "Music:pause() unsynchronized");
            this.a.g();
        } else {
            Object object = this.a.b;
            synchronized (object) {
                Log.a("RustedWarfare", "Music:pause() synchronized");
                this.a.g();
            }
        }
    }
}

