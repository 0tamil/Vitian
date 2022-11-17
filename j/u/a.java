package j.u;

import j.u.g;
import j.x.c.p;
import j.x.d.i;
/* loaded from: classes.dex */
public abstract class a implements g.b {
    private final g.c<?> key;

    public a(g.c<?> cVar) {
        i.d(cVar, "key");
        this.key = cVar;
    }

    @Override // j.u.g
    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r, pVar);
    }

    @Override // j.u.g.b, j.u.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // j.u.g.b
    public g.c<?> getKey() {
        return this.key;
    }

    @Override // j.u.g
    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // j.u.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
