package com.google.android.gms.common.api.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d1 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ int f1094e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ g1 f1095f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(g1 g1Var, int i2) {
        this.f1095f = g1Var;
        this.f1094e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1095f.k(this.f1094e);
    }
}
