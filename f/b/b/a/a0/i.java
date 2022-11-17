package f.b.b.a.a0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
/* loaded from: classes.dex */
abstract class i implements p {
    private static final int[] c = m(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});
    int[] a;
    private final int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(byte[] bArr, int i2) {
        if (bArr.length == 32) {
            this.a = m(bArr);
            this.b = i2;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    private void h(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i2 = (remaining / 64) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer c2 = c(bArr, this.b + i3);
            if (i3 == i2 - 1) {
                g.c(byteBuffer, byteBuffer2, c2, remaining % 64);
            } else {
                g.c(byteBuffer, byteBuffer2, c2, 64);
            }
        }
    }

    static void i(int[] iArr, int i2, int i3, int i4, int i5) {
        iArr[i2] = iArr[i2] + iArr[i3];
        iArr[i5] = j(iArr[i5] ^ iArr[i2], 16);
        iArr[i4] = iArr[i4] + iArr[i5];
        iArr[i3] = j(iArr[i3] ^ iArr[i4], 12);
        iArr[i2] = iArr[i2] + iArr[i3];
        iArr[i5] = j(iArr[i2] ^ iArr[i5], 8);
        iArr[i4] = iArr[i4] + iArr[i5];
        iArr[i3] = j(iArr[i3] ^ iArr[i4], 7);
    }

    private static int j(int i2, int i3) {
        return (i2 >>> (-i3)) | (i2 << i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void k(int[] iArr, int[] iArr2) {
        int[] iArr3 = c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void l(int[] iArr) {
        for (int i2 = 0; i2 < 10; i2++) {
            i(iArr, 0, 4, 8, 12);
            i(iArr, 1, 5, 9, 13);
            i(iArr, 2, 6, 10, 14);
            i(iArr, 3, 7, 11, 15);
            i(iArr, 0, 5, 10, 15);
            i(iArr, 1, 6, 11, 12);
            i(iArr, 2, 7, 8, 13);
            i(iArr, 3, 4, 9, 14);
        }
    }

    static int[] m(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    @Override // f.b.b.a.a0.p
    public byte[] a(byte[] bArr) {
        if (bArr.length <= Integer.MAX_VALUE - g()) {
            ByteBuffer allocate = ByteBuffer.allocate(g() + bArr.length);
            f(allocate, bArr);
            return allocate.array();
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override // f.b.b.a.a0.p
    public byte[] b(byte[] bArr) {
        return e(ByteBuffer.wrap(bArr));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ByteBuffer c(byte[] bArr, int i2) {
        int[] d2 = d(m(bArr), i2);
        int[] iArr = (int[]) d2.clone();
        l(iArr);
        for (int i3 = 0; i3 < d2.length; i3++) {
            d2[i3] = d2[i3] + iArr[i3];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(d2, 0, 16);
        return order;
    }

    abstract int[] d(int[] iArr, int i2);

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] e(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() >= g()) {
            byte[] bArr = new byte[g()];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            h(bArr, allocate, byteBuffer);
            return allocate.array();
        }
        throw new GeneralSecurityException("ciphertext too short");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - g() >= bArr.length) {
            byte[] c2 = u.c(g());
            byteBuffer.put(c2);
            h(c2, byteBuffer, ByteBuffer.wrap(bArr));
            return;
        }
        throw new IllegalArgumentException("Given ByteBuffer output is too small");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract int g();
}
