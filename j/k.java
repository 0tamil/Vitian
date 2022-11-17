package j;

import j.x.d.i;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class k<A, B> implements Serializable {

    /* renamed from: e  reason: collision with root package name */
    private final A f3443e;

    /* renamed from: f  reason: collision with root package name */
    private final B f3444f;

    public k(A a, B b) {
        this.f3443e = a;
        this.f3444f = b;
    }

    public final A a() {
        return this.f3443e;
    }

    public final B b() {
        return this.f3444f;
    }

    public final A c() {
        return this.f3443e;
    }

    public final B d() {
        return this.f3444f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return i.a(this.f3443e, kVar.f3443e) && i.a(this.f3444f, kVar.f3444f);
    }

    public int hashCode() {
        A a = this.f3443e;
        int i2 = 0;
        int hashCode = (a == null ? 0 : a.hashCode()) * 31;
        B b = this.f3444f;
        if (b != null) {
            i2 = b.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        return '(' + this.f3443e + ", " + this.f3444f + ')';
    }
}
