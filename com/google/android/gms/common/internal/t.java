package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class t extends a {
    public static final Parcelable.Creator<t> CREATOR = new a0();

    /* renamed from: e  reason: collision with root package name */
    private final int f1298e;

    /* renamed from: f  reason: collision with root package name */
    private List<n> f1299f;

    public t(int i2, List<n> list) {
        this.f1298e = i2;
        this.f1299f = list;
    }

    public final int b() {
        return this.f1298e;
    }

    public final List<n> c() {
        return this.f1299f;
    }

    public final void d(n nVar) {
        if (this.f1299f == null) {
            this.f1299f = new ArrayList();
        }
        this.f1299f.add(nVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, this.f1298e);
        c.n(parcel, 2, this.f1299f, false);
        c.b(parcel, a);
    }
}
