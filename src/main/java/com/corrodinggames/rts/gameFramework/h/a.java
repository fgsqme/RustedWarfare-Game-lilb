/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.text.MessageFormat
 *  java.util.Locale
 *  java.util.MissingResourceException
 *  java.util.PropertyResourceBundle
 *  java.util.ResourceBundle
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.corrodinggames.rts.gameFramework.h;

import android.os.Build;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.h.b;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a {
    static ResourceBundle a;
    static boolean b;
    public static int c;
    public static String d;
    static Pattern e;
    static final Pattern f;

    public static strictfp void a() {
        com.corrodinggames.rts.gameFramework.h.a.e();
    }

    static strictfp ResourceBundle b() {
        if (a == null) {
            com.corrodinggames.rts.gameFramework.h.a.e();
        }
        return a;
    }

    static strictfp PropertyResourceBundle a(String string2) {
        j j2 = com.corrodinggames.rts.gameFramework.e.a.k("translations/" + string2);
        if (j2 == null) {
            return null;
        }
        PropertyResourceBundle propertyResourceBundle = null;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader((InputStream)j2, "UTF-8");
            propertyResourceBundle = new PropertyResourceBundle((Reader)inputStreamReader);
            inputStreamReader.close();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            unsupportedEncodingException.printStackTrace();
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return propertyResourceBundle;
    }

    public static strictfp String a(String string2, Locale locale, boolean bl2, boolean bl3) {
        if (locale == Locale.ROOT) {
            return string2;
        }
        String string3 = locale.getLanguage();
        String string4 = bl2 ? locale.getCountry() : "";
        String string5 = bl3 ? locale.getVariant() : "";
        if (string3.equals((Object)"") && string4.equals((Object)"") && string5.equals((Object)"")) {
            return string2;
        }
        StringBuilder stringBuilder = new StringBuilder(string2);
        stringBuilder.append('_');
        if (!string5.equals((Object)"")) {
            stringBuilder.append(string3).append('_').append(string4.toLowerCase(Locale.ROOT)).append('_').append(string5.toLowerCase(Locale.ROOT));
        } else if (!string4.equals((Object)"")) {
            stringBuilder.append(string3).append('_').append(string4.toLowerCase(Locale.ROOT));
        } else {
            stringBuilder.append(string3);
        }
        return stringBuilder.toString();
    }

    static strictfp ResourceBundle a(String string2, Locale locale) {
        String string3 = com.corrodinggames.rts.gameFramework.h.a.a(string2, Locale.ROOT, false, false) + ".properties";
        PropertyResourceBundle propertyResourceBundle = com.corrodinggames.rts.gameFramework.h.a.a(string3);
        if (propertyResourceBundle == null) {
            throw new RuntimeException("Root locate file:" + string3 + " is missing, it is required");
        }
        boolean bl2 = Locale.ROOT.equals((Object)locale);
        if (bl2) {
            l.e("Locale: Using " + string3 + " as locale");
            return propertyResourceBundle;
        }
        String string4 = com.corrodinggames.rts.gameFramework.h.a.a(string2, locale, true, true) + ".properties";
        PropertyResourceBundle propertyResourceBundle2 = com.corrodinggames.rts.gameFramework.h.a.a(string4);
        if (propertyResourceBundle2 == null) {
            l.e("Locale: No locale for " + string4 + " checking locale without variant ");
            string4 = com.corrodinggames.rts.gameFramework.h.a.a(string2, locale, true, false) + ".properties";
            propertyResourceBundle2 = com.corrodinggames.rts.gameFramework.h.a.a(string4);
            if (propertyResourceBundle2 == null) {
                l.e("Locale: No locale for " + string4 + " checking locale without variant or country");
                string4 = com.corrodinggames.rts.gameFramework.h.a.a(string2, locale, false, false) + ".properties";
                propertyResourceBundle2 = com.corrodinggames.rts.gameFramework.h.a.a(string4);
                if (propertyResourceBundle2 == null) {
                    l.e("Locale: No locale for " + string4 + " using base locale");
                    return propertyResourceBundle;
                }
            }
        }
        l.e("Locale: Using " + string4 + " as locale");
        return new b((ResourceBundle)propertyResourceBundle2, (ResourceBundle)propertyResourceBundle);
    }

    public static strictfp String c() {
        if (d != null) {
            return d;
        }
        return com.corrodinggames.rts.gameFramework.h.a.d().getLanguage();
    }

    public static strictfp Locale d() {
        l l2 = l.B();
        SettingsEngine settingsEngine = null;
        if (l2 != null) {
            settingsEngine = l2.bQ;
        }
        boolean bl2 = false;
        if (settingsEngine != null && settingsEngine.forceEnglish) {
            bl2 = true;
        }
        if (bl2) {
            return Locale.ROOT;
        }
        return Locale.getDefault();
    }

    public static synchronized strictfp void e() {
        ++c;
        l l2 = l.B();
        SettingsEngine settingsEngine = null;
        if (l2 != null) {
            settingsEngine = l2.bQ;
        }
        boolean bl2 = false;
        if (settingsEngine != null && settingsEngine.forceEnglish) {
            bl2 = true;
        }
        if (a != null && b == bl2) {
            l.e("Locale.reload: skipping reload");
        }
        if (Build.VERSION.SDK_INT >= 9) {
            ResourceBundle.clearCache();
        }
        if (bl2) {
            l.e("Locale: forceEnglish");
            a = com.corrodinggames.rts.gameFramework.h.a.a("Strings", Locale.ROOT);
        } else if (d != null) {
            a = com.corrodinggames.rts.gameFramework.h.a.a("Strings", new Locale(d));
        } else if (settingsEngine != null && settingsEngine.overrideLanguageCode != null && !settingsEngine.overrideLanguageCode.equals((Object)"")) {
            a = com.corrodinggames.rts.gameFramework.h.a.a("Strings", new Locale(settingsEngine.overrideLanguageCode));
        } else {
            Locale locale = Locale.getDefault();
            l.e("Locale: default targetLocale:" + locale);
            if (locale != null) {
                l.e("Locale: default targetLocale ISO3:" + locale.getISO3Language());
            }
            a = com.corrodinggames.rts.gameFramework.h.a.a("Strings", locale);
        }
        b = bl2;
        boolean bl3 = false;
        if (bl3) {
            // empty if block
        }
    }

    private static final strictfp String d(String string2) {
        String string3;
        try {
            ResourceBundle resourceBundle = com.corrodinggames.rts.gameFramework.h.a.b();
            string3 = resourceBundle.getString(string2);
        }
        catch (NullPointerException nullPointerException) {
            String string4 = "NullPointer with key:" + string2 + " locale:" + com.corrodinggames.rts.gameFramework.h.a.b().getLocale().toString();
            throw new RuntimeException(string4, (Throwable)nullPointerException);
        }
        if (string3.contains((CharSequence)"[") || string3.contains((CharSequence)"]")) {
            string3 = string3.replace((CharSequence)"[[", (CharSequence)"{{");
            string3 = string3.replace((CharSequence)"]]", (CharSequence)"}}");
            string3 = string3.replace((CharSequence)"[", (CharSequence)"{{");
            string3 = string3.replace((CharSequence)"]", (CharSequence)"}}");
        }
        if (string3.contains((CharSequence)"{") || string3.contains((CharSequence)"}")) {
            string3 = string3.replace((CharSequence)"}}  {{", (CharSequence)"}}{{");
            string3 = string3.replace((CharSequence)"}} {{", (CharSequence)"}}{{");
            string3 = string3.replace((CharSequence)"}}{{", (CharSequence)"\n-");
            string3 = string3.replace((CharSequence)"{{", (CharSequence)"-");
            string3 = string3.replace((CharSequence)"}}", (CharSequence)"");
        }
        return string3;
    }

    private static final strictfp boolean e(String string2) {
        try {
            com.corrodinggames.rts.gameFramework.h.a.b().getString(string2);
            return true;
        }
        catch (MissingResourceException missingResourceException) {
            return false;
        }
    }

    public static final strictfp String a(String string2, String string3, Object ... objectArray) {
        try {
            return com.corrodinggames.rts.gameFramework.h.a.a(string2, objectArray);
        }
        catch (MissingResourceException missingResourceException) {
            return string3;
        }
    }

    public static final strictfp String a(String string2, Object ... objectArray) {
        String string3 = com.corrodinggames.rts.gameFramework.h.a.d(string2);
        if (objectArray.length == 0) {
            return string3;
        }
        String string4 = new MessageFormat(string3).format(objectArray, new StringBuffer(), null).toString();
        return string4;
    }

    public static final strictfp String b(String string2) {
        if (string2 == null) {
            return null;
        }
        String string3 = string2;
        String string4 = null;
        Matcher matcher = e.matcher((CharSequence)string2);
        if (matcher.matches()) {
            string3 = matcher.group(1);
            string4 = matcher.group(2);
        }
        string3 = string3.trim();
        string3 = string3.replace((CharSequence)" ", (CharSequence)"_");
        string3 = string3.replace((CharSequence)".tmx", (CharSequence)"");
        string3 = string3.toLowerCase(Locale.ENGLISH);
        String string5 = "maps.name." + string3;
        if (com.corrodinggames.rts.gameFramework.h.a.e(string5)) {
            String string6 = com.corrodinggames.rts.gameFramework.h.a.a(string5, new Object[0]);
            if (string4 != null) {
                string6 = string6 + string4;
            }
            l.e("translated:" + string6);
            if (string6 != null) {
                string6 = string6.replace((CharSequence)"_", (CharSequence)" ");
            }
            return string6;
        }
        return string2;
    }

    public static strictfp String c(String string2) {
        if (!string2.contains((CharSequence)"[i:")) {
            return string2;
        }
        int n2 = 0;
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = f.matcher((CharSequence)string2);
        while (matcher.find()) {
            if (++n2 > 100) {
                l.b("convertInlineBlocks: Too many loops while parsing: " + string2);
                return string2;
            }
            String string3 = matcher.group(1);
            String string4 = com.corrodinggames.rts.gameFramework.h.a.a(string3, null, new Object[0]);
            if (string4 == null) {
                l.e("convertInlineBlocks: No key:" + string3);
                string4 = "[No key: " + string3 + "]";
            }
            matcher.appendReplacement(stringBuffer, string4);
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    static {
        c = 0;
        e = Pattern.compile((String)"(.*)(\\(.*\\)( *\\[by.*\\])?)");
        f = Pattern.compile((String)"\\[i:([^\\]]*?)\\]");
    }
}

