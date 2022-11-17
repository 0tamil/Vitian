package f.b.b.a.z.a;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* loaded from: classes.dex */
public class r1 extends AbstractList<String> implements h0, RandomAccess {

    /* renamed from: e  reason: collision with root package name */
    private final h0 f2583e;

    /* loaded from: classes.dex */
    class a implements ListIterator<String> {

        /* renamed from: e  reason: collision with root package name */
        ListIterator<String> f2584e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ int f2585f;

        a(int i2) {
            this.f2585f = i2;
            this.f2584e = r1.this.f2583e.listIterator(i2);
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(String str) {
            b(str);
            throw null;
        }

        public void b(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return this.f2584e.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f2584e.previous();
        }

        public void e(String str) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f2584e.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f2584e.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f2584e.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f2584e.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(String str) {
            e(str);
            throw null;
        }
    }

    /* loaded from: classes.dex */
    class b implements Iterator<String> {

        /* renamed from: e  reason: collision with root package name */
        Iterator<String> f2587e;

        b() {
            this.f2587e = r1.this.f2583e.iterator();
        }

        /* renamed from: b */
        public String next() {
            return this.f2587e.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2587e.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public r1(h0 h0Var) {
        this.f2583e = h0Var;
    }

    @Override // f.b.b.a.z.a.h0
    public h0 a() {
        return this;
    }

    @Override // f.b.b.a.z.a.h0
    public Object c(int i2) {
        return this.f2583e.c(i2);
    }

    @Override // f.b.b.a.z.a.h0
    public List<?> e() {
        return this.f2583e.e();
    }

    @Override // f.b.b.a.z.a.h0
    public void g(i iVar) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: i */
    public String get(int i2) {
        return (String) this.f2583e.get(i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<String> iterator() {
        return new b();
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<String> listIterator(int i2) {
        return new a(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f2583e.size();
    }
}
