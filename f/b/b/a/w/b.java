package f.b.b.a.w;

import f.b.b.a.a0.s;
import f.b.b.a.a0.t;
import f.b.b.a.h;
import f.b.b.a.o;
import f.b.b.a.r;
import f.b.b.a.y.u;
import f.b.b.a.y.v;
import f.b.b.a.y.w;
import f.b.b.a.y.x;
import f.b.b.a.y.y;
import f.b.b.a.z.a.i;
import f.b.b.a.z.a.q;
import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class b extends h<v> {

    /* loaded from: classes.dex */
    class a extends h.b<o, v> {
        a(Class cls) {
            super(cls);
        }

        /* renamed from: c */
        public o a(v vVar) {
            u P = vVar.T().P();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.S().w(), "HMAC");
            int Q = vVar.T().Q();
            int i2 = c.a[P.ordinal()];
            if (i2 == 1) {
                return new t(new s("HMACSHA1", secretKeySpec), Q);
            }
            if (i2 == 2) {
                return new t(new s("HMACSHA256", secretKeySpec), Q);
            }
            if (i2 == 3) {
                return new t(new s("HMACSHA512", secretKeySpec), Q);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    /* renamed from: f.b.b.a.w.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0097b extends h.a<w, v> {
        C0097b(Class cls) {
            super(cls);
        }

        /* renamed from: e */
        public v a(w wVar) {
            v.b V = v.V();
            V.A(b.this.k());
            V.z(wVar.Q());
            V.y(i.k(f.b.b.a.a0.u.c(wVar.P())));
            return V.a();
        }

        /* renamed from: f */
        public w c(i iVar) {
            return w.R(iVar, q.b());
        }

        /* renamed from: g */
        public void d(w wVar) {
            if (wVar.P() >= 16) {
                b.o(wVar.Q());
                return;
            }
            throw new GeneralSecurityException("key too short");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class c {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[u.values().length];
            a = iArr;
            try {
                iArr[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[u.SHA256.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[u.SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public b() {
        super(v.class, new a(o.class));
    }

    public static void m(boolean z) {
        r.q(new b(), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void o(x xVar) {
        if (xVar.Q() >= 10) {
            int i2 = c.a[xVar.P().ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new GeneralSecurityException("unknown hash type");
                    } else if (xVar.Q() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                } else if (xVar.Q() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
            } else if (xVar.Q() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    @Override // f.b.b.a.h
    public String c() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // f.b.b.a.h
    public h.a<?, v> e() {
        return new C0097b(w.class);
    }

    @Override // f.b.b.a.h
    public y.c f() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    /* renamed from: l */
    public v g(i iVar) {
        return v.W(iVar, q.b());
    }

    /* renamed from: n */
    public void i(v vVar) {
        f.b.b.a.a0.w.c(vVar.U(), k());
        if (vVar.S().size() >= 16) {
            o(vVar.T());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
