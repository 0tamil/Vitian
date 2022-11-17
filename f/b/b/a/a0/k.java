package f.b.b.a.a0;

import f.b.b.a.a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import javax.crypto.AEADBadTagException;
/* loaded from: classes.dex */
abstract class k implements a {
    private final i a;
    private final i b;

    public k(byte[] bArr) {
        this.a = g(bArr, 1);
        this.b = g(bArr, 0);
    }

    private byte[] c(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() >= this.a.g() + 16) {
            int position = byteBuffer.position();
            byte[] bArr2 = new byte[16];
            byteBuffer.position(byteBuffer.limit() - 16);
            byteBuffer.get(bArr2);
            byteBuffer.position(position);
            byteBuffer.limit(byteBuffer.limit() - 16);
            byte[] bArr3 = new byte[this.a.g()];
            byteBuffer.get(bArr3);
            if (bArr == null) {
                bArr = new byte[0];
            }
            try {
                q.f(e(bArr3), f(bArr, byteBuffer), bArr2);
                byteBuffer.position(position);
                return this.a.e(byteBuffer);
            } catch (GeneralSecurityException e2) {
                throw new AEADBadTagException(e2.toString());
            }
        } else {
            throw new GeneralSecurityException("ciphertext too short");
        }
    }

    private void d(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() >= bArr.length + this.a.g() + 16) {
            int position = byteBuffer.position();
            this.a.f(byteBuffer, bArr);
            byteBuffer.position(position);
            byte[] bArr3 = new byte[this.a.g()];
            byteBuffer.get(bArr3);
            byteBuffer.limit(byteBuffer.limit() - 16);
            if (bArr2 == null) {
                bArr2 = new byte[0];
            }
            byte[] a = q.a(e(bArr3), f(bArr2, byteBuffer));
            byteBuffer.limit(byteBuffer.limit() + 16);
            byteBuffer.put(a);
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    private byte[] e(byte[] bArr) {
        byte[] bArr2 = new byte[32];
        this.b.c(bArr, 0).get(bArr2);
        return bArr2;
    }

    private static byte[] f(byte[] bArr, ByteBuffer byteBuffer) {
        int length = bArr.length % 16 == 0 ? bArr.length : (bArr.length + 16) - (bArr.length % 16);
        int remaining = byteBuffer.remaining();
        int i2 = remaining % 16;
        int i3 = (i2 == 0 ? remaining : (remaining + 16) - i2) + length;
        ByteBuffer order = ByteBuffer.allocate(i3 + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.put(bArr);
        order.position(length);
        order.put(byteBuffer);
        order.position(i3);
        order.putLong(bArr.length);
        order.putLong(remaining);
        return order.array();
    }

    @Override // f.b.b.a.a
    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length <= (Integer.MAX_VALUE - this.a.g()) - 16) {
            ByteBuffer allocate = ByteBuffer.allocate(bArr.length + this.a.g() + 16);
            d(allocate, bArr, bArr2);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // f.b.b.a.a
    public byte[] b(byte[] bArr, byte[] bArr2) {
        return c(ByteBuffer.wrap(bArr), bArr2);
    }

    abstract i g(byte[] bArr, int i2);
}
