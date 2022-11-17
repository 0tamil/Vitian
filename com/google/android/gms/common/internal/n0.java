package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class n0 implements Parcelable.Creator<n> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ n createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        String str = null;
        long j2 = 0;
        String str2 = null;
        long j3 = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = -1;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            switch (b.i(l)) {
                case 1:
                    i2 = b.n(parcel, l);
                    break;
                case 2:
                    i3 = b.n(parcel, l);
                    break;
                case 3:
                    i4 = b.n(parcel, l);
                    break;
                case 4:
                    j2 = b.o(parcel, l);
                    break;
                case 5:
                    j3 = b.o(parcel, l);
                    break;
                case 6:
                    str = b.d(parcel, l);
                    break;
                case 7:
                    str2 = b.d(parcel, l);
                    break;
                case 8:
                    i5 = b.n(parcel, l);
                    break;
                case 9:
                    i6 = b.n(parcel, l);
                    break;
                default:
                    b.q(parcel, l);
                    break;
            }
        }
        b.h(parcel, r);
        return new n(i2, i3, i4, j2, j3, str, str2, i5, i6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ n[] newArray(int i2) {
        return new n[i2];
    }
}
