/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.net.Uri
 *  java.io.File
 *  java.io.IOException
 *  java.io.PrintWriter
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.List
 */
package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Log;
import com.corrodinggames.rts.appFramework.c;
import com.corrodinggames.rts.gameFramework.ad;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.utility.a.a;
import com.corrodinggames.rts.gameFramework.utility.ab;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class SettingsEngine {
    public boolean enableSounds;
    public boolean enableMouseCapture;
    public boolean androidNoSoundPrioritiesDebug;
    public boolean disableDigitGrouping;
    public boolean resizeFontWithUIScale = true;
    public String slick2dResolution;
    public int settingsGameVersion;
    public int settingsGameVersionFirst;
    public String slick2dFullScreenResolution;
    public boolean upgradedToNoPublicStorage;
    public boolean upgradedToNoPublicStorageWarningShown;
    public boolean slick2dFullScreen;
    public boolean slick2dBorderless;
    public boolean autosaving = true;
    public float masterVolume;
    public float gameVolume;
    public float interfaceVolume;
    public float musicVolume;
    public float scrollSpeed;
    public float edgeScrollSpeed;
    public boolean hasPlayedGameOrSeenHelp;
    public boolean onscreenControls;
    public boolean trackpad;
    public boolean dpad;
    public boolean batterySaving;
    public boolean highRefreshRate;
    public boolean renderBackground;
    public boolean renderExtraLayers;
    public boolean immersiveFullScreen;
    public boolean displayOverCutout;
    public boolean unlockedScreenRotation;
    public boolean renderDoubleScale;
    public float renderDensity = 1.0f;
    public float uiRenderScale = 1.0f;
    public boolean renderExtraShadows = true;
    public boolean renderFancyWater = false;
    public boolean renderClouds = false;
    public boolean renderWithLineWidth;
    public boolean softFogFading = false;
    public boolean showActionInfoHoverNearMouse = true;
    public boolean disableModLazyLoad = false;
    public boolean showUnitGroups;
    public boolean allowGameRecording;
    public boolean renderAntiAlias = true;
    public boolean renderControls;
    public boolean showHp;
    public boolean showHpChanges;
    public boolean showUnitIcons;
    public boolean gestureZoom;
    public boolean showSelectedUnitsList = true;
    public boolean useCircleSelect;
    public boolean showZoomButton;
    public boolean showFps;
    public boolean newRender;
    public boolean shaderEffects;
    public boolean teamShaders;
    public boolean showUnitWaypoints;
    public boolean useMinimapAllyColors;
    public boolean showWarLogOnScreen;
    public boolean classicInterface;
    public boolean quickRally;
    public boolean doubleClickToAttackMove = false;
    public boolean showMapPingsOnBattlefield = true;
    public boolean showMapPingsOnMinimap = true;
    public boolean showPlayerChatInGame = true;
    public boolean sendReports;
    public boolean shownAudioWarning;
    public boolean mouseSupport;
    public boolean keyboardSupport;
    public boolean forceEnglish;
    public String overrideLanguageCode;
    public boolean saveMultiplayerReplays;
    public boolean replaysShowRecordedChat;
    public int nextBackgroundMap;
    public String lastNetworkPlayerName;
    public String lastNetworkIP;
    public String lastDebugOption;
    public String teamColors = "#00ff00,#d02013,#0463f3,#ffff40,#00ffff,#d0f8f7,#000000,#ff00ea,#ff7f18,#9368c4";
    public String teamColorsNames = "GREEN,RED,BLUE,YELLOW,CYAN,WHITE,BLACK,PINK,ORANGE,PURPLE";
    public boolean landscapeOrientation;
    public int aiDifficulty;
    public int locationAction;
    public int locationDpad;
    public int keyAction;
    public int keyJump;
    public int keyLeft;
    public int keyRight;
    public int keyDown;
    public String uuid;
    public String networkClientId;
    public String networkClientIdMachineKey;
    public String networkServerId;
    public int numIncompleteLoadAttempts;
    public int numLoadsSinceRunningGameOrNormalExit;
    public int lastSeenMessageId;
    public String lastSeenMessageIds;
    // 网络端口
    public int networkPort;
    public boolean udpInMultiplayer;
    public int banTimeInSecondsAfterKick = 60;
    public int numberOfWins;
    public boolean rateGameShown;
    public boolean highGraphics = true;
    public int mouseOrders;
    public int mousePlacement;
    public boolean liveReloading;
    public boolean renderVsync;
    public boolean renderSmoothDelta;
    public int teamUnitCapSinglePlayer = 1000;
    public int teamUnitCapHostedGame = 250;
    public boolean showChatAndPingShortcuts = true;
    public String modSettings;
    public int modSettingsVersion;
    public int storageType;
    public boolean hasSelectedAStorageType;
    public boolean hadStoragePermissionInPast;
    public boolean loadDisabledModData;
    public int lastModCount;
    public String modSAFlinks;
    public boolean externalSAFWorking;
    public String externalSAFLink;
    public String externalSAFPathShown;
    public String externalSAFPathExtra;
    public boolean smartSelection_v2;
    public boolean replayTracing;
    SharedPreferences prefs;
    static SettingsEngine settingsEngine = null;
    HashMap settingFields = new HashMap();

    public static SettingsEngine getInstance(Context context) {
        if (settingsEngine == null) {
            settingsEngine = new SettingsEngine(context);
        }
        return settingsEngine;
    }

    public boolean getBooleanPref(String string2, boolean bl2) {
        if (l.aU) {
            return bl2;
        }
        return this.prefs.getBoolean(string2, bl2);
    }

    public int getIntPref(String string2, int n2) {
        if (l.aU) {
            return n2;
        }
        return this.prefs.getInt(string2, n2);
    }

    public float getFloatPref(String string2, float f2) {
        if (l.aU) {
            return f2;
        }
        return this.prefs.getFloat(string2, f2);
    }

    public String getStringPref(String string2, String string3) {
        if (l.aU) {
            return string3;
        }
        return this.prefs.getString(string2, string3);
    }

    public String getValueDynamic(String string2) {
        Object object;
        try {
            Field field = (Field)this.settingFields.get((Object)string2);
            if (field == null) {
                throw new RuntimeException("Could not find: " + string2);
            }
            object = field.get((Object)this);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new RuntimeException((Throwable)illegalArgumentException);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException((Throwable)illegalAccessException);
        }
        if (object == null) {
            return null;
        }
        return object.toString();
    }

    public boolean setValueDynamic(String string2, String string3) {
        try {
            Field field = (Field)this.settingFields.get((Object)string2);
            String string4 = string3;
            if (field.getType().equals((Object)Boolean.TYPE)) {
                if (string3 == null) {
                    throw new RuntimeException("value==null");
                }
                string4 = Boolean.valueOf((boolean)Boolean.parseBoolean((String)string3));
            }
            if (field.getType().equals((Object)Float.TYPE)) {
                if (string3 != null && string3.contains((CharSequence)",")) {
                    string3 = string3.replace((CharSequence)",", (CharSequence)".");
                }
                string4 = Float.valueOf((float)Float.parseFloat((String)string3));
            }
            if (field.getType().equals((Object)Integer.TYPE)) {
                string4 = Integer.valueOf((int)Integer.parseInt((String)string3));
            }
            field.set((Object)this, (Object)string4);
        }
        catch (IllegalAccessException illegalAccessException) {
            throw new RuntimeException((Throwable)illegalAccessException);
        }
        return true;
    }

    public String getPreferencesPath() {
        String string2 = "/SD/rustedWarfare/preferences.ini";
        String string3 = e.a.e(string2);
        return string3;
    }

    public boolean saveToFileSystem() {
        l l2 = l.B();
        File file = new File(this.getPreferencesPath());
        l.e("Saving settings to: " + file.getAbsolutePath());
        try {
            String string2;
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("[settings]");
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((Collection)this.settingFields.keySet());
            Collections.sort((List)arrayList);
            for (Object object : arrayList) {
                string2 = this.getValueDynamic((String)object);
                if (string2 == null) {
                    string2 = "";
                }
                string2 = string2.replace((CharSequence)"\\", (CharSequence)"\\\\");
                string2 = string2.replace((CharSequence)"\n", (CharSequence)"\\n");
                printWriter.println((String)object + ":" + string2);
            }
            printWriter.println("[keys]");
            for (Object object : l2.bT.al) {
                if (!((ad)object).b || ((ad)object).d()) continue;
                string2 = "";
                string2 = string2 + ((ad)object).e();
                String string3 = l2.bT.a((ad)object);
                printWriter.println(string2 + ":" + string3);
            }
            printWriter.close();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            l.B().a("Failed to save preferences, IO error", 1);
            return false;
        }
        return true;
    }

    public void loadFromFileSystem() {
        l l2 = l.B();
        String string2 = this.getPreferencesPath();
        File file = new File(string2);
        if (!file.exists()) {
            l.e("preferences not found, not loading (" + string2 + ")");
            return;
        }
        l.e("loadFromFileSystem filepath: " + file.getAbsolutePath());
        String string3 = "settings";
        try {
            String string4;
            String string5;
            ab ab2 = new ab(string2);
            for (Object object : this.settingFields.entrySet()) {
                string5 = (String)object.getKey();
                string4 = ab2.b(string3, string5, (String)null);
                if (l.aZ) {
                    l.e(string5 + "= " + string4);
                }
                if (string4 == null || "".equals((Object)string4)) continue;
                if (string5.startsWith("key.")) {
                    string5 = string5.replace((CharSequence)"key.", (CharSequence)"");
                    l.e("loading keybind:" + string5);
                    l2.bT.a(string5, string4);
                    continue;
                }
                this.setValueDynamic(string5, string4);
            }
            for (Object object : l2.bT.al) {
                if (!((ad)object).b || ((ad)object).d() || (string4 = ab2.b("keys", string5 = ((ad)object).e(), (String)null)) == null || "".equals((Object)string4)) continue;
                l2.bT.a(string5, string4);
            }
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            l.B().a("Failed to load preferences, IO error", 1);
        }
    }

    private SettingsEngine(Context context) {
        Field[] fieldArray;
        for (Field field : fieldArray = this.getClass().getFields()) {
            String string2 = field.getName();
            if (this.settingFields.get((Object)string2) != null) {
                l.e("SettingsEngine: fields: " + string2 + " already exists");
            }
            if (l.aZ) {
                l.e("SettingsEngine: field:" + string2);
            }
            this.settingFields.put((Object)string2, (Object)field);
        }
        if (!l.aU) {
            this.prefs = context.a("rts_settings", 0);
        }
        int n2 = this.getIntPref("settingVersion", 1);
        this.settingsGameVersion = this.getIntPref("settingsGameVersion", 0);
        this.settingsGameVersionFirst = this.getIntPref("settingsGameVersionFirst", 0);
        if (this.settingsGameVersionFirst == 0) {
            this.settingsGameVersionFirst = this.settingsGameVersion != 0 ? this.settingsGameVersion : 176;
        }
        int n3 = 0;
        if (this.settingsGameVersionFirst <= 160) {
            n3 = 1;
        }
        this.upgradedToNoPublicStorage = this.getBooleanPref("upgradedToNoPublicStorage", n3 != 0);
        this.upgradedToNoPublicStorageWarningShown = this.getBooleanPref("upgradedToNoPublicStorageWarningShown", false);
        this.slick2dResolution = this.getStringPref("slick2dResolution", "native");
        this.slick2dFullScreenResolution = this.getStringPref("slick2dFullScreenResolution", "native");
        this.slick2dFullScreen = this.getBooleanPref("slick2dFullScreen", false);
        this.hasPlayedGameOrSeenHelp = this.getBooleanPref("hasPlayedGameOrSeenHelp", false);
        this.enableSounds = this.getBooleanPref("enableSounds", true);
        this.enableMouseCapture = this.getBooleanPref("enableMouseCapture", false);
        this.androidNoSoundPrioritiesDebug = this.getBooleanPref("androidNoSoundPrioritiesDebug", false);
        this.disableDigitGrouping = this.getBooleanPref("disableDigitGrouping", false);
        this.musicVolume = this.getFloatPref("musicVolume", 0.25f);
        float f2 = 1.0f;
        if (l.av()) {
            f2 = 0.5f;
        }
        this.masterVolume = this.getFloatPref("masterVolume", f2);
        this.gameVolume = this.getFloatPref("gameVolume", 1.0f);
        this.interfaceVolume = this.getFloatPref("interfaceVolume", 0.8f);
        this.scrollSpeed = this.getFloatPref("scrollSpeed", 1.0f);
        this.edgeScrollSpeed = this.getFloatPref("edgeScrollSpeed", 1.0f);
        this.onscreenControls = this.getBooleanPref("onscreenControls", true);
        this.trackpad = this.getBooleanPref("trackpad", true);
        this.dpad = this.getBooleanPref("dpad", true);
        this.batterySaving = this.getBooleanPref("batterySaving", false);
        boolean bl2 = false;
        if (l.av()) {
            bl2 = true;
        }
        this.highRefreshRate = this.getBooleanPref("highRefreshRate", bl2);
        this.unlockedScreenRotation = this.getBooleanPref("unlockedScreenRotation", false);
        this.renderBackground = this.getBooleanPref("renderBackground", true);
        this.renderExtraLayers = this.getBooleanPref("renderExtraLayers", true);
        this.renderControls = this.getBooleanPref("renderControls", true);
        this.immersiveFullScreen = this.getBooleanPref("immersiveFullScreen", true);
        this.displayOverCutout = this.getBooleanPref("displayOverCutout", false);
        this.renderDoubleScale = this.getBooleanPref("renderDoubleScale", false);
        this.showUnitGroups = this.getBooleanPref("showUnitGroups", true);
        boolean bl3 = false;
        if (l.av()) {
            bl3 = true;
        }
        if (l.aZ) {
            bl3 = true;
        }
        this.renderClouds = this.getBooleanPref("renderClouds", bl3);
        this.renderWithLineWidth = this.getBooleanPref("renderWithLineWidth", true);
        boolean bl4 = false;
        if (l.av()) {
            bl4 = true;
        }
        if (l.aZ) {
            bl4 = true;
        }
        this.softFogFading = this.getBooleanPref("softFogFading", bl4);
        this.showUnitWaypoints = this.getBooleanPref("showUnitWaypoints", true);
        this.useMinimapAllyColors = this.getBooleanPref("useMinimapAllyColors", true);
        boolean bl5 = false;
        if (l.av()) {
            bl5 = true;
        }
        this.showWarLogOnScreen = this.getBooleanPref("showWarLogOnScreen", bl5);
        boolean bl6 = false;
        this.classicInterface = this.getBooleanPref("classicInterface", bl6);
        boolean bl7 = false;
        if (l.av()) {
            bl7 = true;
        }
        this.quickRally = this.getBooleanPref("quickRally", bl7);
        if (n2 <= 1 && !l.av()) {
            this.quickRally = bl7;
        }
        this.doubleClickToAttackMove = this.getBooleanPref("doubleClickToAttackMove", true);
        this.showMapPingsOnBattlefield = this.getBooleanPref("showMapPingsOnBattlefield", true);
        this.showMapPingsOnMinimap = this.getBooleanPref("showMapPingsOnMinimap", true);
        this.showPlayerChatInGame = this.getBooleanPref("showPlayerChatInGame", true);
        this.allowGameRecording = false;
        this.showHp = this.getBooleanPref("showHp", true);
        this.showHpChanges = this.getBooleanPref("showHpChanges", true);
        this.showUnitIcons = this.getBooleanPref("showUnitIcons", true);
        this.gestureZoom = this.getBooleanPref("gestureZoom", true);
        this.useCircleSelect = this.getBooleanPref("useCircleSelect", false);
        this.showZoomButton = this.getBooleanPref("showZoomButton", true);
        this.showFps = this.getBooleanPref("showFps", false);
        this.newRender = this.getBooleanPref("newRender", false);
        this.shaderEffects = this.getBooleanPref("shaderEffects", false);
        this.teamShaders = this.getBooleanPref("teamShaders", false);
        this.sendReports = this.getBooleanPref("sendReports", true);
        this.shownAudioWarning = this.getBooleanPref("shownAudioWarning", false);
        this.mouseSupport = this.getBooleanPref("mouseSupport", !l.d(context));
        this.keyboardSupport = this.getBooleanPref("keyboardSupport", true);
        boolean bl8 = false;
        if (l.aZ) {
            bl8 = true;
        }
        this.forceEnglish = this.getBooleanPref("forceEnglish", bl8);
        boolean bl9 = false;
        if (l.av()) {
            bl9 = true;
        }
        this.saveMultiplayerReplays = this.getBooleanPref("saveMultiplayerReplays", bl9);
        if (n2 <= 1) {
            this.saveMultiplayerReplays = bl9;
        }
        this.replaysShowRecordedChat = this.getBooleanPref("replaysShowRecordedChat", true);
        this.lastNetworkPlayerName = this.getStringPref("lastNetworkPlayerName", null);
        this.lastNetworkIP = this.getStringPref("lastNetworkIP", null);
        this.lastDebugOption = this.getStringPref("lastDebugOption", null);
        this.aiDifficulty = this.getIntPref("aiDifficulty", 0);
        this.locationDpad = this.getIntPref("locationDpad", 0);
        this.locationAction = this.getIntPref("locationAction", 3);
        this.keyAction = this.getIntPref("keyAction", 23);
        this.keyJump = this.getIntPref("keyJump", 19);
        this.keyLeft = this.getIntPref("keyLeft", 21);
        this.keyRight = this.getIntPref("keyRight", 22);
        this.keyDown = this.getIntPref("keyDown", 20);
        this.landscapeOrientation = this.getBooleanPref("landscapeOrientation", true);
        this.networkPort = this.getIntPref("networkPort", 5123);
        if (this.networkPort < 1024 || this.networkPort > 65535) {
            this.networkPort = 5123;
        }
        this.udpInMultiplayer = this.getBooleanPref("udpInMultiplayer", false);
        this.banTimeInSecondsAfterKick = this.getIntPref("banTimeInSecondsAfterKick", 60);
        this.numIncompleteLoadAttempts = this.getIntPref("numIncompleteLoadAttempts", 0);
        this.numLoadsSinceRunningGameOrNormalExit = this.getIntPref("numLoadsSinceRunningGameOrNormalExit", 0);
        this.numberOfWins = this.getIntPref("numberOfWins", 0);
        this.rateGameShown = this.getBooleanPref("rateGameShown", false);
        this.uuid = this.getStringPref("uuid", null);
        this.networkClientId = this.getStringPref("networkClientId", null);
        this.networkServerId = this.getStringPref("networkServerId", null);
        this.lastSeenMessageId = this.getIntPref("lastSeenMessageId", -1);
        this.lastSeenMessageIds = this.getStringPref("lastSeenMessageIds", "");
        this.nextBackgroundMap = this.getIntPref("nextBackgroundMap", 1);
        this.showChatAndPingShortcuts = this.getBooleanPref("showChatAndPingShortcuts", true);
        this.teamUnitCapSinglePlayer = this.getIntPref("teamUnitCapSinglePlayer", 1000);
        this.teamUnitCapHostedGame = this.getIntPref("teamUnitCapHostedGame", 250);
        this.modSettings = this.getStringPref("modSettings", "");
        this.modSettingsVersion = this.getIntPref("modSettingsVersion", 0);
        boolean bl10 = false;
        if (l.at() && c.b(c.a())) {
            bl10 = true;
        }
        int n4 = 0;
        if (bl10) {
            n4 = 2;
        }
        this.storageType = this.getIntPref("storageType", n4);
        this.hadStoragePermissionInPast = this.getBooleanPref("hadStoragePermissionInPast", false);
        if (bl10) {
            this.hadStoragePermissionInPast = true;
        }
        this.hasSelectedAStorageType = this.getBooleanPref("hasSelectedAStorageType", false);
        this.loadDisabledModData = this.getBooleanPref("loadDisabledModData", false);
        this.lastModCount = this.getIntPref("lastModCount", -1);
        this.modSAFlinks = this.getStringPref("modSAFlinks", null);
        this.externalSAFWorking = this.getBooleanPref("externalSAFWorking", false);
        this.externalSAFLink = this.getStringPref("externalSAFLink", null);
        this.externalSAFPathShown = this.getStringPref("externalSAFPathShown", null);
        this.externalSAFPathExtra = this.getStringPref("externalSAFPathExtra", null);
        this.smartSelection_v2 = this.getBooleanPref("smartSelection_v2", true);
        this.mouseOrders = this.getIntPref("mouseOrders", 1);
        this.mousePlacement = this.getIntPref("mousePlacement", 1);
        this.autosaving = this.getBooleanPref("autosaving", true);
        if (l.aW) {
            this.loadFromFileSystem();
        }
        if (this.settingsGameVersion < 174) {
            this.uiRenderScale = 1.0f;
        }
    }

    public synchronized boolean save() {
        this.settingsGameVersion = 176;
        if (l.aU) {
            if (l.aW) {
                return this.saveToFileSystem();
            }
            return true;
        }
        SharedPreferences.Editor editor = this.prefs.edit();
        editor.putInt("settingVersion", 2);
        editor.putInt("settingsGameVersion", this.settingsGameVersion);
        editor.putInt("settingsGameVersionFirst", this.settingsGameVersionFirst);
        editor.putBoolean("upgradedToNoPublicStorage", this.upgradedToNoPublicStorage);
        editor.putBoolean("upgradedToNoPublicStorageWarningShown", this.upgradedToNoPublicStorageWarningShown);
        editor.putBoolean("hasPlayedGameOrSeenHelp", this.hasPlayedGameOrSeenHelp);
        editor.putString("slick2dResolution", this.slick2dResolution);
        editor.putString("slick2dFullScreenResolution", this.slick2dFullScreenResolution);
        editor.putBoolean("slick2dFullScreen", this.slick2dFullScreen);
        editor.putBoolean("enableSounds", this.enableSounds);
        editor.putBoolean("enableMouseCapture", this.enableMouseCapture);
        editor.putBoolean("androidNoSoundPrioritiesDebug", this.androidNoSoundPrioritiesDebug);
        editor.putBoolean("disableDigitGrouping", this.disableDigitGrouping);
        Log.d("RustedWarfare", "put mv:" + this.musicVolume);
        editor.putFloat("musicVolume", this.musicVolume);
        editor.putFloat("masterVolume", this.masterVolume);
        editor.putFloat("gameVolume", this.gameVolume);
        editor.putFloat("interfaceVolume", this.interfaceVolume);
        editor.putFloat("scrollSpeed", this.scrollSpeed);
        editor.putFloat("edgeScrollSpeed", this.edgeScrollSpeed);
        editor.putBoolean("onscreenControls", this.onscreenControls);
        editor.putBoolean("trackpad", this.trackpad);
        editor.putBoolean("dpad", this.dpad);
        editor.putBoolean("batterySaving", this.batterySaving);
        editor.putBoolean("highRefreshRate", this.highRefreshRate);
        editor.putBoolean("unlockedScreenRotation", this.unlockedScreenRotation);
        editor.putBoolean("renderBackground", this.renderBackground);
        editor.putBoolean("renderExtraLayers", this.renderExtraLayers);
        editor.putBoolean("renderControls", this.renderControls);
        editor.putBoolean("immersiveFullScreen", this.immersiveFullScreen);
        editor.putBoolean("displayOverCutout", this.displayOverCutout);
        editor.putBoolean("renderDoubleScale", this.renderDoubleScale);
        editor.putBoolean("showUnitGroups", this.showUnitGroups);
        editor.putBoolean("renderWithLineWidth", this.renderWithLineWidth);
        editor.putBoolean("renderClouds", this.renderClouds);
        editor.putBoolean("softFogFading", this.softFogFading);
        editor.putBoolean("showUnitWaypoints", this.showUnitWaypoints);
        editor.putBoolean("useMinimapAllyColors", this.useMinimapAllyColors);
        editor.putBoolean("showWarLogOnScreen", this.showWarLogOnScreen);
        editor.putBoolean("classicInterface", this.classicInterface);
        editor.putBoolean("quickRally", this.quickRally);
        editor.putBoolean("doubleClickToAttackMove", this.doubleClickToAttackMove);
        editor.putBoolean("showMapPingsOnBattlefield", this.showMapPingsOnBattlefield);
        editor.putBoolean("showMapPingsOnMinimap", this.showMapPingsOnMinimap);
        editor.putBoolean("showPlayerChatInGame", this.showPlayerChatInGame);
        editor.putBoolean("allowGameRecording", this.allowGameRecording);
        editor.putBoolean("showHp", this.showHp);
        editor.putBoolean("showHpChanges", this.showHpChanges);
        editor.putBoolean("showUnitIcons", this.showUnitIcons);
        editor.putBoolean("gestureZoom", this.gestureZoom);
        editor.putBoolean("useCircleSelect", this.useCircleSelect);
        editor.putBoolean("showZoomButton", this.showZoomButton);
        editor.putBoolean("showFps", this.showFps);
        editor.putBoolean("newRender", this.newRender);
        editor.putBoolean("shaderEffects", this.shaderEffects);
        editor.putBoolean("teamShaders", this.teamShaders);
        editor.putBoolean("sendReports", this.sendReports);
        editor.putBoolean("shownAudioWarning", this.shownAudioWarning);
        editor.putBoolean("mouseSupport", this.mouseSupport);
        editor.putBoolean("keyboardSupport", this.keyboardSupport);
        editor.putBoolean("forceEnglish", this.forceEnglish);
        editor.putBoolean("saveMultiplayerReplays", this.saveMultiplayerReplays);
        editor.putBoolean("replaysShowRecordedChat", this.replaysShowRecordedChat);
        editor.putString("lastNetworkPlayerName", this.lastNetworkPlayerName);
        editor.putString("lastNetworkIP", this.lastNetworkIP);
        editor.putString("lastDebugOption", this.lastDebugOption);
        editor.putInt("aiDifficulty", this.aiDifficulty);
        editor.putInt("locationDpad", this.locationDpad);
        editor.putInt("locationAction", this.locationAction);
        editor.putInt("keyAction", this.keyAction);
        editor.putInt("keyJump", this.keyJump);
        editor.putInt("keyLeft", this.keyLeft);
        editor.putInt("keyRight", this.keyRight);
        editor.putInt("keyDown", this.keyDown);
        editor.putBoolean("landscapeOrientation", this.landscapeOrientation);
        editor.putInt("networkPort", this.networkPort);
        editor.putBoolean("udpInMultiplayer", this.udpInMultiplayer);
        editor.putInt("banTimeInSecondsAfterKick", this.banTimeInSecondsAfterKick);
        editor.putInt("numIncompleteLoadAttempts", this.numIncompleteLoadAttempts);
        editor.putInt("numLoadsSinceRunningGameOrNormalExit", this.numLoadsSinceRunningGameOrNormalExit);
        editor.putInt("numberOfWins", this.numberOfWins);
        editor.putBoolean("rateGameShown", this.rateGameShown);
        editor.putString("uuid", this.uuid);
        editor.putString("networkClientId", this.networkClientId);
        editor.putString("networkServerId", this.networkServerId);
        editor.putInt("lastSeenMessageId", this.lastSeenMessageId);
        editor.putString("lastSeenMessageIds", this.lastSeenMessageIds);
        editor.putInt("nextBackgroundMap", this.nextBackgroundMap);
        editor.putBoolean("showChatAndPingShortcuts", this.showChatAndPingShortcuts);
        editor.putString("modSettings", this.modSettings);
        editor.putInt("modSettingsVersion", this.modSettingsVersion);
        editor.putInt("storageType", this.storageType);
        editor.putBoolean("hasSelectedAStorageType", this.hasSelectedAStorageType);
        editor.putBoolean("hadStoragePermissionInPast", this.hadStoragePermissionInPast);
        editor.putInt("teamUnitCapSinglePlayer", this.teamUnitCapSinglePlayer);
        editor.putInt("teamUnitCapHostedGame", this.teamUnitCapHostedGame);
        editor.putBoolean("loadDisabledModData", this.loadDisabledModData);
        editor.putInt("lastModCount", this.lastModCount);
        editor.putString("modSAFlinks", this.modSAFlinks);
        editor.putBoolean("externalSAFWorking", this.externalSAFWorking);
        editor.putString("externalSAFLink", this.externalSAFLink);
        editor.putString("externalSAFPathShown", this.externalSAFPathShown);
        editor.putString("externalSAFPathExtra", this.externalSAFPathExtra);
        editor.putBoolean("smartSelection_v2", this.smartSelection_v2);
        editor.putInt("mouseOrders", this.mouseOrders);
        editor.putInt("mousePlacement", this.mousePlacement);
        editor.putBoolean("autosaving", this.autosaving);
        editor.commit();
        return true;
    }

    public boolean loadMainExternalFolder(boolean bl2) {
        if (!l.at()) {
            return false;
        }
        l.e("loadMainExternalFolder..");
        l l2 = l.B();
        if (bl2 && l2.c()) {
            l.e("Not loading due to extra safe mode");
            return false;
        }
        String string2 = l2.bQ.externalSAFLink;
        String string3 = l2.bQ.externalSAFPathShown;
        String string4 = l2.bQ.externalSAFPathExtra;
        if (string2 == null) {
            l.e("No external folder set");
            return false;
        }
        l.e("External saf link: " + string2);
        l.e("External saf shown path: " + string3);
        l.e("External saf extra: " + string4);
        try {
            Uri uri = Uri.parse((String)string2);
            boolean bl3 = false;
            String string5 = null;
            String string6 = a.a(uri, true);
            l.e("safVirualPathBase: " + string6);
            if (string6 == null) {
                l.e("createSAFLink failed for uri: " + uri);
                bl3 = true;
            } else {
                string5 = string6 + string4;
                l.e("safVirualPath: " + string5);
                if (!e.a.f(string5)) {
                    l.e("isDirectory failed for: " + string5);
                    bl3 = true;
                }
            }
            if (bl3) {
                l.e("error for uri: " + uri);
                l2.bQ.externalSAFWorking = false;
                String string7 = "Failed to read: " + string3 + " - Folder might have moved or permission expired. Please setup again under in-game settings.";
                if (i.a.a == null) {
                    i.a.a = "";
                }
                i.a.a = i.a.a + string7;
                i.a.b = string7;
                return false;
            }
            l.e("Using external path");
            l2.bQ.externalSAFWorking = true;
            e.a.d = string5;
            return true;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }
}

