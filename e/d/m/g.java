package e.d.m;

import android.os.Handler;
import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
class g {

    /* loaded from: classes.dex */
    private static class a implements ThreadFactory {
        private String a;
        private int b;

        /* renamed from: e.d.m.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0069a extends Thread {

            /* renamed from: e  reason: collision with root package name */
            private final int f2090e;

            C0069a(Runnable runnable, String str, int i2) {
                super(runnable, str);
                this.f2090e = i2;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f2090e);
                super.run();
            }
        }

        a(String str, int i2) {
            this.a = str;
            this.b = i2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C0069a(runnable, this.a, this.b);
        }
    }

    /* loaded from: classes.dex */
    private static class b<T> implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private Callable<T> f2091e;

        /* renamed from: f  reason: collision with root package name */
        private e.d.o.a<T> f2092f;

        /* renamed from: g  reason: collision with root package name */
        private Handler f2093g;

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ e.d.o.a f2094e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ Object f2095f;

            a(b bVar, e.d.o.a aVar, Object obj) {
                this.f2094e = aVar;
                this.f2095f = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f2094e.accept(this.f2095f);
            }
        }

        b(Handler handler, Callable<T> callable, e.d.o.a<T> aVar) {
            this.f2091e = callable;
            this.f2092f = aVar;
            this.f2093g = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T t;
            try {
                t = this.f2091e.call();
            } catch (Exception unused) {
                t = null;
            }
            this.f2093g.post(new a(this, this.f2092f, t));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ThreadPoolExecutor a(String str, int i2, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i3, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new a(str, i2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void b(Executor executor, Callable<T> callable, e.d.o.a<T> aVar) {
        executor.execute(new b(e.d.m.b.a(), callable, aVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T c(ExecutorService executorService, Callable<T> callable, int i2) {
        try {
            return executorService.submit(callable).get(i2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (ExecutionException e3) {
            throw new RuntimeException(e3);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }
}
