/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.codedisaster.steamworks;

import com.codedisaster.steamworks.SteamNativeHandle;

public class SteamUGCQuery
extends SteamNativeHandle {
    public SteamUGCQuery(long l2) {
        super(l2);
    }

    public boolean isValid() {
        return this.handle != -1L;
    }
}

