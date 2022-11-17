package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class z implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        Status status = null;
        g gVar = null;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i2 = b.i(l);
            if (i2 == 1) {
                status = (Status) b.c(parcel, l, Status.CREATOR);
            } else if (i2 != 2) {
                b.q(parcel, l);
            } else {
                gVar = (g) b.c(parcel, l, g.CREATOR);
            }
        }
        b.h(parcel, r);
        return new f(status, gVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f[] newArray(int i2) {
        return new f[i2];
    }
}
