package f.b.b.a.a0;

import f.b.b.a.x.a;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class r implements a {
    private final SecretKey a;
    private byte[] b;
    private byte[] c;

    public r(byte[] bArr) {
        w.a(bArr.length);
        this.a = new SecretKeySpec(bArr, "AES");
        b();
    }

    private void b() {
        Cipher c = c();
        c.init(1, this.a);
        byte[] b = e.b(c.doFinal(new byte[16]));
        this.b = b;
        this.c = e.b(b);
    }

    private static Cipher c() {
        return m.f2449f.a("AES/ECB/NoPadding");
    }

    @Override // f.b.b.a.x.a
    public byte[] a(byte[] bArr, int i2) {
        if (i2 <= 16) {
            Cipher c = c();
            c.init(1, this.a);
            int max = Math.max(1, (int) Math.ceil(bArr.length / 16.0d));
            byte[] d2 = max * 16 == bArr.length ? g.d(bArr, (max - 1) * 16, this.b, 0, 16) : g.e(e.a(Arrays.copyOfRange(bArr, (max - 1) * 16, bArr.length)), this.c);
            byte[] bArr2 = new byte[16];
            for (int i3 = 0; i3 < max - 1; i3++) {
                bArr2 = c.doFinal(g.d(bArr2, 0, bArr, i3 * 16, 16));
            }
            return Arrays.copyOf(c.doFinal(g.e(d2, bArr2)), i2);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }
}
