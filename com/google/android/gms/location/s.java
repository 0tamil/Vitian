package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class s implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        long j2 = 3600000;
        long j3 = 600000;
        long j4 = Long.MAX_VALUE;
        long j5 = 0;
        int i2 = 102;
        boolean z = false;
        int i3 = Integer.MAX_VALUE;
        float f2 = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            switch (b.i(l)) {
                case 1:
                    i2 = b.n(parcel, l);
                    break;
                case 2:
                    j2 = b.o(parcel, l);
                    break;
                case 3:
                    j3 = b.o(parcel, l);
                    break;
                case 4:
                    z = b.j(parcel, l);
                    break;
                case 5:
                    j4 = b.o(parcel, l);
                    break;
                case 6:
                    i3 = b.n(parcel, l);
                    break;
                case 7:
                    f2 = b.k(parcel, l);
                    break;
                case 8:
                    j5 = b.o(parcel, l);
                    break;
                case 9:
                    z2 = b.j(parcel, l);
                    break;
                default:
                    b.q(parcel, l);
                    break;
            }
        }
        b.h(parcel, r);
        return new LocationRequest(i2, j2, j3, z, j4, i3, f2, j5, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i2) {
        return new LocationRequest[i2];
    }
}
