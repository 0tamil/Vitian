package com.google.firebase.crashlytics.i.j;

import f.b.a.b.g.i;
import f.b.a.b.g.j;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class i0 {
    private static final ExecutorService a = y.c("awaitEvenIfOnMainThread task continuation executor");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Callable f1385e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ j f1386f;

        /* renamed from: com.google.firebase.crashlytics.i.j.i0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0030a implements f.b.a.b.g.a<T, Void> {
            C0030a() {
            }

            /* renamed from: b */
            public Void a(i<T> iVar) {
                if (iVar.n()) {
                    a.this.f1386f.c(iVar.j());
                    return null;
                }
                a.this.f1386f.b(iVar.i());
                return null;
            }
        }

        a(Callable callable, j jVar) {
            this.f1385e = callable;
            this.f1386f = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((i) this.f1385e.call()).f(new C0030a());
            } catch (Exception e2) {
                this.f1386f.b(e2);
            }
        }
    }

    public static <T> T a(i<T> iVar) {
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        iVar.g(a, new f.b.a.b.g.a() { // from class: com.google.firebase.crashlytics.i.j.g
            @Override // f.b.a.b.g.a
            public final Object a(i iVar2) {
                return countDownLatch.countDown();
            }
        });
        countDownLatch.await(4L, TimeUnit.SECONDS);
        if (iVar.n()) {
            return iVar.j();
        }
        if (iVar.l()) {
            throw new CancellationException("Task is already canceled");
        } else if (iVar.m()) {
            throw new IllegalStateException(iVar.i());
        } else {
            throw new TimeoutException();
        }
    }

    public static <T> i<T> b(Executor executor, Callable<i<T>> callable) {
        j jVar = new j();
        executor.execute(new a(callable, jVar));
        return jVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Void d(j jVar, i iVar) {
        if (iVar.n()) {
            jVar.e(iVar.j());
            return null;
        }
        Exception i2 = iVar.i();
        Objects.requireNonNull(i2);
        jVar.d(i2);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Void e(j jVar, i iVar) {
        if (iVar.n()) {
            jVar.e(iVar.j());
            return null;
        }
        Exception i2 = iVar.i();
        Objects.requireNonNull(i2);
        jVar.d(i2);
        return null;
    }

    public static <T> i<T> f(i<T> iVar, i<T> iVar2) {
        final j jVar = new j();
        f.b.a.b.g.a<T, TContinuationResult> fVar = new f.b.a.b.g.a() { // from class: com.google.firebase.crashlytics.i.j.f
            @Override // f.b.a.b.g.a
            public final Object a(i iVar3) {
                return i0.d(j.this, iVar3);
            }
        };
        iVar.f(fVar);
        iVar2.f(fVar);
        return jVar.a();
    }

    public static <T> i<T> g(Executor executor, i<T> iVar, i<T> iVar2) {
        final j jVar = new j();
        f.b.a.b.g.a<T, TContinuationResult> eVar = new f.b.a.b.g.a() { // from class: com.google.firebase.crashlytics.i.j.e
            @Override // f.b.a.b.g.a
            public final Object a(i iVar3) {
                return i0.e(j.this, iVar3);
            }
        };
        iVar.g(executor, eVar);
        iVar2.g(executor, eVar);
        return jVar.a();
    }
}
