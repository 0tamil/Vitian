package kotlinx.coroutines;

import j.u.h;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u0 implements Executor {

    /* renamed from: e  reason: collision with root package name */
    public final f0 f3922e;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3922e.w(h.f3461e, runnable);
    }

    public String toString() {
        return this.f3922e.toString();
    }
}
