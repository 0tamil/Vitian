package f.b.a.b.g;

import android.os.Handler;
import android.os.Looper;
import f.b.a.b.d.f.a;
import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class h0 implements Executor {

    /* renamed from: e  reason: collision with root package name */
    private final Handler f2409e = new a(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f2409e.post(runnable);
    }
}
