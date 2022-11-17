package f.b.b.a.t;

import f.b.b.a.a0.j;
import f.b.b.a.a0.u;
import f.b.b.a.a0.w;
import f.b.b.a.h;
import f.b.b.a.y.r;
import f.b.b.a.y.s;
import f.b.b.a.y.y;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.q;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public class h extends f.b.b.a.h<r> {

    /* loaded from: classes.dex */
    class a extends h.b<f.b.b.a.a, r> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f.b.b.a.a a(r rVar) {
            return new j(rVar.Q().w());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<s, r> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public r a(s sVar) {
            r.b S = r.S();
            S.z(h.this.j());
            S.y(i.k(u.c(32)));
            return S.a();
        }

        /* renamed from: f */
        public s c(i iVar) {
            return s.O(iVar, q.b());
        }

        /* renamed from: g */
        public void d(s sVar) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public h() {
        super(r.class, new a(f.b.b.a.a.class));
    }

    public static void l(boolean z) {
        f.b.b.a.r.q(new h(), z);
    }

    @Override // f.b.b.a.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // f.b.b.a.h
    public h.a<?, r> e() {
        return new b(s.class);
    }

    @Override // f.b.b.a.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public r g(i iVar) {
        return r.T(iVar, q.b());
    }

    /* renamed from: m */
    public void i(r rVar) {
        w.c(rVar.R(), j());
        if (rVar.Q().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
