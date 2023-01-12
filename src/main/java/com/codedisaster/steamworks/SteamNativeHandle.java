/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package com.codedisaster.steamworks;

public abstract class SteamNativeHandle {
    long handle;

    SteamNativeHandle(long l2) {
        this.handle = l2;
    }

    public static long getNativeHandle(SteamNativeHandle steamNativeHandle) {
        return steamNativeHandle.handle;
    }

    public int hashCode() {
        return Long.valueOf((long)this.handle).hashCode();
    }

    public boolean equals(Object object) {
        if (object instanceof SteamNativeHandle) {
            return this.handle == ((SteamNativeHandle)object).handle;
        }
        return false;
    }

    public String toString() {
        return Long.toHexString((long)this.handle);
    }
}

