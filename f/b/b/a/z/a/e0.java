package f.b.b.a.z.a;

import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class e0 extends f0 {

    /* renamed from: e  reason: collision with root package name */
    private final s0 f2510e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: e  reason: collision with root package name */
        private Map.Entry<K, e0> f2511e;

        private b(Map.Entry<K, e0> entry) {
            this.f2511e = entry;
        }

        public e0 a() {
            return this.f2511e.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f2511e.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            e0 value = this.f2511e.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof s0) {
                return this.f2511e.getValue().d((s0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: e  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f2512e;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f2512e = it;
        }

        /* renamed from: b */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f2512e.next();
            return next.getValue() instanceof e0 ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2512e.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f2512e.remove();
        }
    }

    @Override // f.b.b.a.z.a.f0
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public s0 f() {
        return c(this.f2510e);
    }

    @Override // f.b.b.a.z.a.f0
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
