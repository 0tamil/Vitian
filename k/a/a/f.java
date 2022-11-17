package k.a.a;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.Serializable;
import k.a.a.u.b;
import k.a.a.u.m;
import k.a.a.x.d;
import k.a.a.x.e;
import k.a.a.x.h;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.k;
import k.a.a.x.l;
import k.a.a.x.n;
/* loaded from: classes.dex */
public final class f extends b implements d, k.a.a.x.f, Serializable {

    /* renamed from: h  reason: collision with root package name */
    public static final f f3509h = Y(-999999999, 1, 1);

    /* renamed from: i  reason: collision with root package name */
    public static final f f3510i = Y(999999999, 12, 31);

    /* renamed from: e  reason: collision with root package name */
    private final int f3511e;

    /* renamed from: f  reason: collision with root package name */
    private final short f3512f;

    /* renamed from: g  reason: collision with root package name */
    private final short f3513g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[k.a.a.x.b.values().length];
            b = iArr;
            try {
                iArr[k.a.a.x.b.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[k.a.a.x.b.WEEKS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[k.a.a.x.b.MONTHS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[k.a.a.x.b.YEARS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[k.a.a.x.b.DECADES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[k.a.a.x.b.CENTURIES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[k.a.a.x.b.MILLENNIA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[k.a.a.x.b.ERAS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr2 = new int[k.a.a.x.a.values().length];
            a = iArr2;
            try {
                iArr2[k.a.a.x.a.DAY_OF_MONTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[k.a.a.x.a.DAY_OF_YEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[k.a.a.x.a.ALIGNED_WEEK_OF_MONTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[k.a.a.x.a.YEAR_OF_ERA.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[k.a.a.x.a.DAY_OF_WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[k.a.a.x.a.ALIGNED_DAY_OF_WEEK_IN_MONTH.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[k.a.a.x.a.ALIGNED_DAY_OF_WEEK_IN_YEAR.ordinal()] = 7;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[k.a.a.x.a.EPOCH_DAY.ordinal()] = 8;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[k.a.a.x.a.ALIGNED_WEEK_OF_YEAR.ordinal()] = 9;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[k.a.a.x.a.MONTH_OF_YEAR.ordinal()] = 10;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                a[k.a.a.x.a.PROLEPTIC_MONTH.ordinal()] = 11;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                a[k.a.a.x.a.YEAR.ordinal()] = 12;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                a[k.a.a.x.a.ERA.ordinal()] = 13;
            } catch (NoSuchFieldError unused21) {
            }
        }
    }

    private f(int i2, int i3, int i4) {
        this.f3511e = i2;
        this.f3512f = (short) i3;
        this.f3513g = (short) i4;
    }

    private static f H(int i2, i iVar, int i3) {
        if (i3 <= 28 || i3 <= iVar.d(m.f3582g.z(i2))) {
            return new f(i2, iVar.getValue(), i3);
        }
        if (i3 == 29) {
            throw new b("Invalid date 'February 29' as '" + i2 + "' is not a leap year");
        }
        throw new b("Invalid date '" + iVar.name() + " " + i3 + "'");
    }

    public static f I(e eVar) {
        f fVar = (f) eVar.g(j.b());
        if (fVar != null) {
            return fVar;
        }
        throw new b("Unable to obtain LocalDate from TemporalAccessor: " + eVar + ", type " + eVar.getClass().getName());
    }

    private int J(i iVar) {
        switch (a.a[((k.a.a.x.a) iVar).ordinal()]) {
            case 1:
                return this.f3513g;
            case 2:
                return N();
            case 3:
                return ((this.f3513g - 1) / 7) + 1;
            case 4:
                int i2 = this.f3511e;
                return i2 >= 1 ? i2 : 1 - i2;
            case 5:
                return M().getValue();
            case 6:
                return ((this.f3513g - 1) % 7) + 1;
            case 7:
                return ((N() - 1) % 7) + 1;
            case 8:
                throw new b("Field too large for an int: " + iVar);
            case 9:
                return ((N() - 1) / 7) + 1;
            case 10:
                return this.f3512f;
            case 11:
                throw new b("Field too large for an int: " + iVar);
            case 12:
                return this.f3511e;
            case 13:
                return this.f3511e >= 1 ? 1 : 0;
            default:
                throw new k.a.a.x.m("Unsupported field: " + iVar);
        }
    }

    private long Q() {
        return (this.f3511e * 12) + (this.f3512f - 1);
    }

    public static f Y(int i2, int i3, int i4) {
        k.a.a.x.a.YEAR.p(i2);
        k.a.a.x.a.MONTH_OF_YEAR.p(i3);
        k.a.a.x.a.DAY_OF_MONTH.p(i4);
        return H(i2, i.u(i3), i4);
    }

    public static f Z(int i2, i iVar, int i3) {
        k.a.a.x.a.YEAR.p(i2);
        k.a.a.w.d.i(iVar, "month");
        k.a.a.x.a.DAY_OF_MONTH.p(i3);
        return H(i2, iVar, i3);
    }

    public static f a0(long j2) {
        long j3;
        k.a.a.x.a.EPOCH_DAY.p(j2);
        long j4 = (j2 + 719528) - 60;
        if (j4 < 0) {
            long j5 = ((j4 + 1) / 146097) - 1;
            j3 = j5 * 400;
            j4 += (-j5) * 146097;
        } else {
            j3 = 0;
        }
        long j6 = ((j4 * 400) + 591) / 146097;
        long j7 = j4 - ((((j6 * 365) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
        if (j7 < 0) {
            j6--;
            j7 = j4 - ((((365 * j6) + (j6 / 4)) - (j6 / 100)) + (j6 / 400));
        }
        int i2 = (int) j7;
        int i3 = ((i2 * 5) + 2) / 153;
        return new f(k.a.a.x.a.YEAR.l(j6 + j3 + (i3 / 10)), ((i3 + 2) % 12) + 1, (i2 - (((i3 * 306) + 5) / 10)) + 1);
    }

    public static f b0(int i2, int i3) {
        long j2 = i2;
        k.a.a.x.a.YEAR.p(j2);
        k.a.a.x.a.DAY_OF_YEAR.p(i3);
        boolean z = m.f3582g.z(j2);
        if (i3 != 366 || z) {
            i u = i.u(((i3 - 1) / 31) + 1);
            if (i3 > (u.a(z) + u.d(z)) - 1) {
                u = u.v(1L);
            }
            return H(i2, u, (i3 - u.a(z)) + 1);
        }
        throw new b("Invalid date 'DayOfYear 366' as '" + i2 + "' is not a leap year");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f i0(DataInput dataInput) {
        return Y(dataInput.readInt(), dataInput.readByte(), dataInput.readByte());
    }

    private static f j0(int i2, int i3, int i4) {
        int i5;
        if (i3 != 2) {
            if (i3 == 4 || i3 == 6 || i3 == 9 || i3 == 11) {
                i5 = 30;
            }
            return Y(i2, i3, i4);
        }
        i5 = m.f3582g.z((long) i2) ? 29 : 28;
        i4 = Math.min(i4, i5);
        return Y(i2, i3, i4);
    }

    private Object readResolve() {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 3, this);
    }

    @Override // k.a.a.u.b
    public long C() {
        long j2 = this.f3511e;
        long j3 = this.f3512f;
        long j4 = (365 * j2) + 0;
        long j5 = (j2 >= 0 ? j4 + (((3 + j2) / 4) - ((99 + j2) / 100)) + ((j2 + 399) / 400) : j4 - (((j2 / (-4)) - (j2 / (-100))) + (j2 / (-400)))) + (((367 * j3) - 362) / 12) + (this.f3513g - 1);
        if (j3 > 2) {
            j5--;
            if (!S()) {
                j5--;
            }
        }
        return j5 - 719528;
    }

    /* renamed from: F */
    public g u(h hVar) {
        return g.V(this, hVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int G(f fVar) {
        int i2 = this.f3511e - fVar.f3511e;
        if (i2 != 0) {
            return i2;
        }
        int i3 = this.f3512f - fVar.f3512f;
        return i3 == 0 ? this.f3513g - fVar.f3513g : i3;
    }

    /* renamed from: K */
    public m w() {
        return m.f3582g;
    }

    public int L() {
        return this.f3513g;
    }

    public c M() {
        return c.a(k.a.a.w.d.g(C() + 3, 7) + 1);
    }

    public int N() {
        return (O().a(S()) + this.f3513g) - 1;
    }

    public i O() {
        return i.u(this.f3512f);
    }

    public int P() {
        return this.f3512f;
    }

    public int R() {
        return this.f3511e;
    }

    public boolean S() {
        return m.f3582g.z(this.f3511e);
    }

    public int T() {
        short s = this.f3512f;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : S() ? 29 : 28;
    }

    public int U() {
        return S() ? 366 : 365;
    }

    /* renamed from: V */
    public f z(long j2, l lVar) {
        return j2 == Long.MIN_VALUE ? r(Long.MAX_VALUE, lVar).r(1L, lVar) : r(-j2, lVar);
    }

    public f W(long j2) {
        return j2 == Long.MIN_VALUE ? e0(Long.MAX_VALUE).e0(1L) : e0(-j2);
    }

    public f X(long j2) {
        return j2 == Long.MIN_VALUE ? h0(Long.MAX_VALUE).h0(1L) : h0(-j2);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public n c(i iVar) {
        int T;
        if (!(iVar instanceof k.a.a.x.a)) {
            return iVar.k(this);
        }
        k.a.a.x.a aVar = (k.a.a.x.a) iVar;
        if (aVar.a()) {
            int i2 = a.a[aVar.ordinal()];
            if (i2 == 1) {
                T = T();
            } else if (i2 == 2) {
                T = U();
            } else if (i2 == 3) {
                return n.i(1L, (O() != i.FEBRUARY || S()) ? 5L : 4L);
            } else if (i2 != 4) {
                return iVar.h();
            } else {
                return n.i(1L, R() <= 0 ? 1000000000L : 999999999L);
            }
            return n.i(1L, T);
        }
        throw new k.a.a.x.m("Unsupported field: " + iVar);
    }

    /* renamed from: c0 */
    public f r(long j2, l lVar) {
        if (!(lVar instanceof k.a.a.x.b)) {
            return (f) lVar.c(this, j2);
        }
        switch (a.b[((k.a.a.x.b) lVar).ordinal()]) {
            case 1:
                return e0(j2);
            case 2:
                return g0(j2);
            case 3:
                return f0(j2);
            case 4:
                return h0(j2);
            case 5:
                return h0(k.a.a.w.d.l(j2, 10));
            case 6:
                return h0(k.a.a.w.d.l(j2, 100));
            case 7:
                return h0(k.a.a.w.d.l(j2, 1000));
            case 8:
                k.a.a.x.a aVar = k.a.a.x.a.ERA;
                return q(aVar, k.a.a.w.d.k(l(aVar), j2));
            default:
                throw new k.a.a.x.m("Unsupported unit: " + lVar);
        }
    }

    /* renamed from: d0 */
    public f B(h hVar) {
        return (f) hVar.a(this);
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public int e(i iVar) {
        return iVar instanceof k.a.a.x.a ? J(iVar) : super.e(iVar);
    }

    public f e0(long j2) {
        return j2 == 0 ? this : a0(k.a.a.w.d.k(C(), j2));
    }

    @Override // k.a.a.u.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f) && G((f) obj) == 0;
    }

    public f f0(long j2) {
        if (j2 == 0) {
            return this;
        }
        long j3 = (this.f3511e * 12) + (this.f3512f - 1) + j2;
        return j0(k.a.a.x.a.YEAR.l(k.a.a.w.d.e(j3, 12L)), k.a.a.w.d.g(j3, 12) + 1, this.f3513g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // k.a.a.u.b, k.a.a.w.c, k.a.a.x.e
    public <R> R g(k<R> kVar) {
        return kVar == j.b() ? this : (R) super.g(kVar);
    }

    public f g0(long j2) {
        return e0(k.a.a.w.d.l(j2, 7));
    }

    public f h0(long j2) {
        return j2 == 0 ? this : j0(k.a.a.x.a.YEAR.l(this.f3511e + j2), this.f3512f, this.f3513g);
    }

    @Override // k.a.a.u.b
    public int hashCode() {
        int i2 = this.f3511e;
        return (((i2 << 11) + (this.f3512f << 6)) + this.f3513g) ^ (i2 & (-2048));
    }

    @Override // k.a.a.u.b, k.a.a.x.e
    public boolean j(i iVar) {
        return super.j(iVar);
    }

    /* renamed from: k0 */
    public f h(k.a.a.x.f fVar) {
        return fVar instanceof f ? (f) fVar : (f) fVar.s(this);
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        return iVar instanceof k.a.a.x.a ? iVar == k.a.a.x.a.EPOCH_DAY ? C() : iVar == k.a.a.x.a.PROLEPTIC_MONTH ? Q() : J(iVar) : iVar.g(this);
    }

    /* renamed from: l0 */
    public f q(i iVar, long j2) {
        if (!(iVar instanceof k.a.a.x.a)) {
            return (f) iVar.d(this, j2);
        }
        k.a.a.x.a aVar = (k.a.a.x.a) iVar;
        aVar.p(j2);
        switch (a.a[aVar.ordinal()]) {
            case 1:
                return m0((int) j2);
            case 2:
                return n0((int) j2);
            case 3:
                return g0(j2 - l(k.a.a.x.a.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (this.f3511e < 1) {
                    j2 = 1 - j2;
                }
                return p0((int) j2);
            case 5:
                return e0(j2 - M().getValue());
            case 6:
                return e0(j2 - l(k.a.a.x.a.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return e0(j2 - l(k.a.a.x.a.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return a0(j2);
            case 9:
                return g0(j2 - l(k.a.a.x.a.ALIGNED_WEEK_OF_YEAR));
            case 10:
                return o0((int) j2);
            case 11:
                return f0(j2 - l(k.a.a.x.a.PROLEPTIC_MONTH));
            case 12:
                return p0((int) j2);
            case 13:
                return l(k.a.a.x.a.ERA) == j2 ? this : p0(1 - this.f3511e);
            default:
                throw new k.a.a.x.m("Unsupported field: " + iVar);
        }
    }

    public f m0(int i2) {
        return this.f3513g == i2 ? this : Y(this.f3511e, this.f3512f, i2);
    }

    public f n0(int i2) {
        return N() == i2 ? this : b0(this.f3511e, i2);
    }

    public f o0(int i2) {
        if (this.f3512f == i2) {
            return this;
        }
        k.a.a.x.a.MONTH_OF_YEAR.p(i2);
        return j0(this.f3511e, i2, this.f3513g);
    }

    public f p0(int i2) {
        if (this.f3511e == i2) {
            return this;
        }
        k.a.a.x.a.YEAR.p(i2);
        return j0(i2, this.f3512f, this.f3513g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q0(DataOutput dataOutput) {
        dataOutput.writeInt(this.f3511e);
        dataOutput.writeByte(this.f3512f);
        dataOutput.writeByte(this.f3513g);
    }

    @Override // k.a.a.u.b, k.a.a.x.f
    public d s(d dVar) {
        return super.s(dVar);
    }

    @Override // k.a.a.u.b
    public String toString() {
        int i2;
        int i3 = this.f3511e;
        short s = this.f3512f;
        short s2 = this.f3513g;
        int abs = Math.abs(i3);
        StringBuilder sb = new StringBuilder(10);
        if (abs < 1000) {
            if (i3 < 0) {
                sb.append(i3 - 10000);
                i2 = 1;
            } else {
                sb.append(i3 + 10000);
                i2 = 0;
            }
            sb.deleteCharAt(i2);
        } else {
            if (i3 > 9999) {
                sb.append('+');
            }
            sb.append(i3);
        }
        String str = "-0";
        sb.append(s < 10 ? str : "-");
        sb.append((int) s);
        if (s2 >= 10) {
            str = "-";
        }
        sb.append(str);
        sb.append((int) s2);
        return sb.toString();
    }

    @Override // k.a.a.u.b
    /* renamed from: v */
    public int compareTo(b bVar) {
        return bVar instanceof f ? G((f) bVar) : super.compareTo(bVar);
    }

    @Override // k.a.a.u.b
    public k.a.a.u.i x() {
        return super.x();
    }

    @Override // k.a.a.u.b
    public boolean y(b bVar) {
        return bVar instanceof f ? G((f) bVar) < 0 : super.y(bVar);
    }
}
