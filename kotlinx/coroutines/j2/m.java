package kotlinx.coroutines.j2;

import j.r;
import j.x.c.l;
import java.util.concurrent.locks.ReentrantLock;
import kotlinx.coroutines.internal.h0;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.o;
import kotlinx.coroutines.o0;
/* loaded from: classes.dex */
public class m<E> extends a<E> {

    /* renamed from: d  reason: collision with root package name */
    private final ReentrantLock f3838d = new ReentrantLock();

    /* renamed from: e  reason: collision with root package name */
    private Object f3839e = b.a;

    public m(l<? super E, r> lVar) {
        super(lVar);
    }

    private final h0 x(Object obj) {
        l<E, r> lVar;
        Object obj2 = this.f3839e;
        h0 h0Var = null;
        if (!(obj2 == b.a || (lVar = this.b) == null)) {
            h0Var = u.d(lVar, obj2, null, 2, null);
        }
        this.f3839e = obj;
        return h0Var;
    }

    @Override // kotlinx.coroutines.j2.c
    protected String c() {
        return "(value=" + this.f3839e + ')';
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.j2.c
    public Object i(E e2) {
        q<E> l;
        z d2;
        ReentrantLock reentrantLock = this.f3838d;
        reentrantLock.lock();
        try {
            j<?> d3 = d();
            if (d3 != null) {
                return d3;
            }
            if (this.f3839e == b.a) {
                do {
                    l = l();
                    if (l != null) {
                        if (l instanceof j) {
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
                r rVar = r.a;
                reentrantLock.unlock();
                l.g(e2);
                return l.c();
            }
            h0 x = x(e2);
            if (x == null) {
                return b.b;
            }
            throw x;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.j2.a
    public boolean q(o<? super E> oVar) {
        ReentrantLock reentrantLock = this.f3838d;
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
        return this.f3839e == b.a;
    }

    @Override // kotlinx.coroutines.j2.a
    protected Object v() {
        ReentrantLock reentrantLock = this.f3838d;
        reentrantLock.lock();
        try {
            Object obj = this.f3839e;
            z zVar = b.a;
            if (obj == zVar) {
                Object d2 = d();
                if (d2 == null) {
                    d2 = b.f3826d;
                }
                return d2;
            }
            this.f3839e = zVar;
            r rVar = r.a;
            return obj;
        } finally {
            reentrantLock.unlock();
        }
    }
}
