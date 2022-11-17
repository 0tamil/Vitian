package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public final class Scope extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new q();

    /* renamed from: e  reason: collision with root package name */
    final int f1044e;

    /* renamed from: f  reason: collision with root package name */
    private final String f1045f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Scope(int i2, String str) {
        p.f(str, "scopeUri must not be null or empty");
        this.f1044e = i2;
        this.f1045f = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public String b() {
        return this.f1045f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f1045f.equals(((Scope) obj).f1045f);
    }

    public int hashCode() {
        return this.f1045f.hashCode();
    }

    public String toString() {
        return this.f1045f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, this.f1044e);
        c.k(parcel, 2, b(), false);
        c.b(parcel, a);
    }
}
