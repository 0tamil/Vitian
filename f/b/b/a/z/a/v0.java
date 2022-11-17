package f.b.b.a.z.a;

import e.a.j;
import f.b.b.a.z.a.b0;
import f.b.b.a.z.a.c0;
import f.b.b.a.z.a.e;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.l0;
import f.b.b.a.z.a.u1;
import f.b.b.a.z.a.v;
import f.b.b.a.z.a.v1;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import sun.misc.Unsafe;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v0<T> implements h1<T> {
    private static final int[] r = new int[0];
    private static final Unsafe s = s1.B();
    private final int[] a;
    private final Object[] b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f2612d;

    /* renamed from: e  reason: collision with root package name */
    private final s0 f2613e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f2614f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f2615g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f2616h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f2617i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f2618j;

    /* renamed from: k  reason: collision with root package name */
    private final int f2619k;
    private final int l;
    private final x0 m;
    private final i0 n;
    private final o1<?, ?> o;
    private final r<?> p;
    private final n0 q;

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
                a[u1.b.r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[u1.b.f2597g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[u1.b.m.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[u1.b.u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[u1.b.l.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[u1.b.v.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[u1.b.f2598h.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[u1.b.t.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[u1.b.f2601k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[u1.b.s.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[u1.b.f2599i.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[u1.b.f2600j.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[u1.b.q.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[u1.b.w.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[u1.b.x.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[u1.b.o.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private v0(int[] iArr, Object[] objArr, int i2, int i3, s0 s0Var, boolean z, boolean z2, int[] iArr2, int i4, int i5, x0 x0Var, i0 i0Var, o1<?, ?> o1Var, r<?> rVar, n0 n0Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i2;
        this.f2612d = i3;
        this.f2615g = s0Var instanceof z;
        this.f2616h = z;
        this.f2614f = rVar != null && rVar.e(s0Var);
        this.f2617i = z2;
        this.f2618j = iArr2;
        this.f2619k = i4;
        this.l = i5;
        this.m = x0Var;
        this.n = i0Var;
        this.o = o1Var;
        this.p = rVar;
        this.f2613e = s0Var;
        this.q = n0Var;
    }

    private static <T> int A(T t, long j2) {
        return s1.x(t, j2);
    }

    private static boolean B(int i2) {
        return (i2 & 536870912) != 0;
    }

    private boolean C(T t, int i2) {
        if (this.f2616h) {
            int s0 = s0(i2);
            long V = V(s0);
            switch (r0(s0)) {
                case 0:
                    return s1.v(t, V) != 0.0d;
                case 1:
                    return s1.w(t, V) != 0.0f;
                case 2:
                    return s1.y(t, V) != 0;
                case 3:
                    return s1.y(t, V) != 0;
                case 4:
                    return s1.x(t, V) != 0;
                case 5:
                    return s1.y(t, V) != 0;
                case 6:
                    return s1.x(t, V) != 0;
                case 7:
                    return s1.p(t, V);
                case 8:
                    Object A = s1.A(t, V);
                    if (A instanceof String) {
                        return !((String) A).isEmpty();
                    }
                    if (A instanceof i) {
                        return !i.f2526f.equals(A);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return s1.A(t, V) != null;
                case 10:
                    return !i.f2526f.equals(s1.A(t, V));
                case 11:
                    return s1.x(t, V) != 0;
                case 12:
                    return s1.x(t, V) != 0;
                case 13:
                    return s1.x(t, V) != 0;
                case 14:
                    return s1.y(t, V) != 0;
                case 15:
                    return s1.x(t, V) != 0;
                case 16:
                    return s1.y(t, V) != 0;
                case 17:
                    return s1.A(t, V) != null;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int i0 = i0(i2);
            return (s1.x(t, (long) (i0 & 1048575)) & (1 << (i0 >>> 20))) != 0;
        }
    }

    private boolean D(T t, int i2, int i3, int i4) {
        return this.f2616h ? C(t, i2) : (i3 & i4) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean E(Object obj, int i2, h1 h1Var) {
        return h1Var.b(s1.A(obj, V(i2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N> boolean F(Object obj, int i2, int i3) {
        List list = (List) s1.A(obj, V(i2));
        if (list.isEmpty()) {
            return true;
        }
        h1 v = v(i3);
        for (int i4 = 0; i4 < list.size(); i4++) {
            if (!v.b(list.get(i4))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [f.b.b.a.z.a.h1] */
    private boolean G(T t, int i2, int i3) {
        Map<?, ?> b = this.q.b(s1.A(t, V(i2)));
        if (b.isEmpty()) {
            return true;
        }
        if (this.q.h(u(i3)).c.a() != u1.c.MESSAGE) {
            return true;
        }
        h1<T> h1Var = 0;
        for (Object obj : b.values()) {
            if (h1Var == null) {
                h1Var = d1.a().d(obj.getClass());
            }
            boolean b2 = h1Var.b(obj);
            h1Var = h1Var;
            if (!b2) {
                return false;
            }
        }
        return true;
    }

    private boolean H(T t, T t2, int i2) {
        long i0 = i0(i2) & 1048575;
        return s1.x(t, i0) == s1.x(t2, i0);
    }

    private boolean I(T t, int i2, int i3) {
        return s1.x(t, (long) (i0(i3) & 1048575)) == i2;
    }

    private static boolean J(int i2) {
        return (i2 & 268435456) != 0;
    }

    private static List<?> K(Object obj, long j2) {
        return (List) s1.A(obj, j2);
    }

    private static <T> long L(T t, long j2) {
        return s1.y(t, j2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0075, code lost:
        r0 = r16.f2619k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
        if (r0 >= r16.l) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        r13 = q(r19, r16.f2618j[r0], r13, r17);
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
        if (r13 == null) goto L323;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        r17.o(r19, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008b, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private <UT, UB, ET extends v.b<ET>> void M(o1<UT, UB> o1Var, r<ET> rVar, T t, g1 g1Var, q qVar) {
        int f2;
        Object h2;
        long V;
        List<Double> e2;
        List<Float> e3;
        List<Long> e4;
        List<Long> e5;
        List<Integer> e6;
        List<Long> e7;
        List<Integer> e8;
        List<Boolean> e9;
        List<Integer> e10;
        List<Integer> e11;
        b0.e t2;
        List<Integer> e12;
        List<Long> e13;
        List<Integer> e14;
        List<Long> e15;
        Object obj = null;
        v<ET> vVar = null;
        while (true) {
            try {
                int P = g1Var.P();
                int g0 = g0(P);
                if (g0 >= 0) {
                    int s0 = s0(g0);
                    try {
                        switch (r0(s0)) {
                            case 0:
                                s1.K(t, V(s0), g1Var.o());
                                o0(t, g0);
                                break;
                            case 1:
                                s1.L(t, V(s0), g1Var.t());
                                o0(t, g0);
                                break;
                            case 2:
                                s1.N(t, V(s0), g1Var.H());
                                o0(t, g0);
                                break;
                            case 3:
                                s1.N(t, V(s0), g1Var.l());
                                o0(t, g0);
                                break;
                            case 4:
                                s1.M(t, V(s0), g1Var.j());
                                o0(t, g0);
                                break;
                            case 5:
                                s1.N(t, V(s0), g1Var.n());
                                o0(t, g0);
                                break;
                            case 6:
                                s1.M(t, V(s0), g1Var.J());
                                o0(t, g0);
                                break;
                            case 7:
                                s1.E(t, V(s0), g1Var.N());
                                o0(t, g0);
                                break;
                            case 8:
                                l0(t, s0, g1Var);
                                o0(t, g0);
                                break;
                            case 9:
                                if (C(t, g0)) {
                                    h2 = b0.h(s1.A(t, V(s0)), g1Var.g(v(g0), qVar));
                                    V = V(s0);
                                    s1.O(t, V, h2);
                                    break;
                                } else {
                                    s1.O(t, V(s0), g1Var.g(v(g0), qVar));
                                    o0(t, g0);
                                    break;
                                }
                            case 10:
                                s1.O(t, V(s0), g1Var.d());
                                o0(t, g0);
                                break;
                            case 11:
                                s1.M(t, V(s0), g1Var.i());
                                o0(t, g0);
                                break;
                            case 12:
                                f2 = g1Var.f();
                                b0.e t3 = t(g0);
                                if (t3 != null && !t3.a(f2)) {
                                    obj = j1.L(P, f2, obj, o1Var);
                                    break;
                                } else {
                                    s1.M(t, V(s0), f2);
                                    o0(t, g0);
                                    break;
                                }
                            case 13:
                                s1.M(t, V(s0), g1Var.v());
                                o0(t, g0);
                                break;
                            case 14:
                                s1.N(t, V(s0), g1Var.R());
                                o0(t, g0);
                                break;
                            case 15:
                                s1.M(t, V(s0), g1Var.r());
                                o0(t, g0);
                                break;
                            case 16:
                                s1.N(t, V(s0), g1Var.u());
                                o0(t, g0);
                                break;
                            case 17:
                                if (C(t, g0)) {
                                    h2 = b0.h(s1.A(t, V(s0)), g1Var.a(v(g0), qVar));
                                    V = V(s0);
                                    s1.O(t, V, h2);
                                    break;
                                } else {
                                    s1.O(t, V(s0), g1Var.a(v(g0), qVar));
                                    o0(t, g0);
                                    break;
                                }
                            case 18:
                                e2 = this.n.e(t, V(s0));
                                g1Var.z(e2);
                                break;
                            case 19:
                                e3 = this.n.e(t, V(s0));
                                g1Var.h(e3);
                                break;
                            case 20:
                                e4 = this.n.e(t, V(s0));
                                g1Var.B(e4);
                                break;
                            case 21:
                                e5 = this.n.e(t, V(s0));
                                g1Var.b(e5);
                                break;
                            case 22:
                                e6 = this.n.e(t, V(s0));
                                g1Var.M(e6);
                                break;
                            case j.b3 /* 23 */:
                                e7 = this.n.e(t, V(s0));
                                g1Var.K(e7);
                                break;
                            case j.c3 /* 24 */:
                                e8 = this.n.e(t, V(s0));
                                g1Var.m(e8);
                                break;
                            case 25:
                                e9 = this.n.e(t, V(s0));
                                g1Var.C(e9);
                                break;
                            case 26:
                                m0(t, s0, g1Var);
                                break;
                            case 27:
                                k0(t, s0, g1Var, v(g0), qVar);
                                break;
                            case 28:
                                g1Var.w(this.n.e(t, V(s0)));
                                break;
                            case j.h3 /* 29 */:
                                e10 = this.n.e(t, V(s0));
                                g1Var.x(e10);
                                break;
                            case 30:
                                e11 = this.n.e(t, V(s0));
                                g1Var.O(e11);
                                t2 = t(g0);
                                obj = j1.A(P, e11, t2, obj, o1Var);
                                break;
                            case 31:
                                e12 = this.n.e(t, V(s0));
                                g1Var.p(e12);
                                break;
                            case 32:
                                e13 = this.n.e(t, V(s0));
                                g1Var.D(e13);
                                break;
                            case 33:
                                e14 = this.n.e(t, V(s0));
                                g1Var.e(e14);
                                break;
                            case 34:
                                e15 = this.n.e(t, V(s0));
                                g1Var.s(e15);
                                break;
                            case 35:
                                e2 = this.n.e(t, V(s0));
                                g1Var.z(e2);
                                break;
                            case 36:
                                e3 = this.n.e(t, V(s0));
                                g1Var.h(e3);
                                break;
                            case 37:
                                e4 = this.n.e(t, V(s0));
                                g1Var.B(e4);
                                break;
                            case 38:
                                e5 = this.n.e(t, V(s0));
                                g1Var.b(e5);
                                break;
                            case 39:
                                e6 = this.n.e(t, V(s0));
                                g1Var.M(e6);
                                break;
                            case 40:
                                e7 = this.n.e(t, V(s0));
                                g1Var.K(e7);
                                break;
                            case 41:
                                e8 = this.n.e(t, V(s0));
                                g1Var.m(e8);
                                break;
                            case 42:
                                e9 = this.n.e(t, V(s0));
                                g1Var.C(e9);
                                break;
                            case 43:
                                e10 = this.n.e(t, V(s0));
                                g1Var.x(e10);
                                break;
                            case 44:
                                e11 = this.n.e(t, V(s0));
                                g1Var.O(e11);
                                t2 = t(g0);
                                obj = j1.A(P, e11, t2, obj, o1Var);
                                break;
                            case 45:
                                e12 = this.n.e(t, V(s0));
                                g1Var.p(e12);
                                break;
                            case 46:
                                e13 = this.n.e(t, V(s0));
                                g1Var.D(e13);
                                break;
                            case 47:
                                e14 = this.n.e(t, V(s0));
                                g1Var.e(e14);
                                break;
                            case 48:
                                e15 = this.n.e(t, V(s0));
                                g1Var.s(e15);
                                break;
                            case 49:
                                j0(t, V(s0), g1Var, v(g0), qVar);
                                break;
                            case 50:
                                N(t, g0, u(g0), qVar, g1Var);
                                break;
                            case 51:
                                s1.O(t, V(s0), Double.valueOf(g1Var.o()));
                                p0(t, P, g0);
                                break;
                            case 52:
                                s1.O(t, V(s0), Float.valueOf(g1Var.t()));
                                p0(t, P, g0);
                                break;
                            case 53:
                                s1.O(t, V(s0), Long.valueOf(g1Var.H()));
                                p0(t, P, g0);
                                break;
                            case 54:
                                s1.O(t, V(s0), Long.valueOf(g1Var.l()));
                                p0(t, P, g0);
                                break;
                            case 55:
                                s1.O(t, V(s0), Integer.valueOf(g1Var.j()));
                                p0(t, P, g0);
                                break;
                            case 56:
                                s1.O(t, V(s0), Long.valueOf(g1Var.n()));
                                p0(t, P, g0);
                                break;
                            case 57:
                                s1.O(t, V(s0), Integer.valueOf(g1Var.J()));
                                p0(t, P, g0);
                                break;
                            case 58:
                                s1.O(t, V(s0), Boolean.valueOf(g1Var.N()));
                                p0(t, P, g0);
                                break;
                            case 59:
                                l0(t, s0, g1Var);
                                p0(t, P, g0);
                                break;
                            case 60:
                                if (I(t, P, g0)) {
                                    s1.O(t, V(s0), b0.h(s1.A(t, V(s0)), g1Var.g(v(g0), qVar)));
                                } else {
                                    s1.O(t, V(s0), g1Var.g(v(g0), qVar));
                                    o0(t, g0);
                                }
                                p0(t, P, g0);
                                break;
                            case 61:
                                s1.O(t, V(s0), g1Var.d());
                                p0(t, P, g0);
                                break;
                            case 62:
                                s1.O(t, V(s0), Integer.valueOf(g1Var.i()));
                                p0(t, P, g0);
                                break;
                            case 63:
                                f2 = g1Var.f();
                                b0.e t4 = t(g0);
                                if (t4 != null && !t4.a(f2)) {
                                    obj = j1.L(P, f2, obj, o1Var);
                                    break;
                                }
                                s1.O(t, V(s0), Integer.valueOf(f2));
                                p0(t, P, g0);
                                break;
                            case 64:
                                s1.O(t, V(s0), Integer.valueOf(g1Var.v()));
                                p0(t, P, g0);
                                break;
                            case 65:
                                s1.O(t, V(s0), Long.valueOf(g1Var.R()));
                                p0(t, P, g0);
                                break;
                            case 66:
                                s1.O(t, V(s0), Integer.valueOf(g1Var.r()));
                                p0(t, P, g0);
                                break;
                            case 67:
                                s1.O(t, V(s0), Long.valueOf(g1Var.u()));
                                p0(t, P, g0);
                                break;
                            case 68:
                                s1.O(t, V(s0), g1Var.a(v(g0), qVar));
                                p0(t, P, g0);
                                break;
                            default:
                                if (obj == null) {
                                    obj = o1Var.n();
                                }
                                if (o1Var.m(obj, g1Var)) {
                                    break;
                                } else {
                                    for (int i2 = this.f2619k; i2 < this.l; i2++) {
                                        obj = q(t, this.f2618j[i2], obj, o1Var);
                                    }
                                    if (obj != null) {
                                        o1Var.o(t, obj);
                                        return;
                                    }
                                    return;
                                }
                        }
                    } catch (c0.a unused) {
                        if (!o1Var.q(g1Var)) {
                            if (obj == null) {
                                obj = o1Var.f(t);
                            }
                            if (!o1Var.m(obj, g1Var)) {
                                for (int i3 = this.f2619k; i3 < this.l; i3++) {
                                    obj = q(t, this.f2618j[i3], obj, o1Var);
                                }
                                if (obj != null) {
                                    o1Var.o(t, obj);
                                    return;
                                }
                                return;
                            }
                        } else if (!g1Var.q()) {
                            for (int i4 = this.f2619k; i4 < this.l; i4++) {
                                obj = q(t, this.f2618j[i4], obj, o1Var);
                            }
                            if (obj != null) {
                                o1Var.o(t, obj);
                                return;
                            }
                            return;
                        }
                    }
                } else if (P == Integer.MAX_VALUE) {
                    for (int i5 = this.f2619k; i5 < this.l; i5++) {
                        obj = q(t, this.f2618j[i5], obj, o1Var);
                    }
                    if (obj != null) {
                        o1Var.o(t, obj);
                        return;
                    }
                    return;
                } else {
                    Object b = !this.f2614f ? null : rVar.b(qVar, this.f2613e, P);
                    if (b != null) {
                        if (vVar == null) {
                            vVar = rVar.d(t);
                        }
                        obj = rVar.g(g1Var, b, qVar, vVar, obj, o1Var);
                    } else if (!o1Var.q(g1Var)) {
                        if (obj == null) {
                            obj = o1Var.f(t);
                        }
                        if (o1Var.m(obj, g1Var)) {
                        }
                    } else if (g1Var.q()) {
                    }
                }
            } catch (Throwable th) {
                for (int i6 = this.f2619k; i6 < this.l; i6++) {
                    obj = q(t, this.f2618j[i6], obj, o1Var);
                }
                if (obj != null) {
                    o1Var.o(t, obj);
                }
                throw th;
            }
        }
    }

    private final <K, V> void N(Object obj, int i2, Object obj2, q qVar, g1 g1Var) {
        long V = V(s0(i2));
        Object A = s1.A(obj, V);
        if (A == null) {
            A = this.q.c(obj2);
            s1.O(obj, V, A);
        } else if (this.q.f(A)) {
            Object c = this.q.c(obj2);
            this.q.a(c, A);
            s1.O(obj, V, c);
            A = c;
        }
        g1Var.y(this.q.e(A), this.q.h(obj2), qVar);
    }

    private void O(T t, T t2, int i2) {
        long V = V(s0(i2));
        if (C(t2, i2)) {
            Object A = s1.A(t, V);
            Object A2 = s1.A(t2, V);
            if (A != null && A2 != null) {
                A2 = b0.h(A, A2);
            } else if (A2 == null) {
                return;
            }
            s1.O(t, V, A2);
            o0(t, i2);
        }
    }

    private void P(T t, T t2, int i2) {
        int s0 = s0(i2);
        int U = U(i2);
        long V = V(s0);
        if (I(t2, U, i2)) {
            Object A = s1.A(t, V);
            Object A2 = s1.A(t2, V);
            if (A != null && A2 != null) {
                A2 = b0.h(A, A2);
            } else if (A2 == null) {
                return;
            }
            s1.O(t, V, A2);
            p0(t, U, i2);
        }
    }

    private void Q(T t, T t2, int i2) {
        int s0 = s0(i2);
        long V = V(s0);
        int U = U(i2);
        switch (r0(s0)) {
            case 0:
                if (C(t2, i2)) {
                    s1.K(t, V, s1.v(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 1:
                if (C(t2, i2)) {
                    s1.L(t, V, s1.w(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 2:
                if (!C(t2, i2)) {
                    return;
                }
                s1.N(t, V, s1.y(t2, V));
                o0(t, i2);
                return;
            case 3:
                if (!C(t2, i2)) {
                    return;
                }
                s1.N(t, V, s1.y(t2, V));
                o0(t, i2);
                return;
            case 4:
                if (!C(t2, i2)) {
                    return;
                }
                s1.M(t, V, s1.x(t2, V));
                o0(t, i2);
                return;
            case 5:
                if (!C(t2, i2)) {
                    return;
                }
                s1.N(t, V, s1.y(t2, V));
                o0(t, i2);
                return;
            case 6:
                if (!C(t2, i2)) {
                    return;
                }
                s1.M(t, V, s1.x(t2, V));
                o0(t, i2);
                return;
            case 7:
                if (C(t2, i2)) {
                    s1.E(t, V, s1.p(t2, V));
                    o0(t, i2);
                    return;
                }
                return;
            case 8:
                if (!C(t2, i2)) {
                    return;
                }
                s1.O(t, V, s1.A(t2, V));
                o0(t, i2);
                return;
            case 9:
            case 17:
                O(t, t2, i2);
                return;
            case 10:
                if (!C(t2, i2)) {
                    return;
                }
                s1.O(t, V, s1.A(t2, V));
                o0(t, i2);
                return;
            case 11:
                if (!C(t2, i2)) {
                    return;
                }
                s1.M(t, V, s1.x(t2, V));
                o0(t, i2);
                return;
            case 12:
                if (!C(t2, i2)) {
                    return;
                }
                s1.M(t, V, s1.x(t2, V));
                o0(t, i2);
                return;
            case 13:
                if (!C(t2, i2)) {
                    return;
                }
                s1.M(t, V, s1.x(t2, V));
                o0(t, i2);
                return;
            case 14:
                if (!C(t2, i2)) {
                    return;
                }
                s1.N(t, V, s1.y(t2, V));
                o0(t, i2);
                return;
            case 15:
                if (!C(t2, i2)) {
                    return;
                }
                s1.M(t, V, s1.x(t2, V));
                o0(t, i2);
                return;
            case 16:
                if (!C(t2, i2)) {
                    return;
                }
                s1.N(t, V, s1.y(t2, V));
                o0(t, i2);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case j.b3 /* 23 */:
            case j.c3 /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case j.h3 /* 29 */:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.n.d(t, t2, V);
                return;
            case 50:
                j1.F(this.q, t, t2, V);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (!I(t2, U, i2)) {
                    return;
                }
                s1.O(t, V, s1.A(t2, V));
                p0(t, U, i2);
                return;
            case 60:
            case 68:
                P(t, t2, i2);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (!I(t2, U, i2)) {
                    return;
                }
                s1.O(t, V, s1.A(t2, V));
                p0(t, U, i2);
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> v0<T> R(Class<T> cls, q0 q0Var, x0 x0Var, i0 i0Var, o1<?, ?> o1Var, r<?> rVar, n0 n0Var) {
        return q0Var instanceof f1 ? T((f1) q0Var, x0Var, i0Var, o1Var, rVar, n0Var) : S((l1) q0Var, x0Var, i0Var, o1Var, rVar, n0Var);
    }

    static <T> v0<T> S(l1 l1Var, x0 x0Var, i0 i0Var, o1<?, ?> o1Var, r<?> rVar, n0 n0Var) {
        boolean z = l1Var.a() == c1.PROTO3;
        u[] e2 = l1Var.e();
        if (e2.length == 0) {
            int length = e2.length;
            int[] iArr = new int[length * 3];
            Object[] objArr = new Object[length * 2];
            if (e2.length <= 0) {
                int[] d2 = l1Var.d();
                if (d2 == null) {
                    d2 = r;
                }
                if (e2.length <= 0) {
                    int[] iArr2 = r;
                    int[] iArr3 = r;
                    int[] iArr4 = new int[d2.length + iArr2.length + iArr3.length];
                    System.arraycopy(d2, 0, iArr4, 0, d2.length);
                    System.arraycopy(iArr2, 0, iArr4, d2.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, d2.length + iArr2.length, iArr3.length);
                    return new v0<>(iArr, objArr, 0, 0, l1Var.b(), z, true, iArr4, d2.length, d2.length + iArr2.length, x0Var, i0Var, o1Var, rVar, n0Var);
                }
                e2[0].a();
                throw null;
            }
            e2[0].c();
            throw null;
        }
        e2[0].a();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x039f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <T> v0<T> T(f1 f1Var, x0 x0Var, i0 i0Var, o1<?, ?> o1Var, r<?> rVar, n0 n0Var) {
        int i2;
        int i3;
        int i4;
        int[] iArr;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int i11;
        int i12;
        String str;
        Class<?> cls;
        int i13;
        int i14;
        int[] iArr2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        Field field;
        int i21;
        char charAt;
        int i22;
        Object obj;
        Field field2;
        Object obj2;
        Field field3;
        int i23;
        int i24;
        char charAt2;
        int i25;
        char charAt3;
        int i26;
        char charAt4;
        int i27;
        char charAt5;
        int i28;
        char charAt6;
        int i29;
        char charAt7;
        int i30;
        char charAt8;
        int i31;
        char charAt9;
        int i32;
        char charAt10;
        int i33;
        char charAt11;
        int i34;
        char charAt12;
        int i35;
        char charAt13;
        char charAt14;
        int i36 = 0;
        boolean z2 = f1Var.a() == c1.PROTO3;
        String e2 = f1Var.e();
        int length = e2.length();
        int charAt15 = e2.charAt(0);
        if (charAt15 >= 55296) {
            int i37 = charAt15 & 8191;
            int i38 = 1;
            int i39 = 13;
            while (true) {
                i2 = i38 + 1;
                charAt14 = e2.charAt(i38);
                if (charAt14 < 55296) {
                    break;
                }
                i37 |= (charAt14 & 8191) << i39;
                i39 += 13;
                i38 = i2;
            }
            charAt15 = i37 | (charAt14 << i39);
        } else {
            i2 = 1;
        }
        int i40 = i2 + 1;
        int charAt16 = e2.charAt(i2);
        if (charAt16 >= 55296) {
            int i41 = charAt16 & 8191;
            int i42 = 13;
            while (true) {
                i35 = i40 + 1;
                charAt13 = e2.charAt(i40);
                if (charAt13 < 55296) {
                    break;
                }
                i41 |= (charAt13 & 8191) << i42;
                i42 += 13;
                i40 = i35;
            }
            charAt16 = i41 | (charAt13 << i42);
            i40 = i35;
        }
        if (charAt16 == 0) {
            iArr = r;
            i8 = 0;
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        } else {
            int i43 = i40 + 1;
            int charAt17 = e2.charAt(i40);
            if (charAt17 >= 55296) {
                int i44 = charAt17 & 8191;
                int i45 = 13;
                while (true) {
                    i34 = i43 + 1;
                    charAt12 = e2.charAt(i43);
                    if (charAt12 < 55296) {
                        break;
                    }
                    i44 |= (charAt12 & 8191) << i45;
                    i45 += 13;
                    i43 = i34;
                }
                charAt17 = i44 | (charAt12 << i45);
                i43 = i34;
            }
            int i46 = i43 + 1;
            int charAt18 = e2.charAt(i43);
            if (charAt18 >= 55296) {
                int i47 = charAt18 & 8191;
                int i48 = 13;
                while (true) {
                    i33 = i46 + 1;
                    charAt11 = e2.charAt(i46);
                    if (charAt11 < 55296) {
                        break;
                    }
                    i47 |= (charAt11 & 8191) << i48;
                    i48 += 13;
                    i46 = i33;
                }
                charAt18 = i47 | (charAt11 << i48);
                i46 = i33;
            }
            int i49 = i46 + 1;
            int charAt19 = e2.charAt(i46);
            if (charAt19 >= 55296) {
                int i50 = charAt19 & 8191;
                int i51 = 13;
                while (true) {
                    i32 = i49 + 1;
                    charAt10 = e2.charAt(i49);
                    if (charAt10 < 55296) {
                        break;
                    }
                    i50 |= (charAt10 & 8191) << i51;
                    i51 += 13;
                    i49 = i32;
                }
                charAt19 = i50 | (charAt10 << i51);
                i49 = i32;
            }
            int i52 = i49 + 1;
            i6 = e2.charAt(i49);
            if (i6 >= 55296) {
                int i53 = i6 & 8191;
                int i54 = 13;
                while (true) {
                    i31 = i52 + 1;
                    charAt9 = e2.charAt(i52);
                    if (charAt9 < 55296) {
                        break;
                    }
                    i53 |= (charAt9 & 8191) << i54;
                    i54 += 13;
                    i52 = i31;
                }
                i6 = i53 | (charAt9 << i54);
                i52 = i31;
            }
            int i55 = i52 + 1;
            i5 = e2.charAt(i52);
            if (i5 >= 55296) {
                int i56 = i5 & 8191;
                int i57 = 13;
                while (true) {
                    i30 = i55 + 1;
                    charAt8 = e2.charAt(i55);
                    if (charAt8 < 55296) {
                        break;
                    }
                    i56 |= (charAt8 & 8191) << i57;
                    i57 += 13;
                    i55 = i30;
                }
                i5 = i56 | (charAt8 << i57);
                i55 = i30;
            }
            int i58 = i55 + 1;
            int charAt20 = e2.charAt(i55);
            if (charAt20 >= 55296) {
                int i59 = charAt20 & 8191;
                int i60 = 13;
                while (true) {
                    i29 = i58 + 1;
                    charAt7 = e2.charAt(i58);
                    if (charAt7 < 55296) {
                        break;
                    }
                    i59 |= (charAt7 & 8191) << i60;
                    i60 += 13;
                    i58 = i29;
                }
                charAt20 = i59 | (charAt7 << i60);
                i58 = i29;
            }
            int i61 = i58 + 1;
            int charAt21 = e2.charAt(i58);
            if (charAt21 >= 55296) {
                int i62 = charAt21 & 8191;
                int i63 = 13;
                while (true) {
                    i28 = i61 + 1;
                    charAt6 = e2.charAt(i61);
                    if (charAt6 < 55296) {
                        break;
                    }
                    i62 |= (charAt6 & 8191) << i63;
                    i63 += 13;
                    i61 = i28;
                }
                charAt21 = i62 | (charAt6 << i63);
                i61 = i28;
            }
            int i64 = i61 + 1;
            i3 = e2.charAt(i61);
            if (i3 >= 55296) {
                int i65 = i3 & 8191;
                int i66 = i64;
                int i67 = 13;
                while (true) {
                    i27 = i66 + 1;
                    charAt5 = e2.charAt(i66);
                    if (charAt5 < 55296) {
                        break;
                    }
                    i65 |= (charAt5 & 8191) << i67;
                    i67 += 13;
                    i66 = i27;
                }
                i3 = i65 | (charAt5 << i67);
                i64 = i27;
            }
            iArr = new int[i3 + charAt20 + charAt21];
            i4 = (charAt17 * 2) + charAt18;
            i8 = charAt17;
            i40 = i64;
            i7 = charAt20;
            i36 = charAt19;
        }
        Unsafe unsafe = s;
        Object[] d2 = f1Var.d();
        Class<?> cls2 = f1Var.b().getClass();
        int[] iArr3 = new int[i5 * 3];
        Object[] objArr = new Object[i5 * 2];
        int i68 = i3 + i7;
        int i69 = i3;
        int i70 = i68;
        int i71 = 0;
        int i72 = 0;
        while (i40 < length) {
            int i73 = i40 + 1;
            int charAt22 = e2.charAt(i40);
            length = length;
            if (charAt22 >= 55296) {
                int i74 = charAt22 & 8191;
                int i75 = i73;
                int i76 = 13;
                while (true) {
                    i26 = i75 + 1;
                    charAt4 = e2.charAt(i75);
                    i9 = i3;
                    if (charAt4 < 55296) {
                        break;
                    }
                    i74 |= (charAt4 & 8191) << i76;
                    i76 += 13;
                    i75 = i26;
                    i3 = i9;
                }
                charAt22 = i74 | (charAt4 << i76);
                i10 = i26;
            } else {
                i9 = i3;
                i10 = i73;
            }
            int i77 = i10 + 1;
            int charAt23 = e2.charAt(i10);
            if (charAt23 >= 55296) {
                int i78 = charAt23 & 8191;
                int i79 = i77;
                int i80 = 13;
                while (true) {
                    i25 = i79 + 1;
                    charAt3 = e2.charAt(i79);
                    z = z2;
                    if (charAt3 < 55296) {
                        break;
                    }
                    i78 |= (charAt3 & 8191) << i80;
                    i80 += 13;
                    i79 = i25;
                    z2 = z;
                }
                charAt23 = i78 | (charAt3 << i80);
                i11 = i25;
            } else {
                z = z2;
                i11 = i77;
            }
            int i81 = charAt23 & 255;
            i6 = i6;
            if ((charAt23 & 1024) != 0) {
                i71++;
                iArr[i71] = i72;
            }
            i71 = i71;
            if (i81 >= 51) {
                int i82 = i11 + 1;
                int charAt24 = e2.charAt(i11);
                char c = 55296;
                if (charAt24 >= 55296) {
                    int i83 = charAt24 & 8191;
                    int i84 = 13;
                    while (true) {
                        i24 = i82 + 1;
                        charAt2 = e2.charAt(i82);
                        if (charAt2 < c) {
                            break;
                        }
                        i83 |= (charAt2 & 8191) << i84;
                        i84 += 13;
                        i82 = i24;
                        c = 55296;
                    }
                    charAt24 = i83 | (charAt2 << i84);
                    i82 = i24;
                }
                int i85 = i81 - 51;
                i14 = i82;
                if (i85 == 9 || i85 == 17) {
                    i23 = i4 + 1;
                    objArr[((i72 / 3) * 2) + 1] = d2[i4];
                } else {
                    if (i85 == 12 && (charAt15 & 1) == 1) {
                        i23 = i4 + 1;
                        objArr[((i72 / 3) * 2) + 1] = d2[i4];
                    }
                    int i86 = charAt24 * 2;
                    obj = d2[i86];
                    if (!(obj instanceof Field)) {
                        field2 = (Field) obj;
                    } else {
                        field2 = n0(cls2, (String) obj);
                        d2[i86] = field2;
                    }
                    iArr2 = iArr3;
                    i12 = charAt22;
                    i16 = (int) unsafe.objectFieldOffset(field2);
                    int i87 = i86 + 1;
                    obj2 = d2[i87];
                    if (!(obj2 instanceof Field)) {
                        field3 = (Field) obj2;
                    } else {
                        field3 = n0(cls2, (String) obj2);
                        d2[i87] = field3;
                    }
                    i18 = (int) unsafe.objectFieldOffset(field3);
                    str = e2;
                    cls = cls2;
                    i19 = charAt15;
                    i15 = i81;
                    i17 = i4;
                    i13 = 0;
                }
                i4 = i23;
                int i862 = charAt24 * 2;
                obj = d2[i862];
                if (!(obj instanceof Field)) {
                }
                iArr2 = iArr3;
                i12 = charAt22;
                i16 = (int) unsafe.objectFieldOffset(field2);
                int i872 = i862 + 1;
                obj2 = d2[i872];
                if (!(obj2 instanceof Field)) {
                }
                i18 = (int) unsafe.objectFieldOffset(field3);
                str = e2;
                cls = cls2;
                i19 = charAt15;
                i15 = i81;
                i17 = i4;
                i13 = 0;
            } else {
                iArr2 = iArr3;
                i12 = charAt22;
                i17 = i4 + 1;
                Field n0 = n0(cls2, (String) d2[i4]);
                if (i81 == 9 || i81 == 17) {
                    objArr[((i72 / 3) * 2) + 1] = n0.getType();
                } else {
                    if (i81 == 27 || i81 == 49) {
                        i22 = i17 + 1;
                        objArr[((i72 / 3) * 2) + 1] = d2[i17];
                    } else if (i81 == 12 || i81 == 30 || i81 == 44) {
                        if ((charAt15 & 1) == 1) {
                            i22 = i17 + 1;
                            objArr[((i72 / 3) * 2) + 1] = d2[i17];
                        }
                    } else if (i81 == 50) {
                        int i88 = i69 + 1;
                        iArr[i69] = i72;
                        int i89 = (i72 / 3) * 2;
                        int i90 = i17 + 1;
                        objArr[i89] = d2[i17];
                        if ((charAt23 & 2048) != 0) {
                            i17 = i90 + 1;
                            objArr[i89 + 1] = d2[i90];
                            i69 = i88;
                        } else {
                            i69 = i88;
                            i17 = i90;
                        }
                    }
                    i20 = i81;
                    i17 = i22;
                    i16 = (int) unsafe.objectFieldOffset(n0);
                    if ((charAt15 & 1) != 1) {
                        i15 = i20;
                        if (i15 <= 17) {
                            i14 = i11 + 1;
                            int charAt25 = e2.charAt(i11);
                            if (charAt25 >= 55296) {
                                int i91 = charAt25 & 8191;
                                int i92 = 13;
                                while (true) {
                                    i21 = i14 + 1;
                                    charAt = e2.charAt(i14);
                                    if (charAt < 55296) {
                                        break;
                                    }
                                    i91 |= (charAt & 8191) << i92;
                                    i92 += 13;
                                    i14 = i21;
                                }
                                charAt25 = i91 | (charAt << i92);
                                i14 = i21;
                            }
                            int i93 = (i8 * 2) + (charAt25 / 32);
                            Object obj3 = d2[i93];
                            str = e2;
                            if (obj3 instanceof Field) {
                                field = (Field) obj3;
                            } else {
                                field = n0(cls2, (String) obj3);
                                d2[i93] = field;
                            }
                            cls = cls2;
                            i19 = charAt15;
                            i18 = (int) unsafe.objectFieldOffset(field);
                            i13 = charAt25 % 32;
                            if (i15 >= 18 && i15 <= 49) {
                                i70++;
                                iArr[i70] = i16;
                            }
                        } else {
                            str = e2;
                            cls = cls2;
                            i19 = charAt15;
                        }
                    } else {
                        str = e2;
                        cls = cls2;
                        i19 = charAt15;
                        i15 = i20;
                    }
                    i14 = i11;
                    i18 = 0;
                    i13 = 0;
                    if (i15 >= 18) {
                        i70++;
                        iArr[i70] = i16;
                    }
                }
                i20 = i81;
                i16 = (int) unsafe.objectFieldOffset(n0);
                if ((charAt15 & 1) != 1) {
                }
                i14 = i11;
                i18 = 0;
                i13 = 0;
                if (i15 >= 18) {
                }
            }
            int i94 = i72 + 1;
            iArr2[i72] = i12;
            int i95 = i94 + 1;
            charAt15 = i19;
            iArr2[i94] = ((charAt23 & 512) != 0 ? 536870912 : 0) | ((charAt23 & 256) != 0 ? 268435456 : 0) | (i15 << 20) | i16;
            i72 = i95 + 1;
            iArr2[i95] = (i13 << 20) | i18;
            i40 = i14;
            cls2 = cls;
            i3 = i9;
            z2 = z;
            i4 = i17;
            iArr3 = iArr2;
            e2 = str;
        }
        return new v0<>(iArr3, objArr, i36, i6, f1Var.b(), z2, false, iArr, i3, i68, x0Var, i0Var, o1Var, rVar, n0Var);
    }

    private int U(int i2) {
        return this.a[i2];
    }

    private static long V(int i2) {
        return i2 & 1048575;
    }

    private static <T> boolean W(T t, long j2) {
        return ((Boolean) s1.A(t, j2)).booleanValue();
    }

    private static <T> double X(T t, long j2) {
        return ((Double) s1.A(t, j2)).doubleValue();
    }

    private static <T> float Y(T t, long j2) {
        return ((Float) s1.A(t, j2)).floatValue();
    }

    private static <T> int Z(T t, long j2) {
        return ((Integer) s1.A(t, j2)).intValue();
    }

    private static <T> long a0(T t, long j2) {
        return ((Long) s1.A(t, j2)).longValue();
    }

    private <K, V> int b0(T t, byte[] bArr, int i2, int i3, int i4, long j2, e.b bVar) {
        Unsafe unsafe = s;
        Object u = u(i4);
        Object object = unsafe.getObject(t, j2);
        if (this.q.f(object)) {
            Object c = this.q.c(u);
            this.q.a(c, object);
            unsafe.putObject(t, j2, c);
            object = c;
        }
        return m(bArr, i2, i3, this.q.h(u), this.q.e(object), bVar);
    }

    private int c0(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j2, int i9, e.b bVar) {
        int i10;
        Object obj;
        Object obj2;
        Object obj3;
        long j3;
        int i11;
        Unsafe unsafe = s;
        long j4 = this.a[i9 + 2] & 1048575;
        switch (i8) {
            case 51:
                if (i6 == 1) {
                    obj = Double.valueOf(e.d(bArr, i2));
                    unsafe.putObject(t, j2, obj);
                    i10 = i2 + 8;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 52:
                if (i6 == 5) {
                    obj2 = Float.valueOf(e.l(bArr, i2));
                    unsafe.putObject(t, j2, obj2);
                    i10 = i2 + 4;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 53:
            case 54:
                if (i6 == 0) {
                    i10 = e.L(bArr, i2, bVar);
                    j3 = bVar.b;
                    obj3 = Long.valueOf(j3);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 55:
            case 62:
                if (i6 == 0) {
                    i10 = e.I(bArr, i2, bVar);
                    i11 = bVar.a;
                    obj3 = Integer.valueOf(i11);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 56:
            case 65:
                if (i6 == 1) {
                    obj = Long.valueOf(e.j(bArr, i2));
                    unsafe.putObject(t, j2, obj);
                    i10 = i2 + 8;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 57:
            case 64:
                if (i6 == 5) {
                    obj2 = Integer.valueOf(e.h(bArr, i2));
                    unsafe.putObject(t, j2, obj2);
                    i10 = i2 + 4;
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 58:
                if (i6 == 0) {
                    i10 = e.L(bArr, i2, bVar);
                    obj3 = Boolean.valueOf(bVar.b != 0);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 59:
                if (i6 == 2) {
                    i10 = e.I(bArr, i2, bVar);
                    int i12 = bVar.a;
                    if (i12 == 0) {
                        obj3 = "";
                        unsafe.putObject(t, j2, obj3);
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    } else if ((i7 & 536870912) == 0 || t1.n(bArr, i10, i10 + i12)) {
                        unsafe.putObject(t, j2, new String(bArr, i10, i12, b0.a));
                        i10 += i12;
                        unsafe.putInt(t, j4, i5);
                        return i10;
                    } else {
                        throw c0.c();
                    }
                }
                return i2;
            case 60:
                if (i6 == 2) {
                    i10 = e.p(v(i9), bArr, i2, i3, bVar);
                    Object object = unsafe.getInt(t, j4) == i5 ? unsafe.getObject(t, j2) : null;
                    obj3 = bVar.c;
                    if (object != null) {
                        obj3 = b0.h(object, obj3);
                    }
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 61:
                if (i6 == 2) {
                    i10 = e.b(bArr, i2, bVar);
                    obj3 = bVar.c;
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 63:
                if (i6 == 0) {
                    int I = e.I(bArr, i2, bVar);
                    int i13 = bVar.a;
                    b0.e t2 = t(i9);
                    if (t2 == null || t2.a(i13)) {
                        unsafe.putObject(t, j2, Integer.valueOf(i13));
                        unsafe.putInt(t, j4, i5);
                    } else {
                        w(t).n(i4, Long.valueOf(i13));
                    }
                    return I;
                }
                return i2;
            case 66:
                if (i6 == 0) {
                    i10 = e.I(bArr, i2, bVar);
                    i11 = j.b(bVar.a);
                    obj3 = Integer.valueOf(i11);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 67:
                if (i6 == 0) {
                    i10 = e.L(bArr, i2, bVar);
                    j3 = j.c(bVar.b);
                    obj3 = Long.valueOf(j3);
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            case 68:
                if (i6 == 3) {
                    i10 = e.n(v(i9), bArr, i2, i3, (i4 & (-8)) | 4, bVar);
                    Object object2 = unsafe.getInt(t, j4) == i5 ? unsafe.getObject(t, j2) : null;
                    obj3 = bVar.c;
                    if (object2 != null) {
                        obj3 = b0.h(object2, obj3);
                    }
                    unsafe.putObject(t, j2, obj3);
                    unsafe.putInt(t, j4, i5);
                    return i10;
                }
                return i2;
            default:
                return i2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r6 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0101, code lost:
        if (r6 == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0103, code lost:
        r0 = f.b.b.a.z.a.e.I(r12, r8, r11);
        r1 = r11.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01c2, code lost:
        if (r0 != r15) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01f0, code lost:
        if (r0 != r15) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x020d, code lost:
        if (r0 != r15) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0210, code lost:
        r2 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int e0(T t, byte[] bArr, int i2, int i3, e.b bVar) {
        int i4;
        int i5;
        int i6;
        int i7;
        Unsafe unsafe;
        int i8;
        int i9;
        int i10;
        int i11;
        long j2;
        long j3;
        T t2;
        Unsafe unsafe2;
        long j4;
        long j5;
        Object h2;
        v0<T> v0Var = this;
        T t3 = t;
        byte[] bArr2 = bArr;
        int i12 = i3;
        e.b bVar2 = bVar;
        Unsafe unsafe3 = s;
        int i13 = -1;
        int i14 = i2;
        int i15 = -1;
        int i16 = 0;
        while (i14 < i12) {
            int i17 = i14 + 1;
            byte b = bArr2[i14];
            if (b < 0) {
                i5 = e.H(b, bArr2, i17, bVar2);
                i4 = bVar2.a;
            } else {
                i4 = b;
                i5 = i17;
            }
            int i18 = i4 >>> 3;
            int i19 = i4 & 7;
            int h0 = i18 > i15 ? v0Var.h0(i18, i16 / 3) : v0Var.g0(i18);
            if (h0 == i13) {
                i6 = i18;
                i8 = i5;
                unsafe = unsafe3;
                i7 = 0;
            } else {
                int i20 = v0Var.a[h0 + 1];
                int r0 = r0(i20);
                long V = V(i20);
                if (r0 <= 17) {
                    boolean z = true;
                    switch (r0) {
                        case 0:
                            i10 = h0;
                            if (i19 == 1) {
                                s1.K(t3, V, e.d(bArr2, i5));
                                i14 = i5 + 8;
                                i15 = i18;
                                i16 = i10;
                                break;
                            }
                            i6 = i18;
                            i9 = i5;
                            unsafe = unsafe3;
                            i7 = i10;
                            break;
                        case 1:
                            i10 = h0;
                            if (i19 == 5) {
                                s1.L(t3, V, e.l(bArr2, i5));
                                i14 = i5 + 4;
                                i15 = i18;
                                i16 = i10;
                                break;
                            }
                            i6 = i18;
                            i9 = i5;
                            unsafe = unsafe3;
                            i7 = i10;
                            break;
                        case 2:
                        case 3:
                            j3 = V;
                            i10 = h0;
                            if (i19 == 0) {
                                i11 = e.L(bArr2, i5, bVar2);
                                j2 = bVar2.b;
                                unsafe2 = unsafe3;
                                t2 = t;
                                unsafe2.putLong(t2, j3, j2);
                                i14 = i11;
                                i15 = i18;
                                i16 = i10;
                                break;
                            }
                            i6 = i18;
                            i9 = i5;
                            unsafe = unsafe3;
                            i7 = i10;
                            break;
                        case 4:
                        case 11:
                            j4 = V;
                            i10 = h0;
                            break;
                        case 5:
                        case 14:
                            if (i19 == 1) {
                                i10 = h0;
                                unsafe3.putLong(t, V, e.j(bArr2, i5));
                                i14 = i5 + 8;
                                i15 = i18;
                                i16 = i10;
                                break;
                            }
                            i7 = h0;
                            i6 = i18;
                            i9 = i5;
                            unsafe = unsafe3;
                            break;
                        case 6:
                        case 13:
                            if (i19 == 5) {
                                unsafe3.putInt(t3, V, e.h(bArr2, i5));
                                i14 = i5 + 4;
                                i16 = h0;
                                i15 = i18;
                                break;
                            }
                            i7 = h0;
                            i6 = i18;
                            i9 = i5;
                            unsafe = unsafe3;
                            break;
                        case 7:
                            if (i19 == 0) {
                                i14 = e.L(bArr2, i5, bVar2);
                                if (bVar2.b == 0) {
                                    z = false;
                                }
                                s1.E(t3, V, z);
                                i16 = h0;
                                i15 = i18;
                                break;
                            }
                            i7 = h0;
                            i6 = i18;
                            i9 = i5;
                            unsafe = unsafe3;
                            break;
                        case 8:
                            j5 = V;
                            if (i19 == 2) {
                                i14 = (536870912 & i20) == 0 ? e.C(bArr2, i5, bVar2) : e.F(bArr2, i5, bVar2);
                                h2 = bVar2.c;
                                unsafe3.putObject(t3, j5, h2);
                                i16 = h0;
                                i15 = i18;
                                break;
                            }
                            i7 = h0;
                            i6 = i18;
                            i9 = i5;
                            unsafe = unsafe3;
                            break;
                        case 9:
                            j5 = V;
                            if (i19 == 2) {
                                i14 = e.p(v0Var.v(h0), bArr2, i5, i12, bVar2);
                                Object object = unsafe3.getObject(t3, j5);
                                h2 = object == null ? bVar2.c : b0.h(object, bVar2.c);
                                unsafe3.putObject(t3, j5, h2);
                                i16 = h0;
                                i15 = i18;
                                break;
                            }
                            i7 = h0;
                            i6 = i18;
                            i9 = i5;
                            unsafe = unsafe3;
                            break;
                        case 10:
                            j5 = V;
                            if (i19 == 2) {
                                i14 = e.b(bArr2, i5, bVar2);
                                h2 = bVar2.c;
                                unsafe3.putObject(t3, j5, h2);
                                i16 = h0;
                                i15 = i18;
                                break;
                            }
                            i7 = h0;
                            i6 = i18;
                            i9 = i5;
                            unsafe = unsafe3;
                            break;
                        case 12:
                            j4 = V;
                            i10 = h0;
                            break;
                        case 15:
                            j4 = V;
                            i10 = h0;
                            if (i19 == 0) {
                                i14 = e.I(bArr2, i5, bVar2);
                                int i21 = j.b(bVar2.a);
                                unsafe3.putInt(t3, j4, i21);
                                i15 = i18;
                                i16 = i10;
                                break;
                            }
                            i6 = i18;
                            i9 = i5;
                            unsafe = unsafe3;
                            i7 = i10;
                            break;
                        case 16:
                            if (i19 == 0) {
                                i11 = e.L(bArr2, i5, bVar2);
                                j2 = j.c(bVar2.b);
                                unsafe2 = unsafe3;
                                j3 = V;
                                t2 = t;
                                i10 = h0;
                                unsafe2.putLong(t2, j3, j2);
                                i14 = i11;
                                i15 = i18;
                                i16 = i10;
                                break;
                            }
                            i7 = h0;
                            i6 = i18;
                            i9 = i5;
                            unsafe = unsafe3;
                            break;
                        default:
                            i7 = h0;
                            i6 = i18;
                            i9 = i5;
                            unsafe = unsafe3;
                            break;
                    }
                    i13 = -1;
                } else if (r0 == 27) {
                    if (i19 == 2) {
                        b0.i iVar = (b0.i) unsafe3.getObject(t3, V);
                        if (!iVar.f()) {
                            int size = iVar.size();
                            iVar = iVar.d(size == 0 ? 10 : size * 2);
                            unsafe3.putObject(t3, V, iVar);
                        }
                        i14 = e.q(v0Var.v(h0), i4, bArr, i5, i3, iVar, bVar);
                        i15 = i18;
                        i16 = h0;
                        i13 = -1;
                    }
                    i7 = h0;
                    i6 = i18;
                    i9 = i5;
                    unsafe = unsafe3;
                } else {
                    i7 = h0;
                    if (r0 <= 49) {
                        i6 = i18;
                        int i22 = i5;
                        unsafe = unsafe3;
                        i14 = f0(t, bArr, i5, i3, i4, i18, i19, i7, i20, r0, V, bVar);
                    } else {
                        i6 = i18;
                        i9 = i5;
                        unsafe = unsafe3;
                        if (r0 == 50) {
                            if (i19 == 2) {
                                i14 = b0(t, bArr, i9, i3, i7, V, bVar);
                            }
                            i8 = i9;
                        } else {
                            i14 = c0(t, bArr, i9, i3, i4, i6, i19, i20, r0, V, i7, bVar);
                        }
                    }
                    v0Var = this;
                    t3 = t;
                    bArr2 = bArr;
                    i12 = i3;
                    bVar2 = bVar;
                    unsafe3 = unsafe;
                    i16 = i7;
                    i15 = i6;
                    i13 = -1;
                }
                i8 = i9;
            }
            i14 = e.G(i4, bArr, i8, i3, w(t), bVar);
            v0Var = this;
            t3 = t;
            bArr2 = bArr;
            i12 = i3;
            bVar2 = bVar;
            unsafe3 = unsafe;
            i16 = i7;
            i15 = i6;
            i13 = -1;
        }
        if (i14 == i12) {
            return i14;
        }
        throw c0.g();
    }

    private int f0(T t, byte[] bArr, int i2, int i3, int i4, int i5, int i6, int i7, long j2, int i8, long j3, e.b bVar) {
        int i9;
        Unsafe unsafe = s;
        b0.i iVar = (b0.i) unsafe.getObject(t, j3);
        if (!iVar.f()) {
            int size = iVar.size();
            iVar = iVar.d(size == 0 ? 10 : size * 2);
            unsafe.putObject(t, j3, iVar);
        }
        switch (i8) {
            case 18:
            case 35:
                if (i6 == 2) {
                    return e.s(bArr, i2, iVar, bVar);
                }
                if (i6 == 1) {
                    return e.e(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 19:
            case 36:
                if (i6 == 2) {
                    return e.v(bArr, i2, iVar, bVar);
                }
                if (i6 == 5) {
                    return e.m(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i6 == 2) {
                    return e.z(bArr, i2, iVar, bVar);
                }
                if (i6 == 0) {
                    return e.M(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 22:
            case j.h3 /* 29 */:
            case 39:
            case 43:
                if (i6 == 2) {
                    return e.y(bArr, i2, iVar, bVar);
                }
                if (i6 == 0) {
                    return e.J(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case j.b3 /* 23 */:
            case 32:
            case 40:
            case 46:
                if (i6 == 2) {
                    return e.u(bArr, i2, iVar, bVar);
                }
                if (i6 == 1) {
                    return e.k(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case j.c3 /* 24 */:
            case 31:
            case 41:
            case 45:
                if (i6 == 2) {
                    return e.t(bArr, i2, iVar, bVar);
                }
                if (i6 == 5) {
                    return e.i(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 25:
            case 42:
                if (i6 == 2) {
                    return e.r(bArr, i2, iVar, bVar);
                }
                if (i6 == 0) {
                    return e.a(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 26:
                if (i6 == 2) {
                    int i10 = ((j2 & 536870912) > 0L ? 1 : ((j2 & 536870912) == 0L ? 0 : -1));
                    b0.i iVar2 = iVar;
                    return i10 == 0 ? e.D(i4, bArr, i2, i3, iVar2, bVar) : e.E(i4, bArr, i2, i3, iVar2, bVar);
                }
                break;
            case 27:
                if (i6 == 2) {
                    return e.q(v(i7), i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 28:
                if (i6 == 2) {
                    return e.c(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 30:
            case 44:
                if (i6 == 2) {
                    i9 = e.y(bArr, i2, iVar, bVar);
                } else if (i6 == 0) {
                    i9 = e.J(i4, bArr, i2, i3, iVar, bVar);
                }
                z zVar = (z) t;
                p1 p1Var = zVar.unknownFields;
                if (p1Var == p1.e()) {
                    p1Var = null;
                }
                p1 p1Var2 = (p1) j1.A(i5, iVar, t(i7), p1Var, this.o);
                if (p1Var2 != null) {
                    zVar.unknownFields = p1Var2;
                }
                return i9;
            case 33:
            case 47:
                if (i6 == 2) {
                    return e.w(bArr, i2, iVar, bVar);
                }
                if (i6 == 0) {
                    return e.A(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 34:
            case 48:
                if (i6 == 2) {
                    return e.x(bArr, i2, iVar, bVar);
                }
                if (i6 == 0) {
                    return e.B(i4, bArr, i2, i3, iVar, bVar);
                }
                break;
            case 49:
                if (i6 == 3) {
                    return e.o(v(i7), i4, bArr, i2, i3, iVar, bVar);
                }
                break;
        }
        return i2;
    }

    private int g0(int i2) {
        if (i2 < this.c || i2 > this.f2612d) {
            return -1;
        }
        return q0(i2, 0);
    }

    private int h0(int i2, int i3) {
        if (i2 < this.c || i2 > this.f2612d) {
            return -1;
        }
        return q0(i2, i3);
    }

    private int i0(int i2) {
        return this.a[i2 + 2];
    }

    private <E> void j0(Object obj, long j2, g1 g1Var, h1<E> h1Var, q qVar) {
        g1Var.F(this.n.e(obj, j2), h1Var, qVar);
    }

    private boolean k(T t, T t2, int i2) {
        return C(t, i2) == C(t2, i2);
    }

    private <E> void k0(Object obj, int i2, g1 g1Var, h1<E> h1Var, q qVar) {
        g1Var.G(this.n.e(obj, V(i2)), h1Var, qVar);
    }

    private static <T> boolean l(T t, long j2) {
        return s1.p(t, j2);
    }

    private void l0(Object obj, int i2, g1 g1Var) {
        long V;
        Object d2;
        if (B(i2)) {
            V = V(i2);
            d2 = g1Var.I();
        } else if (this.f2615g) {
            V = V(i2);
            d2 = g1Var.E();
        } else {
            V = V(i2);
            d2 = g1Var.d();
        }
        s1.O(obj, V, d2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <K, V> int m(byte[] bArr, int i2, int i3, l0.a<K, V> aVar, Map<K, V> map, e.b bVar) {
        int i4;
        int I = e.I(bArr, i2, bVar);
        int i5 = bVar.a;
        if (i5 < 0 || i5 > i3 - I) {
            throw c0.j();
        }
        int i6 = I + i5;
        Object obj = aVar.b;
        Object obj2 = aVar.f2571d;
        while (I < i6) {
            int i7 = I + 1;
            int i8 = bArr[I];
            if (i8 < 0) {
                i4 = e.H(i8, bArr, i7, bVar);
                i8 = bVar.a;
            } else {
                i4 = i7;
            }
            int i9 = i8 >>> 3;
            int i10 = i8 & 7;
            if (i9 != 1) {
                if (i9 == 2 && i10 == aVar.c.c()) {
                    I = n(bArr, i4, i3, aVar.c, aVar.f2571d.getClass(), bVar);
                    obj2 = bVar.c;
                }
                I = e.N(i8, bArr, i4, i3, bVar);
            } else if (i10 == aVar.a.c()) {
                I = n(bArr, i4, i3, aVar.a, null, bVar);
                obj = bVar.c;
            } else {
                I = e.N(i8, bArr, i4, i3, bVar);
            }
        }
        if (I == i6) {
            map.put(obj, obj2);
            return i6;
        }
        throw c0.g();
    }

    private void m0(Object obj, int i2, g1 g1Var) {
        if (B(i2)) {
            g1Var.c(this.n.e(obj, V(i2)));
        } else {
            g1Var.Q(this.n.e(obj, V(i2)));
        }
    }

    private int n(byte[] bArr, int i2, int i3, u1.b bVar, Class<?> cls, e.b bVar2) {
        int L;
        Object valueOf;
        Object obj;
        Object obj2;
        int i4;
        long j2;
        switch (a.a[bVar.ordinal()]) {
            case 1:
                L = e.L(bArr, i2, bVar2);
                valueOf = Boolean.valueOf(bVar2.b != 0);
                bVar2.c = valueOf;
                return L;
            case 2:
                return e.b(bArr, i2, bVar2);
            case 3:
                obj = Double.valueOf(e.d(bArr, i2));
                bVar2.c = obj;
                return i2 + 8;
            case 4:
            case 5:
                obj2 = Integer.valueOf(e.h(bArr, i2));
                bVar2.c = obj2;
                return i2 + 4;
            case 6:
            case 7:
                obj = Long.valueOf(e.j(bArr, i2));
                bVar2.c = obj;
                return i2 + 8;
            case 8:
                obj2 = Float.valueOf(e.l(bArr, i2));
                bVar2.c = obj2;
                return i2 + 4;
            case 9:
            case 10:
            case 11:
                L = e.I(bArr, i2, bVar2);
                i4 = bVar2.a;
                valueOf = Integer.valueOf(i4);
                bVar2.c = valueOf;
                return L;
            case 12:
            case 13:
                L = e.L(bArr, i2, bVar2);
                j2 = bVar2.b;
                valueOf = Long.valueOf(j2);
                bVar2.c = valueOf;
                return L;
            case 14:
                return e.p(d1.a().d(cls), bArr, i2, i3, bVar2);
            case 15:
                L = e.I(bArr, i2, bVar2);
                i4 = j.b(bVar2.a);
                valueOf = Integer.valueOf(i4);
                bVar2.c = valueOf;
                return L;
            case 16:
                L = e.L(bArr, i2, bVar2);
                j2 = j.c(bVar2.b);
                valueOf = Long.valueOf(j2);
                bVar2.c = valueOf;
                return L;
            case 17:
                return e.F(bArr, i2, bVar2);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static Field n0(Class<?> cls, String str) {
        Field[] declaredFields;
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            for (Field field : cls.getDeclaredFields()) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private static <T> double o(T t, long j2) {
        return s1.v(t, j2);
    }

    private void o0(T t, int i2) {
        if (!this.f2616h) {
            int i0 = i0(i2);
            long j2 = i0 & 1048575;
            s1.M(t, j2, s1.x(t, j2) | (1 << (i0 >>> 20)));
        }
    }

    private boolean p(T t, T t2, int i2) {
        int s0 = s0(i2);
        long V = V(s0);
        switch (r0(s0)) {
            case 0:
                return k(t, t2, i2) && Double.doubleToLongBits(s1.v(t, V)) == Double.doubleToLongBits(s1.v(t2, V));
            case 1:
                return k(t, t2, i2) && Float.floatToIntBits(s1.w(t, V)) == Float.floatToIntBits(s1.w(t2, V));
            case 2:
                return k(t, t2, i2) && s1.y(t, V) == s1.y(t2, V);
            case 3:
                return k(t, t2, i2) && s1.y(t, V) == s1.y(t2, V);
            case 4:
                return k(t, t2, i2) && s1.x(t, V) == s1.x(t2, V);
            case 5:
                return k(t, t2, i2) && s1.y(t, V) == s1.y(t2, V);
            case 6:
                return k(t, t2, i2) && s1.x(t, V) == s1.x(t2, V);
            case 7:
                return k(t, t2, i2) && s1.p(t, V) == s1.p(t2, V);
            case 8:
                return k(t, t2, i2) && j1.K(s1.A(t, V), s1.A(t2, V));
            case 9:
                return k(t, t2, i2) && j1.K(s1.A(t, V), s1.A(t2, V));
            case 10:
                return k(t, t2, i2) && j1.K(s1.A(t, V), s1.A(t2, V));
            case 11:
                return k(t, t2, i2) && s1.x(t, V) == s1.x(t2, V);
            case 12:
                return k(t, t2, i2) && s1.x(t, V) == s1.x(t2, V);
            case 13:
                return k(t, t2, i2) && s1.x(t, V) == s1.x(t2, V);
            case 14:
                return k(t, t2, i2) && s1.y(t, V) == s1.y(t2, V);
            case 15:
                return k(t, t2, i2) && s1.x(t, V) == s1.x(t2, V);
            case 16:
                return k(t, t2, i2) && s1.y(t, V) == s1.y(t2, V);
            case 17:
                return k(t, t2, i2) && j1.K(s1.A(t, V), s1.A(t2, V));
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case j.b3 /* 23 */:
            case j.c3 /* 24 */:
            case 25:
            case 26:
            case 27:
            case 28:
            case j.h3 /* 29 */:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
                return j1.K(s1.A(t, V), s1.A(t2, V));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                return H(t, t2, i2) && j1.K(s1.A(t, V), s1.A(t2, V));
            default:
                return true;
        }
    }

    private void p0(T t, int i2, int i3) {
        s1.M(t, i0(i3) & 1048575, i2);
    }

    private final <UT, UB> UB q(Object obj, int i2, UB ub, o1<UT, UB> o1Var) {
        b0.e t;
        int U = U(i2);
        Object A = s1.A(obj, V(s0(i2)));
        return (A == null || (t = t(i2)) == null) ? ub : (UB) r(i2, U, this.q.e(A), t, ub, o1Var);
    }

    private int q0(int i2, int i3) {
        int length = (this.a.length / 3) - 1;
        while (i3 <= length) {
            int i4 = (length + i3) >>> 1;
            int i5 = i4 * 3;
            int U = U(i5);
            if (i2 == U) {
                return i5;
            }
            if (i2 < U) {
                length = i4 - 1;
            } else {
                i3 = i4 + 1;
            }
        }
        return -1;
    }

    private final <K, V, UT, UB> UB r(int i2, int i3, Map<K, V> map, b0.e eVar, UB ub, o1<UT, UB> o1Var) {
        l0.a<?, ?> h2 = this.q.h(u(i2));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!eVar.a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = o1Var.n();
                }
                i.g r2 = i.r(l0.b(h2, next.getKey(), next.getValue()));
                try {
                    l0.d(r2.b(), h2, next.getKey(), next.getValue());
                    o1Var.d(ub, i3, r2.a());
                    it.remove();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        return ub;
    }

    private static int r0(int i2) {
        return (i2 & 267386880) >>> 20;
    }

    private static <T> float s(T t, long j2) {
        return s1.w(t, j2);
    }

    private int s0(int i2) {
        return this.a[i2 + 1];
    }

    private b0.e t(int i2) {
        return (b0.e) this.b[((i2 / 3) * 2) + 1];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x049e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void t0(T t, v1 v1Var) {
        Map.Entry<?, Object> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i2;
        Map.Entry<?, Object> entry2;
        int i3;
        if (this.f2614f) {
            v<?> c = this.p.c(t);
            if (!c.n()) {
                it = c.s();
                entry = it.next();
                int i4 = -1;
                length = this.a.length;
                Unsafe unsafe = s;
                int i5 = 0;
                for (i2 = 0; i2 < length; i2 += 3) {
                    int s0 = s0(i2);
                    int U = U(i2);
                    int r0 = r0(s0);
                    if (this.f2616h || r0 > 17) {
                        entry2 = entry;
                        i3 = 0;
                    } else {
                        int i6 = this.a[i2 + 2];
                        int i7 = i6 & 1048575;
                        entry2 = entry;
                        if (i7 != i4) {
                            i5 = unsafe.getInt(t, i7);
                            i4 = i7;
                        }
                        i3 = 1 << (i6 >>> 20);
                    }
                    while (entry2 != null && this.p.a(entry2) <= U) {
                        this.p.j(v1Var, entry2);
                        entry2 = it.hasNext() ? it.next() : null;
                    }
                    entry = entry2;
                    i4 = i4;
                    long V = V(s0);
                    switch (r0) {
                        case 0:
                            if ((i3 & i5) != 0) {
                                v1Var.E(U, o(t, V));
                                continue;
                            }
                        case 1:
                            if ((i3 & i5) != 0) {
                                v1Var.p(U, s(t, V));
                            } else {
                                continue;
                            }
                        case 2:
                            if ((i3 & i5) != 0) {
                                v1Var.f(U, unsafe.getLong(t, V));
                            } else {
                                continue;
                            }
                        case 3:
                            if ((i3 & i5) != 0) {
                                v1Var.x(U, unsafe.getLong(t, V));
                            } else {
                                continue;
                            }
                        case 4:
                            if ((i3 & i5) != 0) {
                                v1Var.v(U, unsafe.getInt(t, V));
                            } else {
                                continue;
                            }
                        case 5:
                            if ((i3 & i5) != 0) {
                                v1Var.j(U, unsafe.getLong(t, V));
                            } else {
                                continue;
                            }
                        case 6:
                            if ((i3 & i5) != 0) {
                                v1Var.C(U, unsafe.getInt(t, V));
                            } else {
                                continue;
                            }
                        case 7:
                            if ((i3 & i5) != 0) {
                                v1Var.i(U, l(t, V));
                            } else {
                                continue;
                            }
                        case 8:
                            if ((i3 & i5) != 0) {
                                x0(U, unsafe.getObject(t, V), v1Var);
                            } else {
                                continue;
                            }
                        case 9:
                            if ((i3 & i5) != 0) {
                                v1Var.M(U, unsafe.getObject(t, V), v(i2));
                            } else {
                                continue;
                            }
                        case 10:
                            if ((i3 & i5) != 0) {
                                v1Var.a(U, (i) unsafe.getObject(t, V));
                            } else {
                                continue;
                            }
                        case 11:
                            if ((i3 & i5) != 0) {
                                v1Var.k(U, unsafe.getInt(t, V));
                            } else {
                                continue;
                            }
                        case 12:
                            if ((i3 & i5) != 0) {
                                v1Var.A(U, unsafe.getInt(t, V));
                            } else {
                                continue;
                            }
                        case 13:
                            if ((i3 & i5) != 0) {
                                v1Var.r(U, unsafe.getInt(t, V));
                            } else {
                                continue;
                            }
                        case 14:
                            if ((i3 & i5) != 0) {
                                v1Var.H(U, unsafe.getLong(t, V));
                            } else {
                                continue;
                            }
                        case 15:
                            if ((i3 & i5) != 0) {
                                v1Var.J(U, unsafe.getInt(t, V));
                            } else {
                                continue;
                            }
                        case 16:
                            if ((i3 & i5) != 0) {
                                v1Var.o(U, unsafe.getLong(t, V));
                            } else {
                                continue;
                            }
                        case 17:
                            if ((i3 & i5) != 0) {
                                v1Var.G(U, unsafe.getObject(t, V), v(i2));
                            } else {
                                continue;
                            }
                        case 18:
                            j1.P(U(i2), (List) unsafe.getObject(t, V), v1Var, false);
                            continue;
                        case 19:
                            j1.T(U(i2), (List) unsafe.getObject(t, V), v1Var, false);
                            continue;
                        case 20:
                            j1.W(U(i2), (List) unsafe.getObject(t, V), v1Var, false);
                            continue;
                        case 21:
                            j1.e0(U(i2), (List) unsafe.getObject(t, V), v1Var, false);
                            continue;
                        case 22:
                            j1.V(U(i2), (List) unsafe.getObject(t, V), v1Var, false);
                            continue;
                        case j.b3 /* 23 */:
                            j1.S(U(i2), (List) unsafe.getObject(t, V), v1Var, false);
                            continue;
                        case j.c3 /* 24 */:
                            j1.R(U(i2), (List) unsafe.getObject(t, V), v1Var, false);
                            continue;
                        case 25:
                            j1.N(U(i2), (List) unsafe.getObject(t, V), v1Var, false);
                            continue;
                        case 26:
                            j1.c0(U(i2), (List) unsafe.getObject(t, V), v1Var);
                            break;
                        case 27:
                            j1.X(U(i2), (List) unsafe.getObject(t, V), v1Var, v(i2));
                            break;
                        case 28:
                            j1.O(U(i2), (List) unsafe.getObject(t, V), v1Var);
                            break;
                        case j.h3 /* 29 */:
                            j1.d0(U(i2), (List) unsafe.getObject(t, V), v1Var, false);
                            continue;
                        case 30:
                            j1.Q(U(i2), (List) unsafe.getObject(t, V), v1Var, false);
                            continue;
                        case 31:
                            j1.Y(U(i2), (List) unsafe.getObject(t, V), v1Var, false);
                            continue;
                        case 32:
                            j1.Z(U(i2), (List) unsafe.getObject(t, V), v1Var, false);
                            continue;
                        case 33:
                            j1.a0(U(i2), (List) unsafe.getObject(t, V), v1Var, false);
                            continue;
                        case 34:
                            j1.b0(U(i2), (List) unsafe.getObject(t, V), v1Var, false);
                            continue;
                        case 35:
                            j1.P(U(i2), (List) unsafe.getObject(t, V), v1Var, true);
                            break;
                        case 36:
                            j1.T(U(i2), (List) unsafe.getObject(t, V), v1Var, true);
                            break;
                        case 37:
                            j1.W(U(i2), (List) unsafe.getObject(t, V), v1Var, true);
                            break;
                        case 38:
                            j1.e0(U(i2), (List) unsafe.getObject(t, V), v1Var, true);
                            break;
                        case 39:
                            j1.V(U(i2), (List) unsafe.getObject(t, V), v1Var, true);
                            break;
                        case 40:
                            j1.S(U(i2), (List) unsafe.getObject(t, V), v1Var, true);
                            break;
                        case 41:
                            j1.R(U(i2), (List) unsafe.getObject(t, V), v1Var, true);
                            break;
                        case 42:
                            j1.N(U(i2), (List) unsafe.getObject(t, V), v1Var, true);
                            break;
                        case 43:
                            j1.d0(U(i2), (List) unsafe.getObject(t, V), v1Var, true);
                            break;
                        case 44:
                            j1.Q(U(i2), (List) unsafe.getObject(t, V), v1Var, true);
                            break;
                        case 45:
                            j1.Y(U(i2), (List) unsafe.getObject(t, V), v1Var, true);
                            break;
                        case 46:
                            j1.Z(U(i2), (List) unsafe.getObject(t, V), v1Var, true);
                            break;
                        case 47:
                            j1.a0(U(i2), (List) unsafe.getObject(t, V), v1Var, true);
                            break;
                        case 48:
                            j1.b0(U(i2), (List) unsafe.getObject(t, V), v1Var, true);
                            break;
                        case 49:
                            j1.U(U(i2), (List) unsafe.getObject(t, V), v1Var, v(i2));
                            break;
                        case 50:
                            w0(v1Var, U, unsafe.getObject(t, V), i2);
                            break;
                        case 51:
                            if (I(t, U, i2)) {
                                v1Var.E(U, X(t, V));
                                break;
                            }
                            break;
                        case 52:
                            if (I(t, U, i2)) {
                                v1Var.p(U, Y(t, V));
                                break;
                            }
                            break;
                        case 53:
                            if (I(t, U, i2)) {
                                v1Var.f(U, a0(t, V));
                                break;
                            }
                            break;
                        case 54:
                            if (I(t, U, i2)) {
                                v1Var.x(U, a0(t, V));
                                break;
                            }
                            break;
                        case 55:
                            if (I(t, U, i2)) {
                                v1Var.v(U, Z(t, V));
                                break;
                            }
                            break;
                        case 56:
                            if (I(t, U, i2)) {
                                v1Var.j(U, a0(t, V));
                                break;
                            }
                            break;
                        case 57:
                            if (I(t, U, i2)) {
                                v1Var.C(U, Z(t, V));
                                break;
                            }
                            break;
                        case 58:
                            if (I(t, U, i2)) {
                                v1Var.i(U, W(t, V));
                                break;
                            }
                            break;
                        case 59:
                            if (I(t, U, i2)) {
                                x0(U, unsafe.getObject(t, V), v1Var);
                                break;
                            }
                            break;
                        case 60:
                            if (I(t, U, i2)) {
                                v1Var.M(U, unsafe.getObject(t, V), v(i2));
                                break;
                            }
                            break;
                        case 61:
                            if (I(t, U, i2)) {
                                v1Var.a(U, (i) unsafe.getObject(t, V));
                                break;
                            }
                            break;
                        case 62:
                            if (I(t, U, i2)) {
                                v1Var.k(U, Z(t, V));
                                break;
                            }
                            break;
                        case 63:
                            if (I(t, U, i2)) {
                                v1Var.A(U, Z(t, V));
                                break;
                            }
                            break;
                        case 64:
                            if (I(t, U, i2)) {
                                v1Var.r(U, Z(t, V));
                                break;
                            }
                            break;
                        case 65:
                            if (I(t, U, i2)) {
                                v1Var.H(U, a0(t, V));
                                break;
                            }
                            break;
                        case 66:
                            if (I(t, U, i2)) {
                                v1Var.J(U, Z(t, V));
                                break;
                            }
                            break;
                        case 67:
                            if (I(t, U, i2)) {
                                v1Var.o(U, a0(t, V));
                                break;
                            }
                            break;
                        case 68:
                            if (I(t, U, i2)) {
                                v1Var.G(U, unsafe.getObject(t, V), v(i2));
                                break;
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.p.j(v1Var, entry);
                    entry = it.hasNext() ? it.next() : null;
                }
                y0(this.o, t, v1Var);
            }
        }
        it = null;
        entry = null;
        int i42 = -1;
        length = this.a.length;
        Unsafe unsafe2 = s;
        int i52 = 0;
        while (i2 < length) {
        }
        while (entry != null) {
        }
        y0(this.o, t, v1Var);
    }

    private Object u(int i2) {
        return this.b[(i2 / 3) * 2];
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0528  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void u0(T t, v1 v1Var) {
        Map.Entry<?, Object> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        int i2;
        double d2;
        float f2;
        long j2;
        long j3;
        int i3;
        long j4;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        long j5;
        int i8;
        long j6;
        if (this.f2614f) {
            v<?> c = this.p.c(t);
            if (!c.n()) {
                it = c.s();
                entry = it.next();
                length = this.a.length;
                for (i2 = 0; i2 < length; i2 += 3) {
                    int s0 = s0(i2);
                    int U = U(i2);
                    while (entry != null && this.p.a(entry) <= U) {
                        this.p.j(v1Var, entry);
                        entry = it.hasNext() ? it.next() : null;
                    }
                    switch (r0(s0)) {
                        case 0:
                            if (C(t, i2)) {
                                d2 = o(t, V(s0));
                                v1Var.E(U, d2);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (C(t, i2)) {
                                f2 = s(t, V(s0));
                                v1Var.p(U, f2);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (C(t, i2)) {
                                j2 = L(t, V(s0));
                                v1Var.f(U, j2);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (C(t, i2)) {
                                j3 = L(t, V(s0));
                                v1Var.x(U, j3);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (C(t, i2)) {
                                i3 = A(t, V(s0));
                                v1Var.v(U, i3);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (C(t, i2)) {
                                j4 = L(t, V(s0));
                                v1Var.j(U, j4);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (C(t, i2)) {
                                i4 = A(t, V(s0));
                                v1Var.C(U, i4);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (C(t, i2)) {
                                z = l(t, V(s0));
                                v1Var.i(U, z);
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (!C(t, i2)) {
                                break;
                            }
                            x0(U, s1.A(t, V(s0)), v1Var);
                            break;
                        case 9:
                            if (!C(t, i2)) {
                                break;
                            }
                            v1Var.M(U, s1.A(t, V(s0)), v(i2));
                            break;
                        case 10:
                            if (!C(t, i2)) {
                                break;
                            }
                            v1Var.a(U, (i) s1.A(t, V(s0)));
                            break;
                        case 11:
                            if (C(t, i2)) {
                                i5 = A(t, V(s0));
                                v1Var.k(U, i5);
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (C(t, i2)) {
                                i6 = A(t, V(s0));
                                v1Var.A(U, i6);
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (C(t, i2)) {
                                i7 = A(t, V(s0));
                                v1Var.r(U, i7);
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (C(t, i2)) {
                                j5 = L(t, V(s0));
                                v1Var.H(U, j5);
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (C(t, i2)) {
                                i8 = A(t, V(s0));
                                v1Var.J(U, i8);
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (C(t, i2)) {
                                j6 = L(t, V(s0));
                                v1Var.o(U, j6);
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (!C(t, i2)) {
                                break;
                            }
                            v1Var.G(U, s1.A(t, V(s0)), v(i2));
                            break;
                        case 18:
                            j1.P(U(i2), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 19:
                            j1.T(U(i2), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 20:
                            j1.W(U(i2), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 21:
                            j1.e0(U(i2), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 22:
                            j1.V(U(i2), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case j.b3 /* 23 */:
                            j1.S(U(i2), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case j.c3 /* 24 */:
                            j1.R(U(i2), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 25:
                            j1.N(U(i2), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 26:
                            j1.c0(U(i2), (List) s1.A(t, V(s0)), v1Var);
                            break;
                        case 27:
                            j1.X(U(i2), (List) s1.A(t, V(s0)), v1Var, v(i2));
                            break;
                        case 28:
                            j1.O(U(i2), (List) s1.A(t, V(s0)), v1Var);
                            break;
                        case j.h3 /* 29 */:
                            j1.d0(U(i2), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 30:
                            j1.Q(U(i2), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 31:
                            j1.Y(U(i2), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 32:
                            j1.Z(U(i2), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 33:
                            j1.a0(U(i2), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 34:
                            j1.b0(U(i2), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 35:
                            j1.P(U(i2), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 36:
                            j1.T(U(i2), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 37:
                            j1.W(U(i2), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 38:
                            j1.e0(U(i2), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 39:
                            j1.V(U(i2), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 40:
                            j1.S(U(i2), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 41:
                            j1.R(U(i2), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 42:
                            j1.N(U(i2), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 43:
                            j1.d0(U(i2), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 44:
                            j1.Q(U(i2), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 45:
                            j1.Y(U(i2), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 46:
                            j1.Z(U(i2), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 47:
                            j1.a0(U(i2), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 48:
                            j1.b0(U(i2), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 49:
                            j1.U(U(i2), (List) s1.A(t, V(s0)), v1Var, v(i2));
                            break;
                        case 50:
                            w0(v1Var, U, s1.A(t, V(s0)), i2);
                            break;
                        case 51:
                            if (I(t, U, i2)) {
                                d2 = X(t, V(s0));
                                v1Var.E(U, d2);
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (I(t, U, i2)) {
                                f2 = Y(t, V(s0));
                                v1Var.p(U, f2);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (I(t, U, i2)) {
                                j2 = a0(t, V(s0));
                                v1Var.f(U, j2);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (I(t, U, i2)) {
                                j3 = a0(t, V(s0));
                                v1Var.x(U, j3);
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (I(t, U, i2)) {
                                i3 = Z(t, V(s0));
                                v1Var.v(U, i3);
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (I(t, U, i2)) {
                                j4 = a0(t, V(s0));
                                v1Var.j(U, j4);
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (I(t, U, i2)) {
                                i4 = Z(t, V(s0));
                                v1Var.C(U, i4);
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (I(t, U, i2)) {
                                z = W(t, V(s0));
                                v1Var.i(U, z);
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (!I(t, U, i2)) {
                                break;
                            }
                            x0(U, s1.A(t, V(s0)), v1Var);
                            break;
                        case 60:
                            if (!I(t, U, i2)) {
                                break;
                            }
                            v1Var.M(U, s1.A(t, V(s0)), v(i2));
                            break;
                        case 61:
                            if (!I(t, U, i2)) {
                                break;
                            }
                            v1Var.a(U, (i) s1.A(t, V(s0)));
                            break;
                        case 62:
                            if (I(t, U, i2)) {
                                i5 = Z(t, V(s0));
                                v1Var.k(U, i5);
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (I(t, U, i2)) {
                                i6 = Z(t, V(s0));
                                v1Var.A(U, i6);
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (I(t, U, i2)) {
                                i7 = Z(t, V(s0));
                                v1Var.r(U, i7);
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (I(t, U, i2)) {
                                j5 = a0(t, V(s0));
                                v1Var.H(U, j5);
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (I(t, U, i2)) {
                                i8 = Z(t, V(s0));
                                v1Var.J(U, i8);
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (I(t, U, i2)) {
                                j6 = a0(t, V(s0));
                                v1Var.o(U, j6);
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (!I(t, U, i2)) {
                                break;
                            }
                            v1Var.G(U, s1.A(t, V(s0)), v(i2));
                            break;
                    }
                }
                while (entry != null) {
                    this.p.j(v1Var, entry);
                    entry = it.hasNext() ? it.next() : null;
                }
                y0(this.o, t, v1Var);
            }
        }
        it = null;
        entry = null;
        length = this.a.length;
        while (i2 < length) {
        }
        while (entry != null) {
        }
        y0(this.o, t, v1Var);
    }

    private h1 v(int i2) {
        int i3 = (i2 / 3) * 2;
        h1 h1Var = (h1) this.b[i3];
        if (h1Var != null) {
            return h1Var;
        }
        h1<T> d2 = d1.a().d((Class) this.b[i3 + 1]);
        this.b[i3] = d2;
        return d2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x052e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void v0(T t, v1 v1Var) {
        Map.Entry<?, Object> entry;
        Iterator<Map.Entry<?, Object>> it;
        int length;
        double d2;
        float f2;
        long j2;
        long j3;
        int i2;
        long j4;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        long j5;
        int i7;
        long j6;
        y0(this.o, t, v1Var);
        if (this.f2614f) {
            v<?> c = this.p.c(t);
            if (!c.n()) {
                it = c.g();
                entry = it.next();
                for (length = this.a.length - 3; length >= 0; length -= 3) {
                    int s0 = s0(length);
                    int U = U(length);
                    while (entry != null && this.p.a(entry) > U) {
                        this.p.j(v1Var, entry);
                        entry = it.hasNext() ? it.next() : null;
                    }
                    switch (r0(s0)) {
                        case 0:
                            if (C(t, length)) {
                                d2 = o(t, V(s0));
                                v1Var.E(U, d2);
                                break;
                            } else {
                                break;
                            }
                        case 1:
                            if (C(t, length)) {
                                f2 = s(t, V(s0));
                                v1Var.p(U, f2);
                                break;
                            } else {
                                break;
                            }
                        case 2:
                            if (C(t, length)) {
                                j2 = L(t, V(s0));
                                v1Var.f(U, j2);
                                break;
                            } else {
                                break;
                            }
                        case 3:
                            if (C(t, length)) {
                                j3 = L(t, V(s0));
                                v1Var.x(U, j3);
                                break;
                            } else {
                                break;
                            }
                        case 4:
                            if (C(t, length)) {
                                i2 = A(t, V(s0));
                                v1Var.v(U, i2);
                                break;
                            } else {
                                break;
                            }
                        case 5:
                            if (C(t, length)) {
                                j4 = L(t, V(s0));
                                v1Var.j(U, j4);
                                break;
                            } else {
                                break;
                            }
                        case 6:
                            if (C(t, length)) {
                                i3 = A(t, V(s0));
                                v1Var.C(U, i3);
                                break;
                            } else {
                                break;
                            }
                        case 7:
                            if (C(t, length)) {
                                z = l(t, V(s0));
                                v1Var.i(U, z);
                                break;
                            } else {
                                break;
                            }
                        case 8:
                            if (!C(t, length)) {
                                break;
                            }
                            x0(U, s1.A(t, V(s0)), v1Var);
                            break;
                        case 9:
                            if (!C(t, length)) {
                                break;
                            }
                            v1Var.M(U, s1.A(t, V(s0)), v(length));
                            break;
                        case 10:
                            if (!C(t, length)) {
                                break;
                            }
                            v1Var.a(U, (i) s1.A(t, V(s0)));
                            break;
                        case 11:
                            if (C(t, length)) {
                                i4 = A(t, V(s0));
                                v1Var.k(U, i4);
                                break;
                            } else {
                                break;
                            }
                        case 12:
                            if (C(t, length)) {
                                i5 = A(t, V(s0));
                                v1Var.A(U, i5);
                                break;
                            } else {
                                break;
                            }
                        case 13:
                            if (C(t, length)) {
                                i6 = A(t, V(s0));
                                v1Var.r(U, i6);
                                break;
                            } else {
                                break;
                            }
                        case 14:
                            if (C(t, length)) {
                                j5 = L(t, V(s0));
                                v1Var.H(U, j5);
                                break;
                            } else {
                                break;
                            }
                        case 15:
                            if (C(t, length)) {
                                i7 = A(t, V(s0));
                                v1Var.J(U, i7);
                                break;
                            } else {
                                break;
                            }
                        case 16:
                            if (C(t, length)) {
                                j6 = L(t, V(s0));
                                v1Var.o(U, j6);
                                break;
                            } else {
                                break;
                            }
                        case 17:
                            if (!C(t, length)) {
                                break;
                            }
                            v1Var.G(U, s1.A(t, V(s0)), v(length));
                            break;
                        case 18:
                            j1.P(U(length), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 19:
                            j1.T(U(length), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 20:
                            j1.W(U(length), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 21:
                            j1.e0(U(length), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 22:
                            j1.V(U(length), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case j.b3 /* 23 */:
                            j1.S(U(length), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case j.c3 /* 24 */:
                            j1.R(U(length), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 25:
                            j1.N(U(length), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 26:
                            j1.c0(U(length), (List) s1.A(t, V(s0)), v1Var);
                            break;
                        case 27:
                            j1.X(U(length), (List) s1.A(t, V(s0)), v1Var, v(length));
                            break;
                        case 28:
                            j1.O(U(length), (List) s1.A(t, V(s0)), v1Var);
                            break;
                        case j.h3 /* 29 */:
                            j1.d0(U(length), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 30:
                            j1.Q(U(length), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 31:
                            j1.Y(U(length), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 32:
                            j1.Z(U(length), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 33:
                            j1.a0(U(length), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 34:
                            j1.b0(U(length), (List) s1.A(t, V(s0)), v1Var, false);
                            break;
                        case 35:
                            j1.P(U(length), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 36:
                            j1.T(U(length), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 37:
                            j1.W(U(length), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 38:
                            j1.e0(U(length), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 39:
                            j1.V(U(length), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 40:
                            j1.S(U(length), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 41:
                            j1.R(U(length), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 42:
                            j1.N(U(length), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 43:
                            j1.d0(U(length), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 44:
                            j1.Q(U(length), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 45:
                            j1.Y(U(length), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 46:
                            j1.Z(U(length), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 47:
                            j1.a0(U(length), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 48:
                            j1.b0(U(length), (List) s1.A(t, V(s0)), v1Var, true);
                            break;
                        case 49:
                            j1.U(U(length), (List) s1.A(t, V(s0)), v1Var, v(length));
                            break;
                        case 50:
                            w0(v1Var, U, s1.A(t, V(s0)), length);
                            break;
                        case 51:
                            if (I(t, U, length)) {
                                d2 = X(t, V(s0));
                                v1Var.E(U, d2);
                                break;
                            } else {
                                break;
                            }
                        case 52:
                            if (I(t, U, length)) {
                                f2 = Y(t, V(s0));
                                v1Var.p(U, f2);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            if (I(t, U, length)) {
                                j2 = a0(t, V(s0));
                                v1Var.f(U, j2);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            if (I(t, U, length)) {
                                j3 = a0(t, V(s0));
                                v1Var.x(U, j3);
                                break;
                            } else {
                                break;
                            }
                        case 55:
                            if (I(t, U, length)) {
                                i2 = Z(t, V(s0));
                                v1Var.v(U, i2);
                                break;
                            } else {
                                break;
                            }
                        case 56:
                            if (I(t, U, length)) {
                                j4 = a0(t, V(s0));
                                v1Var.j(U, j4);
                                break;
                            } else {
                                break;
                            }
                        case 57:
                            if (I(t, U, length)) {
                                i3 = Z(t, V(s0));
                                v1Var.C(U, i3);
                                break;
                            } else {
                                break;
                            }
                        case 58:
                            if (I(t, U, length)) {
                                z = W(t, V(s0));
                                v1Var.i(U, z);
                                break;
                            } else {
                                break;
                            }
                        case 59:
                            if (!I(t, U, length)) {
                                break;
                            }
                            x0(U, s1.A(t, V(s0)), v1Var);
                            break;
                        case 60:
                            if (!I(t, U, length)) {
                                break;
                            }
                            v1Var.M(U, s1.A(t, V(s0)), v(length));
                            break;
                        case 61:
                            if (!I(t, U, length)) {
                                break;
                            }
                            v1Var.a(U, (i) s1.A(t, V(s0)));
                            break;
                        case 62:
                            if (I(t, U, length)) {
                                i4 = Z(t, V(s0));
                                v1Var.k(U, i4);
                                break;
                            } else {
                                break;
                            }
                        case 63:
                            if (I(t, U, length)) {
                                i5 = Z(t, V(s0));
                                v1Var.A(U, i5);
                                break;
                            } else {
                                break;
                            }
                        case 64:
                            if (I(t, U, length)) {
                                i6 = Z(t, V(s0));
                                v1Var.r(U, i6);
                                break;
                            } else {
                                break;
                            }
                        case 65:
                            if (I(t, U, length)) {
                                j5 = a0(t, V(s0));
                                v1Var.H(U, j5);
                                break;
                            } else {
                                break;
                            }
                        case 66:
                            if (I(t, U, length)) {
                                i7 = Z(t, V(s0));
                                v1Var.J(U, i7);
                                break;
                            } else {
                                break;
                            }
                        case 67:
                            if (I(t, U, length)) {
                                j6 = a0(t, V(s0));
                                v1Var.o(U, j6);
                                break;
                            } else {
                                break;
                            }
                        case 68:
                            if (!I(t, U, length)) {
                                break;
                            }
                            v1Var.G(U, s1.A(t, V(s0)), v(length));
                            break;
                    }
                }
                while (entry != null) {
                    this.p.j(v1Var, entry);
                    entry = it.hasNext() ? it.next() : null;
                }
            }
        }
        it = null;
        entry = null;
        while (length >= 0) {
        }
        while (entry != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static p1 w(Object obj) {
        z zVar = (z) obj;
        p1 p1Var = zVar.unknownFields;
        if (p1Var != p1.e()) {
            return p1Var;
        }
        p1 l = p1.l();
        zVar.unknownFields = l;
        return l;
    }

    private <K, V> void w0(v1 v1Var, int i2, Object obj, int i3) {
        if (obj != null) {
            v1Var.g(i2, this.q.h(u(i3)), this.q.b(obj));
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e0, code lost:
        if (r17.f2617i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f2, code lost:
        if (r17.f2617i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0203, code lost:
        if (r17.f2617i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0214, code lost:
        if (r17.f2617i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0225, code lost:
        if (r17.f2617i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0236, code lost:
        if (r17.f2617i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0247, code lost:
        if (r17.f2617i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0258, code lost:
        if (r17.f2617i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x025a, code lost:
        r2.putInt(r18, r11, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x025e, code lost:
        r4 = (f.b.b.a.z.a.l.U(r9) + f.b.b.a.z.a.l.W(r3)) + r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x030f, code lost:
        if ((r7 & r14) != 0) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0311, code lost:
        r3 = f.b.b.a.z.a.l.s(r9, (f.b.b.a.z.a.s0) r2.getObject(r18, r12), v(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x033c, code lost:
        if ((r7 & r14) != 0) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x033e, code lost:
        r3 = f.b.b.a.z.a.l.M(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0345, code lost:
        if ((r7 & r14) != 0) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0347, code lost:
        r4 = f.b.b.a.z.a.l.K(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x036a, code lost:
        if ((r7 & r14) != 0) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x036c, code lost:
        r3 = f.b.b.a.z.a.l.g(r9, (f.b.b.a.z.a.i) r2.getObject(r18, r12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0379, code lost:
        if ((r7 & r14) != 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x037b, code lost:
        r3 = f.b.b.a.z.a.j1.o(r9, r2.getObject(r18, r12), v(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x03a6, code lost:
        if ((r7 & r14) != 0) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x03a8, code lost:
        r3 = f.b.b.a.z.a.l.d(r9, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (I(r18, r9, r5) != false) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0089, code lost:
        if (I(r18, r9, r5) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0091, code lost:
        if (I(r18, r9, r5) != false) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b1, code lost:
        if (I(r18, r9, r5) != false) goto L176;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b9, code lost:
        if (I(r18, r9, r5) != false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
        if (I(r18, r9, r5) != false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0174, code lost:
        if (r17.f2617i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0186, code lost:
        if (r17.f2617i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0198, code lost:
        if (r17.f2617i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01aa, code lost:
        if (r17.f2617i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bc, code lost:
        if (r17.f2617i != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01ce, code lost:
        if (r17.f2617i != false) goto L131;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int x(T t) {
        int i2;
        int i3;
        int i4;
        int d2;
        int i5;
        int i6;
        int i7;
        long j2;
        int i8;
        Unsafe unsafe = s;
        int i9 = -1;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < this.a.length) {
            int s0 = s0(i10);
            int U = U(i10);
            int r0 = r0(s0);
            if (r0 <= 17) {
                i3 = this.a[i10 + 2];
                int i13 = 1048575 & i3;
                i2 = 1 << (i3 >>> 20);
                if (i13 != i9) {
                    i12 = unsafe.getInt(t, i13);
                    i9 = i13;
                }
            } else {
                i3 = (!this.f2617i || r0 < w.DOUBLE_LIST_PACKED.a() || r0 > w.SINT64_LIST_PACKED.a()) ? 0 : this.a[i10 + 2] & 1048575;
                i2 = 0;
            }
            long V = V(s0);
            i9 = i9;
            switch (r0) {
                case 0:
                    if ((i12 & i2) == 0) {
                        break;
                    } else {
                        i4 = l.i(U, 0.0d);
                        i11 += i4;
                        break;
                    }
                case 1:
                    if ((i12 & i2) == 0) {
                        break;
                    } else {
                        i4 = l.q(U, 0.0f);
                        i11 += i4;
                        break;
                    }
                case 2:
                    if ((i12 & i2) == 0) {
                        break;
                    } else {
                        i4 = l.x(U, unsafe.getLong(t, V));
                        i11 += i4;
                        break;
                    }
                case 3:
                    if ((i12 & i2) == 0) {
                        break;
                    } else {
                        i4 = l.X(U, unsafe.getLong(t, V));
                        i11 += i4;
                        break;
                    }
                case 4:
                    if ((i12 & i2) == 0) {
                        break;
                    } else {
                        i4 = l.v(U, unsafe.getInt(t, V));
                        i11 += i4;
                        break;
                    }
                case 5:
                    if ((i12 & i2) == 0) {
                        break;
                    } else {
                        i4 = l.o(U, 0L);
                        i11 += i4;
                        break;
                    }
                case 6:
                    if ((i12 & i2) != 0) {
                        i4 = l.m(U, 0);
                        i11 += i4;
                        break;
                    }
                    break;
                case 8:
                    if ((i12 & i2) != 0) {
                        Object object = unsafe.getObject(t, V);
                        d2 = object instanceof i ? l.g(U, (i) object) : l.S(U, (String) object);
                        i11 += d2;
                    }
                    break;
                case 11:
                    if ((i12 & i2) != 0) {
                        i5 = unsafe.getInt(t, V);
                        d2 = l.V(U, i5);
                        i11 += d2;
                    }
                    break;
                case 12:
                    if ((i12 & i2) != 0) {
                        i6 = unsafe.getInt(t, V);
                        d2 = l.k(U, i6);
                        i11 += d2;
                    }
                    break;
                case 15:
                    if ((i12 & i2) != 0) {
                        i7 = unsafe.getInt(t, V);
                        d2 = l.O(U, i7);
                        i11 += d2;
                    }
                    break;
                case 16:
                    if ((i12 & i2) != 0) {
                        j2 = unsafe.getLong(t, V);
                        d2 = l.Q(U, j2);
                        i11 += d2;
                    }
                    break;
                case 18:
                case j.b3 /* 23 */:
                case 32:
                    d2 = j1.h(U, (List) unsafe.getObject(t, V), false);
                    i11 += d2;
                    break;
                case 19:
                case j.c3 /* 24 */:
                case 31:
                    d2 = j1.f(U, (List) unsafe.getObject(t, V), false);
                    i11 += d2;
                    break;
                case 20:
                    d2 = j1.m(U, (List) unsafe.getObject(t, V), false);
                    i11 += d2;
                    break;
                case 21:
                    d2 = j1.x(U, (List) unsafe.getObject(t, V), false);
                    i11 += d2;
                    break;
                case 22:
                    d2 = j1.k(U, (List) unsafe.getObject(t, V), false);
                    i11 += d2;
                    break;
                case 25:
                    d2 = j1.a(U, (List) unsafe.getObject(t, V), false);
                    i11 += d2;
                    break;
                case 26:
                    d2 = j1.u(U, (List) unsafe.getObject(t, V));
                    i11 += d2;
                    break;
                case 27:
                    d2 = j1.p(U, (List) unsafe.getObject(t, V), v(i10));
                    i11 += d2;
                    break;
                case 28:
                    d2 = j1.c(U, (List) unsafe.getObject(t, V));
                    i11 += d2;
                    break;
                case j.h3 /* 29 */:
                    d2 = j1.v(U, (List) unsafe.getObject(t, V), false);
                    i11 += d2;
                    break;
                case 30:
                    d2 = j1.d(U, (List) unsafe.getObject(t, V), false);
                    i11 += d2;
                    break;
                case 33:
                    d2 = j1.q(U, (List) unsafe.getObject(t, V), false);
                    i11 += d2;
                    break;
                case 34:
                    d2 = j1.s(U, (List) unsafe.getObject(t, V), false);
                    i11 += d2;
                    break;
                case 35:
                    i8 = j1.i((List) unsafe.getObject(t, V));
                    if (i8 > 0) {
                        break;
                    }
                    break;
                case 36:
                    i8 = j1.g((List) unsafe.getObject(t, V));
                    if (i8 > 0) {
                        break;
                    }
                    break;
                case 37:
                    i8 = j1.n((List) unsafe.getObject(t, V));
                    if (i8 > 0) {
                        break;
                    }
                    break;
                case 38:
                    i8 = j1.y((List) unsafe.getObject(t, V));
                    if (i8 > 0) {
                        break;
                    }
                    break;
                case 39:
                    i8 = j1.l((List) unsafe.getObject(t, V));
                    if (i8 > 0) {
                        break;
                    }
                    break;
                case 40:
                    i8 = j1.i((List) unsafe.getObject(t, V));
                    if (i8 > 0) {
                        break;
                    }
                    break;
                case 41:
                    i8 = j1.g((List) unsafe.getObject(t, V));
                    if (i8 > 0) {
                        break;
                    }
                    break;
                case 42:
                    i8 = j1.b((List) unsafe.getObject(t, V));
                    if (i8 > 0) {
                        break;
                    }
                    break;
                case 43:
                    i8 = j1.w((List) unsafe.getObject(t, V));
                    if (i8 > 0) {
                        break;
                    }
                    break;
                case 44:
                    i8 = j1.e((List) unsafe.getObject(t, V));
                    if (i8 > 0) {
                        break;
                    }
                    break;
                case 45:
                    i8 = j1.g((List) unsafe.getObject(t, V));
                    if (i8 > 0) {
                        break;
                    }
                    break;
                case 46:
                    i8 = j1.i((List) unsafe.getObject(t, V));
                    if (i8 > 0) {
                        break;
                    }
                    break;
                case 47:
                    i8 = j1.r((List) unsafe.getObject(t, V));
                    if (i8 > 0) {
                        break;
                    }
                    break;
                case 48:
                    i8 = j1.t((List) unsafe.getObject(t, V));
                    if (i8 > 0) {
                        break;
                    }
                    break;
                case 49:
                    d2 = j1.j(U, (List) unsafe.getObject(t, V), v(i10));
                    i11 += d2;
                    break;
                case 50:
                    d2 = this.q.d(U, unsafe.getObject(t, V), u(i10));
                    i11 += d2;
                    break;
                case 51:
                    if (I(t, U, i10)) {
                        d2 = l.i(U, 0.0d);
                        i11 += d2;
                    }
                    break;
                case 52:
                    if (I(t, U, i10)) {
                        d2 = l.q(U, 0.0f);
                        i11 += d2;
                    }
                    break;
                case 53:
                    if (I(t, U, i10)) {
                        d2 = l.x(U, a0(t, V));
                        i11 += d2;
                    }
                    break;
                case 54:
                    if (I(t, U, i10)) {
                        d2 = l.X(U, a0(t, V));
                        i11 += d2;
                    }
                    break;
                case 55:
                    if (I(t, U, i10)) {
                        d2 = l.v(U, Z(t, V));
                        i11 += d2;
                    }
                    break;
                case 56:
                    if (I(t, U, i10)) {
                        d2 = l.o(U, 0L);
                        i11 += d2;
                    }
                    break;
                case 57:
                    if (I(t, U, i10)) {
                        int i14 = l.m(U, 0);
                        i11 += i14;
                    }
                    break;
                case 59:
                    if (I(t, U, i10)) {
                        Object object2 = unsafe.getObject(t, V);
                        d2 = object2 instanceof i ? l.g(U, (i) object2) : l.S(U, (String) object2);
                        i11 += d2;
                    }
                    break;
                case 62:
                    if (I(t, U, i10)) {
                        i5 = Z(t, V);
                        d2 = l.V(U, i5);
                        i11 += d2;
                    }
                    break;
                case 63:
                    if (I(t, U, i10)) {
                        i6 = Z(t, V);
                        d2 = l.k(U, i6);
                        i11 += d2;
                    }
                    break;
                case 66:
                    if (I(t, U, i10)) {
                        i7 = Z(t, V);
                        d2 = l.O(U, i7);
                        i11 += d2;
                    }
                    break;
                case 67:
                    if (I(t, U, i10)) {
                        j2 = a0(t, V);
                        d2 = l.Q(U, j2);
                        i11 += d2;
                    }
                    break;
            }
            i10 += 3;
        }
        int z = i11 + z(this.o, t);
        return this.f2614f ? z + this.p.c(t).l() : z;
    }

    private void x0(int i2, Object obj, v1 v1Var) {
        if (obj instanceof String) {
            v1Var.u(i2, (String) obj);
        } else {
            v1Var.a(i2, (i) obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01ca, code lost:
        if (r15.f2617i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01db, code lost:
        if (r15.f2617i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ec, code lost:
        if (r15.f2617i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01fd, code lost:
        if (r15.f2617i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x020e, code lost:
        if (r15.f2617i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0210, code lost:
        r2.putInt(r16, r6, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0214, code lost:
        r6 = (f.b.b.a.z.a.l.U(r8) + f.b.b.a.z.a.l.W(r7)) + r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0334, code lost:
        if ((r6 instanceof f.b.b.a.z.a.i) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
        if ((r6 instanceof f.b.b.a.z.a.i) != false) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00aa, code lost:
        r6 = f.b.b.a.z.a.l.S(r8, (java.lang.String) r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012a, code lost:
        if (r15.f2617i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013c, code lost:
        if (r15.f2617i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014e, code lost:
        if (r15.f2617i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0160, code lost:
        if (r15.f2617i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0172, code lost:
        if (r15.f2617i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0184, code lost:
        if (r15.f2617i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0196, code lost:
        if (r15.f2617i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01a8, code lost:
        if (r15.f2617i != false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01b9, code lost:
        if (r15.f2617i != false) goto L117;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int y(T t) {
        int i2;
        long j2;
        long j3;
        int i3;
        Object A;
        int i4;
        int i5;
        int i6;
        long j4;
        int i7;
        Unsafe unsafe = s;
        int i8 = 0;
        for (int i9 = 0; i9 < this.a.length; i9 += 3) {
            int s0 = s0(i9);
            int r0 = r0(s0);
            int U = U(i9);
            long V = V(s0);
            int i10 = (r0 < w.DOUBLE_LIST_PACKED.a() || r0 > w.SINT64_LIST_PACKED.a()) ? 0 : this.a[i9 + 2] & 1048575;
            switch (r0) {
                case 0:
                    if (!C(t, i9)) {
                        continue;
                    }
                    i2 = l.i(U, 0.0d);
                    break;
                case 1:
                    if (!C(t, i9)) {
                        continue;
                    }
                    i2 = l.q(U, 0.0f);
                    break;
                case 2:
                    if (C(t, i9)) {
                        j2 = s1.y(t, V);
                        i2 = l.x(U, j2);
                        break;
                    } else {
                        continue;
                    }
                case 3:
                    if (C(t, i9)) {
                        j3 = s1.y(t, V);
                        i2 = l.X(U, j3);
                        break;
                    } else {
                        continue;
                    }
                case 4:
                    if (C(t, i9)) {
                        i3 = s1.x(t, V);
                        i2 = l.v(U, i3);
                        break;
                    } else {
                        continue;
                    }
                case 5:
                    if (!C(t, i9)) {
                        continue;
                    }
                    i2 = l.o(U, 0L);
                    break;
                case 6:
                    if (!C(t, i9)) {
                        continue;
                    }
                    i2 = l.m(U, 0);
                    break;
                case 7:
                    if (!C(t, i9)) {
                        continue;
                    }
                    i2 = l.d(U, true);
                    break;
                case 8:
                    if (C(t, i9)) {
                        A = s1.A(t, V);
                        break;
                    } else {
                        continue;
                    }
                case 9:
                    if (!C(t, i9)) {
                        continue;
                    }
                    i2 = j1.o(U, s1.A(t, V), v(i9));
                    break;
                case 10:
                    if (!C(t, i9)) {
                        continue;
                    }
                    A = s1.A(t, V);
                    i2 = l.g(U, (i) A);
                    break;
                case 11:
                    if (C(t, i9)) {
                        i4 = s1.x(t, V);
                        i2 = l.V(U, i4);
                        break;
                    } else {
                        continue;
                    }
                case 12:
                    if (C(t, i9)) {
                        i5 = s1.x(t, V);
                        i2 = l.k(U, i5);
                        break;
                    } else {
                        continue;
                    }
                case 13:
                    if (!C(t, i9)) {
                        continue;
                    }
                    i2 = l.K(U, 0);
                    break;
                case 14:
                    if (!C(t, i9)) {
                        continue;
                    }
                    i2 = l.M(U, 0L);
                    break;
                case 15:
                    if (C(t, i9)) {
                        i6 = s1.x(t, V);
                        i2 = l.O(U, i6);
                        break;
                    } else {
                        continue;
                    }
                case 16:
                    if (C(t, i9)) {
                        j4 = s1.y(t, V);
                        i2 = l.Q(U, j4);
                        break;
                    } else {
                        continue;
                    }
                case 17:
                    if (!C(t, i9)) {
                        continue;
                    }
                    i2 = l.s(U, (s0) s1.A(t, V), v(i9));
                    break;
                case 18:
                case j.b3 /* 23 */:
                case 32:
                    i2 = j1.h(U, K(t, V), false);
                    break;
                case 19:
                case j.c3 /* 24 */:
                case 31:
                    i2 = j1.f(U, K(t, V), false);
                    break;
                case 20:
                    i2 = j1.m(U, K(t, V), false);
                    break;
                case 21:
                    i2 = j1.x(U, K(t, V), false);
                    break;
                case 22:
                    i2 = j1.k(U, K(t, V), false);
                    break;
                case 25:
                    i2 = j1.a(U, K(t, V), false);
                    break;
                case 26:
                    i2 = j1.u(U, K(t, V));
                    break;
                case 27:
                    i2 = j1.p(U, K(t, V), v(i9));
                    break;
                case 28:
                    i2 = j1.c(U, K(t, V));
                    break;
                case j.h3 /* 29 */:
                    i2 = j1.v(U, K(t, V), false);
                    break;
                case 30:
                    i2 = j1.d(U, K(t, V), false);
                    break;
                case 33:
                    i2 = j1.q(U, K(t, V), false);
                    break;
                case 34:
                    i2 = j1.s(U, K(t, V), false);
                    break;
                case 35:
                    i7 = j1.i((List) unsafe.getObject(t, V));
                    if (i7 > 0) {
                        break;
                    } else {
                        continue;
                    }
                case 36:
                    i7 = j1.g((List) unsafe.getObject(t, V));
                    if (i7 > 0) {
                        break;
                    } else {
                        continue;
                    }
                case 37:
                    i7 = j1.n((List) unsafe.getObject(t, V));
                    if (i7 > 0) {
                        break;
                    } else {
                        continue;
                    }
                case 38:
                    i7 = j1.y((List) unsafe.getObject(t, V));
                    if (i7 > 0) {
                        break;
                    } else {
                        continue;
                    }
                case 39:
                    i7 = j1.l((List) unsafe.getObject(t, V));
                    if (i7 > 0) {
                        break;
                    } else {
                        continue;
                    }
                case 40:
                    i7 = j1.i((List) unsafe.getObject(t, V));
                    if (i7 > 0) {
                        break;
                    } else {
                        continue;
                    }
                case 41:
                    i7 = j1.g((List) unsafe.getObject(t, V));
                    if (i7 > 0) {
                        break;
                    } else {
                        continue;
                    }
                case 42:
                    i7 = j1.b((List) unsafe.getObject(t, V));
                    if (i7 > 0) {
                        break;
                    } else {
                        continue;
                    }
                case 43:
                    i7 = j1.w((List) unsafe.getObject(t, V));
                    if (i7 > 0) {
                        break;
                    } else {
                        continue;
                    }
                case 44:
                    i7 = j1.e((List) unsafe.getObject(t, V));
                    if (i7 > 0) {
                        break;
                    } else {
                        continue;
                    }
                case 45:
                    i7 = j1.g((List) unsafe.getObject(t, V));
                    if (i7 > 0) {
                        break;
                    } else {
                        continue;
                    }
                case 46:
                    i7 = j1.i((List) unsafe.getObject(t, V));
                    if (i7 > 0) {
                        break;
                    } else {
                        continue;
                    }
                case 47:
                    i7 = j1.r((List) unsafe.getObject(t, V));
                    if (i7 > 0) {
                        break;
                    } else {
                        continue;
                    }
                case 48:
                    i7 = j1.t((List) unsafe.getObject(t, V));
                    if (i7 > 0) {
                        break;
                    } else {
                        continue;
                    }
                case 49:
                    i2 = j1.j(U, K(t, V), v(i9));
                    break;
                case 50:
                    i2 = this.q.d(U, s1.A(t, V), u(i9));
                    break;
                case 51:
                    if (!I(t, U, i9)) {
                        continue;
                    }
                    i2 = l.i(U, 0.0d);
                    break;
                case 52:
                    if (!I(t, U, i9)) {
                        continue;
                    }
                    i2 = l.q(U, 0.0f);
                    break;
                case 53:
                    if (I(t, U, i9)) {
                        j2 = a0(t, V);
                        i2 = l.x(U, j2);
                        break;
                    } else {
                        continue;
                    }
                case 54:
                    if (I(t, U, i9)) {
                        j3 = a0(t, V);
                        i2 = l.X(U, j3);
                        break;
                    } else {
                        continue;
                    }
                case 55:
                    if (I(t, U, i9)) {
                        i3 = Z(t, V);
                        i2 = l.v(U, i3);
                        break;
                    } else {
                        continue;
                    }
                case 56:
                    if (!I(t, U, i9)) {
                        continue;
                    }
                    i2 = l.o(U, 0L);
                    break;
                case 57:
                    if (!I(t, U, i9)) {
                        continue;
                    }
                    i2 = l.m(U, 0);
                    break;
                case 58:
                    if (!I(t, U, i9)) {
                        continue;
                    }
                    i2 = l.d(U, true);
                    break;
                case 59:
                    if (I(t, U, i9)) {
                        A = s1.A(t, V);
                        break;
                    } else {
                        continue;
                    }
                case 60:
                    if (!I(t, U, i9)) {
                        continue;
                    }
                    i2 = j1.o(U, s1.A(t, V), v(i9));
                    break;
                case 61:
                    if (!I(t, U, i9)) {
                        continue;
                    }
                    A = s1.A(t, V);
                    i2 = l.g(U, (i) A);
                    break;
                case 62:
                    if (I(t, U, i9)) {
                        i4 = Z(t, V);
                        i2 = l.V(U, i4);
                        break;
                    } else {
                        continue;
                    }
                case 63:
                    if (I(t, U, i9)) {
                        i5 = Z(t, V);
                        i2 = l.k(U, i5);
                        break;
                    } else {
                        continue;
                    }
                case 64:
                    if (!I(t, U, i9)) {
                        continue;
                    }
                    i2 = l.K(U, 0);
                    break;
                case 65:
                    if (!I(t, U, i9)) {
                        continue;
                    }
                    i2 = l.M(U, 0L);
                    break;
                case 66:
                    if (I(t, U, i9)) {
                        i6 = Z(t, V);
                        i2 = l.O(U, i6);
                        break;
                    } else {
                        continue;
                    }
                case 67:
                    if (I(t, U, i9)) {
                        j4 = a0(t, V);
                        i2 = l.Q(U, j4);
                        break;
                    } else {
                        continue;
                    }
                case 68:
                    if (!I(t, U, i9)) {
                        continue;
                    }
                    i2 = l.s(U, (s0) s1.A(t, V), v(i9));
                    break;
                default:
            }
            i8 += i2;
        }
        return i8 + z(this.o, t);
    }

    private <UT, UB> void y0(o1<UT, UB> o1Var, T t, v1 v1Var) {
        o1Var.t(o1Var.g(t), v1Var);
    }

    private <UT, UB> int z(o1<UT, UB> o1Var, T t) {
        return o1Var.h(o1Var.g(t));
    }

    @Override // f.b.b.a.z.a.h1
    public void a(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i2 = 0; i2 < this.a.length; i2 += 3) {
            Q(t, t2, i2);
        }
        j1.G(this.o, t, t2);
        if (this.f2614f) {
            j1.E(this.p, t, t2);
        }
    }

    @Override // f.b.b.a.z.a.h1
    public final boolean b(T t) {
        int i2;
        int i3 = -1;
        int i4 = 0;
        for (int i5 = 0; i5 < this.f2619k; i5++) {
            int i6 = this.f2618j[i5];
            int U = U(i6);
            int s0 = s0(i6);
            if (!this.f2616h) {
                int i7 = this.a[i6 + 2];
                int i8 = 1048575 & i7;
                i2 = 1 << (i7 >>> 20);
                if (i8 != i3) {
                    i4 = s.getInt(t, i8);
                    i3 = i8;
                }
            } else {
                i2 = 0;
            }
            if (J(s0) && !D(t, i6, i4, i2)) {
                return false;
            }
            int r0 = r0(s0);
            if (r0 != 9 && r0 != 17) {
                if (r0 != 27) {
                    if (r0 == 60 || r0 == 68) {
                        if (I(t, U, i6) && !E(t, s0, v(i6))) {
                            return false;
                        }
                    } else if (r0 != 49) {
                        if (r0 == 50 && !G(t, s0, i6)) {
                            return false;
                        }
                    }
                }
                if (!F(t, s0, i6)) {
                    return false;
                }
            } else if (D(t, i6, i4, i2) && !E(t, s0, v(i6))) {
                return false;
            }
        }
        return !this.f2614f || this.p.c(t).p();
    }

    @Override // f.b.b.a.z.a.h1
    public boolean c(T t, T t2) {
        int length = this.a.length;
        for (int i2 = 0; i2 < length; i2 += 3) {
            if (!p(t, t2, i2)) {
                return false;
            }
        }
        if (!this.o.g(t).equals(this.o.g(t2))) {
            return false;
        }
        if (this.f2614f) {
            return this.p.c(t).equals(this.p.c(t2));
        }
        return true;
    }

    @Override // f.b.b.a.z.a.h1
    public void d(T t, byte[] bArr, int i2, int i3, e.b bVar) {
        if (this.f2616h) {
            e0(t, bArr, i2, i3, bVar);
        } else {
            d0(t, bArr, i2, i3, 0, bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x032c, code lost:
        if (r0 != r11) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x032e, code lost:
        r15 = r29;
        r14 = r30;
        r12 = r31;
        r13 = r33;
        r11 = r34;
        r9 = r35;
        r1 = r17;
        r3 = r18;
        r7 = r19;
        r2 = r20;
        r6 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0375, code lost:
        if (r0 != r15) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0396, code lost:
        if (r0 != r15) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0399, code lost:
        r2 = r0;
        r8 = r18;
        r0 = r34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int d0(T t, byte[] bArr, int i2, int i3, int i4, e.b bVar) {
        Unsafe unsafe;
        int i5;
        v0<T> v0Var;
        T t2;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        long j2;
        int i20;
        int L;
        long j3;
        int i21;
        long j4;
        Object obj;
        long j5;
        int i22;
        v0<T> v0Var2 = this;
        T t3 = t;
        byte[] bArr2 = bArr;
        int i23 = i3;
        int i24 = i4;
        e.b bVar2 = bVar;
        Unsafe unsafe2 = s;
        int i25 = i2;
        int i26 = -1;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        while (true) {
            if (i25 < i23) {
                int i31 = i25 + 1;
                byte b = bArr2[i25];
                if (b < 0) {
                    i7 = e.H(b, bArr2, i31, bVar2);
                    i6 = bVar2.a;
                } else {
                    i6 = b;
                    i7 = i31;
                }
                int i32 = i6 >>> 3;
                int i33 = i6 & 7;
                int h0 = i32 > i26 ? v0Var2.h0(i32, i27 / 3) : v0Var2.g0(i32);
                if (h0 == -1) {
                    i8 = i32;
                    i9 = i7;
                    i10 = i6;
                    i11 = i29;
                    i12 = i30;
                    unsafe = unsafe2;
                    i13 = i24;
                    i14 = 0;
                } else {
                    int i34 = v0Var2.a[h0 + 1];
                    int r0 = r0(i34);
                    long V = V(i34);
                    int i35 = i6;
                    if (r0 <= 17) {
                        int i36 = v0Var2.a[h0 + 2];
                        int i37 = 1 << (i36 >>> 20);
                        int i38 = i36 & 1048575;
                        if (i38 != i30) {
                            i17 = h0;
                            if (i30 != -1) {
                                unsafe2.putInt(t3, i30, i29);
                            }
                            i29 = unsafe2.getInt(t3, i38);
                            i30 = i38;
                        } else {
                            i17 = h0;
                        }
                        switch (r0) {
                            case 0:
                                i18 = i17;
                                i19 = i35;
                                i8 = i32;
                                bArr2 = bArr;
                                i20 = i7;
                                if (i33 == 1) {
                                    s1.K(t3, V, e.d(bArr2, i20));
                                    i25 = i20 + 8;
                                    i29 |= i37;
                                    i24 = i4;
                                    i27 = i18;
                                    i28 = i19;
                                    i26 = i8;
                                    break;
                                } else {
                                    i13 = i4;
                                    i11 = i29;
                                    i12 = i30;
                                    i14 = i18;
                                    unsafe = unsafe2;
                                    i9 = i20;
                                    i10 = i19;
                                    break;
                                }
                            case 1:
                                i18 = i17;
                                i19 = i35;
                                i8 = i32;
                                bArr2 = bArr;
                                i20 = i7;
                                if (i33 == 5) {
                                    s1.L(t3, V, e.l(bArr2, i20));
                                    i25 = i20 + 4;
                                    i29 |= i37;
                                    i24 = i4;
                                    i27 = i18;
                                    i28 = i19;
                                    i26 = i8;
                                    break;
                                } else {
                                    i13 = i4;
                                    i11 = i29;
                                    i12 = i30;
                                    i14 = i18;
                                    unsafe = unsafe2;
                                    i9 = i20;
                                    i10 = i19;
                                    break;
                                }
                            case 2:
                            case 3:
                                i18 = i17;
                                i19 = i35;
                                i8 = i32;
                                j2 = V;
                                bArr2 = bArr;
                                i20 = i7;
                                if (i33 != 0) {
                                    i13 = i4;
                                    i11 = i29;
                                    i12 = i30;
                                    i14 = i18;
                                    unsafe = unsafe2;
                                    i9 = i20;
                                    i10 = i19;
                                    break;
                                } else {
                                    L = e.L(bArr2, i20, bVar2);
                                    j3 = bVar2.b;
                                    unsafe2.putLong(t, j2, j3);
                                    i29 |= i37;
                                    i27 = i18;
                                    i25 = L;
                                    i28 = i19;
                                    i26 = i8;
                                    i23 = i3;
                                    i24 = i4;
                                }
                            case 4:
                            case 11:
                                i18 = i17;
                                i19 = i35;
                                i8 = i32;
                                j5 = V;
                                bArr2 = bArr;
                                i20 = i7;
                                if (i33 == 0) {
                                    i25 = e.I(bArr2, i20, bVar2);
                                    i22 = bVar2.a;
                                    unsafe2.putInt(t3, j5, i22);
                                    i29 |= i37;
                                    i24 = i4;
                                    i27 = i18;
                                    i28 = i19;
                                    i26 = i8;
                                    break;
                                } else {
                                    i13 = i4;
                                    i11 = i29;
                                    i12 = i30;
                                    i14 = i18;
                                    unsafe = unsafe2;
                                    i9 = i20;
                                    i10 = i19;
                                    break;
                                }
                            case 5:
                            case 14:
                                i18 = i17;
                                i19 = i35;
                                i8 = i32;
                                bArr2 = bArr;
                                if (i33 == 1) {
                                    i20 = i7;
                                    unsafe2.putLong(t, V, e.j(bArr2, i7));
                                    i25 = i20 + 8;
                                    i29 |= i37;
                                    i24 = i4;
                                    i27 = i18;
                                    i28 = i19;
                                    i26 = i8;
                                    break;
                                } else {
                                    i20 = i7;
                                    i13 = i4;
                                    i11 = i29;
                                    i12 = i30;
                                    i14 = i18;
                                    unsafe = unsafe2;
                                    i9 = i20;
                                    i10 = i19;
                                    break;
                                }
                            case 6:
                            case 13:
                                i18 = i17;
                                i19 = i35;
                                i8 = i32;
                                bArr2 = bArr;
                                i21 = i3;
                                if (i33 != 5) {
                                    i20 = i7;
                                    i13 = i4;
                                    i11 = i29;
                                    i12 = i30;
                                    i14 = i18;
                                    unsafe = unsafe2;
                                    i9 = i20;
                                    i10 = i19;
                                    break;
                                } else {
                                    unsafe2.putInt(t3, V, e.h(bArr2, i7));
                                    i25 = i7 + 4;
                                    i29 |= i37;
                                    i27 = i18;
                                    i28 = i19;
                                    i26 = i8;
                                    i23 = i21;
                                    i24 = i4;
                                }
                            case 7:
                                i18 = i17;
                                i19 = i35;
                                i8 = i32;
                                bArr2 = bArr;
                                i21 = i3;
                                if (i33 != 0) {
                                    i20 = i7;
                                    i13 = i4;
                                    i11 = i29;
                                    i12 = i30;
                                    i14 = i18;
                                    unsafe = unsafe2;
                                    i9 = i20;
                                    i10 = i19;
                                    break;
                                } else {
                                    i25 = e.L(bArr2, i7, bVar2);
                                    s1.E(t3, V, bVar2.b != 0);
                                    i29 |= i37;
                                    i27 = i18;
                                    i28 = i19;
                                    i26 = i8;
                                    i23 = i21;
                                    i24 = i4;
                                }
                            case 8:
                                i18 = i17;
                                i19 = i35;
                                i8 = i32;
                                j4 = V;
                                bArr2 = bArr;
                                i21 = i3;
                                if (i33 != 2) {
                                    i20 = i7;
                                    i13 = i4;
                                    i11 = i29;
                                    i12 = i30;
                                    i14 = i18;
                                    unsafe = unsafe2;
                                    i9 = i20;
                                    i10 = i19;
                                    break;
                                } else {
                                    i25 = (i34 & 536870912) == 0 ? e.C(bArr2, i7, bVar2) : e.F(bArr2, i7, bVar2);
                                    obj = bVar2.c;
                                    unsafe2.putObject(t3, j4, obj);
                                    i29 |= i37;
                                    i27 = i18;
                                    i28 = i19;
                                    i26 = i8;
                                    i23 = i21;
                                    i24 = i4;
                                }
                            case 9:
                                i18 = i17;
                                i19 = i35;
                                i8 = i32;
                                j4 = V;
                                bArr2 = bArr;
                                if (i33 != 2) {
                                    i20 = i7;
                                    i13 = i4;
                                    i11 = i29;
                                    i12 = i30;
                                    i14 = i18;
                                    unsafe = unsafe2;
                                    i9 = i20;
                                    i10 = i19;
                                    break;
                                } else {
                                    i21 = i3;
                                    i25 = e.p(v0Var2.v(i18), bArr2, i7, i21, bVar2);
                                    obj = (i29 & i37) == 0 ? bVar2.c : b0.h(unsafe2.getObject(t3, j4), bVar2.c);
                                    unsafe2.putObject(t3, j4, obj);
                                    i29 |= i37;
                                    i27 = i18;
                                    i28 = i19;
                                    i26 = i8;
                                    i23 = i21;
                                    i24 = i4;
                                }
                            case 10:
                                i18 = i17;
                                i19 = i35;
                                i8 = i32;
                                bArr2 = bArr;
                                if (i33 == 2) {
                                    i25 = e.b(bArr2, i7, bVar2);
                                    unsafe2.putObject(t3, V, bVar2.c);
                                    i29 |= i37;
                                    i24 = i4;
                                    i27 = i18;
                                    i28 = i19;
                                    i26 = i8;
                                    break;
                                } else {
                                    i20 = i7;
                                    i13 = i4;
                                    i11 = i29;
                                    i12 = i30;
                                    i14 = i18;
                                    unsafe = unsafe2;
                                    i9 = i20;
                                    i10 = i19;
                                    break;
                                }
                            case 12:
                                i18 = i17;
                                i19 = i35;
                                i8 = i32;
                                j5 = V;
                                bArr2 = bArr;
                                if (i33 != 0) {
                                    i20 = i7;
                                    i13 = i4;
                                    i11 = i29;
                                    i12 = i30;
                                    i14 = i18;
                                    unsafe = unsafe2;
                                    i9 = i20;
                                    i10 = i19;
                                    break;
                                } else {
                                    i25 = e.I(bArr2, i7, bVar2);
                                    i22 = bVar2.a;
                                    b0.e t4 = v0Var2.t(i18);
                                    if (t4 != null && !t4.a(i22)) {
                                        w(t).n(i19, Long.valueOf(i22));
                                        i24 = i4;
                                        i27 = i18;
                                        i28 = i19;
                                        i26 = i8;
                                        break;
                                    }
                                    unsafe2.putInt(t3, j5, i22);
                                    i29 |= i37;
                                    i24 = i4;
                                    i27 = i18;
                                    i28 = i19;
                                    i26 = i8;
                                }
                                break;
                            case 15:
                                i18 = i17;
                                i19 = i35;
                                i8 = i32;
                                j5 = V;
                                bArr2 = bArr;
                                if (i33 == 0) {
                                    i25 = e.I(bArr2, i7, bVar2);
                                    i22 = j.b(bVar2.a);
                                    unsafe2.putInt(t3, j5, i22);
                                    i29 |= i37;
                                    i24 = i4;
                                    i27 = i18;
                                    i28 = i19;
                                    i26 = i8;
                                    break;
                                } else {
                                    i20 = i7;
                                    i13 = i4;
                                    i11 = i29;
                                    i12 = i30;
                                    i14 = i18;
                                    unsafe = unsafe2;
                                    i9 = i20;
                                    i10 = i19;
                                    break;
                                }
                            case 16:
                                i18 = i17;
                                i19 = i35;
                                i8 = i32;
                                if (i33 != 0) {
                                    i20 = i7;
                                    i13 = i4;
                                    i11 = i29;
                                    i12 = i30;
                                    i14 = i18;
                                    unsafe = unsafe2;
                                    i9 = i20;
                                    i10 = i19;
                                    break;
                                } else {
                                    j2 = V;
                                    bArr2 = bArr;
                                    L = e.L(bArr2, i7, bVar2);
                                    j3 = j.c(bVar2.b);
                                    unsafe2.putLong(t, j2, j3);
                                    i29 |= i37;
                                    i27 = i18;
                                    i25 = L;
                                    i28 = i19;
                                    i26 = i8;
                                    i23 = i3;
                                    i24 = i4;
                                }
                            case 17:
                                if (i33 == 3) {
                                    int i39 = i17;
                                    i18 = i39;
                                    i8 = i32;
                                    i19 = i35;
                                    i25 = e.n(v0Var2.v(i39), bArr, i7, i3, (i32 << 3) | 4, bVar);
                                    unsafe2.putObject(t3, V, (i29 & i37) == 0 ? bVar2.c : b0.h(unsafe2.getObject(t3, V), bVar2.c));
                                    i29 |= i37;
                                    bArr2 = bArr;
                                    i24 = i4;
                                    i27 = i18;
                                    i28 = i19;
                                    i26 = i8;
                                    break;
                                } else {
                                    i18 = i17;
                                    i19 = i35;
                                    i8 = i32;
                                    i20 = i7;
                                    i13 = i4;
                                    i11 = i29;
                                    i12 = i30;
                                    i14 = i18;
                                    unsafe = unsafe2;
                                    i9 = i20;
                                    i10 = i19;
                                    break;
                                }
                            default:
                                i20 = i7;
                                i18 = i17;
                                i19 = i35;
                                i8 = i32;
                                i13 = i4;
                                i11 = i29;
                                i12 = i30;
                                i14 = i18;
                                unsafe = unsafe2;
                                i9 = i20;
                                i10 = i19;
                                break;
                        }
                        i23 = i3;
                    } else {
                        i8 = i32;
                        bArr2 = bArr;
                        int i40 = i7;
                        if (r0 != 27) {
                            i14 = h0;
                            i11 = i29;
                            if (r0 <= 49) {
                                i12 = i30;
                                unsafe = unsafe2;
                                i15 = i35;
                                i25 = f0(t, bArr, i40, i3, i35, i8, i33, i14, i34, r0, V, bVar);
                            } else {
                                unsafe = unsafe2;
                                i16 = i40;
                                i15 = i35;
                                i12 = i30;
                                if (r0 != 50) {
                                    i25 = c0(t, bArr, i16, i3, i15, i8, i33, i34, r0, V, i14, bVar);
                                } else if (i33 == 2) {
                                    i25 = b0(t, bArr, i16, i3, i14, V, bVar);
                                }
                            }
                        } else if (i33 == 2) {
                            b0.i iVar = (b0.i) unsafe2.getObject(t3, V);
                            if (!iVar.f()) {
                                int size = iVar.size();
                                iVar = iVar.d(size == 0 ? 10 : size * 2);
                                unsafe2.putObject(t3, V, iVar);
                            }
                            i29 = i29;
                            i25 = e.q(v0Var2.v(h0), i35, bArr, i40, i3, iVar, bVar);
                            i24 = i4;
                            i28 = i35;
                            i26 = i8;
                            i27 = h0;
                            i23 = i3;
                        } else {
                            i14 = h0;
                            i11 = i29;
                            i12 = i30;
                            unsafe = unsafe2;
                            i16 = i40;
                            i15 = i35;
                        }
                        i13 = i4;
                        i9 = i16;
                        i10 = i15;
                    }
                }
                if (i10 != i13 || i13 == 0) {
                    i24 = i13;
                    i25 = (!this.f2614f || bVar.f2509d == q.b()) ? e.G(i10, bArr, i9, i3, w(t), bVar) : e.g(i10, bArr, i9, i3, t, this.f2613e, this.o, bVar);
                    t3 = t;
                    bArr2 = bArr;
                    i23 = i3;
                    i28 = i10;
                    v0Var2 = this;
                    bVar2 = bVar;
                    i26 = i8;
                    i30 = i12;
                    i27 = i14;
                    i29 = i11;
                    unsafe2 = unsafe;
                } else {
                    v0Var = this;
                    i5 = i13;
                    i25 = i9;
                    i28 = i10;
                    i30 = i12;
                    i29 = i11;
                }
            } else {
                unsafe = unsafe2;
                i5 = i24;
                v0Var = v0Var2;
            }
        }
        if (i30 != -1) {
            t2 = t;
            unsafe.putInt(t2, i30, i29);
        } else {
            t2 = t;
        }
        p1 p1Var = null;
        for (int i41 = v0Var.f2619k; i41 < v0Var.l; i41++) {
            p1Var = (p1) v0Var.q(t2, v0Var.f2618j[i41], p1Var, v0Var.o);
        }
        if (p1Var != null) {
            v0Var.o.o(t2, p1Var);
        }
        if (i5 == 0) {
            if (i25 != i3) {
                throw c0.g();
            }
        } else if (i25 > i3 || i28 != i5) {
            throw c0.g();
        }
        return i25;
    }

    @Override // f.b.b.a.z.a.h1
    public void e(T t, v1 v1Var) {
        if (v1Var.n() == v1.a.DESCENDING) {
            v0(t, v1Var);
        } else if (this.f2616h) {
            u0(t, v1Var);
        } else {
            t0(t, v1Var);
        }
    }

    @Override // f.b.b.a.z.a.h1
    public int f(T t) {
        return this.f2616h ? y(t) : x(t);
    }

    @Override // f.b.b.a.z.a.h1
    public T g() {
        return (T) this.m.a(this.f2613e);
    }

    @Override // f.b.b.a.z.a.h1
    public void h(T t, g1 g1Var, q qVar) {
        Objects.requireNonNull(qVar);
        M(this.o, this.p, t, g1Var, qVar);
    }

    @Override // f.b.b.a.z.a.h1
    public void i(T t) {
        int i2;
        int i3 = this.f2619k;
        while (true) {
            i2 = this.l;
            if (i3 >= i2) {
                break;
            }
            long V = V(s0(this.f2618j[i3]));
            Object A = s1.A(t, V);
            if (A != null) {
                s1.O(t, V, this.q.g(A));
            }
            i3++;
        }
        int length = this.f2618j.length;
        while (i2 < length) {
            this.n.c(t, this.f2618j[i2]);
            i2++;
        }
        this.o.j(t);
        if (this.f2614f) {
            this.p.f(t);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cc, code lost:
        if (r3 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
        if (r3 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e0, code lost:
        r7 = r3.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e4, code lost:
        r2 = (r2 * 53) + r7;
     */
    @Override // f.b.b.a.z.a.h1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int j(T t) {
        int i2;
        int i3;
        long j2;
        double d2;
        float f2;
        boolean z;
        Object obj;
        Object obj2;
        int length = this.a.length;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            int s0 = s0(i5);
            int U = U(i5);
            long V = V(s0);
            int i6 = 37;
            switch (r0(s0)) {
                case 0:
                    i3 = i4 * 53;
                    d2 = s1.v(t, V);
                    j2 = Double.doubleToLongBits(d2);
                    i2 = b0.f(j2);
                    i4 = i3 + i2;
                    break;
                case 1:
                    i3 = i4 * 53;
                    f2 = s1.w(t, V);
                    i2 = Float.floatToIntBits(f2);
                    i4 = i3 + i2;
                    break;
                case 2:
                case 3:
                case 5:
                case 14:
                case 16:
                    i3 = i4 * 53;
                    j2 = s1.y(t, V);
                    i2 = b0.f(j2);
                    i4 = i3 + i2;
                    break;
                case 4:
                case 6:
                case 11:
                case 12:
                case 13:
                case 15:
                    i3 = i4 * 53;
                    i2 = s1.x(t, V);
                    i4 = i3 + i2;
                    break;
                case 7:
                    i3 = i4 * 53;
                    z = s1.p(t, V);
                    i2 = b0.c(z);
                    i4 = i3 + i2;
                    break;
                case 8:
                    i3 = i4 * 53;
                    i2 = ((String) s1.A(t, V)).hashCode();
                    i4 = i3 + i2;
                    break;
                case 9:
                    obj = s1.A(t, V);
                    break;
                case 10:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case j.b3 /* 23 */:
                case j.c3 /* 24 */:
                case 25:
                case 26:
                case 27:
                case 28:
                case j.h3 /* 29 */:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    i3 = i4 * 53;
                    obj2 = s1.A(t, V);
                    i2 = obj2.hashCode();
                    i4 = i3 + i2;
                    break;
                case 17:
                    obj = s1.A(t, V);
                    break;
                case 51:
                    if (I(t, U, i5)) {
                        i3 = i4 * 53;
                        d2 = X(t, V);
                        j2 = Double.doubleToLongBits(d2);
                        i2 = b0.f(j2);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 52:
                    if (I(t, U, i5)) {
                        i3 = i4 * 53;
                        f2 = Y(t, V);
                        i2 = Float.floatToIntBits(f2);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 53:
                    if (!I(t, U, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    j2 = a0(t, V);
                    i2 = b0.f(j2);
                    i4 = i3 + i2;
                    break;
                case 54:
                    if (!I(t, U, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    j2 = a0(t, V);
                    i2 = b0.f(j2);
                    i4 = i3 + i2;
                    break;
                case 55:
                    if (!I(t, U, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    i2 = Z(t, V);
                    i4 = i3 + i2;
                    break;
                case 56:
                    if (!I(t, U, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    j2 = a0(t, V);
                    i2 = b0.f(j2);
                    i4 = i3 + i2;
                    break;
                case 57:
                    if (!I(t, U, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    i2 = Z(t, V);
                    i4 = i3 + i2;
                    break;
                case 58:
                    if (I(t, U, i5)) {
                        i3 = i4 * 53;
                        z = W(t, V);
                        i2 = b0.c(z);
                        i4 = i3 + i2;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (!I(t, U, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    i2 = ((String) s1.A(t, V)).hashCode();
                    i4 = i3 + i2;
                    break;
                case 60:
                    if (!I(t, U, i5)) {
                        break;
                    }
                    obj2 = s1.A(t, V);
                    i3 = i4 * 53;
                    i2 = obj2.hashCode();
                    i4 = i3 + i2;
                    break;
                case 61:
                    if (!I(t, U, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    obj2 = s1.A(t, V);
                    i2 = obj2.hashCode();
                    i4 = i3 + i2;
                    break;
                case 62:
                    if (!I(t, U, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    i2 = Z(t, V);
                    i4 = i3 + i2;
                    break;
                case 63:
                    if (!I(t, U, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    i2 = Z(t, V);
                    i4 = i3 + i2;
                    break;
                case 64:
                    if (!I(t, U, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    i2 = Z(t, V);
                    i4 = i3 + i2;
                    break;
                case 65:
                    if (!I(t, U, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    j2 = a0(t, V);
                    i2 = b0.f(j2);
                    i4 = i3 + i2;
                    break;
                case 66:
                    if (!I(t, U, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    i2 = Z(t, V);
                    i4 = i3 + i2;
                    break;
                case 67:
                    if (!I(t, U, i5)) {
                        break;
                    }
                    i3 = i4 * 53;
                    j2 = a0(t, V);
                    i2 = b0.f(j2);
                    i4 = i3 + i2;
                    break;
                case 68:
                    if (!I(t, U, i5)) {
                        break;
                    }
                    obj2 = s1.A(t, V);
                    i3 = i4 * 53;
                    i2 = obj2.hashCode();
                    i4 = i3 + i2;
                    break;
            }
        }
        int hashCode = (i4 * 53) + this.o.g(t).hashCode();
        return this.f2614f ? (hashCode * 53) + this.p.c(t).hashCode() : hashCode;
    }
}
