package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class o implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ c createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        String str = null;
        int i2 = 0;
        long j2 = -1;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i3 = b.i(l);
            if (i3 == 1) {
                str = b.d(parcel, l);
            } else if (i3 == 2) {
                i2 = b.n(parcel, l);
            } else if (i3 != 3) {
                b.q(parcel, l);
            } else {
                j2 = b.o(parcel, l);
            }
        }
        b.h(parcel, r);
        return new c(str, i2, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ c[] newArray(int i2) {
        return new c[i2];
    }
}
