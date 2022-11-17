package kotlinx.coroutines;

import j.u.g;
import j.x.d.i;
import j.z.d;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.e0;
import kotlinx.coroutines.internal.f0;
import kotlinx.coroutines.internal.q;
import kotlinx.coroutines.internal.z;
/* loaded from: classes.dex */
public abstract class z0 extends a1 {

    /* renamed from: i  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3944i = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_queue");

    /* renamed from: j  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3945j = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_delayed");
    private volatile /* synthetic */ Object _queue = null;
    private volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* loaded from: classes.dex */
    public static abstract class a implements Runnable, Comparable<a>, w0, f0 {

        /* renamed from: e  reason: collision with root package name */
        public long f3946e;

        /* renamed from: f  reason: collision with root package name */
        private Object f3947f;

        /* renamed from: g  reason: collision with root package name */
        private int f3948g;

        @Override // kotlinx.coroutines.w0
        public final synchronized void a() {
            z zVar;
            z zVar2;
            Object obj = this.f3947f;
            zVar = c1.a;
            if (obj != zVar) {
                b bVar = obj instanceof b ? (b) obj : null;
                if (bVar != null) {
                    bVar.g(this);
                }
                zVar2 = c1.a;
                this.f3947f = zVar2;
            }
        }

        @Override // kotlinx.coroutines.internal.f0
        public void c(int i2) {
            this.f3948g = i2;
        }

        @Override // kotlinx.coroutines.internal.f0
        public void d(e0<?> e0Var) {
            z zVar;
            Object obj = this.f3947f;
            zVar = c1.a;
            if (obj != zVar) {
                this.f3947f = e0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        @Override // kotlinx.coroutines.internal.f0
        public e0<?> g() {
            Object obj = this.f3947f;
            if (obj instanceof e0) {
                return (e0) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.f0
        public int h() {
            return this.f3948g;
        }

        /* renamed from: j */
        public int compareTo(a aVar) {
            int i2 = ((this.f3946e - aVar.f3946e) > 0L ? 1 : ((this.f3946e - aVar.f3946e) == 0L ? 0 : -1));
            if (i2 > 0) {
                return 1;
            }
            return i2 < 0 ? -1 : 0;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x0040 A[Catch: all -> 0x0048, TryCatch #1 {, blocks: (B:3:0x0001, B:8:0x000c, B:12:0x001a, B:29:0x0045, B:9:0x000d, B:17:0x0021, B:18:0x0024, B:22:0x002e, B:25:0x0037, B:27:0x0040, B:28:0x0042), top: B:33:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final synchronized int k(long j2, b bVar, z0 z0Var) {
            z zVar;
            long j3;
            long j4;
            int i2;
            Object obj = this.f3947f;
            zVar = c1.a;
            if (obj == zVar) {
                i2 = 2;
            } else {
                synchronized (bVar) {
                    a b = bVar.b();
                    if (z0Var.Q()) {
                        return 1;
                    }
                    if (b != null) {
                        long j5 = b.f3946e;
                        if (j5 - j2 < 0) {
                            j2 = j5;
                        }
                        if (j2 - bVar.b > 0) {
                        }
                        j3 = this.f3946e;
                        j4 = bVar.b;
                        if (j3 - j4 < 0) {
                            this.f3946e = j4;
                        }
                        bVar.a(this);
                        i2 = 0;
                    }
                    bVar.b = j2;
                    j3 = this.f3946e;
                    j4 = bVar.b;
                    if (j3 - j4 < 0) {
                    }
                    bVar.a(this);
                    i2 = 0;
                }
            }
            return i2;
        }

        public final boolean l(long j2) {
            return j2 - this.f3946e >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.f3946e + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends e0<a> {
        public long b;

        public b(long j2) {
            this.b = j2;
        }
    }

    private final void M() {
        z zVar;
        z zVar2;
        if (!o0.a() || Q()) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3944i;
                    zVar = c1.b;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, zVar)) {
                        return;
                    }
                } else if (obj instanceof q) {
                    ((q) obj).d();
                    return;
                } else {
                    zVar2 = c1.b;
                    if (obj != zVar2) {
                        q qVar = new q(8, true);
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                        qVar.a((Runnable) obj);
                        if (f3944i.compareAndSet(this, obj, qVar)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new AssertionError();
        }
    }

    private final Runnable N() {
        z zVar;
        while (true) {
            Object obj = this._queue;
            if (obj == null) {
                return null;
            }
            if (obj instanceof q) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                q qVar = (q) obj;
                Object j2 = qVar.j();
                if (j2 != q.f3811h) {
                    return (Runnable) j2;
                }
                f3944i.compareAndSet(this, obj, qVar.i());
            } else {
                zVar = c1.b;
                if (obj == zVar) {
                    return null;
                }
                if (f3944i.compareAndSet(this, obj, null)) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean P(Runnable runnable) {
        z zVar;
        while (true) {
            Object obj = this._queue;
            if (Q()) {
                return false;
            }
            if (obj == null) {
                if (f3944i.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof q) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                q qVar = (q) obj;
                int a2 = qVar.a(runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    f3944i.compareAndSet(this, obj, qVar.i());
                } else if (a2 == 2) {
                    return false;
                }
            } else {
                zVar = c1.b;
                if (obj == zVar) {
                    return false;
                }
                q qVar2 = new q(8, true);
                Objects.requireNonNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                qVar2.a((Runnable) obj);
                qVar2.a(runnable);
                if (f3944i.compareAndSet(this, obj, qVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean Q() {
        return this._isCompleted;
    }

    private final void T() {
        d a2 = e.a();
        long nanoTime = a2 == null ? System.nanoTime() : a2.a();
        while (true) {
            b bVar = (b) this._delayed;
            a i2 = bVar == null ? null : bVar.i();
            if (i2 != null) {
                J(nanoTime, i2);
            } else {
                return;
            }
        }
    }

    private final int W(long j2, a aVar) {
        if (Q()) {
            return 1;
        }
        b bVar = (b) this._delayed;
        if (bVar == null) {
            f3945j.compareAndSet(this, null, new b(j2));
            Object obj = this._delayed;
            i.b(obj);
            bVar = (b) obj;
        }
        return aVar.k(j2, bVar, this);
    }

    private final void X(boolean z) {
        this._isCompleted = z ? 1 : 0;
    }

    private final boolean Y(a aVar) {
        b bVar = (b) this._delayed;
        return (bVar == null ? null : bVar.e()) == aVar;
    }

    @Override // kotlinx.coroutines.y0
    protected long B() {
        z zVar;
        if (super.B() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof q)) {
                zVar = c1.b;
                return obj == zVar ? Long.MAX_VALUE : 0L;
            } else if (!((q) obj).g()) {
                return 0L;
            }
        }
        b bVar = (b) this._delayed;
        a e2 = bVar == null ? null : bVar.e();
        if (e2 == null) {
            return Long.MAX_VALUE;
        }
        long j2 = e2.f3946e;
        d a2 = e.a();
        return d.b(j2 - (a2 == null ? System.nanoTime() : a2.a()), 0L);
    }

    @Override // kotlinx.coroutines.y0
    protected void H() {
        e2.a.b();
        X(true);
        M();
        do {
        } while (S() <= 0);
        T();
    }

    public final void O(Runnable runnable) {
        if (P(runnable)) {
            K();
        } else {
            q0.f3915k.O(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean R() {
        z zVar;
        if (!F()) {
            return false;
        }
        b bVar = (b) this._delayed;
        if (bVar != null && !bVar.d()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof q) {
                return ((q) obj).g();
            }
            zVar = c1.b;
            if (obj != zVar) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public long S() {
        Runnable N;
        a aVar;
        if (G()) {
            return 0L;
        }
        b bVar = (b) this._delayed;
        if (bVar == null || bVar.d()) {
            N = N();
            if (N != null) {
                return B();
            }
            N.run();
            return 0L;
        }
        d a2 = e.a();
        long nanoTime = a2 == null ? System.nanoTime() : a2.a();
        do {
            synchronized (bVar) {
                a b2 = bVar.b();
                aVar = null;
                if (b2 != null) {
                    a aVar2 = b2;
                    if (aVar2.l(nanoTime) ? P(aVar2) : false) {
                        aVar = bVar.h(0);
                    }
                }
            }
        } while (aVar != null);
        N = N();
        if (N != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void U() {
        this._queue = null;
        this._delayed = null;
    }

    public final void V(long j2, a aVar) {
        int W = W(j2, aVar);
        if (W != 0) {
            if (W == 1) {
                J(j2, aVar);
            } else if (W != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (Y(aVar)) {
            K();
        }
    }

    @Override // kotlinx.coroutines.f0
    public final void w(g gVar, Runnable runnable) {
        O(runnable);
    }
}
