package com.google.firebase.installations;

import android.text.TextUtils;
import com.google.android.gms.common.internal.p;
import com.google.firebase.h;
import com.google.firebase.installations.i;
import com.google.firebase.installations.r.c;
import com.google.firebase.installations.r.d;
import com.google.firebase.installations.r.f;
import com.google.firebase.p.j;
import f.b.a.b.g.i;
import f.b.a.b.g.l;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class g implements h {
    private static final Object m = new Object();
    private static final ThreadFactory n = new a();
    private final h a;
    private final c b;
    private final com.google.firebase.installations.q.c c;

    /* renamed from: d  reason: collision with root package name */
    private final o f1664d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.firebase.installations.q.b f1665e;

    /* renamed from: f  reason: collision with root package name */
    private final m f1666f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f1667g;

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f1668h;

    /* renamed from: i  reason: collision with root package name */
    private final ExecutorService f1669i;

    /* renamed from: j  reason: collision with root package name */
    private String f1670j;

    /* renamed from: k  reason: collision with root package name */
    private Set<com.google.firebase.installations.p.a> f1671k;
    private final List<n> l;

    /* loaded from: classes.dex */
    class a implements ThreadFactory {
        private final AtomicInteger a = new AtomicInteger(1);

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, String.format("firebase-installations-executor-%d", Integer.valueOf(this.a.getAndIncrement())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[f.b.values().length];
            b = iArr;
            try {
                iArr[f.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[f.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[f.b.AUTH_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            a = iArr2;
            try {
                iArr2[d.b.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[d.b.BAD_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(h hVar, com.google.firebase.q.b<j> bVar) {
        this(new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), n), hVar, new c(hVar.j(), bVar), new com.google.firebase.installations.q.c(hVar), o.c(), new com.google.firebase.installations.q.b(hVar), new m());
    }

    g(ExecutorService executorService, h hVar, c cVar, com.google.firebase.installations.q.c cVar2, o oVar, com.google.firebase.installations.q.b bVar, m mVar) {
        this.f1667g = new Object();
        this.f1671k = new HashSet();
        this.l = new ArrayList();
        this.a = hVar;
        this.b = cVar;
        this.c = cVar2;
        this.f1664d = oVar;
        this.f1665e = bVar;
        this.f1666f = mVar;
        this.f1668h = executorService;
        this.f1669i = new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), n);
    }

    private void A(com.google.firebase.installations.q.d dVar) {
        synchronized (this.f1667g) {
            Iterator<n> it = this.l.iterator();
            while (it.hasNext()) {
                if (it.next().b(dVar)) {
                    it.remove();
                }
            }
        }
    }

    private synchronized void B(String str) {
        this.f1670j = str;
    }

    private synchronized void C(com.google.firebase.installations.q.d dVar, com.google.firebase.installations.q.d dVar2) {
        if (this.f1671k.size() != 0 && !dVar.d().equals(dVar2.d())) {
            for (com.google.firebase.installations.p.a aVar : this.f1671k) {
                aVar.a(dVar2.d());
            }
        }
    }

    private i<l> c() {
        f.b.a.b.g.j jVar = new f.b.a.b.g.j();
        e(new j(this.f1664d, jVar));
        return jVar.a();
    }

    private i<String> d() {
        f.b.a.b.g.j jVar = new f.b.a.b.g.j();
        e(new k(jVar));
        return jVar.a();
    }

    private void e(n nVar) {
        synchronized (this.f1667g) {
            this.l.add(nVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004a  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void q(boolean z) {
        com.google.firebase.installations.q.d dVar;
        Exception iOException;
        com.google.firebase.installations.q.d m2 = m();
        try {
            if (!m2.i() && !m2.l()) {
                if (!z && !this.f1664d.f(m2)) {
                    return;
                }
                dVar = h(m2);
                p(dVar);
                C(m2, dVar);
                if (dVar.k()) {
                    B(dVar.d());
                }
                if (!dVar.i()) {
                    iOException = new i(i.a.BAD_CONFIG);
                } else if (dVar.j()) {
                    iOException = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request.");
                } else {
                    A(dVar);
                    return;
                }
                z(iOException);
            }
            dVar = y(m2);
            p(dVar);
            C(m2, dVar);
            if (dVar.k()) {
            }
            if (!dVar.i()) {
            }
            z(iOException);
        } catch (i e2) {
            z(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final void u(final boolean z) {
        com.google.firebase.installations.q.d n2 = n();
        if (z) {
            n2 = n2.p();
        }
        A(n2);
        this.f1669i.execute(new Runnable() { // from class: com.google.firebase.installations.a
            @Override // java.lang.Runnable
            public final void run() {
                g.this.r(z);
            }
        });
    }

    private com.google.firebase.installations.q.d h(com.google.firebase.installations.q.d dVar) {
        f e2 = this.b.e(i(), dVar.d(), o(), dVar.f());
        int i2 = b.b[e2.b().ordinal()];
        if (i2 == 1) {
            return dVar.o(e2.c(), e2.d(), this.f1664d.b());
        }
        if (i2 == 2) {
            return dVar.q("BAD CONFIG");
        }
        if (i2 == 3) {
            B(null);
            return dVar.r();
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    private synchronized String k() {
        return this.f1670j;
    }

    public static g l(h hVar) {
        p.b(hVar != null, "Null is not a valid value of FirebaseApp.");
        return (g) hVar.h(h.class);
    }

    private com.google.firebase.installations.q.d m() {
        com.google.firebase.installations.q.d d2;
        synchronized (m) {
            f a2 = f.a(this.a.j(), "generatefid.lock");
            d2 = this.c.d();
            if (a2 != null) {
                a2.b();
            }
        }
        return d2;
    }

    private com.google.firebase.installations.q.d n() {
        com.google.firebase.installations.q.d d2;
        synchronized (m) {
            f a2 = f.a(this.a.j(), "generatefid.lock");
            d2 = this.c.d();
            if (d2.j()) {
                String x = x(d2);
                com.google.firebase.installations.q.c cVar = this.c;
                d2 = d2.t(x);
                cVar.b(d2);
            }
            if (a2 != null) {
                a2.b();
            }
        }
        return d2;
    }

    private void p(com.google.firebase.installations.q.d dVar) {
        synchronized (m) {
            f a2 = f.a(this.a.j(), "generatefid.lock");
            this.c.b(dVar);
            if (a2 != null) {
                a2.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ void t() {
        u(false);
    }

    private void w() {
        p.f(j(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.f(o(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.f(i(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.b(o.h(j()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
        p.b(o.g(i()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    }

    private String x(com.google.firebase.installations.q.d dVar) {
        if ((!this.a.n().equals("CHIME_ANDROID_SDK") && !this.a.v()) || !dVar.m()) {
            return this.f1666f.a();
        }
        String f2 = this.f1665e.f();
        return TextUtils.isEmpty(f2) ? this.f1666f.a() : f2;
    }

    private com.google.firebase.installations.q.d y(com.google.firebase.installations.q.d dVar) {
        d d2 = this.b.d(i(), dVar.d(), o(), j(), (dVar.d() == null || dVar.d().length() != 11) ? null : this.f1665e.i());
        int i2 = b.a[d2.e().ordinal()];
        if (i2 == 1) {
            return dVar.s(d2.c(), d2.d(), this.f1664d.b(), d2.b().c(), d2.b().d());
        }
        if (i2 == 2) {
            return dVar.q("BAD CONFIG");
        }
        throw new i("Firebase Installations Service is unavailable. Please try again later.", i.a.UNAVAILABLE);
    }

    private void z(Exception exc) {
        synchronized (this.f1667g) {
            Iterator<n> it = this.l.iterator();
            while (it.hasNext()) {
                if (it.next().a(exc)) {
                    it.remove();
                }
            }
        }
    }

    @Override // com.google.firebase.installations.h
    public f.b.a.b.g.i<String> a() {
        w();
        String k2 = k();
        if (k2 != null) {
            return l.e(k2);
        }
        f.b.a.b.g.i<String> d2 = d();
        this.f1668h.execute(new Runnable() { // from class: com.google.firebase.installations.b
            @Override // java.lang.Runnable
            public final void run() {
                g.this.t();
            }
        });
        return d2;
    }

    @Override // com.google.firebase.installations.h
    public f.b.a.b.g.i<l> b(final boolean z) {
        w();
        f.b.a.b.g.i<l> c = c();
        this.f1668h.execute(new Runnable() { // from class: com.google.firebase.installations.c
            @Override // java.lang.Runnable
            public final void run() {
                g.this.v(z);
            }
        });
        return c;
    }

    String i() {
        return this.a.o().b();
    }

    String j() {
        return this.a.o().c();
    }

    String o() {
        return this.a.o().g();
    }
}
