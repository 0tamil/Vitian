package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.a;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class z1 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ c2 f1201e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public z1(c2 c2Var) {
        this.f1201e = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b2 b2Var;
        b2Var = this.f1201e.f1092g;
        b2Var.c(new a(4));
    }
}
