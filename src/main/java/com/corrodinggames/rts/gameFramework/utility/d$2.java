/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Override
 */
package com.corrodinggames.rts.gameFramework.utility;

import android.util.Log;
import com.corrodinggames.rts.gameFramework.utility.f;

final class d$2
implements f {
    d$2() {
    }

    @Override
    public void a(InterruptedException interruptedException) {
        Log.c("ANRWatchdog", "Interrupted: " + interruptedException.getMessage());
    }
}

