/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.content.SharedPreferences
 *  android.content.pm.PackageManager
 *  android.content.res.Resources
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 */
package android.content;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ServerContext
extends Context {
    AssetManager a = new AssetManager();

    @Override
    public AssetManager d() {
        return this.a;
    }

    @Override
    public Resources e() {
        return null;
    }

    @Override
    public PackageManager f() {
        return null;
    }

    @Override
    public Context g() {
        return this;
    }

    @Override
    public String h() {
        return null;
    }

    @Override
    public SharedPreferences a(String string2, int n2) {
        return null;
    }

    @Override
    public FileInputStream a(String string2) {
        return null;
    }

    @Override
    public FileOutputStream b(String string2, int n2) {
        return null;
    }

    @Override
    public File b(String string2) {
        return null;
    }

    @Override
    public File i() {
        return null;
    }

    @Override
    public File j() {
        return null;
    }

    @Override
    public void a(Intent intent) {
    }

    @Override
    public Object c(String string2) {
        return null;
    }
}

