/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.FileReader
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.io.UnsupportedEncodingException
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.Throwable
 *  java.math.BigInteger
 *  java.security.MessageDigest
 *  java.security.NoSuchAlgorithmException
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.LinkedHashSet
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Set
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.corrodinggames.rts.gameFramework.utility;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.aj;
import com.corrodinggames.rts.game.units.custom.bb;
import com.corrodinggames.rts.game.units.custom.bc;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.e.a;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.h;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$ReturnType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean$StaticValueBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.u;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.l;
import com.corrodinggames.rts.gameFramework.utility.ac;
import com.corrodinggames.rts.gameFramework.utility.ai;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ab {
    private static final Pattern g = Pattern.compile((String)"\\p{C}");
    private static final Pattern h = Pattern.compile((String)"\\s*\\[([^]]*)\\]\\s*");
    private static final Pattern i = Pattern.compile((String)"\\s*([^=:]*)(?:=|:)(.*)");
    private LinkedHashMap j = new LinkedHashMap();
    String a = "ini";
    boolean b = true;
    LinkedHashSet c = new LinkedHashSet();
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    private boolean k;
    public String f;

    public void a() {
        this.k = true;
        this.b = false;
    }

    public void a(String string2, String string3) {
        this.a(string2, string3, "Unknown");
    }

    public void a(String string2, String string3, String string4) {
        if (this.b) {
            this.c.add((Object)(string2 + ":" + string3));
        }
    }

    public void b() {
        if (!this.b) {
            throw new RuntimeException("Not tracking reads");
        }
        for (String string2 : this.j.keySet()) {
            if (string2 != null && string2.startsWith("template_")) continue;
            boolean bl2 = false;
            String string3 = null;
            Map map = (Map)this.j.get((Object)string2);
            for (String string4 : map.keySet()) {
                if (string4 != null && (string4.startsWith("@define ") || string4.startsWith("@global "))) continue;
                String string5 = string2 + ":" + string4;
                if (!this.c.contains((Object)string5)) {
                    String string6 = (String)map.get((Object)string4);
                    if ("IGNORE".equals((Object)string6) || string3 != null) continue;
                    if (string4 != null && string4.trim().equals((Object)"")) {
                        string3 = this.a + " Found line in [" + string2 + "] with no key name.";
                        continue;
                    }
                    string3 = this.a + ": The key '[" + string2 + "]" + string4 + "' was not used. (hint: make sure it's valid and in the right section)";
                    continue;
                }
                bl2 = true;
            }
            if (string3 == null) continue;
            if (bl2 || this.j.size() == 1) {
                throw new RuntimeException(string3);
            }
            throw new RuntimeException(this.a + ": No keys in section: [" + string2 + "] were used (is this section named correctly?)");
        }
    }

    public int c() {
        try {
            String string22;
            MessageDigest messageDigest = MessageDigest.getInstance((String)"MD5");
            for (String string22 : this.j.keySet()) {
                Map map = (Map)this.j.get((Object)string22);
                for (String string3 : map.keySet()) {
                    String string4 = string22 + ":" + string3 + ":" + (String)map.get((Object)string3);
                    byte[] byArray = string4.getBytes("UTF-8");
                    messageDigest.update(byArray);
                }
            }
            Object object = messageDigest.digest();
            string22 = new BigInteger(1, (byte[])object);
            return string22.intValue();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new RuntimeException((Throwable)unsupportedEncodingException);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new RuntimeException((Throwable)noSuchAlgorithmException);
        }
    }

    public ab(String string2) {
        this.a = string2;
        this.f = string2;
        this.a(string2);
    }

    public ab(InputStream inputStream, String string2) {
        this.a = string2;
        this.a(inputStream);
    }

    public void a(String string2) {
        BufferedReader bufferedReader = new BufferedReader((Reader)new FileReader(string2));
        this.a(bufferedReader);
    }

    public void a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader(inputStream, "UTF-8"));
        this.a(bufferedReader);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(BufferedReader bufferedReader) {
        try {
            String string2;
            String string3;
            int n2 = 0;
            String string4 = null;
            boolean bl2 = false;
            String string5 = "\"\"\"";
            String string6 = "";
            boolean bl3 = false;
            while ((string3 = bufferedReader.readLine()) != null) {
                String string7;
                Matcher matcher;
                ++n2;
                if (string3.startsWith("﻿")) {
                    string3 = string3.substring(1);
                }
                string2 = string3.trim();
                boolean bl4 = false;
                if (!bl2 && string2.startsWith("#")) continue;
                if (com.corrodinggames.rts.gameFramework.f.c(string3, "\"\"\"")) {
                    int n3 = 0;
                    if (!bl2 && string3.trim().startsWith("\"\"\"")) {
                        bl3 = true;
                    }
                    while (true) {
                        int n4;
                        if ((n4 = string3.indexOf("\"\"\"", n3)) == -1) break;
                        string6 = string6 + string3.substring(n3, n4);
                        n3 = n4 + 3;
                        bl2 = !bl2;
                    }
                    string6 = string6 + string3.substring(n3, string3.length());
                    if (bl2) continue;
                    if (bl3) {
                        string6 = "";
                        bl3 = false;
                        continue;
                    }
                    string3 = string6;
                    string6 = "";
                    bl3 = false;
                    bl4 = true;
                } else if (bl2) {
                    string6 = string6 + string3;
                    continue;
                }
                if (string2.length() == 0) continue;
                if (com.corrodinggames.rts.gameFramework.f.c(string3, "[") && (matcher = h.matcher((CharSequence)string3)).matches()) {
                    string4 = matcher.group(1).trim();
                    continue;
                }
                if (string4 != null && string4.startsWith("comment_")) continue;
                Matcher matcher2 = i.matcher((CharSequence)string3);
                if (matcher2.matches()) {
                    Object object;
                    if (string4 == null) {
                        l.b("IniFile: " + this.a + "  line " + n2 + " is not in a [section]:'" + string3 + "'");
                        this.e.add((Object)("Line " + n2 + " is not in a [section]: '" + string3 + "'"));
                        continue;
                    }
                    String string8 = matcher2.group(1).trim();
                    string7 = matcher2.group(2);
                    if (!bl4) {
                        string7 = string7.trim();
                    }
                    if (string8.equals((Object)"")) {
                        object = this.a + ": Unexpected format on line " + n2 + ": Key cannot be empty for line '" + string3 + "'";
                        throw new IOException((String)object);
                    }
                    object = (LinkedHashMap)this.j.get((Object)string4);
                    if (object == null) {
                        object = new LinkedHashMap();
                        this.j.put((Object)string4, object);
                    }
                    if (object.get((Object)string8) != null) {
                        this.d.add((Object)new ac(string4, string8));
                    }
                    object.put((Object)string8, (Object)string7);
                    continue;
                }
                matcher2 = g.matcher((CharSequence)string3);
                if (matcher2.find()) {
                    if (string3.length() == 1) continue;
                    String string9 = string3.replaceAll("\\p{C}", "?");
                    string7 = this.a + ": Unexpected format on line:" + n2 + ": '" + string9 + "' in ini file (hint: This line might have hidden unicode)";
                    throw new IOException(string7);
                }
                l.b(this.a + ": Unexpected format on line:" + n2 + ": '" + string3 + "' in ini file");
                this.e.add((Object)string3);
            }
            if (bl2) {
                string2 = this.a + ": End of file while in multi-line string (hint: You are likely missing a closing \"\"\")";
                throw new IOException(string2);
            }
        }
        finally {
            bufferedReader.close();
        }
    }

    private String a(String string2, String string3, boolean bl2, String string4) {
        String string5 = this.a(string2, string3, bl2);
        if (string5 != null) {
            this.a(string2, string3, string4);
        }
        return string5;
    }

    public String b(String string2, String string3) {
        Map map = (Map)this.j.get((Object)string2);
        if (map == null) {
            return null;
        }
        String string4 = (String)map.get((Object)string3);
        return string4;
    }

    private String a(String string2, String string3, boolean bl2) {
        Map map = (Map)this.j.get((Object)string2);
        if (map == null) {
            if (!bl2) {
                throw new RuntimeException("Could not find section: [" + string2 + "] in configuration file");
            }
            return null;
        }
        String string4 = (String)map.get((Object)string3);
        if (string4 == null) {
            if (!bl2) {
                throw new RuntimeException("Could not find: " + string3 + " in configuration file under [" + string2 + "]");
            }
            return null;
        }
        if (string4.equals((Object)"IGNORE")) {
            if (!bl2) {
                throw new RuntimeException("Key: " + string3 + " under [" + string2 + "], is set to IGNORE but is required and has no default");
            }
            return null;
        }
        return string4;
    }

    public String a(String string2, String string3, String string4, String string5) {
        String string6 = this.b(string2, string3, (String)null);
        String string7 = this.b(string2, string4, (String)null);
        if (string6 != null && string7 != null) {
            throw new RuntimeException("[" + string2 + "]Cannot set " + string3 + " and " + string4 + " at the same time");
        }
        if (string6 != null) {
            return string6;
        }
        if (string7 != null) {
            return string7;
        }
        return string5;
    }

    public Boolean a(String string2, String string3, String string4, Boolean bl2) {
        String string5 = this.a(string2, string3, string4, (String)null);
        if (string5 == null) {
            return bl2;
        }
        if (string5.equalsIgnoreCase("true")) {
            return true;
        }
        if (string5.equalsIgnoreCase("false")) {
            return false;
        }
        if (string5.equalsIgnoreCase("1")) {
            return true;
        }
        if (string5.equalsIgnoreCase("0")) {
            return false;
        }
        throw new RuntimeException(string3 + ": unexpected boolean value:'" + string5 + "' in section:" + string2);
    }

    public Boolean a(String string2, String string3, Boolean bl2) {
        String string4 = this.b(string2, string3, (String)null);
        if (string4 == null) {
            return bl2;
        }
        if (string4.equalsIgnoreCase("true")) {
            return true;
        }
        if (string4.equalsIgnoreCase("false")) {
            return false;
        }
        if (string4.equalsIgnoreCase("1")) {
            return true;
        }
        if (string4.equalsIgnoreCase("0")) {
            return false;
        }
        throw new RuntimeException(string3 + ": unexpected boolean value:'" + string4 + "' in section:" + string2);
    }

    public void c(String string2, String string3) {
        throw new RuntimeException("Could not find " + string3 + " in configuration file in section:" + string2);
    }

    public boolean d(String string2, String string3) {
        Boolean bl2 = this.a(string2, string3, (Boolean)null);
        if (bl2 == null) {
            this.c(string2, string3);
        }
        return bl2;
    }

    public String e(String string2, String string3) {
        String string4 = this.b(string2, string3, (String)null);
        if (string4 == null) {
            this.c(string2, string3);
        }
        return string4;
    }

    public String b(String string2, String string3, String string4) {
        String string5 = this.a(string2, string3, true, "string");
        if (string5 == null) {
            return string4;
        }
        if (string5.contains((CharSequence)"%{") && string5.contains((CharSequence)"}")) {
            throw new RuntimeException("[" + string2 + "]" + string3 + ": Doesn't support dynamic %{} sections");
        }
        return string5;
    }

    public String c(String string2, String string3, String string4) {
        String string5 = this.a(string2, string3, true, "string");
        if (string5 == null) {
            return string4;
        }
        return string5;
    }

    public String f(String string2, String string3) {
        String string4 = this.c(string2, string3, (String)null);
        if (string4 == null) {
            this.c(string2, string3);
        }
        return string4;
    }

    public static String b(String string2) {
        if (string2 == null) {
            return null;
        }
        string2 = com.corrodinggames.rts.gameFramework.f.a(string2, "\\n", "\n");
        return string2;
    }

    public aj a(com.corrodinggames.rts.game.units.custom.l l2, String string2, String string3, String string4) {
        bb bb2 = this.a(string2, string3, string4, true);
        if (bb2 == null) {
            return null;
        }
        try {
            aj aj2 = new aj(l2, bb2);
            return aj2;
        }
        catch (RuntimeException runtimeException) {
            runtimeException.printStackTrace();
            throw new bo("[" + string2 + "]" + string3 + ": " + runtimeException.getMessage());
        }
    }

    public bb a(String string2, String string3, String string4, boolean bl2) {
        String string5 = bl2 ? this.c(string2, string3, (String)null) : this.b(string2, string3, (String)null);
        if (string5 == null) {
            if (string4 == null) {
                return null;
            }
            string5 = string4;
        }
        string5 = ab.b(string5);
        bb bb2 = new bb();
        if (string5 != null && string5.startsWith("i:")) {
            bb2.e = string5.substring("i:".length());
            bb2.e = bb2.e.trim();
            com.corrodinggames.rts.gameFramework.h.a.a(bb2.e, new Object[0]);
            return bb2;
        }
        ArrayList arrayList = new ArrayList();
        bc bc2 = new bc();
        bc2.a = null;
        bc2.b = string5;
        arrayList.add((Object)bc2);
        String string6 = string3 + "_";
        m m2 = this.k(string2, string6);
        Iterator iterator = m2.iterator();
        while (iterator.hasNext()) {
            String string7 = (String)iterator.next();
            String string8 = string7.substring(string6.length());
            string8 = string8.toLowerCase(Locale.ROOT);
            String string9 = bl2 ? this.f(string2, string7) : this.e(string2, string7);
            string9 = ab.b(string9);
            bc bc3 = new bc();
            bc3.a = string8;
            bc3.b = string9;
            arrayList.add((Object)bc3);
        }
        bb2.b = (bc[])arrayList.toArray((Object[])new bc[0]);
        bb2.b();
        return bb2;
    }

    public LogicBoolean a(com.corrodinggames.rts.game.units.custom.l l2, String string2, String string3) {
        String string4 = this.e(string2, string3);
        try {
            return LogicBoolean.create(l2, string4, null);
        }
        catch (RuntimeException runtimeException) {
            throw new RuntimeException("[" + string2 + "]" + string3 + ": " + runtimeException.getMessage(), (Throwable)runtimeException);
        }
    }

    public LogicBoolean a(com.corrodinggames.rts.game.units.custom.l l2, String string2, String string3, LogicBoolean logicBoolean) {
        String string4 = this.b(string2, string3, (String)null);
        try {
            return LogicBoolean.create(l2, string4, logicBoolean);
        }
        catch (RuntimeException runtimeException) {
            throw new RuntimeException("[" + string2 + "]" + string3 + ": " + runtimeException.getMessage(), (Throwable)runtimeException);
        }
    }

    public LogicBoolean b(com.corrodinggames.rts.game.units.custom.l l2, String string2, String string3, LogicBoolean logicBoolean) {
        return this.a(l2, string2, string3, logicBoolean, LogicBoolean$ReturnType.unit);
    }

    public LogicBoolean c(com.corrodinggames.rts.game.units.custom.l l2, String string2, String string3, LogicBoolean logicBoolean) {
        return this.a(l2, string2, string3, logicBoolean, LogicBoolean$ReturnType.number);
    }

    public LogicBoolean a(com.corrodinggames.rts.game.units.custom.l l2, String string2, String string3, LogicBoolean logicBoolean, LogicBoolean$ReturnType logicBoolean$ReturnType) {
        String string4 = this.b(string2, string3, (String)null);
        return ab.a(string4, l2, string2, string3, logicBoolean, logicBoolean$ReturnType);
    }

    public static LogicBoolean a(String string2, com.corrodinggames.rts.game.units.custom.l l2, String string3, String string4, LogicBoolean logicBoolean) {
        return ab.a(string2, l2, string3, string4, logicBoolean, LogicBoolean$ReturnType.unit);
    }

    public static LogicBoolean a(String string2, com.corrodinggames.rts.game.units.custom.l l2, String string3, String string4, LogicBoolean logicBoolean, LogicBoolean$ReturnType logicBoolean$ReturnType) {
        try {
            LogicBoolean logicBoolean2;
            if (string2 == null) {
                return logicBoolean;
            }
            if (logicBoolean$ReturnType == LogicBoolean$ReturnType.number && com.corrodinggames.rts.gameFramework.f.r(string2)) {
                return LogicBoolean$StaticValueBoolean.getStaticNumber(string2);
            }
            if (string2.toLowerCase(Locale.ROOT).startsWith("unitref ")) {
                string2 = string2.substring("unitref ".length()).trim();
            }
            if ((logicBoolean2 = LogicBooleanLoader.parseBooleanBlock(l2, string2, false)) == null) {
                return null;
            }
            LogicBoolean$ReturnType logicBoolean$ReturnType2 = logicBoolean2.getReturnType();
            if (logicBoolean$ReturnType2 != logicBoolean$ReturnType) {
                throw new RuntimeException("[" + string3 + "]" + string4 + ": Type mismatch. Expected type:" + (Object)((Object)logicBoolean$ReturnType) + " got:" + (Object)((Object)logicBoolean$ReturnType2));
            }
            return logicBoolean2;
        }
        catch (RuntimeException runtimeException) {
            throw new RuntimeException("[" + string3 + "]" + string4 + ": " + runtimeException.getMessage(), (Throwable)runtimeException);
        }
    }

    public g a(String string2, String string3, g g2) {
        String string4 = this.b(string2, string3, (String)null);
        if (string4 == null) {
            return g2;
        }
        if (string4.trim().equals((Object)"")) {
            return g2;
        }
        if (string4.contains((CharSequence)",")) {
            throw new bo("[" + string2 + "]" + string3 + ": Expected single tag, got:" + string4);
        }
        return com.corrodinggames.rts.game.units.custom.g.c(string4);
    }

    public h a(com.corrodinggames.rts.game.units.custom.l l2, String string2, String string3, h h2) {
        String string4 = this.b(string2, string3, (String)null);
        return com.corrodinggames.rts.game.units.custom.g.a(string4, h2);
    }

    public u a(com.corrodinggames.rts.game.units.custom.l l2, String string2, String string3, u u2) {
        String string4 = this.b(string2, string3, (String)null);
        if (string4 == null) {
            return u2;
        }
        u u3 = l2.c(string4, string3, string2);
        return u3;
    }

    public a a(com.corrodinggames.rts.game.units.custom.l l2, String string2, String string3, a a2, boolean bl2) {
        a a3;
        String string4 = this.b(string2, string3, (String)null);
        if (string4 == null) {
            return a2;
        }
        if (bl2 && (a3 = com.corrodinggames.rts.game.units.custom.e.a.a(string4)) != null) {
            return a3;
        }
        a3 = l2.k(string4);
        if (a3 == null) {
            throw new BooleanParseException("[" + string2 + "]" + string3 + ": Could not find custom resource type of:" + string4);
        }
        return a3;
    }

    public Integer a(String string2, String string3, Integer n2) {
        String string4 = this.b(string2, string3, (String)null);
        if (string4 == null) {
            return n2;
        }
        if (string4.equals((Object)"")) {
            throw new RuntimeException("[" + string2 + "]" + string3 + ": Unknown color: ''");
        }
        try {
            return Color.a(string4);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new RuntimeException("[" + string2 + "]" + string3 + ": Unknown color:" + string4);
        }
    }

    public int g(String string2, String string3) {
        String string4 = this.a(string2, string3, false, "int");
        try {
            return Integer.parseInt((String)string4);
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("[" + string2 + "]" + string3 + ": Not a static integer: " + string4);
        }
    }

    public Short a(String string2, String string3, Short s2) {
        String string4 = this.a(string2, string3, true, "short");
        if (string4 == null) {
            return s2;
        }
        try {
            return Short.parseShort((String)string4);
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("[" + string2 + "]" + string3 + ": Not a static integer: " + string4);
        }
    }

    public Integer b(String string2, String string3, Integer n2) {
        String string4 = this.a(string2, string3, true, "int");
        if (string4 == null) {
            return n2;
        }
        try {
            return Integer.parseInt((String)string4);
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("[" + string2 + "]" + string3 + ": Not a static integer: " + string4);
        }
    }

    public Float a(String string2, String string3, Float f2) {
        String string4 = this.a(string2, string3, true, "float");
        if (string4 == null) {
            return f2;
        }
        try {
            return Float.valueOf((float)Float.parseFloat((String)string4));
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("[" + string2 + "]" + string3 + ": Not a static float: " + string4);
        }
    }

    public PointF a(String string2, String string3, PointF pointF) {
        String string4 = this.a(string2, string3, true, "point");
        if (string4 == null) {
            return pointF;
        }
        if (string4.equalsIgnoreCase("NONE")) {
            return null;
        }
        try {
            String[] stringArray = string4.split(",");
            if (stringArray.length != 2) {
                throw new NumberFormatException("Got:" + stringArray.length + " elements expected 2");
            }
            PointF pointF2 = new PointF();
            pointF2.a = Float.parseFloat((String)stringArray[0]);
            pointF2.b = Float.parseFloat((String)stringArray[1]);
            return pointF2;
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("Failed to read point:" + string4 + " in key:" + string3 + " section:" + string2 + " expected format: x,y");
        }
    }

    public ai a(String string2, String string3, ai ai2) {
        String string4 = this.a(string2, string3, true, "point3d");
        if (string4 == null) {
            return ai2;
        }
        if (string4.equalsIgnoreCase("NONE")) {
            return null;
        }
        try {
            String[] stringArray = string4.split(",");
            if (stringArray.length != 2 && stringArray.length != 3) {
                throw new NumberFormatException("Got:" + stringArray.length + " elements expected 2 or 3");
            }
            ai ai3 = new ai();
            ai3.a = Float.parseFloat((String)stringArray[0]);
            ai3.b = Float.parseFloat((String)stringArray[1]);
            if (stringArray.length > 2) {
                ai3.c = Float.parseFloat((String)stringArray[2]);
            }
            return ai3;
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("Failed to read point:" + string4 + " in key:" + string3 + " section:" + string2 + " expected format: x,y,[height]");
        }
    }

    public Float h(String string2, String string3) {
        Float f2 = this.b(string2, string3, (Float)null);
        if (f2 == null) {
            throw new RuntimeException("Could not find key:" + string3 + " in section:" + string2);
        }
        return f2;
    }

    public Float b(String string2, String string3, Float f2) {
        return this.a(string2, string3, f2, false);
    }

    public Float c(String string2, String string3, Float f2) {
        Float f3 = this.a(string2, string3, (Float)null, false);
        if (f3 == null) {
            return f2;
        }
        return Float.valueOf((float)(f3.floatValue() * 16.666666f));
    }

    public Float a(String string2, String string3, Float f2, boolean bl2) {
        String string4 = this.a(string2, string3, true, "time");
        if (string4 == null) {
            return f2;
        }
        try {
            return Float.valueOf((float)ab.a(string4, bl2, string2, string3));
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("Failed to read time:" + string4 + " in key:" + string3 + " section:" + string2 + " expected a float with optional 's' or 'ms' postfix");
        }
    }

    public Float d(String string2, String string3, Float f2) {
        return this.a(string2, string3, f2, true);
    }

    public static float a(String string2, boolean bl2, String string3, String string4) {
        float f2;
        float f3 = 1.0f;
        boolean bl3 = false;
        if (string2.endsWith("s")) {
            string2 = string2.substring(0, string2.length() - 1);
            f3 = 60.0f;
            bl3 = true;
        } else {
            f3 = 1.0f;
        }
        try {
            f2 = Float.parseFloat((String)string2) * f3;
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("[" + string3 + "]" + string4 + ": Failed to read time:" + string2 + " expected a float with optional 's' postfix");
        }
        if (bl2) {
            if (bl3) {
                return 1.0f / f2;
            }
            return f2;
        }
        return f2;
    }

    public float i(String string2, String string3) {
        String string4 = this.a(string2, string3, false, "float");
        try {
            return Float.parseFloat((String)string4);
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("Failed to read float:" + string4 + " in key:" + string3 + " section:" + string2);
        }
    }

    public double j(String string2, String string3) {
        String string4 = this.a(string2, string3, false, "double");
        try {
            return Double.parseDouble((String)string4);
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("Failed to read float:" + string4 + " in key:" + string3 + " section:" + string2);
        }
    }

    public double a(String string2, String string3, double d2) {
        String string4 = this.a(string2, string3, true, "double");
        if (string4 == null) {
            return d2;
        }
        try {
            return Double.parseDouble((String)string4);
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("Failed to read float:" + string4 + " in key:" + string3 + " section:" + string2);
        }
    }

    public long a(String string2, String string3, long l2) {
        String string4 = this.a(string2, string3, true, "long");
        if (string4 == null) {
            return l2;
        }
        try {
            return Long.parseLong((String)string4);
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("[" + string2 + "]" + string3 + ": Failed to read long:" + string4 + " in key:" + string3 + " section:" + string2);
        }
    }

    public void d(String string2, String string3, String string4) {
        if (this.k) {
            throw new RuntimeException("locked changes");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap)this.j.get((Object)string2);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.j.put((Object)string2, (Object)linkedHashMap);
        }
        if (linkedHashMap.get((Object)string3) == null) {
            linkedHashMap.put((Object)string3, (Object)string4);
        }
    }

    public void e(String string2, String string3, String string4) {
        if (this.k) {
            throw new RuntimeException("locked changes");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap)this.j.get((Object)string2);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.j.put((Object)string2, (Object)linkedHashMap);
        }
        linkedHashMap.put((Object)string3, (Object)string4);
    }

    public void a(ab ab2) {
        if (this.k) {
            throw new RuntimeException("locked changes");
        }
        for (String string2 : ab2.j.keySet()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap)ab2.j.get((Object)string2);
            if (this.a(string2, "@copyFrom_skipThisSection", (Boolean)false).booleanValue()) continue;
            LinkedHashMap linkedHashMap2 = (LinkedHashMap)this.j.get((Object)string2);
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                this.j.put((Object)string2, (Object)linkedHashMap2);
            }
            for (String string3 : linkedHashMap.keySet()) {
                if (linkedHashMap2.get((Object)string3) != null) continue;
                linkedHashMap2.put((Object)string3, linkedHashMap.get((Object)string3));
            }
        }
    }

    public Rect a(String string2, String string3, Rect rect) {
        String string4 = this.b(string2, string3, (String)null);
        if (string4 == null) {
            return rect;
        }
        String[] stringArray = string4.split(",");
        if (stringArray.length != 4) {
            throw new RuntimeException("[" + string2 + "]" + string3 + ": getRect: expected 4 ints, not:" + stringArray.length);
        }
        try {
            return new Rect(Integer.valueOf((String)stringArray[0].trim()), Integer.valueOf((String)stringArray[1].trim()), Integer.valueOf((String)stringArray[2].trim()), Integer.valueOf((String)stringArray[3].trim()));
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("[" + string2 + "]" + string3 + ": getRect expected ints got: " + string4);
        }
    }

    public Enum a(String string2, String string3, Enum enum_, Class clazz) {
        String string4 = this.b(string2, string3, (String)null);
        try {
            return ab.a(string4, enum_, clazz);
        }
        catch (bo bo2) {
            throw new RuntimeException("[" + string2 + "]" + string3 + ": " + bo2.getMessage(), (Throwable)((Object)bo2));
        }
    }

    public static Enum a(String string2, Enum enum_, Class clazz) {
        if (string2 == null) {
            return enum_;
        }
        string2 = string2.trim();
        for (Object object : clazz.getEnumConstants()) {
            Enum enum_2 = (Enum)object;
            if (!enum_2.name().equalsIgnoreCase(string2)) continue;
            return enum_2;
        }
        throw ab.a(string2, clazz);
    }

    private static RuntimeException a(String string2, Class clazz) {
        String string3 = "";
        for (Object object : clazz.getEnumConstants()) {
            Enum enum_ = (Enum)object;
            if (!string3.equals((Object)"")) {
                string3 = string3 + ",";
            }
            string3 = string3 + enum_.name();
        }
        throw new bo("Unknown value: " + string2 + " (Expected: " + com.corrodinggames.rts.gameFramework.f.b(string3, 100) + ")");
    }

    public m c(String string2) {
        m m2 = new m();
        for (String string3 : this.j.keySet()) {
            Map map = (Map)this.j.get((Object)string3);
            if (map.get((Object)string2) == null) continue;
            m2.add(string3);
        }
        return m2;
    }

    public m d(String string2) {
        m m2 = new m();
        block0: for (String string3 : this.j.keySet()) {
            Map map = (Map)this.j.get((Object)string3);
            for (String string4 : map.keySet()) {
                if (!string4.startsWith(string2) || "IGNORE".equals(map.get((Object)string4))) continue;
                m2.add(string3);
                continue block0;
            }
        }
        return m2;
    }

    public LinkedHashMap d() {
        return this.j;
    }

    public m k(String string2, String string3) {
        m m2 = new m();
        Map map = (Map)this.j.get((Object)string2);
        if (map != null) {
            for (String string4 : map.keySet()) {
                if (!string4.startsWith(string3) || "IGNORE".equals(map.get((Object)string4))) continue;
                m2.add(string4);
            }
        }
        return m2;
    }

    public m f(String string2, String string3, String string4) {
        m m2 = new m();
        Map map = (Map)this.j.get((Object)string2);
        if (map != null) {
            for (String string5 : map.keySet()) {
                if (!string5.startsWith(string3) && !string5.startsWith(string4)) continue;
                m2.add(string5);
            }
        }
        return m2;
    }

    public boolean l(String string2, String string3) {
        Map map = (Map)this.j.get((Object)string2);
        if (map != null) {
            for (String string4 : map.keySet()) {
                if (!string4.startsWith(string3)) continue;
                return true;
            }
        }
        return false;
    }

    public m e(String string2) {
        m m2 = new m();
        Set set = this.j.keySet();
        for (String string3 : set) {
            if (!string3.startsWith(string2) || !this.g(string3)) continue;
            m2.add(string3);
        }
        return m2;
    }

    public m m(String string2, String string3) {
        m m2 = new m();
        Set set = this.j.keySet();
        for (String string4 : set) {
            if (!string4.startsWith(string2) && !string4.startsWith(string3) || !this.g(string4)) continue;
            m2.add(string4);
        }
        return m2;
    }

    public boolean f(String string2) {
        return this.j.get((Object)string2) != null;
    }

    public boolean g(String string2) {
        Map map = (Map)this.j.get((Object)string2);
        if (map == null) {
            return false;
        }
        for (String string3 : map.keySet()) {
            if (string3 == null || string3.startsWith("@")) continue;
            return true;
        }
        return false;
    }

    public boolean n(String string2, String string3) {
        String string4 = this.a(string2, string3, true);
        return string4 != null;
    }

    public static boolean g(String string2, String string3, String string4) {
        if (string4.equalsIgnoreCase("true")) {
            return true;
        }
        if (string4.equalsIgnoreCase("false")) {
            return false;
        }
        throw new RuntimeException("[" + string2 + "]" + string3 + ": Unexpected boolean value:'" + string4 + "'");
    }

    public static float h(String string2, String string3, String string4) {
        try {
            return Float.parseFloat((String)string4);
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("[" + string2 + "]" + string3 + ": Failed to read float:" + string4);
        }
    }

    public static int i(String string2, String string3, String string4) {
        try {
            return Integer.parseInt((String)string4);
        }
        catch (NumberFormatException numberFormatException) {
            throw new RuntimeException("[" + string2 + "]" + string3 + ": Failed to read int:" + string4);
        }
    }

    public static g j(String string2, String string3, String string4) {
        if ((string4 = string4.trim()).contains((CharSequence)",")) {
            throw new bo("[" + string2 + "]" + string3 + ": Unexpected single tag, got:'" + string4 + "'");
        }
        if (string4.contains((CharSequence)"\"")) {
            throw new bo("[" + string2 + "]" + string3 + ": tag cannot contain quote, got:'" + string4 + "'");
        }
        if (string4.contains((CharSequence)"'")) {
            throw new bo("[" + string2 + "]" + string3 + ": tag cannot contain quote, got:'" + string4 + "'");
        }
        if (string4.contains((CharSequence)" ")) {
            throw new bo("[" + string2 + "]" + string3 + ": tag cannot contain space, got:'" + string4 + "'");
        }
        g g2 = com.corrodinggames.rts.game.units.custom.g.c(string4);
        return g2;
    }
}

