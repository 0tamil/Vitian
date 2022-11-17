package f.b.b.a.z.a;

import f.b.b.a.z.a.l0;
import f.b.b.a.z.a.u1;
import f.b.b.a.z.a.v1;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m implements v1 {
    private final l a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u1.b.values().length];
            a = iArr;
            try {
                iArr[u1.b.n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[u1.b.m.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[u1.b.f2601k.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[u1.b.u.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[u1.b.w.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[u1.b.s.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[u1.b.l.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[u1.b.f2599i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[u1.b.v.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[u1.b.x.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[u1.b.f2600j.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[u1.b.o.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    private m(l lVar) {
        b0.b(lVar, "output");
        l lVar2 = lVar;
        this.a = lVar2;
        lVar2.a = this;
    }

    public static m P(l lVar) {
        m mVar = lVar.a;
        return mVar != null ? mVar : new m(lVar);
    }

    private <V> void Q(int i2, boolean z, V v, l0.a<Boolean, V> aVar) {
        this.a.T0(i2, 2);
        this.a.V0(l0.b(aVar, Boolean.valueOf(z), v));
        l0.d(this.a, aVar, Boolean.valueOf(z), v);
    }

    private <V> void R(int i2, l0.a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        int i3 = 0;
        for (Integer num : map.keySet()) {
            i3++;
            iArr[i3] = num.intValue();
        }
        Arrays.sort(iArr);
        for (int i4 = 0; i4 < size; i4++) {
            int i5 = iArr[i4];
            V v = map.get(Integer.valueOf(i5));
            this.a.T0(i2, 2);
            this.a.V0(l0.b(aVar, Integer.valueOf(i5), v));
            l0.d(this.a, aVar, Integer.valueOf(i5), v);
        }
    }

    private <V> void S(int i2, l0.a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        int i3 = 0;
        for (Long l : map.keySet()) {
            i3++;
            jArr[i3] = l.longValue();
        }
        Arrays.sort(jArr);
        for (int i4 = 0; i4 < size; i4++) {
            long j2 = jArr[i4];
            V v = map.get(Long.valueOf(j2));
            this.a.T0(i2, 2);
            this.a.V0(l0.b(aVar, Long.valueOf(j2), v));
            l0.d(this.a, aVar, Long.valueOf(j2), v);
        }
    }

    private <K, V> void T(int i2, l0.a<K, V> aVar, Map<K, V> map) {
        switch (a.a[aVar.a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    Q(i2, false, v, aVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    Q(i2, true, v2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                R(i2, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                S(i2, aVar, map);
                return;
            case 12:
                U(i2, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.a);
        }
    }

    private <V> void U(int i2, l0.a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        int i3 = 0;
        for (String str : map.keySet()) {
            i3++;
            strArr[i3] = str;
        }
        Arrays.sort(strArr);
        for (int i4 = 0; i4 < size; i4++) {
            String str2 = strArr[i4];
            V v = map.get(str2);
            this.a.T0(i2, 2);
            this.a.V0(l0.b(aVar, str2, v));
            l0.d(this.a, aVar, str2, v);
        }
    }

    private void V(int i2, Object obj) {
        if (obj instanceof String) {
            this.a.R0(i2, (String) obj);
        } else {
            this.a.l0(i2, (i) obj);
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void A(int i2, int i3) {
        this.a.p0(i2, i3);
    }

    @Override // f.b.b.a.z.a.v1
    public void B(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.y(list.get(i5).longValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.E0(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.D0(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void C(int i2, int i3) {
        this.a.r0(i2, i3);
    }

    @Override // f.b.b.a.z.a.v1
    public void D(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.l(list.get(i5).intValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.q0(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.p0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void E(int i2, double d2) {
        this.a.n0(i2, d2);
    }

    @Override // f.b.b.a.z.a.v1
    public void F(int i2, List<Double> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.j(list.get(i5).doubleValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.o0(list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.n0(i2, list.get(i3).doubleValue());
            i3++;
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void G(int i2, Object obj, h1 h1Var) {
        this.a.y0(i2, (s0) obj, h1Var);
    }

    @Override // f.b.b.a.z.a.v1
    public void H(int i2, long j2) {
        this.a.L0(i2, j2);
    }

    @Override // f.b.b.a.z.a.v1
    public void I(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.N(list.get(i5).longValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.M0(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.L0(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void J(int i2, int i3) {
        this.a.N0(i2, i3);
    }

    @Override // f.b.b.a.z.a.v1
    public void K(int i2, List<i> list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.a.l0(i2, list.get(i3));
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void L(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.n(list.get(i5).intValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.s0(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.r0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void M(int i2, Object obj, h1 h1Var) {
        this.a.F0(i2, (s0) obj, h1Var);
    }

    @Override // f.b.b.a.z.a.v1
    public void N(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.Y(list.get(i5).longValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.X0(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.W0(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void O(int i2, List<Boolean> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.e(list.get(i5).booleanValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.i0(list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.h0(i2, list.get(i3).booleanValue());
            i3++;
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void a(int i2, i iVar) {
        this.a.l0(i2, iVar);
    }

    @Override // f.b.b.a.z.a.v1
    public void b(int i2, List<?> list, h1 h1Var) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            G(i2, list.get(i3), h1Var);
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void c(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.w(list.get(i5).intValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.C0(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.B0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void d(int i2, List<Float> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.r(list.get(i5).floatValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.w0(list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.v0(i2, list.get(i3).floatValue());
            i3++;
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void e(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.W(list.get(i5).intValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.V0(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.U0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void f(int i2, long j2) {
        this.a.D0(i2, j2);
    }

    @Override // f.b.b.a.z.a.v1
    public <K, V> void g(int i2, l0.a<K, V> aVar, Map<K, V> map) {
        if (this.a.c0()) {
            T(i2, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.T0(i2, 2);
            this.a.V0(l0.b(aVar, entry.getKey(), entry.getValue()));
            l0.d(this.a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void h(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.R(list.get(i5).longValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.Q0(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.P0(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void i(int i2, boolean z) {
        this.a.h0(i2, z);
    }

    @Override // f.b.b.a.z.a.v1
    public void j(int i2, long j2) {
        this.a.t0(i2, j2);
    }

    @Override // f.b.b.a.z.a.v1
    public void k(int i2, int i3) {
        this.a.U0(i2, i3);
    }

    @Override // f.b.b.a.z.a.v1
    public void l(int i2, List<?> list, h1 h1Var) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            M(i2, list.get(i3), h1Var);
        }
    }

    @Override // f.b.b.a.z.a.v1
    public final void m(int i2, Object obj) {
        if (obj instanceof i) {
            this.a.I0(i2, (i) obj);
        } else {
            this.a.H0(i2, (s0) obj);
        }
    }

    @Override // f.b.b.a.z.a.v1
    public v1.a n() {
        return v1.a.ASCENDING;
    }

    @Override // f.b.b.a.z.a.v1
    public void o(int i2, long j2) {
        this.a.P0(i2, j2);
    }

    @Override // f.b.b.a.z.a.v1
    public void p(int i2, float f2) {
        this.a.v0(i2, f2);
    }

    @Override // f.b.b.a.z.a.v1
    public void q(int i2, List<String> list) {
        int i3 = 0;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            while (i3 < list.size()) {
                V(i2, h0Var.c(i3));
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.R0(i2, list.get(i3));
            i3++;
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void r(int i2, int i3) {
        this.a.J0(i2, i3);
    }

    @Override // f.b.b.a.z.a.v1
    public void s(int i2) {
        this.a.T0(i2, 3);
    }

    @Override // f.b.b.a.z.a.v1
    public void t(int i2) {
        this.a.T0(i2, 4);
    }

    @Override // f.b.b.a.z.a.v1
    public void u(int i2, String str) {
        this.a.R0(i2, str);
    }

    @Override // f.b.b.a.z.a.v1
    public void v(int i2, int i3) {
        this.a.B0(i2, i3);
    }

    @Override // f.b.b.a.z.a.v1
    public void w(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.P(list.get(i5).intValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.O0(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.N0(i2, list.get(i3).intValue());
            i3++;
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void x(int i2, long j2) {
        this.a.W0(i2, j2);
    }

    @Override // f.b.b.a.z.a.v1
    public void y(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.p(list.get(i5).longValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.u0(list.get(i3).longValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.t0(i2, list.get(i3).longValue());
            i3++;
        }
    }

    @Override // f.b.b.a.z.a.v1
    public void z(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (z) {
            this.a.T0(i2, 2);
            int i4 = 0;
            for (int i5 = 0; i5 < list.size(); i5++) {
                i4 += l.L(list.get(i5).intValue());
            }
            this.a.V0(i4);
            while (i3 < list.size()) {
                this.a.K0(list.get(i3).intValue());
                i3++;
            }
            return;
        }
        while (i3 < list.size()) {
            this.a.J0(i2, list.get(i3).intValue());
            i3++;
        }
    }
}
