package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public class r extends a {
    public static final Parcelable.Creator<r> CREATOR = new x0();

    /* renamed from: e  reason: collision with root package name */
    private final int f1290e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1291f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f1292g;

    /* renamed from: h  reason: collision with root package name */
    private final int f1293h;

    /* renamed from: i  reason: collision with root package name */
    private final int f1294i;

    public r(int i2, boolean z, boolean z2, int i3, int i4) {
        this.f1290e = i2;
        this.f1291f = z;
        this.f1292g = z2;
        this.f1293h = i3;
        this.f1294i = i4;
    }

    public int b() {
        return this.f1293h;
    }

    public int c() {
        return this.f1294i;
    }

    public boolean d() {
        return this.f1291f;
    }

    public boolean e() {
        return this.f1292g;
    }

    public int f() {
        return this.f1290e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, f());
        c.c(parcel, 2, d());
        c.c(parcel, 3, e());
        c.g(parcel, 4, b());
        c.g(parcel, 5, c());
        c.b(parcel, a);
    }
}
