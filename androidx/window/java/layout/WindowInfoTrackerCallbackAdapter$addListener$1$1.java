package androidx.window.java.layout;

import e.d.o.a;
import j.m;
import j.r;
import j.u.d;
import j.u.j.a.f;
import j.u.j.a.k;
import j.x.c.p;
import kotlinx.coroutines.k0;
import kotlinx.coroutines.k2.b;
import kotlinx.coroutines.k2.c;
@f(c = "androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1", f = "WindowInfoTrackerCallbackAdapter.kt", l = {96}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WindowInfoTrackerCallbackAdapter$addListener$1$1 extends k implements p<k0, d<? super r>, Object> {
    final /* synthetic */ a<T> $consumer;
    final /* synthetic */ b<T> $flow;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WindowInfoTrackerCallbackAdapter$addListener$1$1(b<? extends T> bVar, a<T> aVar, d<? super WindowInfoTrackerCallbackAdapter$addListener$1$1> dVar) {
        super(2, dVar);
        this.$flow = bVar;
        this.$consumer = aVar;
    }

    @Override // j.u.j.a.a
    public final d<r> create(Object obj, d<?> dVar) {
        return new WindowInfoTrackerCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, dVar);
    }

    public final Object invoke(k0 k0Var, d<? super r> dVar) {
        return ((WindowInfoTrackerCallbackAdapter$addListener$1$1) create(k0Var, dVar)).invokeSuspend(r.a);
    }

    @Override // j.u.j.a.a
    public final Object invokeSuspend(Object obj) {
        Object c;
        c = j.u.i.d.c();
        int i2 = this.label;
        if (i2 == 0) {
            m.b(obj);
            b<T> bVar = this.$flow;
            final a<T> aVar = this.$consumer;
            Object windowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1 = new c<T>() { // from class: androidx.window.java.layout.WindowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1
                @Override // kotlinx.coroutines.k2.c
                public Object emit(T t, d<? super r> dVar) {
                    a.this.accept(t);
                    return r.a;
                }
            };
            this.label = 1;
            if (bVar.a(windowInfoTrackerCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1, this) == c) {
                return c;
            }
        } else if (i2 == 1) {
            m.b(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return r.a;
    }
}
