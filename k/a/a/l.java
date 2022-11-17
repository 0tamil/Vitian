package k.a.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import k.a.a.w.c;
import k.a.a.x.a;
import k.a.a.x.b;
import k.a.a.x.d;
import k.a.a.x.f;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.k;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class l extends c implements d, f, Comparable<l>, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final h f3537e;

    /* renamed from: f  reason: collision with root package name */
    private final r f3538f;

    static {
        h.f3519i.t(r.f3552k);
        h.f3520j.t(r.f3551j);
    }

    private l(h hVar, r rVar) {
        k.a.a.w.d.i(hVar, "time");
        this.f3537e = hVar;
        k.a.a.w.d.i(rVar, "offset");
        this.f3538f = rVar;
    }

    private l A(h hVar, r rVar) {
        return (this.f3537e != hVar || !this.f3538f.equals(rVar)) ? new l(hVar, rVar) : this;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static l w(h hVar, r rVar) {
        return new l(hVar, rVar);
    }

    private Object writeReplace() {
        return new n((byte) 66, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l y(DataInput dataInput) {
        return w(h.O(dataInput), r.D(dataInput));
    }

    private long z() {
        return this.f3537e.P() - (this.f3538f.y() * 1000000000);
    }

    /* renamed from: B */
    public l h(f fVar) {
        return fVar instanceof h ? A((h) fVar, this.f3538f) : fVar instanceof r ? A(this.f3537e, (r) fVar) : fVar instanceof l ? (l) fVar : (l) fVar.s(this);
    }

    /* renamed from: C */
    public l q(i iVar, long j2) {
        return iVar instanceof a ? iVar == a.OFFSET_SECONDS ? A(this.f3537e, r.B(((a) iVar).l(j2))) : A(this.f3537e.q(iVar, j2), this.f3538f) : (l) iVar.d(this, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void D(DataOutput dataOutput) {
        this.f3537e.X(dataOutput);
        this.f3538f.G(dataOutput);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public n c(i iVar) {
        return iVar instanceof a ? iVar == a.OFFSET_SECONDS ? iVar.h() : this.f3537e.c(iVar) : iVar.k(this);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public int e(i iVar) {
        return super.e(iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f3537e.equals(lVar.f3537e) && this.f3538f.equals(lVar.f3538f);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public <R> R g(k<R> kVar) {
        if (kVar == j.e()) {
            return (R) b.NANOS;
        }
        if (kVar == j.d() || kVar == j.f()) {
            return (R) u();
        }
        if (kVar == j.c()) {
            return (R) this.f3537e;
        }
        if (kVar == j.a() || kVar == j.b() || kVar == j.g()) {
            return null;
        }
        return (R) super.g(kVar);
    }

    public int hashCode() {
        return this.f3537e.hashCode() ^ this.f3538f.hashCode();
    }

    @Override // k.a.a.x.e
    public boolean j(i iVar) {
        return iVar instanceof a ? iVar.j() || iVar == a.OFFSET_SECONDS : iVar != null && iVar.c(this);
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        return iVar instanceof a ? iVar == a.OFFSET_SECONDS ? u().y() : this.f3537e.l(iVar) : iVar.g(this);
    }

    @Override // k.a.a.x.f
    public d s(d dVar) {
        return dVar.q(a.NANO_OF_DAY, this.f3537e.P()).q(a.OFFSET_SECONDS, u().y());
    }

    /* renamed from: t */
    public int compareTo(l lVar) {
        int b;
        return (!this.f3538f.equals(lVar.f3538f) && (b = k.a.a.w.d.b(z(), lVar.z())) != 0) ? b : this.f3537e.compareTo(lVar.f3537e);
    }

    public String toString() {
        return this.f3537e.toString() + this.f3538f.toString();
    }

    public r u() {
        return this.f3538f;
    }

    /* renamed from: v */
    public l k(long j2, k.a.a.x.l lVar) {
        return j2 == Long.MIN_VALUE ? r(Long.MAX_VALUE, lVar).r(1L, lVar) : r(-j2, lVar);
    }

    /* renamed from: x */
    public l r(long j2, k.a.a.x.l lVar) {
        return lVar instanceof b ? A(this.f3537e.r(j2, lVar), this.f3538f) : (l) lVar.c(this, j2);
    }
}
