package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.c;
import com.google.android.gms.common.internal.x.a;
/* loaded from: classes.dex */
public final class e1 extends a {
    public static final Parcelable.Creator<e1> CREATOR = new f1();

    /* renamed from: e  reason: collision with root package name */
    Bundle f1230e;

    /* renamed from: f  reason: collision with root package name */
    c[] f1231f;

    /* renamed from: g  reason: collision with root package name */
    int f1232g;

    /* renamed from: h  reason: collision with root package name */
    f f1233h;

    public e1() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public e1(Bundle bundle, c[] cVarArr, int i2, f fVar) {
        this.f1230e = bundle;
        this.f1231f = cVarArr;
        this.f1232g = i2;
        this.f1233h = fVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.d(parcel, 1, this.f1230e, false);
        com.google.android.gms.common.internal.x.c.m(parcel, 2, this.f1231f, i2, false);
        com.google.android.gms.common.internal.x.c.g(parcel, 3, this.f1232g);
        com.google.android.gms.common.internal.x.c.j(parcel, 4, this.f1233h, i2, false);
        com.google.android.gms.common.internal.x.c.b(parcel, a);
    }
}
