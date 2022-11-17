package kotlinx.coroutines.k2.g;

import j.u.g;
import j.x.c.p;
import j.x.d.e;
/* loaded from: classes.dex */
public final class a implements g.b {

    /* renamed from: g  reason: collision with root package name */
    public static final C0155a f3845g = new C0155a(null);

    /* renamed from: e  reason: collision with root package name */
    public final Throwable f3846e;

    /* renamed from: f  reason: collision with root package name */
    private final g.c<?> f3847f = f3845g;

    /* renamed from: kotlinx.coroutines.k2.g.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0155a implements g.c<a> {
        private C0155a() {
        }

        public /* synthetic */ C0155a(e eVar) {
            this();
        }
    }

    public a(Throwable th) {
        this.f3846e = th;
    }

    @Override // j.u.g
    public <R> R fold(R r, p<? super R, ? super g.b, ? extends R> pVar) {
        return (R) g.b.a.a(this, r, pVar);
    }

    @Override // j.u.g.b, j.u.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) g.b.a.b(this, cVar);
    }

    @Override // j.u.g.b
    public g.c<?> getKey() {
        return this.f3847f;
    }

    @Override // j.u.g
    public g minusKey(g.c<?> cVar) {
        return g.b.a.c(this, cVar);
    }

    @Override // j.u.g
    public g plus(g gVar) {
        return g.b.a.d(this, gVar);
    }
}
