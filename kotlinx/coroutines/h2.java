package kotlinx.coroutines;

import j.u.g;
import j.x.c.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class h2 implements g.b, g.c<h2> {

    /* renamed from: e  reason: collision with root package name */
    public static final h2 f3784e = new h2();

    private h2() {
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
        return this;
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
