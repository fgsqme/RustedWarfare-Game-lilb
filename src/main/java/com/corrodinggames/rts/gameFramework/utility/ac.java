/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.corrodinggames.rts.gameFramework.utility;

public final class ac {
    String a;
    String b;

    public ac(String string2, String string3) {
        this.a = string2;
        this.b = string3;
    }

    public String toString() {
        return "[" + this.a + "]" + this.b;
    }

    public boolean equals(Object object) {
        if (!(object instanceof ac)) {
            return false;
        }
        ac ac2 = (ac)object;
        return this.b.equals((Object)ac2.b) && this.a.equals((Object)ac2.a);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}

