package f.b.a.a.i;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
class n implements Executor {

    /* renamed from: e  reason: collision with root package name */
    private final Executor f2302e;

    /* loaded from: classes.dex */
    static class a implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        private final Runnable f2303e;

        a(Runnable runnable) {
            this.f2303e = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2303e.run();
            } catch (Exception e2) {
                f.b.a.a.i.y.a.c("Executor", "Background execution failure.", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(Executor executor) {
        this.f2302e = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f2302e.execute(new a(runnable));
    }
}
