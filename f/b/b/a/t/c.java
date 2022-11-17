package f.b.b.a.t;

import f.b.b.a.a0.l;
import f.b.b.a.a0.p;
import f.b.b.a.a0.w;
import f.b.b.a.h;
import f.b.b.a.o;
import f.b.b.a.r;
import f.b.b.a.y.d;
import f.b.b.a.y.e;
import f.b.b.a.y.y;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.q;
/* loaded from: classes.dex */
public final class c extends h<d> {

    /* loaded from: classes.dex */
    class a extends h.b<f.b.b.a.a, d> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f.b.b.a.a a(d dVar) {
            return new l((p) new d().d(dVar.R(), p.class), (o) new f.b.b.a.w.b().d(dVar.S(), o.class), dVar.S().T().Q());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<e, d> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public d a(e eVar) {
            d.b U = d.U();
            U.y(new d().e().a(eVar.O()));
            U.z(new f.b.b.a.w.b().e().a(eVar.P()));
            U.A(c.this.j());
            return U.a();
        }

        /* renamed from: f */
        public e c(i iVar) {
            return e.Q(iVar, q.b());
        }

        /* renamed from: g */
        public void d(e eVar) {
            new d().e().d(eVar.O());
            new f.b.b.a.w.b().e().d(eVar.P());
            w.a(eVar.O().P());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c() {
        super(d.class, new a(f.b.b.a.a.class));
    }

    public static void l(boolean z) {
        r.q(new c(), z);
    }

    @Override // f.b.b.a.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // f.b.b.a.h
    public h.a<?, d> e() {
        return new b(e.class);
    }

    @Override // f.b.b.a.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public d g(i iVar) {
        return d.V(iVar, q.b());
    }

    /* renamed from: m */
    public void i(d dVar) {
        w.c(dVar.T(), j());
        new d().i(dVar.R());
        new f.b.b.a.w.b().i(dVar.S());
    }
}
