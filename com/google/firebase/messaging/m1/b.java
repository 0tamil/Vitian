package com.google.firebase.messaging.m1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public class b {
    private static final com.google.firebase.messaging.m1.a a;
    private static volatile com.google.firebase.messaging.m1.a b;

    /* renamed from: com.google.firebase.messaging.m1.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0056b implements com.google.firebase.messaging.m1.a {
        private C0056b() {
        }

        @Override // com.google.firebase.messaging.m1.a
        public ExecutorService a(ThreadFactory threadFactory, c cVar) {
            return b(1, threadFactory, cVar);
        }

        public ExecutorService b(int i2, ThreadFactory threadFactory, c cVar) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            return Executors.unconfigurableExecutorService(threadPoolExecutor);
        }
    }

    static {
        C0056b bVar = new C0056b();
        a = bVar;
        b = bVar;
    }

    public static com.google.firebase.messaging.m1.a a() {
        return b;
    }
}
