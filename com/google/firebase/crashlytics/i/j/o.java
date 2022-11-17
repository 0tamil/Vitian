package com.google.firebase.crashlytics.i.j;

import f.b.a.b.g.i;
import f.b.a.b.g.l;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
public class o {
    private final Executor a;
    private i<Void> b = l.e(null);
    private final Object c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private final ThreadLocal<Boolean> f1394d = new ThreadLocal<>();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o.this.f1394d.set(Boolean.TRUE);
        }
    }

    /* loaded from: classes.dex */
    class b implements Callable<Void> {
        final /* synthetic */ Runnable a;

        b(o oVar, Runnable runnable) {
            this.a = runnable;
        }

        /* renamed from: a */
        public Void call() {
            this.a.run();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements f.b.a.b.g.a<Void, T> {
        final /* synthetic */ Callable a;

        c(o oVar, Callable callable) {
            this.a = callable;
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
        @Override // f.b.a.b.g.a
        public T a(i<Void> iVar) {
            return this.a.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements f.b.a.b.g.a<T, Void> {
        d(o oVar) {
        }

        /* renamed from: b */
        public Void a(i<T> iVar) {
            return null;
        }
    }

    public o(Executor executor) {
        this.a = executor;
        executor.execute(new a());
    }

    private <T> i<Void> d(i<T> iVar) {
        return iVar.g(this.a, new d(this));
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.f1394d.get());
    }

    private <T> f.b.a.b.g.a<Void, T> f(Callable<T> callable) {
        return new c(this, callable);
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i<Void> g(Runnable runnable) {
        return h(new b(this, runnable));
    }

    public <T> i<T> h(Callable<T> callable) {
        i<T> g2;
        synchronized (this.c) {
            g2 = this.b.g(this.a, f(callable));
            this.b = d(g2);
        }
        return g2;
    }

    public <T> i<T> i(Callable<i<T>> callable) {
        i<T> h2;
        synchronized (this.c) {
            h2 = this.b.h(this.a, f(callable));
            this.b = d(h2);
        }
        return h2;
    }
}
