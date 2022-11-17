package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.e;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class d0 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ p0 f1093e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(p0 p0Var) {
        this.f1093e = p0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        e eVar;
        Context context;
        p0 p0Var = this.f1093e;
        eVar = p0Var.f1148d;
        context = p0Var.c;
        eVar.a(context);
    }
}
