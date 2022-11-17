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
public final class o extends c implements d, f, Comparable<o>, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final int f3545e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[b.values().length];
            b = iArr;
            try {
                iArr[b.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[b.DECADES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[b.CENTURIES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[b.MILLENNIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[b.ERAS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr2 = new int[k.a.a.x.a.values().length];
            a = iArr2;
            try {
                iArr2[k.a.a.x.a.YEAR_OF_ERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[k.a.a.x.a.YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[k.a.a.x.a.ERA.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    static {
        k.a.a.v.c cVar = new k.a.a.v.c();
        cVar.l(k.a.a.x.a.YEAR, 4, 10, j.EXCEEDS_PAD);
        cVar.s();
    }

    private o(int i2) {
        this.f3545e = i2;
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public static boolean u(long j2) {
        return (3 & j2) == 0 && (j2 % 100 != 0 || j2 % 400 == 0);
    }

    public static o w(int i2) {
        k.a.a.x.a.YEAR.p(i2);
        return new o(i2);
    }

    private Object writeReplace() {
        return new n((byte) 67, this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static o z(DataInput dataInput) {
        return w(dataInput.readInt());
    }

    /* renamed from: A */
    public o h(f fVar) {
        return (o) fVar.s(this);
    }

    /* renamed from: B */
    public o q(i iVar, long j2) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return (o) iVar.d(this, j2);
        }
        k.a.a.x.a aVar = (k.a.a.x.a) iVar;
        aVar.p(j2);
        int i2 = a.a[aVar.ordinal()];
        if (i2 == 1) {
            if (this.f3545e < 1) {
                j2 = 1 - j2;
            }
            return w((int) j2);
        } else if (i2 == 2) {
            return w((int) j2);
        } else {
            if (i2 == 3) {
                return l(k.a.a.x.a.ERA) == j2 ? this : w(1 - this.f3545e);
            }
            throw new m("Unsupported field: " + iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C(DataOutput dataOutput) {
        dataOutput.writeInt(this.f3545e);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public n c(i iVar) {
        if (iVar != k.a.a.x.a.YEAR_OF_ERA) {
            return super.c(iVar);
        }
        return n.i(1L, this.f3545e <= 0 ? 1000000000L : 999999999L);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public int e(i iVar) {
        return c(iVar).a(l(iVar), iVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o) && this.f3545e == ((o) obj).f3545e;
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public <R> R g(k<R> kVar) {
        if (kVar == k.a.a.x.j.a()) {
            return (R) k.a.a.u.m.f3582g;
        }
        if (kVar == k.a.a.x.j.e()) {
            return (R) b.YEARS;
        }
        if (kVar == k.a.a.x.j.b() || kVar == k.a.a.x.j.c() || kVar == k.a.a.x.j.f() || kVar == k.a.a.x.j.g() || kVar == k.a.a.x.j.d()) {
            return null;
        }
        return (R) super.g(kVar);
    }

    public int hashCode() {
        return this.f3545e;
    }

    @Override // k.a.a.x.e
    public boolean j(i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar == k.a.a.x.a.YEAR || iVar == k.a.a.x.a.YEAR_OF_ERA || iVar == k.a.a.x.a.ERA : iVar != null && iVar.c(this);
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return iVar.g(this);
        }
        int i2 = a.a[((k.a.a.x.a) iVar).ordinal()];
        int i3 = 1;
        if (i2 == 1) {
            int i4 = this.f3545e;
            if (i4 < 1) {
                i4 = 1 - i4;
            }
            return i4;
        } else if (i2 == 2) {
            return this.f3545e;
        } else {
            if (i2 == 3) {
                if (this.f3545e < 1) {
                    i3 = 0;
                }
                return i3;
            }
            throw new m("Unsupported field: " + iVar);
        }
    }

    @Override // k.a.a.x.f
    public d s(d dVar) {
        if (h.j(dVar).equals(k.a.a.u.m.f3582g)) {
            return dVar.q(k.a.a.x.a.YEAR, this.f3545e);
        }
        throw new b("Adjustment only supported on ISO date-time");
    }

    /* renamed from: t */
    public int compareTo(o oVar) {
        return this.f3545e - oVar.f3545e;
    }

    public String toString() {
        return Integer.toString(this.f3545e);
    }

    /* renamed from: v */
    public o k(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? r(Long.MAX_VALUE, lVar).r(1L, lVar) : r(-j2, lVar);
    }

    /* renamed from: x */
    public o r(long j2, l lVar) {
        if (!(lVar instanceof b)) {
            return (o) lVar.c(this, j2);
        }
        int i2 = a.b[((b) lVar).ordinal()];
        if (i2 == 1) {
            return y(j2);
        }
        if (i2 == 2) {
            return y(k.a.a.w.d.l(j2, 10));
        }
        if (i2 == 3) {
            return y(k.a.a.w.d.l(j2, 100));
        }
        if (i2 == 4) {
            return y(k.a.a.w.d.l(j2, 1000));
        }
        if (i2 == 5) {
            k.a.a.x.a aVar = k.a.a.x.a.ERA;
            return q(aVar, k.a.a.w.d.k(l(aVar), j2));
        }
        throw new m("Unsupported unit: " + lVar);
    }

    public o y(long j2) {
        return j2 == 0 ? this : w(k.a.a.x.a.YEAR.l(this.f3545e + j2));
    }
}
