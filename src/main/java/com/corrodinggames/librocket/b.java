/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.Override
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.corrodinggames.librocket;

import android.graphics.Rect;
import android.graphics.RectF;
import com.Element;
import com.ElementDocument;
import com.LibRocket;
import com.corrodinggames.librocket.c;
import com.corrodinggames.librocket.d;
import com.corrodinggames.librocket.e;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.gameFramework.bt;
import com.corrodinggames.rts.gameFramework.e.a;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.j;
import com.corrodinggames.rts.gameFramework.l;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class b
extends LibRocket {
    public static bt a = new bt("LoadResources");
    public static String b = "";
    public ScriptEngine c;
    protected int d = 0;
    public boolean e;
    protected Rect f = new Rect();
    protected RectF g = new RectF();
    protected boolean h = false;
    private d j;
    private d k;
    Pattern i = Pattern.compile((String)"\\$\\{([^\\}]*?)\\}");

    public b() {
        this.c = ScriptEngine.createScriptEngine(this);
    }

    public void a() {
        this.d = 0;
    }

    public static String a(String string2) {
        l.e("convertTexturePath for: " + string2);
        string2 = com.corrodinggames.rts.gameFramework.f.o(string2);
        if (string2.startsWith("base:")) {
            return b + string2.substring("base:".length());
        }
        if (string2.startsWith("drawable:")) {
            return b + "res/drawable/" + string2.substring("drawable:".length());
        }
        if (string2.startsWith("assets:")) {
            String string3 = string2.substring("assets:".length());
            String string4 = com.corrodinggames.rts.gameFramework.e.a.e(string3);
            boolean bl2 = true;
            if (l.aZ && string4 != null && string4.startsWith(b)) {
                bl2 = false;
            }
            if (l.aZ && string4 != null && string4.startsWith("/private")) {
                bl2 = false;
            }
            l.e("convertTexturePath  (basePath:" + bl2 + "):" + string3 + " > " + string4);
            if (bl2) {
                return b + string4;
            }
            return string4;
        }
        if (string2.startsWith(b + "assets/gui/")) {
            l.e("convertTexturePath already had path:" + string2);
            return string2;
        }
        return b + "assets/gui/" + string2;
    }

    public Matcher a(String string2, String string3) {
        Pattern pattern = Pattern.compile((String)string2);
        Matcher matcher = pattern.matcher((CharSequence)string3);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }

    @Override
    public void ReleaseTexture(int n2) {
        this.removeTextureHolder(n2);
    }

    @Override
    public boolean LoadTexture(int n2, String string2) {
        String string3;
        Matcher matcher;
        a.a();
        c c2 = (c)this.findTextureHolder(n2);
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        as as2 = null;
        if (string2.startsWith("lazy:")) {
            string2 = string2.substring("lazy:".length());
            bl2 = true;
        }
        if (string2.startsWith("nocolor:")) {
            string2 = string2.substring("nocolor:".length());
            bl3 = true;
        }
        if (string2.startsWith("unit:")) {
            string2 = string2.substring("unit:".length());
            as2 = ar.a(string2);
            bl2 = true;
        }
        if (string2.startsWith("thumbnail:")) {
            string2 = string2.substring("thumbnail:".length());
            bl4 = true;
        }
        if ((matcher = this.a("^(alpha\\((.*)\\):).*", string2)) != null) {
            string3 = matcher.group(1);
            String string4 = matcher.group(2);
            l.e("alpha=" + string4);
            c2.e = Float.parseFloat((String)string4);
            string2 = string2.substring(string3.length());
        }
        string3 = com.corrodinggames.librocket.b.a(string2);
        c2.b = bl2;
        c2.c = bl4;
        c2.d = bl3;
        c2.f = as2;
        c2.a = string3;
        if (!bl2 && !c2.a()) {
            a.b();
            return false;
        }
        a.b();
        return true;
    }

    @Override
    public abstract void EnableScissorRegion(boolean var1);

    @Override
    public void SetScissorRegion(int n2, int n3, int n4, int n5) {
        this.f.a(n2, n3, n2 + n4, n3 + n5);
        this.g.a(n2, n3, n2 + n4, n3 + n5);
        this.EnableScissorRegion(true);
    }

    public boolean b() {
        if (this.getActiveDocument() != null) {
            return false;
        }
        if (this.k != null) {
            return false;
        }
        return this.j == null;
    }

    @Override
    public void HandleEvent(String string2) {
        this.e = true;
        try {
            this.c.processScript(string2);
        }
        finally {
            this.e = false;
        }
    }

    public Object b(String string2) {
        HashMap hashMap = this.getActiveDocumentMetadata();
        if (hashMap == null) {
            return null;
        }
        return hashMap.get((Object)string2);
    }

    @Override
    public void newDocumentLoaded(ElementDocument elementDocument) {
        this.c.getRootNoCheck().convertTextOnPage();
    }

    @Override
    public void newDocumentShown(ElementDocument elementDocument) {
        if (this.k != null) {
            this.k.a.pullToFront();
        }
        if (this.j != null) {
            this.j.a.pullToFront();
        }
    }

    public ElementDocument c() {
        if (this.k != null) {
            return this.k.a;
        }
        return null;
    }

    public ElementDocument d() {
        if (this.j != null) {
            return this.j.a;
        }
        return null;
    }

    public ElementDocument e() {
        ElementDocument elementDocument = this.d();
        if (elementDocument != null) {
            return elementDocument;
        }
        return this.c();
    }

    public ElementDocument f() {
        ElementDocument elementDocument = this.c();
        if (elementDocument != null) {
            return elementDocument;
        }
        elementDocument = this.getActiveDocument();
        return elementDocument;
    }

    public ElementDocument g() {
        ElementDocument elementDocument = this.d();
        if (elementDocument != null) {
            return elementDocument;
        }
        elementDocument = this.c();
        if (elementDocument != null) {
            return elementDocument;
        }
        elementDocument = this.getActiveDocument();
        return elementDocument;
    }

    public void c(String string2) {
        d d2 = new d();
        d2.b = null;
        d2.c = string2;
        this.a(d2);
    }

    public void b(String string2, String string3) {
        d d2 = new d();
        d2.b = string2;
        d2.c = string3;
        this.a(d2);
    }

    public void a(String string2, String string3, String string4, String string5, String string6, boolean bl2) {
        d d2 = new d();
        d2.b = string2;
        d2.c = string3;
        d2.d = string4;
        d2.e = string5;
        d2.f = string6;
        d2.h = bl2;
        this.a(d2);
    }

    public void a(String string2, String string3, String string4, e e2, e e3, boolean bl2) {
        d d2 = new d();
        d2.b = string2;
        d2.c = string3;
        d2.d = string4;
        d2.e = e2;
        d2.f = e3;
        d2.h = bl2;
        this.a(d2);
    }

    public ElementDocument a(String string2, String string3, String string4, Object object, Object object2, boolean bl2, boolean bl3) {
        d d2 = new d();
        d2.b = string2;
        d2.c = string3;
        d2.d = string4;
        d2.e = object;
        d2.f = object2;
        d2.g = bl2;
        d2.h = bl3;
        return this.a(d2);
    }

    public ElementDocument a(d d2) {
        ScriptEngine.checkThreadAccess();
        ElementDocument elementDocument = this.createPopup("messagebox.rml", null);
        HashMap hashMap = elementDocument.getMetadataMap();
        elementDocument.getElementById("message").setTextWithNewlines(d2.c);
        if (d2.b == null) {
            d2.b = "";
        }
        elementDocument.getElementById("title").setText(d2.b);
        this.a(elementDocument, "button_1", d2.e, hashMap);
        this.a(elementDocument, "button_2", d2.f, hashMap);
        Element element = elementDocument.getElementById("button_back");
        element.loadCharsetIfNeededWithCurrentText();
        String string2 = "closePopup();";
        if (d2.d != null) {
            string2 = string2 + "hideKeyboard();";
        }
        element.setAttribute("onclick", string2);
        if (!d2.h) {
            element.hide();
        }
        if (d2.e == null && d2.f == null) {
            element.setText(com.corrodinggames.rts.gameFramework.h.a.a("menus.common.ok", new Object[0]));
            element.focus();
        }
        if (d2.d != null) {
            Element element2 = elementDocument.getElementById("textInputWrapper");
            element2.show();
            Element element3 = elementDocument.getElementById("textInput");
            element3.setAttribute("value", d2.d);
            element3.focus();
        }
        d2.a = elementDocument;
        if (d2.g) {
            if (this.b(d2)) {
                return elementDocument;
            }
            this.closeDocument(elementDocument);
            return null;
        }
        return elementDocument;
    }

    public boolean b(d d2) {
        if (this.j != null) {
            l.e("AlertPopup already visible closing");
            this.closeDocument(this.j.a);
            this.j = null;
        }
        this.j = d2;
        l.e("Showing popup: " + d2.b);
        if (!this.e) {
            this.update();
        } else {
            l.e("insideEvent");
        }
        l.e("popup ready..");
        d2.a.show(4);
        l.e("Popup shown..");
        return true;
    }

    public boolean a(ElementDocument elementDocument) {
        return this.c(new d(elementDocument));
    }

    public boolean c(d d2) {
        if (this.k != null) {
            l.e("Popup already visible, cannot show: " + d2.a.getMetadata("sourceDocumentId"));
            if (this.j != null) {
                this.j.a.pullToFront();
                return false;
            }
            this.k.a.pullToFront();
            return false;
        }
        this.k = d2;
        l.e("Showing popup: " + d2.b);
        if (!this.e) {
            this.update();
        } else {
            l.e("insideEvent");
        }
        l.e("popup ready..");
        d2.a.show(4);
        l.e("Popup shown..");
        return true;
    }

    public ElementDocument a(String string2, Object object, String string3, boolean bl2) {
        ScriptEngine.checkThreadAccess();
        ElementDocument elementDocument = this.createPopup("messagebox.rml", object);
        elementDocument.setMetadata("sourceDocumentId", string2);
        File file = new File(com.corrodinggames.librocket.b.a(string2));
        String string4 = com.corrodinggames.rts.gameFramework.f.a(file);
        elementDocument.getElementById("mainButtons").hide();
        Element element = elementDocument.getElementById("message");
        element.setInnerRML(string4);
        this.a(element, false);
        if (string3 == null) {
            string3 = "";
        }
        elementDocument.getElementById("title").setText(string3);
        if (bl2) {
            if (this.b(elementDocument)) {
                return elementDocument;
            }
            return null;
        }
        return elementDocument;
    }

    public boolean b(ElementDocument elementDocument) {
        d d2 = new d(elementDocument);
        if (this.c(d2)) {
            return true;
        }
        this.closeDocument(elementDocument);
        return false;
    }

    public void a(Element element, boolean bl2) {
        if (element == null) {
            l.e("loadCharsetIfNeededOnChildren: root is null");
            return;
        }
        ArrayList arrayList = element.getAllNestedChildren();
        for (Element element2 : arrayList) {
            boolean bl3 = false;
            String string2 = element2.getTagName();
            if (string2.equals((Object)"p") || string2.startsWith("h") || string2.startsWith("label") || string2.startsWith("button") || string2.startsWith("select")) {
                bl3 = true;
            }
            if (bl2 && string2.equals((Object)"option")) {
                bl3 = true;
            }
            if (!bl3) continue;
            boolean bl4 = element2.loadCharsetIfNeededWithCurrentText();
        }
    }

    public void a(ElementDocument elementDocument, String string2, Object object, HashMap hashMap) {
        Element element = elementDocument.getElementById(string2);
        if (object == null) {
            element.hide();
        } else if (object instanceof String) {
            String string3 = (String)object;
            int n2 = string3.indexOf(":");
            String string4 = string3.substring(0, n2);
            String string5 = "";
            if (n2 + 1 < string3.length()) {
                string5 = string3.substring(n2 + 1);
            }
            if (string4.startsWith("[onenter]")) {
                string4 = string4.substring("[onenter]".length());
                elementDocument.getElementById("textInput").setAttribute("onenter", string5);
            }
            element.setText(string4);
            element.setAttribute("onclick", string5);
        } else if (object instanceof e) {
            e e2 = (e)object;
            String string6 = "action_" + string2;
            hashMap.put((Object)string6, (Object)e2.b);
            element.setText(e2.a);
            element.setAttribute("onclick", "runRunnable(" + string6 + ");");
            if (e2.c) {
                elementDocument.getElementById("textInput").setAttribute("onenter", "runRunnable(" + string6 + ");");
            }
        } else {
            l.g("Unhandled type:" + object);
        }
    }

    public boolean h() {
        if (this.i()) {
            return true;
        }
        return this.j();
    }

    public boolean i() {
        d d2 = this.j;
        if (d2 != null) {
            l.e("Closing alert");
            this.closeDocument(d2.a);
            this.j = null;
            if (d2.i != null) {
                d2.i.run();
            }
            return true;
        }
        return false;
    }

    public boolean j() {
        d d2 = this.k;
        if (d2 != null) {
            l.e("Closing popup");
            this.closeDocument(d2.a);
            this.k = null;
            if (d2.i != null) {
                d2.i.run();
            }
            return true;
        }
        return false;
    }

    public String k() {
        ElementDocument elementDocument = this.e();
        Element element = elementDocument.getElementById("textInput");
        return element.getAttribute("value");
    }

    public String d(String string2) {
        String string3 = null;
        if (string2 != null && string2.contains((CharSequence)"class=\"log-entry\"")) {
            System.out.println("parseText: skipping log line:" + string2);
            return null;
        }
        int n2 = 0;
        Matcher matcher = this.i.matcher((CharSequence)string2);
        while (matcher.find()) {
            Object object;
            if (++n2 > 100) {
                System.out.println("parseText too many loops!!");
                return null;
            }
            String string4 = matcher.group(1);
            String string5 = null;
            if (this.debug) {
                System.out.println("parseText:" + string4);
            }
            if (string4.startsWith("i:")) {
                object = string4.substring(2);
                string5 = com.corrodinggames.rts.gameFramework.h.a.a((String)object, new Object[0]);
            }
            if (string5 == null && (object = this.c.processArg(string4)) != null) {
                string5 = object.toString();
            }
            string2 = string5 == null ? matcher.replaceFirst("(unhandled:" + string4 + ")") : matcher.replaceFirst(string5);
            if (string5 != null) {
                object = this.getActiveDocument();
                if (object != null && !((ElementDocument)object).translatedToUnicode && com.corrodinggames.rts.gameFramework.f.n(string5)) {
                    ((ElementDocument)object).translatedToUnicode = true;
                }
                if ((object = this.g()) != null && !((ElementDocument)object).translatedToUnicode && com.corrodinggames.rts.gameFramework.f.n(string5)) {
                    ((ElementDocument)object).translatedToUnicode = true;
                }
            }
            matcher = this.i.matcher((CharSequence)string2);
            string3 = string2;
        }
        return string3;
    }

    @Override
    public String TranslateString(String string2) {
        try {
            String string3 = this.d(string2);
            if (string3 != null) {
                return string3;
            }
        }
        catch (Exception exception) {
            ScriptEngine.throwDelayedException("TranslateString exception on: " + string2, exception);
            l.a("Exception in TranslateString", (Throwable)exception);
            l.b("start");
            exception.printStackTrace();
            l.b("end");
            l.b("start logStack");
            l.T();
            l.b("end logStack");
            System.err.flush();
            System.out.flush();
            return null;
        }
        return null;
    }

    @Override
    public long getFileLastModified(String string2) {
        return com.corrodinggames.rts.gameFramework.j.a(string2, false);
    }

    @Override
    public void postUpdate() {
        boolean bl2 = this.queueExtraUpdate;
        super.postUpdate();
        if (bl2) {
            this.c.checkForErrors();
        }
    }
}

