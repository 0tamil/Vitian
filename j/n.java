package j;

import j.x.c.a;
import j.x.d.e;
import j.x.d.i;
import java.io.Serializable;
/* loaded from: classes.dex */
final class n<T> implements f<T>, Serializable {

    /* renamed from: e  reason: collision with root package name */
    private a<? extends T> f3447e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Object f3448f;

    /* renamed from: g  reason: collision with root package name */
    private final Object f3449g;

    public n(a<? extends T> aVar, Object obj) {
        i.d(aVar, "initializer");
        this.f3447e = aVar;
        this.f3448f = p.a;
        this.f3449g = obj == null ? this : obj;
    }

    public /* synthetic */ n(a aVar, Object obj, int i2, e eVar) {
        this(aVar, (i2 & 2) != 0 ? null : obj);
    }

    public boolean a() {
        return this.f3448f != p.a;
    }

    @Override // j.f
    public T getValue() {
        T t;
        T t2 = (T) this.f3448f;
        p pVar = p.a;
        if (t2 != pVar) {
            return t2;
        }
        synchronized (this.f3449g) {
            t = (T) this.f3448f;
            if (t == pVar) {
                a<? extends T> aVar = this.f3447e;
                i.b(aVar);
                t = aVar.invoke();
                this.f3448f = t;
                this.f3447e = null;
            }
        }
        return t;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
