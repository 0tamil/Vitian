package f.b.b.a.t;

import f.b.b.a.a0.w;
import f.b.b.a.h;
import f.b.b.a.n;
import f.b.b.a.r;
import f.b.b.a.y.g0;
import f.b.b.a.y.h0;
import f.b.b.a.y.y;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.q;
/* loaded from: classes.dex */
public class k extends h<g0> {

    /* loaded from: classes.dex */
    class a extends h.b<f.b.b.a.a, g0> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f.b.b.a.a a(g0 g0Var) {
            String Q = g0Var.Q().Q();
            return new j(g0Var.Q().P(), n.a(Q).b(Q));
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<h0, g0> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public g0 a(h0 h0Var) {
            g0.b S = g0.S();
            S.y(h0Var);
            S.z(k.this.j());
            return S.a();
        }

        /* renamed from: f */
        public h0 c(i iVar) {
            return h0.R(iVar, q.b());
        }

        /* renamed from: g */
        public void d(h0 h0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k() {
        super(g0.class, new a(f.b.b.a.a.class));
    }

    public static void l(boolean z) {
        r.q(new k(), z);
    }

    @Override // f.b.b.a.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // f.b.b.a.h
    public h.a<?, g0> e() {
        return new b(h0.class);
    }

    @Override // f.b.b.a.h
    public y.c f() {
        return y.c.REMOTE;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public g0 g(i iVar) {
        return g0.T(iVar, q.b());
    }

    /* renamed from: m */
    public void i(g0 g0Var) {
        w.c(g0Var.R(), j());
    }
}
