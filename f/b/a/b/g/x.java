package f.b.a.b.g;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class x<TResult> implements e0<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private d<TResult> c;

    public x(Executor executor, d<TResult> dVar) {
        this.a = executor;
        this.c = dVar;
    }

    @Override // f.b.a.b.g.e0
    public final void c(i<TResult> iVar) {
        synchronized (this.b) {
            if (this.c != null) {
                this.a.execute(new w(this, iVar));
            }
        }
    }
}
