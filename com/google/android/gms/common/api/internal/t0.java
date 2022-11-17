package com.google.android.gms.common.api.internal;

import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t0 extends m1 {
    private final WeakReference<u0> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t0(u0 u0Var) {
        this.a = new WeakReference<>(u0Var);
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final void a() {
        u0 u0Var = this.a.get();
        if (u0Var != null) {
            u0.t(u0Var);
        }
    }
}
