package f.b.a.b.g;

import com.google.android.gms.common.internal.p;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class i0<TResult> extends i<TResult> {
    private final Object a = new Object();
    private final f0<TResult> b = new f0<>();
    private boolean c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f2410d;

    /* renamed from: e  reason: collision with root package name */
    private TResult f2411e;

    /* renamed from: f  reason: collision with root package name */
    private Exception f2412f;

    private final void v() {
        p.l(this.c, "Task is not yet complete");
    }

    private final void w() {
        if (this.f2410d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    private final void x() {
        if (this.c) {
            throw b.a(this);
        }
    }

    private final void y() {
        synchronized (this.a) {
            if (this.c) {
                this.b.b(this);
            }
        }
    }

    @Override // f.b.a.b.g.i
    public final i<TResult> a(Executor executor, c cVar) {
        this.b.a(new v(executor, cVar));
        y();
        return this;
    }

    @Override // f.b.a.b.g.i
    public final i<TResult> b(d<TResult> dVar) {
        this.b.a(new x(k.a, dVar));
        y();
        return this;
    }

    @Override // f.b.a.b.g.i
    public final i<TResult> c(Executor executor, d<TResult> dVar) {
        this.b.a(new x(executor, dVar));
        y();
        return this;
    }

    @Override // f.b.a.b.g.i
    public final i<TResult> d(Executor executor, e eVar) {
        this.b.a(new z(executor, eVar));
        y();
        return this;
    }

    @Override // f.b.a.b.g.i
    public final i<TResult> e(Executor executor, f<? super TResult> fVar) {
        this.b.a(new b0(executor, fVar));
        y();
        return this;
    }

    @Override // f.b.a.b.g.i
    public final <TContinuationResult> i<TContinuationResult> f(a<TResult, TContinuationResult> aVar) {
        return g(k.a, aVar);
    }

    @Override // f.b.a.b.g.i
    public final <TContinuationResult> i<TContinuationResult> g(Executor executor, a<TResult, TContinuationResult> aVar) {
        i0 i0Var = new i0();
        this.b.a(new r(executor, aVar, i0Var));
        y();
        return i0Var;
    }

    @Override // f.b.a.b.g.i
    public final <TContinuationResult> i<TContinuationResult> h(Executor executor, a<TResult, i<TContinuationResult>> aVar) {
        i0 i0Var = new i0();
        this.b.a(new t(executor, aVar, i0Var));
        y();
        return i0Var;
    }

    @Override // f.b.a.b.g.i
    public final Exception i() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f2412f;
        }
        return exc;
    }

    @Override // f.b.a.b.g.i
    public final TResult j() {
        TResult tresult;
        synchronized (this.a) {
            v();
            w();
            Exception exc = this.f2412f;
            if (exc == null) {
                tresult = this.f2411e;
            } else {
                throw new g(exc);
            }
        }
        return tresult;
    }

    @Override // f.b.a.b.g.i
    public final <X extends Throwable> TResult k(Class<X> cls) {
        TResult tresult;
        synchronized (this.a) {
            v();
            w();
            if (!cls.isInstance(this.f2412f)) {
                Exception exc = this.f2412f;
                if (exc == null) {
                    tresult = this.f2411e;
                } else {
                    throw new g(exc);
                }
            } else {
                throw cls.cast(this.f2412f);
            }
        }
        return tresult;
    }

    @Override // f.b.a.b.g.i
    public final boolean l() {
        return this.f2410d;
    }

    @Override // f.b.a.b.g.i
    public final boolean m() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // f.b.a.b.g.i
    public final boolean n() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && !this.f2410d && this.f2412f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // f.b.a.b.g.i
    public final <TContinuationResult> i<TContinuationResult> o(h<TResult, TContinuationResult> hVar) {
        Executor executor = k.a;
        i0 i0Var = new i0();
        this.b.a(new d0(executor, hVar, i0Var));
        y();
        return i0Var;
    }

    @Override // f.b.a.b.g.i
    public final <TContinuationResult> i<TContinuationResult> p(Executor executor, h<TResult, TContinuationResult> hVar) {
        i0 i0Var = new i0();
        this.b.a(new d0(executor, hVar, i0Var));
        y();
        return i0Var;
    }

    public final void q(Exception exc) {
        p.j(exc, "Exception must not be null");
        synchronized (this.a) {
            x();
            this.c = true;
            this.f2412f = exc;
        }
        this.b.b(this);
    }

    public final void r(TResult tresult) {
        synchronized (this.a) {
            x();
            this.c = true;
            this.f2411e = tresult;
        }
        this.b.b(this);
    }

    public final boolean s() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f2410d = true;
            this.b.b(this);
            return true;
        }
    }

    public final boolean t(Exception exc) {
        p.j(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f2412f = exc;
            this.b.b(this);
            return true;
        }
    }

    public final boolean u(TResult tresult) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f2411e = tresult;
            this.b.b(this);
            return true;
        }
    }
}
