package com.google.android.gms.common;

import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
abstract class v extends t {
    private static final WeakReference<byte[]> c = new WeakReference<>(null);
    private WeakReference<byte[]> b = c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public v(byte[] bArr) {
        super(bArr);
    }

    protected abstract byte[] J();

    @Override // com.google.android.gms.common.t
    final byte[] d() {
        byte[] bArr;
        synchronized (this) {
            bArr = this.b.get();
            if (bArr == null) {
                bArr = J();
                this.b = new WeakReference<>(bArr);
            }
        }
        return bArr;
    }
}
