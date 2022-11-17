package f.b.b.a.z.a;

import f.b.b.a.z.a.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class i0 {
    private static final i0 a = new b();
    private static final i0 b = new c();

    /* loaded from: classes.dex */
    private static final class b extends i0 {
        private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private b() {
            super();
        }

        static <E> List<E> f(Object obj, long j2) {
            return (List) s1.A(obj, j2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static <L> List<L> g(Object obj, long j2, int i2) {
            List<L> d2;
            g0 g0Var;
            List<L> f2 = f(obj, j2);
            if (f2.isEmpty()) {
                d2 = f2 instanceof h0 ? new g0(i2) : (!(f2 instanceof b1) || !(f2 instanceof b0.i)) ? new ArrayList<>(i2) : ((b0.i) f2).d(i2);
            } else {
                if (c.isAssignableFrom(f2.getClass())) {
                    ArrayList arrayList = new ArrayList(f2.size() + i2);
                    arrayList.addAll(f2);
                    g0Var = arrayList;
                } else if (f2 instanceof r1) {
                    g0 g0Var2 = new g0(f2.size() + i2);
                    g0Var2.addAll((r1) f2);
                    g0Var = g0Var2;
                } else if (!(f2 instanceof b1) || !(f2 instanceof b0.i)) {
                    return f2;
                } else {
                    b0.i iVar = (b0.i) f2;
                    if (iVar.f()) {
                        return f2;
                    }
                    d2 = iVar.d(f2.size() + i2);
                }
                s1.O(obj, j2, g0Var);
                return g0Var;
            }
            s1.O(obj, j2, d2);
            return d2;
        }

        @Override // f.b.b.a.z.a.i0
        void c(Object obj, long j2) {
            Object obj2;
            List list = (List) s1.A(obj, j2);
            if (list instanceof h0) {
                obj2 = ((h0) list).a();
            } else if (!c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof b1) || !(list instanceof b0.i)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    b0.i iVar = (b0.i) list;
                    if (iVar.f()) {
                        iVar.b();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            s1.O(obj, j2, obj2);
        }

        @Override // f.b.b.a.z.a.i0
        <E> void d(Object obj, Object obj2, long j2) {
            List f2 = f(obj2, j2);
            List g2 = g(obj, j2, f2.size());
            int size = g2.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                g2.addAll(f2);
            }
            if (size > 0) {
                f2 = g2;
            }
            s1.O(obj, j2, f2);
        }

        @Override // f.b.b.a.z.a.i0
        <L> List<L> e(Object obj, long j2) {
            return g(obj, j2, 10);
        }
    }

    /* loaded from: classes.dex */
    private static final class c extends i0 {
        private c() {
            super();
        }

        static <E> b0.i<E> f(Object obj, long j2) {
            return (b0.i) s1.A(obj, j2);
        }

        @Override // f.b.b.a.z.a.i0
        void c(Object obj, long j2) {
            f(obj, j2).b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
        @Override // f.b.b.a.z.a.i0
        <E> void d(Object obj, Object obj2, long j2) {
            b0.i<E> f2 = f(obj, j2);
            b0.i<E> f3 = f(obj2, j2);
            int size = f2.size();
            int size2 = f3.size();
            b0.i<E> iVar = f2;
            iVar = f2;
            if (size > 0 && size2 > 0) {
                boolean f4 = f2.f();
                b0.i<E> iVar2 = f2;
                if (!f4) {
                    iVar2 = f2.d(size2 + size);
                }
                iVar2.addAll(f3);
                iVar = iVar2;
            }
            if (size > 0) {
                f3 = iVar;
            }
            s1.O(obj, j2, f3);
        }

        @Override // f.b.b.a.z.a.i0
        <L> List<L> e(Object obj, long j2) {
            b0.i f2 = f(obj, j2);
            if (f2.f()) {
                return f2;
            }
            int size = f2.size();
            b0.i d2 = f2.d(size == 0 ? 10 : size * 2);
            s1.O(obj, j2, d2);
            return d2;
        }
    }

    private i0() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i0 a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static i0 b() {
        return b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void c(Object obj, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> void d(Object obj, Object obj2, long j2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract <L> List<L> e(Object obj, long j2);
}
