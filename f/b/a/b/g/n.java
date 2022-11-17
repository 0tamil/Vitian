package f.b.a.b.g;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
final class n implements o {
    private final CountDownLatch a = new CountDownLatch(1);

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ n(m mVar) {
    }

    @Override // f.b.a.b.g.c
    public final void a() {
        this.a.countDown();
    }

    @Override // f.b.a.b.g.e
    public final void b(Exception exc) {
        this.a.countDown();
    }

    public final void c() {
        this.a.await();
    }

    @Override // f.b.a.b.g.f
    public final void d(Object obj) {
        this.a.countDown();
    }

    public final boolean e(long j2, TimeUnit timeUnit) {
        return this.a.await(j2, timeUnit);
    }
}
