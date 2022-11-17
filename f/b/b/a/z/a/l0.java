package f.b.b.a.z.a;

import f.b.b.a.z.a.u1;
/* loaded from: classes.dex */
public class l0<K, V> {
    private final a<K, V> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<K, V> {
        public final u1.b a;
        public final K b;
        public final u1.b c;

        /* renamed from: d  reason: collision with root package name */
        public final V f2571d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> int b(a<K, V> aVar, K k2, V v) {
        return v.d(aVar.a, 1, k2) + v.d(aVar.c, 2, v);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <K, V> void d(l lVar, a<K, V> aVar, K k2, V v) {
        v.z(lVar, aVar.a, 1, k2);
        v.z(lVar, aVar.c, 2, v);
    }

    public int a(int i2, K k2, V v) {
        return l.U(i2) + l.C(b(this.a, k2, v));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a<K, V> c() {
        return this.a;
    }
}
