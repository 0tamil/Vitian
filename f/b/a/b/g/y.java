package f.b.a.b.g;

import com.google.android.gms.common.internal.p;
/* loaded from: classes.dex */
final class y implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ i f2427e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ z f2428f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public y(z zVar, i iVar) {
        this.f2428f = zVar;
        this.f2427e = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        e eVar;
        e eVar2;
        obj = this.f2428f.b;
        synchronized (obj) {
            z zVar = this.f2428f;
            eVar = zVar.c;
            if (eVar != null) {
                eVar2 = zVar.c;
                Exception i2 = this.f2427e.i();
                p.i(i2);
                eVar2.b(i2);
            }
        }
    }
}
