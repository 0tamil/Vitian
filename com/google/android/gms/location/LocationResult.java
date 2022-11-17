package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public final class LocationResult extends a implements ReflectedParcelable {

    /* renamed from: e  reason: collision with root package name */
    private final List<Location> f1318e;

    /* renamed from: f  reason: collision with root package name */
    static final List<Location> f1317f = Collections.emptyList();
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationResult> CREATOR = new t();

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationResult(List<Location> list) {
        this.f1318e = list;
    }

    @RecentlyNonNull
    public List<Location> b() {
        return this.f1318e;
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (!(obj instanceof LocationResult)) {
            return false;
        }
        LocationResult locationResult = (LocationResult) obj;
        if (locationResult.f1318e.size() != this.f1318e.size()) {
            return false;
        }
        Iterator<Location> it = this.f1318e.iterator();
        for (Location location : locationResult.f1318e) {
            if (it.next().getTime() != location.getTime()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i2 = 17;
        for (Location location : this.f1318e) {
            long time = location.getTime();
            i2 = (i2 * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i2;
    }

    @RecentlyNonNull
    public String toString() {
        String valueOf = String.valueOf(this.f1318e);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.n(parcel, 1, b(), false);
        c.b(parcel, a);
    }
}
