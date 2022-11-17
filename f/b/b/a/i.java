package f.b.b.a;

import f.b.b.a.y.c0;
import f.b.b.a.y.d0;
import f.b.b.a.y.t;
import f.b.b.a.z.a.q;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class i {
    private final c0 a;

    private i(c0 c0Var) {
        this.a = c0Var;
    }

    public static void a(t tVar) {
        if (tVar == null || tVar.Q().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void b(c0 c0Var) {
        if (c0Var == null || c0Var.T() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    private static c0 c(t tVar, a aVar) {
        try {
            c0 X = c0.X(aVar.b(tVar.Q().w(), new byte[0]), q.b());
            b(X);
            return X;
        } catch (f.b.b.a.z.a.c0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static t d(c0 c0Var, a aVar) {
        byte[] a = aVar.a(c0Var.b(), new byte[0]);
        try {
            if (c0.X(aVar.b(a, new byte[0]), q.b()).equals(c0Var)) {
                t.b R = t.R();
                R.y(f.b.b.a.z.a.i.k(a));
                R.z(s.b(c0Var));
                return R.a();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (f.b.b.a.z.a.c0 unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final i e(c0 c0Var) {
        b(c0Var);
        return new i(c0Var);
    }

    private <B, P> P i(Class<P> cls, Class<B> cls2) {
        return (P) r.t(r.l(this, cls2), cls);
    }

    public static final i j(k kVar, a aVar) {
        t a = kVar.a();
        a(a);
        return new i(c(a, aVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0 f() {
        return this.a;
    }

    public d0 g() {
        return s.b(this.a);
    }

    public <P> P h(Class<P> cls) {
        Class<?> e2 = r.e(cls);
        if (e2 != null) {
            return (P) i(cls, e2);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public void k(l lVar, a aVar) {
        lVar.b(d(this.a, aVar));
    }

    public String toString() {
        return g().toString();
    }
}
