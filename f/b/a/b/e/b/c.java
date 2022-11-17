package f.b.a.b.e.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ b createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        int i2 = 0;
        Intent intent = null;
        int i3 = 0;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i4 = b.i(l);
            if (i4 == 1) {
                i2 = b.n(parcel, l);
            } else if (i4 == 2) {
                i3 = b.n(parcel, l);
            } else if (i4 != 3) {
                b.q(parcel, l);
            } else {
                intent = (Intent) b.c(parcel, l, Intent.CREATOR);
            }
        }
        b.h(parcel, r);
        return new b(i2, i3, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ b[] newArray(int i2) {
        return new b[i2];
    }
}
