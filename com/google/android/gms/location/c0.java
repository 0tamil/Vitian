package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class c0 implements Parcelable.Creator<b0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b0 createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        long j2 = -1;
        long j3 = -1;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i4 = b.i(l);
            if (i4 == 1) {
                i2 = b.n(parcel, l);
            } else if (i4 == 2) {
                i3 = b.n(parcel, l);
            } else if (i4 == 3) {
                j2 = b.o(parcel, l);
            } else if (i4 != 4) {
                b.q(parcel, l);
            } else {
                j3 = b.o(parcel, l);
            }
        }
        b.h(parcel, r);
        return new b0(i2, i3, j2, j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b0[] newArray(int i2) {
        return new b0[i2];
    }
}
