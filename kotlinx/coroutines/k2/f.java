package kotlinx.coroutines.k2;

import j.r;
import j.u.d;
import j.u.i.b;
import j.x.c.p;
/* loaded from: classes.dex */
final class f<T> extends a<T> {
    private final p<c<? super T>, d<? super r>, Object> a;

    /* JADX WARN: Multi-variable type inference failed */
    public f(p<? super c<? super T>, ? super d<? super r>, ? extends Object> pVar) {
        this.a = pVar;
    }

    @Override // kotlinx.coroutines.k2.a
    public Object b(c<? super T> cVar, d<? super r> dVar) {
        Object invoke = this.a.invoke(cVar, dVar);
        return invoke == b.c() ? invoke : r.a;
    }
}
