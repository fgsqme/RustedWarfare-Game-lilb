/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.EnumSet
 */
package com.codedisaster.steamworks;

import java.util.Collection;
import java.util.EnumSet;

public enum SteamUGC$ItemState {
    None(0),
    Subscribed(1),
    LegacyItem(2),
    Installed(4),
    NeedsUpdate(8),
    Downloading(16),
    DownloadPending(32);

    private final int bits;
    private static final SteamUGC$ItemState[] values;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SteamUGC$ItemState() {
        void var3_1;
        this.bits = var3_1;
    }

    static Collection fromBits(int n2) {
        EnumSet enumSet = EnumSet.noneOf(SteamUGC$ItemState.class);
        for (SteamUGC$ItemState steamUGC$ItemState : values) {
            if ((n2 & steamUGC$ItemState.bits) != steamUGC$ItemState.bits) continue;
            enumSet.add((Object)steamUGC$ItemState);
        }
        return enumSet;
    }

    static {
        values = SteamUGC$ItemState.values();
    }
}

