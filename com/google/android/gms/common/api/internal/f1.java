package com.google.android.gms.common.api.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f1 implements c.e {
    final /* synthetic */ g1 a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f1(g1 g1Var) {
        this.a = g1Var;
    }

    @Override // com.google.android.gms.common.internal.c.e
    public final void a() {
        Handler handler;
        handler = this.a.m.p;
        handler.post(new e1(this));
    }
}
