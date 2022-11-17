package kotlinx.coroutines.internal;

import j.u.d;
import j.u.j.a.e;
import kotlinx.coroutines.c;
import kotlinx.coroutines.c0;
import kotlinx.coroutines.n1;
import kotlinx.coroutines.s;
/* loaded from: classes.dex */
public class x<T> extends c<T> implements e {

    /* renamed from: g  reason: collision with root package name */
    public final d<T> f3818g;

    @Override // kotlinx.coroutines.u1
    protected final boolean T() {
        return true;
    }

    @Override // j.u.j.a.e
    public final e getCallerFrame() {
        d<T> dVar = this.f3818g;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @Override // j.u.j.a.e
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.c
    protected void s0(Object obj) {
        d<T> dVar = this.f3818g;
        dVar.resumeWith(c0.a(obj, dVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.coroutines.u1
    public void w(Object obj) {
        d b;
        b = j.u.i.c.b(this.f3818g);
        h.c(b, c0.a(obj, this.f3818g), null, 2, null);
    }

    public final n1 w0() {
        s N = N();
        if (N == null) {
            return null;
        }
        return N.getParent();
    }
}
