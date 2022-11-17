package f.b.b.a.t;

import f.b.b.a.a0.g;
import f.b.b.a.p;
import f.b.b.a.q;
import f.b.b.a.r;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public class b implements q<f.b.b.a.a, f.b.b.a.a> {
    private static final Logger a = Logger.getLogger(b.class.getName());

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f.b.b.a.t.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0092b implements f.b.b.a.a {
        private final p<f.b.b.a.a> a;

        private C0092b(p<f.b.b.a.a> pVar) {
            this.a = pVar;
        }

        @Override // f.b.b.a.a
        public byte[] a(byte[] bArr, byte[] bArr2) {
            return g.a(this.a.b().a(), this.a.b().c().a(bArr, bArr2));
        }

        @Override // f.b.b.a.a
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (p.b<f.b.b.a.a> bVar : this.a.c(copyOfRange)) {
                    try {
                        return bVar.c().b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e2) {
                        Logger logger = b.a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e2.toString());
                    }
                }
            }
            for (p.b<f.b.b.a.a> bVar2 : this.a.e()) {
                try {
                    return bVar2.c().b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    b() {
    }

    public static void e() {
        r.r(new b());
    }

    @Override // f.b.b.a.q
    public Class<f.b.b.a.a> a() {
        return f.b.b.a.a.class;
    }

    @Override // f.b.b.a.q
    public Class<f.b.b.a.a> b() {
        return f.b.b.a.a.class;
    }

    /* renamed from: f */
    public f.b.b.a.a c(p<f.b.b.a.a> pVar) {
        return new C0092b(pVar);
    }
}
