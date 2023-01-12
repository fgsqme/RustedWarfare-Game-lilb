/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Thread
 *  java.lang.Throwable
 *  org.lwjgl.opengl.Display
 *  org.newdawn.slick.AppGameContainer
 *  org.newdawn.slick.Game
 *  org.newdawn.slick.GameContainer
 *  org.newdawn.slick.Graphics
 *  org.newdawn.slick.Music
 */
package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.am;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.java.c;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Game;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Music;

public class b
extends AppGameContainer {
    boolean a = false;
    Object b = new Object();
    c c;

    public b(Game game, int n2, int n3, boolean bl2) {
        super(game, n2, n3, bl2);
    }

    public Graphics a() {
        Graphics graphics = this.getGraphics();
        this.input.poll(this.width, this.height);
        Music.poll((int)1);
        if (am.a != null) {
            am.a.a(1);
        }
        GL.glClear(16640);
        GL.glLoadIdentity();
        graphics.resetTransform();
        graphics.resetFont();
        graphics.resetLineWidth();
        graphics.setAntiAlias(false);
        return graphics;
    }

    public void a(Graphics graphics) {
        graphics.resetTransform();
        GL.flush();
        Display.update();
    }

    protected void gameLoop() {
        int n2 = this.getDelta();
        if (!Display.isVisible() && this.updateOnlyOnVisible) {
            try {
                Thread.sleep((long)100L);
            }
            catch (Exception exception) {}
        } else {
            this.updateAndRender(n2);
        }
        this.updateFPS();
        Display.update((boolean)false);
        if (!this.a) {
            Display.processMessages();
        } else if (this.c == null) {
            this.c = new c(this);
            this.c.start();
        }
        if (Display.isCloseRequested() && this.game.closeRequested()) {
            this.running = false;
        }
    }

    protected void updateAndRender(int n2) {
        if (this.smoothDeltas && this.getFPS() != 0) {
            n2 = 1000 / this.getFPS();
        }
        this.input.poll(this.width, this.height);
        Music.poll((int)n2);
        if (am.a != null) {
            am.a.a(n2);
        }
        if (!this.paused) {
            this.storedDelta += (long)n2;
            if (this.storedDelta >= this.minimumLogicInterval) {
                if (this.maximumLogicInterval != 0L) {
                    long l2 = this.storedDelta / this.maximumLogicInterval;
                    int n3 = 0;
                    while ((long)n3 < l2) {
                        this.game.update((GameContainer)this, (int)this.maximumLogicInterval);
                        ++n3;
                    }
                    n3 = (int)(this.storedDelta % this.maximumLogicInterval);
                    if ((long)n3 > this.minimumLogicInterval) {
                        this.game.update((GameContainer)this, (int)((long)n3 % this.maximumLogicInterval));
                        this.storedDelta = 0L;
                    } else {
                        this.storedDelta = n3;
                    }
                } else {
                    this.game.update((GameContainer)this, (int)this.storedDelta);
                    this.storedDelta = 0L;
                }
            }
        } else {
            this.game.update((GameContainer)this, 0);
        }
        if (this.hasFocus() || this.getAlwaysRender()) {
            if (this.clearEachFrame) {
                GL.glClear(16640);
            }
            GL.glLoadIdentity();
            Graphics graphics = this.getGraphics();
            graphics.resetTransform();
            graphics.resetFont();
            graphics.resetLineWidth();
            graphics.setAntiAlias(false);
            this.game.render((GameContainer)this, graphics);
            graphics.resetTransform();
            if (this.isShowingFPS()) {
                this.getDefaultFont().drawString(10.0f, 10.0f, "FPS: " + this.recordedFPS);
            }
            GL.flush();
        }
        if (this.targetFPS != -1) {
            Display.sync((int)this.targetFPS);
        }
    }

    public void destroy() {
        try {
            Display.destroy();
        }
        catch (Exception exception) {
            l.a("Error on Display.destroy in destroy", (Throwable)exception);
        }
    }
}

