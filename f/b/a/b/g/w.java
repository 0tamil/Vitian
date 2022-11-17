package f.b.a.b.g;
/* loaded from: classes.dex */
final class w implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f2425e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ x f2426f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(x xVar, i iVar) {
        this.f2426f = xVar;
        this.f2425e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        d dVar;
        d dVar2;
        obj = this.f2426f.b;
        synchronized (obj) {
            x xVar = this.f2426f;
            dVar = xVar.c;
            if (dVar != null) {
                dVar2 = xVar.c;
                dVar2.a(this.f2425e);
            }
        }
    }
}
