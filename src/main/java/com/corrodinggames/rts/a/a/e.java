/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.FileWriter
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Random
 *  java.util.regex.Pattern
 */
package com.corrodinggames.rts.a.a;

import com.corrodinggames.rts.a.a.l;
import com.corrodinggames.rts.a.a.n;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.f.b;
import com.corrodinggames.rts.gameFramework.br;
import com.corrodinggames.rts.gameFramework.e.d;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.i.a;
import com.corrodinggames.rts.gameFramework.utility.ab;
import com.corrodinggames.rts.gameFramework.utility.ag;
import com.corrodinggames.rts.gameFramework.utility.al;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;

public class e
extends l {
    int a = 1;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        String string2;
        ab ab2;
        com.corrodinggames.rts.gameFramework.l.e("separator regex test");
        "first".split(Pattern.quote((String)File.separator));
        n.a("first\\second".split(Pattern.quote((String)"\\"))[0], "first");
        n.a("first/second".split(Pattern.quote((String)"/"))[0], "first");
        com.corrodinggames.rts.gameFramework.l.e("Test for dis sq ranges");
        int n2 = 850000;
        int n3 = 8500000;
        n.a(50 < n2 * n2);
        n.a(50.0f < (float)(n2 * n2));
        n.a(50 < n3 * n3);
        n.a(50.0f < (float)(n3 * n3));
        Random random = new Random();
        float[] fArray = new float[10000];
        for (int i2 = 1; i2 < 5; ++i2) {
            int n4;
            int n5;
            int n6 = 0;
            for (int i3 = 0; i3 < fArray.length; ++i3) {
                fArray[i3] = random.nextFloat() * 50.0f;
            }
            long l2 = br.a();
            for (n5 = 0; n5 < 1000; ++n5) {
                for (n4 = 0; n4 < fArray.length; ++n4) {
                    n6 += f.a((int)fArray[n4]);
                }
            }
            com.corrodinggames.rts.gameFramework.l.e("sum:" + n6);
            com.corrodinggames.rts.gameFramework.l.e("fastSquareRootInt took:" + br.a(br.a(l2)));
            for (n5 = 0; n5 < fArray.length; ++n5) {
                fArray[n5] = random.nextFloat() * 50.0f;
            }
            l2 = br.a();
            n6 = 0;
            for (n5 = 0; n5 < 1000; ++n5) {
                for (n4 = 0; n4 < fArray.length; ++n4) {
                    n6 = (int)((float)n6 + f.a((float)((int)fArray[n4])));
                }
            }
            com.corrodinggames.rts.gameFramework.l.e("sum:" + n6);
            com.corrodinggames.rts.gameFramework.l.e("squareRoot took:" + br.a(br.a(l2)));
        }
        com.corrodinggames.rts.gameFramework.l.e("CommonUtils.fastSplit");
        Object object = f.c("testA|testB", '|');
        n.a(((String[])object).length, 2);
        n.a(object[0], "testA");
        n.a(object[1], "testB");
        object = f.c("test|", '|');
        n.a(((String[])object).length, "test|".split("\\|").length);
        n.a(object[0], "test");
        object = f.c("|test", '|');
        n.a(((String[])object).length, 2);
        n.a(object[0], "");
        n.a(object[1], "test");
        object = f.c("|", '|');
        n.a(((String[])object).length, 0);
        com.corrodinggames.rts.gameFramework.l.e("VariableReplacement");
        object = new b();
        ((b)object).b.a("a", "5");
        ((b)object).b.a("b", "10");
        ((b)object).b.a("abc_foo", "7");
        com.corrodinggames.rts.game.units.custom.l l3 = com.corrodinggames.rts.game.units.custom.l.b;
        try {
            ab2 = new ab("assets/" + l3.D);
        }
        catch (IOException iOException) {
            throw new RuntimeException((Throwable)iOException);
        }
        try {
            string2 = ((b)object).a(l3, ab2, "core", "123");
            n.a(string2, "123");
            string2 = ((b)object).a(l3, ab2, "core", "1+1");
            n.a(string2, "2");
            string2 = ((b)object).a(l3, ab2, "core", "(1+1)*2");
            n.a(string2, "4");
            string2 = ((b)object).a(l3, ab2, "core", "a+b");
            n.a(string2, "15");
            string2 = ((b)object).a(l3, ab2, "core", "a+a+abc_foo");
            n.a(string2, "17");
            string2 = ((b)object).a(l3, ab2, "core", "(2+2)*(2+2)");
            n.a(string2, "16");
            string2 = ((b)object).a(l3, ab2, "core", "10/5");
            n.a(string2, "2");
            string2 = ((b)object).a(l3, ab2, "core", "10-5");
            n.a(string2, "5");
            string2 = ((b)object).a(l3, ab2, "core", "cos(60)");
            n.c(string2, "0.5");
            string2 = ((b)object).a(l3, ab2, "core", "sin(b+20+(2-2)+(5*0))");
            n.c(string2, "0.5");
        }
        catch (bo bo2) {
            throw new RuntimeException((Throwable)((Object)bo2));
        }
        com.corrodinggames.rts.gameFramework.l.e("PassthroughZipReader");
        n.a(ag.l("/first/second/zip.rwmod/test1/test2"), "test1/test2");
        n.a(ag.l("\\first\\second\\zip.rwmod\\test1\\test2"), "test1/test2");
        this.a("A", "B");
        this.a("AA=11", "BB=22");
        this.a("AA='11'", "BB='22'");
        this.a("AA=(11)", "BB=22");
        this.a("(AA)=(11)", "BB=22");
        this.a("(AA)=('11')", "BB=22");
        this.a("(AA)=('11')", "BB=((22))");
        this.a("(A,A)=('1,1')", "BB=((2,2))");
        this.a("(A,A)=('1,,1')", "BB=((2,2))");
        com.corrodinggames.rts.gameFramework.l.e("splitWithEscaping");
        this.a(al.b("hello world", ' '), "hello", "world");
        this.a(al.b("hello world", 'X'), "hello world");
        this.a(al.b("hello,world", ','), "hello", "world");
        this.a(al.b("he\\,llo,world", ','), "he,llo", "world");
        this.a("".split(" "), "");
        this.a(al.b("", ' '), "");
        this.a(al.b("hello\\\\,World", ','), "hello\\", "World");
        this.a(al.b("Hello\\A,world", ','), "HelloA", "world");
        this.a(al.b("h\\ello\\,world", ','), "hello,world");
        this.a(al.b("h\\ello\\,w,orld", ','), "hello,w", "orld");
        this.a(al.b("h\\ello\\,w,orld", ','), "hello,w", "orld");
        n.a(al.a(new String[]{"Hello"}), "Hello");
        n.a(al.a(new String[]{"Hello", "World"}), "Hello,World");
        n.a(al.a(new String[]{"Hel,lo", "World"}), "Hel\\,lo,World");
        n.a(al.a(new String[]{"Hel,lo,", "Wor,ld"}), "Hel\\,lo\\,,Wor\\,ld");
        n.a(al.a(new String[]{"Hel\\,lo,", "Wor,ld"}), "Hel\\\\\\,lo\\,,Wor\\,ld");
        n.a(al.a(new String[]{"H\\el\\,lo,", "Wor,ld"}), "H\\\\el\\\\\\,lo\\,,Wor\\,ld");
        com.corrodinggames.rts.gameFramework.l.e("FileLoaderBackend");
        string2 = "/tmp/rustedWarfareTests/";
        d d2 = new d(string2, "test1");
        d2.a = "fileLoader1: ";
        d2.b = true;
        String string3 = "/tmp/rustedWarfareTestsSec2/";
        d d3 = new d(string3, "test2");
        d3.a = "fileLoader2: ";
        d3.b = true;
        String string4 = "primary-PATH/";
        String string5 = "[ALT-PATH]/";
        com.corrodinggames.rts.gameFramework.e.e e2 = new com.corrodinggames.rts.gameFramework.e.e(d2, string4, d3, string5);
        e2.a = "mergedFileLoader: ";
        e2.b = true;
        n.b(d2.f("/SD/rustedWarfare/"), string2);
        n.b(d2.f("/SD/rustedWarfare/maps/coolMap.tmx"), string2 + "mods/maps/coolMap.tmx");
        n.b(d2.f("/SD/rustedWarfare/maps/coolMap.tmx"), string2 + "mods/maps/coolMap.tmx");
        n.b(d2.f("units/test.ini"), "assets/units/test.ini");
        com.corrodinggames.rts.gameFramework.l.e("FileLoaderBackend - merged");
        n.b(e2.f("/SD/rustedWarfare/"), string2);
        n.b(e2.f("/SD/rustedWarfare/maps/coolMap.tmx"), string2 + "mods/maps/coolMap.tmx");
        boolean bl2 = true;
        com.corrodinggames.rts.gameFramework.l.e("FileLoaderBackend - android fake");
        boolean bl3 = com.corrodinggames.rts.gameFramework.l.aU;
        com.corrodinggames.rts.gameFramework.l.aU = false;
        try {
            n.b(d2.f("/SD/rustedWarfare/"), string2);
            n.b(d2.f("/SD/rustedWarfare/maps/coolMap.tmx"), string2 + "maps/coolMap.tmx");
            n.b(d2.f("/SD/rustedWarfare/maps/coolMap.tmx"), string2 + "maps/coolMap.tmx");
            n.b(d2.f("units/test.ini"), "units/test.ini");
        }
        finally {
            com.corrodinggames.rts.gameFramework.l.aU = bl3;
        }
        if (bl2) {
            com.corrodinggames.rts.gameFramework.l.e("FileLoaderBackend - real file tests");
            String string6 = "/SD/rustedWarfare/testDir";
            File file = new File(d2.f(string6));
            file.mkdirs();
            File file2 = new File(d3.f(string6));
            file2.mkdirs();
            try {
                String[] stringArray = new File(d2.f(string6 + "/map1.tmx"));
                stringArray.createNewFile();
                String[] stringArray2 = new FileWriter((File)stringArray);
                stringArray2.write("map1");
                stringArray2.close();
                File file3 = new File(d2.f(string6 + "/map2.tmx"));
                file3.createNewFile();
                File file4 = new File(d3.f(string6 + "/map3.tmx"));
                file4.createNewFile();
                Object object2 = new FileWriter(file4);
                object2.write("map3");
                object2.close();
                File file5 = d2.b(string6, false);
                n.a(((String[])file5).length, 2);
                n.b(file5[0], "map1.tmx");
                n.b(file5[1], "map2.tmx");
                file5 = e2.b(string6, false);
                n.a(((String[])file5).length, 3);
                n.b(file5[0], string4 + "map1.tmx");
                n.b(file5[1], string4 + "map2.tmx");
                n.b(file5[2], string5 + "map3.tmx");
                String string7 = file5[2];
                j j2 = e2.j(string6 + "/" + string7);
                if (j2 == null) {
                    throw new RuntimeException("Null for: " + string6 + "/" + string7);
                }
                n.b(f.b(j2), "map3");
            }
            catch (IOException iOException) {
                throw new RuntimeException((Throwable)iOException);
            }
            finally {
                String[] stringArray;
                com.corrodinggames.rts.gameFramework.l.e("FileLoaderBackend - clean up");
                for (String string8 : stringArray = file.list()) {
                    File file6 = new File(file.getPath(), string8);
                    file6.delete();
                }
                file.delete();
            }
            com.corrodinggames.rts.gameFramework.l.e("isSameOrHigherVersion..");
            this.a("v1.13", "v1.14", true);
            this.a("v1.13", "v2.14", true);
            this.a("v1.13", "v2.11", true);
            this.a("v1.13", "v1.13p5", false);
            this.a("v1.13", "v1.13.2", true);
            this.a("v1.13.2", "v1.13", false);
            this.a("v1.13", "v1.13b", true);
            this.a("v1.13", "v1.13.2p6", true);
            this.a("v1.13", "v1.14.2p6", true);
            this.a("v1.13p9", "v1.14.2p6", true);
            this.a("v1.13p9", "v1.14p6", true);
            this.a("v1.14p3", "v1.14p6", true);
            this.a("v1.14p3", "v1.14p6b", true);
            this.a("v1.14p8", "v1.14p3", false);
            this.a("v1", "v2", true);
            this.a("v1.5", "v2", true);
            this.a("v2", "v1.15", false);
            this.a("v2.0.5", "v1.15", false);
            this.a("v1.15", "v2.0.5", true);
            this.a("v1.15.6", "v2.0.5", true);
            this.a("v1.15.6", "v1.16.5", true);
            this.a("v1.13", "v1.13.2p5", true);
            this.a("v1.14", "v1.14p3", false);
            this.a("v1.14b", "v1.14p3", false);
            this.a("v1.14.2", "v1.14p3", false);
            this.a("v1.14.2b", "v1.14p3", false);
            try {
                com.corrodinggames.rts.gameFramework.i.a.a("v1.11p1");
            }
            catch (bo bo3) {
                throw new RuntimeException((Throwable)((Object)bo3));
            }
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("10000", com.corrodinggames.rts.game.units.custom.e.b.a), "10000");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("", com.corrodinggames.rts.game.units.custom.e.b.b), "");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("1", com.corrodinggames.rts.game.units.custom.e.b.c), "1");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("10", com.corrodinggames.rts.game.units.custom.e.b.c), "10");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("100", com.corrodinggames.rts.game.units.custom.e.b.c), "100");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("1000", com.corrodinggames.rts.game.units.custom.e.b.c), "1,000");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a(".", com.corrodinggames.rts.game.units.custom.e.b.c), ".");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a(".2", com.corrodinggames.rts.game.units.custom.e.b.c), ".2");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a(".22", com.corrodinggames.rts.game.units.custom.e.b.c), ".22");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a(".223", com.corrodinggames.rts.game.units.custom.e.b.c), ".223");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a(".2234", com.corrodinggames.rts.game.units.custom.e.b.c), ".2234");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("100.2234", com.corrodinggames.rts.game.units.custom.e.b.c), "100.2234");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("1000.2234", com.corrodinggames.rts.game.units.custom.e.b.c), "1,000.2234");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("10000", com.corrodinggames.rts.game.units.custom.e.b.c), "10,000");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("9800000", com.corrodinggames.rts.game.units.custom.e.b.c), "9,800,000");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("9800000.67", com.corrodinggames.rts.game.units.custom.e.b.c), "9,800,000.67");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("98000000.67", com.corrodinggames.rts.game.units.custom.e.b.c), "98,000,000.67");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("980000000.67", com.corrodinggames.rts.game.units.custom.e.b.c), "980,000,000.67");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("9800000001.67", com.corrodinggames.rts.game.units.custom.e.b.c), "9,800,000,001.67");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("9800000001.6", com.corrodinggames.rts.game.units.custom.e.b.c), "9,800,000,001.6");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("9800000001.", com.corrodinggames.rts.game.units.custom.e.b.c), "9,800,000,001.");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a("9800000001", com.corrodinggames.rts.game.units.custom.e.b.c), "9,800,000,001");
            n.a(com.corrodinggames.rts.game.units.custom.e.a.a(9800000L, com.corrodinggames.rts.game.units.custom.e.b.c), "9,800,000");
        }
    }

    public void a(String string2, String string3) {
        ArrayList arrayList = al.a(string2 + "," + string3, ",", false, false);
        n.a((String)arrayList.get(0), string2);
        n.a((String)arrayList.get(1), string3);
    }

    public void a(String[] stringArray, String string2) {
        n.a(stringArray.length, 1);
        n.a(stringArray[0], string2);
    }

    public void a(String[] stringArray, String string2, String string3) {
        n.a(stringArray.length, 2);
        n.a(stringArray[0], string2);
        n.a(stringArray[1], string3);
    }

    public void a(String string2, String string3, boolean bl2) {
        boolean bl3 = false;
        try {
            com.corrodinggames.rts.gameFramework.i.a.a(string2, string3);
            bl3 = true;
        }
        catch (bo bo2) {
            if (bl2) {
                com.corrodinggames.rts.gameFramework.l.b(bo2.getMessage());
            }
            bl3 = false;
        }
        if (bl3 != bl2) {
            throw new RuntimeException("isSameOrHigherVersion(" + string2 + "," + string3 + "): Asset failed got: " + bl3);
        }
    }
}

