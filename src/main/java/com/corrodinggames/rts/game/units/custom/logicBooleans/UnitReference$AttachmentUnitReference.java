/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.b.n;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.h;
import com.corrodinggames.rts.game.units.custom.j;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$Parameter;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader$LogicBooleanContext;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.y;

public class UnitReference$AttachmentUnitReference
extends UnitReference {
    l meta;
    g _withTag;
    short attachmentId = (short)-1;

    @Override
    public void validate(String string2, String string3, String string4, LogicBooleanLoader$LogicBooleanContext logicBooleanLoader$LogicBooleanContext, boolean bl2) {
        super.validate(string2, string3, string4, logicBooleanLoader$LogicBooleanContext, bl2);
        if (logicBooleanLoader$LogicBooleanContext != null && logicBooleanLoader$LogicBooleanContext != LogicBooleanLoader.defaultContextReader && this.attachmentId != -1) {
            throw new BooleanParseException("Function:" + string2 + " only supports use with 'self.' when using 'slot'");
        }
    }

    @Override
    public void forMeta(l l2) {
        if (l2 == null) {
            throw new com.corrodinggames.rts.gameFramework.utility.am("AttachmentUnitReference requires metadata");
        }
        this.meta = l2;
    }

    @LogicBoolean$Parameter
    public void withTag(String string2) {
        this._withTag = g.c(string2);
    }

    @LogicBoolean$Parameter
    public void slot(String string2) {
        n n2 = this.meta.i(string2);
        if (n2 == null) {
            throw new com.corrodinggames.rts.gameFramework.utility.am("No attachment slot with name: " + string2 + " found");
        }
        this.attachmentId = n2.a();
    }

    @Override
    public am getSingleRaw(y y2) {
        if (!(y2 instanceof j)) {
            return null;
        }
        j j2 = (j)y2;
        if (j2.C == null) {
            return null;
        }
        Object[] objectArray = j2.C.a();
        for (int i2 = j2.C.a - 1; i2 >= 0; --i2) {
            h h2;
            y y3 = (y)objectArray[i2];
            if (y3 == null || this.attachmentId != -1 && i2 != this.attachmentId || this._withTag != null && !g.a(this._withTag, h2 = y3.de())) continue;
            return y3;
        }
        return null;
    }

    @Override
    public String getClassDebugName() {
        return "attachment";
    }
}

