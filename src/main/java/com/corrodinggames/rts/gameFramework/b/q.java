/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.opengl.GLES20
 *  java.lang.Object
 *  java.lang.String
 */
package com.corrodinggames.rts.gameFramework.b;

import android.opengl.GLES20;

abstract class q {
    public int a = -1;
    protected final String b;
    public int c = -1;

    public q(String string2) {
        this.b = string2;
    }

    public abstract void a(int var1);

    public void a(float[] fArray) {
        GLES20.glUniformMatrix4fv((int)this.a, (int)1, (boolean)false, (float[])fArray, (int)0);
    }
}

