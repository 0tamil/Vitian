package f.b.b.a.a0;

import f.b.b.a.a;
import f.b.b.a.o;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class l implements a {
    private final p a;
    private final o b;
    private final int c;

    public l(p pVar, o oVar, int i2) {
        this.a = pVar;
        this.b = oVar;
        this.c = i2;
    }

    @Override // f.b.b.a.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] a = this.a.a(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return g.a(a, this.b.b(g.a(bArr2, a, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }

    @Override // f.b.b.a.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i2 = this.c;
        if (length >= i2) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, bArr.length - i2);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.c, bArr.length);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            this.b.a(copyOfRange2, g.a(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
            return this.a.b(copyOfRange);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
