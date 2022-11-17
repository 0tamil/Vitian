package f.b.a.b.d.d;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class i0 implements Parcelable.Creator<h0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h0 createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        f0 f0Var = null;
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        int i2 = 1;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i3 = b.i(l);
            if (i3 == 1) {
                i2 = b.n(parcel, l);
            } else if (i3 == 2) {
                f0Var = (f0) b.c(parcel, l, f0.CREATOR);
            } else if (i3 == 3) {
                iBinder = b.m(parcel, l);
            } else if (i3 != 4) {
                b.q(parcel, l);
            } else {
                iBinder2 = b.m(parcel, l);
            }
        }
        b.h(parcel, r);
        return new h0(i2, f0Var, iBinder, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h0[] newArray(int i2) {
        return new h0[i2];
    }
}
