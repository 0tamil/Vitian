package com.google.firebase.crashlytics.i.k;

import com.google.firebase.crashlytics.i.j.n;
import com.google.firebase.crashlytics.i.j.o;
import com.google.firebase.crashlytics.i.k.i;
import com.google.firebase.crashlytics.i.n.f;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
/* loaded from: classes.dex */
public class i {
    private final f a;
    private final o b;
    private final String c;

    /* renamed from: d  reason: collision with root package name */
    private final a f1453d = new a(false);

    /* renamed from: e  reason: collision with root package name */
    private final a f1454e = new a(true);

    /* renamed from: f  reason: collision with root package name */
    private final AtomicMarkableReference<String> f1455f = new AtomicMarkableReference<>(null, false);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a {
        final AtomicMarkableReference<d> a;
        private final AtomicReference<Callable<Void>> b = new AtomicReference<>(null);
        private final boolean c;

        public a(boolean z) {
            this.c = z;
            this.a = new AtomicMarkableReference<>(new d(64, z ? 8192 : 1024), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: b */
        public /* synthetic */ Void c() {
            this.b.set(null);
            e();
            return null;
        }

        private void d() {
            Callable<Void> bVar = new Callable() { // from class: com.google.firebase.crashlytics.i.k.b
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return i.a.this.c();
                }
            };
            if (this.b.compareAndSet(null, bVar)) {
                i.this.b.h(bVar);
            }
        }

        private void e() {
            Map<String, String> map;
            synchronized (this) {
                if (this.a.isMarked()) {
                    map = this.a.getReference().a();
                    AtomicMarkableReference<d> atomicMarkableReference = this.a;
                    atomicMarkableReference.set(atomicMarkableReference.getReference(), false);
                } else {
                    map = null;
                }
            }
            if (map != null) {
                i.this.a.k(i.this.c, map, this.c);
            }
        }

        public Map<String, String> a() {
            return this.a.getReference().a();
        }

        public boolean f(String str, String str2) {
            synchronized (this) {
                if (!this.a.getReference().d(str, str2)) {
                    return false;
                }
                AtomicMarkableReference<d> atomicMarkableReference = this.a;
                atomicMarkableReference.set(atomicMarkableReference.getReference(), true);
                d();
                return true;
            }
        }
    }

    public i(String str, f fVar, o oVar) {
        this.c = str;
        this.a = new f(fVar);
        this.b = oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ Object h() {
        k();
        return null;
    }

    public static i i(String str, f fVar, o oVar) {
        f fVar2 = new f(fVar);
        i iVar = new i(str, fVar, oVar);
        iVar.f1453d.a.getReference().e(fVar2.g(str, false));
        iVar.f1454e.a.getReference().e(fVar2.g(str, true));
        iVar.f1455f.set(fVar2.h(str), false);
        return iVar;
    }

    public static String j(String str, f fVar) {
        return new f(fVar).h(str);
    }

    private void k() {
        boolean z;
        String str;
        synchronized (this.f1455f) {
            z = false;
            if (this.f1455f.isMarked()) {
                str = f();
                this.f1455f.set(str, false);
                z = true;
            } else {
                str = null;
            }
        }
        if (z) {
            this.a.l(this.c, str);
        }
    }

    public Map<String, String> d() {
        return this.f1453d.a();
    }

    public Map<String, String> e() {
        return this.f1454e.a();
    }

    public String f() {
        return this.f1455f.getReference();
    }

    public boolean l(String str, String str2) {
        return this.f1453d.f(str, str2);
    }

    public boolean m(String str, String str2) {
        return this.f1454e.f(str, str2);
    }

    public void n(String str) {
        String c = d.c(str, 1024);
        synchronized (this.f1455f) {
            if (!n.A(c, this.f1455f.getReference())) {
                this.f1455f.set(c, true);
                this.b.h(new Callable() { // from class: com.google.firebase.crashlytics.i.k.a
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return i.this.h();
                    }
                });
            }
        }
    }
}
