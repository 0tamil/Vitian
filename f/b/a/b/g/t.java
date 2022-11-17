package f.b.a.b.g;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class t<TResult, TContinuationResult> implements f<TContinuationResult>, e, c, e0 {
    private final Executor a;
    private final a<TResult, i<TContinuationResult>> b;
    private final i0<TContinuationResult> c;

    public t(Executor executor, a<TResult, i<TContinuationResult>> aVar, i0<TContinuationResult> i0Var) {
        this.a = executor;
        this.b = aVar;
        this.c = i0Var;
    }

    @Override // f.b.a.b.g.c
    public final void a() {
        this.c.s();
    }

    @Override // f.b.a.b.g.e
    public final void b(Exception exc) {
        this.c.q(exc);
    }

    @Override // f.b.a.b.g.e0
    public final void c(i<TResult> iVar) {
        this.a.execute(new s(this, iVar));
    }

    @Override // f.b.a.b.g.f
    public final void d(TContinuationResult tcontinuationresult) {
        this.c.r(tcontinuationresult);
    }
}
