package f.b.b.a.a0;

import java.util.Arrays;
/* loaded from: classes.dex */
class x extends i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public x(byte[] bArr, int i2) {
        super(bArr, i2);
    }

    static int[] n(int[] iArr, int[] iArr2) {
        i.k(r0, iArr);
        int[] iArr3 = {0, 0, 0, 0, iArr3[12], iArr3[13], iArr3[14], iArr3[15], 0, 0, 0, 0, iArr2[0], iArr2[1], iArr2[2], iArr2[3]};
        i.l(iArr3);
        return Arrays.copyOf(iArr3, 8);
    }

    @Override // f.b.b.a.a0.i
    int[] d(int[] iArr, int i2) {
        if (iArr.length == g() / 4) {
            int[] iArr2 = new int[16];
            i.k(iArr2, n(this.a, iArr));
            iArr2[12] = i2;
            iArr2[13] = 0;
            iArr2[14] = iArr[4];
            iArr2[15] = iArr[5];
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b.b.a.a0.i
    public int g() {
        return 24;
    }
}
