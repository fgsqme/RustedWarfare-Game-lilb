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

class Root$8
implements Runnable {
    final /* synthetic */ l val$game;
    final /* synthetic */ String val$saveName;
    final /* synthetic */ Root this$0;

    Root$8(Root root, l l2, String string2) {
        this.this$0 = root;
        this.val$game = l2;
        this.val$saveName = string2;
    }

    public void run() {
        this.val$game.ca.b(this.val$saveName);
        this.this$0.closePopup();
        this.this$0.showMaps();
    }
}

