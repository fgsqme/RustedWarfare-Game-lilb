/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.codedisaster.steamworks;

import com.codedisaster.steamworks.SteamNativeHandle;

public class SteamAPICall
extends SteamNativeHandle {
    SteamAPICall(long l2) {
        super(l2);
    }

    public boolean isValid() {
        return this.handle != 0L;
    }
}

