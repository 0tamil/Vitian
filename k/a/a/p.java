package k.a.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import k.a.a.u.h;
import k.a.a.v.j;
import k.a.a.w.c;
import k.a.a.x.b;
import k.a.a.x.d;
import k.a.a.x.f;
import k.a.a.x.i;
import k.a.a.x.k;
import k.a.a.x.l;
import k.a.a.x.m;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class p extends c implements d, f, Comparable<p>, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final int f3546e;

    /* renamed from: f  reason: collision with root package name */
    private final int f3547f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.MONTHS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.CENTURIES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[b.MILLENNIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[b.ERAS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[k.a.a.x.a.values().length];
            a = iArr2;
            try {
                iArr2[k.a.a.x.a.MONTH_OF_YEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[k.a.a.x.a.PROLEPTIC_MONTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[k.a.a.x.a.YEAR_OF_ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[k.a.a.x.a.YEAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[k.a.a.x.a.ERA.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    static {
        k.a.a.v.c cVar = new k.a.a.v.c();
        cVar.l(k.a.a.x.a.YEAR, 4, 10, j.EXCEEDS_PAD);
        cVar.e('-');
        cVar.k(k.a.a.x.a.MONTH_OF_YEAR, 2);
        cVar.s();
    }

    private p(int i2, int i3) {
        this.f3546e = i2;
        this.f3547f = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p B(DataInput dataInput) {
        return x(dataInput.readInt(), dataInput.readByte());
    }

    private p C(int i2, int i3) {
        return (this.f3546e == i2 && this.f3547f == i3) ? this : new p(i2, i3);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private long u() {
        return (this.f3546e * 12) + (this.f3547f - 1);
    }

    private Object writeReplace() {
        return new n((byte) 68, this);
    }

    public static p x(int i2, int i3) {
        k.a.a.x.a.YEAR.p(i2);
        k.a.a.x.a.MONTH_OF_YEAR.p(i3);
        return new p(i2, i3);
    }

    public p A(long j2) {
        return j2 == 0 ? this : C(k.a.a.x.a.YEAR.l(this.f3546e + j2), this.f3547f);
    }

    /* renamed from: D */
    public p h(f fVar) {
        return (p) fVar.s(this);
    }

    /* renamed from: E */
    public p q(i iVar, long j2) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return (p) iVar.d(this, j2);
        }
        k.a.a.x.a aVar = (k.a.a.x.a) iVar;
        aVar.p(j2);
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            return F((int) j2);
        }
        if (i2 == 2) {
            return z(j2 - l(k.a.a.x.a.PROLEPTIC_MONTH));
        }
        if (i2 == 3) {
            if (this.f3546e < 1) {
                j2 = 1 - j2;
            }
            return G((int) j2);
        } else if (i2 == 4) {
            return G((int) j2);
        } else {
            if (i2 == 5) {
                return l(k.a.a.x.a.ERA) == j2 ? this : G(1 - this.f3546e);
            }
            throw new m("Unsupported field: " + iVar);
        }
    }

    public p F(int i2) {
        k.a.a.x.a.MONTH_OF_YEAR.p(i2);
        return C(this.f3546e, i2);
    }

    public p G(int i2) {
        k.a.a.x.a.YEAR.p(i2);
        return C(i2, this.f3547f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void H(DataOutput dataOutput) {
        dataOutput.writeInt(this.f3546e);
        dataOutput.writeByte(this.f3547f);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public n c(i iVar) {
        if (iVar != k.a.a.x.a.YEAR_OF_ERA) {
            return super.c(iVar);
        }
        return n.i(1L, v() <= 0 ? 1000000000L : 999999999L);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public int e(i iVar) {
        return c(iVar).a(l(iVar), iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f3546e == pVar.f3546e && this.f3547f == pVar.f3547f;
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public <R> R g(k<R> kVar) {
        if (kVar == k.a.a.x.j.a()) {
            return (R) k.a.a.u.m.f3582g;
        }
        if (kVar == k.a.a.x.j.e()) {
            return (R) b.MONTHS;
        }
        if (kVar == k.a.a.x.j.b() || kVar == k.a.a.x.j.c() || kVar == k.a.a.x.j.f() || kVar == k.a.a.x.j.g() || kVar == k.a.a.x.j.d()) {
            return null;
        }
        return (R) super.g(kVar);
    }

    public int hashCode() {
        return this.f3546e ^ (this.f3547f << 27);
    }

    @Override // k.a.a.x.e
    public boolean j(i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar == k.a.a.x.a.YEAR || iVar == k.a.a.x.a.MONTH_OF_YEAR || iVar == k.a.a.x.a.PROLEPTIC_MONTH || iVar == k.a.a.x.a.YEAR_OF_ERA || iVar == k.a.a.x.a.ERA : iVar != null && iVar.c(this);
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        int i2;
        if (!(iVar instanceof k.a.a.x.a)) {
            return iVar.g(this);
        }
        int i3 = a.a[((k.a.a.x.a) iVar).ordinal()];
        int i4 = 1;
        if (i3 == 1) {
            i2 = this.f3547f;
        } else if (i3 == 2) {
            return u();
        } else {
            if (i3 == 3) {
                int i5 = this.f3546e;
                if (i5 < 1) {
                    i5 = 1 - i5;
                }
                return i5;
            } else if (i3 == 4) {
                i2 = this.f3546e;
            } else if (i3 == 5) {
                if (this.f3546e < 1) {
                    i4 = 0;
                }
                return i4;
            } else {
                throw new m("Unsupported field: " + iVar);
            }
        }
        return i2;
    }

    @Override // k.a.a.x.f
    public d s(d dVar) {
        if (h.j(dVar).equals(k.a.a.u.m.f3582g)) {
            return dVar.q(k.a.a.x.a.PROLEPTIC_MONTH, u());
        }
        throw new b("Adjustment only supported on ISO date-time");
    }

    /* renamed from: t */
    public int compareTo(p pVar) {
        int i2 = this.f3546e - pVar.f3546e;
        return i2 == 0 ? this.f3547f - pVar.f3547f : i2;
    }

    public String toString() {
        int i2;
        int abs = Math.abs(this.f3546e);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            int i3 = this.f3546e;
            if (i3 < 0) {
                sb.append(i3 - 10000);
                i2 = 1;
            } else {
                sb.append(i3 + 10000);
                i2 = 0;
            }
            sb.deleteCharAt(i2);
        } else {
            sb.append(this.f3546e);
        }
        sb.append(this.f3547f < 10 ? "-0" : "-");
        sb.append(this.f3547f);
        return sb.toString();
    }

    public int v() {
        return this.f3546e;
    }

    /* renamed from: w */
    public p k(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? r(Long.MAX_VALUE, lVar).r(1L, lVar) : r(-j2, lVar);
    }

    /* renamed from: y */
    public p r(long j2, l lVar) {
        if (!(lVar instanceof b)) {
            return (p) lVar.c(this, j2);
        }
        switch (a.b[((b) lVar).ordinal()]) {
            case 1:
                return z(j2);
            case 2:
                return A(j2);
            case 3:
                return A(k.a.a.w.d.l(j2, 10));
            case 4:
                return A(k.a.a.w.d.l(j2, 100));
            case 5:
                return A(k.a.a.w.d.l(j2, 1000));
            case 6:
                k.a.a.x.a aVar = k.a.a.x.a.ERA;
                return q(aVar, k.a.a.w.d.k(l(aVar), j2));
            default:
                throw new m("Unsupported unit: " + lVar);
        }
    }

    public p z(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = (this.f3546e * 12) + (this.f3547f - 1) + j2;
        return C(k.a.a.x.a.YEAR.l(k.a.a.w.d.e(j3, 12L)), k.a.a.w.d.g(j3, 12) + 1);
    }
}
