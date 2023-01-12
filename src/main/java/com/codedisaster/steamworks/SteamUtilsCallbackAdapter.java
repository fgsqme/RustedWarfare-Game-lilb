/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package com.codedisaster.steamworks;

import com.codedisaster.steamworks.SteamAPIWarningMessageHook;
import com.codedisaster.steamworks.SteamCallbackAdapter;
import com.codedisaster.steamworks.SteamUtilsCallback;

class SteamUtilsCallbackAdapter
extends SteamCallbackAdapter {
    private SteamAPIWarningMessageHook messageHook;

    SteamUtilsCallbackAdapter(SteamUtilsCallback steamUtilsCallback) {
        super(steamUtilsCallback);
    }

    void setWarningMessageHook(SteamAPIWarningMessageHook steamAPIWarningMessageHook) {
        this.messageHook = steamAPIWarningMessageHook;
    }

    void onWarningMessage(int n2, String string2) {
        if (this.messageHook != null) {
            this.messageHook.onWarningMessage(n2, string2);
        }
    }

    void onSteamShutdown() {
        ((SteamUtilsCallback)this.callback).onSteamShutdown();
    }
}

