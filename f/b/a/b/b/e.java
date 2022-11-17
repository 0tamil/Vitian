package f.b.a.b.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class e implements Parcelable.Creator<a> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        Intent intent = null;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            if (b.i(l) != 1) {
                b.q(parcel, l);
            } else {
                intent = (Intent) b.c(parcel, l, Intent.CREATOR);
            }
        }
        b.h(parcel, r);
        return new a(intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ a[] newArray(int i2) {
        return new a[i2];
    }
}
