package kotlinx.coroutines;

import j.l;
import j.m;
import j.r;
import j.u.d;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.g;
/* loaded from: classes.dex */
public final class t0 {
    public static final <T> void a(s0<? super T> s0Var, int i2) {
        boolean z = true;
        if (o0.a()) {
            if (!(i2 != -1)) {
                throw new AssertionError();
            }
        }
        d<? super T> c = s0Var.c();
        if (i2 != 4) {
            z = false;
        }
        if (z || !(c instanceof g) || b(i2) != b(s0Var.f3919g)) {
            d(s0Var, c, z);
            return;
        }
        f0 f0Var = ((g) c).f3794h;
        j.u.g context = c.getContext();
        if (f0Var.x(context)) {
            f0Var.w(context, s0Var);
        } else {
            e(s0Var);
        }
    }

    public static final boolean b(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static final boolean c(int i2) {
        return i2 == 2;
    }

    public static final <T> void d(s0<? super T> s0Var, d<? super T> dVar, boolean z) {
        Object obj;
        Object h2 = s0Var.h();
        Throwable d2 = s0Var.d(h2);
        if (d2 != null) {
            l.a aVar = l.f3445e;
            obj = m.a(d2);
        } else {
            l.a aVar2 = l.f3445e;
            obj = s0Var.f(h2);
        }
        l.a(obj);
        if (z) {
            g gVar = (g) dVar;
            d<T> dVar2 = gVar.f3795i;
            Object obj2 = gVar.f3797k;
            j.u.g context = dVar2.getContext();
            Object c = d0.c(context, obj2);
            g2<?> e2 = c != d0.a ? e0.e(dVar2, context, c) : null;
            try {
                gVar.f3795i.resumeWith(obj);
                r rVar = r.a;
            } finally {
                if (e2 == null || e2.x0()) {
                    d0.a(context, c);
                }
            }
        } else {
            dVar.resumeWith(obj);
        }
    }

    private static final void e(s0<?> s0Var) {
        y0 a = e2.a.a();
        if (a.E()) {
            a.A(s0Var);
            return;
        }
        a.C(true);
        try {
            d(s0Var, s0Var.c(), true);
            do {
            } while (a.G());
        } finally {
            try {
            } finally {
            }
        }
    }
}
