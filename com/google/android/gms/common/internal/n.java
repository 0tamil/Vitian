package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public class n extends a {
    public static final Parcelable.Creator<n> CREATOR = new n0();

    /* renamed from: e  reason: collision with root package name */
    private final int f1273e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1274f;

    /* renamed from: g  reason: collision with root package name */
    private final int f1275g;

    /* renamed from: h  reason: collision with root package name */
    private final long f1276h;

    /* renamed from: i  reason: collision with root package name */
    private final long f1277i;

    /* renamed from: j  reason: collision with root package name */
    private final String f1278j;

    /* renamed from: k  reason: collision with root package name */
    private final String f1279k;
    private final int l;
    private final int m;

    public n(int i2, int i3, int i4, long j2, long j3, String str, String str2, int i5, int i6) {
        this.f1273e = i2;
        this.f1274f = i3;
        this.f1275g = i4;
        this.f1276h = j2;
        this.f1277i = j3;
        this.f1278j = str;
        this.f1279k = str2;
        this.l = i5;
        this.m = i6;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, this.f1273e);
        c.g(parcel, 2, this.f1274f);
        c.g(parcel, 3, this.f1275g);
        c.i(parcel, 4, this.f1276h);
        c.i(parcel, 5, this.f1277i);
        c.k(parcel, 6, this.f1278j, false);
        c.k(parcel, 7, this.f1279k, false);
        c.g(parcel, 8, this.l);
        c.g(parcel, 9, this.m);
        c.b(parcel, a);
    }
}
