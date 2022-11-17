package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
/* loaded from: classes.dex */
public final class a1 extends t0 {
    private c a;
    private final int b;

    public a1(c cVar, int i2) {
        this.a = cVar;
        this.b = i2;
    }

    @Override // com.google.android.gms.common.internal.l
    public final void P(int i2, IBinder iBinder, Bundle bundle) {
        p.j(this.a, "onPostInitComplete can be called only once per call to getRemoteService");
        this.a.R(i2, iBinder, bundle, this.b);
        this.a = null;
    }

    @Override // com.google.android.gms.common.internal.l
    public final void j(int i2, Bundle bundle) {
        Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
    }

    @Override // com.google.android.gms.common.internal.l
    public final void l(int i2, IBinder iBinder, e1 e1Var) {
        c cVar = this.a;
        p.j(cVar, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
        p.i(e1Var);
        c.f0(cVar, e1Var);
        P(i2, iBinder, e1Var.f1230e);
    }
}
