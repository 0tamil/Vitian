package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class r0 implements Parcelable.Creator<q0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ q0 createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        IBinder iBinder = null;
        a aVar = null;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i3 = b.i(l);
            if (i3 == 1) {
                i2 = b.n(parcel, l);
            } else if (i3 == 2) {
                iBinder = b.m(parcel, l);
            } else if (i3 == 3) {
                aVar = (a) b.c(parcel, l, a.CREATOR);
            } else if (i3 == 4) {
                z = b.j(parcel, l);
            } else if (i3 != 5) {
                b.q(parcel, l);
            } else {
                z2 = b.j(parcel, l);
            }
        }
        b.h(parcel, r);
        return new q0(i2, iBinder, aVar, z, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ q0[] newArray(int i2) {
        return new q0[i2];
    }
}
