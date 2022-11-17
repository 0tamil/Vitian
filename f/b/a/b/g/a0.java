package f.b.a.b.g;
/* loaded from: classes.dex */
final class a0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f2405e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ b0 f2406f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a0(b0 b0Var, i iVar) {
        this.f2406f = b0Var;
        this.f2405e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        f fVar;
        f fVar2;
        obj = this.f2406f.b;
        synchronized (obj) {
            b0 b0Var = this.f2406f;
            fVar = b0Var.c;
            if (fVar != null) {
                fVar2 = b0Var.c;
                fVar2.d(this.f2405e.j());
            }
        }
    }
}
