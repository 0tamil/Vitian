package kotlinx.coroutines;

import j.r;
import j.u.g;
import j.x.c.l;
import j.x.c.p;
import java.util.concurrent.CancellationException;
/* loaded from: classes.dex */
public interface n1 extends g.b {

    /* renamed from: d  reason: collision with root package name */
    public static final b f3911d = b.f3912e;

    /* loaded from: classes.dex */
    public static final class a {
        public static /* synthetic */ void a(n1 n1Var, CancellationException cancellationException, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    cancellationException = null;
                }
                n1Var.l(cancellationException);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: cancel");
        }

        public static <R> R b(n1 n1Var, R r, p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(n1Var, r, pVar);
        }

        public static <E extends g.b> E c(n1 n1Var, g.c<E> cVar) {
            return (E) g.b.a.b(n1Var, cVar);
        }

        public static /* synthetic */ w0 d(n1 n1Var, boolean z, boolean z2, l lVar, int i2, Object obj) {
            if (obj == null) {
                if ((i2 & 1) != 0) {
                    z = false;
                }
                if ((i2 & 2) != 0) {
                    z2 = true;
                }
                return n1Var.f(z, z2, lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invokeOnCompletion");
        }

        public static g e(n1 n1Var, g.c<?> cVar) {
            return g.b.a.c(n1Var, cVar);
        }

        public static g f(n1 n1Var, g gVar) {
            return g.b.a.d(n1Var, gVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements g.c<n1> {

        /* renamed from: e  reason: collision with root package name */
        static final /* synthetic */ b f3912e = new b();

        private b() {
        }
    }

    boolean b();

    w0 f(boolean z, boolean z2, l<? super Throwable, r> lVar);

    CancellationException h();

    void l(CancellationException cancellationException);

    s s(u uVar);

    boolean start();
}
