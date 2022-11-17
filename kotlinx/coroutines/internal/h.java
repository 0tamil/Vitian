package kotlinx.coroutines.internal;

import j.l;
import j.m;
import j.r;
import j.u.d;
import j.u.g;
import j.x.c.l;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.e0;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.g2;
import kotlinx.coroutines.n1;
import kotlinx.coroutines.o0;
import kotlinx.coroutines.y0;
/* loaded from: classes.dex */
public final class h {
    private static final z a = new z("UNDEFINED");
    public static final z b = new z("REUSABLE_CLAIMED");

    public static final /* synthetic */ z a() {
        return a;
    }

    public static final <T> void b(d<? super T> dVar, Object obj, l<? super Throwable, r> lVar) {
        boolean z;
        if (dVar instanceof g) {
            g gVar = (g) dVar;
            Object b2 = c0.b(obj, lVar);
            if (gVar.f3794h.x(gVar.getContext())) {
                gVar.f3796j = b2;
                gVar.f3919g = 1;
                gVar.f3794h.w(gVar.getContext(), gVar);
                return;
            }
            o0.a();
            y0 a2 = e2.a.a();
            if (a2.E()) {
                gVar.f3796j = b2;
                gVar.f3919g = 1;
                a2.A(gVar);
                return;
            }
            a2.C(true);
            try {
                n1 n1Var = (n1) gVar.getContext().get(n1.f3911d);
                if (n1Var == null || n1Var.b()) {
                    z = false;
                } else {
                    CancellationException h2 = n1Var.h();
                    gVar.b(b2, h2);
                    l.a aVar = j.l.f3445e;
                    Object a3 = m.a(h2);
                    j.l.a(a3);
                    gVar.resumeWith(a3);
                    z = true;
                }
                if (!z) {
                    d<T> dVar2 = gVar.f3795i;
                    Object obj2 = gVar.f3797k;
                    g context = dVar2.getContext();
                    Object c = d0.c(context, obj2);
                    g2<?> e2 = c != d0.a ? e0.e(dVar2, context, c) : null;
                    gVar.f3795i.resumeWith(obj);
                    r rVar = r.a;
                    if (e2 == null || e2.x0()) {
                        d0.a(context, c);
                    }
                }
                do {
                } while (a2.G());
            } finally {
                try {
                    return;
                } finally {
                }
            }
            return;
        }
        dVar.resumeWith(obj);
    }

    public static /* synthetic */ void c(d dVar, Object obj, j.x.c.l lVar, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            lVar = null;
        }
        b(dVar, obj, lVar);
    }
}
