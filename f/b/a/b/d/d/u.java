package f.b.a.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class u extends a {

    /* renamed from: e  reason: collision with root package name */
    final LocationRequest f2363e;

    /* renamed from: f  reason: collision with root package name */
    final List<d> f2364f;

    /* renamed from: g  reason: collision with root package name */
    final String f2365g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f2366h;

    /* renamed from: i  reason: collision with root package name */
    final boolean f2367i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f2368j;

    /* renamed from: k  reason: collision with root package name */
    final String f2369k;
    final boolean l;
    boolean m;
    String n;
    long o;
    static final List<d> p = Collections.emptyList();
    public static final Parcelable.Creator<u> CREATOR = new v();

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(LocationRequest locationRequest, List<d> list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j2) {
        this.f2363e = locationRequest;
        this.f2364f = list;
        this.f2365g = str;
        this.f2366h = z;
        this.f2367i = z2;
        this.f2368j = z3;
        this.f2369k = str2;
        this.l = z4;
        this.m = z5;
        this.n = str3;
        this.o = j2;
    }

    public static u b(String str, LocationRequest locationRequest) {
        return new u(locationRequest, p, null, false, false, false, null, false, false, null, Long.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            if (o.a(this.f2363e, uVar.f2363e) && o.a(this.f2364f, uVar.f2364f) && o.a(this.f2365g, uVar.f2365g) && this.f2366h == uVar.f2366h && this.f2367i == uVar.f2367i && this.f2368j == uVar.f2368j && o.a(this.f2369k, uVar.f2369k) && this.l == uVar.l && this.m == uVar.m && o.a(this.n, uVar.n)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2363e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2363e);
        if (this.f2365g != null) {
            sb.append(" tag=");
            sb.append(this.f2365g);
        }
        if (this.f2369k != null) {
            sb.append(" moduleId=");
            sb.append(this.f2369k);
        }
        if (this.n != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.n);
        }
        sb.append(" hideAppOps=");
        sb.append(this.f2366h);
        sb.append(" clients=");
        sb.append(this.f2364f);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f2367i);
        if (this.f2368j) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.l) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.m) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.j(parcel, 1, this.f2363e, i2, false);
        c.n(parcel, 5, this.f2364f, false);
        c.k(parcel, 6, this.f2365g, false);
        c.c(parcel, 7, this.f2366h);
        c.c(parcel, 8, this.f2367i);
        c.c(parcel, 9, this.f2368j);
        c.k(parcel, 10, this.f2369k, false);
        c.c(parcel, 11, this.l);
        c.c(parcel, 12, this.m);
        c.k(parcel, 13, this.n, false);
        c.i(parcel, 14, this.o);
        c.b(parcel, a);
    }
}
