/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ContextMenu
 *  android.view.ContextMenu$ContextMenuInfo
 *  android.view.MenuItem
 *  android.view.View
 *  android.widget.Button
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 */
package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.corrodinggames.rts.appFramework.b;
import com.corrodinggames.rts.appFramework.c;
import com.corrodinggames.rts.appFramework.r;
import com.corrodinggames.rts.gameFramework.e.a;
import com.corrodinggames.rts.gameFramework.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class q
extends b {
    String[] c;

    @Override
    public void b() {
        super.b();
        com.corrodinggames.rts.appFramework.c.a((Activity)this, true);
    }

    public static String[] l() {
        String[] stringArray = a.h("/SD/rustedWarfare/replays/");
        if (stringArray == null) {
            l.e("failed to find replay folder");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String string2 : stringArray) {
            if (string2.endsWith(".map")) continue;
            arrayList.add((Object)string2);
        }
        Collections.sort((List)arrayList, (Comparator)new r());
        return (String[])arrayList.toArray((Object[])new String[0]);
    }

    @Override
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        Button button = (Button)view;
        contextMenu.setHeaderTitle(button.getText());
        contextMenu.add(0, view.getId(), 0, (CharSequence)"Share");
        contextMenu.add(1, view.getId(), 0, (CharSequence)"Rename");
        contextMenu.add(2, view.getId(), 0, (CharSequence)"Delete");
        if (this.c != null && this.c.length > 0) {
            String string2 = this.c[view.getId()];
            String string3 = a.n(string2);
            MenuItem menuItem = contextMenu.add(3, view.getId(), 0, (CharSequence)("Storage: " + string3));
            if (menuItem != null) {
                menuItem.setEnabled(false);
            }
        }
    }
}

