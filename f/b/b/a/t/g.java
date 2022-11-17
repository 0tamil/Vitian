package f.b.b.a.t;

import f.b.b.a.a0.u;
import f.b.b.a.a0.w;
import f.b.b.a.h;
import f.b.b.a.r;
import f.b.b.a.y.n;
import f.b.b.a.y.o;
import f.b.b.a.y.y;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.q;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
/* loaded from: classes.dex */
public final class g extends h<n> {

    /* loaded from: classes.dex */
    class a extends h.b<f.b.b.a.a, n> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f.b.b.a.a a(n nVar) {
            return new f.b.b.a.t.m.a(nVar.Q().w());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<o, n> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public n a(o oVar) {
            n.b S = n.S();
            S.y(i.k(u.c(oVar.O())));
            S.z(g.this.k());
            return S.a();
        }

        /* renamed from: f */
        public o c(i iVar) {
            return o.P(iVar, q.b());
        }

        /* renamed from: g */
        public void d(o oVar) {
            w.a(oVar.O());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g() {
        super(n.class, new a(f.b.b.a.a.class));
    }

    private static boolean j() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    public static void m(boolean z) {
        if (j()) {
            r.q(new g(), z);
        }
    }

    @Override // f.b.b.a.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // f.b.b.a.h
    public h.a<?, n> e() {
        return new b(o.class);
    }

    @Override // f.b.b.a.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public n g(i iVar) {
        return n.T(iVar, q.b());
    }

    /* renamed from: n */
    public void i(n nVar) {
        w.c(nVar.R(), k());
        w.a(nVar.Q().size());
    }
}
