/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentCallbacks
 *  android.content.ComponentCallbacks2
 *  android.content.res.Configuration
 *  java.lang.Object
 *  java.util.ArrayList
 */
package android.app;

import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import java.util.ArrayList;

public class Application
extends ContextWrapper
implements ComponentCallbacks2 {
    private ArrayList b = new ArrayList();
    private ArrayList c = new ArrayList();
    private ArrayList d = null;

    public Application() {
        super(null);
    }

    public void onConfigurationChanged(Configuration configuration) {
        Object[] objectArray = this.a();
        if (objectArray != null) {
            for (int i2 = 0; i2 < objectArray.length; ++i2) {
                ((ComponentCallbacks)objectArray[i2]).onConfigurationChanged(configuration);
            }
        }
    }

    public void onLowMemory() {
        Object[] objectArray = this.a();
        if (objectArray != null) {
            for (int i2 = 0; i2 < objectArray.length; ++i2) {
                ((ComponentCallbacks)objectArray[i2]).onLowMemory();
            }
        }
    }

    public void onTrimMemory(int n2) {
        Object[] objectArray = this.a();
        if (objectArray != null) {
            for (int i2 = 0; i2 < objectArray.length; ++i2) {
                Object object = objectArray[i2];
                if (!(object instanceof ComponentCallbacks2)) continue;
                ((ComponentCallbacks2)object).onTrimMemory(n2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Object[] a() {
        Object[] objectArray = null;
        ArrayList arrayList = this.b;
        synchronized (arrayList) {
            if (this.b.size() > 0) {
                objectArray = this.b.toArray();
            }
        }
        return objectArray;
    }
}

