/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileNotFoundException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.corrodinggames.rts.java.audio.a;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class a {
    protected InputStream a;
    protected File b;
    protected String c;

    public a(String string2) {
        this.b = new File(string2);
        this.c = this.b.getName();
    }

    public a(InputStream inputStream, String string2) {
        this.a = inputStream;
        this.c = string2;
        if (this.a == null) {
            throw new RuntimeException("inputStream==null");
        }
    }

    public InputStream a() {
        if (this.a != null) {
            return this.a;
        }
        try {
            return new FileInputStream(this.b);
        }
        catch (FileNotFoundException fileNotFoundException) {
            throw new RuntimeException((Throwable)fileNotFoundException);
        }
    }

    public String b() {
        String string2 = this.c;
        int n2 = string2.lastIndexOf(46);
        if (n2 == -1) {
            return "";
        }
        return string2.substring(n2 + 1);
    }
}

