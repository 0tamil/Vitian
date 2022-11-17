package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class r implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        long j2 = 0;
        b0[] b0VarArr = null;
        int i2 = 1000;
        int i3 = 1;
        int i4 = 1;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i5 = b.i(l);
            if (i5 == 1) {
                i3 = b.n(parcel, l);
            } else if (i5 == 2) {
                i4 = b.n(parcel, l);
            } else if (i5 == 3) {
                j2 = b.o(parcel, l);
            } else if (i5 == 4) {
                i2 = b.n(parcel, l);
            } else if (i5 != 5) {
                b.q(parcel, l);
            } else {
                b0VarArr = (b0[]) b.f(parcel, l, b0.CREATOR);
            }
        }
        b.h(parcel, r);
        return new LocationAvailability(i2, i3, i4, j2, b0VarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i2) {
        return new LocationAvailability[i2];
    }
}
