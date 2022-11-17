package f.b.a.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public final class b extends a implements j {
    public static final Parcelable.Creator<b> CREATOR = new c();

    /* renamed from: e  reason: collision with root package name */
    private final Status f2350e;

    static {
        Status status = Status.f1046j;
    }

    public b(Status status) {
        this.f2350e = status;
    }

    @Override // com.google.android.gms.common.api.j
    public final Status a() {
        return this.f2350e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.j(parcel, 1, this.f2350e, i2, false);
        c.b(parcel, a);
    }
}
