package k.a.a.v;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import k.a.a.f;
import k.a.a.m;
import k.a.a.q;
import k.a.a.r;
import k.a.a.u.b;
import k.a.a.u.h;
import k.a.a.w.c;
import k.a.a.w.d;
import k.a.a.x.e;
import k.a.a.x.i;
import k.a.a.x.j;
import k.a.a.x.k;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends c implements e, Cloneable {

    /* renamed from: e  reason: collision with root package name */
    final Map<i, Long> f3617e = new HashMap();

    /* renamed from: f  reason: collision with root package name */
    h f3618f;

    /* renamed from: g  reason: collision with root package name */
    q f3619g;

    /* renamed from: h  reason: collision with root package name */
    b f3620h;

    /* renamed from: i  reason: collision with root package name */
    k.a.a.h f3621i;

    /* renamed from: j  reason: collision with root package name */
    boolean f3622j;

    /* renamed from: k  reason: collision with root package name */
    m f3623k;

    private Long A(i iVar) {
        return this.f3617e.get(iVar);
    }

    private void B(i iVar) {
        if (this.f3618f instanceof k.a.a.u.m) {
            x(k.a.a.u.m.f3582g.B(this.f3617e, iVar));
            return;
        }
        Map<i, Long> map = this.f3617e;
        k.a.a.x.a aVar = k.a.a.x.a.EPOCH_DAY;
        if (map.containsKey(aVar)) {
            x(f.a0(this.f3617e.remove(aVar).longValue()));
        }
    }

    private void C() {
        if (this.f3617e.containsKey(k.a.a.x.a.INSTANT_SECONDS)) {
            q qVar = this.f3619g;
            if (qVar == null) {
                Long l = this.f3617e.get(k.a.a.x.a.OFFSET_SECONDS);
                if (l != null) {
                    qVar = r.B(l.intValue());
                } else {
                    return;
                }
            }
            D(qVar);
        }
    }

    private void D(q qVar) {
        Map<i, Long> map = this.f3617e;
        k.a.a.x.a aVar = k.a.a.x.a.INSTANT_SECONDS;
        k.a.a.u.f<?> w = this.f3618f.w(k.a.a.e.A(map.remove(aVar).longValue()), qVar);
        if (this.f3620h == null) {
            v(w.C());
        } else {
            L(aVar, w.C());
        }
        t(k.a.a.x.a.SECOND_OF_DAY, w.E().Q());
    }

    private void E(i iVar) {
        k.a.a.x.a aVar;
        long j2;
        Map<i, Long> map = this.f3617e;
        k.a.a.x.a aVar2 = k.a.a.x.a.CLOCK_HOUR_OF_DAY;
        long j3 = 0;
        if (map.containsKey(aVar2)) {
            long longValue = this.f3617e.remove(aVar2).longValue();
            if (!(iVar == i.LENIENT || (iVar == i.SMART && longValue == 0))) {
                aVar2.p(longValue);
            }
            k.a.a.x.a aVar3 = k.a.a.x.a.HOUR_OF_DAY;
            if (longValue == 24) {
                longValue = 0;
            }
            t(aVar3, longValue);
        }
        Map<i, Long> map2 = this.f3617e;
        k.a.a.x.a aVar4 = k.a.a.x.a.CLOCK_HOUR_OF_AMPM;
        if (map2.containsKey(aVar4)) {
            long longValue2 = this.f3617e.remove(aVar4).longValue();
            if (!(iVar == i.LENIENT || (iVar == i.SMART && longValue2 == 0))) {
                aVar4.p(longValue2);
            }
            k.a.a.x.a aVar5 = k.a.a.x.a.HOUR_OF_AMPM;
            if (longValue2 != 12) {
                j3 = longValue2;
            }
            t(aVar5, j3);
        }
        i iVar2 = i.LENIENT;
        if (iVar != iVar2) {
            Map<i, Long> map3 = this.f3617e;
            k.a.a.x.a aVar6 = k.a.a.x.a.AMPM_OF_DAY;
            if (map3.containsKey(aVar6)) {
                aVar6.p(this.f3617e.get(aVar6).longValue());
            }
            Map<i, Long> map4 = this.f3617e;
            k.a.a.x.a aVar7 = k.a.a.x.a.HOUR_OF_AMPM;
            if (map4.containsKey(aVar7)) {
                aVar7.p(this.f3617e.get(aVar7).longValue());
            }
        }
        Map<i, Long> map5 = this.f3617e;
        k.a.a.x.a aVar8 = k.a.a.x.a.AMPM_OF_DAY;
        if (map5.containsKey(aVar8)) {
            Map<i, Long> map6 = this.f3617e;
            k.a.a.x.a aVar9 = k.a.a.x.a.HOUR_OF_AMPM;
            if (map6.containsKey(aVar9)) {
                t(k.a.a.x.a.HOUR_OF_DAY, (this.f3617e.remove(aVar8).longValue() * 12) + this.f3617e.remove(aVar9).longValue());
            }
        }
        Map<i, Long> map7 = this.f3617e;
        k.a.a.x.a aVar10 = k.a.a.x.a.NANO_OF_DAY;
        if (map7.containsKey(aVar10)) {
            long longValue3 = this.f3617e.remove(aVar10).longValue();
            if (iVar != iVar2) {
                aVar10.p(longValue3);
            }
            t(k.a.a.x.a.SECOND_OF_DAY, longValue3 / 1000000000);
            t(k.a.a.x.a.NANO_OF_SECOND, longValue3 % 1000000000);
        }
        Map<i, Long> map8 = this.f3617e;
        k.a.a.x.a aVar11 = k.a.a.x.a.MICRO_OF_DAY;
        if (map8.containsKey(aVar11)) {
            long longValue4 = this.f3617e.remove(aVar11).longValue();
            if (iVar != iVar2) {
                aVar11.p(longValue4);
            }
            t(k.a.a.x.a.SECOND_OF_DAY, longValue4 / 1000000);
            t(k.a.a.x.a.MICRO_OF_SECOND, longValue4 % 1000000);
        }
        Map<i, Long> map9 = this.f3617e;
        k.a.a.x.a aVar12 = k.a.a.x.a.MILLI_OF_DAY;
        if (map9.containsKey(aVar12)) {
            long longValue5 = this.f3617e.remove(aVar12).longValue();
            if (iVar != iVar2) {
                aVar12.p(longValue5);
            }
            t(k.a.a.x.a.SECOND_OF_DAY, longValue5 / 1000);
            t(k.a.a.x.a.MILLI_OF_SECOND, longValue5 % 1000);
        }
        Map<i, Long> map10 = this.f3617e;
        k.a.a.x.a aVar13 = k.a.a.x.a.SECOND_OF_DAY;
        if (map10.containsKey(aVar13)) {
            long longValue6 = this.f3617e.remove(aVar13).longValue();
            if (iVar != iVar2) {
                aVar13.p(longValue6);
            }
            t(k.a.a.x.a.HOUR_OF_DAY, longValue6 / 3600);
            t(k.a.a.x.a.MINUTE_OF_HOUR, (longValue6 / 60) % 60);
            t(k.a.a.x.a.SECOND_OF_MINUTE, longValue6 % 60);
        }
        Map<i, Long> map11 = this.f3617e;
        k.a.a.x.a aVar14 = k.a.a.x.a.MINUTE_OF_DAY;
        if (map11.containsKey(aVar14)) {
            long longValue7 = this.f3617e.remove(aVar14).longValue();
            if (iVar != iVar2) {
                aVar14.p(longValue7);
            }
            t(k.a.a.x.a.HOUR_OF_DAY, longValue7 / 60);
            t(k.a.a.x.a.MINUTE_OF_HOUR, longValue7 % 60);
        }
        if (iVar != iVar2) {
            Map<i, Long> map12 = this.f3617e;
            k.a.a.x.a aVar15 = k.a.a.x.a.MILLI_OF_SECOND;
            if (map12.containsKey(aVar15)) {
                aVar15.p(this.f3617e.get(aVar15).longValue());
            }
            Map<i, Long> map13 = this.f3617e;
            k.a.a.x.a aVar16 = k.a.a.x.a.MICRO_OF_SECOND;
            if (map13.containsKey(aVar16)) {
                aVar16.p(this.f3617e.get(aVar16).longValue());
            }
        }
        Map<i, Long> map14 = this.f3617e;
        k.a.a.x.a aVar17 = k.a.a.x.a.MILLI_OF_SECOND;
        if (map14.containsKey(aVar17)) {
            Map<i, Long> map15 = this.f3617e;
            k.a.a.x.a aVar18 = k.a.a.x.a.MICRO_OF_SECOND;
            if (map15.containsKey(aVar18)) {
                t(aVar18, (this.f3617e.remove(aVar17).longValue() * 1000) + (this.f3617e.get(aVar18).longValue() % 1000));
            }
        }
        Map<i, Long> map16 = this.f3617e;
        k.a.a.x.a aVar19 = k.a.a.x.a.MICRO_OF_SECOND;
        if (map16.containsKey(aVar19)) {
            Map<i, Long> map17 = this.f3617e;
            k.a.a.x.a aVar20 = k.a.a.x.a.NANO_OF_SECOND;
            if (map17.containsKey(aVar20)) {
                t(aVar19, this.f3617e.get(aVar20).longValue() / 1000);
                this.f3617e.remove(aVar19);
            }
        }
        if (this.f3617e.containsKey(aVar17)) {
            Map<i, Long> map18 = this.f3617e;
            k.a.a.x.a aVar21 = k.a.a.x.a.NANO_OF_SECOND;
            if (map18.containsKey(aVar21)) {
                t(aVar17, this.f3617e.get(aVar21).longValue() / 1000000);
                this.f3617e.remove(aVar17);
            }
        }
        if (this.f3617e.containsKey(aVar19)) {
            long longValue8 = this.f3617e.remove(aVar19).longValue();
            aVar = k.a.a.x.a.NANO_OF_SECOND;
            j2 = longValue8 * 1000;
        } else if (this.f3617e.containsKey(aVar17)) {
            long longValue9 = this.f3617e.remove(aVar17).longValue();
            aVar = k.a.a.x.a.NANO_OF_SECOND;
            j2 = longValue9 * 1000000;
        } else {
            return;
        }
        t(aVar, j2);
    }

    private a F(i iVar, long j2) {
        this.f3617e.put(iVar, Long.valueOf(j2));
        return this;
    }

    private boolean H(i iVar) {
        int i2 = 0;
        loop0: while (i2 < 100) {
            for (Map.Entry<i, Long> entry : this.f3617e.entrySet()) {
                i key = entry.getKey();
                e e2 = key.e(this.f3617e, this, iVar);
                if (e2 == null) {
                    if (!this.f3617e.containsKey(key)) {
                        break;
                    }
                } else {
                    if (e2 instanceof k.a.a.u.f) {
                        k.a.a.u.f fVar = (k.a.a.u.f) e2;
                        q qVar = this.f3619g;
                        if (qVar == null) {
                            this.f3619g = fVar.w();
                        } else if (!qVar.equals(fVar.w())) {
                            throw new k.a.a.b("ChronoZonedDateTime must use the effective parsed zone: " + this.f3619g);
                        }
                        e2 = fVar.D();
                    }
                    if (e2 instanceof b) {
                        L(key, (b) e2);
                    } else if (e2 instanceof k.a.a.h) {
                        K(key, (k.a.a.h) e2);
                    } else if (e2 instanceof k.a.a.u.c) {
                        k.a.a.u.c cVar = (k.a.a.u.c) e2;
                        L(key, cVar.D());
                        K(key, cVar.E());
                    } else {
                        throw new k.a.a.b("Unknown type: " + e2.getClass().getName());
                    }
                }
                i2++;
            }
        }
        if (i2 != 100) {
            return i2 > 0;
        }
        throw new k.a.a.b("Badly written field");
    }

    private void I() {
        if (this.f3621i != null) {
            return;
        }
        if (this.f3617e.containsKey(k.a.a.x.a.INSTANT_SECONDS) || this.f3617e.containsKey(k.a.a.x.a.SECOND_OF_DAY) || this.f3617e.containsKey(k.a.a.x.a.SECOND_OF_MINUTE)) {
            Map<i, Long> map = this.f3617e;
            k.a.a.x.a aVar = k.a.a.x.a.NANO_OF_SECOND;
            if (map.containsKey(aVar)) {
                long longValue = this.f3617e.get(aVar).longValue();
                this.f3617e.put(k.a.a.x.a.MICRO_OF_SECOND, Long.valueOf(longValue / 1000));
                this.f3617e.put(k.a.a.x.a.MILLI_OF_SECOND, Long.valueOf(longValue / 1000000));
                return;
            }
            this.f3617e.put(aVar, 0L);
            this.f3617e.put(k.a.a.x.a.MICRO_OF_SECOND, 0L);
            this.f3617e.put(k.a.a.x.a.MILLI_OF_SECOND, 0L);
        }
    }

    private void J() {
        k.a.a.u.f<?> u;
        if (this.f3620h != null && this.f3621i != null) {
            Long l = this.f3617e.get(k.a.a.x.a.OFFSET_SECONDS);
            if (l != null) {
                u = this.f3620h.u(this.f3621i).u(r.B(l.intValue()));
            } else if (this.f3619g != null) {
                u = this.f3620h.u(this.f3621i).u(this.f3619g);
            } else {
                return;
            }
            k.a.a.x.a aVar = k.a.a.x.a.INSTANT_SECONDS;
            this.f3617e.put(aVar, Long.valueOf(u.l(aVar)));
        }
    }

    private void K(i iVar, k.a.a.h hVar) {
        long P = hVar.P();
        Long put = this.f3617e.put(k.a.a.x.a.NANO_OF_DAY, Long.valueOf(P));
        if (put != null && put.longValue() != P) {
            throw new k.a.a.b("Conflict found: " + k.a.a.h.G(put.longValue()) + " differs from " + hVar + " while resolving  " + iVar);
        }
    }

    private void L(i iVar, b bVar) {
        if (this.f3618f.equals(bVar.w())) {
            long C = bVar.C();
            Long put = this.f3617e.put(k.a.a.x.a.EPOCH_DAY, Long.valueOf(C));
            if (put != null && put.longValue() != C) {
                throw new k.a.a.b("Conflict found: " + f.a0(put.longValue()) + " differs from " + f.a0(C) + " while resolving  " + iVar);
            }
            return;
        }
        throw new k.a.a.b("ChronoLocalDate must use the effective parsed chronology: " + this.f3618f);
    }

    private void M(i iVar) {
        int i2;
        k.a.a.h hVar;
        k.a.a.h D;
        Map<i, Long> map = this.f3617e;
        k.a.a.x.a aVar = k.a.a.x.a.HOUR_OF_DAY;
        Long l = map.get(aVar);
        Map<i, Long> map2 = this.f3617e;
        k.a.a.x.a aVar2 = k.a.a.x.a.MINUTE_OF_HOUR;
        Long l2 = map2.get(aVar2);
        Map<i, Long> map3 = this.f3617e;
        k.a.a.x.a aVar3 = k.a.a.x.a.SECOND_OF_MINUTE;
        Long l3 = map3.get(aVar3);
        Map<i, Long> map4 = this.f3617e;
        k.a.a.x.a aVar4 = k.a.a.x.a.NANO_OF_SECOND;
        Long l4 = map4.get(aVar4);
        if (l != null) {
            if (l2 == null && (l3 != null || l4 != null)) {
                return;
            }
            if (l2 == null || l3 != null || l4 == null) {
                if (iVar != i.LENIENT) {
                    if (l != null) {
                        if (iVar == i.SMART && l.longValue() == 24 && ((l2 == null || l2.longValue() == 0) && ((l3 == null || l3.longValue() == 0) && (l4 == null || l4.longValue() == 0)))) {
                            l = 0L;
                            this.f3623k = m.d(1);
                        }
                        int l5 = aVar.l(l.longValue());
                        if (l2 != null) {
                            int l6 = aVar2.l(l2.longValue());
                            if (l3 != null) {
                                int l7 = aVar3.l(l3.longValue());
                                D = l4 != null ? k.a.a.h.F(l5, l6, l7, aVar4.l(l4.longValue())) : k.a.a.h.E(l5, l6, l7);
                            } else if (l4 == null) {
                                D = k.a.a.h.D(l5, l6);
                            }
                            u(D);
                        } else if (l3 == null && l4 == null) {
                            D = k.a.a.h.D(l5, 0);
                            u(D);
                        }
                    }
                } else if (l != null) {
                    long longValue = l.longValue();
                    if (l2 == null) {
                        i2 = d.p(d.e(longValue, 24L));
                        hVar = k.a.a.h.D(d.g(longValue, 24), 0);
                    } else if (l3 != null) {
                        if (l4 == null) {
                            l4 = 0L;
                        }
                        long k2 = d.k(d.k(d.k(d.m(longValue, 3600000000000L), d.m(l2.longValue(), 60000000000L)), d.m(l3.longValue(), 1000000000L)), l4.longValue());
                        i2 = (int) d.e(k2, 86400000000000L);
                        hVar = k.a.a.h.G(d.h(k2, 86400000000000L));
                    } else {
                        long k3 = d.k(d.m(longValue, 3600L), d.m(l2.longValue(), 60L));
                        i2 = (int) d.e(k3, 86400L);
                        hVar = k.a.a.h.H(d.h(k3, 86400L));
                    }
                    u(hVar);
                    this.f3623k = m.d(i2);
                }
                this.f3617e.remove(aVar);
                this.f3617e.remove(aVar2);
                this.f3617e.remove(aVar3);
                this.f3617e.remove(aVar4);
            }
        }
    }

    private void x(f fVar) {
        if (fVar != null) {
            v(fVar);
            for (i iVar : this.f3617e.keySet()) {
                if ((iVar instanceof k.a.a.x.a) && iVar.a()) {
                    try {
                        long l = fVar.l(iVar);
                        Long l2 = this.f3617e.get(iVar);
                        if (l != l2.longValue()) {
                            throw new k.a.a.b("Conflict found: Field " + iVar + " " + l + " differs from " + iVar + " " + l2 + " derived from " + fVar);
                        }
                    } catch (k.a.a.b unused) {
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [k.a.a.u.b] */
    /* JADX WARN: Type inference failed for: r0v3, types: [k.a.a.x.e] */
    /* JADX WARN: Type inference failed for: r0v4, types: [k.a.a.h] */
    /* JADX WARN: Type inference failed for: r0v5, types: [k.a.a.u.c] */
    /* JADX WARN: Type inference failed for: r2v0, types: [k.a.a.v.a] */
    private void y() {
        k.a.a.h hVar;
        if (this.f3617e.size() > 0) {
            ?? r0 = this.f3620h;
            if (r0 != 0 && (hVar = this.f3621i) != null) {
                r0 = r0.u(hVar);
            } else if (r0 == 0 && (r0 = this.f3621i) == 0) {
                return;
            }
            z(r0);
        }
    }

    private void z(e eVar) {
        Iterator<Map.Entry<i, Long>> it = this.f3617e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<i, Long> next = it.next();
            i key = next.getKey();
            long longValue = next.getValue().longValue();
            if (eVar.j(key)) {
                try {
                    long l = eVar.l(key);
                    if (l == longValue) {
                        it.remove();
                    } else {
                        throw new k.a.a.b("Cross check failed: " + key + " " + l + " vs " + key + " " + longValue);
                    }
                } catch (RuntimeException unused) {
                }
            }
        }
    }

    public a G(i iVar, Set<i> set) {
        b bVar;
        if (set != null) {
            this.f3617e.keySet().retainAll(set);
        }
        C();
        B(iVar);
        E(iVar);
        if (H(iVar)) {
            C();
            B(iVar);
            E(iVar);
        }
        M(iVar);
        y();
        m mVar = this.f3623k;
        if (!(mVar == null || mVar.c() || (bVar = this.f3620h) == null || this.f3621i == null)) {
            this.f3620h = bVar.B(this.f3623k);
            this.f3623k = m.f3539h;
        }
        I();
        J();
        return this;
    }

    @Override // k.a.a.w.c, k.a.a.x.e
    public <R> R g(k<R> kVar) {
        if (kVar == j.g()) {
            return (R) this.f3619g;
        }
        if (kVar == j.a()) {
            return (R) this.f3618f;
        }
        if (kVar == j.b()) {
            b bVar = this.f3620h;
            if (bVar != null) {
                return (R) f.I(bVar);
            }
            return null;
        } else if (kVar == j.c()) {
            return (R) this.f3621i;
        } else {
            if (kVar == j.f() || kVar == j.d()) {
                return kVar.a(this);
            }
            if (kVar == j.e()) {
                return null;
            }
            return kVar.a(this);
        }
    }

    @Override // k.a.a.x.e
    public boolean j(i iVar) {
        b bVar;
        k.a.a.h hVar;
        if (iVar == null) {
            return false;
        }
        return this.f3617e.containsKey(iVar) || ((bVar = this.f3620h) != null && bVar.j(iVar)) || ((hVar = this.f3621i) != null && hVar.j(iVar));
    }

    @Override // k.a.a.x.e
    public long l(i iVar) {
        d.i(iVar, "field");
        Long A = A(iVar);
        if (A != null) {
            return A.longValue();
        }
        b bVar = this.f3620h;
        if (bVar != null && bVar.j(iVar)) {
            return this.f3620h.l(iVar);
        }
        k.a.a.h hVar = this.f3621i;
        if (hVar != null && hVar.j(iVar)) {
            return this.f3621i.l(iVar);
        }
        throw new k.a.a.b("Field not found: " + iVar);
    }

    a t(i iVar, long j2) {
        d.i(iVar, "field");
        Long A = A(iVar);
        if (A == null || A.longValue() == j2) {
            F(iVar, j2);
            return this;
        }
        throw new k.a.a.b("Conflict found: " + iVar + " " + A + " differs from " + iVar + " " + j2 + ": " + this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("DateTimeBuilder[");
        if (this.f3617e.size() > 0) {
            sb.append("fields=");
            sb.append(this.f3617e);
        }
        sb.append(", ");
        sb.append(this.f3618f);
        sb.append(", ");
        sb.append(this.f3619g);
        sb.append(", ");
        sb.append(this.f3620h);
        sb.append(", ");
        sb.append(this.f3621i);
        sb.append(']');
        return sb.toString();
    }

    void u(k.a.a.h hVar) {
        this.f3621i = hVar;
    }

    void v(b bVar) {
        this.f3620h = bVar;
    }

    public <R> R w(k<R> kVar) {
        return kVar.a(this);
    }
}
