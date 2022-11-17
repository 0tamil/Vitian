package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class g1 implements Parcelable.Creator<f> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        r rVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            switch (b.i(l)) {
                case 1:
                    rVar = (r) b.c(parcel, l, r.CREATOR);
                    break;
                case 2:
                    z = b.j(parcel, l);
                    break;
                case 3:
                    z2 = b.j(parcel, l);
                    break;
                case 4:
                    iArr = b.b(parcel, l);
                    break;
                case 5:
                    i2 = b.n(parcel, l);
                    break;
                case 6:
                    iArr2 = b.b(parcel, l);
                    break;
                default:
                    b.q(parcel, l);
                    break;
            }
        }
        b.h(parcel, r);
        return new f(rVar, z, z2, iArr, i2, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ f[] newArray(int i2) {
        return new f[i2];
    }
}
