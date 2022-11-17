package k.a.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import k.a.a.u.m;
import k.a.a.w.b;
import k.a.a.x.d;
import k.a.a.x.f;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.l;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class k extends b implements d, f, Comparable<k>, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final g f3535e;

    /* renamed from: f  reason: collision with root package name */
    private final r f3536f;

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

    static {
        g.f3514g.H(r.f3552k);
        g.f3515h.H(r.f3551j);
    }

    private k(g gVar, r rVar) {
        k.a.a.w.d.i(gVar, "dateTime");
        this.f3535e = gVar;
        k.a.a.w.d.i(rVar, "offset");
        this.f3536f = rVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static k B(DataInput dataInput) {
        return y(g.h0(dataInput), r.D(dataInput));
    }

    private k G(g gVar, r rVar) {
        return (this.f3535e != gVar || !this.f3536f.equals(rVar)) ? new k(gVar, rVar) : this;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 69, this);
    }

    public static k y(g gVar, r rVar) {
        return new k(gVar, rVar);
    }

    public static k z(e eVar, q qVar) {
        k.a.a.w.d.i(eVar, "instant");
        k.a.a.w.d.i(qVar, "zone");
        r a2 = qVar.d().a(eVar);
        return new k(g.W(eVar.w(), eVar.x(), a2), a2);
    }

    /* renamed from: A */
    public k r(long j2, l lVar) {
        return lVar instanceof k.a.a.x.b ? G(this.f3535e.r(j2, lVar), this.f3536f) : (k) lVar.c(this, j2);
    }

    public long C() {
        return this.f3535e.B(this.f3536f);
    }

    public f D() {
        return this.f3535e.D();
    }

    public g E() {
        return this.f3535e;
    }

    public h F() {
        return this.f3535e.E();
    }

    /* renamed from: H */
    public k h(f fVar) {
        return ((fVar instanceof f) || (fVar instanceof h) || (fVar instanceof g)) ? G(this.f3535e.h(fVar), this.f3536f) : fVar instanceof e ? z((e) fVar, this.f3536f) : fVar instanceof r ? G(this.f3535e, (r) fVar) : fVar instanceof k ? (k) fVar : (k) fVar.s(this);
    }

    /* renamed from: I */
    public k q(i iVar, long j2) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return (k) iVar.d(this, j2);
        }
        k.a.a.x.a aVar = (k.a.a.x.a) iVar;
        int i2 = a.a[aVar.ordinal()];
        return i2 != 1 ? i2 != 2 ? G(this.f3535e.q(iVar, j2), this.f3536f) : G(this.f3535e, r.B(aVar.l(j2))) : z(e.B(j2, v()), this.f3536f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void J(DataOutput dataOutput) {
        this.f3535e.m0(dataOutput);
        this.f3536f.G(dataOutput);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public n c(i iVar) {
        return iVar instanceof k.a.a.x.a ? (iVar == k.a.a.x.a.INSTANT_SECONDS || iVar == k.a.a.x.a.OFFSET_SECONDS) ? iVar.h() : this.f3535e.c(iVar) : iVar.k(this);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public int e(i iVar) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return super.e(iVar);
        }
        int i2 = a.a[((k.a.a.x.a) iVar).ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? this.f3535e.e(iVar) : w().y();
        }
        throw new b("Field too large for an int: " + iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f3535e.equals(kVar.f3535e) && this.f3536f.equals(kVar.f3536f);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public <R> R g(k.a.a.x.k<R> kVar) {
        if (kVar == j.a()) {
            return (R) m.f3582g;
        }
        if (kVar == j.e()) {
            return (R) k.a.a.x.b.NANOS;
        }
        if (kVar == j.d() || kVar == j.f()) {
            return (R) w();
        }
        if (kVar == j.b()) {
            return (R) D();
        }
        if (kVar == j.c()) {
            return (R) F();
        }
        if (kVar == j.g()) {
            return null;
        }
        return (R) super.g(kVar);
    }

    public int hashCode() {
        return this.f3535e.hashCode() ^ this.f3536f.hashCode();
    }

    @Override // k.a.a.x.e
    public boolean j(i iVar) {
        return (iVar instanceof k.a.a.x.a) || (iVar != null && iVar.c(this));
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return iVar.g(this);
        }
        int i2 = a.a[((k.a.a.x.a) iVar).ordinal()];
        return i2 != 1 ? i2 != 2 ? this.f3535e.l(iVar) : w().y() : C();
    }

    @Override // k.a.a.x.f
    public d s(d dVar) {
        return dVar.q(k.a.a.x.a.EPOCH_DAY, D().C()).q(k.a.a.x.a.NANO_OF_DAY, F().P()).q(k.a.a.x.a.OFFSET_SECONDS, w().y());
    }

    public String toString() {
        return this.f3535e.toString() + this.f3536f.toString();
    }

    /* renamed from: u */
    public int compareTo(k kVar) {
        if (w().equals(kVar.w())) {
            return E().compareTo(kVar.E());
        }
        int b = k.a.a.w.d.b(C(), kVar.C());
        if (b != 0) {
            return b;
        }
        int A = F().A() - kVar.F().A();
        return A == 0 ? E().compareTo(kVar.E()) : A;
    }

    public int v() {
        return this.f3535e.Q();
    }

    public r w() {
        return this.f3536f;
    }

    /* renamed from: x */
    public k k(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? r(Long.MAX_VALUE, lVar).r(1L, lVar) : r(-j2, lVar);
    }
}
