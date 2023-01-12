/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.corrodinggames.rts.game.units.custom.f;

import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.f.b;
import com.corrodinggames.rts.game.units.custom.f.c;
import com.corrodinggames.rts.game.units.custom.f.e;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.gameFramework.utility.ab;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a {
    static final Pattern a = Pattern.compile((String)"\\$\\{([^\\}]*)\\}");
    static final Pattern b = Pattern.compile((String)"[A-Za-z_][A-Za-z_.0-9]*");
    static b c = new b();

    public static void a(l l2, ab ab2) {
        String string2;
        Object object;
        String string3;
        int n2 = 0;
        c.a();
        m m2 = ab2.d("@global ");
        Iterator iterator = m2.iterator();
        while (iterator.hasNext()) {
            string3 = (String)iterator.next();
            Iterator iterator2 = ab2.k(string3, "@global ").iterator();
            while (iterator2.hasNext()) {
                Object object2 = (String)iterator2.next();
                object = object2.substring("@global ".length()).trim();
                try {
                    e.a((String)object);
                }
                catch (bo bo2) {
                    throw new bo("[" + string3 + "]" + (String)object2 + ": " + bo2.getMessage());
                }
                if (ab2.f((String)object)) {
                    throw new bo("[" + string3 + "]" + (String)object2 + ": A section already has that name");
                }
                string2 = ab2.e(string3, (String)object2);
                if (string2.contains((CharSequence)"${")) {
                    throw new bo("[" + string3 + "]" + (String)object2 + " has dynamic value: '" + string2 + "', this is not yet supported");
                }
                com.corrodinggames.rts.game.units.custom.f.a.c.a.a((String)object, string2);
            }
        }
        iterator = new ArrayList();
        string3 = ab2.d();
        for (Object object2 : string3.keySet()) {
            String string4;
            if (object2 == null || object2.startsWith("comment_") || object2.startsWith("template_")) continue;
            object = c.b();
            string2 = ab2.k((String)object2, "@define ").iterator();
            while (string2.hasNext()) {
                String string5 = (String)string2.next();
                String string6 = string5.substring("@define ".length()).trim();
                try {
                    e.a(string6);
                }
                catch (bo bo3) {
                    throw new bo("[" + (String)object2 + "]" + string5 + ": " + bo3.getMessage());
                }
                if (ab2.f(string6)) {
                    throw new bo("[" + (String)object2 + "]" + string5 + ": A section already has that name");
                }
                string4 = ab2.e((String)object2, string5);
                if (string4.contains((CharSequence)"${")) {
                    throw new bo("[" + (String)object2 + "]" + string5 + " has dynamic value: '" + string4 + "', this is not yet supported");
                }
                ((b)object).b.a(string6, string4);
            }
            string2 = (Map)string3.get(object2);
            for (String string6 : string2.keySet()) {
                string4 = (String)string2.get((Object)string6);
                if (string4 == null || !string4.contains((CharSequence)"${")) continue;
                int n3 = 0;
                StringBuffer stringBuffer = new StringBuffer();
                Matcher matcher = a.matcher((CharSequence)string4);
                while (matcher.find()) {
                    String string7;
                    if (++n3 > 100) {
                        throw new bo("[" + (String)object2 + "]" + string6 + ": Too many loops while parsing");
                    }
                    String string8 = matcher.group(1);
                    ++n2;
                    try {
                        string7 = ((b)object).a(l2, ab2, (String)object2, string8);
                    }
                    catch (bo bo4) {
                        bo4.printStackTrace();
                        throw new bo("[" + (String)object2 + "]" + string6 + ": " + bo4.getMessage());
                    }
                    if (!string8.equals((Object)string7)) {
                        string8 = string7;
                    }
                    matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String)string7));
                }
                matcher.appendTail(stringBuffer);
                string4 = stringBuffer.toString();
                iterator.add((Object)new c((String)object2, string6, string4));
            }
        }
        for (Object object2 : iterator) {
            ab2.e(((c)object2).a, ((c)object2).b, ((c)object2).c);
        }
        iterator.clear();
    }
}

