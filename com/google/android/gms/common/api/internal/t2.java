package com.google.android.gms.common.api.internal;

import android.app.Dialog;
/* loaded from: classes.dex */
final class t2 extends m1 {
    final /* synthetic */ Dialog a;
    final /* synthetic */ u2 b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public t2(u2 u2Var, Dialog dialog) {
        this.b = u2Var;
        this.a = dialog;
    }

    @Override // com.google.android.gms.common.api.internal.m1
    public final void a() {
        this.b.f1184f.o();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
