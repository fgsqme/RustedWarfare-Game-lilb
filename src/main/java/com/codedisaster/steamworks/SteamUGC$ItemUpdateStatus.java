/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.codedisaster.steamworks;

public enum SteamUGC$ItemUpdateStatus {
    Invalid,
    PreparingConfig,
    PreparingContent,
    UploadingContent,
    UploadingPreviewFile,
    CommittingChanges;

    private static final SteamUGC$ItemUpdateStatus[] values;

    static SteamUGC$ItemUpdateStatus byOrdinal(int n2) {
        return values[n2];
    }

    static {
        values = SteamUGC$ItemUpdateStatus.values();
    }
}

