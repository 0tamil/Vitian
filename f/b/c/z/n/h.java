package f.b.c.z.n;

import f.b.c.b0.b;
import f.b.c.e;
import f.b.c.k;
import f.b.c.p;
import f.b.c.s;
import f.b.c.w;
import f.b.c.x;
import f.b.c.z.c;
import f.b.c.z.f;
import f.b.c.z.i;
import f.b.c.z.l;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;
/* loaded from: classes.dex */
public final class h implements x {

    /* renamed from: e  reason: collision with root package name */
    private final c f2750e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f2751f;

    /* loaded from: classes.dex */
    private final class a<K, V> extends w<Map<K, V>> {
        private final w<K> a;
        private final w<V> b;
        private final i<? extends Map<K, V>> c;

        public a(e eVar, Type type, w<K> wVar, Type type2, w<V> wVar2, i<? extends Map<K, V>> iVar) {
            this.a = new m(eVar, wVar, type);
            this.b = new m(eVar, wVar2, type2);
            this.c = iVar;
        }

        private String f(k kVar) {
            if (kVar.o()) {
                p j2 = kVar.j();
                if (j2.w()) {
                    return String.valueOf(j2.t());
                }
                if (j2.u()) {
                    return Boolean.toString(j2.p());
                }
                if (j2.x()) {
                    return j2.k();
                }
                throw new AssertionError();
            } else if (kVar.m()) {
                return "null";
            } else {
                throw new AssertionError();
            }
        }

        /* renamed from: g */
        public Map<K, V> c(f.b.c.b0.a aVar) {
            b G = aVar.G();
            if (G == b.NULL) {
                aVar.C();
                return null;
            }
            Map<K, V> a = this.c.a();
            if (G == b.BEGIN_ARRAY) {
                aVar.b();
                while (aVar.q()) {
                    aVar.b();
                    K c = this.a.c(aVar);
                    if (a.put(c, this.b.c(aVar)) == null) {
                        aVar.i();
                    } else {
                        throw new s("duplicate key: " + c);
                    }
                }
                aVar.i();
            } else {
                aVar.c();
                while (aVar.q()) {
                    f.a.a(aVar);
                    K c2 = this.a.c(aVar);
                    if (a.put(c2, this.b.c(aVar)) != null) {
                        throw new s("duplicate key: " + c2);
                    }
                }
                aVar.l();
            }
            return a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: h */
        public void e(f.b.c.b0.c cVar, Map<K, V> map) {
            if (map == null) {
                cVar.t();
            } else if (!h.this.f2751f) {
                cVar.f();
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    cVar.r(String.valueOf(entry.getKey()));
                    this.b.e(cVar, entry.getValue());
                }
                cVar.l();
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                ArrayList arrayList2 = new ArrayList(map.size());
                int i2 = 0;
                boolean z = false;
                for (Map.Entry<K, V> entry2 : map.entrySet()) {
                    k d2 = this.a.d(entry2.getKey());
                    arrayList.add(d2);
                    arrayList2.add(entry2.getValue());
                    z |= d2.l() || d2.n();
                }
                if (z) {
                    cVar.d();
                    int size = arrayList.size();
                    while (i2 < size) {
                        cVar.d();
                        l.b((k) arrayList.get(i2), cVar);
                        this.b.e(cVar, arrayList2.get(i2));
                        cVar.i();
                        i2++;
                    }
                    cVar.i();
                    return;
                }
                cVar.f();
                int size2 = arrayList.size();
                while (i2 < size2) {
                    cVar.r(f((k) arrayList.get(i2)));
                    this.b.e(cVar, arrayList2.get(i2));
                    i2++;
                }
                cVar.l();
            }
        }
    }

    public h(c cVar, boolean z) {
        this.f2750e = cVar;
        this.f2751f = z;
    }

    private w<?> a(e eVar, Type type) {
        return (type == Boolean.TYPE || type == Boolean.class) ? n.f2772f : eVar.j(f.b.c.a0.a.b(type));
    }

    @Override // f.b.c.x
    public <T> w<T> create(e eVar, f.b.c.a0.a<T> aVar) {
        Type e2 = aVar.e();
        if (!Map.class.isAssignableFrom(aVar.c())) {
            return null;
        }
        Type[] j2 = f.b.c.z.b.j(e2, f.b.c.z.b.k(e2));
        return new a(eVar, j2[0], a(eVar, j2[0]), j2[1], eVar.j(f.b.c.a0.a.b(j2[1])), this.f2750e.a(aVar));
    }
}
