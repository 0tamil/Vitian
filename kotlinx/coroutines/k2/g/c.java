package kotlinx.coroutines.k2.g;

import j.c0.f;
import j.l;
import j.r;
import j.u.g;
import j.u.h;
import j.u.j.a.d;
import j.u.j.a.e;
import j.x.c.p;
import j.x.d.j;
import kotlinx.coroutines.r1;
/* loaded from: classes.dex */
public final class c<T> extends d implements kotlinx.coroutines.k2.c<T>, e {

    /* renamed from: e  reason: collision with root package name */
    public final kotlinx.coroutines.k2.c<T> f3850e;

    /* renamed from: f  reason: collision with root package name */
    public final g f3851f;

    /* renamed from: g  reason: collision with root package name */
    public final int f3852g;

    /* renamed from: h  reason: collision with root package name */
    private g f3853h;

    /* renamed from: i  reason: collision with root package name */
    private j.u.d<? super r> f3854i;

    /* loaded from: classes.dex */
    static final class a extends j implements p<Integer, g.b, Integer> {

        /* renamed from: e  reason: collision with root package name */
        public static final a f3855e = new a();

        a() {
            super(2);
        }

        public final Integer a(int i2, g.b bVar) {
            return Integer.valueOf(i2 + 1);
        }

        @Override // j.x.c.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(kotlinx.coroutines.k2.c<? super T> cVar, g gVar) {
        super(b.f3848e, h.f3461e);
        this.f3850e = cVar;
        this.f3851f = gVar;
        this.f3852g = ((Number) gVar.fold(0, a.f3855e)).intValue();
    }

    private final void b(g gVar, g gVar2, T t) {
        if (!(gVar2 instanceof kotlinx.coroutines.k2.g.a)) {
            e.a(this, gVar);
            this.f3853h = gVar;
            return;
        }
        d((kotlinx.coroutines.k2.g.a) gVar2, t);
        throw null;
    }

    private final Object c(j.u.d<? super r> dVar, T t) {
        g context = dVar.getContext();
        r1.d(context);
        g gVar = this.f3853h;
        if (gVar != context) {
            b(context, gVar, t);
        }
        this.f3854i = dVar;
        return d.a().h(this.f3850e, t, this);
    }

    private final void d(kotlinx.coroutines.k2.g.a aVar, Object obj) {
        String e2;
        e2 = f.e("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + aVar.f3846e + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(e2.toString());
    }

    @Override // kotlinx.coroutines.k2.c
    public Object emit(T t, j.u.d<? super r> dVar) {
        Object c;
        Object c2;
        try {
            Object c3 = c(dVar, t);
            c = j.u.i.d.c();
            if (c3 == c) {
                j.u.j.a.h.c(dVar);
            }
            c2 = j.u.i.d.c();
            return c3 == c2 ? c3 : r.a;
        } catch (Throwable th) {
            this.f3853h = new kotlinx.coroutines.k2.g.a(th);
            throw th;
        }
    }

    @Override // j.u.j.a.a, j.u.j.a.e
    public e getCallerFrame() {
        j.u.d<? super r> dVar = this.f3854i;
        if (dVar instanceof e) {
            return (e) dVar;
        }
        return null;
    }

    @Override // j.u.j.a.d, j.u.d
    public g getContext() {
        j.u.d<? super r> dVar = this.f3854i;
        g context = dVar == null ? null : dVar.getContext();
        return context == null ? h.f3461e : context;
    }

    @Override // j.u.j.a.a, j.u.j.a.e
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // j.u.j.a.a
    public Object invokeSuspend(Object obj) {
        Object c;
        Throwable b = l.b(obj);
        if (b != null) {
            this.f3853h = new kotlinx.coroutines.k2.g.a(b);
        }
        j.u.d<? super r> dVar = this.f3854i;
        if (dVar != null) {
            dVar.resumeWith(obj);
        }
        c = j.u.i.d.c();
        return c;
    }

    @Override // j.u.j.a.d, j.u.j.a.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
