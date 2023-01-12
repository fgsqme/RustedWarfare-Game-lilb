/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.awt.Desktop
 *  java.awt.Desktop$Action
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.System
 *  java.net.URI
 *  java.net.URISyntaxException
 *  java.util.LinkedList
 */
package com.corrodinggames.librocket;

import com.corrodinggames.librocket.a$1;
import com.corrodinggames.librocket.a$2;
import com.corrodinggames.librocket.b;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.appFramework.f;
import com.corrodinggames.rts.appFramework.i;
import com.corrodinggames.rts.gameFramework.j.ae;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedList;

public abstract class a {
    protected static a a;
    public b b;
    public f c;
    boolean d = true;
    boolean e = true;

    public static a a() {
        return a;
    }

    public void a(b b2, f f2) {
        this.b = b2;
        this.c = f2;
    }

    public void b() {
        l l2 = l.B();
        if (l2 != null) {
            l2.a(null, this.c, true);
        } else {
            l.e("showMainMenu: game is null");
        }
        this.b.setDocument("mainMenu.rml");
    }

    public void c() {
    }

    public void d() {
        this.b.setDocument("settings.rml");
    }

    public void e() {
        this.b.setDocument("leaderboard.rml");
    }

    public synchronized void a(boolean bl2) {
        this.e = bl2;
        this.f();
    }

    public synchronized void f() {
        l l2 = l.B();
        if (l2 == null) {
            l.b("Main::resumeGame(): game==null");
            return;
        }
        l2.bD = true;
        l2.a(null, this.c, this.e);
    }

    public synchronized void b(boolean bl2) {
        l l2 = l.B();
        if (!bl2) {
            l.e("endGame: queDisconnectAndWait");
            l2.bX.u();
        } else {
            l.e("endGame: network disconnect");
            l2.bX.b("shutdownServer");
        }
    }

    public synchronized void a(String string2) {
        this.b(true);
        l l2 = l.B();
        this.e = false;
        String string3 = string2;
        boolean bl2 = false;
        int n2 = 8;
        int n3 = 0;
        boolean bl3 = true;
        boolean bl4 = false;
        i.a(string3, bl2, n2, n3, bl3, bl4);
        this.f();
    }

    public void c(boolean bl2) {
        this.e = bl2;
    }

    public abstract void g();

    public abstract void h();

    public abstract int i();

    public abstract void d(boolean var1);

    public boolean j() {
        return this.b != null && !this.b.b();
    }

    public void a(int n2, char c2) {
        int n3 = SlickToAndroidKeycodes.b(n2);
        if (this.j()) {
            Integer n4 = SlickToAndroidKeycodes.c(n2);
            Object object = this.b.b("event_onkeydown");
            if (object != null) {
                ScriptEngine.getInstance().addScriptToQueue(object + "(" + n3 + ");");
                if (this.b.c() != null) {
                    return;
                }
            }
            if (c2 > '\u00ff') {
                ScriptEngine.getInstance().addRunnableToQueue(new a$1(this));
            }
            if (n2 == 30 && this.i() == 1) {
                this.b.processKeyDown(93, 0);
                this.b.processKeyUp(93, 0);
                this.b.processKeyDown(91, 2);
                this.b.processKeyUp(91, 2);
                return;
            }
            if (n2 == 46 && this.i() == 1) {
                this.b.processKeyDown(14, 1);
                return;
            }
            if (n2 == 47 && this.i() == 1) {
                this.b.processKeyDown(33, 1);
                return;
            }
            if (n4 != null) {
                this.b.processKeyDown(n4, this.i());
            } else if (c2 != '\u0000') {
                if (Character.isISOControl((char)c2)) {
                    if (c2 == '\b') {
                        l.e("backspace char pressed");
                        this.b.processKeyDown(69, 0);
                        this.b.processKeyUp(69, 0);
                    } else {
                        l.e("keyPressed skipping isISOControl:" + n2 + " c:" + c2 + " c_print:" + c2);
                    }
                } else {
                    this.b.processTextInputChar(c2);
                }
            }
            if (n2 == 28 || n2 == 156) {
                ScriptEngine.getInstance().addScriptToQueue("onEnter();");
            } else if (c2 == '\r') {
                l.e("keyPressed: new line entered");
                ScriptEngine.getInstance().addScriptToQueue("onEnter();");
            }
            if (n2 == 1) {
                ScriptEngine.getInstance().addScriptToQueue("onEscape();");
            }
            return;
        }
        l l2 = l.B();
        if (l2 != null) {
            l2.b(n3, true);
            if (n2 == 1) {
                // empty if block
            }
            return;
        }
    }

    public LinkedList k() {
        return null;
    }

    public boolean b(String string2) {
        block12: {
            try {
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    try {
                        l.e("Opening link from desktop api");
                        Desktop.getDesktop().browse(new URI(string2));
                        return true;
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                        break block12;
                    }
                    catch (URISyntaxException uRISyntaxException) {
                        uRISyntaxException.printStackTrace();
                        break block12;
                    }
                }
                String string3 = System.getProperty((String)"os.name").toLowerCase();
                String[] stringArray = null;
                if (string3.contains((CharSequence)"win")) {
                    stringArray = new String[]{"rundll32", "url.dll,FileProtocolHandler", string2};
                }
                if (string3.contains((CharSequence)"mac")) {
                    stringArray = new String[]{"open", string2};
                }
                if (string3.contains((CharSequence)"nix") || string3.contains((CharSequence)"nux")) {
                    stringArray = new String[]{"xdg-open", string2};
                }
                if (stringArray != null) {
                    Runtime runtime = Runtime.getRuntime();
                    try {
                        runtime.exec(stringArray);
                        return true;
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                    }
                }
            }
            catch (RuntimeException runtimeException) {
                runtimeException.printStackTrace();
            }
        }
        return false;
    }

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }

    public void o() {
        ScriptEngine scriptEngine;
        l l2 = l.B();
        if (!l2.bX.aW && (scriptEngine = ScriptEngine.getInstance()) != null) {
            scriptEngine.addScriptToQueue("mp.closeBattleroomIfOpen()");
        }
    }

    public void a(ae ae2) {
        l l2 = l.B();
        ScriptEngine scriptEngine = ScriptEngine.getInstance();
        if (scriptEngine != null) {
            a$2 a$2 = new a$2(this, scriptEngine, ae2);
            scriptEngine.addRunnableToQueue(a$2);
        }
    }
}

