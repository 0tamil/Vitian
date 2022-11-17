package kotlinx.coroutines.internal;

import j.u.g;
import j.x.c.p;
import j.x.d.i;
import j.x.d.j;
import java.util.Objects;
import kotlinx.coroutines.d2;
/* loaded from: classes.dex */
public final class d0 {
    public static final z a = new z("NO_THREAD_ELEMENTS");
    private static final p<Object, g.b, Object> b = a.f3790e;
    private static final p<d2<?>, g.b, d2<?>> c = b.f3791e;

    /* renamed from: d  reason: collision with root package name */
    private static final p<g0, g.b, g0> f3789d = c.f3792e;

    /* loaded from: classes.dex */
    static final class a extends j implements p<Object, g.b, Object> {

        /* renamed from: e  reason: collision with root package name */
        public static final a f3790e = new a();

        a() {
            super(2);
        }

        /* renamed from: a */
        public final Object invoke(Object obj, g.b bVar) {
            if (!(bVar instanceof d2)) {
                return obj;
            }
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            int intValue = num == null ? 1 : num.intValue();
            return intValue == 0 ? bVar : Integer.valueOf(intValue + 1);
        }
    }

    /* loaded from: classes.dex */
    static final class b extends j implements p<d2<?>, g.b, d2<?>> {

        /* renamed from: e  reason: collision with root package name */
        public static final b f3791e = new b();

        b() {
            super(2);
        }

        /* renamed from: a */
        public final d2<?> invoke(d2<?> d2Var, g.b bVar) {
            if (d2Var != null) {
                return d2Var;
            }
            if (bVar instanceof d2) {
                return (d2) bVar;
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static final class c extends j implements p<g0, g.b, g0> {

        /* renamed from: e  reason: collision with root package name */
        public static final c f3792e = new c();

        c() {
            super(2);
        }

        public final g0 a(g0 g0Var, g.b bVar) {
            if (bVar instanceof d2) {
                d2<?> d2Var = (d2) bVar;
                g0Var.a(d2Var, d2Var.q(g0Var.a));
            }
            return g0Var;
        }

        @Override // j.x.c.p
        public /* bridge */ /* synthetic */ g0 invoke(g0 g0Var, g.b bVar) {
            g0 g0Var2 = g0Var;
            a(g0Var2, bVar);
            return g0Var2;
        }
    }

    public static final void a(g gVar, Object obj) {
        if (obj != a) {
            if (obj instanceof g0) {
                ((g0) obj).b(gVar);
                return;
            }
            Object fold = gVar.fold(null, c);
            Objects.requireNonNull(fold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
            ((d2) fold).o(gVar, obj);
        }
    }

    public static final Object b(g gVar) {
        Object fold = gVar.fold(0, b);
        i.b(fold);
        return fold;
    }

    public static final Object c(g gVar, Object obj) {
        if (obj == null) {
            obj = b(gVar);
        }
        return obj == 0 ? a : obj instanceof Integer ? gVar.fold(new g0(gVar, ((Number) obj).intValue()), f3789d) : ((d2) obj).q(gVar);
    }
}
