package kotlinx.coroutines;

import j.r;
/* loaded from: classes.dex */
public final class t extends p1 implements s {

    /* renamed from: i  reason: collision with root package name */
    public final u f3920i;

    public t(u uVar) {
        this.f3920i = uVar;
    }

    @Override // kotlinx.coroutines.s
    public boolean e(Throwable th) {
        return z().C(th);
    }

    @Override // kotlinx.coroutines.s
    public n1 getParent() {
        return z();
    }

    @Override // j.x.c.l
    public /* bridge */ /* synthetic */ r invoke(Throwable th) {
        y(th);
        return r.a;
    }

    @Override // kotlinx.coroutines.a0
    public void y(Throwable th) {
        this.f3920i.n(z());
    }
}
