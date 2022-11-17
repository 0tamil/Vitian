package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.k;
import com.google.android.gms.common.internal.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends j> extends g<R> {
    static final ThreadLocal<Boolean> p = new w2();
    public static final /* synthetic */ int q = 0;
    private final Object a;
    protected final a<R> b;
    protected final WeakReference<f> c;

    /* renamed from: d */
    private final CountDownLatch f1069d;

    /* renamed from: e */
    private final ArrayList<g.a> f1070e;

    /* renamed from: f */
    private k<? super R> f1071f;

    /* renamed from: g */
    private final AtomicReference<j2> f1072g;

    /* renamed from: h */
    private R f1073h;

    /* renamed from: i */
    private Status f1074i;

    /* renamed from: j */
    private volatile boolean f1075j;

    /* renamed from: k */
    private boolean f1076k;
    private boolean l;
    private com.google.android.gms.common.internal.k m;
    @KeepName
    private y2 mResultGuardian;
    private volatile i2<R> n;
    private boolean o;

    /* loaded from: classes.dex */
    public static class a<R extends j> extends f.b.a.b.d.a.j {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(k<? super R> kVar, R r) {
            int i2 = BasePendingResult.q;
            p.i(kVar);
            sendMessage(obtainMessage(1, new Pair(kVar, r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 1) {
                Pair pair = (Pair) message.obj;
                k kVar = (k) pair.first;
                j jVar = (j) pair.second;
                try {
                    kVar.a(jVar);
                } catch (RuntimeException e2) {
                    BasePendingResult.n(jVar);
                    throw e2;
                }
            } else if (i2 != 2) {
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i2);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            } else {
                ((BasePendingResult) message.obj).f(Status.l);
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.a = new Object();
        this.f1069d = new CountDownLatch(1);
        this.f1070e = new ArrayList<>();
        this.f1072g = new AtomicReference<>();
        this.o = false;
        this.b = new a<>(Looper.getMainLooper());
        this.c = new WeakReference<>(null);
    }

    public BasePendingResult(f fVar) {
        this.a = new Object();
        this.f1069d = new CountDownLatch(1);
        this.f1070e = new ArrayList<>();
        this.f1072g = new AtomicReference<>();
        this.o = false;
        this.b = new a<>(fVar != null ? fVar.k() : Looper.getMainLooper());
        this.c = new WeakReference<>(fVar);
    }

    private final R j() {
        R r;
        synchronized (this.a) {
            p.l(!this.f1075j, "Result has already been consumed.");
            p.l(h(), "Result is not ready.");
            r = this.f1073h;
            this.f1073h = null;
            this.f1071f = null;
            this.f1075j = true;
        }
        j2 andSet = this.f1072g.getAndSet(null);
        if (andSet != null) {
            andSet.a.a.remove(this);
        }
        p.i(r);
        return r;
    }

    private final void k(R r) {
        this.f1073h = r;
        this.f1074i = r.a();
        this.m = null;
        this.f1069d.countDown();
        if (this.f1076k) {
            this.f1071f = null;
        } else {
            k<? super R> kVar = this.f1071f;
            if (kVar != null) {
                this.b.removeMessages(2);
                this.b.a(kVar, j());
            } else if (this.f1073h instanceof h) {
                this.mResultGuardian = new y2(this, null);
            }
        }
        ArrayList<g.a> arrayList = this.f1070e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.get(i2).a(this.f1074i);
        }
        this.f1070e.clear();
    }

    public static void n(j jVar) {
        if (jVar instanceof h) {
            try {
                ((h) jVar).a();
            } catch (RuntimeException e2) {
                String valueOf = String.valueOf(jVar);
                String.valueOf(valueOf).length();
                Log.w("BasePendingResult", "Unable to release ".concat(String.valueOf(valueOf)), e2);
            }
        }
    }

    @Override // com.google.android.gms.common.api.g
    public final void b(g.a aVar) {
        p.b(aVar != null, "Callback cannot be null.");
        synchronized (this.a) {
            if (h()) {
                aVar.a(this.f1074i);
            } else {
                this.f1070e.add(aVar);
            }
        }
    }

    @Override // com.google.android.gms.common.api.g
    public final void c(k<? super R> kVar) {
        synchronized (this.a) {
            if (kVar == null) {
                this.f1071f = null;
                return;
            }
            boolean z = true;
            p.l(!this.f1075j, "Result has already been consumed.");
            if (this.n != null) {
                z = false;
            }
            p.l(z, "Cannot set callbacks if then() has been called.");
            if (!g()) {
                if (h()) {
                    this.b.a(kVar, j());
                } else {
                    this.f1071f = kVar;
                }
            }
        }
    }

    public void d() {
        synchronized (this.a) {
            if (!this.f1076k && !this.f1075j) {
                com.google.android.gms.common.internal.k kVar = this.m;
                if (kVar != null) {
                    try {
                        kVar.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                n(this.f1073h);
                this.f1076k = true;
                k(e(Status.m));
            }
        }
    }

    public abstract R e(Status status);

    @Deprecated
    public final void f(Status status) {
        synchronized (this.a) {
            if (!h()) {
                i(e(status));
                this.l = true;
            }
        }
    }

    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            z = this.f1076k;
        }
        return z;
    }

    public final boolean h() {
        return this.f1069d.getCount() == 0;
    }

    public final void i(R r) {
        synchronized (this.a) {
            if (this.l || this.f1076k) {
                n(r);
                return;
            }
            h();
            p.l(!h(), "Results have already been set");
            p.l(!this.f1075j, "Result has already been consumed");
            k(r);
        }
    }

    public final void m() {
        boolean z = true;
        if (!this.o && !p.get().booleanValue()) {
            z = false;
        }
        this.o = z;
    }

    public final boolean o() {
        boolean g2;
        synchronized (this.a) {
            if (this.c.get() == null || !this.o) {
                d();
            }
            g2 = g();
        }
        return g2;
    }

    public final void p(j2 j2Var) {
        this.f1072g.set(j2Var);
    }
}
