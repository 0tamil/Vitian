package kotlinx.coroutines;

import j.r;
import j.x.c.l;
/* loaded from: classes.dex */
final class k1 extends k {

    /* renamed from: e  reason: collision with root package name */
    private final l<Throwable, r> f3840e;

    /* JADX WARN: Multi-variable type inference failed */
    public k1(l<? super Throwable, r> lVar) {
        this.f3840e = lVar;
    }

    @Override // kotlinx.coroutines.l
    public void a(Throwable th) {
        this.f3840e.invoke(th);
    }

    @Override // j.x.c.l
    public /* bridge */ /* synthetic */ r invoke(Throwable th) {
        a(th);
        return r.a;
    }

    public String toString() {
        return "InvokeOnCancel[" + p0.a(this.f3840e) + '@' + p0.b(this) + ']';
    }
}
