package f.b.b.a.t;

import f.b.b.a.a0.w;
import f.b.b.a.h;
import f.b.b.a.n;
import f.b.b.a.r;
import f.b.b.a.y.e0;
import f.b.b.a.y.f0;
import f.b.b.a.y.y;
import f.b.b.a.z.a.q;
/* loaded from: classes.dex */
public class i extends h<e0> {

    /* loaded from: classes.dex */
    class a extends h.b<f.b.b.a.a, e0> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f.b.b.a.a a(e0 e0Var) {
            String P = e0Var.Q().P();
            return n.a(P).b(P);
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<f0, e0> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public e0 a(f0 f0Var) {
            e0.b S = e0.S();
            S.y(f0Var);
            S.z(i.this.j());
            return S.a();
        }

        /* renamed from: f */
        public f0 c(f.b.b.a.z.a.i iVar) {
            return f0.Q(iVar, q.b());
        }

        /* renamed from: g */
        public void d(f0 f0Var) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public i() {
        super(e0.class, new a(f.b.b.a.a.class));
    }

    public static void l(boolean z) {
        r.q(new i(), z);
    }

    @Override // f.b.b.a.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // f.b.b.a.h
    public h.a<?, e0> e() {
        return new b(f0.class);
    }

    @Override // f.b.b.a.h
    public y.c f() {
        return y.c.REMOTE;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public e0 g(f.b.b.a.z.a.i iVar) {
        return e0.T(iVar, q.b());
    }

    /* renamed from: m */
    public void i(e0 e0Var) {
        w.c(e0Var.R(), j());
    }
}
