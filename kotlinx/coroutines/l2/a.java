package kotlinx.coroutines.l2;

import j.l;
import j.m;
import j.r;
import j.u.d;
import j.u.i.c;
import j.x.c.p;
import kotlinx.coroutines.internal.h;
/* loaded from: classes.dex */
public final class a {
    public static final /* synthetic */ void a(d dVar, Throwable th) {
        b(dVar, th);
        throw null;
    }

    private static final void b(d<?> dVar, Throwable th) {
        l.a aVar = l.f3445e;
        Object a = m.a(th);
        l.a(a);
        dVar.resumeWith(a);
        throw th;
    }

    public static final void c(d<? super r> dVar, d<?> dVar2) {
        d b;
        try {
            b = c.b(dVar);
            l.a aVar = l.f3445e;
            r rVar = r.a;
            l.a(rVar);
            h.c(b, rVar, null, 2, null);
        } catch (Throwable th) {
            a(dVar2, th);
            throw null;
        }
    }

    public static final <R, T> void d(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r, d<? super T> dVar, j.x.c.l<? super Throwable, r> lVar) {
        d<r> a;
        d b;
        try {
            a = c.a(pVar, r, dVar);
            b = c.b(a);
            l.a aVar = l.f3445e;
            r rVar = r.a;
            l.a(rVar);
            h.b(b, rVar, lVar);
        } catch (Throwable th) {
            a(dVar, th);
            throw null;
        }
    }

    public static /* synthetic */ void e(p pVar, Object obj, d dVar, j.x.c.l lVar, int i2, Object obj2) {
        if ((i2 & 4) != 0) {
            lVar = null;
        }
        d(pVar, obj, dVar, lVar);
    }
}
