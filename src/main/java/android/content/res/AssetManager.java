/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.AssetFileDescriptor
 *  android.os.ParcelFileDescriptor
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 */
package android.content.res;

import android.content.res.AssetFileDescriptor;
import android.os.ParcelFileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class AssetManager {
    private static final Object b = new Object();
    static AssetManager a = null;
    private final long[] c = new long[2];
    private int d = 1;
    private boolean e = true;

    public final InputStream a(String string2) {
        return this.a(string2, 2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final InputStream a(String string2, int n2) {
        AssetManager assetManager = this;
        synchronized (assetManager) {
            if (!this.e) {
                throw new RuntimeException("Assetmanager has been closed");
            }
            return new FileInputStream("assets/" + string2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final AssetFileDescriptor b(String string2) {
        AssetManager assetManager = this;
        synchronized (assetManager) {
            if (!this.e) {
                throw new RuntimeException("Assetmanager has been closed");
            }
            ParcelFileDescriptor parcelFileDescriptor = this.openAssetFd(string2, this.c);
            if (parcelFileDescriptor != null) {
                return new AssetFileDescriptor(parcelFileDescriptor, this.c[0], this.c[1]);
            }
        }
        throw new FileNotFoundException("Asset file: " + string2);
    }

    public final String[] c(String string2) {
        return new String[0];
    }

    protected void finalize() {
        try {
            this.a();
        }
        finally {
            super.finalize();
        }
    }

    private final native ParcelFileDescriptor openAssetFd(String var1, long[] var2);

    private final native void destroyAsset(int var1);

    private final native int readAssetChar(int var1);

    private final native int readAsset(int var1, byte[] var2, int var3, int var4);

    private final native long seekAsset(int var1, long var2, int var4);

    private final native long getAssetRemainingLength(int var1);

    private final void a() {
    }

    private final void a(int n2) {
        --this.d;
        if (this.d == 0) {
            this.a();
        }
    }

    static /* synthetic */ int a(AssetManager assetManager, int n2) {
        return assetManager.readAssetChar(n2);
    }

    static /* synthetic */ long b(AssetManager assetManager, int n2) {
        return assetManager.getAssetRemainingLength(n2);
    }

    static /* synthetic */ void c(AssetManager assetManager, int n2) {
        assetManager.destroyAsset(n2);
    }

    static /* synthetic */ void d(AssetManager assetManager, int n2) {
        assetManager.a(n2);
    }

    static /* synthetic */ long a(AssetManager assetManager, int n2, long l2, int n3) {
        return assetManager.seekAsset(n2, l2, n3);
    }

    static /* synthetic */ int a(AssetManager assetManager, int n2, byte[] byArray, int n3, int n4) {
        return assetManager.readAsset(n2, byArray, n3, n4);
    }
}

