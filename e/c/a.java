package e.c;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class a<K, V> extends g<K, V> implements Map<K, V> {
    f<K, V> l;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e.c.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0066a extends f<K, V> {
        C0066a() {
        }

        @Override // e.c.f
        protected void a() {
            a.this.clear();
        }

        @Override // e.c.f
        protected Object b(int i2, int i3) {
            return a.this.f2049f[(i2 << 1) + i3];
        }

        @Override // e.c.f
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // e.c.f
        protected int d() {
            return a.this.f2050g;
        }

        @Override // e.c.f
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // e.c.f
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // e.c.f
        protected void g(K k2, V v) {
            a.this.put(k2, v);
        }

        @Override // e.c.f
        protected void h(int i2) {
            a.this.j(i2);
        }

        @Override // e.c.f
        protected V i(int i2, V v) {
            return a.this.k(i2, v);
        }
    }

    public a() {
    }

    public a(int i2) {
        super(i2);
    }

    private f<K, V> m() {
        if (this.l == null) {
            this.l = new C0066a();
        }
        return this.l;
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return m().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return m().m();
    }

    public boolean n(Collection<?> collection) {
        return f.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        c(this.f2050g + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return m().n();
    }
}
