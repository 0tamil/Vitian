package kotlinx.coroutines;

import j.x.d.e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
/* loaded from: classes.dex */
public class y {
    private static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(y.class, "_handled");
    private volatile /* synthetic */ int _handled;
    public final Throwable a;

    public y(Throwable th, boolean z) {
        this.a = th;
        this._handled = z ? 1 : 0;
    }

    public /* synthetic */ y(Throwable th, boolean z, int i2, e eVar) {
        this(th, (i2 & 2) != 0 ? false : z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return p0.a(this) + '[' + this.a + ']';
    }
}
