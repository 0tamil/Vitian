package kotlinx.coroutines.internal;

import j.b;
import j.r;
import j.u.g;
import j.x.c.l;
import j.x.d.i;
import j.x.d.j;
import kotlinx.coroutines.h0;
/*  JADX ERROR: JadxRuntimeException in pass: ClassModifier
    jadx.core.utils.exceptions.JadxRuntimeException: Not class type: E
    	at jadx.core.dex.info.ClassInfo.checkClassType(ClassInfo.java:53)
    	at jadx.core.dex.info.ClassInfo.fromType(ClassInfo.java:31)
    	at jadx.core.dex.visitors.ClassModifier.removeSyntheticFields(ClassModifier.java:82)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:60)
    	at jadx.core.dex.visitors.ClassModifier.visit(ClassModifier.java:54)
    */
/* loaded from: classes.dex */
public final class u {

    /* loaded from: classes.dex */
    static final class a extends j implements l<Throwable, r> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ l<E, r> f3815e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ E f3816f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ g f3817g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(l<? super E, r> lVar, E e2, g gVar) {
            super(1);
            this.f3815e = lVar;
            this.f3816f = e2;
            this.f3817g = gVar;
        }

        public final void a(Throwable th) {
            u.b(this.f3815e, this.f3816f, this.f3817g);
        }

        @Override // j.x.c.l
        public /* bridge */ /* synthetic */ r invoke(Throwable th) {
            a(th);
            return r.a;
        }
    }

    public static final <E> l<Throwable, r> a(l<? super E, r> lVar, E e2, g gVar) {
        return new a(lVar, e2, gVar);
    }

    public static final <E> void b(l<? super E, r> lVar, E e2, g gVar) {
        h0 c = c(lVar, e2, null);
        if (c != null) {
            h0.a(gVar, c);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> h0 c(l<? super E, r> lVar, E e2, h0 h0Var) {
        try {
            lVar.invoke(e2);
        } catch (Throwable th) {
            if (h0Var == null || h0Var.getCause() == th) {
                return new h0(i.i("Exception in undelivered element handler for ", e2), th);
            }
            b.a(h0Var, th);
        }
        return h0Var;
    }

    public static /* synthetic */ h0 d(l lVar, Object obj, h0 h0Var, int i2, Object obj2) {
        if ((i2 & 2) != 0) {
            h0Var = null;
        }
        return c(lVar, obj, h0Var);
    }
}
