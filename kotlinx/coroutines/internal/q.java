package kotlinx.coroutines.internal;

import j.x.d.e;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.o0;
/* loaded from: classes.dex */
public final class q<E> {
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;
    private final int a;
    private final boolean b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private /* synthetic */ AtomicReferenceArray f3812d;

    /* renamed from: e  reason: collision with root package name */
    public static final a f3808e = new a(null);

    /* renamed from: h  reason: collision with root package name */
    public static final z f3811h = new z("REMOVE_FROZEN");

    /* renamed from: f  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3809f = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next");

    /* renamed from: g  reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f3810g = AtomicLongFieldUpdater.newUpdater(q.class, "_state");

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(e eVar) {
            this();
        }

        public final int a(long j2) {
            return (j2 & 2305843009213693952L) != 0 ? 2 : 1;
        }

        public final long b(long j2, int i2) {
            return d(j2, 1073741823L) | (i2 << 0);
        }

        public final long c(long j2, int i2) {
            return d(j2, 1152921503533105152L) | (i2 << 30);
        }

        public final long d(long j2, long j3) {
            return j2 & (~j3);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public final int a;

        public b(int i2) {
            this.a = i2;
        }
    }

    public q(int i2, boolean z) {
        this.a = i2;
        this.b = z;
        int i3 = i2 - 1;
        this.c = i3;
        this.f3812d = new AtomicReferenceArray(i2);
        boolean z2 = false;
        if (i3 <= 1073741823) {
            if (!((i2 & i3) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final q<E> b(long j2) {
        q<E> qVar = new q<>(this.a * 2, this.b);
        int i2 = (int) ((1073741823 & j2) >> 0);
        int i3 = (int) ((1152921503533105152L & j2) >> 30);
        while (true) {
            int i4 = this.c;
            if ((i2 & i4) != (i3 & i4)) {
                Object obj = this.f3812d.get(i4 & i2);
                if (obj == null) {
                    obj = new b(i2);
                }
                qVar.f3812d.set(qVar.c & i2, obj);
                i2++;
            } else {
                qVar._state = f3808e.d(j2, 1152921504606846976L);
                return qVar;
            }
        }
    }

    private final q<E> c(long j2) {
        while (true) {
            q<E> qVar = (q) this._next;
            if (qVar != null) {
                return qVar;
            }
            f3809f.compareAndSet(this, null, b(j2));
        }
    }

    private final q<E> e(int i2, E e2) {
        Object obj = this.f3812d.get(this.c & i2);
        if (!(obj instanceof b) || ((b) obj).a != i2) {
            return null;
        }
        this.f3812d.set(i2 & this.c, e2);
        return this;
    }

    private final long h() {
        long j2;
        long j3;
        do {
            j2 = this._state;
            if ((j2 & 1152921504606846976L) != 0) {
                return j2;
            }
            j3 = j2 | 1152921504606846976L;
        } while (!f3810g.compareAndSet(this, j2, j3));
        return j3;
    }

    private final q<E> k(int i2, int i3) {
        long j2;
        a aVar;
        int i4;
        do {
            j2 = this._state;
            aVar = f3808e;
            boolean z = false;
            i4 = (int) ((1073741823 & j2) >> 0);
            if (o0.a()) {
                if (i4 == i2) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j2) != 0) {
                return i();
            }
        } while (!f3810g.compareAndSet(this, j2, aVar.b(j2, i3)));
        this.f3812d.set(this.c & i4, null);
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(E e2) {
        while (true) {
            long j2 = this._state;
            if ((3458764513820540928L & j2) != 0) {
                return f3808e.a(j2);
            }
            a aVar = f3808e;
            int i2 = (int) ((1073741823 & j2) >> 0);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i4 = this.c;
            if (((i3 + 2) & i4) == (i2 & i4)) {
                return 1;
            }
            if (!this.b && this.f3812d.get(i3 & i4) != null) {
                int i5 = this.a;
                if (i5 < 1024 || ((i3 - i2) & 1073741823) > (i5 >> 1)) {
                    break;
                }
            } else if (f3810g.compareAndSet(this, j2, aVar.c(j2, (i3 + 1) & 1073741823))) {
                this.f3812d.set(i3 & i4, e2);
                q<E> qVar = this;
                while ((qVar._state & 1152921504606846976L) != 0 && (qVar = qVar.i().e(i3, e2)) != null) {
                }
                return 0;
            }
        }
    }

    public final boolean d() {
        long j2;
        do {
            j2 = this._state;
            if ((j2 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j2) != 0) {
                return false;
            }
        } while (!f3810g.compareAndSet(this, j2, j2 | 2305843009213693952L));
        return true;
    }

    public final int f() {
        long j2 = this._state;
        return 1073741823 & (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j2) >> 0)));
    }

    public final boolean g() {
        long j2 = this._state;
        return ((int) ((1073741823 & j2) >> 0)) == ((int) ((j2 & 1152921503533105152L) >> 30));
    }

    public final q<E> i() {
        return c(h());
    }

    public final Object j() {
        while (true) {
            long j2 = this._state;
            if ((1152921504606846976L & j2) != 0) {
                return f3811h;
            }
            a aVar = f3808e;
            int i2 = (int) ((1073741823 & j2) >> 0);
            int i3 = (int) ((1152921503533105152L & j2) >> 30);
            int i4 = this.c;
            if ((i3 & i4) == (i2 & i4)) {
                return null;
            }
            Object obj = this.f3812d.get(i4 & i2);
            if (obj == null) {
                if (this.b) {
                    return null;
                }
            } else if (obj instanceof b) {
                return null;
            } else {
                int i5 = (i2 + 1) & 1073741823;
                if (f3810g.compareAndSet(this, j2, aVar.b(j2, i5))) {
                    this.f3812d.set(this.c & i2, null);
                    return obj;
                } else if (this.b) {
                    q<E> qVar = this;
                    do {
                        qVar = qVar.k(i2, i5);
                    } while (qVar != null);
                    return obj;
                }
            }
        }
    }
}
