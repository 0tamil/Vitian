package j.x.d;
/* loaded from: classes.dex */
public final class k implements b {

    /* renamed from: e  reason: collision with root package name */
    private final Class<?> f3481e;

    public k(Class<?> cls, String str) {
        i.d(cls, "jClass");
        i.d(str, "moduleName");
        this.f3481e = cls;
    }

    @Override // j.x.d.b
    public Class<?> b() {
        return this.f3481e;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && i.a(b(), ((k) obj).b());
    }

    public int hashCode() {
        return b().hashCode();
    }

    public String toString() {
        return b().toString() + " (Kotlin reflection is not available)";
    }
}
