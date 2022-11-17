package kotlinx.coroutines;

import j.b;
import j.l;
import j.m;
import j.r;
import j.u.d;
import j.u.j.a.e;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.g;
import kotlinx.coroutines.internal.y;
import kotlinx.coroutines.m2.i;
import kotlinx.coroutines.m2.j;
/* loaded from: classes.dex */
public abstract class s0<T> extends i {

    /* renamed from: g  reason: collision with root package name */
    public int f3919g;

    public s0(int i2) {
        this.f3919g = i2;
    }

    public void b(Object obj, Throwable th) {
    }

    public abstract d<T> c();

    public Throwable d(Object obj) {
        y yVar = obj instanceof y ? (y) obj : null;
        if (yVar == null) {
            return null;
        }
        return yVar.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T f(Object obj) {
        return obj;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                b.a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            j.x.d.i.b(th);
            h0.a(c().getContext(), new n0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    public abstract Object h();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object f2;
        if (o0.a()) {
            if (!(this.f3919g != -1)) {
                throw new AssertionError();
            }
        }
        j jVar = this.f3901f;
        try {
            g gVar = (g) c();
            d<T> dVar = gVar.f3795i;
            Object obj2 = gVar.f3797k;
            j.u.g context = dVar.getContext();
            Object c = d0.c(context, obj2);
            g2<?> e2 = c != d0.a ? e0.e(dVar, context, c) : null;
            j.u.g context2 = dVar.getContext();
            Object h2 = h();
            Throwable d2 = d(h2);
            n1 n1Var = (d2 != null || !t0.b(this.f3919g)) ? null : (n1) context2.get(n1.f3911d);
            if (n1Var != null && !n1Var.b()) {
                Throwable h3 = n1Var.h();
                b(h2, h3);
                l.a aVar = l.f3445e;
                if (o0.d() && (dVar instanceof e)) {
                    h3 = y.a(h3, (e) dVar);
                }
                f2 = m.a(h3);
                l.a(f2);
            } else if (d2 != null) {
                l.a aVar2 = l.f3445e;
                f2 = m.a(d2);
                l.a(f2);
            } else {
                f2 = f(h2);
                l.a aVar3 = l.f3445e;
                l.a(f2);
            }
            dVar.resumeWith(f2);
            Object obj3 = r.a;
            if (e2 == null || e2.x0()) {
                d0.a(context, c);
            }
            try {
                l.a aVar4 = l.f3445e;
                jVar.t();
                l.a(obj3);
            } catch (Throwable th) {
                l.a aVar5 = l.f3445e;
                obj3 = m.a(th);
                l.a(obj3);
            }
            g(null, l.b(obj3));
        } catch (Throwable th2) {
            try {
                l.a aVar6 = l.f3445e;
                jVar.t();
                obj = r.a;
                l.a(obj);
            } catch (Throwable th3) {
                l.a aVar7 = l.f3445e;
                obj = m.a(th3);
                l.a(obj);
            }
            g(th2, l.b(obj));
        }
    }
}
