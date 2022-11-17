package kotlinx.coroutines.l2;

import j.l;
import j.m;
import j.u.d;
import j.u.g;
import j.u.j.a.h;
import j.x.c.p;
import j.x.d.n;
import kotlinx.coroutines.internal.d0;
/* loaded from: classes.dex */
public final class b {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r, d<? super T> dVar) {
        Object obj;
        g context;
        Object c;
        Object c2;
        h.a(dVar);
        try {
            context = dVar.getContext();
            c = d0.c(context, null);
        } catch (Throwable th) {
            l.a aVar = l.f3445e;
            obj = m.a(th);
        }
        if (pVar != null) {
            n.a(pVar, 2);
            obj = pVar.invoke(r, dVar);
            d0.a(context, c);
            c2 = j.u.i.d.c();
            if (obj != c2) {
                l.a aVar2 = l.f3445e;
                l.a(obj);
                dVar.resumeWith(obj);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
    }
}
