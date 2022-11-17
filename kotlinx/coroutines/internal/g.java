package kotlinx.coroutines.internal;

import j.r;
import j.u.d;
import j.u.j.a.e;
import j.x.d.i;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.f0;
import kotlinx.coroutines.m;
import kotlinx.coroutines.n;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.s0;
import kotlinx.coroutines.y0;
import kotlinx.coroutines.z;
/* loaded from: classes.dex */
public final class g<T> extends s0<T> implements e, d<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(g.class, Object.class, "_reusableCancellableContinuation");

    /* renamed from: h  reason: collision with root package name */
    public final f0 f3794h;

    /* renamed from: i  reason: collision with root package name */
    public final d<T> f3795i;

    /* renamed from: j  reason: collision with root package name */
    public Object f3796j = h.a();

    /* renamed from: k  reason: collision with root package name */
    public final Object f3797k = d0.b(getContext());
    private volatile /* synthetic */ Object _reusableCancellableContinuation = null;

    /* JADX WARN: Multi-variable type inference failed */
    public g(f0 f0Var, d<? super T> dVar) {
        super(-1);
        this.f3794h = f0Var;
        this.f3795i = dVar;
    }

    private final n<?> n() {
        Object obj = this._reusableCancellableContinuation;
        if (obj instanceof n) {
            return (n) obj;
        }
        return null;
    }

    @Override // kotlinx.coroutines.s0
    public void b(Object obj, Throwable th) {
        if (obj instanceof z) {
            ((z) obj).b.invoke(th);
        }
    }

    @Override // kotlinx.coroutines.s0
    public d<T> c() {
        return this;
    }

    @Override // j.u.j.a.e
    public e getCallerFrame() {
        d<T> dVar = this.f3795i;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @Override // j.u.d
    public j.u.g getContext() {
        return this.f3795i.getContext();
    }

    @Override // j.u.j.a.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.s0
    public Object h() {
        Object obj = this.f3796j;
        if (o0.a()) {
            if (!(obj != h.a())) {
                throw new AssertionError();
            }
        }
        this.f3796j = h.a();
        return obj;
    }

    public final void i() {
        do {
        } while (this._reusableCancellableContinuation == h.b);
    }

    public final n<T> l() {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            if (obj == null) {
                this._reusableCancellableContinuation = h.b;
                return null;
            } else if (obj instanceof n) {
                if (l.compareAndSet(this, obj, h.b)) {
                    return (n) obj;
                }
            } else if (obj != h.b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(i.i("Inconsistent state ", obj).toString());
            }
        }
    }

    public final boolean o() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean q(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            z zVar = h.b;
            if (i.a(obj, zVar)) {
                if (l.compareAndSet(this, zVar, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (l.compareAndSet(this, obj, null)) {
                    return false;
                }
            }
        }
    }

    public final void r() {
        i();
        n<?> n = n();
        if (n != null) {
            n.s();
        }
    }

    @Override // j.u.d
    public void resumeWith(Object obj) {
        j.u.g context = this.f3795i.getContext();
        Object d2 = c0.d(obj, null, 1, null);
        if (this.f3794h.x(context)) {
            this.f3796j = d2;
            this.f3919g = 0;
            this.f3794h.w(context, this);
            return;
        }
        o0.a();
        y0 a = e2.a.a();
        if (a.E()) {
            this.f3796j = d2;
            this.f3919g = 0;
            a.A(this);
            return;
        }
        a.C(true);
        try {
            j.u.g context2 = getContext();
            Object c = d0.c(context2, this.f3797k);
            this.f3795i.resumeWith(obj);
            r rVar = r.a;
            d0.a(context2, c);
            do {
            } while (a.G());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final Throwable s(m<?> mVar) {
        z zVar;
        do {
            Object obj = this._reusableCancellableContinuation;
            zVar = h.b;
            if (obj != zVar) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(i.i("Inconsistent state ", obj).toString());
                } else if (l.compareAndSet(this, obj, null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!l.compareAndSet(this, zVar, mVar));
        return null;
    }

    public String toString() {
        return "DispatchedContinuation[" + this.f3794h + ", " + p0.c(this.f3795i) + ']';
    }
}
