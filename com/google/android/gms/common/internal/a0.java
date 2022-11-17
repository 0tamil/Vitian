package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class a0 implements Parcelable.Creator<t> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ t createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        int i2 = 0;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i3 = b.i(l);
            if (i3 == 1) {
                i2 = b.n(parcel, l);
            } else if (i3 != 2) {
                b.q(parcel, l);
            } else {
                arrayList = b.g(parcel, l, n.CREATOR);
            }
        }
        b.h(parcel, r);
        return new t(i2, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ t[] newArray(int i2) {
        return new t[i2];
    }
}
