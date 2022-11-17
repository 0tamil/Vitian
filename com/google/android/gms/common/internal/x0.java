package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class x0 implements Parcelable.Creator<r> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ r createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i5 = b.i(l);
            if (i5 == 1) {
                i2 = b.n(parcel, l);
            } else if (i5 == 2) {
                z = b.j(parcel, l);
            } else if (i5 == 3) {
                z2 = b.j(parcel, l);
            } else if (i5 == 4) {
                i3 = b.n(parcel, l);
            } else if (i5 != 5) {
                b.q(parcel, l);
            } else {
                i4 = b.n(parcel, l);
            }
        }
        b.h(parcel, r);
        return new r(i2, z, z2, i3, i4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ r[] newArray(int i2) {
        return new r[i2];
    }
}
