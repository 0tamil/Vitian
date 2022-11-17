package kotlinx.coroutines;

import j.r;
import j.x.c.l;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m1 extends t1 {

    /* renamed from: i  reason: collision with root package name */
    private final l<Throwable, r> f3865i;

    /* JADX WARN: Multi-variable type inference failed */
    public m1(l<? super Throwable, r> lVar) {
        this.f3865i = lVar;
    }

    @Override // j.x.c.l
    public /* bridge */ /* synthetic */ r invoke(Throwable th) {
        y(th);
        return r.a;
    }

    @Override // kotlinx.coroutines.a0
    public void y(Throwable th) {
        this.f3865i.invoke(th);
    }
}
