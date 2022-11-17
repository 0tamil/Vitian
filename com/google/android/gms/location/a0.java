package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class a0 implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            switch (b.i(l)) {
                case 1:
                    z = b.j(parcel, l);
                    break;
                case 2:
                    z2 = b.j(parcel, l);
                    break;
                case 3:
                    z3 = b.j(parcel, l);
                    break;
                case 4:
                    z4 = b.j(parcel, l);
                    break;
                case 5:
                    z5 = b.j(parcel, l);
                    break;
                case 6:
                    z6 = b.j(parcel, l);
                    break;
                default:
                    b.q(parcel, l);
                    break;
            }
        }
        b.h(parcel, r);
        return new g(z, z2, z3, z4, z5, z6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ g[] newArray(int i2) {
        return new g[i2];
    }
}
