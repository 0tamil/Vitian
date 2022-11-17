package f.b.c.z.n;

import f.b.c.b0.c;
import f.b.c.e;
import f.b.c.i;
import f.b.c.j;
import f.b.c.k;
import f.b.c.q;
import f.b.c.r;
import f.b.c.w;
import f.b.c.x;
/* loaded from: classes.dex */
public final class l<T> extends w<T> {
    private final r<T> a;
    private final j<T> b;
    final e c;

    /* renamed from: d  reason: collision with root package name */
    private final f.b.c.a0.a<T> f2766d;

    /* renamed from: e  reason: collision with root package name */
    private final x f2767e;

    /* renamed from: f  reason: collision with root package name */
    private final l<T>.b f2768f = new b();

    /* renamed from: g  reason: collision with root package name */
    private w<T> f2769g;

    /* loaded from: classes.dex */
    private final class b implements q, i {
        private b(l lVar) {
        }
    }

    public l(r<T> rVar, j<T> jVar, e eVar, f.b.c.a0.a<T> aVar, x xVar) {
        this.a = rVar;
        this.b = jVar;
        this.c = eVar;
        this.f2766d = aVar;
        this.f2767e = xVar;
    }

    private w<T> f() {
        w<T> wVar = this.f2769g;
        if (wVar != null) {
            return wVar;
        }
        w<T> l = this.c.l(this.f2767e, this.f2766d);
        this.f2769g = l;
        return l;
    }

    @Override // f.b.c.w
    public T c(f.b.c.b0.a aVar) {
        if (this.b == null) {
            return f().c(aVar);
        }
        k a2 = f.b.c.z.l.a(aVar);
        if (a2.m()) {
            return null;
        }
        return this.b.a(a2, this.f2766d.e(), this.f2768f);
    }

    @Override // f.b.c.w
    public void e(c cVar, T t) {
        r<T> rVar = this.a;
        if (rVar == null) {
            f().e(cVar, t);
        } else if (t == null) {
            cVar.t();
        } else {
            f.b.c.z.l.b(rVar.a(t, this.f2766d.e(), this.f2768f), cVar);
        }
    }
}
