package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public final class LocationRequest extends a implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationRequest> CREATOR = new s();

    /* renamed from: e  reason: collision with root package name */
    int f1310e;

    /* renamed from: f  reason: collision with root package name */
    long f1311f;

    /* renamed from: g  reason: collision with root package name */
    long f1312g;

    /* renamed from: h  reason: collision with root package name */
    boolean f1313h;

    /* renamed from: i  reason: collision with root package name */
    long f1314i;

    /* renamed from: j  reason: collision with root package name */
    int f1315j;

    /* renamed from: k  reason: collision with root package name */
    float f1316k;
    long l;
    boolean m;

    @Deprecated
    public LocationRequest() {
        this.f1310e = 102;
        this.f1311f = 3600000L;
        this.f1312g = 600000L;
        this.f1313h = false;
        this.f1314i = Long.MAX_VALUE;
        this.f1315j = Integer.MAX_VALUE;
        this.f1316k = 0.0f;
        this.l = 0L;
        this.m = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LocationRequest(int i2, long j2, long j3, boolean z, long j4, int i3, float f2, long j5, boolean z2) {
        this.f1310e = i2;
        this.f1311f = j2;
        this.f1312g = j3;
        this.f1313h = z;
        this.f1314i = j4;
        this.f1315j = i3;
        this.f1316k = f2;
        this.l = j5;
        this.m = z2;
    }

    @RecentlyNonNull
    public static LocationRequest b() {
        LocationRequest locationRequest = new LocationRequest();
        locationRequest.g(true);
        return locationRequest;
    }

    private static void h(long j2) {
        if (j2 < 0) {
            StringBuilder sb = new StringBuilder(38);
            sb.append("invalid interval: ");
            sb.append(j2);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public long c() {
        long j2 = this.l;
        long j3 = this.f1311f;
        return j2 < j3 ? j3 : j2;
    }

    @RecentlyNonNull
    public LocationRequest d(long j2) {
        h(j2);
        this.f1313h = true;
        this.f1312g = j2;
        return this;
    }

    @RecentlyNonNull
    public LocationRequest e(long j2) {
        h(j2);
        this.f1311f = j2;
        if (!this.f1313h) {
            this.f1312g = (long) (j2 / 6.0d);
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.f1310e == locationRequest.f1310e && this.f1311f == locationRequest.f1311f && this.f1312g == locationRequest.f1312g && this.f1313h == locationRequest.f1313h && this.f1314i == locationRequest.f1314i && this.f1315j == locationRequest.f1315j && this.f1316k == locationRequest.f1316k && c() == locationRequest.c() && this.m == locationRequest.m) {
                return true;
            }
        }
        return false;
    }

    @RecentlyNonNull
    public LocationRequest f(int i2) {
        if (i2 == 100 || i2 == 102 || i2 == 104 || i2 == 105) {
            this.f1310e = i2;
            return this;
        }
        StringBuilder sb = new StringBuilder(28);
        sb.append("invalid quality: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    @RecentlyNonNull
    public LocationRequest g(boolean z) {
        this.m = z;
        return this;
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f1310e), Long.valueOf(this.f1311f), Float.valueOf(this.f1316k), Long.valueOf(this.l));
    }

    @RecentlyNonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i2 = this.f1310e;
        sb.append(i2 != 100 ? i2 != 102 ? i2 != 104 ? i2 != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.f1310e != 105) {
            sb.append(" requested=");
            sb.append(this.f1311f);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.f1312g);
        sb.append("ms");
        if (this.l > this.f1311f) {
            sb.append(" maxWait=");
            sb.append(this.l);
            sb.append("ms");
        }
        if (this.f1316k > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.f1316k);
            sb.append("m");
        }
        long j2 = this.f1314i;
        if (j2 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j2 - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f1315j != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f1315j);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, this.f1310e);
        c.i(parcel, 2, this.f1311f);
        c.i(parcel, 3, this.f1312g);
        c.c(parcel, 4, this.f1313h);
        c.i(parcel, 5, this.f1314i);
        c.g(parcel, 6, this.f1315j);
        c.e(parcel, 7, this.f1316k);
        c.i(parcel, 8, this.l);
        c.c(parcel, 9, this.m);
        c.b(parcel, a);
    }
}
