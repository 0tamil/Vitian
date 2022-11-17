package f.b.a.b.b;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
final class g implements Parcelable.Creator<i> {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ i createFromParcel(Parcel parcel) {
        return new i(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ i[] newArray(int i2) {
        return new i[i2];
    }
}
