package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class LocationAvailability extends a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new r();
    @Deprecated

    /* renamed from: e  reason: collision with root package name */
    int f1305e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    int f1306f;

    /* renamed from: g  reason: collision with root package name */
    long f1307g;

    /* renamed from: h  reason: collision with root package name */
    int f1308h;

    /* renamed from: i  reason: collision with root package name */
    b0[] f1309i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationAvailability(int i2, int i3, int i4, long j2, b0[] b0VarArr) {
        this.f1308h = i2;
        this.f1305e = i3;
        this.f1306f = i4;
        this.f1307g = j2;
        this.f1309i = b0VarArr;
    }

    public boolean b() {
        return this.f1308h < 1000;
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f1305e == locationAvailability.f1305e && this.f1306f == locationAvailability.f1306f && this.f1307g == locationAvailability.f1307g && this.f1308h == locationAvailability.f1308h && Arrays.equals(this.f1309i, locationAvailability.f1309i)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f1308h), Integer.valueOf(this.f1305e), Integer.valueOf(this.f1306f), Long.valueOf(this.f1307g), this.f1309i);
    }

    @RecentlyNonNull
    public String toString() {
        boolean b = b();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(b);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, this.f1305e);
        c.g(parcel, 2, this.f1306f);
        c.i(parcel, 3, this.f1307g);
        c.g(parcel, 4, this.f1308h);
        c.m(parcel, 5, this.f1309i, i2, false);
        c.b(parcel, a);
    }
}
