/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.codedisaster.steamworks;

public enum SteamAuth$BeginAuthSessionResult {
    OK,
    InvalidTicket,
    DuplicateRequest,
    InvalidVersion,
    GameMismatch,
    ExpiredTicket;

    private static final SteamAuth$BeginAuthSessionResult[] values;

    static SteamAuth$BeginAuthSessionResult byOrdinal(int n2) {
        return values[n2];
    }

    static {
        values = SteamAuth$BeginAuthSessionResult.values();
    }
}

