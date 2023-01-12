/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 */
package com.corrodinggames.rts.gameFramework;

import android.media.MediaPlayer;
import com.corrodinggames.rts.gameFramework.am;
import com.corrodinggames.rts.gameFramework.ao;
import com.corrodinggames.rts.gameFramework.ap;
import com.corrodinggames.rts.gameFramework.aq;
import com.corrodinggames.rts.gameFramework.ar;
import com.corrodinggames.rts.gameFramework.as;
import com.corrodinggames.rts.gameFramework.l;
import java.util.ArrayList;
import java.util.Collection;

public class an
extends aq {
    ArrayList a = new ArrayList();
    ArrayList b = new ArrayList();
    ArrayList c = new ArrayList();
    boolean d = false;

    @Override
    public ar a(String string2) {
        return new ao(string2, this);
    }

    @Override
    public as a() {
        ap ap2 = new ap(this);
        return ap2;
    }

    @Override
    public void a(am am2) {
        this.e = am2;
        if (this.d) {
            l.e("AndroidMusicFactory already loaded");
        }
        l.e("AndroidMusicFactory - load");
        this.d = true;
        this.a.add((Object)new MediaPlayer());
        this.a.add((Object)new MediaPlayer());
        this.b.addAll((Collection)this.a);
    }

    @Override
    public void b() {
    }
}

