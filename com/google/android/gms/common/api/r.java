package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class r implements Parcelable.Creator<Status> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Status createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        String str = null;
        PendingIntent pendingIntent = null;
        a aVar = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i4 = b.i(l);
            if (i4 == 1) {
                i3 = b.n(parcel, l);
            } else if (i4 == 2) {
                str = b.d(parcel, l);
            } else if (i4 == 3) {
                pendingIntent = (PendingIntent) b.c(parcel, l, PendingIntent.CREATOR);
            } else if (i4 == 4) {
                aVar = (a) b.c(parcel, l, a.CREATOR);
            } else if (i4 != 1000) {
                b.q(parcel, l);
            } else {
                i2 = b.n(parcel, l);
            }
        }
        b.h(parcel, r);
        return new Status(i2, i3, str, pendingIntent, aVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Status[] newArray(int i2) {
        return new Status[i2];
    }
}
