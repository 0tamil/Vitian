package f.b.b.a.u;

import f.b.b.a.a0.u;
import f.b.b.a.a0.w;
import f.b.b.a.d;
import f.b.b.a.g;
import f.b.b.a.h;
import f.b.b.a.r;
import f.b.b.a.y.p;
import f.b.b.a.y.q;
import f.b.b.a.y.y;
import f.b.b.a.z.a.i;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
/* loaded from: classes.dex */
public final class a extends h<p> {

    /* renamed from: f.b.b.a.u.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0094a extends h.b<d, p> {
        C0094a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public d a(p pVar) {
            return new f.b.b.a.a0.d(pVar.Q().w());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<q, p> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public p a(q qVar) {
            p.b S = p.S();
            S.y(i.k(u.c(qVar.P())));
            S.z(a.this.l());
            return S.a();
        }

        /* renamed from: f */
        public q c(i iVar) {
            return q.R(iVar, f.b.b.a.z.a.q.b());
        }

        /* renamed from: g */
        public void d(q qVar) {
            if (qVar.P() != 64) {
                throw new InvalidAlgorithmParameterException("invalid key size: " + qVar.P() + ". Valid keys must have 64 bytes.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a() {
        super(p.class, new C0094a(d.class));
    }

    public static final g j() {
        return k(64, g.b.TINK);
    }

    private static g k(int i2, g.b bVar) {
        q.b Q = q.Q();
        Q.y(i2);
        return g.a(new a().c(), Q.a().b(), bVar);
    }

    public static void n(boolean z) {
        r.q(new a(), z);
    }

    @Override // f.b.b.a.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // f.b.b.a.h
    public h.a<?, p> e() {
        return new b(q.class);
    }

    @Override // f.b.b.a.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    /* renamed from: m */
    public p g(i iVar) {
        return p.T(iVar, f.b.b.a.z.a.q.b());
    }

    /* renamed from: o */
    public void i(p pVar) {
        w.c(pVar.R(), l());
        if (pVar.Q().size() != 64) {
            throw new InvalidKeyException("invalid key size: " + pVar.Q().size() + ". Valid keys must have 64 bytes.");
        }
    }
}
