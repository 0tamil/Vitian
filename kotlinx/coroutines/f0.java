package kotlinx.coroutines;

import j.u.b;
import j.u.d;
import j.u.e;
import j.u.g;
import j.x.c.l;
import j.x.d.j;
/* loaded from: classes.dex */
public abstract class f0 extends j.u.a implements e {

    /* renamed from: e  reason: collision with root package name */
    public static final a f3776e = new a(null);

    /* loaded from: classes.dex */
    public static final class a extends b<e, f0> {

        /* renamed from: kotlinx.coroutines.f0$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0152a extends j implements l<g.b, f0> {

            /* renamed from: e  reason: collision with root package name */
            public static final C0152a f3777e = new C0152a();

            C0152a() {
                super(1);
            }

            /* renamed from: a */
            public final f0 invoke(g.b bVar) {
                if (bVar instanceof f0) {
                    return (f0) bVar;
                }
                return null;
            }
        }

        private a() {
            super(e.b, C0152a.f3777e);
        }

        public /* synthetic */ a(j.x.d.e eVar) {
            this();
        }
    }

    public f0() {
        super(e.b);
    }

    @Override // j.u.e
    public final void c(d<?> dVar) {
        ((kotlinx.coroutines.internal.g) dVar).r();
    }

    @Override // j.u.a, j.u.g.b, j.u.g
    public <E extends g.b> E get(g.c<E> cVar) {
        return (E) e.a.a(this, cVar);
    }

    @Override // j.u.e
    public final <T> d<T> i(d<? super T> dVar) {
        return new kotlinx.coroutines.internal.g(this, dVar);
    }

    @Override // j.u.a, j.u.g
    public g minusKey(g.c<?> cVar) {
        return e.a.b(this, cVar);
    }

    public String toString() {
        return p0.a(this) + '@' + p0.b(this);
    }

    public abstract void w(g gVar, Runnable runnable);

    public boolean x(g gVar) {
        return true;
    }
}
