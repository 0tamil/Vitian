package f.b.b.a.w;

import f.b.b.a.a0.g;
import f.b.b.a.o;
import f.b.b.a.p;
import f.b.b.a.q;
import f.b.b.a.r;
import f.b.b.a.y.i0;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
/* loaded from: classes.dex */
class d implements q<o, o> {
    private static final Logger a = Logger.getLogger(d.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements o {
        private final p<o> a;
        private final byte[] b;

        private b(p<o> pVar) {
            this.b = new byte[]{0};
            this.a = pVar;
        }

        @Override // f.b.b.a.o
        public void a(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (p.b<o> bVar : this.a.c(copyOf)) {
                    try {
                        if (bVar.b().equals(i0.LEGACY)) {
                            bVar.c().a(copyOfRange, g.a(bArr2, this.b));
                            return;
                        } else {
                            bVar.c().a(copyOfRange, bArr2);
                            return;
                        }
                    } catch (GeneralSecurityException e2) {
                        Logger logger = d.a;
                        logger.info("tag prefix matches a key, but cannot verify: " + e2);
                    }
                }
                for (p.b<o> bVar2 : this.a.e()) {
                    try {
                        bVar2.c().a(bArr, bArr2);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("tag too short");
        }

        @Override // f.b.b.a.o
        public byte[] b(byte[] bArr) {
            return this.a.b().b().equals(i0.LEGACY) ? g.a(this.a.b().a(), this.a.b().c().b(g.a(bArr, this.b))) : g.a(this.a.b().a(), this.a.b().c().b(bArr));
        }
    }

    d() {
    }

    public static void e() {
        r.r(new d());
    }

    @Override // f.b.b.a.q
    public Class<o> a() {
        return o.class;
    }

    @Override // f.b.b.a.q
    public Class<o> b() {
        return o.class;
    }

    /* renamed from: f */
    public o c(p<o> pVar) {
        return new b(pVar);
    }
}
