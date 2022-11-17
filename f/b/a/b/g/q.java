package f.b.a.b.g;
/* loaded from: classes.dex */
final class q implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f2420e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ r f2421f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(r rVar, i iVar) {
        this.f2421f = rVar;
        this.f2420e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i0 i0Var;
        i0 i0Var2;
        i0 i0Var3;
        a aVar;
        i0 i0Var4;
        i0 i0Var5;
        if (this.f2420e.l()) {
            i0Var5 = this.f2421f.c;
            i0Var5.s();
            return;
        }
        try {
            aVar = this.f2421f.b;
            Object a = aVar.a(this.f2420e);
            i0Var4 = this.f2421f.c;
            i0Var4.r(a);
        } catch (g e2) {
            if (e2.getCause() instanceof Exception) {
                i0Var2 = this.f2421f.c;
                i0Var2.q((Exception) e2.getCause());
                return;
            }
            i0Var = this.f2421f.c;
            i0Var.q(e2);
        } catch (Exception e3) {
            i0Var3 = this.f2421f.c;
            i0Var3.q(e3);
        }
    }
}
