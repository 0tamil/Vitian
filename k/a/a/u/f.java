package k.a.a.u;

import k.a.a.e;
import k.a.a.h;
import k.a.a.q;
import k.a.a.r;
import k.a.a.u.b;
import k.a.a.x.d;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.k;
import k.a.a.x.l;
import k.a.a.x.m;
import k.a.a.x.n;
/* loaded from: classes.dex */
public abstract class f<D extends b> extends k.a.a.w.b implements d, Comparable<f<?>> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.a.a.x.a.values().length];
            a = iArr;
            try {
                iArr[k.a.a.x.a.INSTANT_SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k.a.a.x.a.OFFSET_SECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public long A() {
        return ((C().C() * 86400) + E().Q()) - v().y();
    }

    public e B() {
        return e.B(A(), E().A());
    }

    public D C() {
        return D().D();
    }

    public abstract c<D> D();

    public h E() {
        return D().E();
    }

    /* renamed from: F */
    public f<D> h(k.a.a.x.f fVar) {
        return C().w().g(super.h(fVar));
    }

    /* renamed from: G */
    public abstract f<D> q(i iVar, long j2);

    public abstract f<D> H(q qVar);

    @Override // k.a.a.w.c, k.a.a.x.e
    public n c(i iVar) {
        return iVar instanceof k.a.a.x.a ? (iVar == k.a.a.x.a.INSTANT_SECONDS || iVar == k.a.a.x.a.OFFSET_SECONDS) ? iVar.h() : D().c(iVar) : iVar.k(this);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public int e(i iVar) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return super.e(iVar);
        }
        int i2 = a.a[((k.a.a.x.a) iVar).ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? D().e(iVar) : v().y();
        }
        throw new m("Field too large for an int: " + iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && compareTo((f) obj) == 0;
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public <R> R g(k<R> kVar) {
        return (kVar == j.g() || kVar == j.f()) ? (R) w() : kVar == j.a() ? (R) C().w() : kVar == j.e() ? (R) k.a.a.x.b.NANOS : kVar == j.d() ? (R) v() : kVar == j.b() ? (R) k.a.a.f.a0(C().C()) : kVar == j.c() ? (R) E() : (R) super.g(kVar);
    }

    public int hashCode() {
        return (D().hashCode() ^ v().hashCode()) ^ Integer.rotateLeft(w().hashCode(), 3);
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return iVar.g(this);
        }
        int i2 = a.a[((k.a.a.x.a) iVar).ordinal()];
        return i2 != 1 ? i2 != 2 ? D().l(iVar) : v().y() : A();
    }

    public String toString() {
        String str = D().toString() + v().toString();
        if (v() == w()) {
            return str;
        }
        return str + '[' + w().toString() + ']';
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [k.a.a.u.b] */
    /* renamed from: u */
    public int compareTo(f<?> fVar) {
        int b = k.a.a.w.d.b(A(), fVar.A());
        if (b != 0) {
            return b;
        }
        int A = E().A() - fVar.E().A();
        if (A != 0) {
            return A;
        }
        int v = D().compareTo(fVar.D());
        if (v != 0) {
            return v;
        }
        int compareTo = w().a().compareTo(fVar.w().a());
        return compareTo == 0 ? C().w().compareTo(fVar.C().w()) : compareTo;
    }

    public abstract r v();

    public abstract q w();

    public boolean x(f<?> fVar) {
        int i2 = (A() > fVar.A() ? 1 : (A() == fVar.A() ? 0 : -1));
        return i2 < 0 || (i2 == 0 && E().A() < fVar.E().A());
    }

    /* renamed from: y */
    public f<D> k(long j2, l lVar) {
        return C().w().g(super.k(j2, lVar));
    }

    /* renamed from: z */
    public abstract f<D> r(long j2, l lVar);
}
