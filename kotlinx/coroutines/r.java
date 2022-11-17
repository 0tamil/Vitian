package kotlinx.coroutines;
/* loaded from: classes.dex */
public final class r extends p1 {

    /* renamed from: i  reason: collision with root package name */
    public final n<?> f3917i;

    public r(n<?> nVar) {
        this.f3917i = nVar;
    }

    @Override // j.x.c.l
    public /* bridge */ /* synthetic */ j.r invoke(Throwable th) {
        y(th);
        return j.r.a;
    }

    @Override // kotlinx.coroutines.a0
    public void y(Throwable th) {
        n<?> nVar = this.f3917i;
        nVar.E(nVar.v(z()));
    }
}
