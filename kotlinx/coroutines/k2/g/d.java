package kotlinx.coroutines.k2.g;

import j.r;
import j.x.c.q;
import j.x.d.h;
import j.x.d.n;
import kotlinx.coroutines.k2.c;
/* loaded from: classes.dex */
public final class d {
    private static final q<c<Object>, Object, j.u.d<? super r>, Object> a;

    /* loaded from: classes.dex */
    /* synthetic */ class a extends h implements q<c<? super Object>, Object, r> {

        /* renamed from: e  reason: collision with root package name */
        public static final a f3856e = new a();

        a() {
            super(3, c.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        /* renamed from: b */
        public final Object h(c<Object> cVar, Object obj, j.u.d<? super r> dVar) {
            return cVar.emit(obj, dVar);
        }
    }

    static {
        a aVar = a.f3856e;
        n.a(aVar, 3);
        a = aVar;
    }

    public static final /* synthetic */ q a() {
        return a;
    }
}
