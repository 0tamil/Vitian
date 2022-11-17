package f.b.a.b.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.o0;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class k implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ j createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        int i2 = 0;
        o0 o0Var = null;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i3 = b.i(l);
            if (i3 == 1) {
                i2 = b.n(parcel, l);
            } else if (i3 != 2) {
                b.q(parcel, l);
            } else {
                o0Var = (o0) b.c(parcel, l, o0.CREATOR);
            }
        }
        b.h(parcel, r);
        return new j(i2, o0Var);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ j[] newArray(int i2) {
        return new j[i2];
    }
}
