package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class f1 implements Parcelable.Creator<e1> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ e1 createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        Bundle bundle = null;
        c[] cVarArr = null;
        f fVar = null;
        int i2 = 0;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i3 = b.i(l);
            if (i3 == 1) {
                bundle = b.a(parcel, l);
            } else if (i3 == 2) {
                cVarArr = (c[]) b.f(parcel, l, c.CREATOR);
            } else if (i3 == 3) {
                i2 = b.n(parcel, l);
            } else if (i3 != 4) {
                b.q(parcel, l);
            } else {
                fVar = (f) b.c(parcel, l, f.CREATOR);
            }
        }
        b.h(parcel, r);
        return new e1(bundle, cVarArr, i2, fVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ e1[] newArray(int i2) {
        return new e1[i2];
    }
}
