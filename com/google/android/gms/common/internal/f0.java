package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;
/* loaded from: classes.dex */
final class f0 extends h0 {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Intent f1240e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ Activity f1241f;

    /* renamed from: g  reason: collision with root package name */
    final /* synthetic */ int f1242g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(Intent intent, Activity activity, int i2) {
        this.f1240e = intent;
        this.f1241f = activity;
        this.f1242g = i2;
    }

    @Override // com.google.android.gms.common.internal.h0
    public final void a() {
        Intent intent = this.f1240e;
        if (intent != null) {
            this.f1241f.startActivityForResult(intent, this.f1242g);
        }
    }
}
