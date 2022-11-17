package e.b.a.b;

import e.b.a.b.b;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: i  reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f1999i = new HashMap<>();

    public boolean contains(K k2) {
        return this.f1999i.containsKey(k2);
    }

    @Override // e.b.a.b.b
    protected b.c<K, V> j(K k2) {
        return this.f1999i.get(k2);
    }

    @Override // e.b.a.b.b
    public V n(K k2, V v) {
        b.c<K, V> j2 = j(k2);
        if (j2 != null) {
            return j2.f2005f;
        }
        this.f1999i.put(k2, m(k2, v));
        return null;
    }

    @Override // e.b.a.b.b
    public V o(K k2) {
        V v = (V) super.o(k2);
        this.f1999i.remove(k2);
        return v;
    }

    public Map.Entry<K, V> p(K k2) {
        if (contains(k2)) {
            return this.f1999i.get(k2).f2007h;
        }
        return null;
    }
}
