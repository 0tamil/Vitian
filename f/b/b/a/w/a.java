package f.b.b.a.w;

import f.b.b.a.a0.r;
import f.b.b.a.a0.t;
import f.b.b.a.a0.u;
import f.b.b.a.a0.w;
import f.b.b.a.h;
import f.b.b.a.o;
import f.b.b.a.y.a;
import f.b.b.a.y.c;
import f.b.b.a.y.y;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.q;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class a extends h<f.b.b.a.y.a> {

    /* renamed from: f.b.b.a.w.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0096a extends h.b<o, f.b.b.a.y.a> {
        C0096a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public o a(f.b.b.a.y.a aVar) {
            return new t(new r(aVar.R().w()), aVar.S().P());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<f.b.b.a.y.b, f.b.b.a.y.a> {
        b(a aVar, Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public f.b.b.a.y.a a(f.b.b.a.y.b bVar) {
            a.b U = f.b.b.a.y.a.U();
            U.A(0);
            U.y(i.k(u.c(bVar.O())));
            U.z(bVar.P());
            return U.a();
        }

        /* renamed from: f */
        public f.b.b.a.y.b c(i iVar) {
            return f.b.b.a.y.b.Q(iVar, q.b());
        }

        /* renamed from: g */
        public void d(f.b.b.a.y.b bVar) {
            a.p(bVar.P());
            a.q(bVar.O());
        }
    }

    a() {
        super(f.b.b.a.y.a.class, new C0096a(o.class));
    }

    public static void n(boolean z) {
        f.b.b.a.r.q(new a(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(c cVar) {
        if (cVar.P() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (cVar.P() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(int i2) {
        if (i2 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // f.b.b.a.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // f.b.b.a.h
    public h.a<?, f.b.b.a.y.a> e() {
        return new b(this, f.b.b.a.y.b.class);
    }

    @Override // f.b.b.a.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    /* renamed from: m */
    public f.b.b.a.y.a g(i iVar) {
        return f.b.b.a.y.a.V(iVar, q.b());
    }

    /* renamed from: o */
    public void i(f.b.b.a.y.a aVar) {
        w.c(aVar.T(), l());
        q(aVar.R().size());
        p(aVar.S());
    }
}
