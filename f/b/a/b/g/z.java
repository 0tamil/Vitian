package f.b.a.b.g;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class z<TResult> implements e0<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private e c;

    public z(Executor executor, e eVar) {
        this.a = executor;
        this.c = eVar;
    }

    @Override // f.b.a.b.g.e0
    public final void c(i<TResult> iVar) {
        if (!iVar.n() && !iVar.l()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new y(this, iVar));
                }
            }
        }
    }
}
