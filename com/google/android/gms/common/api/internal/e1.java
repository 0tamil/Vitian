package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.a;
/* loaded from: classes.dex */
final class e1 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ f1 f1097e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(f1 f1Var) {
        this.f1097e = f1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a.f fVar;
        a.f fVar2;
        g1 g1Var = this.f1097e.a;
        fVar = g1Var.b;
        fVar2 = g1Var.b;
        fVar.o(String.valueOf(fVar2.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
