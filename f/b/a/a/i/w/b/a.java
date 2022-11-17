package f.b.a.a.i.w.b;
/* loaded from: classes.dex */
public final class a<T> implements i.a.a<T>, f.b.a.a.i.w.a<T> {
    private static final Object c = new Object();
    private volatile i.a.a<T> a;
    private volatile Object b = c;

    private a(i.a.a<T> aVar) {
        this.a = aVar;
    }

    public static <P extends i.a.a<T>, T> f.b.a.a.i.w.a<T> b(P p) {
        if (p instanceof f.b.a.a.i.w.a) {
            return (f.b.a.a.i.w.a) p;
        }
        d.b(p);
        return new a(p);
    }

    public static <P extends i.a.a<T>, T> i.a.a<T> c(P p) {
        d.b(p);
        return p instanceof a ? p : new a(p);
    }

    public static Object d(Object obj, Object obj2) {
        if (!(obj != c) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // i.a.a
    public T a() {
        T t = (T) this.b;
        Object obj = c;
        if (t == obj) {
            synchronized (this) {
                t = this.b;
                if (t == obj) {
                    t = this.a.a();
                    d(this.b, t);
                    this.b = t;
                    this.a = null;
                }
            }
        }
        return t;
    }
}
