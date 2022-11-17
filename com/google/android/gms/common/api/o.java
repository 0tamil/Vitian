package com.google.android.gms.common.api;

import com.google.android.gms.common.c;
/* loaded from: classes.dex */
public final class o extends UnsupportedOperationException {

    /* renamed from: e  reason: collision with root package name */
    private final c f1202e;

    public o(c cVar) {
        this.f1202e = cVar;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String valueOf = String.valueOf(this.f1202e);
        String.valueOf(valueOf).length();
        return "Missing ".concat(String.valueOf(valueOf));
    }
}
