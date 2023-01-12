/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.corrodinggames.librocket.scripts;

import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.l.a;
import java.io.File;

class Root$7
implements Runnable {
    final /* synthetic */ l val$game;
    final /* synthetic */ String val$saveName;
    final /* synthetic */ Root this$0;

    Root$7(Root root, l l2, String string2) {
        this.this$0 = root;
        this.val$game = l2;
        this.val$saveName = string2;
    }

    public void run() {
        this.this$0.closePopup();
        File file = this.val$game.ca.a(this.val$saveName, false);
        a.a(file);
    }
}

