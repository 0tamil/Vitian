package kotlinx.coroutines;

import j.u.g;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import kotlinx.coroutines.internal.e;
/* loaded from: classes.dex */
public final class f1 extends e1 {

    /* renamed from: f  reason: collision with root package name */
    private final Executor f3778f;

    public f1(Executor executor) {
        this.f3778f = executor;
        e.a(z());
    }

    private final void y(g gVar, RejectedExecutionException rejectedExecutionException) {
        r1.c(gVar, d1.a("The task was rejected", rejectedExecutionException));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor z = z();
        ExecutorService executorService = z instanceof ExecutorService ? (ExecutorService) z : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof f1) && ((f1) obj).z() == z();
    }

    public int hashCode() {
        return System.identityHashCode(z());
    }

    @Override // kotlinx.coroutines.f0
    public String toString() {
        return z().toString();
    }

    @Override // kotlinx.coroutines.f0
    public void w(g gVar, Runnable runnable) {
        try {
            Executor z = z();
            d a = e.a();
            z.execute(a == null ? runnable : a.h(runnable));
        } catch (RejectedExecutionException e2) {
            d a2 = e.a();
            if (a2 != null) {
                a2.e();
            }
            y(gVar, e2);
            v0.b().w(gVar, runnable);
        }
    }

    public Executor z() {
        return this.f3778f;
    }
}
