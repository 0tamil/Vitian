package f.b.b.a.z.a;

import f.b.b.a.z.a.u1;
import f.b.b.a.z.a.z;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
final class s extends r<z.d> {

    /* loaded from: classes.dex */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u1.b.values().length];
            a = iArr;
            try {
                iArr[u1.b.f2597g.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[u1.b.f2598h.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[u1.b.f2599i.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[u1.b.f2600j.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[u1.b.f2601k.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[u1.b.l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[u1.b.m.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[u1.b.n.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[u1.b.s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[u1.b.u.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[u1.b.v.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[u1.b.w.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[u1.b.x.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[u1.b.t.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[u1.b.r.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[u1.b.o.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[u1.b.p.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                a[u1.b.q.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b.b.a.z.a.r
    public int a(Map.Entry<?, ?> entry) {
        return ((z.d) entry.getKey()).b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b.b.a.z.a.r
    public Object b(q qVar, s0 s0Var, int i2) {
        return qVar.a(s0Var, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b.b.a.z.a.r
    public v<z.d> c(Object obj) {
        return ((z.c) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b.b.a.z.a.r
    public v<z.d> d(Object obj) {
        return ((z.c) obj).N();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b.b.a.z.a.r
    public boolean e(s0 s0Var) {
        return s0Var instanceof z.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b.b.a.z.a.r
    public void f(Object obj) {
        c(obj).t();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018f  */
    @Override // f.b.b.a.z.a.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <UT, UB> UB g(g1 g1Var, Object obj, q qVar, v<z.d> vVar, UB ub, o1<UT, UB> o1Var) {
        Object i2;
        int i3;
        long j2;
        ArrayList arrayList;
        z.e eVar = (z.e) obj;
        int c = eVar.c();
        if (!eVar.b.f() || !eVar.b.o()) {
            Object obj2 = null;
            if (eVar.a() == u1.b.t) {
                i3 = g1Var.j();
                if (eVar.b.c().a(i3) == null) {
                    return (UB) j1.L(c, i3, ub, o1Var);
                }
            } else {
                switch (a.a[eVar.a().ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(g1Var.o());
                        break;
                    case 2:
                        obj2 = Float.valueOf(g1Var.t());
                        break;
                    case 3:
                        j2 = g1Var.H();
                        obj2 = Long.valueOf(j2);
                        break;
                    case 4:
                        j2 = g1Var.l();
                        obj2 = Long.valueOf(j2);
                        break;
                    case 5:
                        i3 = g1Var.j();
                        break;
                    case 6:
                        j2 = g1Var.n();
                        obj2 = Long.valueOf(j2);
                        break;
                    case 7:
                        i3 = g1Var.J();
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(g1Var.N());
                        break;
                    case 9:
                        i3 = g1Var.i();
                        break;
                    case 10:
                        i3 = g1Var.v();
                        break;
                    case 11:
                        j2 = g1Var.R();
                        obj2 = Long.valueOf(j2);
                        break;
                    case 12:
                        i3 = g1Var.r();
                        break;
                    case 13:
                        j2 = g1Var.u();
                        obj2 = Long.valueOf(j2);
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj2 = g1Var.d();
                        break;
                    case 16:
                        obj2 = g1Var.E();
                        break;
                    case 17:
                        obj2 = g1Var.A(eVar.b().getClass(), qVar);
                        break;
                    case 18:
                        obj2 = g1Var.L(eVar.b().getClass(), qVar);
                        break;
                }
                if (!eVar.d()) {
                    vVar.a(eVar.b, obj2);
                } else {
                    int i4 = a.a[eVar.a().ordinal()];
                    if ((i4 == 17 || i4 == 18) && (i2 = vVar.i(eVar.b)) != null) {
                        obj2 = b0.h(i2, obj2);
                    }
                    vVar.x(eVar.b, obj2);
                }
            }
            obj2 = Integer.valueOf(i3);
            if (!eVar.d()) {
            }
        } else {
            switch (a.a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    g1Var.z(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    g1Var.h(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    g1Var.B(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    g1Var.b(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    g1Var.M(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    g1Var.K(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    g1Var.m(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    g1Var.C(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    g1Var.x(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    g1Var.p(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    g1Var.D(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    g1Var.e(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    g1Var.s(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    g1Var.O(arrayList);
                    ub = (UB) j1.z(c, arrayList, eVar.b.c(), ub, o1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.b.i());
            }
            vVar.x(eVar.b, arrayList);
        }
        return ub;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b.b.a.z.a.r
    public void h(g1 g1Var, Object obj, q qVar, v<z.d> vVar) {
        z.e eVar = (z.e) obj;
        vVar.x(eVar.b, g1Var.L(eVar.b().getClass(), qVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b.b.a.z.a.r
    public void i(i iVar, Object obj, q qVar, v<z.d> vVar) {
        z.e eVar = (z.e) obj;
        s0 p = eVar.b().f().p();
        f S = f.S(ByteBuffer.wrap(iVar.w()), true);
        d1.a().b(p, S, qVar);
        vVar.x(eVar.b, p);
        if (S.P() != Integer.MAX_VALUE) {
            throw c0.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b.b.a.z.a.r
    public void j(v1 v1Var, Map.Entry<?, ?> entry) {
        z.d dVar = (z.d) entry.getKey();
        if (dVar.f()) {
            switch (a.a[dVar.i().ordinal()]) {
                case 1:
                    j1.P(dVar.b(), (List) entry.getValue(), v1Var, dVar.o());
                    return;
                case 2:
                    j1.T(dVar.b(), (List) entry.getValue(), v1Var, dVar.o());
                    return;
                case 3:
                    j1.W(dVar.b(), (List) entry.getValue(), v1Var, dVar.o());
                    return;
                case 4:
                    j1.e0(dVar.b(), (List) entry.getValue(), v1Var, dVar.o());
                    return;
                case 5:
                case 14:
                    j1.V(dVar.b(), (List) entry.getValue(), v1Var, dVar.o());
                    return;
                case 6:
                    j1.S(dVar.b(), (List) entry.getValue(), v1Var, dVar.o());
                    return;
                case 7:
                    j1.R(dVar.b(), (List) entry.getValue(), v1Var, dVar.o());
                    return;
                case 8:
                    j1.N(dVar.b(), (List) entry.getValue(), v1Var, dVar.o());
                    return;
                case 9:
                    j1.d0(dVar.b(), (List) entry.getValue(), v1Var, dVar.o());
                    return;
                case 10:
                    j1.Y(dVar.b(), (List) entry.getValue(), v1Var, dVar.o());
                    return;
                case 11:
                    j1.Z(dVar.b(), (List) entry.getValue(), v1Var, dVar.o());
                    return;
                case 12:
                    j1.a0(dVar.b(), (List) entry.getValue(), v1Var, dVar.o());
                    return;
                case 13:
                    j1.b0(dVar.b(), (List) entry.getValue(), v1Var, dVar.o());
                    return;
                case 15:
                    j1.O(dVar.b(), (List) entry.getValue(), v1Var);
                    return;
                case 16:
                    j1.c0(dVar.b(), (List) entry.getValue(), v1Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list != null && !list.isEmpty()) {
                        j1.U(dVar.b(), (List) entry.getValue(), v1Var, d1.a().d(list.get(0).getClass()));
                        return;
                    }
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 != null && !list2.isEmpty()) {
                        j1.X(dVar.b(), (List) entry.getValue(), v1Var, d1.a().d(list2.get(0).getClass()));
                        return;
                    }
                    return;
                default:
                    return;
            }
        } else {
            switch (a.a[dVar.i().ordinal()]) {
                case 1:
                    v1Var.E(dVar.b(), ((Double) entry.getValue()).doubleValue());
                    return;
                case 2:
                    v1Var.p(dVar.b(), ((Float) entry.getValue()).floatValue());
                    return;
                case 3:
                    v1Var.f(dVar.b(), ((Long) entry.getValue()).longValue());
                    return;
                case 4:
                    v1Var.x(dVar.b(), ((Long) entry.getValue()).longValue());
                    return;
                case 5:
                case 14:
                    v1Var.v(dVar.b(), ((Integer) entry.getValue()).intValue());
                    return;
                case 6:
                    v1Var.j(dVar.b(), ((Long) entry.getValue()).longValue());
                    return;
                case 7:
                    v1Var.C(dVar.b(), ((Integer) entry.getValue()).intValue());
                    return;
                case 8:
                    v1Var.i(dVar.b(), ((Boolean) entry.getValue()).booleanValue());
                    return;
                case 9:
                    v1Var.k(dVar.b(), ((Integer) entry.getValue()).intValue());
                    return;
                case 10:
                    v1Var.r(dVar.b(), ((Integer) entry.getValue()).intValue());
                    return;
                case 11:
                    v1Var.H(dVar.b(), ((Long) entry.getValue()).longValue());
                    return;
                case 12:
                    v1Var.J(dVar.b(), ((Integer) entry.getValue()).intValue());
                    return;
                case 13:
                    v1Var.o(dVar.b(), ((Long) entry.getValue()).longValue());
                    return;
                case 15:
                    v1Var.a(dVar.b(), (i) entry.getValue());
                    return;
                case 16:
                    v1Var.u(dVar.b(), (String) entry.getValue());
                    return;
                case 17:
                    v1Var.G(dVar.b(), entry.getValue(), d1.a().d(entry.getValue().getClass()));
                    return;
                case 18:
                    v1Var.M(dVar.b(), entry.getValue(), d1.a().d(entry.getValue().getClass()));
                    return;
                default:
                    return;
            }
        }
    }
}
