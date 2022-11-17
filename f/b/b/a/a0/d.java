package f.b.b.a.a0;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
/* loaded from: classes.dex */
public final class d implements f.b.b.a.d {
    private static final Collection<Integer> c = Arrays.asList(64);

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f2433d = new byte[16];

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f2434e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    private final r a;
    private final byte[] b;

    public d(byte[] bArr) {
        if (c.contains(Integer.valueOf(bArr.length))) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length / 2);
            this.b = Arrays.copyOfRange(bArr, bArr.length / 2, bArr.length);
            this.a = new r(copyOfRange);
            return;
        }
        throw new InvalidKeyException("invalid key size: " + bArr.length + " bytes; key must have 64 bytes");
    }

    private byte[] c(byte[]... bArr) {
        if (bArr.length == 0) {
            return this.a.a(f2434e, 16);
        }
        byte[] a = this.a.a(f2433d, 16);
        for (int i2 = 0; i2 < bArr.length - 1; i2++) {
            a = g.e(e.b(a), this.a.a(bArr[i2] == null ? new byte[0] : bArr[i2], 16));
        }
        byte[] bArr2 = bArr[bArr.length - 1];
        return this.a.a(bArr2.length >= 16 ? g.f(bArr2, a) : g.e(e.a(bArr2), e.b(a)), 16);
    }

    @Override // f.b.b.a.d
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= 2147483631) {
            Cipher a = m.f2449f.a("AES/CTR/NoPadding");
            byte[] c2 = c(bArr2, bArr);
            byte[] bArr3 = (byte[]) c2.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a.init(1, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
            return g.a(c2, a.doFinal(bArr));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // f.b.b.a.d
    public byte[] b(byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            Cipher a = m.f2449f.a("AES/CTR/NoPadding");
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            byte[] bArr3 = (byte[]) copyOfRange.clone();
            bArr3[8] = (byte) (bArr3[8] & Byte.MAX_VALUE);
            bArr3[12] = (byte) (bArr3[12] & Byte.MAX_VALUE);
            a.init(2, new SecretKeySpec(this.b, "AES"), new IvParameterSpec(bArr3));
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 16, bArr.length);
            byte[] doFinal = a.doFinal(copyOfRange2);
            if (copyOfRange2.length == 0 && doFinal == null && v.b()) {
                doFinal = new byte[0];
            }
            if (g.b(copyOfRange, c(bArr2, doFinal))) {
                return doFinal;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }
}
