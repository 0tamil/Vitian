package e.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: e  reason: collision with root package name */
    c<K, V> f2000e;

    /* renamed from: f  reason: collision with root package name */
    private c<K, V> f2001f;

    /* renamed from: g  reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f2002g = new WeakHashMap<>();

    /* renamed from: h  reason: collision with root package name */
    private int f2003h = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // e.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f2007h;
        }

        @Override // e.b.a.b.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f2006g;
        }
    }

    /* renamed from: e.b.a.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0065b<K, V> extends e<K, V> {
        C0065b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // e.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f2006g;
        }

        @Override // e.b.a.b.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f2007h;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: e  reason: collision with root package name */
        final K f2004e;

        /* renamed from: f  reason: collision with root package name */
        final V f2005f;

        /* renamed from: g  reason: collision with root package name */
        c<K, V> f2006g;

        /* renamed from: h  reason: collision with root package name */
        c<K, V> f2007h;

        c(K k2, V v) {
            this.f2004e = k2;
            this.f2005f = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f2004e.equals(cVar.f2004e) && this.f2005f.equals(cVar.f2005f);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f2004e;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f2005f;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f2004e.hashCode() ^ this.f2005f.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f2004e + "=" + this.f2005f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: e  reason: collision with root package name */
        private c<K, V> f2008e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f2009f = true;

        d() {
        }

        @Override // e.b.a.b.b.f
        public void b(c<K, V> cVar) {
            c<K, V> cVar2 = this.f2008e;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f2007h;
                this.f2008e = cVar3;
                this.f2009f = cVar3 == null;
            }
        }

        /* renamed from: c */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f2009f) {
                this.f2009f = false;
                cVar = b.this.f2000e;
            } else {
                c<K, V> cVar2 = this.f2008e;
                cVar = cVar2 != null ? cVar2.f2006g : null;
            }
            this.f2008e = cVar;
            return this.f2008e;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f2009f) {
                return b.this.f2000e != null;
            }
            c<K, V> cVar = this.f2008e;
            return (cVar == null || cVar.f2006g == null) ? false : true;
        }
    }

    /* loaded from: classes.dex */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: e  reason: collision with root package name */
        c<K, V> f2011e;

        /* renamed from: f  reason: collision with root package name */
        c<K, V> f2012f;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f2011e = cVar2;
            this.f2012f = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f2012f;
            c<K, V> cVar2 = this.f2011e;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // e.b.a.b.b.f
        public void b(c<K, V> cVar) {
            if (this.f2011e == cVar && cVar == this.f2012f) {
                this.f2012f = null;
                this.f2011e = null;
            }
            c<K, V> cVar2 = this.f2011e;
            if (cVar2 == cVar) {
                this.f2011e = c(cVar2);
            }
            if (this.f2012f == cVar) {
                this.f2012f = f();
            }
        }

        abstract c<K, V> c(c<K, V> cVar);

        abstract c<K, V> d(c<K, V> cVar);

        /* renamed from: e */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f2012f;
            this.f2012f = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2012f != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        void b(c<K, V> cVar);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public Iterator<Map.Entry<K, V>> h() {
        C0065b bVar = new C0065b(this.f2001f, this.f2000e);
        this.f2002g.put(bVar, Boolean.FALSE);
        return bVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            i2 += it.next().hashCode();
        }
        return i2;
    }

    public Map.Entry<K, V> i() {
        return this.f2000e;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f2000e, this.f2001f);
        this.f2002g.put(aVar, Boolean.FALSE);
        return aVar;
    }

    protected c<K, V> j(K k2) {
        c<K, V> cVar = this.f2000e;
        while (cVar != null && !cVar.f2004e.equals(k2)) {
            cVar = cVar.f2006g;
        }
        return cVar;
    }

    public b<K, V>.d k() {
        b<K, V>.d dVar = new d();
        this.f2002g.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> l() {
        return this.f2001f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c<K, V> m(K k2, V v) {
        c<K, V> cVar = new c<>(k2, v);
        this.f2003h++;
        c<K, V> cVar2 = this.f2001f;
        if (cVar2 == null) {
            this.f2000e = cVar;
        } else {
            cVar2.f2006g = cVar;
            cVar.f2007h = cVar2;
        }
        this.f2001f = cVar;
        return cVar;
    }

    public V n(K k2, V v) {
        c<K, V> j2 = j(k2);
        if (j2 != null) {
            return j2.f2005f;
        }
        m(k2, v);
        return null;
    }

    public V o(K k2) {
        c<K, V> j2 = j(k2);
        if (j2 == null) {
            return null;
        }
        this.f2003h--;
        if (!this.f2002g.isEmpty()) {
            for (f<K, V> fVar : this.f2002g.keySet()) {
                fVar.b(j2);
            }
        }
        c<K, V> cVar = j2.f2007h;
        c<K, V> cVar2 = j2.f2006g;
        if (cVar != null) {
            cVar.f2006g = cVar2;
        } else {
            this.f2000e = cVar2;
        }
        c<K, V> cVar3 = j2.f2006g;
        if (cVar3 != null) {
            cVar3.f2007h = cVar;
        } else {
            this.f2001f = cVar;
        }
        j2.f2006g = null;
        j2.f2007h = null;
        return j2.f2005f;
    }

    public int size() {
        return this.f2003h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
