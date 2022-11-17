package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class e0 implements Parcelable.Creator<d0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d0 createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        long j2 = 50;
        long j3 = Long.MAX_VALUE;
        boolean z = true;
        float f2 = 0.0f;
        int i2 = Integer.MAX_VALUE;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i3 = b.i(l);
            if (i3 == 1) {
                z = b.j(parcel, l);
            } else if (i3 == 2) {
                j2 = b.o(parcel, l);
            } else if (i3 == 3) {
                f2 = b.k(parcel, l);
            } else if (i3 == 4) {
                j3 = b.o(parcel, l);
            } else if (i3 != 5) {
                b.q(parcel, l);
            } else {
                i2 = b.n(parcel, l);
            }
        }
        b.h(parcel, r);
        return new d0(z, j2, f2, j3, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ d0[] newArray(int i2) {
        return new d0[i2];
    }
}
