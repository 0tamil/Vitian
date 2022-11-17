package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public final class Status extends a implements j, ReflectedParcelable {

    /* renamed from: e  reason: collision with root package name */
    final int f1048e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1049f;

    /* renamed from: g  reason: collision with root package name */
    private final String f1050g;

    /* renamed from: h  reason: collision with root package name */
    private final PendingIntent f1051h;

    /* renamed from: i  reason: collision with root package name */
    private final com.google.android.gms.common.a f1052i;

    /* renamed from: j  reason: collision with root package name */
    public static final Status f1046j = new Status(0);

    /* renamed from: k  reason: collision with root package name */
    public static final Status f1047k = new Status(8);
    public static final Status l = new Status(15);
    public static final Status m = new Status(16);
    public static final Parcelable.Creator<Status> CREATOR = new r();

    public Status(int i2) {
        this(i2, (String) null);
    }

    Status(int i2, int i3, String str, PendingIntent pendingIntent) {
        this(i2, i3, str, pendingIntent, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Status(int i2, int i3, String str, PendingIntent pendingIntent, com.google.android.gms.common.a aVar) {
        this.f1048e = i2;
        this.f1049f = i3;
        this.f1050g = str;
        this.f1051h = pendingIntent;
        this.f1052i = aVar;
    }

    public Status(int i2, String str) {
        this(1, i2, str, null);
    }

    public Status(int i2, String str, PendingIntent pendingIntent) {
        this(1, i2, str, pendingIntent);
    }

    public Status(com.google.android.gms.common.a aVar, String str) {
        this(aVar, str, 17);
    }

    @Deprecated
    public Status(com.google.android.gms.common.a aVar, String str, int i2) {
        this(1, i2, str, aVar.d(), aVar);
    }

    @Override // com.google.android.gms.common.api.j
    public Status a() {
        return this;
    }

    public com.google.android.gms.common.a b() {
        return this.f1052i;
    }

    public int c() {
        return this.f1049f;
    }

    public String d() {
        return this.f1050g;
    }

    public boolean e() {
        return this.f1051h != null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f1048e == status.f1048e && this.f1049f == status.f1049f && o.a(this.f1050g, status.f1050g) && o.a(this.f1051h, status.f1051h) && o.a(this.f1052i, status.f1052i);
    }

    public boolean f() {
        return this.f1049f <= 0;
    }

    public final String g() {
        String str = this.f1050g;
        return str != null ? str : d.a(this.f1049f);
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f1048e), Integer.valueOf(this.f1049f), this.f1050g, this.f1051h, this.f1052i);
    }

    public String toString() {
        o.a c = o.c(this);
        c.a("statusCode", g());
        c.a("resolution", this.f1051h);
        return c.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, c());
        c.k(parcel, 2, d(), false);
        c.j(parcel, 3, this.f1051h, i2, false);
        c.j(parcel, 4, b(), i2, false);
        c.g(parcel, 1000, this.f1048e);
        c.b(parcel, a);
    }
}
