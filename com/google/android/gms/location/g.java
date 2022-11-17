package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public final class g extends a {
    @RecentlyNonNull
    public static final Parcelable.Creator<g> CREATOR = new a0();

    /* renamed from: e  reason: collision with root package name */
    private final boolean f1339e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1340f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f1341g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f1342h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f1343i;

    /* renamed from: j  reason: collision with root package name */
    private final boolean f1344j;

    public g(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f1339e = z;
        this.f1340f = z2;
        this.f1341g = z3;
        this.f1342h = z4;
        this.f1343i = z5;
        this.f1344j = z6;
    }

    public boolean b() {
        return this.f1344j;
    }

    public boolean c() {
        return this.f1341g;
    }

    public boolean d() {
        return this.f1342h;
    }

    public boolean e() {
        return this.f1339e;
    }

    public boolean f() {
        return this.f1343i;
    }

    public boolean g() {
        return this.f1340f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.c(parcel, 1, e());
        c.c(parcel, 2, g());
        c.c(parcel, 3, c());
        c.c(parcel, 4, d());
        c.c(parcel, 5, f());
        c.c(parcel, 6, b());
        c.b(parcel, a);
    }
}
