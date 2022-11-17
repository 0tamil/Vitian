package f.b.a.b.d.d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
import com.google.android.gms.location.j;
import com.google.android.gms.location.k;
/* loaded from: classes.dex */
public final class h0 extends a {
    public static final Parcelable.Creator<h0> CREATOR = new i0();

    /* renamed from: e  reason: collision with root package name */
    final int f2356e;

    /* renamed from: f  reason: collision with root package name */
    final f0 f2357f;

    /* renamed from: g  reason: collision with root package name */
    final k f2358g;

    /* renamed from: h  reason: collision with root package name */
    final f f2359h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h0(int i2, f0 f0Var, IBinder iBinder, IBinder iBinder2) {
        this.f2356e = i2;
        this.f2357f = f0Var;
        f fVar = null;
        this.f2358g = iBinder == null ? null : j.b(iBinder);
        if (iBinder2 != null) {
            IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            fVar = queryLocalInterface instanceof f ? (f) queryLocalInterface : new d(iBinder2);
        }
        this.f2359h = fVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int a = c.a(parcel);
        c.g(parcel, 1, this.f2356e);
        c.j(parcel, 2, this.f2357f, i2, false);
        k kVar = this.f2358g;
        IBinder iBinder = null;
        c.f(parcel, 3, kVar == null ? null : kVar.asBinder(), false);
        f fVar = this.f2359h;
        if (fVar != null) {
            iBinder = fVar.asBinder();
        }
        c.f(parcel, 4, iBinder, false);
        c.b(parcel, a);
    }
}
