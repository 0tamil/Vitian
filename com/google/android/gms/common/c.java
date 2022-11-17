package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.x.a;
/* loaded from: classes.dex */
public class c extends a {
    public static final Parcelable.Creator<c> CREATOR = new o();

    /* renamed from: e  reason: collision with root package name */
    private final String f1206e;
    @Deprecated

    /* renamed from: f  reason: collision with root package name */
    private final int f1207f;

    /* renamed from: g  reason: collision with root package name */
    private final long f1208g;

    public c(String str, int i2, long j2) {
        this.f1206e = str;
        this.f1207f = i2;
        this.f1208g = j2;
    }

    public c(String str, long j2) {
        this.f1206e = str;
        this.f1208g = j2;
        this.f1207f = -1;
    }

    public String b() {
        return this.f1206e;
    }

    public long c() {
        long j2 = this.f1208g;
        return j2 == -1 ? this.f1207f : j2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (((b() != null && b().equals(cVar.b())) || (b() == null && cVar.b() == null)) && c() == cVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return o.b(b(), Long.valueOf(c()));
    }

    public final String toString() {
        o.a c = o.c(this);
        c.a("name", b());
        c.a("version", Long.valueOf(c()));
        return c.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.k(parcel, 1, b(), false);
        com.google.android.gms.common.internal.x.c.g(parcel, 2, this.f1207f);
        com.google.android.gms.common.internal.x.c.i(parcel, 3, c());
        com.google.android.gms.common.internal.x.c.b(parcel, a);
    }
}
