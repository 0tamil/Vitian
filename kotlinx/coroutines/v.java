package kotlinx.coroutines;

import j.c0.l;
import j.u.g;
import j.x.d.i;
import j.z.f;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public final class v extends e1 {

    /* renamed from: f  reason: collision with root package name */
    public static final v f3930f = new v();

    /* renamed from: g  reason: collision with root package name */
    private static final int f3931g;

    /* renamed from: h  reason: collision with root package name */
    private static boolean f3932h;
    private static volatile Executor pool;

    static {
        String str;
        int i2;
        Integer f2;
        try {
            str = System.getProperty("kotlinx.coroutines.default.parallelism");
        } catch (Throwable unused) {
            str = null;
        }
        if (str == null) {
            i2 = -1;
        } else {
            f2 = l.f(str);
            if (f2 == null || f2.intValue() < 1) {
                throw new IllegalStateException(i.i("Expected positive number in kotlinx.coroutines.default.parallelism, but has ", str).toString());
            }
            i2 = f2.intValue();
        }
        f3931g = i2;
    }

    private v() {
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final ExecutorService A() {
        Class<?> cls;
        ExecutorService executorService;
        Object invoke;
        if (System.getSecurityManager() != null) {
            return y();
        }
        ExecutorService executorService2 = null;
        try {
            cls = Class.forName("java.util.concurrent.ForkJoinPool");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls == null) {
            return y();
        }
        if (!f3932h && f3931g < 0) {
            try {
                invoke = cls.getMethod("commonPool", new Class[0]).invoke(null, new Object[0]);
            } catch (Throwable unused2) {
            }
            if (invoke instanceof ExecutorService) {
                executorService = (ExecutorService) invoke;
                if (executorService != null) {
                    if (!f3930f.D(cls, executorService)) {
                        executorService = null;
                    }
                    if (executorService != null) {
                        return executorService;
                    }
                }
            }
            executorService = null;
            if (executorService != null) {
            }
        }
        try {
            Object newInstance = cls.getConstructor(Integer.TYPE).newInstance(Integer.valueOf(f3930f.C()));
            if (newInstance instanceof ExecutorService) {
                executorService2 = (ExecutorService) newInstance;
            }
        } catch (Throwable unused3) {
        }
        return executorService2 == null ? y() : executorService2;
    }

    private final synchronized Executor B() {
        Executor executor;
        executor = pool;
        if (executor == null) {
            executor = A();
            pool = executor;
        }
        return executor;
    }

    private final int C() {
        int a;
        Integer valueOf = Integer.valueOf(f3931g);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        a = f.a(Runtime.getRuntime().availableProcessors() - 1, 1);
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E() {
    }

    private final ExecutorService y() {
        final AtomicInteger atomicInteger = new AtomicInteger();
        return Executors.newFixedThreadPool(C(), new ThreadFactory() { // from class: kotlinx.coroutines.b
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread z;
                z = v.z(atomicInteger, runnable);
                return z;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread z(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable, i.i("CommonPool-worker-", Integer.valueOf(atomicInteger.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }

    public final boolean D(Class<?> cls, ExecutorService executorService) {
        executorService.submit(a.f3768e);
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (invoke instanceof Integer) {
                num = (Integer) invoke;
            }
        } catch (Throwable unused) {
        }
        return num != null && num.intValue() >= 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }

    @Override // kotlinx.coroutines.f0
    public String toString() {
        return "CommonPool";
    }

    @Override // kotlinx.coroutines.f0
    public void w(g gVar, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = B();
            }
            d a = e.a();
            executor.execute(a == null ? runnable : a.h(runnable));
        } catch (RejectedExecutionException unused) {
            d a2 = e.a();
            if (a2 != null) {
                a2.e();
            }
            q0.f3915k.O(runnable);
        }
    }
}
