/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 */
package com.codedisaster.steamworks;

import java.util.Collection;

public enum SteamFriends$FriendFlags {
    None(0),
    Blocked(1),
    FriendshipRequested(2),
    Immediate(4),
    ClanMember(8),
    OnGameServer(16),
    RequestingFriendship(128),
    RequestingInfo(256),
    Ignored(512),
    IgnoredFriend(1024),
    ChatMember(4096),
    All(65535);

    private final int bits;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SteamFriends$FriendFlags() {
        void var3_1;
        this.bits = var3_1;
    }

    static int asBits(Collection collection) {
        int n2 = 0;
        for (SteamFriends$FriendFlags steamFriends$FriendFlags : collection) {
            n2 |= steamFriends$FriendFlags.bits;
        }
        return n2;
    }

    static /* synthetic */ int access$000(SteamFriends$FriendFlags steamFriends$FriendFlags) {
        return steamFriends$FriendFlags.bits;
    }
}

