package com.google.android.gms.common.api.internal;

import android.os.Bundle;
/* loaded from: classes.dex */
final class h3 implements Runnable {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ LifecycleCallback f1125e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ String f1126f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ i3 f1127g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h3(i3 i3Var, LifecycleCallback lifecycleCallback, String str) {
        this.f1127g = i3Var;
        this.f1125e = lifecycleCallback;
        this.f1126f = str;
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
        i3 i3Var = this.f1127g;
        i2 = i3Var.d0;
        if (i2 > 0) {
            LifecycleCallback lifecycleCallback = this.f1125e;
            bundle = i3Var.e0;
            if (bundle != null) {
                bundle3 = i3Var.e0;
                bundle2 = bundle3.getBundle(this.f1126f);
            } else {
                bundle2 = null;
            }
            lifecycleCallback.f(bundle2);
        }
        i3 = this.f1127g.d0;
        if (i3 >= 2) {
            this.f1125e.j();
        }
        i4 = this.f1127g.d0;
        if (i4 >= 3) {
            this.f1125e.h();
        }
        i5 = this.f1127g.d0;
        if (i5 >= 4) {
            this.f1125e.k();
        }
        i6 = this.f1127g.d0;
        if (i6 >= 5) {
            this.f1125e.g();
        }
    }
}
