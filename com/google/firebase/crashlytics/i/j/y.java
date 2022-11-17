package com.google.firebase.crashlytics.i.j;

import com.google.firebase.crashlytics.i.f;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* loaded from: classes.dex */
public final class y {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ThreadFactory {
        final /* synthetic */ String a;
        final /* synthetic */ AtomicLong b;

        /* renamed from: com.google.firebase.crashlytics.i.j.y$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class C0032a extends j {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Runnable f1437e;

            C0032a(a aVar, Runnable runnable) {
                this.f1437e = runnable;
            }

            @Override // com.google.firebase.crashlytics.i.j.j
            public void a() {
                this.f1437e.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.a = str;
            this.b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(new C0032a(this, runnable));
            newThread.setName(this.a + this.b.getAndIncrement());
            return newThread;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends j {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f1438e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ExecutorService f1439f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f1440g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ TimeUnit f1441h;

        b(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
            this.f1438e = str;
            this.f1439f = executorService;
            this.f1440g = j2;
            this.f1441h = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.i.j.j
        public void a() {
            try {
                f f2 = f.f();
                f2.b("Executing shutdown hook for " + this.f1438e);
                this.f1439f.shutdown();
                if (!this.f1439f.awaitTermination(this.f1440g, this.f1441h)) {
                    f f3 = f.f();
                    f3.b(this.f1438e + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f1439f.shutdownNow();
                }
            } catch (InterruptedException unused) {
                f.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f1438e));
                this.f1439f.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
        Runtime runtime = Runtime.getRuntime();
        b bVar = new b(str, executorService, j2, timeUnit);
        runtime.addShutdownHook(new Thread(bVar, "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService e2 = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, e2);
        return e2;
    }

    public static ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}
