package f.b.a.b.g;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i0 f2413e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Callable f2414f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j0(i0 i0Var, Callable callable) {
        this.f2413e = i0Var;
        this.f2414f = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f2413e.r(this.f2414f.call());
        } catch (Exception e2) {
            this.f2413e.q(e2);
        } catch (Throwable th) {
            this.f2413e.q(new RuntimeException(th));
        }
    }
}
