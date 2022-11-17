package f.b.b.a.a0;

import f.b.b.a.o;
import f.b.b.a.x.a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
/* loaded from: classes.dex */
public class t implements o {
    private final a a;
    private final int b;

    public t(a aVar, int i2) {
        this.a = aVar;
        this.b = i2;
        if (i2 >= 10) {
            aVar.a(new byte[0], i2);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override // f.b.b.a.o
    public void a(byte[] bArr, byte[] bArr2) {
        if (!g.b(b(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // f.b.b.a.o
    public byte[] b(byte[] bArr) {
        return this.a.a(bArr, this.b);
    }
}
