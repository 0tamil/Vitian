package kotlinx.coroutines;

import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.z0;
/* loaded from: classes.dex */
public abstract class a1 extends y0 {
    protected abstract Thread I();

    /* JADX INFO: Access modifiers changed from: protected */
    public final void J(long j2, z0.a aVar) {
        if (o0.a()) {
            if (!(this != q0.f3915k)) {
                throw new AssertionError();
            }
        }
        q0.f3915k.V(j2, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void K() {
        Thread I = I();
        if (Thread.currentThread() != I) {
            d a = e.a();
            if (a == null) {
                LockSupport.unpark(I);
            } else {
                a.f(I);
            }
        }
    }
}
