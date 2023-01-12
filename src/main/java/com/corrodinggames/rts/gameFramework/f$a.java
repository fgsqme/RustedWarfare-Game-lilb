/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileFilter
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.regex.Pattern
 */
package com.corrodinggames.rts.gameFramework;

import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

strictfp class f$a
implements FileFilter {
    f$a() {
    }

    public boolean accept(File file) {
        return file != null && Pattern.matches((String)"cpu[0-9]+", (CharSequence)file.getName());
    }
}

