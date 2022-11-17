package com.google.firebase.crashlytics.i.j;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.crashlytics.i.k.e;
import com.google.firebase.crashlytics.i.n.f;
import com.google.firebase.h;
import f.b.a.b.g.i;
import f.b.a.b.g.l;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public class q {
    private final Context a;
    private final w b;

    /* renamed from: e  reason: collision with root package name */
    private r f1412e;

    /* renamed from: f  reason: collision with root package name */
    private r f1413f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1414g;

    /* renamed from: h  reason: collision with root package name */
    private p f1415h;

    /* renamed from: i  reason: collision with root package name */
    private final a0 f1416i;

    /* renamed from: j  reason: collision with root package name */
    private final f f1417j;

    /* renamed from: k  reason: collision with root package name */
    public final com.google.firebase.crashlytics.i.i.b f1418k;
    private final com.google.firebase.crashlytics.i.h.a l;
    private final ExecutorService m;
    private final o n;
    private final com.google.firebase.crashlytics.i.c o;

    /* renamed from: d  reason: collision with root package name */
    private final long f1411d = System.currentTimeMillis();
    private final f0 c = new f0();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Callable<i<Void>> {
        final /* synthetic */ com.google.firebase.crashlytics.i.p.i a;

        a(com.google.firebase.crashlytics.i.p.i iVar) {
            this.a = iVar;
        }

        /* renamed from: a */
        public i<Void> call() {
            return q.this.i(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.i.p.i f1419e;

        b(com.google.firebase.crashlytics.i.p.i iVar) {
            this.f1419e = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            q.this.i(this.f1419e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Callable<Boolean> {
        c() {
        }

        /* renamed from: a */
        public Boolean call() {
            try {
                boolean d2 = q.this.f1412e.d();
                if (!d2) {
                    com.google.firebase.crashlytics.i.f.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d2);
            } catch (Exception e2) {
                com.google.firebase.crashlytics.i.f.f().e("Problem encountered deleting Crashlytics initialization marker.", e2);
                return Boolean.FALSE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements Callable<Boolean> {
        d() {
        }

        /* renamed from: a */
        public Boolean call() {
            return Boolean.valueOf(q.this.f1415h.t());
        }
    }

    public q(h hVar, a0 a0Var, com.google.firebase.crashlytics.i.c cVar, w wVar, com.google.firebase.crashlytics.i.i.b bVar, com.google.firebase.crashlytics.i.h.a aVar, f fVar, ExecutorService executorService) {
        this.b = wVar;
        this.a = hVar.j();
        this.f1416i = a0Var;
        this.o = cVar;
        this.f1418k = bVar;
        this.l = aVar;
        this.m = executorService;
        this.f1417j = fVar;
        this.n = new o(executorService);
    }

    private void d() {
        boolean z;
        try {
            z = Boolean.TRUE.equals((Boolean) i0.a(this.n.h(new d())));
        } catch (Exception unused) {
            z = false;
        }
        this.f1414g = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i<Void> i(com.google.firebase.crashlytics.i.p.i iVar) {
        r();
        try {
            this.f1418k.a(new com.google.firebase.crashlytics.i.i.a() { // from class: com.google.firebase.crashlytics.i.j.b
            });
            if (!iVar.b().b.a) {
                com.google.firebase.crashlytics.i.f.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return l.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f1415h.A(iVar)) {
                com.google.firebase.crashlytics.i.f.f().k("Previous sessions could not be finalized.");
            }
            return this.f1415h.U(iVar.a());
        } catch (Exception e2) {
            com.google.firebase.crashlytics.i.f.f().e("Crashlytics encountered a problem during asynchronous initialization.", e2);
            return l.d(e2);
        } finally {
            q();
        }
    }

    private void k(com.google.firebase.crashlytics.i.p.i iVar) {
        Throwable e2;
        String str;
        com.google.firebase.crashlytics.i.f fVar;
        Future<?> submit = this.m.submit(new b(iVar));
        com.google.firebase.crashlytics.i.f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(4L, TimeUnit.SECONDS);
        } catch (InterruptedException e3) {
            e2 = e3;
            fVar = com.google.firebase.crashlytics.i.f.f();
            str = "Crashlytics was interrupted during initialization.";
            fVar.e(str, e2);
        } catch (ExecutionException e4) {
            e2 = e4;
            fVar = com.google.firebase.crashlytics.i.f.f();
            str = "Crashlytics encountered a problem during initialization.";
            fVar.e(str, e2);
        } catch (TimeoutException e5) {
            e2 = e5;
            fVar = com.google.firebase.crashlytics.i.f.f();
            str = "Crashlytics timed out during initialization.";
            fVar.e(str, e2);
        }
    }

    public static String l() {
        return "18.2.10";
    }

    static boolean m(String str, boolean z) {
        if (!z) {
            com.google.firebase.crashlytics.i.f.f().i("Configured not to require a build ID.");
            return true;
        } else if (!TextUtils.isEmpty(str)) {
            return true;
        } else {
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".     |  | ");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".   \\ |  | /");
            Log.e("FirebaseCrashlytics", ".    \\    /");
            Log.e("FirebaseCrashlytics", ".     \\  /");
            Log.e("FirebaseCrashlytics", ".      \\/");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
            Log.e("FirebaseCrashlytics", ".");
            Log.e("FirebaseCrashlytics", ".      /\\");
            Log.e("FirebaseCrashlytics", ".     /  \\");
            Log.e("FirebaseCrashlytics", ".    /    \\");
            Log.e("FirebaseCrashlytics", ".   / |  | \\");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".     |  |");
            Log.e("FirebaseCrashlytics", ".");
            return false;
        }
    }

    public i<Boolean> e() {
        return this.f1415h.n();
    }

    public i<Void> f() {
        return this.f1415h.s();
    }

    public boolean g() {
        return this.f1414g;
    }

    boolean h() {
        return this.f1412e.c();
    }

    public i<Void> j(com.google.firebase.crashlytics.i.p.i iVar) {
        return i0.b(this.m, new a(iVar));
    }

    public void n(String str) {
        this.f1415h.Y(System.currentTimeMillis() - this.f1411d, str);
    }

    public void o(Throwable th) {
        this.f1415h.X(Thread.currentThread(), th);
    }

    public void p(Throwable th) {
        com.google.firebase.crashlytics.i.f f2 = com.google.firebase.crashlytics.i.f.f();
        f2.b("Recorded on-demand fatal events: " + this.c.b());
        com.google.firebase.crashlytics.i.f f3 = com.google.firebase.crashlytics.i.f.f();
        f3.b("Dropped on-demand fatal events: " + this.c.a());
        this.f1415h.S("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(this.c.b()));
        this.f1415h.S("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(this.c.a()));
        this.f1415h.O(Thread.currentThread(), th);
    }

    void q() {
        this.n.h(new c());
    }

    void r() {
        this.n.b();
        this.f1412e.a();
        com.google.firebase.crashlytics.i.f.f().i("Initialization marker file was created.");
    }

    public boolean s(h hVar, com.google.firebase.crashlytics.i.p.i iVar) {
        if (m(hVar.b, n.k(this.a, "com.crashlytics.RequireBuildId", true))) {
            String mVar = new m(this.f1416i).toString();
            try {
                f fVar = this.f1417j;
                this.f1413f = new r("crash_marker", fVar);
                this.f1412e = new r("initialization_marker", fVar);
                com.google.firebase.crashlytics.i.k.i iVar2 = new com.google.firebase.crashlytics.i.k.i(mVar, fVar, this.n);
                e eVar = new e(this.f1417j);
                this.f1415h = new p(this.a, this.n, this.f1416i, this.b, this.f1417j, this.f1413f, hVar, iVar2, eVar, g0.e(this.a, this.f1416i, this.f1417j, hVar, eVar, iVar2, new com.google.firebase.crashlytics.i.q.a(1024, new com.google.firebase.crashlytics.i.q.c(10)), iVar, this.c), this.o, this.l);
                boolean h2 = h();
                d();
                this.f1415h.y(mVar, Thread.getDefaultUncaughtExceptionHandler(), iVar);
                if (!h2 || !n.c(this.a)) {
                    com.google.firebase.crashlytics.i.f.f().b("Successfully configured exception handler.");
                    return true;
                }
                com.google.firebase.crashlytics.i.f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                k(iVar);
                return false;
            } catch (Exception e2) {
                com.google.firebase.crashlytics.i.f.f().e("Crashlytics was not started due to an exception during initialization", e2);
                this.f1415h = null;
                return false;
            }
        } else {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when Crashlytics tooling is absent from your app's build configuration. Please review Crashlytics onboarding instructions and ensure you have a valid Crashlytics account.");
        }
    }

    public i<Void> t() {
        return this.f1415h.Q();
    }

    public void u(Boolean bool) {
        this.b.g(bool);
    }

    public void v(String str, String str2) {
        this.f1415h.R(str, str2);
    }

    public void w(String str) {
        this.f1415h.T(str);
    }
}
