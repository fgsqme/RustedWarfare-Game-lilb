/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package com.codedisaster.steamworks;

public enum SteamController$SourceMode {
    None,
    Dpad,
    Buttons,
    FourButtons,
    AbsoluteMouse,
    RelativeMouse,
    JoystickMove,
    JoystickMouse,
    JoystickCamera,
    ScrollWheel,
    Trigger,
    TouchMenu,
    MouseJoystick,
    MouseRegion,
    RadialMenu,
    Switches;

    private static final SteamController$SourceMode[] values;

    static SteamController$SourceMode byOrdinal(int n2) {
        return values[n2];
    }

    static {
        values = SteamController$SourceMode.values();
    }
}

