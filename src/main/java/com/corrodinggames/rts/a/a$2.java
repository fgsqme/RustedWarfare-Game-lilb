/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.corrodinggames.rts.a;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.a.c;

strictfp final class a$2
extends c {
    final /* synthetic */ ScriptEngine a;
    final /* synthetic */ String b;

    a$2(ScriptEngine scriptEngine, String string2) {
        this.a = scriptEngine;
        this.b = string2;
    }

    public void run() {
        try {
            ScriptEngine.inDebugScript = true;
            this.c = this.a.processArg(this.b);
        }
        finally {
            ScriptEngine.inDebugScript = false;
        }
    }
}

