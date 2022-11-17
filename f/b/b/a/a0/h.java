package f.b.b.a.a0;
/* loaded from: classes.dex */
class h extends i {
    /* JADX INFO: Access modifiers changed from: package-private */
    public h(byte[] bArr, int i2) {
        super(bArr, i2);
    }

    @Override // f.b.b.a.a0.i
    int[] d(int[] iArr, int i2) {
        if (iArr.length == g() / 4) {
            int[] iArr2 = new int[16];
            i.k(iArr2, this.a);
            iArr2[12] = i2;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // f.b.b.a.a0.i
    public int g() {
        return 12;
    }
}
