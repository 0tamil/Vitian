package k.a.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import java.util.List;
import k.a.a.u.f;
import k.a.a.x.b;
import k.a.a.x.d;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.k;
import k.a.a.x.l;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class t extends f<f> implements d, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final g f3558e;

    /* renamed from: f  reason: collision with root package name */
    private final r f3559f;

    /* renamed from: g  reason: collision with root package name */
    private final q f3560g;

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

    private t(g gVar, r rVar, q qVar) {
        this.f3558e = gVar;
        this.f3559f = rVar;
        this.f3560g = qVar;
    }

    private static t I(long j2, int i2, q qVar) {
        r a2 = qVar.d().a(e.B(j2, i2));
        return new t(g.W(j2, i2, a2), a2, qVar);
    }

    public static t S(k.a.a.a aVar) {
        k.a.a.w.d.i(aVar, "clock");
        return W(aVar.b(), aVar.a());
    }

    public static t T(q qVar) {
        return S(k.a.a.a.c(qVar));
    }

    public static t U(int i2, int i3, int i4, int i5, int i6, int i7, int i8, q qVar) {
        return Z(g.U(i2, i3, i4, i5, i6, i7, i8), qVar, null);
    }

    public static t V(g gVar, q qVar) {
        return Z(gVar, qVar, null);
    }

    public static t W(e eVar, q qVar) {
        k.a.a.w.d.i(eVar, "instant");
        k.a.a.w.d.i(qVar, "zone");
        return I(eVar.w(), eVar.x(), qVar);
    }

    public static t X(g gVar, r rVar, q qVar) {
        k.a.a.w.d.i(gVar, "localDateTime");
        k.a.a.w.d.i(rVar, "offset");
        k.a.a.w.d.i(qVar, "zone");
        return I(gVar.B(rVar), gVar.Q(), qVar);
    }

    private static t Y(g gVar, r rVar, q qVar) {
        k.a.a.w.d.i(gVar, "localDateTime");
        k.a.a.w.d.i(rVar, "offset");
        k.a.a.w.d.i(qVar, "zone");
        if (!(qVar instanceof r) || rVar.equals(qVar)) {
            return new t(gVar, rVar, qVar);
        }
        throw new IllegalArgumentException("ZoneId must match ZoneOffset");
    }

    public static t Z(g gVar, q qVar, r rVar) {
        r rVar2;
        k.a.a.w.d.i(gVar, "localDateTime");
        k.a.a.w.d.i(qVar, "zone");
        if (qVar instanceof r) {
            return new t(gVar, (r) qVar, qVar);
        }
        k.a.a.y.f d2 = qVar.d();
        List<r> c = d2.c(gVar);
        if (c.size() == 1) {
            rVar2 = c.get(0);
        } else {
            if (c.size() == 0) {
                k.a.a.y.d b = d2.b(gVar);
                gVar = gVar.e0(b.e().e());
                rVar = b.j();
            } else if (rVar == null || !c.contains(rVar)) {
                rVar2 = c.get(0);
                k.a.a.w.d.i(rVar2, "offset");
            }
            return new t(gVar, rVar, qVar);
        }
        rVar = rVar2;
        return new t(gVar, rVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static t c0(DataInput dataInput) {
        return Y(g.h0(dataInput), r.D(dataInput), (q) n.a(dataInput));
    }

    private t d0(g gVar) {
        return X(gVar, this.f3559f, this.f3560g);
    }

    private t e0(g gVar) {
        return Z(gVar, this.f3560g, this.f3559f);
    }

    private t f0(r rVar) {
        return (rVar.equals(this.f3559f) || !this.f3560g.d().e(this.f3558e, rVar)) ? this : new t(this.f3558e, rVar, this.f3560g);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 6, this);
    }

    @Override // k.a.a.u.f
    public h E() {
        return this.f3558e.E();
    }

    public int J() {
        return this.f3558e.L();
    }

    public c K() {
        return this.f3558e.M();
    }

    public int L() {
        return this.f3558e.N();
    }

    public int M() {
        return this.f3558e.O();
    }

    public int N() {
        return this.f3558e.P();
    }

    public int O() {
        return this.f3558e.Q();
    }

    public int P() {
        return this.f3558e.R();
    }

    public int Q() {
        return this.f3558e.S();
    }

    /* renamed from: R */
    public t y(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? z(Long.MAX_VALUE, lVar).z(1L, lVar) : z(-j2, lVar);
    }

    /* renamed from: a0 */
    public t z(long j2, l lVar) {
        return lVar instanceof b ? lVar.a() ? e0(this.f3558e.r(j2, lVar)) : d0(this.f3558e.r(j2, lVar)) : (t) lVar.c(this, j2);
    }

    public t b0(long j2) {
        return e0(this.f3558e.a0(j2));
    }

    @Override // k.a.a.u.f, k.a.a.w.c, k.a.a.x.e
    public n c(i iVar) {
        return iVar instanceof k.a.a.x.a ? (iVar == k.a.a.x.a.INSTANT_SECONDS || iVar == k.a.a.x.a.OFFSET_SECONDS) ? iVar.h() : this.f3558e.c(iVar) : iVar.k(this);
    }

    @Override // k.a.a.u.f, k.a.a.w.c, k.a.a.x.e
    public int e(i iVar) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return super.e(iVar);
        }
        int i2 = a.a[((k.a.a.x.a) iVar).ordinal()];
        if (i2 != 1) {
            return i2 != 2 ? this.f3558e.e(iVar) : v().y();
        }
        throw new b("Field too large for an int: " + iVar);
    }

    @Override // k.a.a.u.f
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return this.f3558e.equals(tVar.f3558e) && this.f3559f.equals(tVar.f3559f) && this.f3560g.equals(tVar.f3560g);
    }

    @Override // k.a.a.u.f, k.a.a.w.c, k.a.a.x.e
    public <R> R g(k<R> kVar) {
        return kVar == j.b() ? (R) C() : (R) super.g(kVar);
    }

    /* renamed from: g0 */
    public f C() {
        return this.f3558e.D();
    }

    /* renamed from: h0 */
    public g D() {
        return this.f3558e;
    }

    @Override // k.a.a.u.f
    public int hashCode() {
        return (this.f3558e.hashCode() ^ this.f3559f.hashCode()) ^ Integer.rotateLeft(this.f3560g.hashCode(), 3);
    }

    /* renamed from: i0 */
    public t h(k.a.a.x.f fVar) {
        if (fVar instanceof f) {
            return e0(g.V((f) fVar, this.f3558e.E()));
        }
        if (fVar instanceof h) {
            return e0(g.V(this.f3558e.D(), (h) fVar));
        }
        if (fVar instanceof g) {
            return e0((g) fVar);
        }
        if (!(fVar instanceof e)) {
            return fVar instanceof r ? f0((r) fVar) : (t) fVar.s(this);
        }
        e eVar = (e) fVar;
        return I(eVar.w(), eVar.x(), this.f3560g);
    }

    @Override // k.a.a.x.e
    public boolean j(i iVar) {
        return (iVar instanceof k.a.a.x.a) || (iVar != null && iVar.c(this));
    }

    /* renamed from: j0 */
    public t q(i iVar, long j2) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return (t) iVar.d(this, j2);
        }
        k.a.a.x.a aVar = (k.a.a.x.a) iVar;
        int i2 = a.a[aVar.ordinal()];
        return i2 != 1 ? i2 != 2 ? e0(this.f3558e.q(iVar, j2)) : f0(r.B(aVar.l(j2))) : I(j2, O(), this.f3560g);
    }

    /* renamed from: k0 */
    public t H(q qVar) {
        k.a.a.w.d.i(qVar, "zone");
        return this.f3560g.equals(qVar) ? this : Z(this.f3558e, qVar, this.f3559f);
    }

    @Override // k.a.a.u.f, k.a.a.x.e
    public long l(i iVar) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return iVar.g(this);
        }
        int i2 = a.a[((k.a.a.x.a) iVar).ordinal()];
        return i2 != 1 ? i2 != 2 ? this.f3558e.l(iVar) : v().y() : A();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l0(DataOutput dataOutput) {
        this.f3558e.m0(dataOutput);
        this.f3559f.G(dataOutput);
        this.f3560g.v(dataOutput);
    }

    @Override // k.a.a.u.f
    public String toString() {
        String str = this.f3558e.toString() + this.f3559f.toString();
        if (this.f3559f == this.f3560g) {
            return str;
        }
        return str + '[' + this.f3560g.toString() + ']';
    }

    @Override // k.a.a.u.f
    public r v() {
        return this.f3559f;
    }

    @Override // k.a.a.u.f
    public q w() {
        return this.f3560g;
    }
}
