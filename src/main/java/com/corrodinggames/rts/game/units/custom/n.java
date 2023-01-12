/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 */
package com.corrodinggames.rts.game.units.custom;

strictfp enum n {
    a,
    b,
    c,
    d,
    e,
    f,
    g,
    h,
    i;


    public static n a(String string2) {
        try {
            return n.valueOf(string2);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }
}

