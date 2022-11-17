package k.a.a.x;

import java.util.Map;
import k.a.a.d;
import k.a.a.f;
import k.a.a.u.h;
import k.a.a.u.m;
import k.a.a.v.i;
/* loaded from: classes.dex */
public final class c {
    public static final i a = b.f3722f;
    public static final i b = b.f3723g;
    public static final i c = b.f3724h;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC0150c.values().length];
            a = iArr;
            try {
                iArr[EnumC0150c.WEEK_BASED_YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[EnumC0150c.QUARTER_YEARS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* loaded from: classes.dex */
    public static abstract class b extends Enum<b> implements i {

        /* renamed from: e  reason: collision with root package name */
        public static final b f3721e;

        /* renamed from: f  reason: collision with root package name */
        public static final b f3722f;

        /* renamed from: g  reason: collision with root package name */
        public static final b f3723g;

        /* renamed from: h  reason: collision with root package name */
        public static final b f3724h;

        /* renamed from: i  reason: collision with root package name */
        private static final int[] f3725i = {0, 90, 181, 273, 0, 91, 182, 274};

        /* renamed from: j  reason: collision with root package name */
        private static final /* synthetic */ b[] f3726j;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* loaded from: classes.dex */
        final class a extends b {
            a(String str, int i2) {
                super(str, i2, null);
            }

            @Override // k.a.a.x.i
            public boolean c(e eVar) {
                return eVar.j(k.a.a.x.a.DAY_OF_YEAR) && eVar.j(k.a.a.x.a.MONTH_OF_YEAR) && eVar.j(k.a.a.x.a.YEAR) && b.y(eVar);
            }

            @Override // k.a.a.x.i
            public <R extends k.a.a.x.d> R d(R r, long j2) {
                long g2 = g(r);
                h().b(j2, this);
                k.a.a.x.a aVar = k.a.a.x.a.DAY_OF_YEAR;
                return (R) r.q(aVar, r.l(aVar) + (j2 - g2));
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
                if (r2 == 2) goto L17;
             */
            @Override // k.a.a.x.c.b, k.a.a.x.i
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public e e(Map<i, Long> map, e eVar, i iVar) {
                f fVar;
                n nVar;
                k.a.a.x.a aVar = k.a.a.x.a.YEAR;
                Long l = map.get(aVar);
                i iVar2 = b.f3722f;
                Long l2 = map.get(iVar2);
                if (l == null || l2 == null) {
                    return null;
                }
                int l3 = aVar.l(l.longValue());
                long longValue = map.get(b.f3721e).longValue();
                if (iVar == i.LENIENT) {
                    fVar = f.Y(l3, 1, 1).f0(k.a.a.w.d.l(k.a.a.w.d.o(l2.longValue(), 1L), 3)).e0(k.a.a.w.d.o(longValue, 1L));
                } else {
                    int a = iVar2.h().a(l2.longValue(), iVar2);
                    if (iVar == i.STRICT) {
                        int i2 = 92;
                        if (a == 1) {
                            if (!m.f3582g.z(l3)) {
                                i2 = 90;
                                nVar = n.i(1L, i2);
                            }
                            i2 = 91;
                            nVar = n.i(1L, i2);
                        }
                    } else {
                        nVar = h();
                    }
                    nVar.b(longValue, this);
                    fVar = f.Y(l3, ((a - 1) * 3) + 1, 1).e0(longValue - 1);
                }
                map.remove(this);
                map.remove(aVar);
                map.remove(iVar2);
                return fVar;
            }

            @Override // k.a.a.x.i
            public long g(e eVar) {
                if (eVar.j(this)) {
                    return eVar.e(k.a.a.x.a.DAY_OF_YEAR) - b.f3725i[((eVar.e(k.a.a.x.a.MONTH_OF_YEAR) - 1) / 3) + (m.f3582g.z(eVar.l(k.a.a.x.a.YEAR)) ? 4 : 0)];
                }
                throw new m("Unsupported field: DayOfQuarter");
            }

            @Override // k.a.a.x.i
            public n h() {
                return n.j(1L, 90L, 92L);
            }

            @Override // k.a.a.x.i
            public n k(e eVar) {
                if (eVar.j(this)) {
                    long l = eVar.l(b.f3722f);
                    if (l != 1) {
                        return l == 2 ? n.i(1L, 91L) : (l == 3 || l == 4) ? n.i(1L, 92L) : h();
                    }
                    return m.f3582g.z(eVar.l(k.a.a.x.a.YEAR)) ? n.i(1L, 91L) : n.i(1L, 90L);
                }
                throw new m("Unsupported field: DayOfQuarter");
            }

            @Override // java.lang.Enum
            public String toString() {
                return "DayOfQuarter";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* renamed from: k.a.a.x.c$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        final class C0148b extends b {
            C0148b(String str, int i2) {
                super(str, i2, null);
            }

            @Override // k.a.a.x.i
            public boolean c(e eVar) {
                return eVar.j(k.a.a.x.a.MONTH_OF_YEAR) && b.y(eVar);
            }

            @Override // k.a.a.x.i
            public <R extends k.a.a.x.d> R d(R r, long j2) {
                long g2 = g(r);
                h().b(j2, this);
                k.a.a.x.a aVar = k.a.a.x.a.MONTH_OF_YEAR;
                return (R) r.q(aVar, r.l(aVar) + ((j2 - g2) * 3));
            }

            @Override // k.a.a.x.i
            public long g(e eVar) {
                if (eVar.j(this)) {
                    return (eVar.l(k.a.a.x.a.MONTH_OF_YEAR) + 2) / 3;
                }
                throw new m("Unsupported field: QuarterOfYear");
            }

            @Override // k.a.a.x.i
            public n h() {
                return n.i(1L, 4L);
            }

            @Override // k.a.a.x.i
            public n k(e eVar) {
                return h();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "QuarterOfYear";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* renamed from: k.a.a.x.c$b$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        final class C0149c extends b {
            C0149c(String str, int i2) {
                super(str, i2, null);
            }

            @Override // k.a.a.x.i
            public boolean c(e eVar) {
                return eVar.j(k.a.a.x.a.EPOCH_DAY) && b.y(eVar);
            }

            @Override // k.a.a.x.i
            public <R extends k.a.a.x.d> R d(R r, long j2) {
                h().b(j2, this);
                return (R) r.r(k.a.a.w.d.o(j2, g(r)), k.a.a.x.b.WEEKS);
            }

            @Override // k.a.a.x.c.b, k.a.a.x.i
            public e e(Map<i, Long> map, e eVar, i iVar) {
                i iVar2;
                f fVar;
                i iVar3 = b.f3724h;
                Long l = map.get(iVar3);
                k.a.a.x.a aVar = k.a.a.x.a.DAY_OF_WEEK;
                Long l2 = map.get(aVar);
                if (l == null || l2 == null) {
                    return null;
                }
                int a = iVar3.h().a(l.longValue(), iVar3);
                long longValue = map.get(b.f3723g).longValue();
                if (iVar == i.LENIENT) {
                    long longValue2 = l2.longValue();
                    long j2 = 0;
                    if (longValue2 > 7) {
                        long j3 = longValue2 - 1;
                        j2 = j3 / 7;
                        longValue2 = (j3 % 7) + 1;
                    } else if (longValue2 < 1) {
                        j2 = (longValue2 / 7) - 1;
                        longValue2 = (longValue2 % 7) + 7;
                    }
                    iVar2 = iVar3;
                    fVar = f.Y(a, 1, 4).g0(longValue - 1).g0(j2).q(aVar, longValue2);
                } else {
                    iVar2 = iVar3;
                    int l3 = aVar.l(l2.longValue());
                    (iVar == i.STRICT ? b.x(f.Y(a, 1, 4)) : h()).b(longValue, this);
                    fVar = f.Y(a, 1, 4).g0(longValue - 1).q(aVar, l3);
                }
                map.remove(this);
                map.remove(iVar2);
                map.remove(aVar);
                return fVar;
            }

            @Override // k.a.a.x.i
            public long g(e eVar) {
                if (eVar.j(this)) {
                    return b.u(f.I(eVar));
                }
                throw new m("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // k.a.a.x.i
            public n h() {
                return n.j(1L, 52L, 53L);
            }

            @Override // k.a.a.x.i
            public n k(e eVar) {
                if (eVar.j(this)) {
                    return b.x(f.I(eVar));
                }
                throw new m("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekOfWeekBasedYear";
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
        /* loaded from: classes.dex */
        final class d extends b {
            d(String str, int i2) {
                super(str, i2, null);
            }

            @Override // k.a.a.x.i
            public boolean c(e eVar) {
                return eVar.j(k.a.a.x.a.EPOCH_DAY) && b.y(eVar);
            }

            @Override // k.a.a.x.i
            public <R extends k.a.a.x.d> R d(R r, long j2) {
                if (c(r)) {
                    int a = h().a(j2, b.f3724h);
                    f I = f.I(r);
                    k.a.a.x.a aVar = k.a.a.x.a.DAY_OF_WEEK;
                    int e2 = I.e(aVar);
                    int u = b.u(I);
                    if (u == 53 && b.w(a) == 52) {
                        u = 52;
                    }
                    f Y = f.Y(a, 1, 4);
                    return (R) r.h(Y.e0((e2 - Y.e(aVar)) + ((u - 1) * 7)));
                }
                throw new m("Unsupported field: WeekBasedYear");
            }

            @Override // k.a.a.x.i
            public long g(e eVar) {
                if (eVar.j(this)) {
                    return b.v(f.I(eVar));
                }
                throw new m("Unsupported field: WeekBasedYear");
            }

            @Override // k.a.a.x.i
            public n h() {
                return k.a.a.x.a.YEAR.h();
            }

            @Override // k.a.a.x.i
            public n k(e eVar) {
                return k.a.a.x.a.YEAR.h();
            }

            @Override // java.lang.Enum
            public String toString() {
                return "WeekBasedYear";
            }
        }

        static {
            a aVar = new a("DAY_OF_QUARTER", 0);
            f3721e = aVar;
            C0148b bVar = new C0148b("QUARTER_OF_YEAR", 1);
            f3722f = bVar;
            C0149c cVar = new C0149c("WEEK_OF_WEEK_BASED_YEAR", 2);
            f3723g = cVar;
            d dVar = new d("WEEK_BASED_YEAR", 3);
            f3724h = dVar;
            f3726j = new b[]{aVar, bVar, cVar, dVar};
        }

        private b(String str, int i2) {
        }

        /* synthetic */ b(String str, int i2, a aVar) {
            this(str, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int u(f fVar) {
            int ordinal = fVar.M().ordinal();
            int N = fVar.N() - 1;
            int i2 = (3 - ordinal) + N;
            int i3 = (i2 - ((i2 / 7) * 7)) - 3;
            if (i3 < -3) {
                i3 += 7;
            }
            if (N < i3) {
                return (int) x(fVar.n0(180).X(1L)).c();
            }
            int i4 = ((N - i3) / 7) + 1;
            if (i4 == 53) {
                if (!(i3 == -3 || (i3 == -2 && fVar.S()))) {
                    return 1;
                }
            }
            return i4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int v(f fVar) {
            int R = fVar.R();
            int N = fVar.N();
            if (N <= 3) {
                return N - fVar.M().ordinal() < -2 ? R - 1 : R;
            }
            if (N < 363) {
                return R;
            }
            return ((N - 363) - (fVar.S() ? 1 : 0)) - fVar.M().ordinal() >= 0 ? R + 1 : R;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f3726j.clone();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static int w(int i2) {
            f Y = f.Y(i2, 1, 1);
            if (Y.M() != k.a.a.c.THURSDAY) {
                return (Y.M() != k.a.a.c.WEDNESDAY || !Y.S()) ? 52 : 53;
            }
            return 53;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static n x(f fVar) {
            return n.i(1L, w(v(fVar)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean y(e eVar) {
            return h.j(eVar).equals(m.f3582g);
        }

        @Override // k.a.a.x.i
        public boolean a() {
            return true;
        }

        @Override // k.a.a.x.i
        public e e(Map<i, Long> map, e eVar, i iVar) {
            return null;
        }

        @Override // k.a.a.x.i
        public boolean j() {
            return false;
        }
    }

    /* renamed from: k.a.a.x.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private enum EnumC0150c implements l {
        WEEK_BASED_YEARS("WeekBasedYears", d.h(31556952)),
        QUARTER_YEARS("QuarterYears", d.h(7889238));
        

        /* renamed from: e  reason: collision with root package name */
        private final String f3730e;

        EnumC0150c(String str, d dVar) {
            this.f3730e = str;
        }

        @Override // k.a.a.x.l
        public boolean a() {
            return true;
        }

        @Override // k.a.a.x.l
        public <R extends d> R c(R r, long j2) {
            int i2 = a.a[ordinal()];
            if (i2 == 1) {
                i iVar = c.c;
                return (R) r.q(iVar, k.a.a.w.d.k(r.e(iVar), j2));
            } else if (i2 == 2) {
                return (R) r.r(j2 / 256, k.a.a.x.b.YEARS).r((j2 % 256) * 3, k.a.a.x.b.MONTHS);
            } else {
                throw new IllegalStateException("Unreachable");
            }
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f3730e;
        }
    }

    static {
        b bVar = b.f3721e;
        EnumC0150c cVar = EnumC0150c.WEEK_BASED_YEARS;
        EnumC0150c cVar2 = EnumC0150c.QUARTER_YEARS;
    }
}
