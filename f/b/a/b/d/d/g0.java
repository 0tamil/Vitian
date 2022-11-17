package f.b.a.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.x.b;
import com.google.android.gms.location.d0;
import java.util.List;
/* loaded from: classes.dex */
public final class g0 implements Parcelable.Creator<f0> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f0 createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        d0 d0Var = f0.f2352i;
        List<d> list = f0.f2351h;
        String str = null;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i2 = b.i(l);
            if (i2 == 1) {
                d0Var = (d0) b.c(parcel, l, d0.CREATOR);
            } else if (i2 == 2) {
                list = b.g(parcel, l, d.CREATOR);
            } else if (i2 != 3) {
                b.q(parcel, l);
            } else {
                str = b.d(parcel, l);
            }
        }
        b.h(parcel, r);
        return new f0(d0Var, list, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ f0[] newArray(int i2) {
        return new f0[i2];
    }
}
