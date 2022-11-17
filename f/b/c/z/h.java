package f.b.c.z;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public final class h<K, V> extends AbstractMap<K, V> implements Serializable {
    private static final Comparator<Comparable> l = new a();

    /* renamed from: e  reason: collision with root package name */
    Comparator<? super K> f2725e;

    /* renamed from: f  reason: collision with root package name */
    e<K, V> f2726f;

    /* renamed from: g  reason: collision with root package name */
    int f2727g;

    /* renamed from: h  reason: collision with root package name */
    int f2728h;

    /* renamed from: i  reason: collision with root package name */
    final e<K, V> f2729i;

    /* renamed from: j  reason: collision with root package name */
    private h<K, V>.b f2730j;

    /* renamed from: k  reason: collision with root package name */
    private h<K, V>.c f2731k;

    /* loaded from: classes.dex */
    class a implements Comparator<Comparable> {
        a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* loaded from: classes.dex */
    class b extends AbstractSet<Map.Entry<K, V>> {

        /* loaded from: classes.dex */
        class a extends h<K, V>.d<Map.Entry<K, V>> {
            a(b bVar) {
                super();
            }

            /* renamed from: c */
            public Map.Entry<K, V> next() {
                return b();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.c((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> c;
            if (!(obj instanceof Map.Entry) || (c = h.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            h.this.f(c, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f2727g;
        }
    }

    /* loaded from: classes.dex */
    final class c extends AbstractSet<K> {

        /* loaded from: classes.dex */
        class a extends h<K, V>.d<K> {
            a(c cVar) {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return b().f2743j;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return h.this.g(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f2727g;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public abstract class d<T> implements Iterator<T> {

        /* renamed from: e  reason: collision with root package name */
        e<K, V> f2734e;

        /* renamed from: f  reason: collision with root package name */
        e<K, V> f2735f = null;

        /* renamed from: g  reason: collision with root package name */
        int f2736g;

        d() {
            this.f2734e = h.this.f2729i.f2741h;
            this.f2736g = h.this.f2728h;
        }

        final e<K, V> b() {
            e<K, V> eVar = this.f2734e;
            h hVar = h.this;
            if (eVar == hVar.f2729i) {
                throw new NoSuchElementException();
            } else if (hVar.f2728h == this.f2736g) {
                this.f2734e = eVar.f2741h;
                this.f2735f = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f2734e != h.this.f2729i;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f2735f;
            if (eVar != null) {
                h.this.f(eVar, true);
                this.f2735f = null;
                this.f2736g = h.this.f2728h;
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e<K, V> implements Map.Entry<K, V> {

        /* renamed from: e  reason: collision with root package name */
        e<K, V> f2738e;

        /* renamed from: f  reason: collision with root package name */
        e<K, V> f2739f;

        /* renamed from: g  reason: collision with root package name */
        e<K, V> f2740g;

        /* renamed from: h  reason: collision with root package name */
        e<K, V> f2741h;

        /* renamed from: i  reason: collision with root package name */
        e<K, V> f2742i;

        /* renamed from: j  reason: collision with root package name */
        final K f2743j;

        /* renamed from: k  reason: collision with root package name */
        V f2744k;
        int l;

        e() {
            this.f2743j = null;
            this.f2742i = this;
            this.f2741h = this;
        }

        e(e<K, V> eVar, K k2, e<K, V> eVar2, e<K, V> eVar3) {
            this.f2738e = eVar;
            this.f2743j = k2;
            this.l = 1;
            this.f2741h = eVar2;
            this.f2742i = eVar3;
            eVar3.f2741h = this;
            eVar2.f2742i = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this.f2739f;
            e<K, V> eVar2 = this;
            while (eVar != null) {
                eVar = eVar.f2739f;
                eVar2 = eVar;
            }
            return eVar2;
        }

        public e<K, V> b() {
            e<K, V> eVar = this.f2740g;
            e<K, V> eVar2 = this;
            while (eVar != null) {
                eVar = eVar.f2740g;
                eVar2 = eVar;
            }
            return eVar2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k2 = this.f2743j;
            if (k2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k2.equals(entry.getKey())) {
                return false;
            }
            V v = this.f2744k;
            Object value = entry.getValue();
            if (v == null) {
                if (value != null) {
                    return false;
                }
            } else if (!v.equals(value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f2743j;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f2744k;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f2743j;
            int i2 = 0;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f2744k;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f2744k;
            this.f2744k = v;
            return v2;
        }

        public String toString() {
            return this.f2743j + "=" + this.f2744k;
        }
    }

    public h() {
        this(l);
    }

    public h(Comparator<? super K> comparator) {
        this.f2727g = 0;
        this.f2728h = 0;
        this.f2729i = new e<>();
        this.f2725e = comparator == null ? l : comparator;
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void e(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f2739f;
            e<K, V> eVar3 = eVar.f2740g;
            int i2 = 0;
            int i3 = eVar2 != null ? eVar2.l : 0;
            int i4 = eVar3 != null ? eVar3.l : 0;
            int i5 = i3 - i4;
            if (i5 == -2) {
                e<K, V> eVar4 = eVar3.f2739f;
                e<K, V> eVar5 = eVar3.f2740g;
                int i6 = eVar5 != null ? eVar5.l : 0;
                if (eVar4 != null) {
                    i2 = eVar4.l;
                }
                int i7 = i2 - i6;
                if (i7 != -1 && (i7 != 0 || z)) {
                    j(eVar3);
                }
                i(eVar);
                if (z) {
                    return;
                }
            } else if (i5 == 2) {
                e<K, V> eVar6 = eVar2.f2739f;
                e<K, V> eVar7 = eVar2.f2740g;
                int i8 = eVar7 != null ? eVar7.l : 0;
                if (eVar6 != null) {
                    i2 = eVar6.l;
                }
                int i9 = i2 - i8;
                if (i9 != 1 && (i9 != 0 || z)) {
                    i(eVar2);
                }
                j(eVar);
                if (z) {
                    return;
                }
            } else if (i5 == 0) {
                eVar.l = i3 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.l = Math.max(i3, i4) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f2738e;
        }
    }

    private void h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f2738e;
        eVar.f2738e = null;
        if (eVar2 != null) {
            eVar2.f2738e = eVar3;
        }
        if (eVar3 == null) {
            this.f2726f = eVar2;
        } else if (eVar3.f2739f == eVar) {
            eVar3.f2739f = eVar2;
        } else {
            eVar3.f2740g = eVar2;
        }
    }

    private void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f2739f;
        e<K, V> eVar3 = eVar.f2740g;
        e<K, V> eVar4 = eVar3.f2739f;
        e<K, V> eVar5 = eVar3.f2740g;
        eVar.f2740g = eVar4;
        if (eVar4 != null) {
            eVar4.f2738e = eVar;
        }
        h(eVar, eVar3);
        eVar3.f2739f = eVar;
        eVar.f2738e = eVar3;
        int i2 = 0;
        int max = Math.max(eVar2 != null ? eVar2.l : 0, eVar4 != null ? eVar4.l : 0) + 1;
        eVar.l = max;
        if (eVar5 != null) {
            i2 = eVar5.l;
        }
        eVar3.l = Math.max(max, i2) + 1;
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f2739f;
        e<K, V> eVar3 = eVar.f2740g;
        e<K, V> eVar4 = eVar2.f2739f;
        e<K, V> eVar5 = eVar2.f2740g;
        eVar.f2739f = eVar5;
        if (eVar5 != null) {
            eVar5.f2738e = eVar;
        }
        h(eVar, eVar2);
        eVar2.f2740g = eVar;
        eVar.f2738e = eVar2;
        int i2 = 0;
        int max = Math.max(eVar3 != null ? eVar3.l : 0, eVar5 != null ? eVar5.l : 0) + 1;
        eVar.l = max;
        if (eVar4 != null) {
            i2 = eVar4.l;
        }
        eVar2.l = Math.max(max, i2) + 1;
    }

    e<K, V> b(K k2, boolean z) {
        int i2;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f2725e;
        e<K, V> eVar2 = this.f2726f;
        if (eVar2 != null) {
            Comparable comparable = comparator == l ? (Comparable) k2 : null;
            while (true) {
                Object obj = (K) eVar2.f2743j;
                i2 = comparable != null ? comparable.compareTo(obj) : comparator.compare(k2, obj);
                if (i2 == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = i2 < 0 ? eVar2.f2739f : eVar2.f2740g;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i2 = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f2729i;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f2742i);
            if (i2 < 0) {
                eVar2.f2739f = eVar;
            } else {
                eVar2.f2740g = eVar;
            }
            e(eVar2, true);
        } else if (comparator != l || (k2 instanceof Comparable)) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f2742i);
            this.f2726f = eVar;
        } else {
            throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
        }
        this.f2727g++;
        this.f2728h++;
        return eVar;
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> d2 = d(entry.getKey());
        if (d2 != null && a(d2.f2744k, entry.getValue())) {
            return d2;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f2726f = null;
        this.f2727g = 0;
        this.f2728h++;
        e<K, V> eVar = this.f2729i;
        eVar.f2742i = eVar;
        eVar.f2741h = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> d(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        h<K, V>.b bVar = this.f2730j;
        if (bVar != null) {
            return bVar;
        }
        h<K, V>.b bVar2 = new b();
        this.f2730j = bVar2;
        return bVar2;
    }

    void f(e<K, V> eVar, boolean z) {
        int i2;
        if (z) {
            e<K, V> eVar2 = eVar.f2742i;
            eVar2.f2741h = eVar.f2741h;
            eVar.f2741h.f2742i = eVar2;
        }
        e<K, V> eVar3 = eVar.f2739f;
        e<K, V> eVar4 = eVar.f2740g;
        e<K, V> eVar5 = eVar.f2738e;
        int i3 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f2739f = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f2740g = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f2727g--;
            this.f2728h++;
            return;
        }
        e<K, V> b2 = eVar3.l > eVar4.l ? eVar3.b() : eVar4.a();
        f(b2, false);
        e<K, V> eVar6 = eVar.f2739f;
        if (eVar6 != null) {
            i2 = eVar6.l;
            b2.f2739f = eVar6;
            eVar6.f2738e = b2;
            eVar.f2739f = null;
        } else {
            i2 = 0;
        }
        e<K, V> eVar7 = eVar.f2740g;
        if (eVar7 != null) {
            i3 = eVar7.l;
            b2.f2740g = eVar7;
            eVar7.f2738e = b2;
            eVar.f2740g = null;
        }
        b2.l = Math.max(i2, i3) + 1;
        h(eVar, b2);
    }

    e<K, V> g(Object obj) {
        e<K, V> d2 = d(obj);
        if (d2 != null) {
            f(d2, true);
        }
        return d2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> d2 = d(obj);
        if (d2 != null) {
            return d2.f2744k;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        h<K, V>.c cVar = this.f2731k;
        if (cVar != null) {
            return cVar;
        }
        h<K, V>.c cVar2 = new c();
        this.f2731k = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        Objects.requireNonNull(k2, "key == null");
        e<K, V> b2 = b(k2, true);
        V v2 = b2.f2744k;
        b2.f2744k = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> g2 = g(obj);
        if (g2 != null) {
            return g2.f2744k;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f2727g;
    }
}
