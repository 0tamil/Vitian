package f.b.a.b.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ h createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        ArrayList<String> arrayList = null;
        String str = null;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i2 = b.i(l);
            if (i2 == 1) {
                arrayList = b.e(parcel, l);
            } else if (i2 != 2) {
                b.q(parcel, l);
            } else {
                str = b.d(parcel, l);
            }
        }
        b.h(parcel, r);
        return new h(arrayList, str);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ h[] newArray(int i2) {
        return new h[i2];
    }
}
