/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package com.corrodinggames.rts.game.units.custom.f;

import java.util.HashMap;

public class d {
    HashMap a = new HashMap();

    public void a(String string2, String string3) {
        this.a.put((Object)string2, (Object)string3);
    }

    public String a(String string2) {
        return (String)this.a.get((Object)string2);
    }

    public void a() {
        this.a.clear();
    }
}

