package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public class f extends a {
    public static final Parcelable.Creator<f> CREATOR = new g1();

    /* renamed from: e  reason: collision with root package name */
    private final r f1234e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f1235f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f1236g;

    /* renamed from: h  reason: collision with root package name */
    private final int[] f1237h;

    /* renamed from: i  reason: collision with root package name */
    private final int f1238i;

    /* renamed from: j  reason: collision with root package name */
    private final int[] f1239j;

    public f(r rVar, boolean z, boolean z2, int[] iArr, int i2, int[] iArr2) {
        this.f1234e = rVar;
        this.f1235f = z;
        this.f1236g = z2;
        this.f1237h = iArr;
        this.f1238i = i2;
        this.f1239j = iArr2;
    }

    public int b() {
        return this.f1238i;
    }

    public int[] c() {
        return this.f1237h;
    }

    public int[] d() {
        return this.f1239j;
    }

    public boolean e() {
        return this.f1235f;
    }

    public boolean f() {
        return this.f1236g;
    }

    public final r g() {
        return this.f1234e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.j(parcel, 1, this.f1234e, i2, false);
        c.c(parcel, 2, e());
        c.c(parcel, 3, f());
        c.h(parcel, 4, c(), false);
        c.g(parcel, 5, b());
        c.h(parcel, 6, d(), false);
        c.b(parcel, a);
    }
}
