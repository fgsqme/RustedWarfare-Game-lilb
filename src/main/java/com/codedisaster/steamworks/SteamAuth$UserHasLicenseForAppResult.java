/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.codedisaster.steamworks;

public enum SteamAuth$UserHasLicenseForAppResult {
    HasLicense,
    DoesNotHaveLicense,
    NoAuth;

    private static final SteamAuth$UserHasLicenseForAppResult[] values;

    static SteamAuth$UserHasLicenseForAppResult byOrdinal(int n2) {
        return values[n2];
    }

    static {
        values = SteamAuth$UserHasLicenseForAppResult.values();
    }
}

