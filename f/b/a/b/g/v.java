package f.b.a.b.g;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class v<TResult> implements e0<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private c c;

    public v(Executor executor, c cVar) {
        this.a = executor;
        this.c = cVar;
    }

    @Override // f.b.a.b.g.e0
    public final void c(i<TResult> iVar) {
        if (iVar.l()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new u(this));
                }
            }
        }
    }
}
