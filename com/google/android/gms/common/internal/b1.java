package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
/* loaded from: classes.dex */
public final class b1 implements ServiceConnection {
    private final int a;
    final /* synthetic */ c b;

    public b1(c cVar, int i2) {
        this.b = cVar;
        this.a = i2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        c cVar = this.b;
        if (iBinder == null) {
            c.g0(cVar, 16);
            return;
        }
        obj = cVar.l;
        synchronized (obj) {
            c cVar2 = this.b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.m = (queryLocalInterface == null || !(queryLocalInterface instanceof m)) ? new u0(iBinder) : (m) queryLocalInterface;
        }
        this.b.h0(0, null, this.a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.b.l;
        synchronized (obj) {
            this.b.m = null;
        }
        Handler handler = this.b.f1216j;
        handler.sendMessage(handler.obtainMessage(6, this.a, 1));
    }
}
