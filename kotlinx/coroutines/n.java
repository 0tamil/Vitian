package kotlinx.coroutines;

import j.r;
import j.u.d;
import j.u.g;
import j.u.j.a.e;
import j.x.c.l;
import j.x.d.i;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.n1;
/* loaded from: classes.dex */
public class n<T> extends s0<T> implements m<T>, e {

    /* renamed from: k  reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f3907k = AtomicIntegerFieldUpdater.newUpdater(n.class, "_decision");
    private static final /* synthetic */ AtomicReferenceFieldUpdater l = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_state");
    private volatile /* synthetic */ int _decision;
    private volatile /* synthetic */ Object _state;

    /* renamed from: h  reason: collision with root package name */
    private final d<T> f3908h;

    /* renamed from: i  reason: collision with root package name */
    private final g f3909i;

    /* renamed from: j  reason: collision with root package name */
    private w0 f3910j;

    /* JADX WARN: Multi-variable type inference failed */
    public n(d<? super T> dVar, int i2) {
        super(i2);
        this.f3908h = dVar;
        if (o0.a()) {
            if (!(i2 != -1)) {
                throw new AssertionError();
            }
        }
        this.f3909i = dVar.getContext();
        this._decision = 0;
        this._state = f.f3775e;
    }

    private final boolean A() {
        return t0.c(this.f3919g) && ((kotlinx.coroutines.internal.g) this.f3908h).o();
    }

    private final k B(l<? super Throwable, r> lVar) {
        return lVar instanceof k ? (k) lVar : new k1(lVar);
    }

    private final void C(l<? super Throwable, r> lVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + lVar + ", already has " + obj).toString());
    }

    private final void F() {
        d<T> dVar = this.f3908h;
        Throwable th = null;
        kotlinx.coroutines.internal.g gVar = dVar instanceof kotlinx.coroutines.internal.g ? (kotlinx.coroutines.internal.g) dVar : null;
        if (gVar != null) {
            th = gVar.s(this);
        }
        if (th != null) {
            s();
            q(th);
        }
    }

    private final void H(Object obj, int i2, l<? super Throwable, r> lVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof a2) {
            } else {
                if (obj2 instanceof q) {
                    q qVar = (q) obj2;
                    if (qVar.c()) {
                        if (lVar != null) {
                            o(lVar, qVar.a);
                            return;
                        }
                        return;
                    }
                }
                i(obj);
                throw null;
            }
        } while (!l.compareAndSet(this, obj2, J((a2) obj2, obj, i2, lVar, null)));
        t();
        u(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void I(n nVar, Object obj, int i2, l lVar, int i3, Object obj2) {
        if (obj2 == null) {
            if ((i3 & 4) != 0) {
                lVar = null;
            }
            nVar.H(obj, i2, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    private final Object J(a2 a2Var, Object obj, int i2, l<? super Throwable, r> lVar, Object obj2) {
        if (obj instanceof y) {
            boolean z = true;
            if (o0.a()) {
                if (!(obj2 == null)) {
                    throw new AssertionError();
                }
            }
            if (!o0.a()) {
                return obj;
            }
            if (lVar != null) {
                z = false;
            }
            if (z) {
                return obj;
            }
            throw new AssertionError();
        } else if (!t0.b(i2) && obj2 == null) {
            return obj;
        } else {
            if (lVar == null && ((!(a2Var instanceof k) || (a2Var instanceof g)) && obj2 == null)) {
                return obj;
            }
            return new x(obj, a2Var instanceof k ? (k) a2Var : null, lVar, obj2, null, 16, null);
        }
    }

    private final boolean K() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f3907k.compareAndSet(this, 0, 2));
        return true;
    }

    private final z L(Object obj, Object obj2, l<? super Throwable, r> lVar) {
        Object obj3;
        do {
            obj3 = this._state;
            if (obj3 instanceof a2) {
            } else if (!(obj3 instanceof x) || obj2 == null) {
                return null;
            } else {
                x xVar = (x) obj3;
                if (xVar.f3938d != obj2) {
                    return null;
                }
                if (!o0.a() || i.a(xVar.a, obj)) {
                    return o.a;
                }
                throw new AssertionError();
            }
        } while (!l.compareAndSet(this, obj3, J((a2) obj3, obj, this.f3919g, lVar, obj2)));
        t();
        return o.a;
    }

    private final boolean M() {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f3907k.compareAndSet(this, 0, 1));
        return true;
    }

    private final Void i(Object obj) {
        throw new IllegalStateException(i.i("Already resumed, but proposed with update ", obj).toString());
    }

    private final void l(l<? super Throwable, r> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new b0(i.i("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    private final boolean r(Throwable th) {
        if (!A()) {
            return false;
        }
        return ((kotlinx.coroutines.internal.g) this.f3908h).q(th);
    }

    private final void t() {
        if (!A()) {
            s();
        }
    }

    private final void u(int i2) {
        if (!K()) {
            t0.a(this, i2);
        }
    }

    private final String y() {
        Object x = x();
        return x instanceof a2 ? "Active" : x instanceof q ? "Cancelled" : "Completed";
    }

    private final w0 z() {
        n1 n1Var = (n1) getContext().get(n1.f3911d);
        if (n1Var == null) {
            return null;
        }
        w0 d2 = n1.a.d(n1Var, true, false, new r(this), 2, null);
        this.f3910j = d2;
        return d2;
    }

    protected String D() {
        return "CancellableContinuation";
    }

    public final void E(Throwable th) {
        if (!r(th)) {
            q(th);
            t();
        }
    }

    public final boolean G() {
        if (o0.a()) {
            if (!(this.f3919g == 2)) {
                throw new AssertionError();
            }
        }
        if (o0.a()) {
            if (!(this.f3910j != z1.f3949e)) {
                throw new AssertionError();
            }
        }
        Object obj = this._state;
        if (o0.a() && !(!(obj instanceof a2))) {
            throw new AssertionError();
        } else if (!(obj instanceof x) || ((x) obj).f3938d == null) {
            this._decision = 0;
            this._state = f.f3775e;
            return true;
        } else {
            s();
            return false;
        }
    }

    @Override // kotlinx.coroutines.m
    public Object a(T t, Object obj, l<? super Throwable, r> lVar) {
        return L(t, obj, lVar);
    }

    @Override // kotlinx.coroutines.s0
    public void b(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof a2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof y)) {
                if (obj2 instanceof x) {
                    x xVar = (x) obj2;
                    if (!xVar.c()) {
                        if (l.compareAndSet(this, obj2, x.b(xVar, null, null, null, null, th, 15, null))) {
                            xVar.d(this, th);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else if (l.compareAndSet(this, obj2, new x(obj2, null, null, null, th, 14, null))) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.s0
    public final d<T> c() {
        return this.f3908h;
    }

    @Override // kotlinx.coroutines.s0
    public Throwable d(Object obj) {
        Throwable j2;
        Throwable d2 = super.d(obj);
        if (d2 == null) {
            return null;
        }
        d<T> c = c();
        if (!o0.d() || !(c instanceof e)) {
            return d2;
        }
        j2 = y.j(d2, (e) c);
        return j2;
    }

    @Override // kotlinx.coroutines.m
    public Object e(T t, Object obj) {
        return L(t, obj, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.s0
    public <T> T f(Object obj) {
        return obj instanceof x ? (T) ((x) obj).a : obj;
    }

    @Override // j.u.j.a.e
    public e getCallerFrame() {
        d<T> dVar = this.f3908h;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @Override // j.u.d
    public g getContext() {
        return this.f3909i;
    }

    @Override // j.u.j.a.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.s0
    public Object h() {
        return x();
    }

    @Override // kotlinx.coroutines.m
    public void j(l<? super Throwable, r> lVar) {
        k B = B(lVar);
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof f)) {
                Throwable th = null;
                if (!(obj instanceof k)) {
                    boolean z = obj instanceof y;
                    if (z) {
                        y yVar = (y) obj;
                        if (!yVar.b()) {
                            C(lVar, obj);
                            throw null;
                        } else if (obj instanceof q) {
                            if (!z) {
                                yVar = null;
                            }
                            if (yVar != null) {
                                th = yVar.a;
                            }
                            l(lVar, th);
                            return;
                        } else {
                            return;
                        }
                    } else if (obj instanceof x) {
                        x xVar = (x) obj;
                        if (xVar.b != null) {
                            C(lVar, obj);
                            throw null;
                        } else if (!(B instanceof g)) {
                            if (xVar.c()) {
                                l(lVar, xVar.f3939e);
                                return;
                            }
                            if (l.compareAndSet(this, obj, x.b(xVar, null, B, null, null, null, 29, null))) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!(B instanceof g)) {
                        if (l.compareAndSet(this, obj, new x(obj, B, null, null, null, 28, null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    C(lVar, obj);
                    throw null;
                }
            } else if (l.compareAndSet(this, obj, B)) {
                return;
            }
        }
    }

    @Override // kotlinx.coroutines.m
    public void k(T t, l<? super Throwable, r> lVar) {
        H(t, this.f3919g, lVar);
    }

    @Override // kotlinx.coroutines.m
    public Object m(Throwable th) {
        return L(new y(th, false, 2, null), null, null);
    }

    public final void n(k kVar, Throwable th) {
        try {
            kVar.a(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new b0(i.i("Exception in invokeOnCancellation handler for ", this), th2));
        }
    }

    public final void o(l<? super Throwable, r> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            h0.a(getContext(), new b0(i.i("Exception in resume onCancellation handler for ", this), th2));
        }
    }

    @Override // kotlinx.coroutines.m
    public void p(Object obj) {
        if (o0.a()) {
            if (!(obj == o.a)) {
                throw new AssertionError();
            }
        }
        u(this.f3919g);
    }

    public boolean q(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof a2)) {
                return false;
            }
            z = obj instanceof k;
        } while (!l.compareAndSet(this, obj, new q(this, th, z)));
        k kVar = z ? (k) obj : null;
        if (kVar != null) {
            n(kVar, th);
        }
        t();
        u(this.f3919g);
        return true;
    }

    @Override // j.u.d
    public void resumeWith(Object obj) {
        I(this, c0.c(obj, this), this.f3919g, null, 4, null);
    }

    public final void s() {
        w0 w0Var = this.f3910j;
        if (w0Var != null) {
            w0Var.a();
            this.f3910j = z1.f3949e;
        }
    }

    public String toString() {
        return D() + '(' + p0.c(this.f3908h) + "){" + y() + "}@" + p0.b(this);
    }

    public Throwable v(n1 n1Var) {
        return n1Var.h();
    }

    public final Object w() {
        n1 n1Var;
        Throwable j2;
        Throwable j3;
        Object c;
        boolean A = A();
        if (M()) {
            if (this.f3910j == null) {
                z();
            }
            if (A) {
                F();
            }
            c = j.u.i.d.c();
            return c;
        }
        if (A) {
            F();
        }
        Object x = x();
        if (x instanceof y) {
            Throwable th = ((y) x).a;
            if (!o0.d()) {
                throw th;
            }
            j3 = y.j(th, this);
            throw j3;
        } else if (!t0.b(this.f3919g) || (n1Var = (n1) getContext().get(n1.f3911d)) == null || n1Var.b()) {
            return f(x);
        } else {
            CancellationException h2 = n1Var.h();
            b(x, h2);
            if (!o0.d()) {
                throw h2;
            }
            j2 = y.j(h2, this);
            throw j2;
        }
    }

    public final Object x() {
        return this._state;
    }
}
