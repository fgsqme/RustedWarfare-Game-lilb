/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.codedisaster.steamworks;

public enum SteamGameServer$DenyReason {
    Invalid,
    InvalidVersion,
    Generic,
    NotLoggedOn,
    NoLicense,
    Cheater,
    LoggedInElseWhere,
    UnknownText,
    IncompatibleAnticheat,
    MemoryCorruption,
    IncompatibleSoftware,
    SteamConnectionLost,
    SteamConnectionError,
    SteamResponseTimedOut,
    SteamValidationStalled,
    SteamOwnerLeftGuestUser;

    private static final SteamGameServer$DenyReason[] values;

    static SteamGameServer$DenyReason byOrdinal(int n2) {
        return values[n2];
    }

    static {
        values = SteamGameServer$DenyReason.values();
    }
}

