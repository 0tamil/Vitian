package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public class d extends a {
    public static final Parcelable.Creator<d> CREATOR = new z();

    /* renamed from: e  reason: collision with root package name */
    public final int f1220e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1221f;

    public d(int i2, String str) {
        this.f1220e = i2;
        this.f1221f = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f1220e == this.f1220e && o.a(dVar.f1221f, this.f1221f);
    }

    public final int hashCode() {
        return this.f1220e;
    }

    public final String toString() {
        int i2 = this.f1220e;
        String str = this.f1221f;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i2);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, this.f1220e);
        c.k(parcel, 2, this.f1221f, false);
        c.b(parcel, a);
    }
}
