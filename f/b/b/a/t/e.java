package f.b.b.a.t;

import f.b.b.a.a0.u;
import f.b.b.a.a0.w;
import f.b.b.a.h;
import f.b.b.a.r;
import f.b.b.a.y.i;
import f.b.b.a.y.j;
import f.b.b.a.y.y;
import f.b.b.a.z.a.q;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class e extends h<i> {

    /* loaded from: classes.dex */
    class a extends h.b<f.b.b.a.a, i> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public f.b.b.a.a a(i iVar) {
            return new f.b.b.a.a0.b(iVar.R().w(), iVar.S().P());
        }
    }

    /* loaded from: classes.dex */
    class b extends h.a<j, i> {
        b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public i a(j jVar) {
            i.b U = i.U();
            U.y(f.b.b.a.z.a.i.k(u.c(jVar.O())));
            U.z(jVar.P());
            U.A(e.this.j());
            return U.a();
        }

        /* renamed from: f */
        public j c(f.b.b.a.z.a.i iVar) {
            return j.Q(iVar, q.b());
        }

        /* renamed from: g */
        public void d(j jVar) {
            w.a(jVar.O());
            if (jVar.P().P() != 12 && jVar.P().P() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e() {
        super(i.class, new a(f.b.b.a.a.class));
    }

    public static void l(boolean z) {
        r.q(new e(), z);
    }

    @Override // f.b.b.a.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // f.b.b.a.h
    public h.a<?, i> e() {
        return new b(j.class);
    }

    @Override // f.b.b.a.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int j() {
        return 0;
    }

    /* renamed from: k */
    public i g(f.b.b.a.z.a.i iVar) {
        return i.V(iVar, q.b());
    }

    /* renamed from: m */
    public void i(i iVar) {
        w.c(iVar.T(), j());
        w.a(iVar.R().size());
        if (iVar.S().P() != 12 && iVar.S().P() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
