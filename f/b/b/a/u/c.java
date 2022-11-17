package f.b.b.a.u;

import f.b.b.a.a0.g;
import f.b.b.a.d;
import f.b.b.a.p;
import f.b.b.a.q;
import f.b.b.a.r;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public class c implements q<d, d> {
    private static final Logger a = Logger.getLogger(c.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements d {
        private p<d> a;

        public a(p<d> pVar) {
            this.a = pVar;
        }

        @Override // f.b.b.a.d
        public byte[] a(byte[] bArr, byte[] bArr2) {
            return g.a(this.a.b().a(), this.a.b().c().a(bArr, bArr2));
        }

        @Override // f.b.b.a.d
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (p.b<d> bVar : this.a.c(copyOfRange)) {
                    try {
                        return bVar.c().b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e2) {
                        Logger logger = c.a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e2.toString());
                    }
                }
            }
            for (p.b<d> bVar2 : this.a.e()) {
                try {
                    return bVar2.c().b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    c() {
    }

    public static void e() {
        r.r(new c());
    }

    @Override // f.b.b.a.q
    public Class<d> a() {
        return d.class;
    }

    @Override // f.b.b.a.q
    public Class<d> b() {
        return d.class;
    }

    /* renamed from: f */
    public d c(p<d> pVar) {
        return new a(pVar);
    }
}
