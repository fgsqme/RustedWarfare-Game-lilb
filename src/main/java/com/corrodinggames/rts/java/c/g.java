/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 */
package com.corrodinggames.rts.java.c;

import com.codedisaster.steamworks.SteamAPI;
import com.codedisaster.steamworks.SteamAPICall;
import com.codedisaster.steamworks.SteamNativeHandle;
import com.codedisaster.steamworks.SteamPublishedFileID;
import com.codedisaster.steamworks.SteamRemoteStorage$PublishedFileVisibility;
import com.codedisaster.steamworks.SteamRemoteStorage$WorkshopFileType;
import com.codedisaster.steamworks.SteamUGC;
import com.codedisaster.steamworks.SteamUGC$ItemDownloadInfo;
import com.codedisaster.steamworks.SteamUGC$ItemInstallInfo;
import com.codedisaster.steamworks.SteamUGC$ItemState;
import com.codedisaster.steamworks.SteamUGCCallback;
import com.codedisaster.steamworks.SteamUGCQuery;
import com.codedisaster.steamworks.SteamUGCUpdateHandle;
import com.corrodinggames.rts.gameFramework.e.a;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.java.c.b;
import com.corrodinggames.rts.java.c.h;
import com.corrodinggames.rts.java.c.i;
import com.corrodinggames.rts.java.c.j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class g {
    boolean a = false;
    b b;
    SteamUGCCallback c;
    SteamUGC d;
    com.corrodinggames.rts.gameFramework.i.b e;
    boolean f;
    com.corrodinggames.rts.gameFramework.i.b g;
    ArrayList h = new ArrayList();
    HashMap i = new HashMap();
    ArrayList j = new ArrayList();
    int k;

    private void e() {
        if (this.j.size() == 0) {
            return;
        }
        SteamUGCQuery steamUGCQuery = this.d.createQueryUGCDetailsRequest((Collection)this.j);
        this.j.clear();
        this.d.sendQueryUGCRequest(steamUGCQuery);
        this.d.releaseQueryUserUGCRequest(steamUGCQuery);
        SteamAPI.runCallbacks();
    }

    private void e(SteamPublishedFileID steamPublishedFileID) {
        l.e("Adding request for workshop details: " + steamPublishedFileID);
        this.j.add((Object)steamPublishedFileID);
    }

    public h a(SteamPublishedFileID steamPublishedFileID) {
        h h2 = (h)this.i.get((Object)steamPublishedFileID);
        if (h2 == null) {
            l.e("New ItemInfo: " + steamPublishedFileID);
            h2 = new h();
            h2.a = steamPublishedFileID;
            this.i.put((Object)steamPublishedFileID, (Object)h2);
        }
        return h2;
    }

    public String b(SteamPublishedFileID steamPublishedFileID) {
        h h2 = this.a(steamPublishedFileID);
        if (h2.b == 0L && !h2.c) {
            h2.b = System.currentTimeMillis();
            this.e(steamPublishedFileID);
        }
        if (h2.c) {
            l.e("Got data for: " + steamPublishedFileID + " - " + h2.d);
            return h2.d;
        }
        l.e("No data for: " + steamPublishedFileID);
        return null;
    }

    public i c(SteamPublishedFileID steamPublishedFileID) {
        for (i i2 : this.h) {
            if (!i2.a.equals(steamPublishedFileID)) continue;
            return i2;
        }
        return null;
    }

    public g(b b2) {
        this.b = b2;
        this.c = new j(this);
    }

    public void a(SteamUGC steamUGC) {
        this.d = steamUGC;
    }

    public SteamUGCCallback a() {
        return this.c;
    }

    public void a(com.corrodinggames.rts.gameFramework.i.b b2, String string2, boolean bl2) {
        l.e("workshop: " + string2);
        if (bl2) {
            l.B().i(string2);
        }
    }

    public boolean a(com.corrodinggames.rts.gameFramework.i.b b2) {
        if (b2.s == null) {
            this.a(b2, "A title is required in the file 'mod-info.txt'", true);
            return false;
        }
        if (!b2.r) {
            this.a(b2, "Please add and setup the file 'mod-info.txt' to this mod before uploading", true);
            return false;
        }
        String string2 = b2.p();
        if (string2 != null && !com.corrodinggames.rts.gameFramework.e.a.i(string2)) {
            this.a(b2, "Could not find thumbnail file: " + string2 + " referenced mod-info.txt", true);
            return false;
        }
        return true;
    }

    public void b(com.corrodinggames.rts.gameFramework.i.b b2) {
        if (this.e != null) {
            this.a(b2, "A mod is already pending publishing", false);
            return;
        }
        if (b2.k != 0L) {
            this.a(b2, "This mod has already been published", false);
            return;
        }
        if (!this.a(b2)) {
            return;
        }
        if (!b2.a(0L)) {
            this.a(b2, "Failed to write metadata to mod, check file permissions", true);
            return;
        }
        this.e = b2;
        int n2 = this.b.j.getAppID();
        SteamAPICall steamAPICall = this.d.createItem(n2, SteamRemoteStorage$WorkshopFileType.Community);
    }

    public void a(com.corrodinggames.rts.gameFramework.i.b b2, boolean bl2, String string2) {
        String[] stringArray;
        String string3;
        String string4;
        if (!this.a(b2)) {
            return;
        }
        int n2 = this.b.j.getAppID();
        SteamPublishedFileID steamPublishedFileID = new SteamPublishedFileID(b2.k);
        SteamUGCUpdateHandle steamUGCUpdateHandle = this.d.startItemUpdate(n2, steamPublishedFileID);
        if (bl2) {
            if (b2.s != null) {
                this.d.setItemTitle(steamUGCUpdateHandle, b2.s);
            }
            if (b2.u != null) {
                this.d.setItemDescription(steamUGCUpdateHandle, b2.u);
            }
        }
        if (bl2) {
            this.d.setItemVisibility(steamUGCUpdateHandle, SteamRemoteStorage$PublishedFileVisibility.Public);
        }
        if ((string4 = b2.p()) != null) {
            this.d.setItemPreview(steamUGCUpdateHandle, string4);
        }
        if ((string3 = b2.c("tags")) != null) {
            stringArray = string3.split(",");
            for (int i2 = 0; i2 < stringArray.length; ++i2) {
                stringArray[i2] = stringArray[i2].trim();
                l.e("Adding tag:" + stringArray[i2]);
            }
            this.d.setItemTags(steamUGCUpdateHandle, stringArray);
        }
        stringArray = b2.i();
        l.e("convertedAbsolutePath:" + (String)stringArray);
        this.d.setItemContent(steamUGCUpdateHandle, (String)stringArray);
        b2.S = "Uploading to workshop";
        this.f = bl2;
        this.g = b2;
        this.d.submitItemUpdate(steamUGCUpdateHandle, string2);
        l.e("submitted item update for:" + b2.k);
    }

    public void b() {
        int n2 = this.b.j.getAppID();
        this.b.c.activateGameOverlayToWebPage("http://steamcommunity.com/workshop/browse/?appid=" + n2);
    }

    public void c(com.corrodinggames.rts.gameFramework.i.b b2) {
        this.b.c.activateGameOverlayToWebPage("steam://url/CommunityFilePage/" + b2.k);
    }

    public long d(SteamPublishedFileID steamPublishedFileID) {
        return SteamNativeHandle.getNativeHandle(steamPublishedFileID);
    }

    public void c() {
        int n2;
        if (this.a) {
            this.a = false;
            l l2 = l.B();
            l2.bZ.m();
        }
        if ((n2 = this.d.getNumSubscribedItems()) != this.k) {
            l.e("Number of subscribed items changed from: " + this.k + " to: " + n2);
            this.k = n2;
            l l3 = l.B();
            this.d();
            this.a = true;
        }
    }

    public void d() {
        int n2;
        l l2 = l.B();
        SteamAPI.runCallbacks();
        l.e("--------------");
        l.e("Steam: loadWorkshopMods");
        this.k = n2 = this.d.getNumSubscribedItems();
        SteamPublishedFileID[] steamPublishedFileIDArray = new SteamPublishedFileID[n2];
        this.d.getSubscribedItems(steamPublishedFileIDArray);
        for (SteamPublishedFileID steamPublishedFileID : steamPublishedFileIDArray) {
            Object object;
            Object object22;
            Collection collection = this.d.getItemState(steamPublishedFileID);
            long l3 = this.d(steamPublishedFileID);
            boolean bl2 = false;
            boolean bl3 = false;
            boolean bl4 = false;
            boolean bl5 = false;
            boolean bl6 = false;
            String string2 = null;
            for (Object object22 : collection) {
                if (object22 == SteamUGC$ItemState.None) continue;
                string2 = string2 == null ? "" + (Object)object22 : string2 + ", " + (Object)object22;
                if (object22 == SteamUGC$ItemState.Downloading) {
                    bl3 = true;
                }
                if (object22 == SteamUGC$ItemState.DownloadPending) {
                    bl3 = true;
                    bl4 = true;
                }
                if (object22 == SteamUGC$ItemState.Installed) {
                    bl2 = true;
                }
                if (object22 == SteamUGC$ItemState.NeedsUpdate) {
                    bl5 = true;
                }
                if (object22 != SteamUGC$ItemState.Subscribed) continue;
                bl6 = true;
            }
            l.e("Found workshop item " + l3 + " with state: " + string2 + "");
            Object object3 = "sw" + l3;
            object22 = "(Workshop item - " + l3 + ")";
            if (!bl2 && (object = this.b(steamPublishedFileID)) != null) {
                object22 = object;
            }
            object = object3;
            String string3 = null;
            String string4 = null;
            if (!bl6) {
                l.e("Skipping: " + l3 + " as it is not subscribed");
                continue;
            }
            if (bl2) {
                SteamUGC$ItemInstallInfo steamUGC$ItemInstallInfo = new SteamUGC$ItemInstallInfo();
                this.d.getItemInstallInfo(steamPublishedFileID, steamUGC$ItemInstallInfo);
                string3 = steamUGC$ItemInstallInfo.getFolder();
                l.e(" Installed at: " + string3);
            } else {
                l.e(" Not installed");
                string4 = "Not installed.";
                if (bl5) {
                    string4 = "Update needed..";
                }
                if (bl4) {
                    string4 = "Download pending in steam...";
                } else if (bl3) {
                    string4 = "Steam is downloading files..";
                    SteamUGC$ItemDownloadInfo steamUGC$ItemDownloadInfo = new SteamUGC$ItemDownloadInfo();
                    if (this.d.getItemDownloadInfo(steamPublishedFileID, steamUGC$ItemDownloadInfo)) {
                        double d2 = (double)steamUGC$ItemDownloadInfo.getBytesDownloaded() / (double)steamUGC$ItemDownloadInfo.getBytesTotal();
                        string4 = string4 + " " + com.corrodinggames.rts.gameFramework.f.c(d2 * 100.0) + "%";
                    }
                }
            }
            boolean bl7 = true;
            boolean bl8 = true;
            boolean bl9 = false;
            int n3 = 0;
            if (!bl2) {
                n3 = -1;
            }
            com.corrodinggames.rts.gameFramework.i.b b2 = l2.bZ.a((String)object3, (String)object3, string3, (String)object, bl7, bl8, bl9, n3);
            if (b2.s == null) {
                b2.t = object22;
            }
            if (string4 == null && bl5) {
                string4 = bl4 ? "An update is pending download in Steam." : (bl4 ? "An update is downloading..." : "An update is available.");
            }
            b2.T = string4;
            if (bl2 && !bl5 || bl3 && !bl4) continue;
            l.e("Queuing download on: " + steamPublishedFileID);
            this.d.downloadItem(steamPublishedFileID, false);
        }
        this.e();
    }
}

