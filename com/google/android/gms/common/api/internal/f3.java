package com.google.android.gms.common.api.internal;

import android.os.Bundle;
/* loaded from: classes.dex */
final class f3 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f1100e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f1101f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ g3 f1102g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f3(g3 g3Var, LifecycleCallback lifecycleCallback, String str) {
        this.f1102g = g3Var;
        this.f1100e = lifecycleCallback;
        this.f1101f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Bundle bundle;
        Bundle bundle2;
        Bundle bundle3;
        g3 g3Var = this.f1102g;
        i2 = g3Var.f1121f;
        if (i2 > 0) {
            LifecycleCallback lifecycleCallback = this.f1100e;
            bundle = g3Var.f1122g;
            if (bundle != null) {
                bundle3 = g3Var.f1122g;
                bundle2 = bundle3.getBundle(this.f1101f);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i3 = this.f1102g.f1121f;
        if (i3 >= 2) {
            this.f1100e.j();
        }
        i4 = this.f1102g.f1121f;
        if (i4 >= 3) {
            this.f1100e.h();
        }
        i5 = this.f1102g.f1121f;
        if (i5 >= 4) {
            this.f1100e.k();
        }
        i6 = this.f1102g.f1121f;
        if (i6 >= 5) {
            this.f1100e.g();
        }
    }
}
