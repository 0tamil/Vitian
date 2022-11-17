package f.b.a.a.i.w.b;

import f.b.a.a.i.w.a;
/* loaded from: classes.dex */
public final class c<T> implements b<T>, a<T> {
    private final T a;

    private c(T t) {
        this.a = t;
    }

    public static <T> b<T> b(T t) {
        d.c(t, "instance cannot be null");
        return new c(t);
    }

    @Override // i.a.a
    public T a() {
        return this.a;
    }
}
