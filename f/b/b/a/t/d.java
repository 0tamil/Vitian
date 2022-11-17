package f.b.b.a.t;

import f.b.b.a.a0.p;
import f.b.b.a.a0.u;
import f.b.b.a.a0.w;
import f.b.b.a.h;
import f.b.b.a.y.f;
import f.b.b.a.y.g;
import f.b.b.a.y.y;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.q;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public class d extends h<f> {

    /* loaded from: classes.dex */
    class a extends h.b<p, f> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public p a(f fVar) {
            return new f.b.b.a.a0.a(fVar.S().w(), fVar.T().P());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<g, f> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public f a(g gVar) {
            f.b V = f.V();
            V.z(gVar.Q());
            V.y(i.k(u.c(gVar.P())));
            V.A(d.this.k());
            return V.a();
        }

        /* renamed from: f */
        public g c(i iVar) {
            return g.R(iVar, q.b());
        }

        /* renamed from: g */
        public void d(g gVar) {
            w.a(gVar.P());
            d.this.n(gVar.Q());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d() {
        super(f.class, new a(p.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(f.b.b.a.y.h hVar) {
        if (hVar.P() < 12 || hVar.P() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // f.b.b.a.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // f.b.b.a.h
    public h.a<?, f> e() {
        return new b(g.class);
    }

    @Override // f.b.b.a.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public f g(i iVar) {
        return f.W(iVar, q.b());
    }

    /* renamed from: m */
    public void i(f fVar) {
        w.c(fVar.U(), k());
        w.a(fVar.S().size());
        n(fVar.T());
    }
}
