package f.b.b.a.t;

import f.b.b.a.a0.u;
import f.b.b.a.a0.w;
import f.b.b.a.a0.y;
import f.b.b.a.h;
import f.b.b.a.r;
import f.b.b.a.y.k0;
import f.b.b.a.y.l0;
import f.b.b.a.y.y;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.q;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public class l extends h<k0> {

    /* loaded from: classes.dex */
    class a extends h.b<f.b.b.a.a, k0> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f.b.b.a.a a(k0 k0Var) {
            return new y(k0Var.Q().w());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<l0, k0> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public k0 a(l0 l0Var) {
            k0.b S = k0.S();
            S.z(l.this.j());
            S.y(i.k(u.c(32)));
            return S.a();
        }

        /* renamed from: f */
        public l0 c(i iVar) {
            return l0.O(iVar, q.b());
        }

        /* renamed from: g */
        public void d(l0 l0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public l() {
        super(k0.class, new a(f.b.b.a.a.class));
    }

    public static void l(boolean z) {
        r.q(new l(), z);
    }

    @Override // f.b.b.a.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // f.b.b.a.h
    public h.a<?, k0> e() {
        return new b(l0.class);
    }

    @Override // f.b.b.a.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public k0 g(i iVar) {
        return k0.T(iVar, q.b());
    }

    /* renamed from: m */
    public void i(k0 k0Var) {
        w.c(k0Var.R(), j());
        if (k0Var.Q().size() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }
}
