package kotlinx.coroutines;

import j.l;
import j.m;
import j.r;
import j.u.d;
import j.u.j.a.e;
import kotlinx.coroutines.internal.y;
/* loaded from: classes.dex */
public final class c0 {
    public static final <T> Object a(Object obj, d<? super T> dVar) {
        if (obj instanceof y) {
            l.a aVar = l.f3445e;
            Throwable th = ((y) obj).a;
            if (o0.d() && (dVar instanceof e)) {
                th = y.j(th, (e) dVar);
            }
            obj = m.a(th);
        } else {
            l.a aVar2 = l.f3445e;
        }
        l.a(obj);
        return obj;
    }

    public static final <T> Object b(Object obj, j.x.c.l<? super Throwable, r> lVar) {
        Throwable b = l.b(obj);
        return b == null ? lVar != null ? new z(obj, lVar) : obj : new y(b, false, 2, null);
    }

    public static final <T> Object c(Object obj, m<?> mVar) {
        Throwable b = l.b(obj);
        if (b != null) {
            if (o0.d() && (mVar instanceof e)) {
                b = y.j(b, (e) mVar);
            }
            obj = new y(b, false, 2, null);
        }
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, j.x.c.l lVar, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            lVar = null;
        }
        return b(obj, lVar);
    }
}
