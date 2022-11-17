package f.b.a.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.x.b;
import com.google.android.gms.location.LocationRequest;
import java.util.List;
/* loaded from: classes.dex */
public final class v implements Parcelable.Creator<u> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ u createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        List<d> list = u.p;
        LocationRequest locationRequest = null;
        long j2 = Long.MAX_VALUE;
        String str = null;
        String str2 = null;
        String str3 = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            int i2 = b.i(l);
            if (i2 != 1) {
                switch (i2) {
                    case 5:
                        list = b.g(parcel, l, d.CREATOR);
                        continue;
                    case 6:
                        str = b.d(parcel, l);
                        continue;
                    case 7:
                        z = b.j(parcel, l);
                        continue;
                    case 8:
                        z2 = b.j(parcel, l);
                        continue;
                    case 9:
                        z3 = b.j(parcel, l);
                        continue;
                    case 10:
                        str2 = b.d(parcel, l);
                        continue;
                    case 11:
                        z4 = b.j(parcel, l);
                        continue;
                    case 12:
                        z5 = b.j(parcel, l);
                        continue;
                    case 13:
                        str3 = b.d(parcel, l);
                        continue;
                    case 14:
                        j2 = b.o(parcel, l);
                        continue;
                    default:
                        b.q(parcel, l);
                        continue;
                }
            } else {
                locationRequest = (LocationRequest) b.c(parcel, l, LocationRequest.CREATOR);
            }
        }
        b.h(parcel, r);
        return new u(locationRequest, list, str, z, z2, z3, str2, z4, z5, str3, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ u[] newArray(int i2) {
        return new u[i2];
    }
}
