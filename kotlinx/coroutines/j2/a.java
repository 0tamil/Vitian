package kotlinx.coroutines.j2;

import j.l;
import j.m;
import j.r;
import j.u.j.a.h;
import j.x.d.i;
import kotlinx.coroutines.g;
import kotlinx.coroutines.internal.o;
import kotlinx.coroutines.internal.u;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.internal.z;
import kotlinx.coroutines.m;
import kotlinx.coroutines.n;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.p;
import kotlinx.coroutines.p0;
/* loaded from: classes.dex */
public abstract class a<E> extends kotlinx.coroutines.j2.c<E> implements f<E> {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: kotlinx.coroutines.j2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0153a<E> implements g<E> {
        public final a<E> a;
        private Object b = kotlinx.coroutines.j2.b.f3826d;

        public C0153a(a<E> aVar) {
            this.a = aVar;
        }

        private final boolean c(Object obj) {
            if (!(obj instanceof j)) {
                return true;
            }
            j jVar = (j) obj;
            if (jVar.f3837h == null) {
                return false;
            }
            throw y.k(jVar.E());
        }

        private final Object d(j.u.d<? super Boolean> dVar) {
            j.u.d b;
            Object c;
            Object obj;
            b = j.u.i.c.b(dVar);
            n a = p.a(b);
            b bVar = new b(this, a);
            while (true) {
                if (this.a.p(bVar)) {
                    this.a.w(a, bVar);
                    break;
                }
                Object v = this.a.v();
                e(v);
                if (v instanceof j) {
                    j jVar = (j) v;
                    if (jVar.f3837h == null) {
                        obj = j.u.j.a.b.a(false);
                        l.a aVar = l.f3445e;
                    } else {
                        Throwable E = jVar.E();
                        l.a aVar2 = l.f3445e;
                        obj = m.a(E);
                    }
                    l.a(obj);
                    a.resumeWith(obj);
                } else if (v != kotlinx.coroutines.j2.b.f3826d) {
                    Boolean a2 = j.u.j.a.b.a(true);
                    j.x.c.l<E, r> lVar = this.a.b;
                    a.k(a2, lVar == null ? null : u.a(lVar, v, a.getContext()));
                }
            }
            Object w = a.w();
            c = j.u.i.d.c();
            if (w == c) {
                h.c(dVar);
            }
            return w;
        }

        @Override // kotlinx.coroutines.j2.g
        public Object a(j.u.d<? super Boolean> dVar) {
            Object b = b();
            z zVar = kotlinx.coroutines.j2.b.f3826d;
            if (b == zVar) {
                e(this.a.v());
                if (b() == zVar) {
                    return d(dVar);
                }
            }
            return j.u.j.a.b.a(c(b()));
        }

        public final Object b() {
            return this.b;
        }

        public final void e(Object obj) {
            this.b = obj;
        }

        @Override // kotlinx.coroutines.j2.g
        public E next() {
            E e2 = (E) this.b;
            if (!(e2 instanceof j)) {
                z zVar = kotlinx.coroutines.j2.b.f3826d;
                if (e2 != zVar) {
                    this.b = zVar;
                    return e2;
                }
                throw new IllegalStateException("'hasNext' should be called prior to 'next' invocation");
            }
            throw y.k(((j) e2).E());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b<E> extends o<E> {

        /* renamed from: h  reason: collision with root package name */
        public final C0153a<E> f3821h;

        /* renamed from: i  reason: collision with root package name */
        public final kotlinx.coroutines.m<Boolean> f3822i;

        /* JADX WARN: Multi-variable type inference failed */
        public b(C0153a<E> aVar, kotlinx.coroutines.m<? super Boolean> mVar) {
            this.f3821h = aVar;
            this.f3822i = mVar;
        }

        public j.x.c.l<Throwable, r> A(E e2) {
            j.x.c.l<E, r> lVar = this.f3821h.a.b;
            if (lVar == null) {
                return null;
            }
            return u.a(lVar, e2, this.f3822i.getContext());
        }

        @Override // kotlinx.coroutines.j2.q
        public z d(E e2, o.c cVar) {
            Object a = this.f3822i.a(Boolean.TRUE, cVar == null ? null : cVar.a, A(e2));
            if (a == null) {
                return null;
            }
            if (o0.a()) {
                if (!(a == kotlinx.coroutines.o.a)) {
                    throw new AssertionError();
                }
            }
            if (cVar == null) {
                return kotlinx.coroutines.o.a;
            }
            cVar.d();
            throw null;
        }

        @Override // kotlinx.coroutines.j2.q
        public void g(E e2) {
            this.f3821h.e(e2);
            this.f3822i.p(kotlinx.coroutines.o.a);
        }

        @Override // kotlinx.coroutines.internal.o
        public String toString() {
            return i.i("ReceiveHasNext@", p0.b(this));
        }

        @Override // kotlinx.coroutines.j2.o
        public void z(j<?> jVar) {
            Object a = jVar.f3837h == null ? m.a.a(this.f3822i, Boolean.FALSE, null, 2, null) : this.f3822i.m(jVar.E());
            if (a != null) {
                this.f3821h.e(jVar);
                this.f3822i.p(a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class c extends g {

        /* renamed from: e  reason: collision with root package name */
        private final o<?> f3823e;

        public c(o<?> oVar) {
            this.f3823e = oVar;
        }

        @Override // kotlinx.coroutines.l
        public void a(Throwable th) {
            if (this.f3823e.u()) {
                a.this.t();
            }
        }

        @Override // j.x.c.l
        public /* bridge */ /* synthetic */ r invoke(Throwable th) {
            a(th);
            return r.a;
        }

        public String toString() {
            return "RemoveReceiveOnCancel[" + this.f3823e + ']';
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends o.b {

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a f3825d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(o oVar, a aVar) {
            super(oVar);
            this.f3825d = aVar;
        }

        /* renamed from: i */
        public Object g(o oVar) {
            if (this.f3825d.s()) {
                return null;
            }
            return kotlinx.coroutines.internal.n.a();
        }
    }

    public a(j.x.c.l<? super E, r> lVar) {
        super(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(o<? super E> oVar) {
        boolean q = q(oVar);
        if (q) {
            u();
        }
        return q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(kotlinx.coroutines.m<?> mVar, o<?> oVar) {
        mVar.j(new c(oVar));
    }

    @Override // kotlinx.coroutines.j2.p
    public final g<E> iterator() {
        return new C0153a(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.j2.c
    public q<E> l() {
        q<E> l = super.l();
        if (l != null && !(l instanceof j)) {
            t();
        }
        return l;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean q(o<? super E> oVar) {
        int x;
        o q;
        if (r()) {
            o e2 = e();
            do {
                q = e2.q();
                if (!(!(q instanceof s))) {
                    return false;
                }
            } while (!q.j(oVar, e2));
        } else {
            o e3 = e();
            d dVar = new d(oVar, this);
            do {
                o q2 = e3.q();
                if (!(!(q2 instanceof s))) {
                    return false;
                }
                x = q2.x(oVar, e3, dVar);
                if (x != 1) {
                }
            } while (x != 2);
            return false;
        }
        return true;
    }

    protected abstract boolean r();

    protected abstract boolean s();

    protected void t() {
    }

    protected void u() {
    }

    protected Object v() {
        while (true) {
            s m = m();
            if (m == null) {
                return kotlinx.coroutines.j2.b.f3826d;
            }
            z A = m.A(null);
            if (A != null) {
                if (o0.a()) {
                    if (!(A == kotlinx.coroutines.o.a)) {
                        throw new AssertionError();
                    }
                }
                m.y();
                return m.z();
            }
            m.B();
        }
    }
}
