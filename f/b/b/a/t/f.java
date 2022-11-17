package f.b.b.a.t;

import f.b.b.a.a0.c;
import f.b.b.a.a0.u;
import f.b.b.a.a0.w;
import f.b.b.a.g;
import f.b.b.a.h;
import f.b.b.a.r;
import f.b.b.a.y.l;
import f.b.b.a.y.m;
import f.b.b.a.y.y;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.q;
/* loaded from: classes.dex */
public final class f extends h<l> {

    /* loaded from: classes.dex */
    class a extends h.b<f.b.b.a.a, l> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f.b.b.a.a a(l lVar) {
            return new c(lVar.Q().w());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<m, l> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public l a(m mVar) {
            l.b S = l.S();
            S.y(i.k(u.c(mVar.P())));
            S.z(f.this.l());
            return S.a();
        }

        /* renamed from: f */
        public m c(i iVar) {
            return m.R(iVar, q.b());
        }

        /* renamed from: g */
        public void d(m mVar) {
            w.a(mVar.P());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f() {
        super(l.class, new a(f.b.b.a.a.class));
    }

    public static final g j() {
        return k(32, g.b.TINK);
    }

    private static g k(int i2, g.b bVar) {
        m.b Q = m.Q();
        Q.y(i2);
        return g.a(new f().c(), Q.a().b(), bVar);
    }

    public static void n(boolean z) {
        r.q(new f(), z);
    }

    @Override // f.b.b.a.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // f.b.b.a.h
    public h.a<?, l> e() {
        return new b(m.class);
    }

    @Override // f.b.b.a.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    /* renamed from: m */
    public l g(i iVar) {
        return l.T(iVar, q.b());
    }

    /* renamed from: o */
    public void i(l lVar) {
        w.c(lVar.R(), l());
        w.a(lVar.Q().size());
    }
}
