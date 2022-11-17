package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public final class f extends a implements j {
    @RecentlyNonNull
    public static final Parcelable.Creator<f> CREATOR = new z();

    /* renamed from: e  reason: collision with root package name */
    private final Status f1334e;

    /* renamed from: f  reason: collision with root package name */
    private final g f1335f;

    public f(@RecentlyNonNull Status status, g gVar) {
        this.f1334e = status;
        this.f1335f = gVar;
    }

    @Override // com.google.android.gms.common.api.j
    @RecentlyNonNull
    public Status a() {
        return this.f1334e;
    }

    @RecentlyNullable
    public g b() {
        return this.f1335f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.j(parcel, 1, a(), i2, false);
        c.j(parcel, 2, b(), i2, false);
        c.b(parcel, a);
    }
}
