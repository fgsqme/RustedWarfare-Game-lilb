/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  java.lang.Object
 *  java.lang.String
 */
package com.corrodinggames.rts.appFramework;

import android.content.DialogInterface;
import com.corrodinggames.rts.appFramework.g;
import com.corrodinggames.rts.appFramework.g$6;

class g$6$1
implements DialogInterface.OnClickListener {
    final /* synthetic */ String a;
    final /* synthetic */ g$6 b;

    g$6$1(g$6 var1_1, String string2) {
        this.b = var1_1;
        this.a = string2;
    }

    public void onClick(DialogInterface dialogInterface, int n2) {
        g.a(this.b.b, this.a);
    }
}

