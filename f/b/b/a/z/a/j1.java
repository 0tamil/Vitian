package f.b.b.a.z.a;

import f.b.b.a.z.a.b0;
import f.b.b.a.z.a.v;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class j1 {
    private static final Class<?> a = B();
    private static final o1<?, ?> b = C(false);
    private static final o1<?, ?> c = C(true);

    /* renamed from: d  reason: collision with root package name */
    private static final o1<?, ?> f2546d = new q1();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB A(int i2, List<Integer> list, b0.e eVar, UB ub, o1<UT, UB> o1Var) {
        if (eVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = list.get(i4).intValue();
                if (eVar.a(intValue)) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    ub = (UB) L(i2, intValue, ub, o1Var);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (!eVar.a(intValue2)) {
                    ub = (UB) L(i2, intValue2, ub, o1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }

    private static Class<?> B() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static o1<?, ?> C(boolean z) {
        try {
            Class<?> D = D();
            if (D == null) {
                return null;
            }
            return (o1) D.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Class<?> D() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, FT extends v.b<FT>> void E(r<FT> rVar, T t, T t2) {
        v<FT> c2 = rVar.c(t2);
        if (!c2.n()) {
            rVar.d(t).u(c2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> void F(n0 n0Var, T t, T t2, long j2) {
        s1.O(t, j2, n0Var.a(s1.A(t, j2), s1.A(t2, j2)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T, UT, UB> void G(o1<UT, UB> o1Var, T t, T t2) {
        o1Var.p(t, o1Var.k(o1Var.g(t), o1Var.g(t2)));
    }

    public static o1<?, ?> H() {
        return b;
    }

    public static o1<?, ?> I() {
        return c;
    }

    public static void J(Class<?> cls) {
        Class<?> cls2;
        if (!z.class.isAssignableFrom(cls) && (cls2 = a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean K(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB L(int i2, int i3, UB ub, o1<UT, UB> o1Var) {
        if (ub == null) {
            ub = o1Var.n();
        }
        o1Var.e(ub, i2, i3);
        return ub;
    }

    public static o1<?, ?> M() {
        return f2546d;
    }

    public static void N(int i2, List<Boolean> list, v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.O(i2, list, z);
        }
    }

    public static void O(int i2, List<i> list, v1 v1Var) {
        if (list != null && !list.isEmpty()) {
            v1Var.K(i2, list);
        }
    }

    public static void P(int i2, List<Double> list, v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.F(i2, list, z);
        }
    }

    public static void Q(int i2, List<Integer> list, v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.D(i2, list, z);
        }
    }

    public static void R(int i2, List<Integer> list, v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.L(i2, list, z);
        }
    }

    public static void S(int i2, List<Long> list, v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.y(i2, list, z);
        }
    }

    public static void T(int i2, List<Float> list, v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.d(i2, list, z);
        }
    }

    public static void U(int i2, List<?> list, v1 v1Var, h1 h1Var) {
        if (list != null && !list.isEmpty()) {
            v1Var.b(i2, list, h1Var);
        }
    }

    public static void V(int i2, List<Integer> list, v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.c(i2, list, z);
        }
    }

    public static void W(int i2, List<Long> list, v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.B(i2, list, z);
        }
    }

    public static void X(int i2, List<?> list, v1 v1Var, h1 h1Var) {
        if (list != null && !list.isEmpty()) {
            v1Var.l(i2, list, h1Var);
        }
    }

    public static void Y(int i2, List<Integer> list, v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.z(i2, list, z);
        }
    }

    public static void Z(int i2, List<Long> list, v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.I(i2, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? l.U(i2) + l.C(size) : size * l.d(i2, true);
    }

    public static void a0(int i2, List<Integer> list, v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.w(i2, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i2, List<Long> list, v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.h(i2, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int c(int i2, List<i> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = size * l.U(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            U += l.h(list.get(i3));
        }
        return U;
    }

    public static void c0(int i2, List<String> list, v1 v1Var) {
        if (list != null && !list.isEmpty()) {
            v1Var.q(i2, list);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int d(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int e2 = e(list);
        int U = l.U(i2);
        return z ? U + l.C(e2) : e2 + (size * U);
    }

    public static void d0(int i2, List<Integer> list, v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.e(i2, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int e(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            i2 = 0;
            while (i3 < size) {
                i2 += l.l(a0Var.o(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += l.l(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    public static void e0(int i2, List<Long> list, v1 v1Var, boolean z) {
        if (list != null && !list.isEmpty()) {
            v1Var.N(i2, list, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int f(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? l.U(i2) + l.C(size * 4) : size * l.m(i2, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int g(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int h(int i2, List<?> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z ? l.U(i2) + l.C(size * 8) : size * l.o(i2, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int j(int i2, List<s0> list, h1 h1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            i3 += l.s(i2, list.get(i4), h1Var);
        }
        return i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int l = l(list);
        int U = l.U(i2);
        return z ? U + l.C(l) : l + (size * U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int l(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            i2 = 0;
            while (i3 < size) {
                i2 += l.w(a0Var.o(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += l.w(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int m(int i2, List<Long> list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        int n = n(list);
        return z ? l.U(i2) + l.C(n) : n + (list.size() * l.U(i2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int n(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            i2 = 0;
            while (i3 < size) {
                i2 += l.y(j0Var.o(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += l.y(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int o(int i2, Object obj, h1 h1Var) {
        return obj instanceof f0 ? l.A(i2, (f0) obj) : l.F(i2, (s0) obj, h1Var);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int p(int i2, List<?> list, h1 h1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int U = l.U(i2) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            U += obj instanceof f0 ? l.B((f0) obj) : l.H((s0) obj, h1Var);
        }
        return U;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int q(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int r = r(list);
        int U = l.U(i2);
        return z ? U + l.C(r) : r + (size * U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int r(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            i2 = 0;
            while (i3 < size) {
                i2 += l.P(a0Var.o(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += l.P(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int s(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int t = t(list);
        int U = l.U(i2);
        return z ? U + l.C(t) : t + (size * U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int t(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            i2 = 0;
            while (i3 < size) {
                i2 += l.R(j0Var.o(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += l.R(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int u(int i2, List<?> list) {
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        int U = l.U(i2) * size;
        if (list instanceof h0) {
            h0 h0Var = (h0) list;
            while (i3 < size) {
                Object c2 = h0Var.c(i3);
                U += c2 instanceof i ? l.h((i) c2) : l.T((String) c2);
                i3++;
            }
        } else {
            while (i3 < size) {
                Object obj = list.get(i3);
                U += obj instanceof i ? l.h((i) obj) : l.T((String) obj);
                i3++;
            }
        }
        return U;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int v(int i2, List<Integer> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int w = w(list);
        int U = l.U(i2);
        return z ? U + l.C(w) : w + (size * U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int w(List<Integer> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof a0) {
            a0 a0Var = (a0) list;
            i2 = 0;
            while (i3 < size) {
                i2 += l.W(a0Var.o(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += l.W(list.get(i3).intValue());
                i3++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int x(int i2, List<Long> list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int y = y(list);
        int U = l.U(i2);
        return z ? U + l.C(y) : y + (size * U);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int y(List<Long> list) {
        int i2;
        int size = list.size();
        int i3 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof j0) {
            j0 j0Var = (j0) list;
            i2 = 0;
            while (i3 < size) {
                i2 += l.Y(j0Var.o(i3));
                i3++;
            }
        } else {
            i2 = 0;
            while (i3 < size) {
                i2 += l.Y(list.get(i3).longValue());
                i3++;
            }
        }
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <UT, UB> UB z(int i2, List<Integer> list, b0.d<?> dVar, UB ub, o1<UT, UB> o1Var) {
        if (dVar == null) {
            return ub;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                int intValue = list.get(i4).intValue();
                if (dVar.a(intValue) != null) {
                    if (i4 != i3) {
                        list.set(i3, Integer.valueOf(intValue));
                    }
                    i3++;
                } else {
                    ub = (UB) L(i2, intValue, ub, o1Var);
                }
            }
            if (i3 != size) {
                list.subList(i3, size).clear();
            }
        } else {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = it.next().intValue();
                if (dVar.a(intValue2) == null) {
                    ub = (UB) L(i2, intValue2, ub, o1Var);
                    it.remove();
                }
            }
        }
        return ub;
    }
}
