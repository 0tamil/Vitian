package kotlinx.coroutines.k2;

import j.m;
import j.r;
import j.u.j.a.d;
import j.u.j.a.f;
import kotlinx.coroutines.k2.g.c;
/* loaded from: classes.dex */
public abstract class a<T> implements b<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "kotlinx.coroutines.flow.AbstractFlow", f = "Flow.kt", l = {212}, m = "collect")
    /* renamed from: kotlinx.coroutines.k2.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0154a extends d {

        /* renamed from: e  reason: collision with root package name */
        Object f3841e;

        /* renamed from: f  reason: collision with root package name */
        /* synthetic */ Object f3842f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ a<T> f3843g;

        /* renamed from: h  reason: collision with root package name */
        int f3844h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0154a(a<T> aVar, j.u.d<? super C0154a> dVar) {
            super(dVar);
            this.f3843g = aVar;
        }

        @Override // j.u.j.a.a
        public final Object invokeSuspend(Object obj) {
            this.f3842f = obj;
            this.f3844h |= Integer.MIN_VALUE;
            return this.f3843g.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    @Override // kotlinx.coroutines.k2.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c<? super T> cVar, j.u.d<? super r> dVar) {
        C0154a aVar;
        Object c;
        int i2;
        Throwable th;
        c cVar2;
        if (dVar instanceof C0154a) {
            aVar = (C0154a) dVar;
            int i3 = aVar.f3844h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                aVar.f3844h = i3 - Integer.MIN_VALUE;
                Object obj = aVar.f3842f;
                c = j.u.i.d.c();
                i2 = aVar.f3844h;
                if (i2 != 0) {
                    m.b(obj);
                    c<? super T> cVar3 = new c<>(cVar, aVar.getContext());
                    try {
                        aVar.f3841e = cVar3;
                        aVar.f3844h = 1;
                        if (b(cVar3, aVar) == c) {
                            return c;
                        }
                        cVar2 = cVar3;
                    } catch (Throwable th2) {
                        th = th2;
                        cVar2 = cVar3;
                        cVar2.releaseIntercepted();
                        throw th;
                    }
                } else if (i2 == 1) {
                    cVar2 = (c) aVar.f3841e;
                    try {
                        m.b(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        cVar2.releaseIntercepted();
                        throw th;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                cVar2.releaseIntercepted();
                return r.a;
            }
        }
        aVar = new C0154a(this, dVar);
        Object obj2 = aVar.f3842f;
        c = j.u.i.d.c();
        i2 = aVar.f3844h;
        if (i2 != 0) {
        }
        cVar2.releaseIntercepted();
        return r.a;
    }

    public abstract Object b(c<? super T> cVar, j.u.d<? super r> dVar);
}
