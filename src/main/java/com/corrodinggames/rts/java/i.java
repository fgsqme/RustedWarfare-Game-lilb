/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.awt.Toolkit
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  org.lwjgl.Sys
 */
package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.a.a;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.n;
import com.corrodinggames.rts.java.Main;
import com.corrodinggames.rts.java.i$1;
import com.corrodinggames.rts.java.i$2;
import java.awt.Toolkit;
import org.lwjgl.Sys;

public class i
extends n {
    Main a;

    public i(Main main) {
        this.a = main;
    }

    @Override
    public void a(String string2, int n2) {
        l.e("slick queuing-alert:" + string2);
        ScriptEngine.getInstance().addRunnableToQueue(new i$1(this, string2));
    }

    @Override
    public void a(String string2, String string3) {
        l.e("slick queuing-messageBox:" + string3);
        ScriptEngine.getInstance().addRunnableToQueue(new i$2(this, string3, string2));
    }

    @Override
    public void a(String string2, boolean bl2) {
        l l2 = l.B();
        if (l2 != null && l2.bj) {
            return;
        }
        if (this.a.j != null) {
            this.a.j.a(string2, bl2);
        }
    }

    @Override
    public void d() {
        l.e("refreshModDisplay");
        ScriptEngine.getInstance().addScriptToQueue("mods.refreshModList()");
    }

    @Override
    public void a(Throwable throwable) {
        this.a(throwable, true);
    }

    public void a(Throwable throwable, boolean bl2) {
        try {
            l.e("----------- onGameCrash ----------");
            Toolkit.getDefaultToolkit();
            String string2 = l.b(throwable);
            String string3 = string2 + "\nCheck logs for more details";
            l.e("Error message: " + string3);
            if (com.corrodinggames.rts.a.a.a()) {
                l.e("onGameCrash: Not showing popup message due to active debugSocket");
                System.exit((int)1);
                return;
            }
            if (throwable != null && throwable instanceof OutOfMemoryError && !com.corrodinggames.rts.game.i.b) {
                string3 = string3 + " (You are also using the 32 bit version, switching to the 64 bit version might help with out of memory)";
            }
            Sys.alert((String)"Crash", (String)string3);
            try {
                Thread.sleep((long)1000L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
            l.e("onGameCrash: end");
        }
        catch (Throwable throwable2) {
            l.e("exception showing message");
            throwable2.printStackTrace();
        }
    }

    @Override
    public boolean b() {
        return !l.B().I() && !this.a.p.b();
    }

    @Override
    public boolean c() {
        return com.corrodinggames.rts.a.a.a();
    }
}

