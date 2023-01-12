/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.awt.Toolkit
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  org.lwjgl.Sys
 *  org.lwjgl.opengl.Display
 *  org.lwjgl.opengl.DisplayMode
 *  org.lwjgl.opengl.GL11
 *  org.newdawn.slick.SlickException
 */
package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.java.Main;
import java.awt.Toolkit;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.SlickException;

class j
implements Runnable {
    final /* synthetic */ Main a;

    j(Main main) {
        this.a = main;
    }

    public void run() {
        l.aq();
        try {
            this.a.k.start();
        }
        catch (SlickException slickException) {
            if (!"Failed to initialise the LWJGL display".equals((Object)slickException.getMessage())) {
                throw new RuntimeException((Throwable)slickException);
            }
            l.a("Error starting display", (Throwable)slickException);
            String string2 = "\nFailed to get opengl version";
            try {
                System.setProperty((String)"org.lwjgl.opengl.Display.allowSoftwareOpenGL", (String)"true");
                Display.setDisplayMode((DisplayMode)new DisplayMode(100, 100));
                Display.create();
                String string3 = GL11.glGetString((int)7938);
                Display.destroy();
                l.e("OpenGL version: " + string3);
                string2 = "\n";
                string2 = string2 + "OpenGL version detected: " + string3;
                if (string3.startsWith("1.0") || string3.startsWith("1.1")) {
                    string2 = string2 + "\n---\nOpenGL 1.1 is over 20 years old you might be using a fallback microsoft driver. Try updating your graphics drivers from the manufacturer.";
                }
            }
            catch (Exception exception) {
                l.a("Failed to get opengl info", (Throwable)exception);
            }
            Toolkit.getDefaultToolkit();
            Sys.alert((String)"Error", (String)("Failed to create display." + string2));
            System.exit((int)1);
        }
        l.e("Game stopped running shutting down");
        l l2 = l.B();
        l2.ca.b("lastgame", false);
        this.a.a(true);
    }
}

