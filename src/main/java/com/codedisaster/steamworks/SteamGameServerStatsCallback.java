/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.codedisaster.steamworks;

import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamResult;

public interface SteamGameServerStatsCallback {
    public void onStatsReceived(SteamResult var1, SteamID var2);

    public void onStatsStored(SteamResult var1, SteamID var2);

    public void onStatsUnloaded(SteamID var1);
}

