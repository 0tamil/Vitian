package kotlinx.coroutines;

import j.r;
import j.x.c.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
final class l1 extends p1 {

    /* renamed from: j  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3858j = AtomicIntegerFieldUpdater.newUpdater(l1.class, "_invoked");
    private volatile /* synthetic */ int _invoked = 0;

    /* renamed from: i  reason: collision with root package name */
    private final l<Throwable, r> f3859i;

    /* JADX WARN: Multi-variable type inference failed */
    public l1(l<? super Throwable, r> lVar) {
        this.f3859i = lVar;
    }

    @Override // j.x.c.l
    public /* bridge */ /* synthetic */ r invoke(Throwable th) {
        y(th);
        return r.a;
    }

    @Override // kotlinx.coroutines.a0
    public void y(Throwable th) {
        if (f3858j.compareAndSet(this, 0, 1)) {
            this.f3859i.invoke(th);
        }
    }
}
