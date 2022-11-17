package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.p;
import com.google.firebase.h;
import com.google.firebase.iid.a.a;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.c1;
import com.google.firebase.messaging.y0;
import com.google.firebase.o.a;
import com.google.firebase.o.b;
import com.google.firebase.o.d;
import com.google.firebase.p.k;
import f.b.a.a.g;
import f.b.a.b.g.f;
import f.b.a.b.g.i;
import f.b.a.b.g.j;
import f.b.a.b.g.l;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class FirebaseMessaging {
    private static final long m = TimeUnit.HOURS.toSeconds(8);
    private static c1 n;
    @SuppressLint({"FirebaseUnknownNullness"})
    static g o;
    static ScheduledExecutorService p;
    private final h a;
    private final com.google.firebase.iid.a.a b;
    private final com.google.firebase.installations.h c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f1714d;

    /* renamed from: e  reason: collision with root package name */
    private final o0 f1715e;

    /* renamed from: f  reason: collision with root package name */
    private final y0 f1716f;

    /* renamed from: g  reason: collision with root package name */
    private final a f1717g;

    /* renamed from: h  reason: collision with root package name */
    private final Executor f1718h;

    /* renamed from: i  reason: collision with root package name */
    private final i<g1> f1719i;

    /* renamed from: j  reason: collision with root package name */
    private final r0 f1720j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f1721k;
    private final Application.ActivityLifecycleCallbacks l;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a {
        private final d a;
        private boolean b;
        private b<com.google.firebase.g> c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f1722d;

        a(d dVar) {
            this.a = dVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ void d(com.google.firebase.o.a aVar) {
            if (b()) {
                FirebaseMessaging.this.L();
            }
        }

        private Boolean e() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context j2 = FirebaseMessaging.this.a.j();
            SharedPreferences sharedPreferences = j2.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = j2.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(j2.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        synchronized void a() {
            if (!this.b) {
                Boolean e2 = e();
                this.f1722d = e2;
                if (e2 == null) {
                    b<com.google.firebase.g> lVar = new b() { // from class: com.google.firebase.messaging.l
                        @Override // com.google.firebase.o.b
                        public final void a(a aVar) {
                            FirebaseMessaging.a.this.d(aVar);
                        }
                    };
                    this.c = lVar;
                    this.a.a(com.google.firebase.g.class, lVar);
                }
                this.b = true;
            }
        }

        synchronized boolean b() {
            Boolean bool;
            a();
            bool = this.f1722d;
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.a.u();
        }

        synchronized void f(boolean z) {
            a();
            b<com.google.firebase.g> bVar = this.c;
            if (bVar != null) {
                this.a.c(com.google.firebase.g.class, bVar);
                this.c = null;
            }
            SharedPreferences.Editor edit = FirebaseMessaging.this.a.j().getSharedPreferences("com.google.firebase.messaging", 0).edit();
            edit.putBoolean("auto_init", z);
            edit.apply();
            if (z) {
                FirebaseMessaging.this.L();
            }
            this.f1722d = Boolean.valueOf(z);
        }
    }

    FirebaseMessaging(h hVar, com.google.firebase.iid.a.a aVar, com.google.firebase.installations.h hVar2, g gVar, d dVar, r0 r0Var, o0 o0Var, Executor executor, Executor executor2) {
        this.f1721k = false;
        o = gVar;
        this.a = hVar;
        this.b = aVar;
        this.c = hVar2;
        this.f1717g = new a(dVar);
        Context j2 = hVar.j();
        this.f1714d = j2;
        n0 n0Var = new n0();
        this.l = n0Var;
        this.f1720j = r0Var;
        this.f1715e = o0Var;
        this.f1716f = new y0(executor);
        this.f1718h = executor2;
        Context j3 = hVar.j();
        if (j3 instanceof Application) {
            ((Application) j3).registerActivityLifecycleCallbacks(n0Var);
        } else {
            Log.w("FirebaseMessaging", "Context " + j3 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (aVar != null) {
            aVar.b(new a.AbstractC0050a() { // from class: com.google.firebase.messaging.o
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.q
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.A();
            }
        });
        i<g1> e2 = g1.e(this, r0Var, o0Var, j2, m0.e());
        this.f1719i = e2;
        e2.e(executor2, new f() { // from class: com.google.firebase.messaging.p
            @Override // f.b.a.b.g.f
            public final void d(Object obj) {
                FirebaseMessaging.this.C((g1) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.k
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.E();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FirebaseMessaging(h hVar, com.google.firebase.iid.a.a aVar, com.google.firebase.q.b<com.google.firebase.s.i> bVar, com.google.firebase.q.b<k> bVar2, com.google.firebase.installations.h hVar2, g gVar, d dVar) {
        this(hVar, aVar, bVar, bVar2, hVar2, gVar, dVar, new r0(hVar.j()));
    }

    FirebaseMessaging(h hVar, com.google.firebase.iid.a.a aVar, com.google.firebase.q.b<com.google.firebase.s.i> bVar, com.google.firebase.q.b<k> bVar2, com.google.firebase.installations.h hVar2, g gVar, d dVar, r0 r0Var) {
        this(hVar, aVar, hVar2, gVar, dVar, r0Var, new o0(hVar, r0Var, bVar, bVar2, hVar2), m0.d(), m0.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: B */
    public /* synthetic */ void C(g1 g1Var) {
        if (n()) {
            g1Var.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public /* synthetic */ void E() {
        u0.b(this.f1714d);
    }

    private synchronized void K() {
        if (!this.f1721k) {
            N(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        com.google.firebase.iid.a.a aVar = this.b;
        if (aVar != null) {
            aVar.d();
        } else if (O(k())) {
            K();
        }
    }

    public static synchronized FirebaseMessaging g() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(h.l());
        }
        return firebaseMessaging;
    }

    @Keep
    static synchronized FirebaseMessaging getInstance(h hVar) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) hVar.h(FirebaseMessaging.class);
            p.j(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    private static synchronized c1 h(Context context) {
        c1 c1Var;
        synchronized (FirebaseMessaging.class) {
            if (n == null) {
                n = new c1(context);
            }
            c1Var = n;
        }
        return c1Var;
    }

    private String i() {
        return "[DEFAULT]".equals(this.a.n()) ? "" : this.a.p();
    }

    public static g l() {
        return o;
    }

    private void m(String str) {
        if ("[DEFAULT]".equals(this.a.n())) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Invoking onNewToken for app: " + this.a.n());
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new l0(this.f1714d).g(intent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: p */
    public /* synthetic */ i q(final String str, final c1.a aVar) {
        return this.f1715e.e().p(x.f1843e, new f.b.a.b.g.h() { // from class: com.google.firebase.messaging.j
            @Override // f.b.a.b.g.h
            public final i a(Object obj) {
                return FirebaseMessaging.this.s(str, aVar, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public /* synthetic */ i s(String str, c1.a aVar, String str2) {
        h(this.f1714d).g(i(), str, str2, this.f1720j.a());
        if (aVar == null || !str2.equals(aVar.a)) {
            m(str2);
        }
        return l.e(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ void u(j jVar) {
        try {
            this.b.a(r0.c(this.a), "FCM");
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void w(j jVar) {
        try {
            l.a(this.f1715e.b());
            h(this.f1714d).d(i(), r0.c(this.a));
            jVar.c(null);
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public /* synthetic */ void y(j jVar) {
        try {
            jVar.c(c());
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z */
    public /* synthetic */ void A() {
        if (n()) {
            L();
        }
    }

    public void H(w0 w0Var) {
        if (!TextUtils.isEmpty(w0Var.k())) {
            Intent intent = new Intent("com.google.android.gcm.intent.SEND");
            Intent intent2 = new Intent();
            intent2.setPackage("com.google.example.invalidpackage");
            intent.putExtra("app", PendingIntent.getBroadcast(this.f1714d, 0, intent2, Build.VERSION.SDK_INT >= 23 ? 67108864 : 0));
            intent.setPackage("com.google.android.gms");
            w0Var.m(intent);
            this.f1714d.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
            return;
        }
        throw new IllegalArgumentException("Missing 'to'");
    }

    public void I(boolean z) {
        this.f1717g.f(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void J(boolean z) {
        this.f1721k = z;
    }

    public i<Void> M(final String str) {
        return this.f1719i.o(new f.b.a.b.g.h() { // from class: com.google.firebase.messaging.t
            @Override // f.b.a.b.g.h
            public final i a(Object obj) {
                i q;
                q = ((g1) obj).q(str);
                return q;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public synchronized void N(long j2) {
        e(new d1(this, Math.min(Math.max(30L, 2 * j2), m)), j2);
        this.f1721k = true;
    }

    boolean O(c1.a aVar) {
        return aVar == null || aVar.b(this.f1720j.a());
    }

    public i<Void> P(final String str) {
        return this.f1719i.o(new f.b.a.b.g.h() { // from class: com.google.firebase.messaging.m
            @Override // f.b.a.b.g.h
            public final i a(Object obj) {
                i t;
                t = ((g1) obj).t(str);
                return t;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        com.google.firebase.iid.a.a aVar = this.b;
        if (aVar != null) {
            try {
                return (String) l.a(aVar.c());
            } catch (InterruptedException | ExecutionException e2) {
                throw new IOException(e2);
            }
        } else {
            final c1.a k2 = k();
            if (!O(k2)) {
                return k2.a;
            }
            final String c = r0.c(this.a);
            try {
                return (String) l.a(this.f1716f.a(c, new y0.a() { // from class: com.google.firebase.messaging.i
                    @Override // com.google.firebase.messaging.y0.a
                    public final f.b.a.b.g.i start() {
                        return FirebaseMessaging.this.q(c, k2);
                    }
                }));
            } catch (InterruptedException | ExecutionException e3) {
                throw new IOException(e3);
            }
        }
    }

    public i<Void> d() {
        if (this.b != null) {
            final j jVar = new j();
            this.f1718h.execute(new Runnable() { // from class: com.google.firebase.messaging.n
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.this.u(jVar);
                }
            });
            return jVar.a();
        } else if (k() == null) {
            return l.e(null);
        } else {
            final j jVar2 = new j();
            m0.c().execute(new Runnable() { // from class: com.google.firebase.messaging.s
                @Override // java.lang.Runnable
                public final void run() {
                    FirebaseMessaging.this.w(jVar2);
                }
            });
            return jVar2.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Runnable runnable, long j2) {
        synchronized (FirebaseMessaging.class) {
            if (p == null) {
                p = new ScheduledThreadPoolExecutor(1, new com.google.android.gms.common.util.n.b("TAG"));
            }
            p.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Context f() {
        return this.f1714d;
    }

    public i<String> j() {
        com.google.firebase.iid.a.a aVar = this.b;
        if (aVar != null) {
            return aVar.c();
        }
        final j jVar = new j();
        this.f1718h.execute(new Runnable() { // from class: com.google.firebase.messaging.r
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.y(jVar);
            }
        });
        return jVar.a();
    }

    c1.a k() {
        return h(this.f1714d).e(i(), r0.c(this.a));
    }

    public boolean n() {
        return this.f1717g.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean o() {
        return this.f1720j.g();
    }
}
