/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.am;
import com.corrodinggames.rts.gameFramework.aq;
import com.corrodinggames.rts.gameFramework.ar;
import com.corrodinggames.rts.gameFramework.as;
import com.corrodinggames.rts.gameFramework.aw;
import com.corrodinggames.rts.gameFramework.ax;
import com.corrodinggames.rts.gameFramework.l;

public class av
extends aq {
    boolean a = false;

    @Override
    public ar a(String string2) {
        return new aw(string2, this);
    }

    @Override
    public as a() {
        ax ax2 = new ax(this);
        return ax2;
    }

    @Override
    public void a(am am2) {
        l.e("Null musicFactory - load");
        this.e = am2;
    }

    @Override
    public void b() {
    }
}

