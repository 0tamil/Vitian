package f.b.a.b.g;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class b0<TResult> implements e0<TResult> {
    private final Executor a;
    private final Object b = new Object();
    private f<? super TResult> c;

    public b0(Executor executor, f<? super TResult> fVar) {
        this.a = executor;
        this.c = fVar;
    }

    @Override // f.b.a.b.g.e0
    public final void c(i<TResult> iVar) {
        if (iVar.n()) {
            synchronized (this.b) {
                if (this.c != null) {
                    this.a.execute(new a0(this, iVar));
                }
            }
        }
    }
}
