package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.backends.f;
import com.google.android.datatransport.runtime.backends.g;
import com.google.android.datatransport.runtime.backends.m;
import f.b.a.a.i.a0.j.i0;
import f.b.a.a.i.a0.j.j0;
import f.b.a.a.i.a0.j.q0;
import f.b.a.a.i.b0.b;
import f.b.a.a.i.c0.a;
import f.b.a.a.i.i;
import f.b.a.a.i.j;
import f.b.a.a.i.p;
import f.b.a.a.i.x.a.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class u {
    private final Context a;
    private final e b;
    private final j0 c;

    /* renamed from: d  reason: collision with root package name */
    private final y f1016d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f1017e;

    /* renamed from: f  reason: collision with root package name */
    private final b f1018f;

    /* renamed from: g  reason: collision with root package name */
    private final a f1019g;

    /* renamed from: h  reason: collision with root package name */
    private final a f1020h;

    /* renamed from: i  reason: collision with root package name */
    private final i0 f1021i;

    public u(Context context, e eVar, j0 j0Var, y yVar, Executor executor, b bVar, a aVar, a aVar2, i0 i0Var) {
        this.a = context;
        this.b = eVar;
        this.c = j0Var;
        this.f1016d = yVar;
        this.f1017e = executor;
        this.f1018f = bVar;
        this.f1019g = aVar;
        this.f1020h = aVar2;
        this.f1021i = i0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public /* synthetic */ Boolean d(p pVar) {
        return Boolean.valueOf(this.c.j(pVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ Iterable f(p pVar) {
        return this.c.k(pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ Object h(Iterable iterable, p pVar, long j2) {
        this.c.m(iterable);
        this.c.p(pVar, this.f1019g.a() + j2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ Object j(Iterable iterable) {
        this.c.e(iterable);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public /* synthetic */ Object l() {
        this.f1021i.b();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m */
    public /* synthetic */ Object n(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.f1021i.f(((Integer) entry.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public /* synthetic */ Object p(p pVar, long j2) {
        this.c.p(pVar, this.f1019g.a() + j2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public /* synthetic */ Object r(p pVar, int i2) {
        this.f1016d.a(pVar, i2 + 1);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void t(final p pVar, final int i2, Runnable runnable) {
        try {
            try {
                b bVar = this.f1018f;
                final j0 j0Var = this.c;
                Objects.requireNonNull(j0Var);
                bVar.c(new b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.b
                    @Override // f.b.a.a.i.b0.b.a
                    public final Object a() {
                        return Integer.valueOf(j0.this.a());
                    }
                });
                if (!b()) {
                    this.f1018f.c(new b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.k
                        @Override // f.b.a.a.i.b0.b.a
                        public final Object a() {
                            return u.this.r(pVar, i2);
                        }
                    });
                } else {
                    u(pVar, i2);
                }
            } catch (f.b.a.a.i.b0.a unused) {
                this.f1016d.a(pVar, i2 + 1);
            }
        } finally {
            runnable.run();
        }
    }

    public j a(m mVar) {
        b bVar = this.f1018f;
        final i0 i0Var = this.f1021i;
        Objects.requireNonNull(i0Var);
        j.a a = j.a();
        a.i(this.f1019g.a());
        a.k(this.f1020h.a());
        a.j("GDT_CLIENT_METRICS");
        a.h(new i(f.b.a.a.b.b("proto"), ((f.b.a.a.i.x.a.a) bVar.c(new b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.o
            @Override // f.b.a.a.i.b0.b.a
            public final Object a() {
                return i0.this.d();
            }
        })).f()));
        return mVar.a(a.d());
    }

    boolean b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    g u(final p pVar, int i2) {
        g b;
        m a = this.b.a(pVar.b());
        long j2 = 0;
        g e2 = g.e(0L);
        while (true) {
            final long j3 = j2;
            while (((Boolean) this.f1018f.c(new b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.e
                @Override // f.b.a.a.i.b0.b.a
                public final Object a() {
                    return u.this.d(pVar);
                }
            })).booleanValue()) {
                final Iterable<q0> iterable = (Iterable) this.f1018f.c(new b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.g
                    @Override // f.b.a.a.i.b0.b.a
                    public final Object a() {
                        return u.this.f(pVar);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e2;
                }
                if (a == null) {
                    f.b.a.a.i.y.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    b = g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (q0 q0Var : iterable) {
                        arrayList.add(q0Var.b());
                    }
                    if (pVar.e()) {
                        arrayList.add(a(a));
                    }
                    f.a a2 = f.a();
                    a2.b(arrayList);
                    a2.c(pVar.c());
                    b = a.b(a2.a());
                }
                e2 = b;
                if (e2.c() == g.a.TRANSIENT_ERROR) {
                    this.f1018f.c(new b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.h
                        @Override // f.b.a.a.i.b0.b.a
                        public final Object a() {
                            return u.this.h(iterable, pVar, j3);
                        }
                    });
                    this.f1016d.b(pVar, i2 + 1, true);
                    return e2;
                }
                this.f1018f.c(new b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.j
                    @Override // f.b.a.a.i.b0.b.a
                    public final Object a() {
                        return u.this.j(iterable);
                    }
                });
                if (e2.c() == g.a.OK) {
                    j2 = Math.max(j3, e2.b());
                    if (pVar.e()) {
                        this.f1018f.c(new b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.l
                            @Override // f.b.a.a.i.b0.b.a
                            public final Object a() {
                                return u.this.l();
                            }
                        });
                    }
                } else if (e2.c() == g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    for (q0 q0Var2 : iterable) {
                        String j4 = q0Var2.b().j();
                        hashMap.put(j4, !hashMap.containsKey(j4) ? 1 : Integer.valueOf(((Integer) hashMap.get(j4)).intValue() + 1));
                    }
                    this.f1018f.c(new b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.f
                        @Override // f.b.a.a.i.b0.b.a
                        public final Object a() {
                            return u.this.n(hashMap);
                        }
                    });
                }
            }
            this.f1018f.c(new b.a() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.i
                @Override // f.b.a.a.i.b0.b.a
                public final Object a() {
                    return u.this.p(pVar, j3);
                }
            });
            return e2;
        }
    }

    public void v(final p pVar, final int i2, final Runnable runnable) {
        this.f1017e.execute(new Runnable() { // from class: com.google.android.datatransport.runtime.scheduling.jobscheduling.d
            @Override // java.lang.Runnable
            public final void run() {
                u.this.t(pVar, i2, runnable);
            }
        });
    }
}
