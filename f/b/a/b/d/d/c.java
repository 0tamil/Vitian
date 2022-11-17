package f.b.a.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        Status status = null;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            if (b.i(l) != 1) {
                b.q(parcel, l);
            } else {
                status = (Status) b.c(parcel, l, Status.CREATOR);
            }
        }
        b.h(parcel, r);
        return new b(status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b[] newArray(int i2) {
        return new b[i2];
    }
}
