package f.b.a.b.d.a;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
final class h implements f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ h(g gVar) {
    }

    @Override // f.b.a.b.d.a.f
    public final ExecutorService a(ThreadFactory threadFactory, int i2) {
        return b(1, threadFactory, 1);
    }

    @Override // f.b.a.b.d.a.f
    public final ExecutorService b(int i2, ThreadFactory threadFactory, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i2, i2, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), threadFactory);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return Executors.unconfigurableExecutorService(threadPoolExecutor);
    }
}
