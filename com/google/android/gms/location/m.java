package com.google.android.gms.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import f.b.a.b.d.d.c0;
import f.b.a.b.d.d.t;
/* loaded from: classes.dex */
public abstract class m extends t implements n {
    public static n b(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof n ? (n) queryLocalInterface : new l(iBinder);
    }

    @Override // f.b.a.b.d.d.t
    protected final boolean a(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            v((LocationResult) c0.b(parcel, LocationResult.CREATOR));
        } else if (i2 != 2) {
            return false;
        } else {
            m((LocationAvailability) c0.b(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
