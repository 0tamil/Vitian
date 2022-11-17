package j.b0;

import j.x.c.l;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class i<T, R> implements b<R> {
    private final b<T> a;
    private final l<T, R> b;

    /* loaded from: classes.dex */
    public static final class a implements Iterator<R> {

        /* renamed from: e  reason: collision with root package name */
        private final Iterator<T> f3424e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ i<T, R> f3425f;

        a(i<T, R> iVar) {
            this.f3425f = iVar;
            this.f3424e = ((i) iVar).a.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f3424e.hasNext();
        }

        @Override // java.util.Iterator
        public R next() {
            return (R) ((i) this.f3425f).b.invoke(this.f3424e.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(b<? extends T> bVar, l<? super T, ? extends R> lVar) {
        j.x.d.i.d(bVar, "sequence");
        j.x.d.i.d(lVar, "transformer");
        this.a = bVar;
        this.b = lVar;
    }

    @Override // j.b0.b
    public Iterator<R> iterator() {
        return new a(this);
    }
}
