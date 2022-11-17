package f.b.c.a0;

import f.b.c.z.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
/* loaded from: classes.dex */
public class a<T> {
    final Class<? super T> a;
    final Type b;
    final int c;

    /* JADX INFO: Access modifiers changed from: protected */
    public a() {
        Type d2 = d(getClass());
        this.b = d2;
        this.a = (Class<? super T>) b.k(d2);
        this.c = d2.hashCode();
    }

    a(Type type) {
        f.b.c.z.a.b(type);
        Type b = b.b(type);
        this.b = b;
        this.a = (Class<? super T>) b.k(b);
        this.c = b.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    static Type d(Class<?> cls) {
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof Class)) {
            return b.b(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        }
        throw new RuntimeException("Missing type parameter.");
    }

    public final Class<? super T> c() {
        return this.a;
    }

    public final Type e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.b, ((a) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return b.u(this.b);
    }
}
