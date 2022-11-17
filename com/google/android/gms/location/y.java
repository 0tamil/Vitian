package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class y implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        boolean z = false;
        ArrayList arrayList = null;
        w wVar = null;
        boolean z2 = false;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i2 = b.i(l);
            if (i2 == 1) {
                arrayList = b.g(parcel, l, LocationRequest.CREATOR);
            } else if (i2 == 2) {
                z = b.j(parcel, l);
            } else if (i2 == 3) {
                z2 = b.j(parcel, l);
            } else if (i2 != 5) {
                b.q(parcel, l);
            } else {
                wVar = (w) b.c(parcel, l, w.CREATOR);
            }
        }
        b.h(parcel, r);
        return new e(arrayList, z, z2, wVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e[] newArray(int i2) {
        return new e[i2];
    }
}
