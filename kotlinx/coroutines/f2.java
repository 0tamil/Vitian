package kotlinx.coroutines;

import j.u.g;
/* loaded from: classes.dex */
public final class f2 extends f0 {

    /* renamed from: f  reason: collision with root package name */
    public static final f2 f3779f = new f2();

    private f2() {
    }

    @Override // kotlinx.coroutines.f0
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // kotlinx.coroutines.f0
    public void w(g gVar, Runnable runnable) {
        i2 i2Var = (i2) gVar.get(i2.f3787f);
        if (i2Var != null) {
            i2Var.f3788e = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // kotlinx.coroutines.f0
    public boolean x(g gVar) {
        return false;
    }
}
