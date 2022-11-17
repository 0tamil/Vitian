package f.b.b.a.z.a;

import f.b.b.a.z.a.v;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class k1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: e  reason: collision with root package name */
    private final int f2548e;

    /* renamed from: f  reason: collision with root package name */
    private List<k1<K, V>.e> f2549f;

    /* renamed from: g  reason: collision with root package name */
    private Map<K, V> f2550g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2551h;

    /* renamed from: i  reason: collision with root package name */
    private volatile k1<K, V>.g f2552i;

    /* renamed from: j  reason: collision with root package name */
    private Map<K, V> f2553j;

    /* renamed from: k  reason: collision with root package name */
    private volatile k1<K, V>.c f2554k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends k1<FieldDescriptorType, Object> {
        a(int i2) {
            super(i2, null);
        }

        @Override // f.b.b.a.z.a.k1
        public void p() {
            if (!o()) {
                for (int i2 = 0; i2 < k(); i2++) {
                    Map.Entry<FieldDescriptorType, Object> j2 = j(i2);
                    if (((v.b) j2.getKey()).f()) {
                        j2.setValue(Collections.unmodifiableList((List) j2.getValue()));
                    }
                }
                Iterator it = m().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((v.b) entry.getKey()).f()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            k1.super.p();
        }
    }

    /* loaded from: classes.dex */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: e  reason: collision with root package name */
        private int f2555e;

        /* renamed from: f  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f2556f;

        private b() {
            this.f2555e = k1.this.f2549f.size();
        }

        /* synthetic */ b(k1 k1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f2556f == null) {
                this.f2556f = k1.this.f2553j.entrySet().iterator();
            }
            return this.f2556f;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry;
            if (b().hasNext()) {
                entry = b().next();
            } else {
                List list = k1.this.f2549f;
                int i2 = this.f2555e - 1;
                this.f2555e = i2;
                entry = (Map.Entry<K, V>) list.get(i2);
            }
            return entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i2 = this.f2555e;
            return (i2 > 0 && i2 <= k1.this.f2549f.size()) || b().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends k1<K, V>.g {
        private c() {
            super(k1.this, null);
        }

        /* synthetic */ c(k1 k1Var, a aVar) {
            this();
        }

        @Override // f.b.b.a.z.a.k1.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(k1.this, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d {
        private static final Iterator<Object> a = new a();
        private static final Iterable<Object> b = new b();

        /* loaded from: classes.dex */
        class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* loaded from: classes.dex */
        class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements Map.Entry<K, V>, Comparable<k1<K, V>.e> {

        /* renamed from: e  reason: collision with root package name */
        private final K f2559e;

        /* renamed from: f  reason: collision with root package name */
        private V f2560f;

        e(K k2, V v) {
            this.f2559e = k2;
            this.f2560f = v;
        }

        e(k1 k1Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean c(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        /* renamed from: a */
        public int compareTo(k1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        /* renamed from: d */
        public K getKey() {
            return this.f2559e;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c(this.f2559e, entry.getKey()) && c(this.f2560f, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f2560f;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f2559e;
            int i2 = 0;
            int hashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f2560f;
            if (v != null) {
                i2 = v.hashCode();
            }
            return hashCode ^ i2;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            k1.this.g();
            V v2 = this.f2560f;
            this.f2560f = v;
            return v2;
        }

        public String toString() {
            return this.f2559e + "=" + this.f2560f;
        }
    }

    /* loaded from: classes.dex */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: e  reason: collision with root package name */
        private int f2562e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f2563f;

        /* renamed from: g  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f2564g;

        private f() {
            this.f2562e = -1;
        }

        /* synthetic */ f(k1 k1Var, a aVar) {
            this();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f2564g == null) {
                this.f2564g = k1.this.f2550g.entrySet().iterator();
            }
            return this.f2564g;
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            this.f2563f = true;
            int i2 = this.f2562e + 1;
            this.f2562e = i2;
            return i2 < k1.this.f2549f.size() ? (Map.Entry<K, V>) k1.this.f2549f.get(this.f2562e) : b().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f2562e + 1 >= k1.this.f2549f.size()) {
                return !k1.this.f2550g.isEmpty() && b().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.f2563f) {
                this.f2563f = false;
                k1.this.g();
                if (this.f2562e < k1.this.f2549f.size()) {
                    k1 k1Var = k1.this;
                    int i2 = this.f2562e;
                    this.f2562e = i2 - 1;
                    k1Var.s(i2);
                    return;
                }
                b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        /* synthetic */ g(k1 k1Var, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            k1.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = k1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        /* renamed from: h */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            k1.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(k1.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            k1.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return k1.this.size();
        }
    }

    private k1(int i2) {
        this.f2548e = i2;
        this.f2549f = Collections.emptyList();
        this.f2550g = Collections.emptyMap();
        this.f2553j = Collections.emptyMap();
    }

    /* synthetic */ k1(int i2, a aVar) {
        this(i2);
    }

    private int f(K k2) {
        int size = this.f2549f.size() - 1;
        if (size >= 0) {
            int compareTo = k2.compareTo(this.f2549f.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int compareTo2 = k2.compareTo(this.f2549f.get(i3).getKey());
            if (compareTo2 < 0) {
                size = i3 - 1;
            } else if (compareTo2 <= 0) {
                return i3;
            } else {
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f2551h) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        g();
        if (this.f2549f.isEmpty() && !(this.f2549f instanceof ArrayList)) {
            this.f2549f = new ArrayList(this.f2548e);
        }
    }

    private SortedMap<K, V> n() {
        g();
        if (this.f2550g.isEmpty() && !(this.f2550g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f2550g = treeMap;
            this.f2553j = treeMap.descendingMap();
        }
        return (SortedMap) this.f2550g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends v.b<FieldDescriptorType>> k1<FieldDescriptorType, Object> q(int i2) {
        return new a(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V s(int i2) {
        g();
        V value = this.f2549f.remove(i2).getValue();
        if (!this.f2550g.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            this.f2549f.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        g();
        if (!this.f2549f.isEmpty()) {
            this.f2549f.clear();
        }
        if (!this.f2550g.isEmpty()) {
            this.f2550g.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f2550g.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f2552i == null) {
            this.f2552i = new g(this, null);
        }
        return this.f2552i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k1)) {
            return super.equals(obj);
        }
        k1 k1Var = (k1) obj;
        int size = size();
        if (size != k1Var.size()) {
            return false;
        }
        int k2 = k();
        if (k2 != k1Var.k()) {
            return entrySet().equals(k1Var.entrySet());
        }
        for (int i2 = 0; i2 < k2; i2++) {
            if (!j(i2).equals(k1Var.j(i2))) {
                return false;
            }
        }
        if (k2 != size) {
            return this.f2550g.equals(k1Var.f2550g);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f2 = f(comparable);
        return f2 >= 0 ? this.f2549f.get(f2).getValue() : this.f2550g.get(comparable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Set<Map.Entry<K, V>> h() {
        if (this.f2554k == null) {
            this.f2554k = new c(this, null);
        }
        return this.f2554k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int k2 = k();
        int i2 = 0;
        for (int i3 = 0; i3 < k2; i3++) {
            i2 += this.f2549f.get(i3).hashCode();
        }
        return l() > 0 ? i2 + this.f2550g.hashCode() : i2;
    }

    public Map.Entry<K, V> j(int i2) {
        return this.f2549f.get(i2);
    }

    public int k() {
        return this.f2549f.size();
    }

    public int l() {
        return this.f2550g.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        return this.f2550g.isEmpty() ? d.b() : this.f2550g.entrySet();
    }

    public boolean o() {
        return this.f2551h;
    }

    public void p() {
        if (!this.f2551h) {
            this.f2550g = this.f2550g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2550g);
            this.f2553j = this.f2553j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f2553j);
            this.f2551h = true;
        }
    }

    /* renamed from: r */
    public V put(K k2, V v) {
        g();
        int f2 = f(k2);
        if (f2 >= 0) {
            return this.f2549f.get(f2).setValue(v);
        }
        i();
        int i2 = -(f2 + 1);
        if (i2 >= this.f2548e) {
            return n().put(k2, v);
        }
        int size = this.f2549f.size();
        int i3 = this.f2548e;
        if (size == i3) {
            k1<K, V>.e remove = this.f2549f.remove(i3 - 1);
            n().put((K) remove.getKey(), remove.getValue());
        }
        this.f2549f.add(i2, new e(k2, v));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int f2 = f(comparable);
        if (f2 >= 0) {
            return (V) s(f2);
        }
        if (this.f2550g.isEmpty()) {
            return null;
        }
        return this.f2550g.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f2549f.size() + this.f2550g.size();
    }
}
