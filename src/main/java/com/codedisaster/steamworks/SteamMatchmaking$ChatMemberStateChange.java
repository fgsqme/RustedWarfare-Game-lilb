/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.codedisaster.steamworks;

public enum SteamMatchmaking$ChatMemberStateChange {
    Entered(1),
    Left(2),
    Disconnected(4),
    Kicked(8),
    Banned(16);

    private final int bits;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SteamMatchmaking$ChatMemberStateChange() {
        void var3_1;
        this.bits = var3_1;
    }

    static boolean isSet(SteamMatchmaking$ChatMemberStateChange steamMatchmaking$ChatMemberStateChange, int n2) {
        return (steamMatchmaking$ChatMemberStateChange.bits & n2) == steamMatchmaking$ChatMemberStateChange.bits;
    }
}

