/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.IndexOutOfBoundsException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  org.newdawn.slick.Image
 *  org.newdawn.slick.ImageBuffer
 *  org.newdawn.slick.SlickException
 *  org.newdawn.slick.opengl.ImageData
 */
package com.corrodinggames.rts.java;

import android.graphics.Color;
import com.corrodinggames.rts.gameFramework.br;
import com.corrodinggames.rts.gameFramework.j;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.java.e;
import com.corrodinggames.rts.java.t;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import org.newdawn.slick.Image;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.ImageData;

public class s
extends com.corrodinggames.rts.gameFramework.m.e {
    public static ArrayList y;
    private Image x;
    ImageData z;
    ByteBuffer A;
    int B;
    String C;
    boolean D = false;
    int E = 1;
    static boolean F;
    boolean G = false;
    boolean H;
    boolean I = false;
    long J = -1L;
    static int K;

    public Image C() {
        return this.x;
    }

    private void a(ImageData imageData) {
        this.z = imageData;
        this.A = this.z instanceof ImageBuffer ? ByteBuffer.wrap((byte[])((ImageBuffer)imageData).getRGBA()) : imageData.getImageBufferData();
        this.B = imageData.getDepth() / 8;
        if (this.B == 4) {
            int n2 = imageData.getTexHeight();
            int n3 = imageData.getTexWidth();
            int n4 = imageData.getHeight();
            int n5 = imageData.getWidth();
            for (int i2 = 0; i2 < n4; ++i2) {
                for (int i3 = 0; i3 < n5; ++i3) {
                    int n6 = i3 * 4 + i2 * n3 * 4;
                    try {
                        if (this.A.get(n6 + 3) != 0) continue;
                        this.A.put(n6 + 0, (byte)0);
                        this.A.put(n6 + 1, (byte)0);
                        this.A.put(n6 + 2, (byte)0);
                        continue;
                    }
                    catch (IndexOutOfBoundsException indexOutOfBoundsException) {
                        throw new IndexOutOfBoundsException("offset:" + n6 + " x:" + i3 + " y:" + i2 + " height:" + n4 + " width:" + n5 + " texHeight:" + n2 + " texWidth:" + n3);
                    }
                }
            }
        }
        if (F) {
            // empty if block
        }
    }

    @Override
    public String a() {
        if (this.g != null) {
            return this.g;
        }
        return this.C;
    }

    public s() {
        if (y == null) {
            y = new ArrayList();
        }
        y.add((Object)this);
    }

    public void D() {
        Image image;
        if (this.z == null && this.x != null) {
            com.corrodinggames.rts.gameFramework.l.b("reloadFromImageData: slickImageData==null and slickImage!=null. Ignoring");
            return;
        }
        if (this.x != null) {
            try {
                this.x.destroy();
            }
            catch (SlickException slickException) {
                throw new RuntimeException((Throwable)slickException);
            }
        }
        if ((image = null) == null) {
            image = new Image(this.z);
        }
        this.x = image;
        this.E();
        this.p = this.x.getWidth();
        this.q = this.x.getHeight();
        this.g();
        this.v();
    }

    public void a(Image image, String string2) {
        if (this.x != null) {
            com.corrodinggames.rts.gameFramework.l.g("this.slickImage!=null");
        }
        this.x = image;
        this.E();
        this.p = this.x.getWidth();
        this.q = this.x.getHeight();
        this.g();
        this.C = string2;
        if (this.C != null) {
            File file = new File(this.C);
            if (!file.exists()) {
                throw new RuntimeException(this.C + " does not exist");
            }
            this.J = this.c(true);
        }
    }

    public void a(ImageData imageData, String string2, boolean bl2) {
        this.a(imageData);
        if (!bl2) {
            this.D();
        }
        this.C = string2;
        if (this.C != null && !this.C.contains((CharSequence)".rwmod")) {
            File file = new File(this.C);
            if (!file.exists()) {
                throw new RuntimeException(this.C + " does not exist");
            }
            this.J = this.c(true);
        }
        this.g();
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        byteBuffer.rewind();
        byteBuffer2.put(byteBuffer);
        byteBuffer.rewind();
        byteBuffer2.flip();
        return byteBuffer2;
    }

    @Override
    public com.corrodinggames.rts.gameFramework.m.e a(int n2, int n3, boolean bl2) {
        s s2 = new s();
        ImageBuffer imageBuffer = new ImageBuffer(n2, n3);
        String string2 = null;
        s2.a((ImageData)imageBuffer, string2, true);
        if (bl2) {
            boolean bl3 = true;
            if (bl3 && this.B == 4) {
                this.H();
                ByteBuffer byteBuffer = this.z.getImageBufferData();
                com.corrodinggames.rts.java.s.a(byteBuffer, s2.A);
            } else {
                this.H();
                for (int i2 = 0; i2 < n3; ++i2) {
                    for (int i3 = 0; i3 < n2; ++i3) {
                        s2.a(i3, i2, this.a(i3, i2));
                    }
                }
            }
        }
        s2.p = n2;
        s2.q = n3;
        s2.g();
        s2.D = true;
        return s2;
    }

    @Override
    public void i() {
        if (!this.G) {
            this.j();
        } else if (F && this.A == null) {
            this.j();
        }
    }

    @Override
    public void x() {
        this.H();
    }

    @Override
    public void y() {
    }

    @Override
    public void j() {
        this.G = true;
        if (this.H) {
            this.G();
            throw new RuntimeException("Cannot buffer pixels, we have discarded the PixelBuffer");
        }
        this.H();
    }

    public void H() {
        if (F && this.A == null) {
            this.J();
        }
    }

    @Override
    public void q() {
        this.I();
    }

    public void I() {
        if (F) {
            this.z = null;
            this.A = null;
        }
    }

    public void J() {
        if (this.x == null) {
            throw new RuntimeException("Cannot buffer pixels, we have no slickImage");
        }
        long l2 = br.a();
        t t2 = new t(this, this.x);
        this.z = t2;
        this.A = ByteBuffer.wrap((byte[])t2.a());
        double d2 = br.a(l2);
        com.corrodinggames.rts.gameFramework.l.e("Recreating image data from texture: " + this.a() + " (" + br.a(d2) + ")");
    }

    @Override
    public boolean k() {
        if (this.z == null) {
            return F && this.x != null;
        }
        return true;
    }

    @Override
    public int a(int n2, int n3) {
        try {
            return com.corrodinggames.rts.java.e.a(this.z, this.A, n2, n3, this.B);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            String string2 = "getPixel out of bounds";
            string2 = string2 + " (x:" + n2 + " y:" + n3 + " perPixel:" + this.B + " TexWidth:" + this.z.getTexWidth() + " TexHeight:" + this.z.getTexHeight() + " imageByteBuffer:" + this.A.limit() + " width:" + this.p + " height:" + this.q + ")";
            throw new RuntimeException(string2, (Throwable)indexOutOfBoundsException);
        }
    }

    @Override
    public void a(int n2, int n3, int n4) {
        try {
            com.corrodinggames.rts.java.e.a(this.z, this.A, n2, n3, Color.b(n4), Color.c(n4), Color.d(n4), Color.a(n4), this.B);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            String string2 = "setPixel out of bounds";
            string2 = string2 + " (x:" + n2 + " y:" + n3 + " perPixel:" + this.B + " TexWidth:" + this.z.getTexWidth() + " TexHeight:" + this.z.getTexHeight() + " imageByteBuffer:" + this.A.limit() + " width:" + this.p + " height:" + this.q + ")";
            throw new RuntimeException(string2, (Throwable)indexOutOfBoundsException);
        }
    }

    @Override
    public void p() {
        if (!this.G) {
            return;
        }
        this.G = false;
        this.D();
    }

    @Override
    public void r() {
    }

    @Override
    public void s() {
        this.H = true;
        this.z = null;
        this.A = null;
    }

    @Override
    public void n() {
        this.I = true;
    }

    @Override
    public void o() {
        this.z = null;
        this.A = null;
        if (y != null) {
            y.remove((Object)this);
        }
        if (this.x != null) {
            try {
                this.x.destroy();
            }
            catch (SlickException slickException) {
                slickException.printStackTrace();
            }
            this.x = null;
        }
    }

    protected void finalize() {
        if (this.I) {
            this.o();
        }
        if (this.x != null) {
            com.corrodinggames.rts.gameFramework.l.b("SlickBitmapOrTexture: Leak detection: finalize called with slickImage!=null");
        }
    }

    @Override
    public com.corrodinggames.rts.gameFramework.m.e h() {
        return this.a(this.p, this.q, true);
    }

    @Override
    protected void e() {
        this.E();
    }

    public void E() {
        if (this.x == null) {
            com.corrodinggames.rts.gameFramework.l.b("slickImage==null");
            com.corrodinggames.rts.gameFramework.l.T();
        }
        if (!this.o) {
            this.E = 2;
            this.x.setFilter(2);
        } else {
            this.E = 1;
            this.x.setFilter(1);
        }
    }

    public void F() {
        l l2;
        if (this.D) {
            com.corrodinggames.rts.gameFramework.l.e("reloadImage: skipping cloned image:" + this.C);
            return;
        }
        if (this.C == null) {
            com.corrodinggames.rts.gameFramework.l.e("reloadImage: filepath is null, skipping");
            return;
        }
        try {
            com.corrodinggames.rts.gameFramework.l.e("reloadImage: reloading:" + this.C);
            if (this.x != null) {
                this.x.destroy();
            } else {
                com.corrodinggames.rts.gameFramework.l.e("slickImage==null cannot free");
            }
            ++K;
            l2 = new FileInputStream(this.C);
            try {
                this.x = new Image((InputStream)l2, "reload_" + K, false);
            }
            catch (NullPointerException nullPointerException) {
                throw new IOException("Failed to reload", (Throwable)nullPointerException);
            }
            this.v();
            this.E();
            this.p = this.x.getWidth();
            this.q = this.x.getHeight();
            this.g();
            l2.close();
        }
        catch (SlickException slickException) {
            com.corrodinggames.rts.gameFramework.l.e("reloadImage: failed");
            slickException.printStackTrace();
        }
        catch (IOException iOException) {
            com.corrodinggames.rts.gameFramework.l.e("reloadImage: failed");
            iOException.printStackTrace();
        }
        l2 = com.corrodinggames.rts.gameFramework.l.B();
        if (l2 != null && l2.bL != null) {
            l2.bL.g();
        }
    }

    public long c(boolean bl2) {
        if (this.C == null) {
            return -2L;
        }
        return com.corrodinggames.rts.gameFramework.j.a(this.C, bl2);
    }

    @Override
    public void t() {
        long l2 = this.c(false);
        if (this.J == -1L) {
            this.J = l2;
        } else if (this.J != l2) {
            com.corrodinggames.rts.gameFramework.l.e("reloadImage: '" + this.C + "' reloading current now:" + l2);
            this.F();
            this.J = l2;
        }
    }

    public void G() {
        com.corrodinggames.rts.gameFramework.l.e("SlickBitmapOrTexture: " + this.a());
        com.corrodinggames.rts.gameFramework.l.e(" className:" + this.getClass().getSimpleName());
        com.corrodinggames.rts.gameFramework.l.e(" filepath:" + this.C);
        com.corrodinggames.rts.gameFramework.l.e(" slickImage:" + (this.x != null));
        com.corrodinggames.rts.gameFramework.l.e(" cloned:" + this.D);
    }

    @Override
    public /* synthetic */ Object clone() {
        return this.h();
    }

    static {
        F = true;
        K = 1000;
    }
}

