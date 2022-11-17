package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class n implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        PendingIntent pendingIntent = null;
        String str = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i4 = b.i(l);
            if (i4 == 1) {
                i2 = b.n(parcel, l);
            } else if (i4 == 2) {
                i3 = b.n(parcel, l);
            } else if (i4 == 3) {
                pendingIntent = (PendingIntent) b.c(parcel, l, PendingIntent.CREATOR);
            } else if (i4 != 4) {
                b.q(parcel, l);
            } else {
                str = b.d(parcel, l);
            }
        }
        b.h(parcel, r);
        return new a(i2, i3, pendingIntent, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ a[] newArray(int i2) {
        return new a[i2];
    }
}
