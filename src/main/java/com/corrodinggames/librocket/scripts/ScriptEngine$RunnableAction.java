/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.Throwable
 */
package com.corrodinggames.librocket.scripts;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.librocket.scripts.ScriptEngine$Action;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.l;

public class ScriptEngine$RunnableAction
extends ScriptEngine$Action {
    Runnable runnable;

    ScriptEngine$RunnableAction(Runnable runnable) {
        this.runnable = runnable;
    }

    @Override
    public void run(ScriptEngine scriptEngine) {
        block6: {
            try {
                this.runnable.run();
            }
            catch (Exception exception) {
                if (this.tryToCatchCrash) {
                    l.a("caught script crash", (Throwable)exception);
                    this.caughtCrash = f.a(exception);
                    break block6;
                }
                throw new RuntimeException((Throwable)exception);
            }
            finally {
                this.completed = true;
            }
        }
    }
}

