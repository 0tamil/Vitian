package j.u;

import j.u.g;
import j.x.c.p;
import j.x.d.i;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class h implements g, Serializable {

    /* renamed from: e  reason: collision with root package name */
    public static final h f3461e = new h();

    private h() {
    }

    @Override // j.u.g
    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        i.d(pVar, "operation");
        return r;
    }

    @Override // j.u.g
    public <E extends g.b> E get(g.c<E> cVar) {
        i.d(cVar, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // j.u.g
    public g minusKey(g.c<?> cVar) {
        i.d(cVar, "key");
        return this;
    }

    @Override // j.u.g
    public g plus(g gVar) {
        i.d(gVar, "context");
        return gVar;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
