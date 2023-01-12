/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.corrodinggames.librocket.scripts;

import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.librocket.scripts.ScriptEngine;

class Root$2
implements Runnable {
    final /* synthetic */ Root this$0;

    Root$2(Root root) {
        this.this$0 = root;
    }

    public void run() {
        ScriptEngine.getInstance().addScriptToQueue("joinServerCallback();");
    }
}

