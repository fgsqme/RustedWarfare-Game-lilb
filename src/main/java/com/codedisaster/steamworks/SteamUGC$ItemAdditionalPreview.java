/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.codedisaster.steamworks;

import com.codedisaster.steamworks.SteamUGC$ItemPreviewType;

public class SteamUGC$ItemAdditionalPreview {
    private String urlOrVideoID;
    private String originalFileName;
    private int previewType;

    public String getUrlOrVideoID() {
        return this.urlOrVideoID;
    }

    public String getOriginalFileName() {
        return this.originalFileName;
    }

    public SteamUGC$ItemPreviewType getPreviewType() {
        return SteamUGC$ItemPreviewType.byValue(this.previewType);
    }
}

