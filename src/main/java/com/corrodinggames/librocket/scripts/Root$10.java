/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.corrodinggames.librocket.scripts;

import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.rts.gameFramework.l;

class Root$10
implements Runnable {
    final /* synthetic */ l val$game;
    final /* synthetic */ String val$replayName;
    final /* synthetic */ Root this$0;

    Root$10(Root root, l l2, String string2) {
        this.this$0 = root;
        this.val$game = l2;
        this.val$replayName = string2;
    }

    public void run() {
        this.val$game.cb.e(this.val$replayName);
        this.this$0.closePopup();
        this.this$0.showMaps();
    }
}

