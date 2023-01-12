/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.ByteArrayInputStream
 *  java.io.ByteArrayOutputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorCompletionService
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.TimeUnit
 *  org.apache.http.HttpEntity
 *  org.apache.http.HttpResponse
 *  org.apache.http.NameValuePair
 *  org.apache.http.client.HttpClient
 *  org.apache.http.client.entity.UrlEncodedFormEntity
 *  org.apache.http.client.methods.HttpGet
 *  org.apache.http.client.methods.HttpPost
 *  org.apache.http.client.methods.HttpUriRequest
 *  org.apache.http.client.utils.URLEncodedUtils
 *  org.apache.http.message.BasicNameValuePair
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.br;
import com.corrodinggames.rts.gameFramework.e.a;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.j.aa;
import com.corrodinggames.rts.gameFramework.j.ab;
import com.corrodinggames.rts.gameFramework.j.ai;
import com.corrodinggames.rts.gameFramework.j.aq;
import com.corrodinggames.rts.gameFramework.j.g;
import com.corrodinggames.rts.gameFramework.j.n$1;
import com.corrodinggames.rts.gameFramework.j.p;
import com.corrodinggames.rts.gameFramework.j.q;
import com.corrodinggames.rts.gameFramework.j.r;
import com.corrodinggames.rts.gameFramework.j.s;
import com.corrodinggames.rts.gameFramework.j.t;
import com.corrodinggames.rts.gameFramework.j.u;
import com.corrodinggames.rts.gameFramework.j.v;
import com.corrodinggames.rts.gameFramework.j.w;
import com.corrodinggames.rts.gameFramework.j.y;
import com.corrodinggames.rts.gameFramework.j.z;
import com.corrodinggames.rts.gameFramework.l;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

public class n {
    public static boolean a = true;
    public static boolean b = true;
    public static String[] c = new String[]{"http://gs1.corrodinggames.com/masterserver/1.4", "http://gs4.corrodinggames.net/masterserver/1.4"};
    public static r d = new r();
    static int e;
    public static Object f;
    public static String g;

    public static void a(String string2) {
        if (b) {
            l.e(string2);
        }
    }

    static void a(List list, boolean bl2, s s2) {
        n.a(list, bl2, s2, c);
    }

    static void a(List list, boolean bl2, s s2, String[] stringArray) {
        s2.f = stringArray.length;
        int n2 = 0;
        for (String string2 : stringArray) {
            u u2 = new u(list, s2, string2, bl2, ++n2);
            new Thread((Runnable)u2).start();
            if (!a) continue;
            l.b("LoadFromMasterServer", n2 + ": Started RequestsParallelRunnable thread");
        }
    }

    public static String a(List list, String string2) {
        if (list != null) {
            for (NameValuePair nameValuePair : list) {
                if (!string2.equals((Object)nameValuePair.getName())) continue;
                return nameValuePair.getValue();
            }
        }
        return null;
    }

    public static BufferedReader a(List list) {
        return n.a(list, true, c, 10, true);
    }

    public static BufferedReader a(List list, int n2) {
        return n.a(list, true, c, n2, true);
    }

    public static BufferedReader a(List list, boolean bl2, String[] stringArray, int n2, boolean bl3) {
        String string2 = n.a(list, "action");
        ExecutorService executorService = Executors.newFixedThreadPool((int)stringArray.length);
        boolean bl4 = bl3;
        try {
            Object object;
            n$1 n$1;
            String string32;
            ExecutorCompletionService executorCompletionService = new ExecutorCompletionService((Executor)executorService);
            ArrayList arrayList = new ArrayList();
            for (String string32 : stringArray) {
                List list2 = list;
                n$1 = new n$1(string32, list2, bl2, bl4);
                object = executorCompletionService.submit((Callable)n$1);
                arrayList.add(object);
            }
            int n3 = stringArray.length;
            Object object2 = null;
            String string4 = null;
            string32 = null;
            for (int i2 = 0; i2 < n3; ++i2) {
                try {
                    n$1 = executorCompletionService.poll(10L, TimeUnit.SECONDS);
                    if (n$1 == null) {
                        l.b("MULTI_MASTERSERVERS: poll timed out (" + string2 + ")");
                        break;
                    }
                    object = (t)n$1.get();
                    if (object == null) continue;
                    object2 = object;
                    if (!object.b) continue;
                    if (object.c) {
                        string32 = object;
                        continue;
                    }
                    string4 = object;
                    break;
                }
                catch (ExecutionException executionException) {
                    executionException.printStackTrace();
                    if (executionException.getCause() == null) continue;
                    executionException.getCause().printStackTrace();
                    continue;
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
            }
            if (string4 == null && string32 != null) {
                l.b("All masterserver results included an error message (" + string2 + ")");
                string4 = string32;
            }
            if (string4 == null) {
                l.b("No valid result found on any masterserver (" + string2 + ")");
                string4 = object2;
            }
            if (string4 != null) {
                BufferedReader bufferedReader = ((t)((Object)string4)).a;
                return bufferedReader;
            }
            throw new IOException("No results found (" + string2 + ")");
        }
        finally {
            executorService.shutdown();
        }
    }

    public static t a(List list, String string2, boolean bl2) {
        Object object;
        int n2;
        HttpResponse httpResponse;
        HttpPost httpPost;
        Object object2;
        String string3 = n.a(list, "action");
        long l2 = br.a();
        String string4 = string2 + "/interface";
        if (bl2) {
            object2 = new HttpPost(string4);
            object2.setEntity((HttpEntity)new UrlEncodedFormEntity(list));
            httpPost = object2;
        } else {
            string4 = string4 + "?" + URLEncodedUtils.format((List)list, (String)"utf-8");
            httpPost = object2 = new HttpGet(string4);
        }
        object2 = "rw ";
        object2 = l.ax() ? (String)object2 + "server" : (String)object2 + (l.av() ? "pc" : "android");
        String string5 = com.corrodinggames.rts.gameFramework.h.a.c();
        l l3 = l.B();
        if (l3 != null) {
            object2 = (String)object2 + " " + l3.c(true) + " " + string5;
        }
        httpPost.setHeader("User-Agent", (String)object2);
        httpPost.setHeader("Language", string5);
        l3 = d.a();
        try {
            httpResponse = l3.execute((HttpUriRequest)httpPost);
        }
        catch (NullPointerException nullPointerException) {
            l.b("doRequest: httpclient.execute threw NullPointerException, running workaround");
            l3 = d.b();
            httpResponse = l3.execute((HttpUriRequest)httpPost);
        }
        float f2 = br.a(l2);
        HttpEntity httpEntity = httpResponse.getEntity();
        InputStream inputStream = httpEntity.getContent();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] byArray = new byte[16384];
        while ((n2 = inputStream.read(byArray, 0, byArray.length)) != -1) {
            byteArrayOutputStream.write(byArray, 0, n2);
        }
        byteArrayOutputStream.flush();
        inputStream.close();
        httpEntity.consumeContent();
        byte[] byArray2 = byteArrayOutputStream.toByteArray();
        String string6 = "CORRODINGGAMES";
        t t2 = new t();
        String string7 = n.a(byArray2);
        t2.b = string7.startsWith(string6);
        t2.c = string7.contains((CharSequence)"[FAILED]");
        if (!t2.b || t2.c) {
            object = string4 + (string3 != null ? "?action=" + string3 : "") + " (" + f2 + "ms)";
            if (!"list".equals((Object)string3)) {
                object = (String)object + ":\n" + new String(byArray2);
            }
            l.e((String)object);
        }
        object = new ByteArrayInputStream(byArray2);
        BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader((InputStream)object));
        d.a((HttpClient)l3);
        t2.a = bufferedReader;
        return t2;
    }

    public static String a(byte[] byArray) {
        int n2 = byArray.length;
        for (int i2 = 0; i2 < byArray.length; ++i2) {
            if (byArray[i2] != 10 && byArray[i2] != 13) continue;
            n2 = i2;
            break;
        }
        String string2 = new String(byArray, 0, n2);
        return string2;
    }

    public static g b(String string2) {
        l l2 = l.B();
        if (string2 == null) {
            throw new IOException("findOrCreateServer id cannot be null");
        }
        for (g g2 : l2.bX.bi) {
            if (!string2.equals((Object)g2.b)) continue;
            return g2;
        }
        return null;
    }

    public static g c(String string2) {
        l l2 = l.B();
        if (string2 == null) {
            throw new IOException("findOrCreateServer id cannot be null");
        }
        g g2 = n.b(string2);
        if (g2 != null) {
            return g2;
        }
        g g3 = new g();
        g3.b = string2;
        g3.a = false;
        g3.o = l2.bX.p();
        return g3;
    }

    public static void a(Runnable runnable) {
        l.b("LoadFromMasterServer", "Load requested");
        q q2 = new q(runnable);
        Thread thread = new Thread((Runnable)q2);
        thread.start();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    static void a(int n2, int n3) {
        l l2 = l.B();
        boolean bl2 = false;
        Object object = f;
        synchronized (object) {
            Iterator iterator = l2.bX.bi.iterator();
            while (iterator.hasNext()) {
                g g2 = (g)iterator.next();
                if (g2.p >= n2) continue;
                l.b("LoadFromMasterServer", n3 + ": Removing stale server with id:" + g2.b);
                iterator.remove();
                bl2 = true;
            }
        }
        if (bl2) {
            com.corrodinggames.rts.appFramework.p.l();
        }
    }

    public static void a() {
        l.b("GetOwnInfoRunnable", "getOwnInfoFromMasterServer");
        aq.e = 6;
        p p2 = new p();
        Thread thread = new Thread((Runnable)p2);
        thread.start();
    }

    static void a(List list, String string2, String string3) {
        list.add((Object)new BasicNameValuePair(string2, string3));
    }

    static void b(List list) {
        String string2;
        l l2 = l.B();
        n.a(list, "password_required", com.corrodinggames.rts.gameFramework.f.a(l2.bX.n != null));
        n.a(list, "created_by", l2.bX.y);
        n.a(list, "private_ip", l2.bX.ah());
        n.a(list, "port_number", Integer.toString((int)l2.bX.m));
        if (l2.bX.u != null) {
            n.a(list, "game_map", com.corrodinggames.rts.gameFramework.e.a.o(l2.bX.u));
        } else {
            n.a(list, "game_map", com.corrodinggames.rts.gameFramework.e.a.o(l2.bX.ay.b));
        }
        ai ai2 = l2.bX.ay.a;
        if (ai2 == null) {
            ai2 = ai.a;
        }
        n.a(list, "game_mode", ai2.name());
        if (!l2.bX.v) {
            string2 = l2.bX.aW ? "ingame" : (l2.bX.ay.p ? "locked" : "battleroom");
            n.a(list, "game_status", string2);
        } else {
            n.a(list, "game_status", "chat");
        }
        n.a(list, "player_count", Integer.toString((int)l2.bX.E()));
        string2 = Integer.toString((int)com.corrodinggames.rts.game.n.c);
        if (l2.bX.v) {
            // empty if block
        }
        n.a(list, "max_player_count", string2);
    }

    public static void b() {
        l.b("StartCreateOnMasterServer", "Create requested");
        aq.b = 5;
        y y2 = new y();
        Thread thread = new Thread((Runnable)y2);
        thread.start();
    }

    public static void c() {
        aa aa2 = new aa();
        Thread thread = new Thread((Runnable)aa2);
        thread.start();
    }

    public static void d() {
        l.b("startRemoveOnMasterServer", "Remove requested");
        z z2 = new z();
        Thread thread = new Thread((Runnable)z2);
        thread.start();
    }

    public static void a(String string2, String string3) {
        l.b("startErrorReport", "ErrorReport requested");
        v v2 = new v();
        v2.b = string3;
        v2.a = string2;
        Thread thread = new Thread((Runnable)v2);
        thread.start();
    }

    public static String a(int n2) {
        if (n2 == 0) {
            return "";
        }
        if (n2 > 0) {
            if (n2 < 100000) {
                return com.corrodinggames.rts.gameFramework.f.a(com.corrodinggames.rts.gameFramework.f.b("x" + n2), 10);
            }
            if (n2 < 200000) {
                return com.corrodinggames.rts.gameFramework.f.a(com.corrodinggames.rts.gameFramework.f.b("y" + n2), 11);
            }
            if (n2 < 300000) {
                return com.corrodinggames.rts.gameFramework.f.a(com.corrodinggames.rts.gameFramework.f.b("z" + n2), 12);
            }
            if (n2 < 1000000) {
                return com.corrodinggames.rts.gameFramework.f.a(com.corrodinggames.rts.gameFramework.f.b("xx" + n2), 13) + "-" + l.B().bX.g(n2 - 300000);
            }
            if (n2 < 2000000) {
                return com.corrodinggames.rts.gameFramework.f.a(com.corrodinggames.rts.gameFramework.f.b("yy" + n2), 14) + "-" + l.B().bX.g(n2 - 1000000);
            }
        }
        return "NA";
    }

    public static void a(w w2, String string2, int n2, String string3) {
        l.e("getGameServerInfoFromMasterServer");
        ab ab2 = new ab();
        ab2.a = w2;
        ab2.b = string2;
        ab2.c = n2;
        ab2.d = string3;
        Thread thread = new Thread((Runnable)ab2);
        thread.start();
    }

    static {
        f = new Object();
    }
}

