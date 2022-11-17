package f.b.a.b.g;
/* loaded from: classes.dex */
final class u implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ v f2424e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(v vVar) {
        this.f2424e = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        c cVar;
        c cVar2;
        obj = this.f2424e.b;
        synchronized (obj) {
            v vVar = this.f2424e;
            cVar = vVar.c;
            if (cVar != null) {
                cVar2 = vVar.c;
                cVar2.a();
            }
        }
    }
}
