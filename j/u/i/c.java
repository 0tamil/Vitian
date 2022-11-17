package j.u.i;

import j.m;
import j.r;
import j.u.d;
import j.u.g;
import j.u.j.a.h;
import j.u.j.a.j;
import j.x.c.p;
import j.x.d.i;
import j.x.d.n;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c {

    /* loaded from: classes.dex */
    public static final class a extends j {

        /* renamed from: e  reason: collision with root package name */
        private int f3466e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p f3467f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Object f3468g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(d dVar, p pVar, Object obj) {
            super(dVar);
            this.f3467f = pVar;
            this.f3468g = obj;
        }

        @Override // j.u.j.a.a
        protected Object invokeSuspend(Object obj) {
            int i2 = this.f3466e;
            if (i2 == 0) {
                this.f3466e = 1;
                m.b(obj);
                p pVar = this.f3467f;
                n.a(pVar, 2);
                return pVar.invoke(this.f3468g, this);
            } else if (i2 == 1) {
                this.f3466e = 2;
                m.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends j.u.j.a.d {

        /* renamed from: e  reason: collision with root package name */
        private int f3469e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ p f3470f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ Object f3471g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar, g gVar, p pVar, Object obj) {
            super(dVar, gVar);
            this.f3470f = pVar;
            this.f3471g = obj;
        }

        @Override // j.u.j.a.a
        protected Object invokeSuspend(Object obj) {
            int i2 = this.f3469e;
            if (i2 == 0) {
                this.f3469e = 1;
                m.b(obj);
                p pVar = this.f3470f;
                n.a(pVar, 2);
                return pVar.invoke(this.f3471g, this);
            } else if (i2 == 1) {
                this.f3469e = 2;
                m.b(obj);
                return obj;
            } else {
                throw new IllegalStateException("This coroutine had already completed".toString());
            }
        }
    }

    public static <R, T> d<r> a(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r, d<? super T> dVar) {
        i.d(pVar, "<this>");
        i.d(dVar, "completion");
        h.a(dVar);
        if (pVar instanceof j.u.j.a.a) {
            return ((j.u.j.a.a) pVar).create(r, dVar);
        }
        g context = dVar.getContext();
        return context == j.u.h.f3461e ? new a(dVar, pVar, r) : new b(dVar, context, pVar, r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> d<T> b(d<? super T> dVar) {
        d<T> dVar2;
        i.d(dVar, "<this>");
        j.u.j.a.d dVar3 = dVar instanceof j.u.j.a.d ? (j.u.j.a.d) dVar : null;
        return (dVar3 == null || (dVar2 = (d<T>) dVar3.intercepted()) == null) ? dVar : dVar2;
    }
}
