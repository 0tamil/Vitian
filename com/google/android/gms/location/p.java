package com.google.android.gms.location;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import f.b.a.b.d.d.c0;
import f.b.a.b.d.d.t;
/* loaded from: classes.dex */
public abstract class p extends t implements q {
    public p() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static q b(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof q ? (q) queryLocalInterface : new o(iBinder);
    }

    @Override // f.b.a.b.d.d.t
    protected final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        q((Location) c0.b(parcel, Location.CREATOR));
        return true;
    }
}
