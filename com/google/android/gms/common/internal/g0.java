package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.i;
/* loaded from: classes.dex */
final class g0 extends h0 {

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ Intent f1250e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ i f1251f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g0(Intent intent, i iVar, int i2) {
        this.f1250e = intent;
        this.f1251f = iVar;
    }

    @Override // com.google.android.gms.common.internal.h0
    public final void a() {
        Intent intent = this.f1250e;
        if (intent != null) {
            this.f1251f.startActivityForResult(intent, 2);
        }
    }
}
