package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.x.c;
import e.a.j;
/* loaded from: classes.dex */
public final class a extends com.google.android.gms.common.internal.x.a {

    /* renamed from: e  reason: collision with root package name */
    final int f1039e;

    /* renamed from: f  reason: collision with root package name */
    private final int f1040f;

    /* renamed from: g  reason: collision with root package name */
    private final PendingIntent f1041g;

    /* renamed from: h  reason: collision with root package name */
    private final String f1042h;

    /* renamed from: i  reason: collision with root package name */
    public static final a f1038i = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new n();

    public a(int i2) {
        this(i2, null, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(int i2, int i3, PendingIntent pendingIntent, String str) {
        this.f1039e = i2;
        this.f1040f = i3;
        this.f1041g = pendingIntent;
        this.f1042h = str;
    }

    public a(int i2, PendingIntent pendingIntent) {
        this(i2, pendingIntent, null);
    }

    public a(int i2, PendingIntent pendingIntent, String str) {
        this(1, i2, pendingIntent, str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String g(int i2) {
        if (i2 == 99) {
            return "UNFINISHED";
        }
        if (i2 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i2) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i2) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case j.b3 /* 23 */:
                        return "API_DISABLED";
                    case j.c3 /* 24 */:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(i2);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public int b() {
        return this.f1040f;
    }

    public String c() {
        return this.f1042h;
    }

    public PendingIntent d() {
        return this.f1041g;
    }

    public boolean e() {
        return (this.f1040f == 0 || this.f1041g == null) ? false : true;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f1040f == aVar.f1040f && o.a(this.f1041g, aVar.f1041g) && o.a(this.f1042h, aVar.f1042h);
    }

    public boolean f() {
        return this.f1040f == 0;
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f1040f), this.f1041g, this.f1042h);
    }

    public String toString() {
        o.a c = o.c(this);
        c.a("statusCode", g(this.f1040f));
        c.a("resolution", this.f1041g);
        c.a("message", this.f1042h);
        return c.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, this.f1039e);
        c.g(parcel, 2, b());
        c.j(parcel, 3, d(), i2, false);
        c.k(parcel, 4, c(), false);
        c.b(parcel, a);
    }
}
