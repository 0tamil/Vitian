package j.u;

import j.u.g;
import j.x.d.i;
/* loaded from: classes.dex */
public interface e extends g.b {
    public static final b b = b.f3459e;

    /* loaded from: classes.dex */
    public static final class a {
        public static <E extends g.b> E a(e eVar, g.c<E> cVar) {
            i.d(cVar, "key");
            if (cVar instanceof j.u.b) {
                j.u.b bVar = (j.u.b) cVar;
                if (!bVar.a(eVar.getKey())) {
                    return null;
                }
                E e2 = (E) bVar.b(eVar);
                if (e2 instanceof g.b) {
                    return e2;
                }
                return null;
            } else if (e.b == cVar) {
                return eVar;
            } else {
                return null;
            }
        }

        public static g b(e eVar, g.c<?> cVar) {
            i.d(cVar, "key");
            if (!(cVar instanceof j.u.b)) {
                return e.b == cVar ? h.f3461e : eVar;
            }
            j.u.b bVar = (j.u.b) cVar;
            return (!bVar.a(eVar.getKey()) || bVar.b(eVar) == null) ? eVar : h.f3461e;
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g.c<e> {

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ b f3459e = new b();

        private b() {
        }
    }

    void c(d<?> dVar);

    <T> d<T> i(d<? super T> dVar);
}
