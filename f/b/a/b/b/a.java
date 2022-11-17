package f.b.a.b.b;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public final class a extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<a> CREATOR = new e();

    /* renamed from: e  reason: collision with root package name */
    Intent f2319e;

    public a(Intent intent) {
        this.f2319e = intent;
    }

    public Intent b() {
        return this.f2319e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.j(parcel, 1, this.f2319e, i2, false);
        c.b(parcel, a);
    }
}
