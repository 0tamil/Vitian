package kotlinx.coroutines.j2;

import j.j;
import j.r;
import j.x.c.l;
import j.x.d.i;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.o;
import kotlinx.coroutines.o0;
/* loaded from: classes.dex */
public class d<E> extends kotlinx.coroutines.j2.a<E> {

    /* renamed from: d  reason: collision with root package name */
    private final int f3828d;

    /* renamed from: e  reason: collision with root package name */
    private final e f3829e;

    /* renamed from: f  reason: collision with root package name */
    private final ReentrantLock f3830f;

    /* renamed from: g  reason: collision with root package name */
    private Object[] f3831g;

    /* renamed from: h  reason: collision with root package name */
    private int f3832h;
    private volatile /* synthetic */ int size;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[e.values().length];
            iArr[e.SUSPEND.ordinal()] = 1;
            iArr[e.DROP_LATEST.ordinal()] = 2;
            iArr[e.DROP_OLDEST.ordinal()] = 3;
            a = iArr;
        }
    }

    public d(int i2, e eVar, l<? super E, r> lVar) {
        super(lVar);
        this.f3828d = i2;
        this.f3829e = eVar;
        if (i2 < 1 ? false : true) {
            this.f3830f = new ReentrantLock();
            Object[] objArr = new Object[Math.min(i2, 8)];
            j.s.d.e(objArr, b.a, 0, 0, 6, null);
            r rVar = r.a;
            this.f3831g = objArr;
            this.size = 0;
            return;
        }
        throw new IllegalArgumentException(("ArrayChannel capacity must be at least 1, but " + i2 + " was specified").toString());
    }

    private final void x(int i2, E e2) {
        if (i2 < this.f3828d) {
            y(i2);
            Object[] objArr = this.f3831g;
            objArr[(this.f3832h + i2) % objArr.length] = e2;
            return;
        }
        if (o0.a()) {
            if (!(this.f3829e == e.DROP_OLDEST)) {
                throw new AssertionError();
            }
        }
        Object[] objArr2 = this.f3831g;
        int i3 = this.f3832h;
        objArr2[i3 % objArr2.length] = null;
        objArr2[(i2 + i3) % objArr2.length] = e2;
        this.f3832h = (i3 + 1) % objArr2.length;
    }

    private final void y(int i2) {
        Object[] objArr = this.f3831g;
        if (i2 >= objArr.length) {
            int min = Math.min(objArr.length * 2, this.f3828d);
            Object[] objArr2 = new Object[min];
            if (i2 > 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3 + 1;
                    Object[] objArr3 = this.f3831g;
                    objArr2[i3] = objArr3[(this.f3832h + i3) % objArr3.length];
                    if (i4 >= i2) {
                        break;
                    }
                    i3 = i4;
                }
            }
            j.s.d.d(objArr2, b.a, i2, min);
            this.f3831g = objArr2;
            this.f3832h = 0;
        }
    }

    private final z z(int i2) {
        if (i2 < this.f3828d) {
            this.size = i2 + 1;
            return null;
        }
        int i3 = a.a[this.f3829e.ordinal()];
        if (i3 == 1) {
            return b.c;
        }
        if (i3 == 2) {
            return b.b;
        }
        if (i3 == 3) {
            return null;
        }
        throw new j();
    }

    @Override // kotlinx.coroutines.j2.c
    protected String c() {
        return "(buffer:capacity=" + this.f3828d + ",size=" + this.size + ')';
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.j2.c
    public Object i(E e2) {
        q<E> l;
        z d2;
        ReentrantLock reentrantLock = this.f3830f;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            j<?> d3 = d();
            if (d3 != null) {
                return d3;
            }
            z z = z(i2);
            if (z != null) {
                return z;
            }
            if (i2 == 0) {
                do {
                    l = l();
                    if (l != null) {
                        if (l instanceof j) {
                            this.size = i2;
                            return l;
                        }
                        d2 = l.d(e2, null);
                    }
                } while (d2 == null);
                if (o0.a()) {
                    if (!(d2 == o.a)) {
                        throw new AssertionError();
                    }
                }
                this.size = i2;
                r rVar = r.a;
                reentrantLock.unlock();
                l.g(e2);
                return l.c();
            }
            x(i2, e2);
            return b.b;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.j2.a
    public boolean q(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f3830f;
        reentrantLock.lock();
        try {
            return super.q(oVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // kotlinx.coroutines.j2.a
    protected final boolean r() {
        return false;
    }

    @Override // kotlinx.coroutines.j2.a
    protected final boolean s() {
        return this.size == 0;
    }

    @Override // kotlinx.coroutines.j2.a
    protected Object v() {
        ReentrantLock reentrantLock = this.f3830f;
        reentrantLock.lock();
        try {
            int i2 = this.size;
            if (i2 == 0) {
                Object d2 = d();
                if (d2 == null) {
                    d2 = b.f3826d;
                }
                return d2;
            }
            Object[] objArr = this.f3831g;
            int i3 = this.f3832h;
            Object obj = objArr[i3];
            s sVar = null;
            objArr[i3] = null;
            this.size = i2 - 1;
            Object obj2 = b.f3826d;
            boolean z = false;
            if (i2 == this.f3828d) {
                s sVar2 = null;
                while (true) {
                    s m = m();
                    if (m == null) {
                        sVar = sVar2;
                        break;
                    }
                    z A = m.A(null);
                    if (A != null) {
                        if (o0.a()) {
                            if (A == o.a) {
                                z = true;
                            }
                            if (!z) {
                                throw new AssertionError();
                            }
                        }
                        obj2 = m.z();
                        sVar = m;
                        z = true;
                    } else {
                        m.B();
                        sVar2 = m;
                    }
                }
            }
            if (obj2 != b.f3826d && !(obj2 instanceof j)) {
                this.size = i2;
                Object[] objArr2 = this.f3831g;
                objArr2[(this.f3832h + i2) % objArr2.length] = obj2;
            }
            this.f3832h = (this.f3832h + 1) % this.f3831g.length;
            r rVar = r.a;
            if (z) {
                i.b(sVar);
                sVar.y();
            }
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
