package com.google.firebase.crashlytics.i.j;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import com.google.firebase.crashlytics.i.j.u;
import com.google.firebase.crashlytics.i.k.i;
import com.google.firebase.crashlytics.i.l.c0;
import f.b.a.b.g.j;
import f.b.a.b.g.l;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class p {
    static final FilenameFilter s = com.google.firebase.crashlytics.i.j.a.a;
    private final Context a;
    private final w b;
    private final r c;

    /* renamed from: d  reason: collision with root package name */
    private final i f1396d;

    /* renamed from: e  reason: collision with root package name */
    private final o f1397e;

    /* renamed from: f  reason: collision with root package name */
    private final a0 f1398f;

    /* renamed from: g  reason: collision with root package name */
    private final com.google.firebase.crashlytics.i.n.f f1399g;

    /* renamed from: h  reason: collision with root package name */
    private final com.google.firebase.crashlytics.i.j.h f1400h;

    /* renamed from: i  reason: collision with root package name */
    private final com.google.firebase.crashlytics.i.k.e f1401i;

    /* renamed from: j  reason: collision with root package name */
    private final com.google.firebase.crashlytics.i.c f1402j;

    /* renamed from: k  reason: collision with root package name */
    private final com.google.firebase.crashlytics.i.h.a f1403k;
    private final g0 l;
    private u m;
    private com.google.firebase.crashlytics.i.p.i n = null;
    final j<Boolean> o = new j<>();
    final j<Boolean> p = new j<>();
    final j<Void> q = new j<>();
    final AtomicBoolean r = new AtomicBoolean(false);

    /* loaded from: classes.dex */
    class a implements u.a {
        a() {
        }

        @Override // com.google.firebase.crashlytics.i.j.u.a
        public void a(com.google.firebase.crashlytics.i.p.i iVar, Thread thread, Throwable th) {
            p.this.H(iVar, thread, th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Callable<f.b.a.b.g.i<Void>> {
        final /* synthetic */ long a;
        final /* synthetic */ Throwable b;
        final /* synthetic */ Thread c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ com.google.firebase.crashlytics.i.p.i f1404d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ boolean f1405e;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements f.b.a.b.g.h<com.google.firebase.crashlytics.i.p.d, Void> {
            final /* synthetic */ Executor a;
            final /* synthetic */ String b;

            a(Executor executor, String str) {
                this.a = executor;
                this.b = str;
            }

            /* renamed from: b */
            public f.b.a.b.g.i<Void> a(com.google.firebase.crashlytics.i.p.d dVar) {
                String str = null;
                if (dVar == null) {
                    com.google.firebase.crashlytics.i.f.f().k("Received null app settings, cannot send reports at crash time.");
                    return l.e(null);
                }
                f.b.a.b.g.i[] iVarArr = new f.b.a.b.g.i[2];
                iVarArr[0] = p.this.N();
                g0 g0Var = p.this.l;
                Executor executor = this.a;
                if (b.this.f1405e) {
                    str = this.b;
                }
                iVarArr[1] = g0Var.v(executor, str);
                return l.g(iVarArr);
            }
        }

        b(long j2, Throwable th, Thread thread, com.google.firebase.crashlytics.i.p.i iVar, boolean z) {
            this.a = j2;
            this.b = th;
            this.c = thread;
            this.f1404d = iVar;
            this.f1405e = z;
        }

        /* renamed from: a */
        public f.b.a.b.g.i<Void> call() {
            long G = p.G(this.a);
            String D = p.this.D();
            if (D == null) {
                com.google.firebase.crashlytics.i.f.f().d("Tried to write a fatal exception while no session was open.");
                return l.e(null);
            }
            p.this.c.a();
            p.this.l.q(this.b, this.c, D, G);
            p.this.x(this.a);
            p.this.u(this.f1404d);
            p.this.w(new m(p.this.f1398f).toString());
            if (!p.this.b.d()) {
                return l.e(null);
            }
            Executor c = p.this.f1397e.c();
            return this.f1404d.a().p(c, new a(c, D));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements f.b.a.b.g.h<Void, Boolean> {
        c(p pVar) {
        }

        /* renamed from: b */
        public f.b.a.b.g.i<Boolean> a(Void r1) {
            return l.e(Boolean.TRUE);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements f.b.a.b.g.h<Boolean, Void> {
        final /* synthetic */ f.b.a.b.g.i a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a implements Callable<f.b.a.b.g.i<Void>> {
            final /* synthetic */ Boolean a;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: com.google.firebase.crashlytics.i.j.p$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public class C0031a implements f.b.a.b.g.h<com.google.firebase.crashlytics.i.p.d, Void> {
                final /* synthetic */ Executor a;

                C0031a(Executor executor) {
                    this.a = executor;
                }

                /* renamed from: b */
                public f.b.a.b.g.i<Void> a(com.google.firebase.crashlytics.i.p.d dVar) {
                    if (dVar == null) {
                        com.google.firebase.crashlytics.i.f.f().k("Received null app settings at app startup. Cannot send cached reports");
                    } else {
                        p.this.N();
                        p.this.l.u(this.a);
                        p.this.q.e(null);
                    }
                    return l.e(null);
                }
            }

            a(Boolean bool) {
                this.a = bool;
            }

            /* renamed from: a */
            public f.b.a.b.g.i<Void> call() {
                if (!this.a.booleanValue()) {
                    com.google.firebase.crashlytics.i.f.f().i("Deleting cached crash reports...");
                    p.r(p.this.L());
                    p.this.l.t();
                    p.this.q.e(null);
                    return l.e(null);
                }
                com.google.firebase.crashlytics.i.f.f().b("Sending cached crash reports...");
                p.this.b.c(this.a.booleanValue());
                Executor c = p.this.f1397e.c();
                return d.this.a.p(c, new C0031a(c));
            }
        }

        d(f.b.a.b.g.i iVar) {
            this.a = iVar;
        }

        /* renamed from: b */
        public f.b.a.b.g.i<Void> a(Boolean bool) {
            return p.this.f1397e.i(new a(bool));
        }
    }

    /* loaded from: classes.dex */
    class e implements Callable<Void> {
        final /* synthetic */ long a;
        final /* synthetic */ String b;

        e(long j2, String str) {
            this.a = j2;
            this.b = str;
        }

        /* renamed from: a */
        public Void call() {
            if (p.this.J()) {
                return null;
            }
            p.this.f1401i.g(this.a, this.b);
            return null;
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ long f1407e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ Throwable f1408f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Thread f1409g;

        f(long j2, Throwable th, Thread thread) {
            this.f1407e = j2;
            this.f1408f = th;
            this.f1409g = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!p.this.J()) {
                long G = p.G(this.f1407e);
                String D = p.this.D();
                if (D == null) {
                    com.google.firebase.crashlytics.i.f.f().k("Tried to write a non-fatal exception while no session was open.");
                } else {
                    p.this.l.r(this.f1408f, this.f1409g, D, G);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class g implements Callable<Void> {
        final /* synthetic */ String a;

        g(String str) {
            this.a = str;
        }

        /* renamed from: a */
        public Void call() {
            p.this.w(this.a);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class h implements Callable<Void> {
        final /* synthetic */ long a;

        h(long j2) {
            this.a = j2;
        }

        /* renamed from: a */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.a);
            p.this.f1403k.a("_ae", bundle);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Context context, o oVar, a0 a0Var, w wVar, com.google.firebase.crashlytics.i.n.f fVar, r rVar, com.google.firebase.crashlytics.i.j.h hVar, i iVar, com.google.firebase.crashlytics.i.k.e eVar, g0 g0Var, com.google.firebase.crashlytics.i.c cVar, com.google.firebase.crashlytics.i.h.a aVar) {
        this.a = context;
        this.f1397e = oVar;
        this.f1398f = a0Var;
        this.b = wVar;
        this.f1399g = fVar;
        this.c = rVar;
        this.f1400h = hVar;
        this.f1396d = iVar;
        this.f1401i = eVar;
        this.f1402j = cVar;
        this.f1403k = aVar;
        this.l = g0Var;
    }

    private static boolean B() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private Context C() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String D() {
        SortedSet<String> m = this.l.m();
        if (!m.isEmpty()) {
            return m.first();
        }
        return null;
    }

    private static long E() {
        return G(System.currentTimeMillis());
    }

    static List<d0> F(com.google.firebase.crashlytics.i.g gVar, String str, com.google.firebase.crashlytics.i.n.f fVar, byte[] bArr) {
        File n = fVar.n(str, "user-data");
        File n2 = fVar.n(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new l("logs_file", "logs", bArr));
        arrayList.add(new z("crash_meta_file", "metadata", gVar.e()));
        arrayList.add(new z("session_meta_file", "session", gVar.d()));
        arrayList.add(new z("app_meta_file", "app", gVar.a()));
        arrayList.add(new z("device_meta_file", "device", gVar.f()));
        arrayList.add(new z("os_meta_file", "os", gVar.b()));
        arrayList.add(new z("minidump_file", "minidump", gVar.c()));
        arrayList.add(new z("user_meta_file", "user", n));
        arrayList.add(new z("keys_file", "keys", n2));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long G(long j2) {
        return j2 / 1000;
    }

    private f.b.a.b.g.i<Void> M(long j2) {
        if (B()) {
            com.google.firebase.crashlytics.i.f.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return l.e(null);
        }
        com.google.firebase.crashlytics.i.f.f().b("Logging app exception event to Firebase Analytics");
        return l.c(new ScheduledThreadPoolExecutor(1), new h(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public f.b.a.b.g.i<Void> N() {
        ArrayList arrayList = new ArrayList();
        for (File file : L()) {
            try {
                arrayList.add(M(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                com.google.firebase.crashlytics.i.f f2 = com.google.firebase.crashlytics.i.f.f();
                f2.k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return l.f(arrayList);
    }

    private f.b.a.b.g.i<Boolean> V() {
        Boolean bool = Boolean.TRUE;
        if (this.b.d()) {
            com.google.firebase.crashlytics.i.f.f().b("Automatic data collection is enabled. Allowing upload.");
            this.o.e(Boolean.FALSE);
            return l.e(bool);
        }
        com.google.firebase.crashlytics.i.f.f().b("Automatic data collection is disabled.");
        com.google.firebase.crashlytics.i.f.f().i("Notifying that unsent reports are available.");
        this.o.e(bool);
        f.b.a.b.g.i<TContinuationResult> o = this.b.i().o(new c(this));
        com.google.firebase.crashlytics.i.f.f().b("Waiting for send/deleteUnsentReports to be called.");
        return i0.f(o, this.p.a());
    }

    private void W(String str) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons.size() != 0) {
                this.l.s(str, historicalProcessExitReasons, new com.google.firebase.crashlytics.i.k.e(this.f1399g, str), i.i(str, this.f1399g, this.f1397e));
                return;
            }
            com.google.firebase.crashlytics.i.f f2 = com.google.firebase.crashlytics.i.f.f();
            f2.i("No ApplicationExitInfo available. Session: " + str);
            return;
        }
        com.google.firebase.crashlytics.i.f f3 = com.google.firebase.crashlytics.i.f.f();
        f3.i("ANR feature enabled, but device is API " + i2);
    }

    private static c0.a o(a0 a0Var, com.google.firebase.crashlytics.i.j.h hVar) {
        return c0.a.b(a0Var.f(), hVar.f1382e, hVar.f1383f, a0Var.a(), x.a(hVar.c).c(), hVar.f1384g);
    }

    private static c0.b p(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return c0.b.c(n.l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), n.s(), statFs.getBlockCount() * statFs.getBlockSize(), n.y(context), n.m(context), Build.MANUFACTURER, Build.PRODUCT);
    }

    private static c0.c q(Context context) {
        return c0.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, n.z(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void r(List<File> list) {
        for (File file : list) {
            file.delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void v(boolean z, com.google.firebase.crashlytics.i.p.i iVar) {
        ArrayList arrayList = new ArrayList(this.l.m());
        if (arrayList.size() <= z) {
            com.google.firebase.crashlytics.i.f.f().i("No open sessions to be closed.");
            return;
        }
        String str = (String) arrayList.get(z ? 1 : 0);
        if (iVar.b().b.b) {
            W(str);
        } else {
            com.google.firebase.crashlytics.i.f.f().i("ANR feature disabled.");
        }
        if (this.f1402j.b(str)) {
            z(str);
        }
        String str2 = null;
        if (z != 0) {
            str2 = (String) arrayList.get(0);
        }
        this.l.g(E(), str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(String str) {
        long E = E();
        com.google.firebase.crashlytics.i.f f2 = com.google.firebase.crashlytics.i.f.f();
        f2.b("Opening a new session with ID " + str);
        this.f1402j.d(str, String.format(Locale.US, "Crashlytics Android SDK/%s", q.l()), E, c0.b(o(this.f1398f, this.f1400h), q(C()), p(C())));
        this.f1401i.e(str);
        this.l.n(str, E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(long j2) {
        try {
            com.google.firebase.crashlytics.i.n.f fVar = this.f1399g;
            if (!fVar.d(".ae" + j2).createNewFile()) {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e2) {
            com.google.firebase.crashlytics.i.f.f().l("Could not create app exception marker file.", e2);
        }
    }

    private void z(String str) {
        com.google.firebase.crashlytics.i.f f2 = com.google.firebase.crashlytics.i.f.f();
        f2.i("Finalizing native report for session " + str);
        com.google.firebase.crashlytics.i.g a2 = this.f1402j.a(str);
        File c2 = a2.c();
        if (c2 == null || !c2.exists()) {
            com.google.firebase.crashlytics.i.f f3 = com.google.firebase.crashlytics.i.f.f();
            f3.k("No minidump data found for session " + str);
            return;
        }
        long lastModified = c2.lastModified();
        com.google.firebase.crashlytics.i.k.e eVar = new com.google.firebase.crashlytics.i.k.e(this.f1399g, str);
        File h2 = this.f1399g.h(str);
        if (!h2.isDirectory()) {
            com.google.firebase.crashlytics.i.f.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        x(lastModified);
        List<d0> F = F(a2, str, this.f1399g, eVar.b());
        e0.b(h2, F);
        com.google.firebase.crashlytics.i.f.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.l.f(str, F);
        eVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean A(com.google.firebase.crashlytics.i.p.i iVar) {
        this.f1397e.b();
        if (J()) {
            com.google.firebase.crashlytics.i.f.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        com.google.firebase.crashlytics.i.f.f().i("Finalizing previously open sessions.");
        try {
            v(true, iVar);
            com.google.firebase.crashlytics.i.f.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e2) {
            com.google.firebase.crashlytics.i.f.f().e("Unable to finalize previously open sessions.", e2);
            return false;
        }
    }

    void H(com.google.firebase.crashlytics.i.p.i iVar, Thread thread, Throwable th) {
        I(iVar, thread, th, false);
    }

    synchronized void I(com.google.firebase.crashlytics.i.p.i iVar, Thread thread, Throwable th, boolean z) {
        com.google.firebase.crashlytics.i.f f2 = com.google.firebase.crashlytics.i.f.f();
        f2.b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            i0.a(this.f1397e.i(new b(System.currentTimeMillis(), th, thread, iVar, z)));
        } catch (TimeoutException unused) {
            com.google.firebase.crashlytics.i.f.f().d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e2) {
            com.google.firebase.crashlytics.i.f.f().e("Error handling uncaught exception", e2);
        }
    }

    boolean J() {
        u uVar = this.m;
        return uVar != null && uVar.a();
    }

    List<File> L() {
        return this.f1399g.e(s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O(Thread thread, Throwable th) {
        com.google.firebase.crashlytics.i.p.i iVar = this.n;
        if (iVar == null) {
            com.google.firebase.crashlytics.i.f.f().k("settingsProvider not set");
        } else {
            I(iVar, thread, th, true);
        }
    }

    void P(String str) {
        this.f1397e.h(new g(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f.b.a.b.g.i<Void> Q() {
        this.p.e(Boolean.TRUE);
        return this.q.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void R(String str, String str2) {
        try {
            this.f1396d.l(str, str2);
        } catch (IllegalArgumentException e2) {
            Context context = this.a;
            if (context == null || !n.w(context)) {
                com.google.firebase.crashlytics.i.f.f().d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void S(String str, String str2) {
        try {
            this.f1396d.m(str, str2);
        } catch (IllegalArgumentException e2) {
            Context context = this.a;
            if (context == null || !n.w(context)) {
                com.google.firebase.crashlytics.i.f.f().d("Attempting to set custom attribute with null key, ignoring.");
                return;
            }
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void T(String str) {
        this.f1396d.n(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f.b.a.b.g.i<Void> U(f.b.a.b.g.i<com.google.firebase.crashlytics.i.p.d> iVar) {
        if (!this.l.j()) {
            com.google.firebase.crashlytics.i.f.f().i("No crash reports are available to be sent.");
            this.o.e(Boolean.FALSE);
            return l.e(null);
        }
        com.google.firebase.crashlytics.i.f.f().i("Crash reports are available to be sent.");
        return V().o(new d(iVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void X(Thread thread, Throwable th) {
        this.f1397e.g(new f(System.currentTimeMillis(), th, thread));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void Y(long j2, String str) {
        this.f1397e.h(new e(j2, str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f.b.a.b.g.i<Boolean> n() {
        if (this.r.compareAndSet(false, true)) {
            return this.o.a();
        }
        com.google.firebase.crashlytics.i.f.f().k("checkForUnsentReports should only be called once per execution.");
        return l.e(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f.b.a.b.g.i<Void> s() {
        this.p.e(Boolean.FALSE);
        return this.q.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t() {
        if (!this.c.c()) {
            String D = D();
            return D != null && this.f1402j.b(D);
        }
        com.google.firebase.crashlytics.i.f.f().i("Found previous crash marker.");
        this.c.d();
        return true;
    }

    void u(com.google.firebase.crashlytics.i.p.i iVar) {
        v(false, iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void y(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, com.google.firebase.crashlytics.i.p.i iVar) {
        this.n = iVar;
        P(str);
        u uVar = new u(new a(), iVar, uncaughtExceptionHandler, this.f1402j);
        this.m = uVar;
        Thread.setDefaultUncaughtExceptionHandler(uVar);
    }
}
