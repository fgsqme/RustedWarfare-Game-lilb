/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 */
package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.n;
import com.corrodinggames.rts.gameFramework.bh;
import com.corrodinggames.rts.gameFramework.bi;
import com.corrodinggames.rts.gameFramework.bj;
import com.corrodinggames.rts.gameFramework.j.as;
import com.corrodinggames.rts.gameFramework.j.k;
import com.corrodinggames.rts.gameFramework.l;
import java.util.Collection;

public strictfp class bn {
    private int a = -1;
    private bi[] b = new bi[bj.values().length];

    public bn() {
        this.a();
    }

    public void a() {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = new bi();
        }
    }

    public void a(k k2) {
        boolean bl2 = k2.e();
        if (bl2) {
            k2.a("History");
            k2.d();
            this.a = k2.f();
            boolean bl3 = k2.e();
            int n2 = k2.d();
            this.a();
            for (int i2 = 0; i2 < n2; ++i2) {
                int n3 = 0;
                int n4 = 0;
                int n5 = k2.v();
                for (int i3 = 0; i3 < n5; ++i3) {
                    int n6;
                    int n7;
                    if (bl3) {
                        n7 = k2.f() + n3;
                        n6 = k2.f() + n4;
                        n3 = n7;
                        n4 = n6;
                    } else {
                        n7 = k2.f();
                        n6 = k2.f();
                    }
                    if (i2 >= this.b.length) continue;
                    this.b[i2].add(new bh(n7, n6));
                }
            }
        }
    }

    public void a(as as2) {
        boolean bl2 = true;
        as2.a(bl2);
        if (bl2) {
            as2.e();
            as2.c(0);
            as2.a(this.a);
            boolean bl3 = true;
            as2.a(bl3);
            as2.c(this.b.length);
            int n2 = 0;
            for (bi bi2 : this.b) {
                int n3 = bi2.size();
                as2.a((short)n3);
                int n4 = 0;
                int n5 = 0;
                for (int i2 = 0; i2 < n3; ++i2) {
                    ++n2;
                    bh bh2 = (bh)bi2.get(i2);
                    if (bl3) {
                        int n6 = bh2.a;
                        int n7 = bh2.b;
                        as2.a(n6 - n4);
                        as2.a(n7 - n5);
                        n4 = n6;
                        n5 = n7;
                        continue;
                    }
                    as2.a(bh2.a);
                    as2.a(bh2.b);
                }
            }
            l.e("TeamHistory(" + this.a + "): totalValues written:" + n2);
        }
    }

    public void a(n n2, int n3, boolean bl2) {
        for (bj bj2 : bj.values()) {
            int n4 = bj2.e.a(n2);
            bi bi2 = this.b[bj2.ordinal()];
            if (!bi2.isEmpty() && !bl2 && ((bh)bi2.get((int)(bi2.size() - 1))).b == n4) continue;
            bi2.add(new bh(n3, n4));
        }
    }

    public void a(int n2) {
        this.a = n2;
    }

    public int b() {
        return this.a;
    }

    public bi a(bj bj2) {
        return this.b[bj2.ordinal()];
    }

    public boolean c() {
        if (this.a < 0) {
            return false;
        }
        for (bi bi2 : this.b) {
            if (bi2.size() <= 1) continue;
            return true;
        }
        return false;
    }

    public int a(bj bj2, int n2) {
        return this.b[bj2.ordinal()].a(n2);
    }

    public void a(bn bn2) {
        for (int i2 = 0; i2 < this.b.length; ++i2) {
            this.b[i2] = this.a(this.b[i2], bn2.b[i2]);
        }
    }

    private bi a(bi bi2, bi bi3) {
        if (bi2.isEmpty()) {
            bi2.addAll((Collection)bi3);
            return bi2;
        }
        bi bi4 = new bi();
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        Object object = bi2.iterator();
        while (object.hasNext()) {
            bh bh2 = (bh)object.next();
            int n5 = bh2.a;
            int n6 = bh2.b;
            if (n2 < bi3.size()) {
                bh bh3 = (bh)bi3.get(n2);
                while (bh3.a < n5) {
                    n4 = bh3.b;
                    bi4.add(new bh(bh3.a, n3 + n4));
                    if (++n2 >= bi3.size()) continue;
                    bh3 = (bh)bi3.get(n2);
                }
                if (bh3.a == n5) {
                    n4 = bh3.b;
                    n3 = n6;
                    bi4.add(new bh(n5, n3 + n4));
                    ++n2;
                    continue;
                }
                if (bh3.a <= n5) continue;
                n3 = n6;
                bi4.add(new bh(n5, n3 + n4));
                continue;
            }
            n3 = n6;
            bi4.add(new bh(n5, n3 + n4));
        }
        while (n2 < bi3.size()) {
            object = (bh)bi3.get(n2);
            n4 = object.b;
            bi4.add(new bh(object.a, n3 + n4));
            ++n2;
        }
        return bi4;
    }
}

