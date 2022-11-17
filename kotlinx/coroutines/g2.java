package kotlinx.coroutines;

import j.r;
import j.u.d;
import j.u.g;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.x;
/* loaded from: classes.dex */
public final class g2<T> extends x<T> {

    /* renamed from: h  reason: collision with root package name */
    private g f3780h;

    /* renamed from: i  reason: collision with root package name */
    private Object f3781i;

    @Override // kotlinx.coroutines.internal.x, kotlinx.coroutines.c
    protected void s0(Object obj) {
        g gVar = this.f3780h;
        g2<?> g2Var = null;
        if (gVar != null) {
            d0.a(gVar, this.f3781i);
            this.f3780h = null;
            this.f3781i = null;
        }
        Object a = c0.a(obj, this.f3818g);
        d<T> dVar = this.f3818g;
        g context = dVar.getContext();
        Object c = d0.c(context, null);
        if (c != d0.a) {
            g2Var = e0.e(dVar, context, c);
        }
        try {
            this.f3818g.resumeWith(a);
            r rVar = r.a;
        } finally {
            if (g2Var == null || g2Var.x0()) {
                d0.a(context, c);
            }
        }
    }

    public final boolean x0() {
        if (this.f3780h == null) {
            return false;
        }
        this.f3780h = null;
        this.f3781i = null;
        return true;
    }

    public final void y0(g gVar, Object obj) {
        this.f3780h = gVar;
        this.f3781i = obj;
    }
}
