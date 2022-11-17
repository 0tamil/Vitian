package kotlinx.coroutines;

import j.u.g;
import java.util.concurrent.CancellationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final /* synthetic */ class s1 {
    public static final w a(n1 n1Var) {
        return new q1(n1Var);
    }

    public static /* synthetic */ w b(n1 n1Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            n1Var = null;
        }
        return r1.a(n1Var);
    }

    public static final void c(g gVar, CancellationException cancellationException) {
        n1 n1Var = (n1) gVar.get(n1.f3911d);
        if (n1Var != null) {
            n1Var.l(cancellationException);
        }
    }

    public static final void d(g gVar) {
        n1 n1Var = (n1) gVar.get(n1.f3911d);
        if (n1Var != null) {
            r1.e(n1Var);
        }
    }

    public static final void e(n1 n1Var) {
        if (!n1Var.b()) {
            throw n1Var.h();
        }
    }
}
