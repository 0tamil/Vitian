package j.u;

import j.u.e;
import j.x.c.p;
import j.x.d.i;
import j.x.d.j;
/* loaded from: classes.dex */
public interface g {

    /* loaded from: classes.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: j.u.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0140a extends j implements p<g, b, g> {

            /* renamed from: e  reason: collision with root package name */
            public static final C0140a f3460e = new C0140a();

            C0140a() {
                super(2);
            }

            /* renamed from: a */
            public final g invoke(g gVar, b bVar) {
                j.u.c cVar;
                i.d(gVar, "acc");
                i.d(bVar, "element");
                g minusKey = gVar.minusKey(bVar.getKey());
                h hVar = h.f3461e;
                if (minusKey == hVar) {
                    return bVar;
                }
                e.b bVar2 = e.b;
                e eVar = (e) minusKey.get(bVar2);
                if (eVar == null) {
                    cVar = new j.u.c(minusKey, bVar);
                } else {
                    g minusKey2 = minusKey.minusKey(bVar2);
                    if (minusKey2 == hVar) {
                        return new j.u.c(bVar, eVar);
                    }
                    cVar = new j.u.c(new j.u.c(minusKey2, bVar), eVar);
                }
                return cVar;
            }
        }

        public static g a(g gVar, g gVar2) {
            i.d(gVar2, "context");
            return gVar2 == h.f3461e ? gVar : (g) gVar2.fold(gVar, C0140a.f3460e);
        }
    }

    /* loaded from: classes.dex */
    public interface b extends g {

        /* loaded from: classes.dex */
        public static final class a {
            public static <R> R a(b bVar, R r, p<? super R, ? super b, ? extends R> pVar) {
                i.d(pVar, "operation");
                return pVar.invoke(r, bVar);
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static <E extends b> E b(b bVar, c<E> cVar) {
                i.d(cVar, "key");
                if (i.a(bVar.getKey(), cVar)) {
                    return bVar;
                }
                return null;
            }

            public static g c(b bVar, c<?> cVar) {
                i.d(cVar, "key");
                return i.a(bVar.getKey(), cVar) ? h.f3461e : bVar;
            }

            public static g d(b bVar, g gVar) {
                i.d(gVar, "context");
                return a.a(bVar, gVar);
            }
        }

        @Override // j.u.g
        <E extends b> E get(c<E> cVar);

        c<?> getKey();
    }

    /* loaded from: classes.dex */
    public interface c<E extends b> {
    }

    <R> R fold(R r, p<? super R, ? super b, ? extends R> pVar);

    <E extends b> E get(c<E> cVar);

    g minusKey(c<?> cVar);

    g plus(g gVar);
}
