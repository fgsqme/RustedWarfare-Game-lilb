/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.ArrayList
 */
package com.corrodinggames.librocket.scripts;

import com.corrodinggames.librocket.scripts.Root$TableCell;
import com.corrodinggames.rts.gameFramework.f;
import java.util.ArrayList;

public class Root$TableRow {
    public ArrayList tableCells = new ArrayList();
    public Runnable androidOnclick;
    public String librocketOnClick;
    public String extraClasses;

    public void addClass(String string2) {
        this.extraClasses = this.extraClasses == null ? string2 : this.extraClasses + " " + string2;
    }

    public Root$TableCell addCell(String string2) {
        Root$TableCell root$TableCell = new Root$TableCell(string2);
        this.tableCells.add((Object)root$TableCell);
        return root$TableCell;
    }

    public void setLibrocketOnClick(String string2) {
        this.librocketOnClick = string2;
    }

    public void setAndroidOnClick(Runnable runnable) {
        this.androidOnclick = runnable;
    }

    public boolean same(Root$TableRow root$TableRow, boolean bl2) {
        if (!f.d(this.librocketOnClick, root$TableRow.librocketOnClick) || !f.d(this.extraClasses, root$TableRow.extraClasses)) {
            return false;
        }
        if (this.tableCells.size() != root$TableRow.tableCells.size()) {
            return false;
        }
        for (int i2 = 0; i2 < this.tableCells.size(); ++i2) {
            Root$TableCell root$TableCell;
            Root$TableCell root$TableCell2 = (Root$TableCell)this.tableCells.get(i2);
            if (root$TableCell2.same(root$TableCell = (Root$TableCell)root$TableRow.tableCells.get(i2), bl2)) continue;
            return false;
        }
        return true;
    }
}

