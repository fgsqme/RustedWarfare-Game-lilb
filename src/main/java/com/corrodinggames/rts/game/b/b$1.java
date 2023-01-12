/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.ByteArrayInputStream
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  org.xml.sax.EntityResolver
 *  org.xml.sax.InputSource
 */
package com.corrodinggames.rts.game.b;

import com.corrodinggames.rts.game.b.b;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;

strictfp class b$1
implements EntityResolver {
    final /* synthetic */ b a;

    b$1(b b2) {
        this.a = b2;
    }

    public InputSource resolveEntity(String string2, String string3) {
        return new InputSource((InputStream)new ByteArrayInputStream(new byte[0]));
    }
}

