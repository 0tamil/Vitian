package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
@Deprecated
/* loaded from: classes.dex */
public final class w extends a {
    public static final Parcelable.Creator<w> CREATOR = new x();

    /* renamed from: e  reason: collision with root package name */
    private final String f1345e;

    /* renamed from: f  reason: collision with root package name */
    private final String f1346f;

    /* renamed from: g  reason: collision with root package name */
    private final String f1347g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public w(String str, String str2, String str3) {
        this.f1347g = str;
        this.f1345e = str2;
        this.f1346f = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.k(parcel, 1, this.f1345e, false);
        c.k(parcel, 2, this.f1346f, false);
        c.k(parcel, 5, this.f1347g, false);
        c.b(parcel, a);
    }
}
