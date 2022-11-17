package kotlinx.coroutines;

import j.u.d;
import j.u.g;
import j.x.c.p;
import j.x.d.i;
/* loaded from: classes.dex */
public abstract class c<T> extends u1 implements n1, d<T>, k0 {

    /* renamed from: f  reason: collision with root package name */
    private final g f3773f;

    public c(g gVar, boolean z, boolean z2) {
        super(z2);
        if (z) {
            R((n1) gVar.get(n1.f3911d));
        }
        this.f3773f = gVar.plus(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.u1
    public String B() {
        return i.i(p0.a(this), " was cancelled");
    }

    @Override // kotlinx.coroutines.u1
    public final void Q(Throwable th) {
        h0.a(this.f3773f, th);
    }

    @Override // kotlinx.coroutines.u1
    public String X() {
        String b = e0.b(this.f3773f);
        if (b == null) {
            return super.X();
        }
        return '\"' + b + "\":" + super.X();
    }

    @Override // kotlinx.coroutines.u1, kotlinx.coroutines.n1
    public boolean b() {
        return super.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.u1
    protected final void c0(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            t0(yVar.a, yVar.a());
            return;
        }
        u0(obj);
    }

    @Override // kotlinx.coroutines.k0
    public g g() {
        return this.f3773f;
    }

    @Override // j.u.d
    public final g getContext() {
        return this.f3773f;
    }

    @Override // j.u.d
    public final void resumeWith(Object obj) {
        Object V = V(c0.d(obj, null, 1, null));
        if (V != v1.b) {
            s0(V);
        }
    }

    protected void s0(Object obj) {
        w(obj);
    }

    protected void t0(Throwable th, boolean z) {
    }

    protected void u0(T t) {
    }

    public final <R> void v0(m0 m0Var, R r, p<? super R, ? super d<? super T>, ? extends Object> pVar) {
        m0Var.c(pVar, r, this);
    }
}
