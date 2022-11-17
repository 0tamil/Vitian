package f.b.a.b.d.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
import com.google.android.gms.location.d0;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class f0 extends a {

    /* renamed from: e  reason: collision with root package name */
    final d0 f2353e;

    /* renamed from: f  reason: collision with root package name */
    final List<d> f2354f;

    /* renamed from: g  reason: collision with root package name */
    final String f2355g;

    /* renamed from: h  reason: collision with root package name */
    static final List<d> f2351h = Collections.emptyList();

    /* renamed from: i  reason: collision with root package name */
    static final d0 f2352i = new d0();
    public static final Parcelable.Creator<f0> CREATOR = new g0();

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(d0 d0Var, List<d> list, String str) {
        this.f2353e = d0Var;
        this.f2354f = list;
        this.f2355g = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return o.a(this.f2353e, f0Var.f2353e) && o.a(this.f2354f, f0Var.f2354f) && o.a(this.f2355g, f0Var.f2355g);
    }

    public final int hashCode() {
        return this.f2353e.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f2353e);
        String valueOf2 = String.valueOf(this.f2354f);
        String str = this.f2355g;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 77 + String.valueOf(valueOf2).length() + String.valueOf(str).length());
        sb.append("DeviceOrientationRequestInternal{deviceOrientationRequest=");
        sb.append(valueOf);
        sb.append(", clients=");
        sb.append(valueOf2);
        sb.append(", tag='");
        sb.append(str);
        sb.append("'}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.j(parcel, 1, this.f2353e, i2, false);
        c.n(parcel, 2, this.f2354f, false);
        c.k(parcel, 3, this.f2355g, false);
        c.b(parcel, a);
    }
}
