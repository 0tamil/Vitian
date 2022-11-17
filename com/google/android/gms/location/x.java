package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class x implements Parcelable.Creator<w> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ w createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i2 = b.i(l);
            if (i2 == 1) {
                str2 = b.d(parcel, l);
            } else if (i2 == 2) {
                str3 = b.d(parcel, l);
            } else if (i2 != 5) {
                b.q(parcel, l);
            } else {
                str = b.d(parcel, l);
            }
        }
        b.h(parcel, r);
        return new w(str, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ w[] newArray(int i2) {
        return new w[i2];
    }
}
