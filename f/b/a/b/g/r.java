package f.b.a.b.g;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class r<TResult, TContinuationResult> implements e0<TResult> {
    private final Executor a;
    private final a<TResult, TContinuationResult> b;
    private final i0<TContinuationResult> c;

    public r(Executor executor, a<TResult, TContinuationResult> aVar, i0<TContinuationResult> i0Var) {
        this.a = executor;
        this.b = aVar;
        this.c = i0Var;
    }

    @Override // f.b.a.b.g.e0
    public final void c(i<TResult> iVar) {
        this.a.execute(new q(this, iVar));
    }
}
