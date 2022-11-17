package f.b.b.a.z.a;

import f.b.b.a.z.a.b0;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class m0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: f  reason: collision with root package name */
    private static final m0 f2574f;

    /* renamed from: e  reason: collision with root package name */
    private boolean f2575e = true;

    static {
        m0 m0Var = new m0();
        f2574f = m0Var;
        m0Var.k();
    }

    private m0() {
    }

    private m0(Map<K, V> map) {
        super(map);
    }

    static <K, V> int b(Map<K, V> map) {
        int i2 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i2 += c(entry.getValue()) ^ c(entry.getKey());
        }
        return i2;
    }

    private static int c(Object obj) {
        if (obj instanceof byte[]) {
            return b0.d((byte[]) obj);
        }
        if (!(obj instanceof b0.c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    private static void e(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            b0.a(obj);
            b0.a(map.get(obj));
        }
    }

    public static <K, V> m0<K, V> f() {
        return f2574f;
    }

    private void g() {
        if (!j()) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean h(Object obj, Object obj2) {
        return (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? obj.equals(obj2) : Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static <K, V> boolean i(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !h(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
            while (r4.hasNext()) {
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && i(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return b(this);
    }

    public boolean j() {
        return this.f2575e;
    }

    public void k() {
        this.f2575e = false;
    }

    public void l(m0<K, V> m0Var) {
        g();
        if (!m0Var.isEmpty()) {
            putAll(m0Var);
        }
    }

    public m0<K, V> m() {
        return isEmpty() ? new m0<>() : new m0<>(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        g();
        b0.a(k2);
        b0.a(v);
        return (V) super.put(k2, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        g();
        e(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        return (V) super.remove(obj);
    }
}
