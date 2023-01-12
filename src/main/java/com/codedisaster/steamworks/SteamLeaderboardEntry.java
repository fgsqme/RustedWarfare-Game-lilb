/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.codedisaster.steamworks;

import com.codedisaster.steamworks.SteamID;

public class SteamLeaderboardEntry {
    long steamIDUser;
    int globalRank;
    int score;
    int details;

    public SteamID getSteamIDUser() {
        return new SteamID(this.steamIDUser);
    }

    public int getGlobalRank() {
        return this.globalRank;
    }

    public int getScore() {
        return this.score;
    }

    public int getNumDetails() {
        return this.details;
    }
}

