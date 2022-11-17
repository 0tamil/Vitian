package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.j;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public final class q0 extends a {
    public static final Parcelable.Creator<q0> CREATOR = new r0();

    /* renamed from: e  reason: collision with root package name */
    final int f1285e;

    /* renamed from: f  reason: collision with root package name */
    final IBinder f1286f;

    /* renamed from: g  reason: collision with root package name */
    private final com.google.android.gms.common.a f1287g;

    /* renamed from: h  reason: collision with root package name */
    private final boolean f1288h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f1289i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q0(int i2, IBinder iBinder, com.google.android.gms.common.a aVar, boolean z, boolean z2) {
        this.f1285e = i2;
        this.f1286f = iBinder;
        this.f1287g = aVar;
        this.f1288h = z;
        this.f1289i = z2;
    }

    public final com.google.android.gms.common.a b() {
        return this.f1287g;
    }

    public final j c() {
        IBinder iBinder = this.f1286f;
        if (iBinder == null) {
            return null;
        }
        return j.a.b(iBinder);
    }

    public final boolean d() {
        return this.f1288h;
    }

    public final boolean e() {
        return this.f1289i;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q0)) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f1287g.equals(q0Var.f1287g) && o.a(c(), q0Var.c());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, this.f1285e);
        c.f(parcel, 2, this.f1286f, false);
        c.j(parcel, 3, this.f1287g, i2, false);
        c.c(parcel, 4, this.f1288h);
        c.c(parcel, 5, this.f1289i);
        c.b(parcel, a);
    }
}
