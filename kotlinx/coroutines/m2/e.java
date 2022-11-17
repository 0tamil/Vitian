package kotlinx.coroutines.m2;

import j.u.g;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlinx.coroutines.e1;
/* loaded from: classes.dex */
final class e extends e1 implements j, Executor {

    /* renamed from: k  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3892k = AtomicIntegerFieldUpdater.newUpdater(e.class, "inFlightTasks");

    /* renamed from: f  reason: collision with root package name */
    private final c f3893f;

    /* renamed from: g  reason: collision with root package name */
    private final int f3894g;

    /* renamed from: h  reason: collision with root package name */
    private final String f3895h;

    /* renamed from: i  reason: collision with root package name */
    private final int f3896i;

    /* renamed from: j  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Runnable> f3897j = new ConcurrentLinkedQueue<>();
    private volatile /* synthetic */ int inFlightTasks = 0;

    public e(c cVar, int i2, String str, int i3) {
        this.f3893f = cVar;
        this.f3894g = i2;
        this.f3895h = str;
        this.f3896i = i3;
    }

    private final void y(Runnable runnable, boolean z) {
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3892k;
            if (atomicIntegerFieldUpdater.incrementAndGet(this) <= this.f3894g) {
                this.f3893f.z(runnable, this, z);
                return;
            }
            this.f3897j.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) < this.f3894g) {
                runnable = this.f3897j.poll();
            } else {
                return;
            }
        } while (runnable != null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        y(runnable, false);
    }

    @Override // kotlinx.coroutines.m2.j
    public int r() {
        return this.f3896i;
    }

    @Override // kotlinx.coroutines.m2.j
    public void t() {
        Runnable poll = this.f3897j.poll();
        if (poll != null) {
            this.f3893f.z(poll, this, true);
            return;
        }
        f3892k.decrementAndGet(this);
        Runnable poll2 = this.f3897j.poll();
        if (poll2 != null) {
            y(poll2, true);
        }
    }

    @Override // kotlinx.coroutines.f0
    public String toString() {
        String str = this.f3895h;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f3893f + ']';
    }

    @Override // kotlinx.coroutines.f0
    public void w(g gVar, Runnable runnable) {
        y(runnable, false);
    }
}
