package f.b.a.b.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.a;
import com.google.android.gms.common.internal.q0;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class m implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ l createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        a aVar = null;
        q0 q0Var = null;
        int i2 = 0;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i3 = b.i(l);
            if (i3 == 1) {
                i2 = b.n(parcel, l);
            } else if (i3 == 2) {
                aVar = (a) b.c(parcel, l, a.CREATOR);
            } else if (i3 != 3) {
                b.q(parcel, l);
            } else {
                q0Var = (q0) b.c(parcel, l, q0.CREATOR);
            }
        }
        b.h(parcel, r);
        return new l(i2, aVar, q0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ l[] newArray(int i2) {
        return new l[i2];
    }
}
