package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
/* loaded from: classes.dex */
final class u0 implements m {
    private final IBinder a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // com.google.android.gms.common.internal.m
    public final void D(l lVar, g gVar) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(lVar != null ? lVar.asBinder() : null);
            if (gVar != null) {
                obtain.writeInt(1);
                h1.a(gVar, obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
