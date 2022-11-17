package com.google.firebase.crashlytics;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.firebase.crashlytics.i.c;
import com.google.firebase.crashlytics.i.d;
import com.google.firebase.crashlytics.i.e;
import com.google.firebase.crashlytics.i.f;
import com.google.firebase.crashlytics.i.j.a0;
import com.google.firebase.crashlytics.i.j.n;
import com.google.firebase.crashlytics.i.j.q;
import com.google.firebase.crashlytics.i.j.w;
import com.google.firebase.crashlytics.i.j.y;
import com.google.firebase.h;
import f.b.a.b.g.i;
import f.b.a.b.g.l;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* loaded from: classes.dex */
public class g {
    final q a;

    /* loaded from: classes.dex */
    class a implements f.b.a.b.g.a<Void, Object> {
        a() {
        }

        @Override // f.b.a.b.g.a
        public Object a(i<Void> iVar) {
            if (iVar.n()) {
                return null;
            }
            f.f().e("Error fetching settings.", iVar.i());
            return null;
        }
    }

    /* loaded from: classes.dex */
    class b implements Callable<Void> {
        final /* synthetic */ boolean a;
        final /* synthetic */ q b;
        final /* synthetic */ com.google.firebase.crashlytics.i.p.f c;

        b(boolean z, q qVar, com.google.firebase.crashlytics.i.p.f fVar) {
            this.a = z;
            this.b = qVar;
            this.c = fVar;
        }

        /* renamed from: a */
        public Void call() {
            if (!this.a) {
                return null;
            }
            this.b.j(this.c);
            return null;
        }
    }

    private g(q qVar) {
        this.a = qVar;
    }

    public static g d() {
        g gVar = (g) h.l().h(g.class);
        Objects.requireNonNull(gVar, "FirebaseCrashlytics component is not present.");
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g e(h hVar, com.google.firebase.installations.h hVar2, com.google.firebase.q.a<c> aVar, com.google.firebase.q.a<com.google.firebase.l.a.a> aVar2) {
        Context j2 = hVar.j();
        String packageName = j2.getPackageName();
        f f2 = f.f();
        f2.g("Initializing Firebase Crashlytics " + q.l() + " for " + packageName);
        com.google.firebase.crashlytics.i.n.f fVar = new com.google.firebase.crashlytics.i.n.f(j2);
        w wVar = new w(hVar);
        a0 a0Var = new a0(j2, packageName, hVar2, wVar);
        d dVar = new d(aVar);
        e eVar = new e(aVar2);
        q qVar = new q(hVar, a0Var, dVar, wVar, eVar.b(), eVar.a(), fVar, y.c("Crashlytics Exception Handler"));
        String c = hVar.o().c();
        String n = n.n(j2);
        f f3 = f.f();
        f3.b("Mapping file ID is: " + n);
        try {
            com.google.firebase.crashlytics.i.j.h a2 = com.google.firebase.crashlytics.i.j.h.a(j2, a0Var, c, n, new e(j2));
            f f4 = f.f();
            f4.i("Installer package name is: " + a2.c);
            ExecutorService c2 = y.c("com.google.firebase.crashlytics.startup");
            com.google.firebase.crashlytics.i.p.f l = com.google.firebase.crashlytics.i.p.f.l(j2, c, a0Var, new com.google.firebase.crashlytics.i.m.b(), a2.f1382e, a2.f1383f, fVar, wVar);
            l.p(c2).g(c2, new a());
            l.c(c2, new b(qVar.s(a2, l), qVar, l));
            return new g(qVar);
        } catch (PackageManager.NameNotFoundException e2) {
            f.f().e("Error retrieving app package info.", e2);
            return null;
        }
    }

    public i<Boolean> a() {
        return this.a.e();
    }

    public void b() {
        this.a.f();
    }

    public boolean c() {
        return this.a.g();
    }

    public void f(String str) {
        this.a.n(str);
    }

    public void g(Throwable th) {
        if (th == null) {
            f.f().k("A null value was passed to recordException. Ignoring.");
        } else {
            this.a.o(th);
        }
    }

    public void h() {
        this.a.t();
    }

    public void i(Boolean bool) {
        this.a.u(bool);
    }

    public void j(boolean z) {
        this.a.u(Boolean.valueOf(z));
    }

    public void k(String str, String str2) {
        this.a.v(str, str2);
    }

    public void l(String str) {
        this.a.w(str);
    }
}
