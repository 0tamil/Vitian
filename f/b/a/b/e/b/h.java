package f.b.a.b.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
import java.util.List;
/* loaded from: classes.dex */
public final class h extends a implements j {
    public static final Parcelable.Creator<h> CREATOR = new i();

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f2387e;

    /* renamed from: f  reason: collision with root package name */
    private final String f2388f;

    public h(List<String> list, String str) {
        this.f2387e = list;
        this.f2388f = str;
    }

    @Override // com.google.android.gms.common.api.j
    public final Status a() {
        return this.f2388f != null ? Status.f1046j : Status.m;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.l(parcel, 1, this.f2387e, false);
        c.k(parcel, 2, this.f2388f, false);
        c.b(parcel, a);
    }
}
