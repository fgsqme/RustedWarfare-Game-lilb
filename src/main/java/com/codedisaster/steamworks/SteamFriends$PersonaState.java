/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.codedisaster.steamworks;

public enum SteamFriends$PersonaState {
    Offline,
    Online,
    Busy,
    Away,
    Snooze,
    LookingToTrade,
    LookingToPlay;

    private static final SteamFriends$PersonaState[] values;

    static SteamFriends$PersonaState byOrdinal(int n2) {
        return values[n2];
    }

    static {
        values = SteamFriends$PersonaState.values();
    }
}

