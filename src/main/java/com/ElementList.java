/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 */
package com;

import com.Element;
import java.util.ArrayList;

public class ElementList {
    ArrayList elements = new ArrayList();

    public Element getFirst() {
        if (this.elements.size() > 0) {
            return (Element)this.elements.get(0);
        }
        return null;
    }
}

