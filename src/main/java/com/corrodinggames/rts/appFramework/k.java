/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.text.ParseException
 *  java.text.SimpleDateFormat
 *  java.util.Comparator
 *  java.util.Date
 *  java.util.Locale
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package com.corrodinggames.rts.appFramework;

import com.corrodinggames.rts.gameFramework.l;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class k
implements Comparator {
    Pattern a = Pattern.compile((String)".*\\((.*)\\).*");

    k() {
    }

    public int a(String string2, String string3) {
        Date date = this.a(string2);
        Date date2 = this.a(string3);
        if (date == null && date2 == null) {
            return string2.compareTo(string3);
        }
        if (date != null && date2 != null) {
            return date2.compareTo(date);
        }
        if (date == null && date2 != null) {
            return -1;
        }
        if (date != null && date2 == null) {
            return 1;
        }
        return 0;
    }

    public Date a(String string2) {
        Matcher matcher = this.a.matcher((CharSequence)string2);
        if (matcher.matches()) {
            String string3 = matcher.group(1);
            try {
                return new SimpleDateFormat("d MMM yyyy HH.mm.ss", Locale.ENGLISH).parse(string3);
            }
            catch (ParseException parseException) {
                try {
                    return new SimpleDateFormat("d MMM yyyy HH:mm:ss", Locale.ENGLISH).parse(string3);
                }
                catch (ParseException parseException2) {
                    try {
                        return new SimpleDateFormat("d MMM yyyy HH_mm_ss", Locale.ENGLISH).parse(string3);
                    }
                    catch (ParseException parseException3) {
                        try {
                            return new SimpleDateFormat("d MMM yyyy HH-mm-ss", Locale.ENGLISH).parse(string3);
                        }
                        catch (ParseException parseException4) {
                            try {
                                return new SimpleDateFormat("d MMM. yyyy HH.mm.ss", Locale.ENGLISH).parse(string3);
                            }
                            catch (ParseException parseException5) {
                                l.e("Failed to parse date:" + string3);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((String)object, (String)object2);
    }
}

