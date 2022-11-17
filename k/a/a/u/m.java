package k.a.a.u;

import java.io.Serializable;
import java.util.Map;
import k.a.a.b;
import k.a.a.c;
import k.a.a.f;
import k.a.a.g;
import k.a.a.o;
import k.a.a.q;
import k.a.a.t;
import k.a.a.w.d;
import k.a.a.x.a;
import k.a.a.x.e;
import k.a.a.x.i;
/* loaded from: classes.dex */
public final class m extends h implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final m f3582g = new m();

    private m() {
    }

    private Object readResolve() {
        return f3582g;
    }

    /* renamed from: A */
    public g q(e eVar) {
        return g.K(eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
        if (r8.longValue() > 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
        if (r8.longValue() <= 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0096, code lost:
        r0 = k.a.a.w.d.o(1, r1.longValue());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public f B(Map<i, Long> map, k.a.a.v.i iVar) {
        int i2;
        a aVar;
        long o;
        long j2;
        a aVar2 = a.EPOCH_DAY;
        if (map.containsKey(aVar2)) {
            return f.a0(map.remove(aVar2).longValue());
        }
        a aVar3 = a.PROLEPTIC_MONTH;
        Long remove = map.remove(aVar3);
        if (remove != null) {
            if (iVar != k.a.a.v.i.LENIENT) {
                aVar3.p(remove.longValue());
            }
            u(map, a.MONTH_OF_YEAR, d.g(remove.longValue(), 12) + 1);
            u(map, a.YEAR, d.e(remove.longValue(), 12L));
        }
        a aVar4 = a.YEAR_OF_ERA;
        Long remove2 = map.remove(aVar4);
        if (remove2 != null) {
            if (iVar != k.a.a.v.i.LENIENT) {
                aVar4.p(remove2.longValue());
            }
            Long remove3 = map.remove(a.ERA);
            if (remove3 == null) {
                a aVar5 = a.YEAR;
                Long l = map.get(aVar5);
                if (iVar != k.a.a.v.i.STRICT) {
                    if (l != null) {
                    }
                    j2 = remove2.longValue();
                } else if (l == null) {
                    map.put(aVar4, remove2);
                }
                u(map, aVar5, j2);
            } else {
                if (remove3.longValue() == 1) {
                    aVar = a.YEAR;
                    o = remove2.longValue();
                } else if (remove3.longValue() == 0) {
                    aVar = a.YEAR;
                    o = d.o(1L, remove2.longValue());
                } else {
                    throw new b("Invalid value for era: " + remove3);
                }
                u(map, aVar, o);
            }
        } else {
            a aVar6 = a.ERA;
            if (map.containsKey(aVar6)) {
                aVar6.p(map.get(aVar6).longValue());
            }
        }
        a aVar7 = a.YEAR;
        if (!map.containsKey(aVar7)) {
            return null;
        }
        a aVar8 = a.MONTH_OF_YEAR;
        if (map.containsKey(aVar8)) {
            a aVar9 = a.DAY_OF_MONTH;
            if (map.containsKey(aVar9)) {
                int l2 = aVar7.l(map.remove(aVar7).longValue());
                int p = d.p(map.remove(aVar8).longValue());
                int p2 = d.p(map.remove(aVar9).longValue());
                if (iVar == k.a.a.v.i.LENIENT) {
                    return f.Y(l2, 1, 1).f0(d.n(p, 1)).e0(d.n(p2, 1));
                } else if (iVar != k.a.a.v.i.SMART) {
                    return f.Y(l2, p, p2);
                } else {
                    aVar9.p(p2);
                    if (p == 4 || p == 6 || p == 9 || p == 11) {
                        i2 = 30;
                    } else {
                        if (p == 2) {
                            i2 = k.a.a.i.FEBRUARY.d(o.u(l2));
                        }
                        return f.Y(l2, p, p2);
                    }
                    p2 = Math.min(p2, i2);
                    return f.Y(l2, p, p2);
                }
            } else {
                a aVar10 = a.ALIGNED_WEEK_OF_MONTH;
                if (map.containsKey(aVar10)) {
                    a aVar11 = a.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                    if (map.containsKey(aVar11)) {
                        int l3 = aVar7.l(map.remove(aVar7).longValue());
                        if (iVar == k.a.a.v.i.LENIENT) {
                            long o2 = d.o(map.remove(aVar8).longValue(), 1L);
                            long o3 = d.o(map.remove(aVar10).longValue(), 1L);
                            return f.Y(l3, 1, 1).f0(o2).g0(o3).e0(d.o(map.remove(aVar11).longValue(), 1L));
                        }
                        int l4 = aVar8.l(map.remove(aVar8).longValue());
                        f e0 = f.Y(l3, l4, 1).e0(((aVar10.l(map.remove(aVar10).longValue()) - 1) * 7) + (aVar11.l(map.remove(aVar11).longValue()) - 1));
                        if (iVar != k.a.a.v.i.STRICT || e0.e(aVar8) == l4) {
                            return e0;
                        }
                        throw new b("Strict mode rejected date parsed to a different month");
                    }
                    a aVar12 = a.DAY_OF_WEEK;
                    if (map.containsKey(aVar12)) {
                        int l5 = aVar7.l(map.remove(aVar7).longValue());
                        if (iVar == k.a.a.v.i.LENIENT) {
                            long o4 = d.o(map.remove(aVar8).longValue(), 1L);
                            long o5 = d.o(map.remove(aVar10).longValue(), 1L);
                            return f.Y(l5, 1, 1).f0(o4).g0(o5).e0(d.o(map.remove(aVar12).longValue(), 1L));
                        }
                        int l6 = aVar8.l(map.remove(aVar8).longValue());
                        f k0 = f.Y(l5, l6, 1).g0(aVar10.l(map.remove(aVar10).longValue()) - 1).h(k.a.a.x.g.a(c.a(aVar12.l(map.remove(aVar12).longValue()))));
                        if (iVar != k.a.a.v.i.STRICT || k0.e(aVar8) == l6) {
                            return k0;
                        }
                        throw new b("Strict mode rejected date parsed to a different month");
                    }
                }
            }
        }
        a aVar13 = a.DAY_OF_YEAR;
        if (map.containsKey(aVar13)) {
            int l7 = aVar7.l(map.remove(aVar7).longValue());
            k.a.a.v.i iVar2 = k.a.a.v.i.LENIENT;
            Long remove4 = map.remove(aVar13);
            if (iVar != iVar2) {
                return f.b0(l7, aVar13.l(remove4.longValue()));
            }
            return f.b0(l7, 1).e0(d.o(remove4.longValue(), 1L));
        }
        a aVar14 = a.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(aVar14)) {
            return null;
        }
        a aVar15 = a.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(aVar15)) {
            int l8 = aVar7.l(map.remove(aVar7).longValue());
            if (iVar == k.a.a.v.i.LENIENT) {
                long o6 = d.o(map.remove(aVar14).longValue(), 1L);
                return f.Y(l8, 1, 1).g0(o6).e0(d.o(map.remove(aVar15).longValue(), 1L));
            }
            f e02 = f.Y(l8, 1, 1).e0(((aVar14.l(map.remove(aVar14).longValue()) - 1) * 7) + (aVar15.l(map.remove(aVar15).longValue()) - 1));
            if (iVar != k.a.a.v.i.STRICT || e02.e(aVar7) == l8) {
                return e02;
            }
            throw new b("Strict mode rejected date parsed to a different year");
        }
        a aVar16 = a.DAY_OF_WEEK;
        if (!map.containsKey(aVar16)) {
            return null;
        }
        int l9 = aVar7.l(map.remove(aVar7).longValue());
        if (iVar == k.a.a.v.i.LENIENT) {
            long o7 = d.o(map.remove(aVar14).longValue(), 1L);
            return f.Y(l9, 1, 1).g0(o7).e0(d.o(map.remove(aVar16).longValue(), 1L));
        }
        f k02 = f.Y(l9, 1, 1).g0(aVar14.l(map.remove(aVar14).longValue()) - 1).h(k.a.a.x.g.a(c.a(aVar16.l(map.remove(aVar16).longValue()))));
        if (iVar != k.a.a.v.i.STRICT || k02.e(aVar7) == l9) {
            return k02;
        }
        throw new b("Strict mode rejected date parsed to a different month");
    }

    /* renamed from: C */
    public t w(k.a.a.e eVar, q qVar) {
        return t.W(eVar, qVar);
    }

    @Override // k.a.a.u.h
    public String k() {
        return "iso8601";
    }

    @Override // k.a.a.u.h
    public String l() {
        return "ISO";
    }

    /* renamed from: x */
    public f c(e eVar) {
        return f.I(eVar);
    }

    /* renamed from: y */
    public n h(int i2) {
        return n.a(i2);
    }

    public boolean z(long j2) {
        return (3 & j2) == 0 && (j2 % 100 != 0 || j2 % 400 == 0);
    }
}
