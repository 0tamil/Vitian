package com.google.android.gms.common.internal.y;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.m;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.h;
import com.google.android.gms.common.internal.w;
import f.b.a.b.d.a.d;
/* loaded from: classes.dex */
public final class e extends h<a> {
    private final w E;

    public e(Context context, Looper looper, com.google.android.gms.common.internal.e eVar, w wVar, f fVar, m mVar) {
        super(context, looper, 270, eVar, fVar, mVar);
        this.E = wVar;
    }

    @Override // com.google.android.gms.common.internal.c
    protected final Bundle E() {
        return this.E.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final String I() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final String J() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // com.google.android.gms.common.internal.c
    protected final boolean M() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.c, com.google.android.gms.common.api.a.f
    public final int u() {
        return 203400000;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.common.internal.c
    public final /* synthetic */ IInterface w(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof a ? (a) queryLocalInterface : new a(iBinder);
    }

    @Override // com.google.android.gms.common.internal.c
    public final c[] z() {
        return d.b;
    }
}
