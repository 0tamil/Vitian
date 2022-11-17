package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.d;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements e {
    private final Object a;
    private final a.C0022a b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.a = obj;
        this.b = a.c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.e
    public void d(g gVar, d.b bVar) {
        this.b.a(gVar, bVar, this.a);
    }
}
