package j.u;

import j.l;
import j.r;
import j.u.i.c;
import j.x.c.p;
import j.x.d.i;
/* loaded from: classes.dex */
public final class f {
    public static final <R, T> void a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r, d<? super T> dVar) {
        d<r> a;
        d b;
        i.d(pVar, "<this>");
        i.d(dVar, "completion");
        a = c.a(pVar, r, dVar);
        b = c.b(a);
        l.a aVar = l.f3445e;
        r rVar = r.a;
        l.a(rVar);
        b.resumeWith(rVar);
    }
}
