package j.u;

import j.u.g;
import j.u.g.b;
import j.x.c.l;
import j.x.d.i;
/* loaded from: classes.dex */
public abstract class b<B extends g.b, E extends B> implements g.c<E> {

    /* renamed from: e  reason: collision with root package name */
    private final l<g.b, E> f3454e;

    /* renamed from: f  reason: collision with root package name */
    private final g.c<?> f3455f;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [j.x.c.l<? super j.u.g$b, ? extends E extends B>, java.lang.Object, j.x.c.l<j.u.g$b, E extends B>] */
    public b(g.c<B> cVar, l<? super g.b, ? extends E> lVar) {
        i.d(cVar, "baseKey");
        i.d(lVar, "safeCast");
        this.f3454e = lVar;
        this.f3455f = cVar instanceof b ? (g.c<B>) ((b) cVar).f3455f : cVar;
    }

    public final boolean a(g.c<?> cVar) {
        i.d(cVar, "key");
        return cVar == this || this.f3455f == cVar;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lj/u/g$b;)TE; */
    public final g.b b(g.b bVar) {
        i.d(bVar, "element");
        return (g.b) this.f3454e.invoke(bVar);
    }
}
