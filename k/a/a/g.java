package k.a.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import k.a.a.u.c;
import k.a.a.x.d;
import k.a.a.x.e;
import k.a.a.x.f;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.k;
import k.a.a.x.l;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class g extends c<f> implements d, f, Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final g f3514g = V(f.f3509h, h.f3519i);

    /* renamed from: h  reason: collision with root package name */
    public static final g f3515h = V(f.f3510i, h.f3520j);

    /* renamed from: i  reason: collision with root package name */
    public static final k<g> f3516i = new a();

    /* renamed from: e  reason: collision with root package name */
    private final f f3517e;

    /* renamed from: f  reason: collision with root package name */
    private final h f3518f;

    /* loaded from: classes.dex */
    class a implements k<g> {
        a() {
        }

        /* renamed from: b */
        public g a(e eVar) {
            return g.K(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[k.a.a.x.b.values().length];
            a = iArr;
            try {
                iArr[k.a.a.x.b.NANOS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[k.a.a.x.b.MICROS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[k.a.a.x.b.MILLIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[k.a.a.x.b.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[k.a.a.x.b.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[k.a.a.x.b.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[k.a.a.x.b.HALF_DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private g(f fVar, h hVar) {
        this.f3517e = fVar;
        this.f3518f = hVar;
    }

    private int J(g gVar) {
        int G = this.f3517e.G(gVar.D());
        return G == 0 ? this.f3518f.compareTo(gVar.E()) : G;
    }

    public static g K(e eVar) {
        if (eVar instanceof g) {
            return (g) eVar;
        }
        if (eVar instanceof t) {
            return ((t) eVar).D();
        }
        try {
            return new g(f.I(eVar), h.w(eVar));
        } catch (k.a.a.b unused) {
            throw new k.a.a.b("Unable to obtain LocalDateTime from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
        }
    }

    public static g U(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return new g(f.Y(i2, i3, i4), h.F(i5, i6, i7, i8));
    }

    public static g V(f fVar, h hVar) {
        k.a.a.w.d.i(fVar, "date");
        k.a.a.w.d.i(hVar, "time");
        return new g(fVar, hVar);
    }

    public static g W(long j2, int i2, r rVar) {
        k.a.a.w.d.i(rVar, "offset");
        long y = j2 + rVar.y();
        return new g(f.a0(k.a.a.w.d.e(y, 86400L)), h.I(k.a.a.w.d.g(y, 86400), i2));
    }

    public static g X(CharSequence charSequence) {
        return Y(charSequence, k.a.a.v.b.f3626j);
    }

    public static g Y(CharSequence charSequence, k.a.a.v.b bVar) {
        k.a.a.w.d.i(bVar, "formatter");
        return (g) bVar.h(charSequence, f3516i);
    }

    private g g0(f fVar, long j2, long j3, long j4, long j5, int i2) {
        h G;
        f fVar2 = fVar;
        if ((j2 | j3 | j4 | j5) == 0) {
            G = this.f3518f;
        } else {
            long j6 = i2;
            long P = this.f3518f.P();
            long j7 = (((j5 % 86400000000000L) + ((j4 % 86400) * 1000000000) + ((j3 % 1440) * 60000000000L) + ((j2 % 24) * 3600000000000L)) * j6) + P;
            long e2 = (((j5 / 86400000000000L) + (j4 / 86400) + (j3 / 1440) + (j2 / 24)) * j6) + k.a.a.w.d.e(j7, 86400000000000L);
            long h2 = k.a.a.w.d.h(j7, 86400000000000L);
            G = h2 == P ? this.f3518f : h.G(h2);
            fVar2 = fVar2.e0(e2);
        }
        return j0(fVar2, G);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g h0(DataInput dataInput) {
        return V(f.i0(dataInput), h.O(dataInput));
    }

    private g j0(f fVar, h hVar) {
        return (this.f3517e == fVar && this.f3518f == hVar) ? this : new g(fVar, hVar);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 4, this);
    }

    @Override // k.a.a.u.c
    public h E() {
        return this.f3518f;
    }

    public k H(r rVar) {
        return k.y(this, rVar);
    }

    /* renamed from: I */
    public t u(q qVar) {
        return t.V(this, qVar);
    }

    public int L() {
        return this.f3517e.L();
    }

    public c M() {
        return this.f3517e.M();
    }

    public int N() {
        return this.f3518f.y();
    }

    public int O() {
        return this.f3518f.z();
    }

    public int P() {
        return this.f3517e.P();
    }

    public int Q() {
        return this.f3518f.A();
    }

    public int R() {
        return this.f3518f.B();
    }

    public int S() {
        return this.f3517e.R();
    }

    /* renamed from: T */
    public g z(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? r(Long.MAX_VALUE, lVar).r(1L, lVar) : r(-j2, lVar);
    }

    /* renamed from: Z */
    public g r(long j2, l lVar) {
        if (!(lVar instanceof k.a.a.x.b)) {
            return (g) lVar.c(this, j2);
        }
        switch (b.a[((k.a.a.x.b) lVar).ordinal()]) {
            case 1:
                return d0(j2);
            case 2:
                return a0(j2 / 86400000000L).d0((j2 % 86400000000L) * 1000);
            case 3:
                return a0(j2 / 86400000).d0((j2 % 86400000) * 1000000);
            case 4:
                return e0(j2);
            case 5:
                return c0(j2);
            case 6:
                return b0(j2);
            case 7:
                return a0(j2 / 256).b0((j2 % 256) * 12);
            default:
                return j0(this.f3517e.r(j2, lVar), this.f3518f);
        }
    }

    public g a0(long j2) {
        return j0(this.f3517e.e0(j2), this.f3518f);
    }

    public g b0(long j2) {
        return g0(this.f3517e, j2, 0L, 0L, 0L, 1);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public n c(i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar.j() ? this.f3518f.c(iVar) : this.f3517e.c(iVar) : iVar.k(this);
    }

    public g c0(long j2) {
        return g0(this.f3517e, 0L, j2, 0L, 0L, 1);
    }

    public g d0(long j2) {
        return g0(this.f3517e, 0L, 0L, 0L, j2, 1);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public int e(i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar.j() ? this.f3518f.e(iVar) : this.f3517e.e(iVar) : super.e(iVar);
    }

    public g e0(long j2) {
        return g0(this.f3517e, 0L, 0L, j2, 0L, 1);
    }

    @Override // k.a.a.u.c
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f3517e.equals(gVar.f3517e) && this.f3518f.equals(gVar.f3518f);
    }

    public g f0(long j2) {
        return j0(this.f3517e.g0(j2), this.f3518f);
    }

    @Override // k.a.a.u.c, k.a.a.w.c, k.a.a.x.e
    public <R> R g(k<R> kVar) {
        return kVar == j.b() ? (R) D() : (R) super.g(kVar);
    }

    @Override // k.a.a.u.c
    public int hashCode() {
        return this.f3517e.hashCode() ^ this.f3518f.hashCode();
    }

    /* renamed from: i0 */
    public f D() {
        return this.f3517e;
    }

    @Override // k.a.a.x.e
    public boolean j(i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar.a() || iVar.j() : iVar != null && iVar.c(this);
    }

    /* renamed from: k0 */
    public g h(f fVar) {
        return fVar instanceof f ? j0((f) fVar, this.f3518f) : fVar instanceof h ? j0(this.f3517e, (h) fVar) : fVar instanceof g ? (g) fVar : (g) fVar.s(this);
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar.j() ? this.f3518f.l(iVar) : this.f3517e.l(iVar) : iVar.g(this);
    }

    /* renamed from: l0 */
    public g q(i iVar, long j2) {
        return iVar instanceof k.a.a.x.a ? iVar.j() ? j0(this.f3517e, this.f3518f.q(iVar, j2)) : j0(this.f3517e.q(iVar, j2), this.f3518f) : (g) iVar.d(this, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m0(DataOutput dataOutput) {
        this.f3517e.q0(dataOutput);
        this.f3518f.X(dataOutput);
    }

    @Override // k.a.a.u.c, k.a.a.x.f
    public d s(d dVar) {
        return super.s(dVar);
    }

    @Override // k.a.a.u.c
    public String toString() {
        return this.f3517e.toString() + 'T' + this.f3518f.toString();
    }

    @Override // k.a.a.u.c
    /* renamed from: v */
    public int compareTo(c<?> cVar) {
        return cVar instanceof g ? J((g) cVar) : super.compareTo(cVar);
    }

    @Override // k.a.a.u.c
    public boolean x(c<?> cVar) {
        return cVar instanceof g ? J((g) cVar) > 0 : super.x(cVar);
    }

    @Override // k.a.a.u.c
    public boolean y(c<?> cVar) {
        return cVar instanceof g ? J((g) cVar) < 0 : super.y(cVar);
    }
}
