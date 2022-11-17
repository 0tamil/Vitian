package f.b.a.a;

import java.util.Objects;
/* loaded from: classes.dex */
final class a<T> extends c<T> {
    private final Integer a;
    private final T b;
    private final d c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Integer num, T t, d dVar) {
        this.a = num;
        Objects.requireNonNull(t, "Null payload");
        this.b = t;
        Objects.requireNonNull(dVar, "Null priority");
        this.c = dVar;
    }

    @Override // f.b.a.a.c
    public Integer a() {
        return this.a;
    }

    @Override // f.b.a.a.c
    public T b() {
        return this.b;
    }

    @Override // f.b.a.a.c
    public d c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Integer num = this.a;
        if (num != null ? num.equals(cVar.a()) : cVar.a() == null) {
            if (this.b.equals(cVar.b()) && this.c.equals(cVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.a;
        return (((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + "}";
    }
}
