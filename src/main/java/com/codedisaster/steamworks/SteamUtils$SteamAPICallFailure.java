/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.codedisaster.steamworks;

public enum SteamUtils$SteamAPICallFailure {
    None(-1),
    SteamGone(0),
    NetworkFailure(1),
    InvalidHandle(2),
    MismatchedCallback(3);

    private final int code;
    private static final SteamUtils$SteamAPICallFailure[] values;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SteamUtils$SteamAPICallFailure() {
        void var3_1;
        this.code = var3_1;
    }

    static SteamUtils$SteamAPICallFailure byValue(int n2) {
        for (SteamUtils$SteamAPICallFailure steamUtils$SteamAPICallFailure : values) {
            if (steamUtils$SteamAPICallFailure.code != n2) continue;
            return steamUtils$SteamAPICallFailure;
        }
        return None;
    }

    static {
        values = SteamUtils$SteamAPICallFailure.values();
    }
}

