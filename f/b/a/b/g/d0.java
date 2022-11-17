package f.b.a.b.g;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class d0<TResult, TContinuationResult> implements f<TContinuationResult>, e, c, e0 {
    private final Executor a;
    private final h<TResult, TContinuationResult> b;
    private final i0<TContinuationResult> c;

    public d0(Executor executor, h<TResult, TContinuationResult> hVar, i0<TContinuationResult> i0Var) {
        this.a = executor;
        this.b = hVar;
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
        this.a.execute(new c0(this, iVar));
    }

    @Override // f.b.a.b.g.f
    public final void d(TContinuationResult tcontinuationresult) {
        this.c.r(tcontinuationresult);
    }
}
