package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import f.b.a.b.d.d.t;
/* loaded from: classes.dex */
public class j extends t implements k {
    public static k b(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        return queryLocalInterface instanceof k ? (k) queryLocalInterface : new i(iBinder);
    }

    @Override // f.b.a.b.d.d.t
    protected final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        throw null;
    }
}
