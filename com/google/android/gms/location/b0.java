package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public final class b0 extends a {
    public static final Parcelable.Creator<b0> CREATOR = new c0();

    /* renamed from: e  reason: collision with root package name */
    public final int f1319e;

    /* renamed from: f  reason: collision with root package name */
    public final int f1320f;

    /* renamed from: g  reason: collision with root package name */
    public final long f1321g;

    /* renamed from: h  reason: collision with root package name */
    public final long f1322h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b0(int i2, int i3, long j2, long j3) {
        this.f1319e = i2;
        this.f1320f = i3;
        this.f1321g = j2;
        this.f1322h = j3;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.f1319e == b0Var.f1319e && this.f1320f == b0Var.f1320f && this.f1321g == b0Var.f1321g && this.f1322h == b0Var.f1322h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return o.b(Integer.valueOf(this.f1320f), Integer.valueOf(this.f1319e), Long.valueOf(this.f1322h), Long.valueOf(this.f1321g));
    }

    public final String toString() {
        return "NetworkLocationStatus: Wifi status: " + this.f1319e + " Cell status: " + this.f1320f + " elapsed time NS: " + this.f1322h + " system time ms: " + this.f1321g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, this.f1319e);
        c.g(parcel, 2, this.f1320f);
        c.i(parcel, 3, this.f1321g);
        c.i(parcel, 4, this.f1322h);
        c.b(parcel, a);
    }
}
