package j.s;

import j.k;
import j.x.d.i;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class z extends y {
    public static final <K, V> Map<K, V> d() {
        return t.f3452e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> e(Map<K, ? extends V> map) {
        i.d(map, "<this>");
        int size = map.size();
        return size != 0 ? size != 1 ? map : y.c(map) : d();
    }

    public static final <K, V> void f(Map<? super K, ? super V> map, Iterable<? extends k<? extends K, ? extends V>> iterable) {
        i.d(map, "<this>");
        i.d(iterable, "pairs");
        for (k<? extends K, ? extends V> kVar : iterable) {
            map.put((K) kVar.a(), (V) kVar.b());
        }
    }

    public static <K, V> Map<K, V> g(Iterable<? extends k<? extends K, ? extends V>> iterable) {
        i.d(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size == 0) {
                return d();
            }
            if (size != 1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap(w.a(collection.size()));
                h(iterable, linkedHashMap);
                return linkedHashMap;
            }
            return y.b(iterable instanceof List ? (k<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        h(iterable, linkedHashMap2);
        return e(linkedHashMap2);
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M h(Iterable<? extends k<? extends K, ? extends V>> iterable, M m) {
        i.d(iterable, "<this>");
        i.d(m, "destination");
        f(m, iterable);
        return m;
    }
}
