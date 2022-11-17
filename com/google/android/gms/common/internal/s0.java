package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.common.a;
/* loaded from: classes.dex */
abstract class s0 extends z0<Boolean> {

    /* renamed from: d  reason: collision with root package name */
    public final int f1295d;

    /* renamed from: e  reason: collision with root package name */
    public final Bundle f1296e;

    /* renamed from: f  reason: collision with root package name */
    final /* synthetic */ c f1297f;

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(c cVar, int i2, Bundle bundle) {
        super(cVar, Boolean.TRUE);
        this.f1297f = cVar;
        this.f1295d = i2;
        this.f1296e = bundle;
    }

    @Override // com.google.android.gms.common.internal.z0
    protected final /* bridge */ /* synthetic */ void a(Boolean bool) {
        a aVar;
        PendingIntent pendingIntent = null;
        if (this.f1295d != 0) {
            this.f1297f.l0(1, null);
            Bundle bundle = this.f1296e;
            if (bundle != null) {
                pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
            }
            aVar = new a(this.f1295d, pendingIntent);
        } else if (!g()) {
            this.f1297f.l0(1, null);
            aVar = new a(8, null);
        } else {
            return;
        }
        f(aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.z0
    public final void b() {
    }

    protected abstract void f(a aVar);

    protected abstract boolean g();
}
