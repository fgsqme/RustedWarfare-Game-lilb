/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.codedisaster.steamworks;

public class SteamException
extends Exception {
    public SteamException() {
    }

    public SteamException(String string2) {
        super(string2);
    }

    public SteamException(String string2, Throwable throwable) {
        super(string2, throwable);
    }

    public SteamException(Throwable throwable) {
        super(throwable);
    }
}

