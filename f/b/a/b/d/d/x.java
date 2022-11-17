package f.b.a.b.d.d;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.b;
/* loaded from: classes.dex */
public final class x implements Parcelable.Creator<w> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ w createFromParcel(Parcel parcel) {
        int r = b.r(parcel);
        u uVar = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        IBinder iBinder3 = null;
        int i2 = 1;
        while (parcel.dataPosition() < r) {
            int l = b.l(parcel);
            switch (b.i(l)) {
                case 1:
                    i2 = b.n(parcel, l);
                    break;
                case 2:
                    uVar = (u) b.c(parcel, l, u.CREATOR);
                    break;
                case 3:
                    iBinder = b.m(parcel, l);
                    break;
                case 4:
                    pendingIntent = (PendingIntent) b.c(parcel, l, PendingIntent.CREATOR);
                    break;
                case 5:
                    iBinder2 = b.m(parcel, l);
                    break;
                case 6:
                    iBinder3 = b.m(parcel, l);
                    break;
                default:
                    b.q(parcel, l);
                    break;
            }
        }
        b.h(parcel, r);
        return new w(i2, uVar, iBinder, pendingIntent, iBinder2, iBinder3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ w[] newArray(int i2) {
        return new w[i2];
    }
}
