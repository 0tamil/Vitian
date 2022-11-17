package kotlinx.coroutines.m2;

import j.r;
import j.x.d.i;
import j.z.f;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlinx.coroutines.d;
import kotlinx.coroutines.e;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.p0;
/* loaded from: classes.dex */
public final class a implements Executor, Closeable {
    private volatile /* synthetic */ int _isTerminated;
    volatile /* synthetic */ long controlState;

    /* renamed from: e */
    public final int f3866e;

    /* renamed from: f */
    public final int f3867f;

    /* renamed from: g */
    public final long f3868g;

    /* renamed from: h */
    public final String f3869h;

    /* renamed from: i */
    public final d f3870i;

    /* renamed from: j */
    public final d f3871j;

    /* renamed from: k */
    public final AtomicReferenceArray<b> f3872k;
    private volatile /* synthetic */ long parkedWorkersStack;
    public static final z o = new z("NOT_IN_STACK");
    private static final /* synthetic */ AtomicLongFieldUpdater l = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack");
    static final /* synthetic */ AtomicLongFieldUpdater m = AtomicLongFieldUpdater.newUpdater(a.class, "controlState");
    private static final /* synthetic */ AtomicIntegerFieldUpdater n = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated");

    /* renamed from: kotlinx.coroutines.m2.a$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0156a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            iArr[c.PARKING.ordinal()] = 1;
            iArr[c.BLOCKING.ordinal()] = 2;
            iArr[c.CPU_ACQUIRED.ordinal()] = 3;
            iArr[c.DORMANT.ordinal()] = 4;
            iArr[c.TERMINATED.ordinal()] = 5;
            a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public final class b extends Thread {
        static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(b.class, "workerCtl");

        /* renamed from: e */
        public final m f3873e;

        /* renamed from: f */
        public c f3874f;

        /* renamed from: g */
        private long f3875g;

        /* renamed from: h */
        private long f3876h;

        /* renamed from: i */
        private int f3877i;
        private volatile int indexInArray;

        /* renamed from: j */
        public boolean f3878j;
        private volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private b() {
            a.this = r1;
            setDaemon(true);
            this.f3873e = new m();
            this.f3874f = c.DORMANT;
            this.workerCtl = 0;
            this.nextParkedWorker = a.o;
            this.f3877i = j.y.c.f3483e.b();
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public b(int i2) {
            this();
            a.this = r1;
            n(i2);
        }

        private final void a(int i2) {
            if (i2 != 0) {
                a.m.addAndGet(a.this, -2097152L);
                c cVar = this.f3874f;
                if (cVar != c.TERMINATED) {
                    if (o0.a()) {
                        if (!(cVar == c.BLOCKING)) {
                            throw new AssertionError();
                        }
                    }
                    this.f3874f = c.DORMANT;
                }
            }
        }

        private final void b(int i2) {
            if (i2 != 0 && r(c.BLOCKING)) {
                a.this.x();
            }
        }

        private final void c(i iVar) {
            int r = iVar.f3901f.r();
            h(r);
            b(r);
            a.this.s(iVar);
            a(r);
        }

        private final i d(boolean z) {
            i l2;
            i l3;
            if (z) {
                boolean z2 = j(a.this.f3866e * 2) == 0;
                if (z2 && (l3 = l()) != null) {
                    return l3;
                }
                i h2 = this.f3873e.h();
                if (h2 != null) {
                    return h2;
                }
                if (!z2 && (l2 = l()) != null) {
                    return l2;
                }
            } else {
                i l4 = l();
                if (l4 != null) {
                    return l4;
                }
            }
            return s(false);
        }

        private final void h(int i2) {
            this.f3875g = 0L;
            if (this.f3874f == c.PARKING) {
                if (o0.a()) {
                    boolean z = true;
                    if (i2 != 1) {
                        z = false;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                this.f3874f = c.BLOCKING;
            }
        }

        private final boolean i() {
            return this.nextParkedWorker != a.o;
        }

        private final void k() {
            if (this.f3875g == 0) {
                this.f3875g = System.nanoTime() + a.this.f3868g;
            }
            LockSupport.parkNanos(a.this.f3868g);
            if (System.nanoTime() - this.f3875g >= 0) {
                this.f3875g = 0L;
                t();
            }
        }

        private final i l() {
            d dVar;
            if (j(2) == 0) {
                i d2 = a.this.f3870i.d();
                if (d2 != null) {
                    return d2;
                }
                dVar = a.this.f3871j;
            } else {
                i d3 = a.this.f3871j.d();
                if (d3 != null) {
                    return d3;
                }
                dVar = a.this.f3870i;
            }
            return dVar.d();
        }

        private final void m() {
            loop0: while (true) {
                boolean z = false;
                while (!a.this.l() && this.f3874f != c.TERMINATED) {
                    i e2 = e(this.f3878j);
                    if (e2 != null) {
                        this.f3876h = 0L;
                        c(e2);
                    } else {
                        this.f3878j = false;
                        if (this.f3876h == 0) {
                            q();
                        } else if (!z) {
                            z = true;
                        } else {
                            r(c.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f3876h);
                            this.f3876h = 0L;
                        }
                    }
                }
            }
            r(c.TERMINATED);
        }

        private final boolean p() {
            boolean z;
            if (this.f3874f != c.CPU_ACQUIRED) {
                a aVar = a.this;
                while (true) {
                    long j2 = aVar.controlState;
                    if (((int) ((9223367638808264704L & j2) >> 42)) != 0) {
                        if (a.m.compareAndSet(aVar, j2, j2 - 4398046511104L)) {
                            z = true;
                            break;
                        }
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
                this.f3874f = c.CPU_ACQUIRED;
            }
            return true;
        }

        private final void q() {
            if (!i()) {
                a.this.q(this);
                return;
            }
            if (o0.a()) {
                if (!(this.f3873e.f() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (i() && this.workerCtl == -1 && !a.this.l() && this.f3874f != c.TERMINATED) {
                r(c.PARKING);
                Thread.interrupted();
                k();
            }
        }

        private final i s(boolean z) {
            if (o0.a()) {
                if (!(this.f3873e.f() == 0)) {
                    throw new AssertionError();
                }
            }
            int i2 = (int) (a.this.controlState & 2097151);
            if (i2 < 2) {
                return null;
            }
            int j2 = j(i2);
            a aVar = a.this;
            long j3 = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                j2++;
                if (j2 > i2) {
                    j2 = 1;
                }
                b bVar = aVar.f3872k.get(j2);
                if (!(bVar == null || bVar == this)) {
                    if (o0.a()) {
                        if (!(this.f3873e.f() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    m mVar = this.f3873e;
                    m mVar2 = bVar.f3873e;
                    long k2 = z ? mVar.k(mVar2) : mVar.l(mVar2);
                    if (k2 == -1) {
                        return this.f3873e.h();
                    }
                    if (k2 > 0) {
                        j3 = Math.min(j3, k2);
                    }
                }
            }
            if (j3 == Long.MAX_VALUE) {
                j3 = 0;
            }
            this.f3876h = j3;
            return null;
        }

        private final void t() {
            a aVar = a.this;
            synchronized (aVar.f3872k) {
                if (!aVar.l()) {
                    if (((int) (aVar.controlState & 2097151)) > aVar.f3866e) {
                        if (l.compareAndSet(this, -1, 1)) {
                            int f2 = f();
                            n(0);
                            aVar.r(this, f2, 0);
                            int andDecrement = (int) (a.m.getAndDecrement(aVar) & 2097151);
                            if (andDecrement != f2) {
                                b bVar = aVar.f3872k.get(andDecrement);
                                i.b(bVar);
                                b bVar2 = bVar;
                                aVar.f3872k.set(f2, bVar2);
                                bVar2.n(f2);
                                aVar.r(bVar2, andDecrement, f2);
                            }
                            aVar.f3872k.set(andDecrement, null);
                            r rVar = r.a;
                            this.f3874f = c.TERMINATED;
                        }
                    }
                }
            }
        }

        public final i e(boolean z) {
            i iVar;
            if (p()) {
                return d(z);
            }
            if (!z || (iVar = this.f3873e.h()) == null) {
                iVar = a.this.f3871j.d();
            }
            return iVar == null ? s(true) : iVar;
        }

        public final int f() {
            return this.indexInArray;
        }

        public final Object g() {
            return this.nextParkedWorker;
        }

        public final int j(int i2) {
            int i3 = this.f3877i;
            int i4 = i3 ^ (i3 << 13);
            int i5 = i4 ^ (i4 >> 17);
            int i6 = i5 ^ (i5 << 5);
            this.f3877i = i6;
            int i7 = i2 - 1;
            return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
        }

        public final void n(int i2) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.this.f3869h);
            sb.append("-worker-");
            sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
            setName(sb.toString());
            this.indexInArray = i2;
        }

        public final void o(Object obj) {
            this.nextParkedWorker = obj;
        }

        public final boolean r(c cVar) {
            c cVar2 = this.f3874f;
            boolean z = cVar2 == c.CPU_ACQUIRED;
            if (z) {
                a.m.addAndGet(a.this, 4398046511104L);
            }
            if (cVar2 != cVar) {
                this.f3874f = cVar;
            }
            return z;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            m();
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    public a(int i2, int i3, long j2, String str) {
        this.f3866e = i2;
        this.f3867f = i3;
        this.f3868g = j2;
        this.f3869h = str;
        if (i2 >= 1) {
            if (i3 >= i2) {
                if (i3 <= 2097150) {
                    if (j2 > 0) {
                        this.f3870i = new d();
                        this.f3871j = new d();
                        this.parkedWorkersStack = 0L;
                        this.f3872k = new AtomicReferenceArray<>(i3 + 1);
                        this.controlState = i2 << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j2 + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i3 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i3 + " should be greater than or equals to core pool size " + i2).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i2 + " should be at least 1").toString());
    }

    static /* synthetic */ boolean A(a aVar, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = aVar.controlState;
        }
        return aVar.z(j2);
    }

    private final boolean B() {
        b o2;
        do {
            o2 = o();
            if (o2 == null) {
                return false;
            }
        } while (!b.l.compareAndSet(o2, -1, 0));
        LockSupport.unpark(o2);
        return true;
    }

    private final boolean b(i iVar) {
        boolean z = true;
        if (iVar.f3901f.r() != 1) {
            z = false;
        }
        return (z ? this.f3871j : this.f3870i).a(iVar);
    }

    private final int c() {
        int a;
        int i2;
        synchronized (this.f3872k) {
            if (l()) {
                i2 = -1;
            } else {
                long j2 = this.controlState;
                int i3 = (int) (j2 & 2097151);
                boolean z = false;
                a = f.a(i3 - ((int) ((j2 & 4398044413952L) >> 21)), 0);
                if (a >= this.f3866e) {
                    return 0;
                }
                if (i3 >= this.f3867f) {
                    return 0;
                }
                int i4 = ((int) (this.controlState & 2097151)) + 1;
                if (i4 > 0 && this.f3872k.get(i4) == null) {
                    b bVar = new b(i4);
                    this.f3872k.set(i4, bVar);
                    if (i4 == ((int) (2097151 & m.incrementAndGet(this)))) {
                        z = true;
                    }
                    if (z) {
                        bVar.start();
                        i2 = a + 1;
                    } else {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
            return i2;
        }
    }

    private final b f() {
        Thread currentThread = Thread.currentThread();
        b bVar = currentThread instanceof b ? (b) currentThread : null;
        if (bVar != null && i.a(a.this, this)) {
            return bVar;
        }
        return null;
    }

    public static /* synthetic */ void i(a aVar, Runnable runnable, j jVar, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            jVar = g.f3898e;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        aVar.h(runnable, jVar, z);
    }

    private final int n(b bVar) {
        int f2;
        do {
            Object g2 = bVar.g();
            if (g2 == o) {
                return -1;
            }
            if (g2 == null) {
                return 0;
            }
            bVar = (b) g2;
            f2 = bVar.f();
        } while (f2 == 0);
        return f2;
    }

    private final b o() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            b bVar = this.f3872k.get((int) (2097151 & j2));
            if (bVar == null) {
                return null;
            }
            long j3 = (2097152 + j2) & (-2097152);
            int n2 = n(bVar);
            if (n2 >= 0 && l.compareAndSet(this, j2, n2 | j3)) {
                bVar.o(o);
                return bVar;
            }
        }
    }

    private final void w(boolean z) {
        long addAndGet = m.addAndGet(this, 2097152L);
        if (!z && !B() && !z(addAndGet)) {
            B();
        }
    }

    private final i y(b bVar, i iVar, boolean z) {
        if (bVar == null || bVar.f3874f == c.TERMINATED) {
            return iVar;
        }
        if (iVar.f3901f.r() == 0 && bVar.f3874f == c.BLOCKING) {
            return iVar;
        }
        bVar.f3878j = true;
        return bVar.f3873e.a(iVar, z);
    }

    private final boolean z(long j2) {
        int a;
        a = f.a(((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)), 0);
        if (a < this.f3866e) {
            int c2 = c();
            if (c2 == 1 && this.f3866e > 1) {
                c();
            }
            if (c2 > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        t(10000L);
    }

    public final i d(Runnable runnable, j jVar) {
        long a = l.f3904e.a();
        if (!(runnable instanceof i)) {
            return new k(runnable, a, jVar);
        }
        i iVar = (i) runnable;
        iVar.f3900e = a;
        iVar.f3901f = jVar;
        return iVar;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        i(this, runnable, null, false, 6, null);
    }

    public final void h(Runnable runnable, j jVar, boolean z) {
        d a = e.a();
        if (a != null) {
            a.d();
        }
        i d2 = d(runnable, jVar);
        b f2 = f();
        i y = y(f2, d2, z);
        if (y == null || b(y)) {
            boolean z2 = z && f2 != null;
            if (d2.f3901f.r() != 0) {
                w(z2);
            } else if (!z2) {
                x();
            }
        } else {
            throw new RejectedExecutionException(i.i(this.f3869h, " was terminated"));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
    public final boolean l() {
        return this._isTerminated;
    }

    public final boolean q(b bVar) {
        long j2;
        long j3;
        int f2;
        if (bVar.g() != o) {
            return false;
        }
        do {
            j2 = this.parkedWorkersStack;
            int i2 = (int) (2097151 & j2);
            j3 = (2097152 + j2) & (-2097152);
            f2 = bVar.f();
            if (o0.a()) {
                if (!(f2 != 0)) {
                    throw new AssertionError();
                }
            }
            bVar.o(this.f3872k.get(i2));
        } while (!l.compareAndSet(this, j2, f2 | j3));
        return true;
    }

    public final void r(b bVar, int i2, int i3) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i4 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i4 == i2) {
                i4 = i3 == 0 ? n(bVar) : i3;
            }
            if (i4 >= 0 && l.compareAndSet(this, j2, j3 | i4)) {
                return;
            }
        }
    }

    public final void s(i iVar) {
        try {
            iVar.run();
        } catch (Throwable th) {
            try {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
                d a = e.a();
                if (a == null) {
                }
            } finally {
                d a2 = e.a();
                if (a2 != null) {
                    a2.e();
                }
            }
        }
    }

    public final void t(long j2) {
        int i2;
        boolean z = false;
        if (n.compareAndSet(this, 0, 1)) {
            b f2 = f();
            synchronized (this.f3872k) {
                i2 = (int) (this.controlState & 2097151);
            }
            if (1 <= i2) {
                int i3 = 1;
                while (true) {
                    i3++;
                    b bVar = this.f3872k.get(i3);
                    i.b(bVar);
                    b bVar2 = bVar;
                    if (bVar2 != f2) {
                        while (bVar2.isAlive()) {
                            LockSupport.unpark(bVar2);
                            bVar2.join(j2);
                        }
                        c cVar = bVar2.f3874f;
                        if (o0.a()) {
                            if (!(cVar == c.TERMINATED)) {
                                throw new AssertionError();
                            }
                        }
                        bVar2.f3873e.g(this.f3871j);
                    }
                    if (i3 == i2) {
                        break;
                    }
                }
            }
            this.f3871j.b();
            this.f3870i.b();
            while (true) {
                i e2 = f2 == null ? null : f2.e(true);
                if (e2 == null && (e2 = this.f3870i.d()) == null && (e2 = this.f3871j.d()) == null) {
                    break;
                }
                s(e2);
            }
            if (f2 != null) {
                f2.r(c.TERMINATED);
            }
            if (o0.a()) {
                if (((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.f3866e) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    public String toString() {
        int i2;
        int i3;
        int i4;
        int i5;
        char c2;
        StringBuilder sb;
        ArrayList arrayList = new ArrayList();
        int length = this.f3872k.length();
        int i6 = 0;
        if (1 < length) {
            i4 = 0;
            int i7 = 0;
            i3 = 0;
            i2 = 0;
            int i8 = 1;
            while (true) {
                int i9 = i8 + 1;
                b bVar = this.f3872k.get(i8);
                if (bVar != null) {
                    int f2 = bVar.f3873e.f();
                    int i10 = C0156a.a[bVar.f3874f.ordinal()];
                    if (i10 != 1) {
                        if (i10 == 2) {
                            i4++;
                            sb = new StringBuilder();
                            sb.append(f2);
                            c2 = 'b';
                        } else if (i10 == 3) {
                            i7++;
                            sb = new StringBuilder();
                            sb.append(f2);
                            c2 = 'c';
                        } else if (i10 == 4) {
                            i3++;
                            if (f2 > 0) {
                                sb = new StringBuilder();
                                sb.append(f2);
                                c2 = 'd';
                            }
                        } else if (i10 == 5) {
                            i2++;
                        }
                        sb.append(c2);
                        arrayList.add(sb.toString());
                    } else {
                        i6++;
                    }
                }
                if (i9 >= length) {
                    break;
                }
                i8 = i9;
            }
            i5 = i6;
            i6 = i7;
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
            i2 = 0;
        }
        long j2 = this.controlState;
        return this.f3869h + '@' + p0.b(this) + "[Pool Size {core = " + this.f3866e + ", max = " + this.f3867f + "}, Worker States {CPU = " + i6 + ", blocking = " + i4 + ", parked = " + i5 + ", dormant = " + i3 + ", terminated = " + i2 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f3870i.c() + ", global blocking queue size = " + this.f3871j.c() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.f3866e - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }

    public final void x() {
        if (!B() && !A(this, 0L, 1, null)) {
            B();
        }
    }
}
