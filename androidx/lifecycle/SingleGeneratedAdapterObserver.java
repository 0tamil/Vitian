package androidx.lifecycle;

import androidx.lifecycle.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SingleGeneratedAdapterObserver implements e {
    private final c a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SingleGeneratedAdapterObserver(c cVar) {
        this.a = cVar;
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        this.a.a(gVar, bVar, false, null);
        this.a.a(gVar, bVar, true, null);
    }
}
