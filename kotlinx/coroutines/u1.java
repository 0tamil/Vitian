package kotlinx.coroutines;

import j.r;
import j.u.g;
import j.x.c.l;
import j.x.c.p;
import j.x.d.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.internal.n;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.v;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.n1;
/* loaded from: classes.dex */
public class u1 implements n1, u, b2 {

    /* renamed from: e  reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f3923e = AtomicReferenceFieldUpdater.newUpdater(u1.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a extends t1 {

        /* renamed from: i  reason: collision with root package name */
        private final u1 f3924i;

        /* renamed from: j  reason: collision with root package name */
        private final b f3925j;

        /* renamed from: k  reason: collision with root package name */
        private final t f3926k;
        private final Object l;

        public a(u1 u1Var, b bVar, t tVar, Object obj) {
            this.f3924i = u1Var;
            this.f3925j = bVar;
            this.f3926k = tVar;
            this.l = obj;
        }

        @Override // j.x.c.l
        public /* bridge */ /* synthetic */ r invoke(Throwable th) {
            y(th);
            return r.a;
        }

        @Override // kotlinx.coroutines.a0
        public void y(Throwable th) {
            this.f3924i.E(this.f3925j, this.f3926k, this.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b implements i1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: e  reason: collision with root package name */
        private final y1 f3927e;

        public b(y1 y1Var, boolean z, Throwable th) {
            this.f3927e = y1Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return this._exceptionsHolder;
        }

        private final void l(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Throwable th) {
            Throwable e2 = e();
            if (e2 == null) {
                m(th);
            } else if (th != e2) {
                Object d2 = d();
                if (d2 == null) {
                    l(th);
                } else if (d2 instanceof Throwable) {
                    if (th != d2) {
                        ArrayList<Throwable> c = c();
                        c.add(d2);
                        c.add(th);
                        r rVar = r.a;
                        l(c);
                    }
                } else if (d2 instanceof ArrayList) {
                    ((ArrayList) d2).add(th);
                } else {
                    throw new IllegalStateException(i.i("State is ", d2).toString());
                }
            }
        }

        @Override // kotlinx.coroutines.i1
        public boolean b() {
            return e() == null;
        }

        public final Throwable e() {
            return (Throwable) this._rootCause;
        }

        @Override // kotlinx.coroutines.i1
        public y1 f() {
            return this.f3927e;
        }

        public final boolean g() {
            return e() != null;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [int, boolean] */
        public final boolean h() {
            return this._isCompleting;
        }

        public final boolean i() {
            z zVar;
            Object d2 = d();
            zVar = v1.f3934e;
            return d2 == zVar;
        }

        public final List<Throwable> j(Throwable th) {
            ArrayList<Throwable> arrayList;
            z zVar;
            Object d2 = d();
            if (d2 == null) {
                arrayList = c();
            } else if (d2 instanceof Throwable) {
                ArrayList<Throwable> c = c();
                c.add(d2);
                arrayList = c;
            } else if (d2 instanceof ArrayList) {
                arrayList = (ArrayList) d2;
            } else {
                throw new IllegalStateException(i.i("State is ", d2).toString());
            }
            Throwable e2 = e();
            if (e2 != null) {
                arrayList.add(0, e2);
            }
            if (th != null && !i.a(th, e2)) {
                arrayList.add(th);
            }
            zVar = v1.f3934e;
            l(zVar);
            return arrayList;
        }

        public final void k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        public final void m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + g() + ", completing=" + h() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + f() + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends o.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ u1 f3928d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Object f3929e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(o oVar, u1 u1Var, Object obj) {
            super(oVar);
            this.f3928d = u1Var;
            this.f3929e = obj;
        }

        /* renamed from: i */
        public Object g(o oVar) {
            if (this.f3928d.O() == this.f3929e) {
                return null;
            }
            return n.a();
        }
    }

    public u1(boolean z) {
        this._state = z ? v1.f3936g : v1.f3935f;
        this._parentHandle = null;
    }

    private final boolean A(Throwable th) {
        if (T()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        s N = N();
        return (N == null || N == z1.f3949e) ? z : N.e(th) || z;
    }

    private final void D(i1 i1Var, Object obj) {
        s N = N();
        if (N != null) {
            N.a();
            h0(z1.f3949e);
        }
        Throwable th = null;
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar != null) {
            th = yVar.a;
        }
        if (i1Var instanceof t1) {
            try {
                ((t1) i1Var).y(th);
            } catch (Throwable th2) {
                Q(new b0("Exception in completion handler " + i1Var + " for " + this, th2));
            }
        } else {
            y1 f2 = i1Var.f();
            if (f2 != null) {
                a0(f2, th);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(b bVar, t tVar, Object obj) {
        if (o0.a()) {
            if (!(O() == bVar)) {
                throw new AssertionError();
            }
        }
        t Y = Y(tVar);
        if (Y == null || !r0(bVar, Y, obj)) {
            w(G(bVar, obj));
        }
    }

    private final Throwable F(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new o1(B(), null, this) : th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((b2) obj).d();
    }

    private final Object G(b bVar, Object obj) {
        boolean g2;
        Throwable J;
        boolean z = true;
        if (o0.a()) {
            if (!(O() == bVar)) {
                throw new AssertionError();
            }
        }
        if (o0.a() && !(!bVar.i())) {
            throw new AssertionError();
        } else if (!o0.a() || bVar.h()) {
            y yVar = obj instanceof y ? (y) obj : null;
            Throwable th = yVar == null ? null : yVar.a;
            synchronized (bVar) {
                g2 = bVar.g();
                List<Throwable> j2 = bVar.j(th);
                J = J(bVar, j2);
                if (J != null) {
                    v(J, j2);
                }
            }
            if (!(J == null || J == th)) {
                obj = new y(J, false, 2, null);
            }
            if (J != null) {
                if (!A(J) && !P(J)) {
                    z = false;
                }
                if (z) {
                    Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                    ((y) obj).b();
                }
            }
            if (!g2) {
                b0(J);
            }
            c0(obj);
            boolean compareAndSet = f3923e.compareAndSet(this, bVar, v1.g(obj));
            if (!o0.a() || compareAndSet) {
                D(bVar, obj);
                return obj;
            }
            throw new AssertionError();
        } else {
            throw new AssertionError();
        }
    }

    private final t H(i1 i1Var) {
        t tVar = i1Var instanceof t ? (t) i1Var : null;
        if (tVar != null) {
            return tVar;
        }
        y1 f2 = i1Var.f();
        if (f2 == null) {
            return null;
        }
        return Y(f2);
    }

    private final Throwable I(Object obj) {
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar == null) {
            return null;
        }
        return yVar.a;
    }

    private final Throwable J(b bVar, List<? extends Throwable> list) {
        Object obj = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (!(((Throwable) next) instanceof CancellationException)) {
                    obj = next;
                    break;
                }
            }
            Throwable th = (Throwable) obj;
            return th != null ? th : list.get(0);
        } else if (bVar.g()) {
            return new o1(B(), null, this);
        } else {
            return null;
        }
    }

    private final y1 M(i1 i1Var) {
        y1 f2 = i1Var.f();
        if (f2 != null) {
            return f2;
        }
        if (i1Var instanceof x0) {
            return new y1();
        }
        if (i1Var instanceof t1) {
            f0((t1) i1Var);
            return null;
        }
        throw new IllegalStateException(i.i("State should have list: ", i1Var).toString());
    }

    private final Object U(Object obj) {
        z zVar;
        z zVar2;
        z zVar3;
        z zVar4;
        z zVar5;
        z zVar6;
        Throwable th = null;
        Throwable th2 = null;
        while (true) {
            Object O = O();
            if (O instanceof b) {
                synchronized (O) {
                    if (((b) O).i()) {
                        zVar2 = v1.f3933d;
                        return zVar2;
                    }
                    boolean g2 = ((b) O).g();
                    if (obj != null || !g2) {
                        if (th2 == null) {
                            th2 = F(obj);
                        }
                        ((b) O).a(th2);
                    }
                    th = ((b) O).e();
                    if (!g2) {
                    }
                    if (th != null) {
                        Z(((b) O).f(), th);
                    }
                    zVar = v1.a;
                    return zVar;
                }
            } else if (O instanceof i1) {
                if (th2 == null) {
                    th2 = F(obj);
                }
                i1 i1Var = (i1) O;
                if (!i1Var.b()) {
                    Object p0 = p0(O, new y(th2, false, 2, null));
                    zVar5 = v1.a;
                    if (p0 != zVar5) {
                        zVar6 = v1.c;
                        if (p0 != zVar6) {
                            return p0;
                        }
                    } else {
                        throw new IllegalStateException(i.i("Cannot happen in ", O).toString());
                    }
                } else if (o0(i1Var, th2)) {
                    zVar4 = v1.a;
                    return zVar4;
                }
            } else {
                zVar3 = v1.f3933d;
                return zVar3;
            }
        }
    }

    private final t1 W(l<? super Throwable, r> lVar, boolean z) {
        t1 t1Var = null;
        if (z) {
            if (lVar instanceof p1) {
                t1Var = (p1) lVar;
            }
            if (t1Var == null) {
                t1Var = new l1(lVar);
            }
        } else {
            t1 t1Var2 = lVar instanceof t1 ? (t1) lVar : null;
            if (t1Var2 != null) {
                if (!o0.a() || (!(t1Var2 instanceof p1))) {
                    t1Var = t1Var2;
                } else {
                    throw new AssertionError();
                }
            }
            if (t1Var == null) {
                t1Var = new m1(lVar);
            }
        }
        t1Var.A(this);
        return t1Var;
    }

    private final t Y(o oVar) {
        while (oVar.t()) {
            oVar = oVar.q();
        }
        while (true) {
            oVar = oVar.p();
            if (!oVar.t()) {
                if (oVar instanceof t) {
                    return (t) oVar;
                }
                if (oVar instanceof y1) {
                    return null;
                }
            }
        }
    }

    private final void Z(y1 y1Var, Throwable th) {
        b0 b0Var;
        b0(th);
        b0 b0Var2 = null;
        for (o oVar = (o) y1Var.o(); !i.a(oVar, y1Var); oVar = oVar.p()) {
            if (oVar instanceof p1) {
                t1 t1Var = (t1) oVar;
                try {
                    t1Var.y(th);
                } catch (Throwable th2) {
                    if (b0Var2 == null) {
                        b0Var = null;
                    } else {
                        j.b.a(b0Var2, th2);
                        b0Var = b0Var2;
                    }
                    if (b0Var == null) {
                        b0Var2 = new b0("Exception in completion handler " + t1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (b0Var2 != null) {
            Q(b0Var2);
        }
        A(th);
    }

    private final void a0(y1 y1Var, Throwable th) {
        b0 b0Var;
        b0 b0Var2 = null;
        for (o oVar = (o) y1Var.o(); !i.a(oVar, y1Var); oVar = oVar.p()) {
            if (oVar instanceof t1) {
                t1 t1Var = (t1) oVar;
                try {
                    t1Var.y(th);
                } catch (Throwable th2) {
                    if (b0Var2 == null) {
                        b0Var = null;
                    } else {
                        j.b.a(b0Var2, th2);
                        b0Var = b0Var2;
                    }
                    if (b0Var == null) {
                        b0Var2 = new b0("Exception in completion handler " + t1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (b0Var2 != null) {
            Q(b0Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [kotlinx.coroutines.h1] */
    private final void e0(x0 x0Var) {
        y1 y1Var = new y1();
        y1 y1Var2 = y1Var;
        if (!x0Var.b()) {
            y1Var2 = new h1(y1Var);
        }
        f3923e.compareAndSet(this, x0Var, y1Var2);
    }

    private final void f0(t1 t1Var) {
        t1Var.k(new y1());
        f3923e.compareAndSet(this, t1Var, t1Var.p());
    }

    private final int i0(Object obj) {
        x0 x0Var;
        if (obj instanceof x0) {
            if (((x0) obj).b()) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3923e;
            x0Var = v1.f3936g;
            if (!atomicReferenceFieldUpdater.compareAndSet(this, obj, x0Var)) {
                return -1;
            }
            d0();
            return 1;
        } else if (!(obj instanceof h1)) {
            return 0;
        } else {
            if (!f3923e.compareAndSet(this, obj, ((h1) obj).f())) {
                return -1;
            }
            d0();
            return 1;
        }
    }

    private final String j0(Object obj) {
        if (!(obj instanceof b)) {
            return obj instanceof i1 ? ((i1) obj).b() ? "Active" : "New" : obj instanceof y ? "Cancelled" : "Completed";
        }
        b bVar = (b) obj;
        return bVar.g() ? "Cancelling" : bVar.h() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException l0(u1 u1Var, Throwable th, String str, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                str = null;
            }
            return u1Var.k0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    private final boolean n0(i1 i1Var, Object obj) {
        if (o0.a()) {
            if (!((i1Var instanceof x0) || (i1Var instanceof t1))) {
                throw new AssertionError();
            }
        }
        if (o0.a() && !(!(obj instanceof y))) {
            throw new AssertionError();
        } else if (!f3923e.compareAndSet(this, i1Var, v1.g(obj))) {
            return false;
        } else {
            b0(null);
            c0(obj);
            D(i1Var, obj);
            return true;
        }
    }

    private final boolean o0(i1 i1Var, Throwable th) {
        if (o0.a() && !(!(i1Var instanceof b))) {
            throw new AssertionError();
        } else if (!o0.a() || i1Var.b()) {
            y1 M = M(i1Var);
            if (M == null) {
                return false;
            }
            if (!f3923e.compareAndSet(this, i1Var, new b(M, false, th))) {
                return false;
            }
            Z(M, th);
            return true;
        } else {
            throw new AssertionError();
        }
    }

    private final Object p0(Object obj, Object obj2) {
        z zVar;
        z zVar2;
        if (!(obj instanceof i1)) {
            zVar2 = v1.a;
            return zVar2;
        } else if ((!(obj instanceof x0) && !(obj instanceof t1)) || (obj instanceof t) || (obj2 instanceof y)) {
            return q0((i1) obj, obj2);
        } else {
            if (n0((i1) obj, obj2)) {
                return obj2;
            }
            zVar = v1.c;
            return zVar;
        }
    }

    private final Object q0(i1 i1Var, Object obj) {
        z zVar;
        z zVar2;
        z zVar3;
        y1 M = M(i1Var);
        if (M == null) {
            zVar3 = v1.c;
            return zVar3;
        }
        Throwable th = null;
        b bVar = i1Var instanceof b ? (b) i1Var : null;
        if (bVar == null) {
            bVar = new b(M, false, null);
        }
        synchronized (bVar) {
            if (bVar.h()) {
                zVar2 = v1.a;
                return zVar2;
            }
            bVar.k(true);
            if (bVar == i1Var || f3923e.compareAndSet(this, i1Var, bVar)) {
                if (o0.a() && !(!bVar.i())) {
                    throw new AssertionError();
                }
                boolean g2 = bVar.g();
                y yVar = obj instanceof y ? (y) obj : null;
                if (yVar != null) {
                    bVar.a(yVar.a);
                }
                th = bVar.e();
                if (true ^ g2) {
                }
                r rVar = r.a;
                if (th != null) {
                    Z(M, th);
                }
                t H = H(i1Var);
                return (H == null || !r0(bVar, H, obj)) ? G(bVar, obj) : v1.b;
            }
            zVar = v1.c;
            return zVar;
        }
    }

    private final boolean r0(b bVar, t tVar, Object obj) {
        while (n1.a.d(tVar.f3920i, false, false, new a(this, bVar, tVar, obj), 1, null) == z1.f3949e) {
            tVar = Y(tVar);
            if (tVar == null) {
                return false;
            }
        }
        return true;
    }

    private final boolean u(Object obj, y1 y1Var, t1 t1Var) {
        int x;
        c cVar = new c(t1Var, this, obj);
        do {
            x = y1Var.q().x(t1Var, y1Var, cVar);
            if (x == 1) {
                return true;
            }
        } while (x != 2);
        return false;
    }

    private final void v(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Throwable n = !o0.d() ? th : y.n(th);
            for (Throwable th2 : list) {
                if (o0.d()) {
                    th2 = y.n(th2);
                }
                if (th2 != th && th2 != n && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    j.b.a(th, th2);
                }
            }
        }
    }

    private final Object z(Object obj) {
        z zVar;
        Object p0;
        z zVar2;
        do {
            Object O = O();
            if (!(O instanceof i1) || ((O instanceof b) && ((b) O).h())) {
                zVar = v1.a;
                return zVar;
            }
            p0 = p0(O, new y(F(obj), false, 2, null));
            zVar2 = v1.c;
        } while (p0 == zVar2);
        return p0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String B() {
        return "Job was cancelled";
    }

    public boolean C(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return x(th) && K();
    }

    public boolean K() {
        return true;
    }

    public boolean L() {
        return false;
    }

    public final s N() {
        return (s) this._parentHandle;
    }

    public final Object O() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof v)) {
                return obj;
            }
            ((v) obj).c(this);
        }
    }

    protected boolean P(Throwable th) {
        return false;
    }

    public void Q(Throwable th) {
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void R(n1 n1Var) {
        if (o0.a()) {
            if (!(N() == null)) {
                throw new AssertionError();
            }
        }
        if (n1Var == null) {
            h0(z1.f3949e);
            return;
        }
        n1Var.start();
        s s = n1Var.s(this);
        h0(s);
        if (S()) {
            s.a();
            h0(z1.f3949e);
        }
    }

    public final boolean S() {
        return !(O() instanceof i1);
    }

    protected boolean T() {
        return false;
    }

    public final Object V(Object obj) {
        Object p0;
        z zVar;
        z zVar2;
        do {
            p0 = p0(O(), obj);
            zVar = v1.a;
            if (p0 != zVar) {
                zVar2 = v1.c;
            } else {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, I(obj));
            }
        } while (p0 == zVar2);
        return p0;
    }

    public String X() {
        return p0.a(this);
    }

    @Override // kotlinx.coroutines.n1
    public boolean b() {
        Object O = O();
        return (O instanceof i1) && ((i1) O).b();
    }

    protected void b0(Throwable th) {
    }

    protected void c0(Object obj) {
    }

    @Override // kotlinx.coroutines.b2
    public CancellationException d() {
        Throwable th;
        Object O = O();
        CancellationException cancellationException = null;
        if (O instanceof b) {
            th = ((b) O).e();
        } else if (O instanceof y) {
            th = ((y) O).a;
        } else if (!(O instanceof i1)) {
            th = null;
        } else {
            throw new IllegalStateException(i.i("Cannot be cancelling child in this state: ", O).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = th;
        }
        return cancellationException == null ? new o1(i.i("Parent job is ", j0(O)), th, this) : cancellationException;
    }

    protected void d0() {
    }

    @Override // kotlinx.coroutines.n1
    public final w0 f(boolean z, boolean z2, l<? super Throwable, r> lVar) {
        t1 W = W(lVar, z);
        while (true) {
            Object O = O();
            if (O instanceof x0) {
                x0 x0Var = (x0) O;
                if (!x0Var.b()) {
                    e0(x0Var);
                } else if (f3923e.compareAndSet(this, O, W)) {
                    return W;
                }
            } else {
                Throwable th = null;
                if (O instanceof i1) {
                    y1 f2 = ((i1) O).f();
                    if (f2 == null) {
                        Objects.requireNonNull(O, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        f0((t1) O);
                    } else {
                        w0 w0Var = z1.f3949e;
                        if (z && (O instanceof b)) {
                            synchronized (O) {
                                th = ((b) O).e();
                                if (th == null || ((lVar instanceof t) && !((b) O).h())) {
                                    if (u(O, f2, W)) {
                                        if (th == null) {
                                            return W;
                                        }
                                        w0Var = W;
                                    }
                                }
                                r rVar = r.a;
                            }
                        }
                        if (th != null) {
                            if (z2) {
                                lVar.invoke(th);
                            }
                            return w0Var;
                        } else if (u(O, f2, W)) {
                            return W;
                        }
                    }
                } else {
                    if (z2) {
                        y yVar = O instanceof y ? (y) O : null;
                        if (yVar != null) {
                            th = yVar.a;
                        }
                        lVar.invoke(th);
                    }
                    return z1.f3949e;
                }
            }
        }
    }

    @Override // j.u.g
    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) n1.a.b(this, r, pVar);
    }

    public final void g0(t1 t1Var) {
        Object O;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        x0 x0Var;
        do {
            O = O();
            if (O instanceof t1) {
                if (O == t1Var) {
                    atomicReferenceFieldUpdater = f3923e;
                    x0Var = v1.f3936g;
                } else {
                    return;
                }
            } else if ((O instanceof i1) && ((i1) O).f() != null) {
                t1Var.u();
                return;
            } else {
                return;
            }
        } while (!atomicReferenceFieldUpdater.compareAndSet(this, O, x0Var));
    }

    @Override // j.u.g.b, j.u.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) n1.a.c(this, cVar);
    }

    @Override // j.u.g.b
    public final g.c<?> getKey() {
        return n1.f3911d;
    }

    @Override // kotlinx.coroutines.n1
    public final CancellationException h() {
        Object O = O();
        if (O instanceof b) {
            Throwable e2 = ((b) O).e();
            if (e2 != null) {
                return k0(e2, i.i(p0.a(this), " is cancelling"));
            }
            throw new IllegalStateException(i.i("Job is still new or active: ", this).toString());
        } else if (!(O instanceof i1)) {
            return O instanceof y ? l0(this, ((y) O).a, null, 1, null) : new o1(i.i(p0.a(this), " has completed normally"), null, this);
        } else {
            throw new IllegalStateException(i.i("Job is still new or active: ", this).toString());
        }
    }

    public final void h0(s sVar) {
        this._parentHandle = sVar;
    }

    protected final CancellationException k0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = B();
            }
            cancellationException = new o1(str, th, this);
        }
        return cancellationException;
    }

    @Override // kotlinx.coroutines.n1
    public void l(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new o1(B(), null, this);
        }
        y(cancellationException);
    }

    public final String m0() {
        return X() + '{' + j0(O()) + '}';
    }

    @Override // j.u.g
    public g minusKey(g.c<?> cVar) {
        return n1.a.e(this, cVar);
    }

    @Override // kotlinx.coroutines.u
    public final void n(b2 b2Var) {
        x(b2Var);
    }

    @Override // j.u.g
    public g plus(g gVar) {
        return n1.a.f(this, gVar);
    }

    @Override // kotlinx.coroutines.n1
    public final s s(u uVar) {
        return (s) n1.a.d(this, true, false, new t(uVar), 2, null);
    }

    @Override // kotlinx.coroutines.n1
    public final boolean start() {
        int i0;
        do {
            i0 = i0(O());
            if (i0 == 0) {
                return false;
            }
        } while (i0 != 1);
        return true;
    }

    public String toString() {
        return m0() + '@' + p0.b(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void w(Object obj) {
    }

    public final boolean x(Object obj) {
        Object obj2;
        z zVar;
        z zVar2;
        z zVar3;
        obj2 = v1.a;
        if (L() && (obj2 = z(obj)) == v1.b) {
            return true;
        }
        zVar = v1.a;
        if (obj2 == zVar) {
            obj2 = U(obj);
        }
        zVar2 = v1.a;
        if (obj2 == zVar2 || obj2 == v1.b) {
            return true;
        }
        zVar3 = v1.f3933d;
        if (obj2 == zVar3) {
            return false;
        }
        w(obj2);
        return true;
    }

    public void y(Throwable th) {
        x(th);
    }
}
