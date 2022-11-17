package com.google.android.gms.common;

import java.util.Arrays;
/* loaded from: classes.dex */
final class u extends t {
    private final byte[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.b = bArr;
    }

    @Override // com.google.android.gms.common.t
    final byte[] d() {
        return this.b;
    }
}
