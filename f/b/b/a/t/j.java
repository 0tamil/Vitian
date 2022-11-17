package f.b.b.a.t;

import f.b.b.a.a;
import f.b.b.a.r;
import f.b.b.a.y.a0;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* loaded from: classes.dex */
public final class j implements a {
    private static final byte[] c = new byte[0];
    private final a0 a;
    private final a b;

    public j(a0 a0Var, a aVar) {
        this.a = a0Var;
        this.b = aVar;
    }

    private byte[] c(byte[] bArr, byte[] bArr2) {
        return ByteBuffer.allocate(bArr.length + 4 + bArr2.length).putInt(bArr.length).put(bArr).put(bArr2).array();
    }

    @Override // f.b.b.a.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] b = r.o(this.a).b();
        return c(this.b.a(b, c), ((a) r.i(this.a.T(), b, a.class)).a(bArr, bArr2));
    }

    @Override // f.b.b.a.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i2 = wrap.getInt();
            if (i2 <= 0 || i2 > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i2];
            wrap.get(bArr3, 0, i2);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((a) r.i(this.a.T(), this.b.b(bArr3, c), a.class)).b(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e2) {
            throw new GeneralSecurityException("invalid ciphertext", e2);
        }
    }
}
