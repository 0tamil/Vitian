package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public final class d0 extends a {
    public static final Parcelable.Creator<d0> CREATOR = new e0();

    /* renamed from: e  reason: collision with root package name */
    boolean f1325e;

    /* renamed from: f  reason: collision with root package name */
    long f1326f;

    /* renamed from: g  reason: collision with root package name */
    float f1327g;

    /* renamed from: h  reason: collision with root package name */
    long f1328h;

    /* renamed from: i  reason: collision with root package name */
    int f1329i;

    public d0() {
        this(true, 50L, 0.0f, Long.MAX_VALUE, Integer.MAX_VALUE);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d0(boolean z, long j2, float f2, long j3, int i2) {
        this.f1325e = z;
        this.f1326f = j2;
        this.f1327g = f2;
        this.f1328h = j3;
        this.f1329i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.f1325e == d0Var.f1325e && this.f1326f == d0Var.f1326f && Float.compare(this.f1327g, d0Var.f1327g) == 0 && this.f1328h == d0Var.f1328h && this.f1329i == d0Var.f1329i;
    }

    public final int hashCode() {
        return o.b(Boolean.valueOf(this.f1325e), Long.valueOf(this.f1326f), Float.valueOf(this.f1327g), Long.valueOf(this.f1328h), Integer.valueOf(this.f1329i));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.f1325e);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.f1326f);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.f1327g);
        long j2 = this.f1328h;
        if (j2 != Long.MAX_VALUE) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j2 - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f1329i != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f1329i);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.c(parcel, 1, this.f1325e);
        c.i(parcel, 2, this.f1326f);
        c.e(parcel, 3, this.f1327g);
        c.i(parcel, 4, this.f1328h);
        c.g(parcel, 5, this.f1329i);
        c.b(parcel, a);
    }
}
