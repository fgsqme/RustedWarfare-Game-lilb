/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.DatagramPacket
 *  java.net.DatagramSocket
 *  java.net.InetAddress
 *  java.net.InetSocketAddress
 *  java.net.SocketAddress
 *  java.net.SocketException
 *  java.util.Timer
 *  java.util.TimerTask
 */
package com.corrodinggames.rts.gameFramework.j;

import com.corrodinggames.rts.gameFramework.j.ad;
import com.corrodinggames.rts.gameFramework.j.af$1;
import com.corrodinggames.rts.gameFramework.j.as;
import com.corrodinggames.rts.gameFramework.j.g;
import com.corrodinggames.rts.gameFramework.j.k;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Timer;
import java.util.TimerTask;

final class af
implements Runnable {
    boolean a;
    DatagramSocket b;
    Timer c;
    final /* synthetic */ ad d;

    public strictfp void run() {
        try {
            this.d.d("starting socket for broadcast..");
            this.b = new DatagramSocket(null);
            this.b.setReuseAddress(true);
            this.b.bind((SocketAddress)new InetSocketAddress(this.d.t));
            this.d.d("reading..");
            byte[] byArray = new byte[1500];
            DatagramPacket datagramPacket = new DatagramPacket(byArray, byArray.length);
            af$1 af$1 = new af$1(this);
            this.c = new Timer();
            this.c.scheduleAtFixedRate((TimerTask)af$1, 20L, 5000L);
            while (this.a) {
                Object object;
                this.b.receive(datagramPacket);
                String string2 = new String(datagramPacket.getData(), datagramPacket.getOffset(), datagramPacket.getLength());
                this.d.d("accepted udp socket..");
                k k2 = new k(string2);
                if (!k2.l().equals((Object)"com.corrodinggames.rts")) {
                    this.d.d("ignoring udp packet: MAGIC_GAME_ID doesn't match");
                    continue;
                }
                int n2 = k2.f();
                k2.f();
                String string3 = k2.l();
                if (string3.equals((Object)"ping")) {
                    this.d.d("got ping");
                    if (this.d.C) {
                        object = new as();
                        ((as)object).c("com.corrodinggames.rts");
                        ((as)object).a(this.d.e);
                        ((as)object).a(0);
                        ((as)object).c("pong");
                        ((as)object).a(this.d.m);
                        String string4 = ((as)object).c();
                        DatagramPacket datagramPacket2 = new DatagramPacket(string4.getBytes(), string4.length(), datagramPacket.getAddress(), this.d.t);
                        this.b.send(datagramPacket2);
                        continue;
                    }
                    this.d.d("not server");
                    continue;
                }
                if (!string3.equals((Object)"pong")) {
                    this.d.d("got pong");
                    object = new g();
                    ((g)object).a = true;
                    ((g)object).g = k2.f();
                    ((g)object).c = datagramPacket.getAddress().toString();
                    ((g)object).j = "" + n2;
                    this.d.a((g)object);
                    continue;
                }
                this.d.d("ignoring udp packet: unknown mode:" + string3);
            }
        }
        catch (SocketException socketException) {
            if (this.a) {
                throw new RuntimeException((Throwable)socketException);
            }
            socketException.printStackTrace();
        }
        catch (IOException iOException) {
            throw new RuntimeException((Throwable)iOException);
        }
    }

    public strictfp void a() {
        this.d.d("sending ping");
        if (this.b == null) {
            this.d.d("failed to send a broadcast ping: datagramSocket is null");
            return;
        }
        InetAddress inetAddress = this.d.al();
        if (inetAddress == null) {
            this.d.d("failed to send a broadcast ping: could not get a broadcast address");
            return;
        }
        try {
            as as2 = new as();
            as2.c("com.corrodinggames.rts");
            as2.a(this.d.e);
            as2.a(0);
            as2.c("ping");
            String string2 = as2.c();
            this.d.d("sending ping on :" + inetAddress.toString());
            DatagramPacket datagramPacket = new DatagramPacket(string2.getBytes(), string2.length(), inetAddress, this.d.t);
            this.b.send(datagramPacket);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            this.d.d("failed to send a broadcast ping, IOException");
            return;
        }
    }

    public strictfp void b() {
        this.a = false;
        if (this.b != null) {
            this.b.close();
        }
        if (this.c != null) {
            this.c.cancel();
        }
    }
}

