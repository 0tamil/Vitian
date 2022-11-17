package k.a.a.u;

import k.a.a.x.a;
import k.a.a.x.d;
import k.a.a.x.f;
import k.a.a.x.h;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.k;
import k.a.a.x.l;
/* loaded from: classes.dex */
public abstract class b extends k.a.a.w.b implements d, f, Comparable<b> {
    /* renamed from: A */
    public abstract b r(long j2, l lVar);

    public b B(h hVar) {
        return w().d(super.t(hVar));
    }

    public long C() {
        return l(a.EPOCH_DAY);
    }

    /* renamed from: D */
    public b h(f fVar) {
        return w().d(super.h(fVar));
    }

    /* renamed from: E */
    public abstract b q(i iVar, long j2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && compareTo((b) obj) == 0;
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public <R> R g(k<R> kVar) {
        if (kVar == j.a()) {
            return (R) w();
        }
        if (kVar == j.e()) {
            return (R) k.a.a.x.b.DAYS;
        }
        if (kVar == j.b()) {
            return (R) k.a.a.f.a0(C());
        }
        if (kVar == j.c() || kVar == j.f() || kVar == j.g() || kVar == j.d()) {
            return null;
        }
        return (R) super.g(kVar);
    }

    public int hashCode() {
        long C = C();
        return w().hashCode() ^ ((int) (C ^ (C >>> 32)));
    }

    @Override // k.a.a.x.e
    public boolean j(i iVar) {
        return iVar instanceof a ? iVar.a() : iVar != null && iVar.c(this);
    }

    public d s(d dVar) {
        return dVar.q(a.EPOCH_DAY, C());
    }

    public String toString() {
        long l = l(a.YEAR_OF_ERA);
        long l2 = l(a.MONTH_OF_YEAR);
        long l3 = l(a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(w().toString());
        sb.append(" ");
        sb.append(x());
        sb.append(" ");
        sb.append(l);
        String str = "-0";
        sb.append(l2 < 10 ? str : "-");
        sb.append(l2);
        if (l3 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append(l3);
        return sb.toString();
    }

    public c<?> u(k.a.a.h hVar) {
        return d.H(this, hVar);
    }

    /* renamed from: v */
    public int compareTo(b bVar) {
        int b = k.a.a.w.d.b(C(), bVar.C());
        return b == 0 ? w().compareTo(bVar.w()) : b;
    }

    public abstract h w();

    public i x() {
        return w().h(e(a.ERA));
    }

    public boolean y(b bVar) {
        return C() < bVar.C();
    }

    /* renamed from: z */
    public b k(long j2, l lVar) {
        return w().d(super.k(j2, lVar));
    }
}
