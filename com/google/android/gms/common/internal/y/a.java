package com.google.android.gms.common.internal.y;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.internal.t;
import f.b.a.b.d.a.c;
/* loaded from: classes.dex */
public final class a extends f.b.a.b.d.a.a implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public a(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void J(t tVar) {
        Parcel a = a();
        c.c(a, tVar);
        d(1, a);
    }
}
