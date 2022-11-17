package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import com.google.android.gms.common.a;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class u2 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    private final s2 f1183e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ v2 f1184f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u2(v2 v2Var, s2 s2Var) {
        this.f1184f = v2Var;
        this.f1183e = s2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1184f.f1187f) {
            a b = this.f1183e.b();
            if (b.e()) {
                v2 v2Var = this.f1184f;
                i iVar = v2Var.f1077e;
                Activity b2 = v2Var.b();
                PendingIntent d2 = b.d();
                p.i(d2);
                iVar.startActivityForResult(GoogleApiActivity.a(b2, d2, this.f1183e.a(), false), 1);
                return;
            }
            v2 v2Var2 = this.f1184f;
            if (v2Var2.f1190i.c(v2Var2.b(), b.b(), null) != null) {
                v2 v2Var3 = this.f1184f;
                v2Var3.f1190i.w(v2Var3.b(), this.f1184f.f1077e, b.b(), 2, this.f1184f);
            } else if (b.b() == 18) {
                v2 v2Var4 = this.f1184f;
                Dialog r = v2Var4.f1190i.r(v2Var4.b(), this.f1184f);
                v2 v2Var5 = this.f1184f;
                v2Var5.f1190i.s(v2Var5.b().getApplicationContext(), new t2(this, r));
            } else {
                this.f1184f.l(b, this.f1183e.a());
            }
        }
    }
}
