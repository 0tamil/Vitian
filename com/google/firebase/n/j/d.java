package com.google.firebase.n.j;

import java.io.OutputStream;
/* loaded from: classes.dex */
final class d extends OutputStream {

    /* renamed from: e  reason: collision with root package name */
    private long f1856e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public long b() {
        return this.f1856e;
    }

    @Override // java.io.OutputStream
    public void write(int i2) {
        this.f1856e++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f1856e += bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) {
        int i4;
        if (i2 < 0 || i2 > bArr.length || i3 < 0 || (i4 = i2 + i3) > bArr.length || i4 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f1856e += i3;
    }
}
