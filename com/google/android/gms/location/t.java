package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
import java.util.List;
/* loaded from: classes.dex */
public final class t implements Parcelable.Creator<LocationResult> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        List<Location> list = LocationResult.f1317f;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            if (b.i(l) != 1) {
                b.q(parcel, l);
            } else {
                list = b.g(parcel, l, Location.CREATOR);
            }
        }
        b.h(parcel, r);
        return new LocationResult(list);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationResult[] newArray(int i2) {
        return new LocationResult[i2];
    }
}
