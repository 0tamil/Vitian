package kotlinx.coroutines;

import j.x.d.i;
/* loaded from: classes.dex */
public abstract class t1 extends a0 implements w0, i1 {

    /* renamed from: h  reason: collision with root package name */
    public u1 f3921h;

    public final void A(u1 u1Var) {
        this.f3921h = u1Var;
    }

    @Override // kotlinx.coroutines.w0
    public void a() {
        z().g0(this);
    }

    @Override // kotlinx.coroutines.i1
    public boolean b() {
        return true;
    }

    @Override // kotlinx.coroutines.i1
    public y1 f() {
        return null;
    }

    @Override // kotlinx.coroutines.internal.o
    public String toString() {
        return p0.a(this) + '@' + p0.b(this) + "[job@" + p0.b(z()) + ']';
    }

    public final u1 z() {
        u1 u1Var = this.f3921h;
        if (u1Var != null) {
            return u1Var;
        }
        i.m("job");
        throw null;
    }
}
