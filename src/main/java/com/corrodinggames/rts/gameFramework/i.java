/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 */
package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.b.b;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.j.n;
import com.corrodinggames.rts.gameFramework.l;

public class i
implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler a;

    i(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public synchronized void uncaughtException(Thread thread, Throwable throwable) {
        boolean bl2 = false;
        boolean bl3 = false;
        l l2 = null;
        try {
            l.dQ = null;
            l.dR = null;
            l.dP = null;
            System.gc();
            try {
                l.e("uncaughtException start");
                l2 = l.B();
                if (l2 != null && throwable instanceof OutOfMemoryError) {
                    l.e("Freeing memory");
                    try {
                        b.al = null;
                        if (l2.bL != null) {
                            l2.bL = null;
                        }
                        if (l2.bN != null) {
                            l2.bN.i();
                            l2.bN = null;
                        }
                        System.gc();
                        l.e("uncaughtException: Memory freed");
                    }
                    catch (Throwable throwable2) {
                        l.e("exception freeing memory");
                        throwable2.printStackTrace();
                    }
                }
                l.a("gameEngine:uncaughtExceptionHandler", throwable);
                String string2 = l.a(throwable);
                boolean bl4 = false;
                boolean bl5 = false;
                if (l2 != null) {
                    SettingsEngine settingsEngine = l2.bQ;
                    if (settingsEngine != null) {
                        bl4 = settingsEngine.sendReports;
                    } else {
                        l.e("CustomExceptionHandler: no settings");
                    }
                } else {
                    l.e("CustomExceptionHandler: no game");
                }
                if (l.dO) {
                    l.e("CustomExceptionHandler: a crash was already sent");
                    bl4 = false;
                    bl5 = true;
                }
                l.dO = true;
                if (bl4) {
                    try {
                        l.e("Starting errorReport");
                        n.a("uncaughtException", string2);
                        l.e("waiting");
                        Thread.sleep((long)800L);
                    }
                    catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                }
                if (!bl5 && l2 != null && l2.dH != null) {
                    l2.dH.a(throwable);
                }
                bl3 = true;
                l.e("fatal", string2);
            }
            catch (Exception exception) {
                l.e("exception sending crash");
                exception.printStackTrace();
            }
            if (l2 != null) {
                if (l2.dH != null && l2.dH.a()) {
                    l.e("gameCrashesDontExit=true");
                    bl2 = true;
                    return;
                }
                if (l2.bX != null && l2.bX.B) {
                    l.e("Sending disconnect");
                    l2.bX.c("Game crash");
                }
            }
            if (!l.az) {
                if (this.a != null) {
                    l.e("CustomExceptionHandler: sending to: defaultUEH.uncaughtException");
                    this.a.uncaughtException(thread, throwable);
                    l.e("CustomExceptionHandler: back from: defaultUEH.uncaughtException");
                } else {
                    l.e("CustomExceptionHandler: defaultUEH==null");
                    System.exit((int)2);
                }
            }
            l.av = throwable;
            bl2 = true;
        }
        catch (Throwable throwable3) {
            l.e("Exception in uncaughtException");
            throwable3.printStackTrace();
        }
        finally {
            if (!bl2) {
                l.e("Crash was not handled, exiting");
                Runtime.getRuntime().halt(1);
            }
        }
    }
}

