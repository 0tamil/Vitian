package androidx.lifecycle;
/* loaded from: classes.dex */
public class r {
    private final a a;
    private final s b;

    /* loaded from: classes.dex */
    public interface a {
        <T extends q> T a(Class<T> cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class b extends c implements a {
        b() {
        }

        @Override // androidx.lifecycle.r.a
        public <T extends q> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends q> T c(String str, Class<T> cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        void b(q qVar) {
        }
    }

    public r(s sVar, a aVar) {
        this.a = aVar;
        this.b = sVar;
    }

    public <T extends q> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends q> T b(String str, Class<T> cls) {
        T t = (T) this.b.b(str);
        if (cls.isInstance(t)) {
            a aVar = this.a;
            if (aVar instanceof c) {
                ((c) aVar).b(t);
            }
            return t;
        }
        a aVar2 = this.a;
        T t2 = aVar2 instanceof b ? (T) ((b) aVar2).c(str, cls) : (T) aVar2.a(cls);
        this.b.d(str, t2);
        return t2;
    }
}
