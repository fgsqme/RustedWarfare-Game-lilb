/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.codedisaster.steamworks;

public enum SteamUGC$ItemPreviewType {
    Image(0),
    YouTubeVideo(1),
    Sketchfab(2),
    EnvironmentMap_HorizontalCross(3),
    EnvironmentMap_LatLong(4),
    ReservedMax(255),
    UnknownPreviewType_NotImplementedByAPI(-1);

    private final int value;
    private static final SteamUGC$ItemPreviewType[] values;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SteamUGC$ItemPreviewType() {
        void var3_1;
        this.value = var3_1;
    }

    static SteamUGC$ItemPreviewType byValue(int n2) {
        for (SteamUGC$ItemPreviewType steamUGC$ItemPreviewType : values) {
            if (steamUGC$ItemPreviewType.value != n2) continue;
            return steamUGC$ItemPreviewType;
        }
        return UnknownPreviewType_NotImplementedByAPI;
    }

    static {
        values = SteamUGC$ItemPreviewType.values();
    }
}

