/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Enumeration
 *  java.util.MissingResourceException
 *  java.util.ResourceBundle
 *  java.util.Vector
 */
package com.corrodinggames.rts.gameFramework.h;

import com.corrodinggames.rts.gameFramework.l;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Vector;

strictfp class b
extends ResourceBundle {
    ResourceBundle a;
    ResourceBundle b;

    public b(ResourceBundle resourceBundle, ResourceBundle resourceBundle2) {
        this.a = resourceBundle;
        this.b = resourceBundle2;
    }

    public Enumeration getKeys() {
        l.e("MultipleResourceBundle: Slow get keys");
        Vector vector = new Vector();
        vector.addAll((Collection)Collections.list((Enumeration)this.a.getKeys()));
        if (this.b != null) {
            for (String string2 : Collections.list((Enumeration)this.b.getKeys())) {
                if (vector.contains((Object)string2)) continue;
                vector.add((Object)string2);
            }
        }
        return vector.elements();
    }

    protected Object handleGetObject(String string2) {
        Object object;
        try {
            object = this.a.getObject(string2);
        }
        catch (MissingResourceException missingResourceException) {
            object = null;
        }
        if (object == null && this.b != null) {
            try {
                object = this.b.getObject(string2);
            }
            catch (MissingResourceException missingResourceException) {
                object = null;
            }
        }
        return object;
    }
}

