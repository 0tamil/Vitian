package f.b.a.b.e.b;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.q0;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
/* loaded from: classes.dex */
public final class l extends a {
    public static final Parcelable.Creator<l> CREATOR = new m();

    /* renamed from: e  reason: collision with root package name */
    final int f2391e;

    /* renamed from: f  reason: collision with root package name */
    private final com.google.android.gms.common.a f2392f;

    /* renamed from: g  reason: collision with root package name */
    private final q0 f2393g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(int i2, com.google.android.gms.common.a aVar, q0 q0Var) {
        this.f2391e = i2;
        this.f2392f = aVar;
        this.f2393g = q0Var;
    }

    public final com.google.android.gms.common.a b() {
        return this.f2392f;
    }

    public final q0 c() {
        return this.f2393g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, this.f2391e);
        c.j(parcel, 2, this.f2392f, i2, false);
        c.j(parcel, 3, this.f2393g, i2, false);
        c.b(parcel, a);
    }
}
