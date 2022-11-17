package k.a.a.u;

import k.a.a.e;
import k.a.a.h;
import k.a.a.q;
import k.a.a.r;
import k.a.a.u.b;
import k.a.a.x.a;
import k.a.a.x.d;
import k.a.a.x.f;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.k;
import k.a.a.x.l;
/* loaded from: classes.dex */
public abstract class c<D extends b> extends k.a.a.w.b implements d, f, Comparable<c<?>> {
    /* renamed from: A */
    public abstract c<D> r(long j2, l lVar);

    public long B(r rVar) {
        k.a.a.w.d.i(rVar, "offset");
        return ((D().C() * 86400) + E().Q()) - rVar.y();
    }

    public e C(r rVar) {
        return e.B(B(rVar), E().A());
    }

    public abstract D D();

    public abstract h E();

    /* renamed from: F */
    public c<D> h(f fVar) {
        return D().w().e(super.h(fVar));
    }

    /* renamed from: G */
    public abstract c<D> q(i iVar, long j2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && compareTo((c) obj) == 0;
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public <R> R g(k<R> kVar) {
        if (kVar == j.a()) {
            return (R) w();
        }
        if (kVar == j.e()) {
            return (R) k.a.a.x.b.NANOS;
        }
        if (kVar == j.b()) {
            return (R) k.a.a.f.a0(D().C());
        }
        if (kVar == j.c()) {
            return (R) E();
        }
        if (kVar == j.f() || kVar == j.g() || kVar == j.d()) {
            return null;
        }
        return (R) super.g(kVar);
    }

    public int hashCode() {
        return D().hashCode() ^ E().hashCode();
    }

    public d s(d dVar) {
        return dVar.q(a.EPOCH_DAY, D().C()).q(a.NANO_OF_DAY, E().P());
    }

    public String toString() {
        return D().toString() + 'T' + E().toString();
    }

    public abstract f<D> u(q qVar);

    /* renamed from: v */
    public int compareTo(c<?> cVar) {
        int v = D().compareTo(cVar.D());
        if (v != 0) {
            return v;
        }
        int u = E().compareTo(cVar.E());
        return u == 0 ? w().compareTo(cVar.w()) : u;
    }

    public h w() {
        return D().w();
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [k.a.a.u.b] */
    public boolean x(c<?> cVar) {
        int i2 = (D().C() > cVar.D().C() ? 1 : (D().C() == cVar.D().C() ? 0 : -1));
        return i2 > 0 || (i2 == 0 && E().P() > cVar.E().P());
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [k.a.a.u.b] */
    public boolean y(c<?> cVar) {
        int i2 = (D().C() > cVar.D().C() ? 1 : (D().C() == cVar.D().C() ? 0 : -1));
        return i2 < 0 || (i2 == 0 && E().P() < cVar.E().P());
    }

    /* renamed from: z */
    public c<D> k(long j2, l lVar) {
        return D().w().e(super.k(j2, lVar));
    }
}
