package androidx.lifecycle;

import androidx.lifecycle.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements e {
    private final c[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompositeGeneratedAdaptersObserver(c[] cVarArr) {
        this.a = cVarArr;
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        k kVar = new k();
        for (c cVar : this.a) {
            cVar.a(gVar, bVar, false, kVar);
        }
        for (c cVar2 : this.a) {
            cVar2.a(gVar, bVar, true, kVar);
        }
    }
}
