package com.google.firebase.crashlytics.i.o;

import com.google.firebase.crashlytics.i.j.f0;
import com.google.firebase.crashlytics.i.j.t;
import com.google.firebase.crashlytics.i.l.a0;
import f.b.a.a.c;
import f.b.a.a.f;
import f.b.a.a.h;
import f.b.a.b.g.j;
import java.util.Locale;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d {
    private final double a;
    private final double b;
    private final long c;

    /* renamed from: d  reason: collision with root package name */
    private final int f1620d;

    /* renamed from: e  reason: collision with root package name */
    private final BlockingQueue<Runnable> f1621e;

    /* renamed from: f  reason: collision with root package name */
    private final ThreadPoolExecutor f1622f;

    /* renamed from: g  reason: collision with root package name */
    private final f<a0> f1623g;

    /* renamed from: h  reason: collision with root package name */
    private final f0 f1624h;

    /* renamed from: i  reason: collision with root package name */
    private int f1625i;

    /* renamed from: j  reason: collision with root package name */
    private long f1626j;

    /* loaded from: classes.dex */
    private final class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final t f1627e;

        /* renamed from: f  reason: collision with root package name */
        private final j<t> f1628f;

        private b(t tVar, j<t> jVar) {
            this.f1627e = tVar;
            this.f1628f = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            d.this.l(this.f1627e, this.f1628f);
            d.this.f1624h.e();
            double e2 = d.this.e();
            com.google.firebase.crashlytics.i.f f2 = com.google.firebase.crashlytics.i.f.f();
            f2.b("Delay for: " + String.format(Locale.US, "%.2f", Double.valueOf(e2 / 1000.0d)) + " s for report: " + this.f1627e.d());
            d.m(e2);
        }
    }

    d(double d2, double d3, long j2, f<a0> fVar, f0 f0Var) {
        this.a = d2;
        this.b = d3;
        this.c = j2;
        this.f1623g = fVar;
        this.f1624h = f0Var;
        int i2 = (int) d2;
        this.f1620d = i2;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i2);
        this.f1621e = arrayBlockingQueue;
        this.f1622f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f1625i = 0;
        this.f1626j = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(f<a0> fVar, com.google.firebase.crashlytics.i.p.d dVar, f0 f0Var) {
        this(dVar.f1630d, dVar.f1631e, dVar.f1632f * 1000, fVar, f0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double e() {
        return Math.min(3600000.0d, (60000.0d / this.a) * Math.pow(this.b, f()));
    }

    private int f() {
        if (this.f1626j == 0) {
            this.f1626j = k();
        }
        int k2 = (int) ((k() - this.f1626j) / this.c);
        int min = i() ? Math.min(100, this.f1625i + k2) : Math.max(0, this.f1625i - k2);
        if (this.f1625i != min) {
            this.f1625i = min;
            this.f1626j = k();
        }
        return min;
    }

    private boolean h() {
        return this.f1621e.size() < this.f1620d;
    }

    private boolean i() {
        return this.f1621e.size() == this.f1620d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void j(j jVar, t tVar, Exception exc) {
        if (exc != null) {
            jVar.d(exc);
        } else {
            jVar.e(tVar);
        }
    }

    private long k() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(final t tVar, final j<t> jVar) {
        com.google.firebase.crashlytics.i.f f2 = com.google.firebase.crashlytics.i.f.f();
        f2.b("Sending report through Google DataTransport: " + tVar.d());
        this.f1623g.b(c.e(tVar.b()), new h() { // from class: com.google.firebase.crashlytics.i.o.b
            @Override // f.b.a.a.h
            public final void a(Exception exc) {
                d.j(j.this, tVar, exc);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(double d2) {
        try {
            Thread.sleep((long) d2);
        } catch (InterruptedException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j<t> g(t tVar, boolean z) {
        synchronized (this.f1621e) {
            j<t> jVar = new j<>();
            if (z) {
                this.f1624h.d();
                if (h()) {
                    com.google.firebase.crashlytics.i.f f2 = com.google.firebase.crashlytics.i.f.f();
                    f2.b("Enqueueing report: " + tVar.d());
                    com.google.firebase.crashlytics.i.f f3 = com.google.firebase.crashlytics.i.f.f();
                    f3.b("Queue size: " + this.f1621e.size());
                    this.f1622f.execute(new b(tVar, jVar));
                    com.google.firebase.crashlytics.i.f f4 = com.google.firebase.crashlytics.i.f.f();
                    f4.b("Closing task for report: " + tVar.d());
                    jVar.e(tVar);
                    return jVar;
                }
                f();
                com.google.firebase.crashlytics.i.f f5 = com.google.firebase.crashlytics.i.f.f();
                f5.b("Dropping report due to queue being full: " + tVar.d());
                this.f1624h.c();
                jVar.e(tVar);
                return jVar;
            }
            l(tVar, jVar);
            return jVar;
        }
    }
}
