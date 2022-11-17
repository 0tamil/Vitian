package f.b.c.z.n;

import f.b.c.e;
import f.b.c.w;
import f.b.c.x;
import f.b.c.z.c;
import f.b.c.z.i;
import java.lang.reflect.Type;
import java.util.Collection;
/* loaded from: classes.dex */
public final class b implements x {

    /* renamed from: e  reason: collision with root package name */
    private final c f2748e;

    /* loaded from: classes.dex */
    private static final class a<E> extends w<Collection<E>> {
        private final w<E> a;
        private final i<? extends Collection<E>> b;

        public a(e eVar, Type type, w<E> wVar, i<? extends Collection<E>> iVar) {
            this.a = new m(eVar, wVar, type);
            this.b = iVar;
        }

        /* renamed from: f */
        public Collection<E> c(f.b.c.b0.a aVar) {
            if (aVar.G() == f.b.c.b0.b.NULL) {
                aVar.C();
                return null;
            }
            Collection<E> a = this.b.a();
            aVar.b();
            while (aVar.q()) {
                a.add(this.a.c(aVar));
            }
            aVar.i();
            return a;
        }

        /* renamed from: g */
        public void e(f.b.c.b0.c cVar, Collection<E> collection) {
            if (collection == null) {
                cVar.t();
                return;
            }
            cVar.d();
            for (E e2 : collection) {
                this.a.e(cVar, e2);
            }
            cVar.i();
        }
    }

    public b(c cVar) {
        this.f2748e = cVar;
    }

    @Override // f.b.c.x
    public <T> w<T> create(e eVar, f.b.c.a0.a<T> aVar) {
        Type e2 = aVar.e();
        Class<? super T> c = aVar.c();
        if (!Collection.class.isAssignableFrom(c)) {
            return null;
        }
        Type h2 = f.b.c.z.b.h(e2, c);
        return new a(eVar, h2, eVar.j(f.b.c.a0.a.b(h2)), this.f2748e.a(aVar));
    }
}
