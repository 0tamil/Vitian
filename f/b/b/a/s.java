package f.b.b.a;

import f.b.b.a.y.c0;
import f.b.b.a.y.d0;
import f.b.b.a.y.i0;
import f.b.b.a.y.y;
import f.b.b.a.y.z;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class s {
    static {
        Charset.forName("UTF-8");
    }

    public static d0.c a(c0.c cVar) {
        d0.c.a T = d0.c.T();
        T.B(cVar.S().T());
        T.A(cVar.V());
        T.z(cVar.U());
        T.y(cVar.T());
        return T.a();
    }

    public static d0 b(c0 c0Var) {
        d0.b T = d0.T();
        T.z(c0Var.V());
        for (c0.c cVar : c0Var.U()) {
            T.y(a(cVar));
        }
        return T.a();
    }

    public static void c(c0.c cVar) {
        if (!cVar.W()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.T())));
        } else if (cVar.U() == i0.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.T())));
        } else if (cVar.V() == z.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.T())));
        }
    }

    public static void d(c0 c0Var) {
        int V = c0Var.V();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (c0.c cVar : c0Var.U()) {
            if (cVar.V() == z.ENABLED) {
                c(cVar);
                if (cVar.T() == V) {
                    if (!z) {
                        z = true;
                    } else {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                }
                if (cVar.S().S() != y.c.ASYMMETRIC_PUBLIC) {
                    z2 = false;
                }
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
