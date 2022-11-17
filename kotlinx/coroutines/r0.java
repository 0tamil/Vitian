package kotlinx.coroutines;

import j.u.d;
import j.u.i.c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.internal.h;
import kotlinx.coroutines.internal.x;
/* loaded from: classes.dex */
public final class r0<T> extends x<T> {

    /* renamed from: h  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3918h = AtomicIntegerFieldUpdater.newUpdater(r0.class, "_decision");
    private volatile /* synthetic */ int _decision;

    private final boolean x0() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f3918h.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // kotlinx.coroutines.internal.x, kotlinx.coroutines.c
    protected void s0(Object obj) {
        d b;
        if (!x0()) {
            b = c.b(this.f3818g);
            h.c(b, c0.a(obj, this.f3818g), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.internal.x, kotlinx.coroutines.u1
    public void w(Object obj) {
        s0(obj);
    }
}
