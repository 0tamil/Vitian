package f.b.a.b.g;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class s implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f2422e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ t f2423f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(t tVar, i iVar) {
        this.f2423f = tVar;
        this.f2422e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0 i0Var;
        i0 i0Var2;
        i0 i0Var3;
        a aVar;
        try {
            aVar = this.f2423f.b;
            i iVar = (i) aVar.a(this.f2422e);
            if (iVar == null) {
                this.f2423f.b(new NullPointerException("Continuation returned null"));
                return;
            }
            Executor executor = k.b;
            iVar.e(executor, this.f2423f);
            iVar.d(executor, this.f2423f);
            iVar.a(executor, this.f2423f);
        } catch (g e2) {
            if (e2.getCause() instanceof Exception) {
                i0Var2 = this.f2423f.c;
                i0Var2.q((Exception) e2.getCause());
                return;
            }
            i0Var = this.f2423f.c;
            i0Var.q(e2);
        } catch (Exception e3) {
            i0Var3 = this.f2423f.c;
            i0Var3.q(e3);
        }
    }
}
